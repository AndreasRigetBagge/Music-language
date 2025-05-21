package muslan.relation.validation;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Stack;

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
		for(var e : objects)
		{
			var diagnostic = new BasicDiagnostic(Diagnostic.ERROR, e.toString(), 0, message, new Object[] { e });
			diagnostics.add(diagnostic);			
		}
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
		if(mcCount == 0) {
			return constraintViolated(r, "There must exist at least one main collection");
		} 
		else if (mcCount > 1) {
			var mcs = r.getProviders()
					   .stream()
					   .filter(c -> c instanceof MainCollection)
					   .toArray(EObject[]::new);
			return constraintsViolated(mcs, "You may have at most 1 main collection");
		}
		
		//The r.maincollection is in r.providers
		if (r.getProviders().stream()
			 .filter(c -> c.equals(r.getMaincollection())).findFirst()
			 .isEmpty() ) {
			var mc = r.getMaincollection();
			var msg = "Main collecton: \""
					  + mc.getName()
					  + "\" must be part of the providers reference";
			return constraintViolated(mc, msg);
		}
		
		//all collections must flow to (be reachable from) main collection
		var reachables = this.findAllReachableICollections(r);
		if(reachables.size() != r.getProviders().size()) {
			var unreached = r.getProviders()
							 .stream()
							 .filter(c -> !reachables.contains(c))
							 .toArray(EObject[]::new);
			var msg = "All collections must indirectly"
					  + "  or directly flow to the main collection";
			return constraintsViolated(unreached, );
		}
		
		//DO not allow cyclic relations
		if(detectCycles(r) instanceof EObject[] collectionsInCycle) {
			var msg = "Relations may not be cyclic";
			return constraintsViolated(collectionsInCycle, msg);
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
	
	private EObject[] detectCycles(RelationRoot r) {
		var edgesOf = new HashMap<ICollection, ArrayList<Link>>();
		for(var l : r.getLinks())
		{
			var current = l.getIncoming();
			edgesOf.computeIfAbsent(current, k -> new ArrayList<Link>()).add(l);
		}
		
		var recursiveStack = new HashSet<ICollection>();
		var visited = new HashSet<ICollection>();
	
		for(var v : r.getProviders())
		{
			if(!visited.contains(v) && detectCyclesUtil(v, edgesOf, recursiveStack, visited))
				return recursiveStack.toArray(EObject[]::new);
		}
	
		return null;
	}
	
	private boolean detectCyclesUtil(
			ICollection v,
			HashMap<ICollection, ArrayList<Link>> edges,
			HashSet<ICollection> callStack, 
			HashSet<ICollection> visited) {
		
		if(callStack.contains(v)) {
			return true;
		}
		
		if(visited.contains(v)) {
			return false;
		}
		
		visited.add(v);
		callStack.add(v);
		
		if(edges.containsKey(v))
		{
			for(var l : edges.get(v))
			{
				var u = l.getOutgoing();
				if(detectCyclesUtil(u, edges, callStack, visited))
					return true;
			}			
		}
		callStack.remove(v);
		return false;
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
