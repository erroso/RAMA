package mmclass.diagram.providers.popups;

import mmclass.diagram.edit.parts.AssociationEntityEditPart;
import mmclass.diagram.edit.parts.EntityEditPart;
import mmclass.diagram.edit.parts.RootNodeEditPart;
import mmclass.diagram.providers.MmclassElementTypes;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequestFactory;

public class CreateAttributeAction extends CreateNodeAbstractHandler {	
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {		
		ShapeNodeEditPart selectedElement;
		Object selection = getSelectedElement();
		
		if (!(selection instanceof EntityEditPart) && !(selection instanceof AssociationEntityEditPart)) {
			return null;
		} else {
			selectedElement = (ShapeNodeEditPart) selection;
		}		
		// Create the new relationship for the other end.
		CreateViewRequest leafRequest = CreateViewRequestFactory.getCreateShapeRequest(MmclassElementTypes.Attribute_2003, selectedElement.getDiagramPreferencesHint());								
		runOperation("Create Atribute and link", leafRequest, MmclassElementTypes.Edge_4001, selectedElement, false);
		
		return null;
	}
}
