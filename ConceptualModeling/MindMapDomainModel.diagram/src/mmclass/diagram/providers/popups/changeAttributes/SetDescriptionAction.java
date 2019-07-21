package mmclass.diagram.providers.popups.changeAttributes;

import java.util.Iterator;
import java.util.List;

import mmclass.Entity;
import mmclass.MmclassPackage;
import mmclass.Node;
import mmclass.diagram.edit.parts.AssociationEntityAssociationEntityAssociationsCompartmentEditPart;
import mmclass.diagram.edit.parts.AssociationEntityEditPart;
import mmclass.diagram.edit.parts.Entity2EditPart;
import mmclass.diagram.edit.parts.EntityEditPart;
import mmclass.diagram.part.MmclassDiagramEditor;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.emf.type.core.commands.SetValueCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PlatformUI;

import UTIL.ActiveDiagram;

public class SetDescriptionAction extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		MmclassDiagramEditor d = (MmclassDiagramEditor) PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();

		ShapeNodeEditPart selectedElement;
		Object selection = getSelectedElement();
		
		TransactionalEditingDomain editingDomain = d.getEditingDomain();	
		SetRequest setRequestX = null;
		EObject eo ;
		selectedElement = (ShapeNodeEditPart) selection;	
		
		eo = selectedElement.resolveSemanticElement();
		EAttribute ea = MmclassPackage.eINSTANCE.getNode_Description();	
		//call popup
		Node node = (Node) selectedElement.getNotationView().getElement();
		String value = node.getDescription();
		
		final InputDialog inputDialog = new InputDialog(Display.getCurrent().getActiveShell(), "Description", "Enter Description:", value, null) {
			/**
	         * Override this method to make the text field multilined
	         * and give it a scroll bar. But...
	         */
	        @Override
	        protected int getInputTextStyle() {
	          return SWT.MULTI | SWT.BORDER | SWT.V_SCROLL | SWT.WRAP;
	        }

	        /**
	         * ...it still is just one line high.
	         * This hack is not very nice, but at least it gets the job done... ;o)
	         */
	        @Override
	        protected Control createDialogArea(Composite parent) {
	          Control res = super.createDialogArea(parent);
	          ((GridData) this.getText().getLayoutData()).heightHint = 100;
	          return res;
	        }
		};
		
		if (InputDialog.OK == inputDialog.open()) { 						
			final List<EditPart> allObjects =  ActiveDiagram.getActiveEditor().getDiagramEditPart().getChildren();				
			for(EditPart ep : allObjects) {
				if (ep instanceof EntityEditPart) {
					EntityEditPart entityEditPart = (EntityEditPart) ep;
					Entity l = (Entity) entityEditPart.getNotationView().getElement();
					if (l.getNodeText().equals(node.getNodeText())) {
						//refresh it
						ActiveDiagram.setDescription((ShapeNodeEditPart) ep, inputDialog.getValue());						
					}						
				} else if (ep instanceof AssociationEntityEditPart) {						
					AssociationEntityEditPart aEEP = (AssociationEntityEditPart) ep;
					Iterator<Entity2EditPart> itE = ((AssociationEntityAssociationEntityAssociationsCompartmentEditPart) aEEP.getChildren().get(1)).getChildren().iterator();
					while (itE.hasNext()) {
						Entity2EditPart e2 = itE.next();
						Entity l = (Entity) e2.getNotationView().getElement();
						if (l.getNodeText().equals(node.getNodeText())) {
							ActiveDiagram.setDescription((ShapeNodeEditPart) e2, inputDialog.getValue());
						}
					}													
				}
//				System.out.println(ep);
			}
			
			setRequestX = new SetRequest(editingDomain, eo,ea, inputDialog.getValue());
			
			SetValueCommand setX = new SetValueCommand(setRequestX);	   
		    try {
		      setX.execute(null, null);
		    } catch (ExecutionException e) {
		      // TODO Auto-generated catch block
		      e.printStackTrace();
		    }
		}
						
		return null;
	}

	protected Object getSelectedElement() {
		Object selection;
		selection = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getSelectionService().getSelection();
		// Get first element if the selection is an IStructuredSelection
		if(selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection)selection;
			selection = structuredSelection.getFirstElement();
		}
		return selection;
	}
}