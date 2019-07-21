/*
 * 
 */
package mmclass.diagram.part;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLDecoder;
import java.nio.channels.FileChannel;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import mmclass.AssociationEntity;
import mmclass.Entity;
import mmclass.MmclassPackage;
import mmclass.Node;
import mmclass.diagram.edit.parts.AssociationEntityAssociationEntityAssociationsCompartmentEditPart;
import mmclass.diagram.edit.parts.AssociationEntityEditPart;
import mmclass.diagram.edit.parts.Entity2EditPart;
import mmclass.diagram.edit.parts.EntityEditPart;
import mmclass.diagram.edit.parts.EntityNodeTextEditPart;
import mmclass.diagram.edit.parts.RootNodeEditPart;
import mmclass.provider.MmclassEditPlugin;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.xml.type.internal.DataValue.URI;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.CompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.gmf.runtime.emf.type.core.commands.SetValueCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;

import UTIL.ActiveDiagram;

/**
 * @generated
 */
public class LoadResourceAction extends AbstractHandler {

	public final static String TARGET_PATH = "/Users/antoniosilva/Work/MindMaps/MindMapDomainModels/MindMapDomainModel.edit/icons/full";
	private ShapeNodeEditPart selectedElement;

	/**
	 * @generated NOT
	 */
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IEditorPart diagramEditor = HandlerUtil.getActiveEditorChecked(event);
		Shell shell = diagramEditor.getEditorSite().getShell();
		assert diagramEditor instanceof DiagramEditor;
		TransactionalEditingDomain editingDomain = ((DiagramEditor) diagramEditor).getEditingDomain();
		org.eclipse.emf.edit.ui.action.LoadResourceAction.LoadResourceDialog loadResourceDialog = new org.eclipse.emf.edit.ui.action.LoadResourceAction.LoadResourceDialog(
				shell, editingDomain);

		Object selection = getSelectedElement();

		// Treat non-null selected object (try to adapt and return EObject)
		if (!(selection instanceof EntityEditPart)
				&& !(selection instanceof AssociationEntityEditPart)
				&& !(selection instanceof RootNodeEditPart)) {
			return null;
		}
		selectedElement = (ShapeNodeEditPart) selection;		
		Node node = (Node) selectedElement.getNotationView().getElement();	
		int code = loadResourceDialog.open();
		if (code == loadResourceDialog.OK) {
			String path = "";
			String nameOfIcon = (new Date()).hashCode() + ""; 	// Random Name para o icon
			try {
				path = URLDecoder.decode(loadResourceDialog.getURIText(),"UTF-8");
			} catch (UnsupportedEncodingException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			//			System.out.println("ok: " + path + " ---> " + TARGET_PATH);
			try {
				//Need to delete the old one always!
				copyFileUsingChannel(new File(loadResourceDialog.getURIText()
						.substring(5)), new File(TARGET_PATH + "/obj16" + "/"
						+ nameOfIcon + ".gif"));
				setCustomIcon(editingDomain, selectedElement, nameOfIcon);
				final List<EditPart> allObjects =  ActiveDiagram.getActiveEditor().getDiagramEditPart().getChildren();				
				for(EditPart ep : allObjects) {
					if (ep instanceof EntityEditPart) {
						EntityEditPart entityEditPart = (EntityEditPart) ep;
						Entity l = (Entity) entityEditPart.getNotationView().getElement();
						if (l.getNodeText().equals(node.getNodeText())) {
							//refresh it
							setCustomIcon(editingDomain, (ShapeNodeEditPart) ep, nameOfIcon);						
						}						
					} else if (ep instanceof AssociationEntityEditPart) {						
						AssociationEntityEditPart aEEP = (AssociationEntityEditPart) ep;
						Iterator<Entity2EditPart> itE = ((AssociationEntityAssociationEntityAssociationsCompartmentEditPart) aEEP.getChildren().get(1)).getChildren().iterator();
						while (itE.hasNext()) {
							Entity2EditPart e2 = itE.next();
							Entity l = (Entity) e2.getNotationView().getElement();
							if (l.getNodeText().equals(node.getNodeText())) {
								setCustomIcon(editingDomain, (ShapeNodeEditPart) e2, nameOfIcon);
							}
						}													
					}
//					System.out.println(ep);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
			}
		}
		return null;
	}
	
	protected void setCustomIcon(TransactionalEditingDomain editingDomain, ShapeNodeEditPart Node, String nameOfIcon) {
		EObject eo = Node.resolveSemanticElement();
		CompartmentEditPart rntep = (CompartmentEditPart) Node.getPrimaryChildEditPart();
		EAttribute ea = MmclassPackage.eINSTANCE.getNode_CustomIcon();
		SetRequest setRequestX = new SetRequest(editingDomain, eo, ea,nameOfIcon);
		SetValueCommand setX = new SetValueCommand(setRequestX);
		try {
			setX.execute(null, null);
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		rntep.refresh();
	}
	
	protected Object getSelectedElement() {
		Object selection;
		selection = PlatformUI.getWorkbench().getActiveWorkbenchWindow()
				.getSelectionService().getSelection();
		// Get first element if the selection is an IStructuredSelection
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			selection = structuredSelection.getFirstElement();
		}
		return selection;
	}

	/**
	 * @generated NOT
	 */
	private static void copyFileUsingChannel(File source, File dest)
			throws IOException {
		FileChannel sourceChannel = null;
		FileChannel destChannel = null;
		try {
			sourceChannel = new FileInputStream(source).getChannel();
			destChannel = new FileOutputStream(dest).getChannel();
			destChannel.transferFrom(sourceChannel, 0, sourceChannel.size());
		} finally {
			sourceChannel.close();
			destChannel.close();
		}
	}
}
