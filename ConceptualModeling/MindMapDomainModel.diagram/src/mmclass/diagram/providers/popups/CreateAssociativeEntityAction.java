package mmclass.diagram.providers.popups;

import mmclass.diagram.edit.parts.RootNodeEditPart;
import mmclass.diagram.providers.MmclassElementTypes;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequestFactory;

public class CreateAssociativeEntityAction extends CreateNodeAbstractHandler {
public final static String ID = "mmclass.popup.MindmapCreateAssociativeEntityID";
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		ShapeNodeEditPart selectedElement;
		Object selection = getSelectedElement();
		
		if (!(selection instanceof RootNodeEditPart)) {
			return null;
		} else {
			selectedElement = (ShapeNodeEditPart) selection;
		}

		CreateViewRequest relationshipRequest = CreateViewRequestFactory.getCreateShapeRequest(MmclassElementTypes.AssociationEntity_2002, selectedElement.getDiagramPreferencesHint());
		
		runOperation("Create Relationship and link", relationshipRequest, MmclassElementTypes.Edge_4001, selectedElement, false);
		return null;
		
	}
}
