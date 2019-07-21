package UTIL;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import mmclass.Attribute;
import mmclass.Entity;
import mmclass.MmclassPackage;
import mmclass.Node;
import mmclass.diagram.edit.parts.AssociationEntityAssociationEntityAssociationsCompartmentEditPart;
import mmclass.diagram.edit.parts.AssociationEntityEditPart;
import mmclass.diagram.edit.parts.AttributeEditPart;
import mmclass.diagram.edit.parts.EdgeEditPart;
import mmclass.diagram.edit.parts.Entity2EditPart;
import mmclass.diagram.edit.parts.EntityEditPart;
import mmclass.diagram.edit.parts.RootNodeEditPart;
import mmclass.diagram.part.MmclassDiagramEditor;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EAttributeImpl;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.transaction.RollbackException;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.impl.TransactionImpl;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.requests.EditCommandRequestWrapper;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.SetValueCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;

public final class ActiveDiagram {
	
	private final static int DEFAULT_NODE_POSITION_X = 500;
	private final static int DEFAULT_NODE_POSITION_Y = 400;
	
	public final static int INITIAL_CANVAS_SIZE_X = 1228;
	public final static int INITIAL_CANVAS_SIZE_Y = 605;
	
	private static final Map<String, ArrayList<EntityEditPart>> diagramSiblings = new HashMap<String,ArrayList<EntityEditPart>>();
	public static final Map<EntityEditPart, EntityEditPart> allSiblings = new HashMap<EntityEditPart,EntityEditPart>();
	private static final Map<String, EntityEditPart> masterSibling = new HashMap<String,EntityEditPart>();
	
	private static String oldGroupName = "";
	private static String newGroupName = "";
	private static EntityEditPart newValues = null;
	private static Boolean newGroup = false;
	
	public static RootNodeEditPart getCenterNode() {
		MmclassDiagramEditor d = (MmclassDiagramEditor) PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
		
		RootNodeEditPart c = (RootNodeEditPart) d.getDiagramEditPart().getChildren().get(0);		
//		Center ccc = (Center) c.resolveSemanticElement();// getModel();		
		return c;
	}
	
	public static Point getCenterNodePosition() {
		MmclassDiagramEditor d = getActiveEditor();

		if (d == null) {
			return new Point(DEFAULT_NODE_POSITION_X,DEFAULT_NODE_POSITION_Y);
		} else {
			return getCenterPosition();
		}
	}
	
	private static Point getCenterPosition() {
		MmclassDiagramEditor d = getActiveEditor();
		//PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor().
		//LayoutService.getInstance().
		//MindMapModelEditPart mm = (MindMapModelEditPart) PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
		//System.out.println("CRL: " + mm.getFigure().getBounds());
		//getGraphicalViewer().
		//System.out.println("D_H: " + PlatformUI.getWorkbench().getDisplay().getBounds().height);
		//System.out.println("D_W: " + PlatformUI.getWorkbench().getDisplay().getBounds().width);
		//System.out.println();
		RootNodeEditPart c = (RootNodeEditPart) d.getDiagramEditPart().getChildren().get(0);
		return c.getLocation();
	}
	
	public static MmclassDiagramEditor getActiveEditor() {
		MmclassDiagramEditor d = (MmclassDiagramEditor) PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
		return d;
	}
	
