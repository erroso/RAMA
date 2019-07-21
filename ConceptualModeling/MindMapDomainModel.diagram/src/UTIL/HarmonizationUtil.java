package UTIL;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.SetValueCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;
import org.eclipse.ui.PlatformUI;

import mmclass.Attribute;
import mmclass.Entity;
import mmclass.MmclassPackage;
import mmclass.diagram.edit.parts.AssociationEntityAssociationEntityAssociationsCompartmentEditPart;
import mmclass.diagram.edit.parts.AssociationEntityEditPart;
import mmclass.diagram.edit.parts.AttributeEditPart;
import mmclass.diagram.edit.parts.EdgeEditPart;
import mmclass.diagram.edit.parts.Entity2EditPart;
import mmclass.diagram.edit.parts.EntityEditPart;
import mmclass.diagram.part.MmclassDiagramEditor;

public class HarmonizationUtil {
	
	private static HashMap<ShapeNodeEditPart,Boolean> nodesParsed = new HashMap<ShapeNodeEditPart,Boolean>();
	
	public static boolean belongsToGroup(EntityEditPart edp, String newName) {		
		final List<EditPart> allObjects =  ActiveDiagram.getActiveEditor().getDiagramEditPart().getChildren();
		for(EditPart ep : allObjects) {
			if (ep instanceof EntityEditPart) {
				EntityEditPart entityEditPart = (EntityEditPart) ep;
				Entity l = (Entity) entityEditPart.getNotationView().getElement();
				if (!entityEditPart.equals(edp) && l.getNodeText().equals(newName)) {
					return true; //pertence a um grupo										
				}
			}
		}
		return false;
	}
	
	public static void addToGroup(EntityEditPart newElement, String groupName) {
		final List<EditPart> allObjects =  ActiveDiagram.getActiveEditor().getDiagramEditPart().getChildren();
		for(EditPart ep : allObjects) {
			if (ep instanceof EntityEditPart) {
				EntityEditPart entityEditPart = (EntityEditPart) ep;
				Entity l = (Entity) entityEditPart.getNotationView().getElement();
				if (l.getNodeText().equals(groupName) && entityEditPart.getSourceConnections().size() > 0) {
					//refresh it					
					deletePedingElements(newElement);
					copyFullEntityValues(entityEditPart,newElement);					
					break;
				}						
			}
		}
		
	}
	
	private static void deletePedingElements(EntityEditPart elementToInsertInGroup) { //n‹o ta completamente correcto
		Iterator<EdgeEditPart> it_edp = elementToInsertInGroup.getSourceConnections().iterator();
		while(it_edp.hasNext()) {
			EdgeEditPart edp = it_edp.next(); //fazer para o entity; meter um prompt
			MmclassDiagramEditor d = (MmclassDiagramEditor) PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
			TransactionalEditingDomain editingDomain = d.getEditingDomain();
			try {					
				DestroyElementRequest r = new DestroyElementRequest(edp.resolveSemanticElement(), false);
				CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(editingDomain, null);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(editingDomain, edp.getPrimaryView()));
				cmd.add(new DeleteCommand(editingDomain, edp.getNotationView()));
				cmd.execute(null, null);					
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
			if (edp.getTarget() instanceof AttributeEditPart) {
				AttributeEditPart tedp = (AttributeEditPart) edp.getTarget();			
				deleteEditPart(tedp);				
			} else if (edp.getTarget() instanceof EntityEditPart) {
				EntityEditPart ed = (EntityEditPart) edp.getTarget();			
				deleteEditPart(ed);
			}
			
		}
	}
	
	private static void deleteEditPart(ShapeNodeEditPart ed) {
		MmclassDiagramEditor d = (MmclassDiagramEditor) PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
		TransactionalEditingDomain editingDomain = d.getEditingDomain();
		try {					
			DestroyElementRequest r = new DestroyElementRequest(ed.resolveSemanticElement(), false);
			CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(editingDomain, null);
			cmd.add(new DestroyElementCommand(r));
			cmd.add(new DeleteCommand(editingDomain, ed.getPrimaryView()));
			cmd.add(new DeleteCommand(editingDomain, ed.getNotationView()));
			cmd.execute(null, null);					
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}			
	}
	
