package muslan.query.interpreter.eclipse.launch;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.Path;
import org.eclipse.debug.ui.ILaunchShortcut;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import query.Query;
import muslan.query.interpreter.QueryInterpreter;
import muslan.query.interpreter.QueryInterpreterException;
import muslan.query.interpreter.eclipse.QueryEclipseUtil;

public class QueryLaunchShortcut implements ILaunchShortcut {

	@Override
	public void launch(ISelection selection, String mode) {
		IFile queryFile = QueryEclipseUtil.getFirstIFileFromSelectionWithExtension("query", selection);
		Query query = (Query) QueryEclipseUtil.loadModel(queryFile);

		IContainer container = queryFile.getParent();
		interpretQuery(query, container);
	}
	
	@Override
	public void launch(IEditorPart editor, String mode) {
		EObject model = getModelFromEditor(editor);
		IContainer container = null; 
	    IEditorInput input = editor.getEditorInput();

	    if (input instanceof IFileEditorInput fileInput) {
	        IFile file = fileInput.getFile();
	        container = file.getParent(); 
	    }	
		
		if (model instanceof Query query && container != null) {
			interpretQuery(query, container);
			return;
		}
		
		String title = "Error";
		String message = "The file cannot be interpreted as a query.";
		MessageDialog.openError(null, title, message);
	}
	
	protected EObject getModelFromEditor(IEditorPart editor) {
		if (editor instanceof IEditingDomainProvider) {
			IEditingDomainProvider editingDomainProvider = (IEditingDomainProvider) editor;
			EditingDomain editingDomain = editingDomainProvider.getEditingDomain();
			Resource resource = editingDomain.getResourceSet().getResources().get(0);
			EObject model = resource.getContents().get(0);
			
			return model;
		}
		return null;
	}
	
	protected void interpretQuery(Query query, IContainer container){ 
		IFile file = container.getFile(new Path("answer.queue"));

		try {
			QueryEclipseUtil.save(QueryInterpreter.interpret(query), file);
		} catch(QueryInterpreterException e) {
			String title = "Error";
			String message = e.getMessage();
			MessageDialog.openError(null, title, message);
		}
	} 
}
