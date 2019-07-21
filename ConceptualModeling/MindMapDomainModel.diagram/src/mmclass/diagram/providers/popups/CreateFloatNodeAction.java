package mmclass.diagram.providers.popups;

import java.util.List;

import mmclass.diagram.edit.parts.MindMapModelEditPart;
import mmclass.diagram.providers.MmclassElementTypes;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.draw2d.FigureCanvas;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.GraphicalViewer;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.ui.parts.GraphicalEditor;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequestFactory;
import org.eclipse.gmf.runtime.diagram.ui.requests.RequestConstants;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.widgets.Display;

public class CreateFloatNodeAction extends CreateNodeAbstractHandler {

	public final static String ID = "mmnfr.popup.MindmapCreateFloatNodeID";


	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {				
		String commandTitle = "Create Float Node";		
		MindMapModelEditPart selectedElement = (MindMapModelEditPart) UTIL.ActiveDiagram.getActiveEditor().getDiagramEditPart();
		
		CreateViewRequest nodeRequest = CreateViewRequestFactory.getCreateShapeRequest(MmclassElementTypes.Enum_2001, selectedElement.getDiagramPreferencesHint());
		
		// TODO Auto-generated method stub
		CompoundCommand cc = new CompoundCommand(commandTitle);					
		
		Point p = getCursorPosition(null);		
		nodeRequest.setLocation(p.translate(0, 0)); //find out where the mouse is at? Melhorar!!!!
		
		Command createTopicCmd = selectedElement.getCommand(nodeRequest);
		IAdaptable topicViewAdapter = (IAdaptable) ((List) nodeRequest.getNewObject()).get(0);		
		
		cc.add(createTopicCmd);
		
		((GraphicalEditPart) selectedElement).getDiagramEditDomain().getDiagramCommandStack().execute(cc);
		final EditPartViewer viewer = selectedElement.getViewer();
		final EditPart elementPart = (EditPart) viewer.getEditPartRegistry().get(topicViewAdapter.getAdapter(View.class));
		
		
		
		if (elementPart != null) {
			Display.getCurrent().asyncExec(new Runnable() {

				public void run() {
					viewer.setSelection(new StructuredSelection(elementPart));
					Request der = new Request(RequestConstants.REQ_DIRECT_EDIT);
					elementPart.performRequest(der);
				}
			});
		}
		return null;
	}
	public Point getCursorPosition(EditPart elementPart) {
		Display display = Display.getDefault();
		
		//GraphicalViewer gv = (GraphicalViewer) (elementPart).getAdapter(GraphicalViewer.class);
		org.eclipse.swt.graphics.Point point = display.getCursorLocation(); //gv.getControl().toControl();
		//FigureCanvas figureCanvas = (FigureCanvas)gv.getControl();
		//org.eclipse.draw2d.geometry.Point location = figureCanvas.getViewport().getViewLocation();
		return new Point(point.x, point.y);
	}
}