	public static void harminizeNameGroup(EntityEditPart newElement, String newName, String oldName) {
		if (ActiveDiagram.getActiveEditor() == null) return;
		
		final List<EditPart> allObjects =  ActiveDiagram.getActiveEditor().getDiagramEditPart().getChildren();
		boolean belongsToGroup = belongsToGroup(newElement,newName);
		boolean toRemove = false;			
		System.out.println("NEW ELEMENT("+newName+"): " + newElement + "\n");
		System.out.println("\t: Group: " + belongsToGroup);
		System.out.println("\t: " + newElement.getSourceConnections().size() + "\n");
		if (nodesParsed.containsKey((newElement))) { System.out.println("\t: RETURNED " + nodesParsed.size()  +"\n"); nodesParsed.remove(newElement); return; }
		for(EditPart ep : allObjects) {
			if (ep instanceof EntityEditPart) {
				EntityEditPart entityEditPart = (EntityEditPart) ep;
				Entity l = (Entity) entityEditPart.getNotationView().getElement();
				if (belongsToGroup) { 
					toRemove = true;
//					setNodeText((ShapeNodeEditPart) entityEditPart, newName);
//					nodesParsed.put(newElement, true);
					if (l.getNodeText() != null && l.getNodeText().equals(newName)) { //ent‹o Ž porque o novo nome Ž de um grupo existente
						//find master and get his details
						System.out.println("Comparing: " +  l.getNodeText() + " with " + newName);
						System.out.println("Equal? " + entityEditPart.equals(newElement));
						System.out.println("SourceConnections? " + entityEditPart.getSourceConnections().size());
						if (entityEditPart.getSourceConnections().size() > 0 && !entityEditPart.equals(newElement)) { //encontrei o mestre e n‹o Ž igual a mim						
							System.out.println("\t IN -> To Remove strings attached"); 
							copyFullEntityValues(entityEditPart,newElement); //vou remover os meus edges
							break;												
						}
						copyFullEntityValues(entityEditPart,newElement); //copiar elementos												
					}
				} else if (l.getNodeText() != null && l.getNodeText().equals(oldName)) { //actualizar n—s do meu antigo grupo para o novo nome.
					System.out.println("\t Setting nodeText");					
					setNodeText((ShapeNodeEditPart) entityEditPart, newName);
					nodesParsed.put(entityEditPart, true);
				}
				System.out.println("");
			} else if (ep instanceof AssociationEntityEditPart) {						
				AssociationEntityEditPart aEEP = (AssociationEntityEditPart) ep;
				Iterator<Entity2EditPart> itE = ((AssociationEntityAssociationEntityAssociationsCompartmentEditPart) aEEP.getChildren().get(1)).getChildren().iterator();
				while (itE.hasNext()) {
					Entity2EditPart e2 = itE.next();
					Entity l = (Entity) e2.getNotationView().getElement();
					if (l.getNodeText() != null && l.getNodeText().equals(oldName)) {						
						setNodeText((ShapeNodeEditPart) e2, newName);
						nodesParsed.put(e2, true);
					}
				}													
			}			
		}
		if (toRemove) {
			System.out.println("REMOVING STRINGS ATTACHED\n");
			deletePedingElements(newElement); 
		}
	}
	
	private static void copyFullEntityValues(EntityEditPart from, EntityEditPart to) {
		Entity refEntity = (Entity) from.resolveSemanticElement();
		setNodeText(to,refEntity.getNodeText());
		setCustomIcon(to,refEntity.getCustomIcon());
		setDescription(to,refEntity.getDescription());
		setOCL(to,refEntity.getOclRules());
		setAttributes(to,refEntity.getAttributes());
		setEntities(to,refEntity.getEntities());
		
	}
	
	public static void setNodeText(ShapeEditPart Node, String nodeText) {
		MmclassDiagramEditor d = (MmclassDiagramEditor) PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();		
		TransactionalEditingDomain editingDomain = d.getEditingDomain();		
		EObject eo = Node.resolveSemanticElement();
		EAttribute ea = MmclassPackage.eINSTANCE.getNode_NodeText();
		SetRequest setRequestX = new SetRequest(editingDomain, eo, ea,nodeText);
		SetValueCommand setX = new SetValueCommand(setRequestX);		
		try {
			setX.execute(null, null);
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}			
	}

	public static void setEntities(ShapeEditPart Node, EList<Entity> entities) {
		MmclassDiagramEditor d = (MmclassDiagramEditor) PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
		TransactionalEditingDomain editingDomain = d.getEditingDomain();
		EObject eo = Node.resolveSemanticElement();		
		EReference ea = MmclassPackage.eINSTANCE.getEntity_Entities();
		SetRequest setRequestX = new SetRequest(editingDomain, eo, ea,entities);
		SetValueCommand setX = new SetValueCommand(setRequestX);
		try {
			setX.execute(null, null);
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	
	public static void setAttributes(ShapeEditPart Node, EList<Attribute> atttributes) {
		MmclassDiagramEditor d = (MmclassDiagramEditor) PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
		TransactionalEditingDomain editingDomain = d.getEditingDomain();
		EObject eo = Node.resolveSemanticElement();		
		EReference ea = MmclassPackage.eINSTANCE.getEntity_Attributes();
		SetRequest setRequestX = new SetRequest(editingDomain, eo, ea,atttributes);
		SetValueCommand setX = new SetValueCommand(setRequestX);
		try {
			setX.execute(null, null);
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	
	public static void setDescription(ShapeEditPart Node, String description) {
		MmclassDiagramEditor d = (MmclassDiagramEditor) PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
		TransactionalEditingDomain editingDomain = d.getEditingDomain();
		EObject eo = Node.resolveSemanticElement();		
		EAttribute ea = MmclassPackage.eINSTANCE.getNode_Description();
		SetRequest setRequestX = new SetRequest(editingDomain, eo, ea,description);
		SetValueCommand setX = new SetValueCommand(setRequestX);
		try {
			setX.execute(null, null);
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	
	protected static void setCustomIcon(EntityEditPart Node, String description) {
		MmclassDiagramEditor d = (MmclassDiagramEditor) PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
		TransactionalEditingDomain editingDomain = d.getEditingDomain();
		EObject eo = Node.resolveSemanticElement();		
		EAttribute ea = MmclassPackage.eINSTANCE.getNode_CustomIcon();
		SetRequest setRequestX = new SetRequest(editingDomain, eo, ea,description);
		SetValueCommand setX = new SetValueCommand(setRequestX);
		try {
			setX.execute(null, null);
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
//	
	public static void setOCL(ShapeEditPart Node, String ocl) {
		MmclassDiagramEditor d = (MmclassDiagramEditor) PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
		TransactionalEditingDomain editingDomain = d.getEditingDomain();
		EObject eo = Node.resolveSemanticElement();
		EAttribute ea = MmclassPackage.eINSTANCE.getEntity_OclRules();
		SetRequest setRequestX = new SetRequest(editingDomain, eo, ea,ocl);		
		SetValueCommand setX = new SetValueCommand(setRequestX);
		try {
			setX.execute(null, null);
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
}
