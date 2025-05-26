package muslan.musiccollection.interpreter.eclipse.launch;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.debug.ui.ILaunchShortcut;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;

import musiccollection.CollectionRoot;
import musiccollection.MusicCollection;
import queue.Queue;
import muslan.playlist.interpreter.PlaylistInterpreter;
import muslan.playlist.interpreter.PlaylistInterpreterException;

public class MusicCollectionLaunchShortcut implements ILaunchShortcut {

	@Override
	public void launch(ISelection selection, String mode) {
		IFile file = getFirstIFileFromSelectionWithExtension("musiccollection", selection);
		CollectionRoot root = (CollectionRoot) load(file);
		MusicCollection collection = null;
		String collectionname = askForInterpreterInput("Give collection name");
		for (MusicCollection c : root.getMusiccollection()) {
			if (c.getName().equals(collectionname)) {
				collection = c;
				break;
			}
		}
		if (collection == null) { 
			MessageDialog.openError(null, "Error", "No such collection");
		}

		IContainer container = file.getParent();
		execute(collection, container);
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
		
		if (model instanceof MusicCollection collection && container != null) {
			execute(collection, container);
			return;
		}
		
		String title = "Error";
		String message = "The file cannot be interpreted.";
		MessageDialog.openError(null, title, message);
	}
	
	protected void execute(MusicCollection collection, IContainer container){ 
		String playlist = askForInterpreterInput("Give playlist name");
		IFile file = container.getFile(new Path("answer.queue"));

		try {
			save(PlaylistInterpreter.interpret(collection, playlist), file);
		} catch(PlaylistInterpreterException e) {
			String title = "Error";
			String message = e.getMessage();
			MessageDialog.openError(null, title, message);
		}
	}
	
	protected String askForInterpreterInput(String message) {
		InputDialog inputDialog = new InputDialog(null, "Interpreter Input", message, null, null);
		
		int returnCode = inputDialog.open();
		
		if (returnCode == InputDialog.OK) {
			return inputDialog.getValue();
		}
		
		return null;
	}

	public static EObject load(IFile file) {
		IPath fullPath = file.getFullPath(); 
		String absolutePathString = fullPath.toOSString(); 
		URI uri = URI.createPlatformResourceURI(absolutePathString, true); 
		ResourceSet resourceSet = new ResourceSetImpl(); 
		Resource resource = resourceSet.getResource(uri, true);
		
		try {
	    	resource.load(Collections.EMPTY_MAP); 
	    	List<EObject> contents = resource.getContents(); 
	    	if (contents == null || contents.isEmpty()) {
	    		throw new UnsupportedOperationException();
	    	} 

    		return contents.get(0);

	    } catch(Exception e) {


	    	e.printStackTrace();
	    	System.err.println("Failed to load model from \"" + resource.getURI() + "\".");
	    }
		
		return null;
	} 
	
	public static void save(Queue queue, IFile file) {

		System.out.println("Working directory: " + System.getProperty("user.dir"));
		System.out.println("Saving to: " + file.getLocation());
		MessageDialog.openError(null, "no error","Saving to: " + file.getLocation());

		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("queue", new XMIResourceFactoryImpl()); 
        URI emfURI = URI.createPlatformResourceURI(file.getFullPath().toString(), true); 
		ResourceSet resSet = new ResourceSetImpl(); 
		Resource resource = resSet.createResource(emfURI); 
		resource.getContents().add(queue);

		try {
			resource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}	
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

	public static IFile getFirstIFileFromSelectionWithExtension(String requestedFileExtension, ISelection selection) {
		List<IResource> resources = extractResourcesFromSelection(selection);
		
		for (IResource resource : resources) {
			if (resource instanceof IFile) {
				IFile file = (IFile) resource; 
				String fileExtension = file.getFileExtension();
				if (fileExtension.equalsIgnoreCase(requestedFileExtension)) {
					return file;
				}
			}
		}
		
		return null;
	}
	
	private static List<IResource> extractResourcesFromSelection(ISelection selection) {
		List<IResource> selectedResources = new ArrayList<IResource>();
		
		if (selection instanceof StructuredSelection) {
			StructuredSelection structuredSelection = (StructuredSelection) selection; 
			List<?> selectedObjects = structuredSelection.toList();

			for (Object selectedObject : selectedObjects) {
				if (selectedObject instanceof IResource) {
					IResource resource = (IResource) selectedObject;
					selectedResources.add(resource);
				} else if (selectedObject instanceof IAdaptable) {
					IAdaptable adaptable = (IAdaptable) selectedObject;
					Object adapter = adaptable.getAdapter(IResource.class);

					if (adapter != null) {
						IResource resource = (IResource) adapter;
						selectedResources.add(resource);
					}
				}
			}
		}
		
		return selectedResources;
	}
}
