package mmclass.diagram.providers.popups.customIcon;

import java.io.File;
import java.util.List;


import mmclass.Entity;
import mmclass.MmclassPackage;
import mmclass.Node;
import mmclass.diagram.edit.parts.AssociationEntityEditPart;
import mmclass.diagram.edit.parts.EntityEditPart;
import mmclass.diagram.edit.parts.EntityNodeTextEditPart;
import mmclass.diagram.edit.parts.RootNodeEditPart;
import mmclass.provider.MmclassEditPlugin;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.CompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.gmf.runtime.emf.type.core.commands.SetValueCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.handlers.HandlerUtil;

import UTIL.ActiveDiagram;

public class removeCustomIcon extends AbstractHandler {

	public final static String TARGET_PATH = "/full/obj16";
	private ShapeNodeEditPart selectedElement;
	private CompartmentEditPart selectedElementText;

	/**
	 * @generated NOT
	 */
	public Object execute(ExecutionEvent event) throws ExecutionException {		
		Object selection = ActiveDiagram.getSelectedElement();
		IEditorPart diagramEditor = HandlerUtil.getActiveEditorChecked(event);
		Shell shell = diagramEditor.getEditorSite().getShell();
		assert diagramEditor instanceof DiagramEditor;
		TransactionalEditingDomain editingDomain = ((DiagramEditor) diagramEditor).getEditingDomain();
		
		// Treat non-null selected object (try to adapt and return EObject)
		if (!(selection instanceof EntityEditPart) && !(selection instanceof AssociationEntityEditPart) && !(selection instanceof RootNodeEditPart)) {
			return null;
		}
		
		selectedElement = (ShapeNodeEditPart) selection;
		selectedElementText = (CompartmentEditPart) selectedElement.getPrimaryChildEditPart();
		Node node = (Node) selectedElement.getNotationView().getElement();
		if (node.getCustomIcon().isEmpty()) {
			return null;
		}
		System.out.println(MmclassEditPlugin.INSTANCE.getBaseURL().getPath() + TARGET_PATH + "/"+ node.getCustomIcon() + ".gif");
		File iconToDelete = new File(MmclassEditPlugin.INSTANCE.getBaseURL().getPath() + TARGET_PATH + "/"+ node.getCustomIcon() + ".gif");
		System.out.println(iconToDelete.delete());				
		
		EObject eo;
		
		eo = selectedElement.resolveSemanticElement();
		EAttribute ea = MmclassPackage.eINSTANCE.getNode_CustomIcon();					
		SetRequest setRequestX = new SetRequest(editingDomain, eo,ea, "");
		SetValueCommand setX = new SetValueCommand(setRequestX);  
	    
		try {
	      setX.execute(null, null);
	    } catch (ExecutionException e) {
	      // TODO Auto-generated catch block
	      e.printStackTrace();
	    }
		selectedElementText.refresh();	
		
		//found other leafs and refresh it
//		final List<EditPart> allObjects =  ActiveDiagram.getActiveEditor().getDiagramEditPart().getChildren();				
//		for(EditPart ep : allObjects) {
//			if (ep instanceof AEditPart) {
//				LeafEditPart leafEditPart = (LeafEditPart) ep;
//				Leaf l = (Leaf) leafEditPart.getNotationView().getElement();
//				if (l.getNodeText().equals(node.getNodeText())) {
//					//refresh it
//					LeafNodeTextEditPart lntep = (LeafNodeTextEditPart) leafEditPart.getPrimaryChildEditPart();
//					lntep.refresh();
//					//and break the cycle
//					//break;
//				}
//			}
//		}
		return null;
	}
}