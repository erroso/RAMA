package mmclass.diagram.providers.popups;

import mmclass.diagram.edit.parts.RootNodeEditPart;
import mmclass.diagram.providers.MmclassElementTypes;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequestFactory;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbenchPart;

public class CreateRelationshipAction extends CreateNodeAbstractHandler {

	public final static String ID = "mmnfr.popup.MindmapCreateRelationshipID";
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		RootNodeEditPart selectedElement;
		Object selection = getSelectedElement();
		
		if (selection instanceof RootNodeEditPart) {
			selectedElement = (RootNodeEditPart) selection;			
		} else {
			return null;
		}

		CreateViewRequest relationshipRequest = CreateViewRequestFactory.getCreateShapeRequest(MmclassElementTypes.Entity_2007, selectedElement.getDiagramPreferencesHint());
		
		runOperation("Create Relationship and link", relationshipRequest, MmclassElementTypes.Edge_4001, selectedElement, false);
		return null;
		
	}
}