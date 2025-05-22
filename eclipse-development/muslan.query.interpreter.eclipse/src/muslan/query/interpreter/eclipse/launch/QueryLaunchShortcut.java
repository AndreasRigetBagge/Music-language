package muslan.query.interpreter.eclipse.launch;

import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

import org.eclipse.core.internal.resources.File;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.debug.ui.ILaunchShortcut;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.console.MessageConsole;
import query.Query;
import queue.Queue;
import muslan.query.interpreter.QueryInterpreter;
import muslan.query.interpreter.QueryInterpreterException;
import muslan.query.interpreter.eclipse.QueryEclipseUtil;

public class QueryLaunchShortcut implements ILaunchShortcut {

	@Override
	public void launch(ISelection selection, String mode) {
		//Load model
		IFile queryFile = QueryEclipseUtil.getFirstIFileFromSelectionWithExtension("query", selection);
		Query query = (Query) QueryEclipseUtil.loadModel(queryFile);

		IContainer container = queryFile.getParent();
		interpretQuery(query, container);
	}
	
	@Override
	public void launch(IEditorPart editor, String mode) {
		EObject model = getModelFromEditor(editor);
		IContainer container = null;

	    // Try to extract the file from the editor
	    IEditorInput input = editor.getEditorInput();
	    if (input instanceof IFileEditorInput fileInput) {
	        IFile file = fileInput.getFile();
	        container = file.getParent(); // this is your containing folder
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
		//The generated Ecore editor implements this interface.
		if (editor instanceof IEditingDomainProvider) {
			IEditingDomainProvider editingDomainProvider = (IEditingDomainProvider) editor;
			EditingDomain editingDomain = editingDomainProvider.getEditingDomain();
			//This is how the generated Ecore editor accesses the resource internally.
			//Still seems brittle esp. when there is another model in the editing domain.
			Resource resource = editingDomain.getResourceSet().getResources().get(0);
			EObject model = resource.getContents().get(0);
			
			return model;
		}
		
		//TODO: Sirius Editor
		
		return null;
	}
	
	protected void interpretQuery(Query query, IContainer container){ 
		IFile file = container.getFile(new Path("answer.queue"));

		// Check if file exists; create or overwrite accordingly
			try {
			QueryEclipseUtil.save(QueryInterpreter.interpret(query), file);
		} catch(QueryInterpreterException e) {
			String title = "Error";
			String message = e.getMessage();
			MessageDialog.openError(null, title, message);
		}
	}
	
	protected String askForInterpreterInput() {
		InputDialog inputDialog = new InputDialog(null, "FSM Interpreter Input", "Please provide input for the FSM interpreter", null, null);
		
		int returnCode = inputDialog.open();
		
		if (returnCode == InputDialog.OK) {
			return inputDialog.getValue();
		}
		
		return null;
	}

	protected void interpretQuery(Query query, String interpreterInput) {
		
		try {
			//Reroute output to console of runtime instance
			/*
			MessageConsole console = QueryEclipseUtil.findOrCreateConsole("Query Interpreter");
			console.clearConsole();
			console.activate();
			OutputStream consoleOutputStream = console.newOutputStream();
			*/
			
			QueryInterpreter.interpret(query);
		} catch(QueryInterpreterException e) {
			String title = "Error";
			String message = e.getMessage();
			MessageDialog.openError(null, title, message);
		}
	}
	
}
