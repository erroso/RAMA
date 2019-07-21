package mmclass.diagram.providers.popups;

import mmclass.diagram.edit.parts.EntityEditPart;
import mmclass.diagram.edit.parts.EnumEditPart;
import mmclass.diagram.providers.MmclassElementTypes;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequestFactory;

public class CreateConstantAction extends CreateNodeAbstractHandler {	
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {		
		EnumEditPart selectedElement;
		Object selection = getSelectedElement();
		
		// Treat non-null selected object (try to adapt and return EObject)
		if (selection instanceof EnumEditPart) {
			selectedElement = (EnumEditPart) selection;			
		} else {
			return null;
		}
		// Create the new relationship for the other end.
		CreateViewRequest leafRequest = CreateViewRequestFactory.getCreateShapeRequest(MmclassElementTypes.Constant_2006, selectedElement.getDiagramPreferencesHint());		
						
		runOperation("Create Constant and link", leafRequest, MmclassElementTypes.Edge_4001, selectedElement, false);
		
		return null;
	}
}
