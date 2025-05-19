package muslan.relation.validation;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;

import relation.*;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.ui.IStartup;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.EcoreUtil;

		
public class RelationValidator extends EObjectValidator implements IStartup {
	private DiagnosticChain diagnostics;
	
	@Override
	public void earlyStartup() {
		EValidator.Registry.INSTANCE.put(RelationPackage.eINSTANCE, new RelationValidator());
	}
	
	//Utility method
	protected boolean constraintViolated(EObject object, String message) {
		var diagnostic = new BasicDiagnostic(Diagnostic.ERROR, object.toString(), 0, message, new Object[] { object });
		diagnostics.add(diagnostic);
		return false;
	}
	
	protected boolean constraintsViolated(EObject[] objects, String message) {
		var diagnostic = new BasicDiagnostic(Diagnostic.ERROR, objects.toString(), 0, message, objects);
		diagnostics.add(diagnostic);
		return false;
	}
	
	@Override
	public boolean validate(EObject eObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(eObject.eClass(), diagnostics, context);
	}

	@Override
	public boolean validate(EClass eClass, EObject eObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean modelIsValid = super.validate(eClass, eObject, diagnostics, context);
		this.diagnostics = diagnostics;
		
		return modelIsValid && switch(eObject)
		{
		case Link l -> validateLink(l);
		case ICollection c -> validateICollection(c);
		case Source s -> validateSource(s);
		case RelationRoot r -> validateRelationRoot(r);
		default -> true;
		};
	}
	
	private boolean validateRelationRoot(RelationRoot r) {
		//only a single main collection
		long mcCount = r.getProviders().stream().filter(c -> c instanceof MainCollection).count();
		if(mcCount == 0) 
		{
			return constraintViolated(r, "There must exist at least one main collection");
		} 
		else if (mcCount > 1)
		{
			var mcs = r.getProviders()
					   .stream()
					   .filter(c -> c instanceof MainCollection)
					   .toArray(EObject[]::new);
			return constraintsViolated(mcs, "You may have at most 1 main collection");
		}
		
		//The r.maincollection is in r.providers
		if (r.getProviders().stream()
			 .filter(c -> c.equals(r.getMaincollection())).findFirst()
			 .isEmpty() )
		{
			var mc = r.getMaincollection();
			return constraintViolated(mc, "Main collecton: \"" + mc.getName() + "\" must be part of the providers reference");
		}
		
		
		//all collections must flow to (be reachable from) main collection
		var reachables = this.findAllReachableICollections(r);
		if(reachables.size() != r.getProviders().size())
		{
			var unreached = r.getProviders()
							 .stream()
							 .filter(c -> !reachables.contains(c))
							 .toArray(EObject[]::new);
			return constraintsViolated(unreached, "All collections must indirectly or directly flow to the main collection");
		}
		
		return true;
	}
	
	private HashSet<ICollection> findAllReachableICollections(RelationRoot r)
	{
		var res = new HashSet<ICollection>();
		var edgesOf = new HashMap<ICollection, ArrayList<Link>>();
		for(var l : r.getLinks())
		{
			var current = l.getOutgoing();
			edgesOf.computeIfAbsent(current, k -> new ArrayList<Link>()).add(l);
		}
		
		var queue = new LinkedList<ICollection>();
	    var start = r.getMaincollection();
	    queue.add(start);
	    res.add(start);
	    
	    while (!queue.isEmpty()) {
	        var current = queue.poll();
	        
	        if(edgesOf.containsKey(current))
	        {
	        	for(var link : edgesOf.get(current))
	        	{
	        		var target = link.getIncoming();
	        		if(target != null && !res.contains(target))
	        		{
	        			res.add(target);
	        			queue.add(target);
	        		}
	        	}
	        }
	    }
		return res;
	}

	private boolean validateSource(Source s) {
		var container = s.eContainer();
		
		if(container instanceof MainCollection mc)
		{
			for(var other : mc.getSources())
				if( !s.equals(other) && s.getName().equals( ((Source)other).getName()) )
					return constraintViolated(s, "The name of \"" + s.getName() + "\" must be unique");
		}
		return true;
	}

	private boolean validateICollection(ICollection c) {
		var root = EcoreUtil.getRootContainer(c);
		
		var nameC = nameOfCollection(c);
		for(var it = root.eAllContents(); it.hasNext(); )
		{
			var obj = it.next();
			if(obj instanceof ICollection c2 && !c.equals(c2) && nameOfCollection(c2).equals(nameC)) {
				return constraintViolated(c, String.format("The nameof \"%s\" names must be unique", nameC));
			}
		}
		
		return true;
	}

	public boolean validateLink(Link link)
	{
		//Constraint - unique in/out
		if(link.getIncoming().equals(link.getOutgoing())) 
			return constraintViolated(link, "Cannot link \"" + nameOfCollection(link.getIncoming()) + "\" to itself");
		//Constraint - cannot have MainCollection as incoming
		if(link.getIncoming() instanceof MainCollection mc)
			return constraintViolated(link, String.format("\"%s\" is not a valid input collection - it is a main collection", mc.getName()));
		
		return true;
	}

	private String nameOfCollection(ICollection c)
	{
		return switch(c)
		{
		case DerivedCollection dc -> dc.getName();
		case CollectionReference ref -> ref.getPointsTo().getName();
		default -> "";
		};
	}

}
