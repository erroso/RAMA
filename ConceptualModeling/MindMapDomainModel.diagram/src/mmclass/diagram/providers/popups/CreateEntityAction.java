package mmclass.diagram.providers.popups;

import java.io.IOException;

import javax.swing.ProgressMonitor;

import mmclass.Edge;
import mmclass.Entity;
import mmclass.MindMapModel;
import mmclass.MmclassFactory;
import mmclass.RootNode;
import mmclass.diagram.edit.commands.EntityCreateCommand;
import mmclass.diagram.edit.parts.AssociationEntityEditPart;
import mmclass.diagram.edit.parts.EntityEditPart;
import mmclass.diagram.edit.parts.RootNodeEditPart;
import mmclass.diagram.part.MmclassDiagramEditor;
import mmclass.diagram.providers.MmclassElementTypes;
import mmclass.impl.MindMapModelImpl;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequestFactory;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.notation.impl.DiagramImpl;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbenchPart;

import UTIL.ActiveDiagram;

public class CreateEntityAction extends CreateNodeAbstractHandler {

	public final static String ID = "mmnfr.popup.MindmapCreateRelationshipID";
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		ShapeNodeEditPart selectedElement;
		Object selection = getSelectedElement();
		
		if (!(selection instanceof RootNodeEditPart) && !(selection instanceof EntityEditPart) && !(selection instanceof AssociationEntityEditPart)) {
			return null;
		} else {
			selectedElement = (ShapeNodeEditPart) selection;
		}

		CreateViewRequest relationshipRequest = CreateViewRequestFactory.getCreateShapeRequest(MmclassElementTypes.Entity_2007, selectedElement.getDiagramPreferencesHint());

		runOperation("Create Relationship and link", relationshipRequest, MmclassElementTypes.Edge_4001, selectedElement, false);
		return null;
		
	}
}