	public static Object getSelectedElement() {
		Object selection;
		selection = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getSelectionService().getSelection();
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
	@SuppressWarnings("unused")
	private static void copyFileUsingChannel(File source, File dest) throws IOException {
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
	
	public static String getProjectRootPath() {		  		
		return getRunningProjectRootPath();
	}
	
	public static String getRunningProjectRootPath() {
		System.out.println(org.eclipse.core.resources.ResourcesPlugin.getWorkspace().getRoot().getProject().getLocation().toString());
		return org.eclipse.core.resources.ResourcesPlugin.getWorkspace().getRoot().getProject("Teste").getLocation().toString();		
	}
	
	public static String getCurrenProject() {		
//	    IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
//	    if (window != null)
//	    {
//	        IStructuredSelection selection = (IStructuredSelection) window.getSelectionService().getSelection();
//	        Object firstElement = selection.getFirstElement();
//	        if (firstElement instanceof IAdaptable)
//	        {
//	        	IAdaptable iA = ((IAdaptable)firstElement);		
//	            IProject project = (IProject) iA.getAdapter(IProject.class);
//	            IPath path = project.getFullPath();
//	            System.out.println(path);
//	        }
//	    }
		IEditorPart  editorPart = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
		String activeProjectName = "";

		if(editorPart  != null) {
			IFileEditorInput input = (FileEditorInput) editorPart.getEditorInput();
			IFile file = input.getFile();
			IProject activeProject = file.getProject();
			activeProjectName = activeProject.getName();
		}
	    return activeProjectName;
	}
	
	public static HashMap<String,ArrayList<EntityEditPart>> getDiagramGroups() {
		return (HashMap<String, ArrayList<EntityEditPart>>) diagramSiblings;
	}	
	
	public static void addToGroup(String groupName, String oldGroupName, EntityEditPart brother) {
		if (groupName == null) {
			return;
		}
		ArrayList<EntityEditPart> brothers = diagramSiblings.get(groupName);
		if (brothers == null) {
			brothers = new ArrayList<EntityEditPart>();
			newGroup = true;
		}			
		removeFromGroup(oldGroupName, brother);		
		
		if (!brothers.contains(brother)) {
			brothers.add(brother);
		}	
		allSiblings.put(brother, brother);
		diagramSiblings.put(groupName, brothers);
	}
	
	public static void removeFromGroup(String groupName, EntityEditPart brother) {
		ArrayList<EntityEditPart> brothers = diagramSiblings.get(groupName);
		allSiblings.remove(brother);
		if (brothers == null) {
			return;
		}
		if (brothers.contains(brother)) {
			brothers.remove(brother);
		}
		if (brothers.isEmpty()) {
			diagramSiblings.remove(groupName);
		}		
//		diagramSiblings.put(groupName, brothers);
	}
	
	public static ArrayList<EntityEditPart> getGroup(String biggerBrother) {
		ArrayList<EntityEditPart> brothers = diagramSiblings.get(biggerBrother);
		if (brothers == null) {
			brothers = new ArrayList<EntityEditPart>();
		}		
		return brothers;
	}
	public static void harminizeSiblings(EntityEditPart newGuy, Boolean attributeChange) {
		boolean newEntry = false;
		EntityEditPart newValues = newGuy; //allSiblings.get(newGuy);
		ArrayList<EntityEditPart> brothers = null;
		String oldGroupName = getOldGroupName();
		if (newGroup) { //todos os novos elementos ser‹o mudados
			brothers = diagramSiblings.get(oldGroupName);
		} else if (attributeChange) { //todos os novos elementos ser‹o mudados, mas ficando no mesmo grupo
			oldGroupName = ((Entity) newValues.resolveSemanticElement()).getNodeText();			
			brothers = diagramSiblings.get(oldGroupName);			
		} else { //apenas o elemento que vai ser inserido num grupo existente Ž alterado
			brothers = diagramSiblings.get(newGroupName);			
			newEntry = true;
//			deletePedingElements(newValues);			
		}		 
		String toFind = oldGroupName;
		if (newEntry) {
			toFind = ((((Entity)newGuy.resolveSemanticElement()).getNodeText()));
		}
		final List<EditPart> allObjects =  ActiveDiagram.getActiveEditor().getDiagramEditPart().getChildren();				
		for(EditPart ep : allObjects) {
			if (ep instanceof EntityEditPart) {
				EntityEditPart entityEditPart = (EntityEditPart) ep;
				Entity l = (Entity) entityEditPart.getNotationView().getElement();				
				if (l.getNodeText().equals(toFind)) {
					if (newEntry) {
						copyFullEntityValues(entityEditPart, newValues);
						break;
					} else {
						copyFullEntityValues(newValues, entityEditPart);
					}
				}						
			}
//			System.out.println(ep);
		}
	}
//	public static void harminizeSiblings(EntityEditPart newGuy, Boolean attributeChange) {
//		String oldGroupName = getOldGroupName();
//		String newGroupName = getNewGroupName();
//		EntityEditPart newValues = newGuy; //allSiblings.get(newGuy);
//		boolean newEntry = false;
//		if (oldGroupName == null) { //n‹o tava em nenhum grupo antes 
//			oldGroupName = newGroupName;
//			newEntry = true;
//		}
//		ArrayList<EntityEditPart> brothers = null;
//		if (newGroup) { //todos os novos elementos ser‹o mudados
//			brothers = diagramSiblings.get(oldGroupName);
//		} else if (attributeChange) { //todos os novos elementos ser‹o mudados, mas ficando no mesmo grupo
//			oldGroupName = ((Entity) newValues.resolveSemanticElement()).getNodeText();			
//			brothers = diagramSiblings.get(oldGroupName);			
//		} else { //apenas o elemento que vai ser inserido num grupo existente Ž alterado
//			brothers = diagramSiblings.get(newGroupName);
//			newEntry = true;
//			deletePedingElements(newValues);			
//		}		 
//		if (brothers != null && !brothers.isEmpty()) {						
//			Iterator<EntityEditPart> itE = brothers.iterator();			
//			while(itE.hasNext()) {
//				EntityEditPart e = itE.next();
//				if (e.resolveSemanticElement() == null) continue;
//				if (newEntry) {
//					copyFullEntityValues(e, newValues);
//					break;
//				} else {
//					copyFullEntityValues(newValues, e);
//				}
//			}
//		}	
//		newGroup = false;
//	}
	
	private static void deletePedingElements(EntityEditPart elementToInsertInGroup) {
		Iterator<EdgeEditPart> it_edp = elementToInsertInGroup.getSourceConnections().iterator();
		while(it_edp.hasNext()) {
			EdgeEditPart edp = it_edp.next(); //fazer para o entity; meter um prompt																				
			AttributeEditPart tedp = (AttributeEditPart) edp.getTarget();
			MmclassDiagramEditor d = (MmclassDiagramEditor) PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
			TransactionalEditingDomain editingDomain = d.getEditingDomain();
			try {					
				DestroyElementRequest r = new DestroyElementRequest(tedp.resolveSemanticElement(), false);
				CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(editingDomain, null);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(editingDomain, tedp.getPrimaryView()));
				cmd.execute(null, null);					
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
							
		}
	}
	
	public static void setOldGroupName(String name) {
		oldGroupName = name;
	}

	public static void setNewGroupName(String name) {
		newGroupName = name;
	}

	public static void setNewValues(EntityEditPart e) {
		newValues = e;
	}

	private static EntityEditPart getNewValues() {
		// TODO Auto-generated method stub
		return newValues;
	}

	private static String getNewGroupName() {
		// TODO Auto-generated method stub
		return newGroupName;
	}

	private static String getOldGroupName() {
		// TODO Auto-generated method stub
		return oldGroupName;
	}
	
	private static void copyFullEntityValues(EntityEditPart from, EntityEditPart to) {
		setNodeText(to,((Entity) from.resolveSemanticElement()).getNodeText());
//		setCustomIcon(to,((Entity) from.resolveSemanticElement()).getCustomIcon());
//		setDescription(to,((Entity) from.resolveSemanticElement()).getDescription());
//		setOCL(to,((Entity) from.resolveSemanticElement()).getOclRules());
//		setAttributes(to, ((Entity) from.resolveSemanticElement()).getAttributes());
//		setEntities(to, ((Entity) from.resolveSemanticElement()).getEntities());
		
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
	
	public static void setNodeText(EntityEditPart Node, String ocl) {
		MmclassDiagramEditor d = (MmclassDiagramEditor) PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();		
		TransactionalEditingDomain editingDomain = d.getEditingDomain();		
		EObject eo = Node.resolveSemanticElement();
		EAttribute ea = MmclassPackage.eINSTANCE.getNode_NodeText();
		SetRequest setRequestX = new SetRequest(editingDomain, eo, ea,ocl);
		SetValueCommand setX = new SetValueCommand(setRequestX);		
		try {
			setX.execute(null, null);
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}			
	}
	
	public static void printGroups() {
		Iterator<Entry<String, ArrayList<EntityEditPart>>> it = ActiveDiagram.getDiagramGroups().entrySet().iterator();
		while(it.hasNext()) {
			Entry<String,ArrayList<EntityEditPart>> entry = it.next();
			Iterator<EntityEditPart> itGroup = entry.getValue().iterator();								
			System.out.println("\t------------------- BEGIN " + entry.getKey());
			while (itGroup.hasNext()) {
				EntityEditPart e = itGroup.next();
				System.out.println("\t" + (Entity) e.resolveSemanticElement());
			}								
			System.out.println("\t-------------------\n");
		}
		System.out.println("\t!!!!-------------------!!!!\n");
		Iterator<Entry<EntityEditPart, EntityEditPart>> itA = ActiveDiagram.allSiblings.entrySet().iterator();
		while(itA.hasNext()) {
			Entry<EntityEditPart,EntityEditPart> entry = itA.next();																													
			EntityEditPart e = entry.getValue();
			System.out.println("\t" + (Entity) e.resolveSemanticElement());																					
		}
		System.out.println("\t!!!!-------------------!!!!\n");	
	}
	
	public static boolean checkIfEntityHasKids(Node node) {
		boolean canExist = true;
		int founds = 1;
		Entity en = null;
		if (node instanceof Entity) {
			en = (Entity) node;
		} else {
			return canExist;
		}		
		final List<EditPart> allObjects =  ActiveDiagram.getActiveEditor().getDiagramEditPart().getChildren();				
		for(EditPart ep : allObjects) {
			if (ep instanceof EntityEditPart) {
				EntityEditPart entityEditPart = (EntityEditPart) ep;
				Entity l = (Entity) entityEditPart.getNotationView().getElement();
				if (l.getNodeText().equals(en.getNodeText()) && !en.equals(l)) {
					//refresh it
					if (entityEditPart.getSourceConnections().size() > 0)
						founds++;
				}			
				if (founds > 1) {
					canExist = false;
					break;
				}
			} 													
		}
		return canExist;
	}

	public static void spreadRefsThroughtBrothers(EntityEditPart edp) {		
		Entity node = (Entity) edp.resolveSemanticElement();
		final List<EditPart> allObjects =  ActiveDiagram.getActiveEditor().getDiagramEditPart().getChildren();				
		for(EditPart ep : allObjects) {
			if (ep instanceof EntityEditPart) {
				EntityEditPart entityEditPart = (EntityEditPart) ep;
				Entity l = (Entity) entityEditPart.getNotationView().getElement();
				if (l != null && l.getNodeText().equals(node.getNodeText()) && !l.equals(node)) {
					//refresh it
					setAttributes((ShapeNodeEditPart) ep, node.getAttributes());
					setEntities((ShapeNodeEditPart) ep, node.getEntities());
				}						
			} else if (ep instanceof AssociationEntityEditPart) {						
				AssociationEntityEditPart aEEP = (AssociationEntityEditPart) ep;
				Iterator<Entity2EditPart> itE = ((AssociationEntityAssociationEntityAssociationsCompartmentEditPart) aEEP.getChildren().get(1)).getChildren().iterator();
				while (itE.hasNext()) {
					Entity2EditPart e2 = itE.next();
					Entity l = (Entity) e2.getNotationView().getElement();
					if (l != null && l.getNodeText().equals(node.getNodeText())) {						
						setAttributes((ShapeNodeEditPart) e2, node.getAttributes());
						setEntities((ShapeNodeEditPart) e2, node.getEntities());
					}
				}													
			}
		}
	}
}
