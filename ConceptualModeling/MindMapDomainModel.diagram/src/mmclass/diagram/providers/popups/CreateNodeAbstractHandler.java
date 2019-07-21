package mmclass.diagram.providers.popups;

import java.util.List;

import mmclass.Entity;
import mmclass.diagram.edit.parts.EntityEditPart;
import mmclass.diagram.edit.parts.MindMapModelEditPart;
import mmclass.diagram.providers.MmclassElementTypes;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.DeferredCreateConnectionViewAndElementCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateConnectionViewAndElementRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.RequestConstants;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.IHintedType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PlatformUI;

public class CreateNodeAbstractHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		// TODO Auto-generated method stub
		return null;
	}
	
	protected void runOperation(String commandTitle, CreateViewRequest nodeRequest, IElementType type, EditPart selectedElement, boolean reserve) {
		CompoundCommand cc = new CompoundCommand(commandTitle);

		MindMapModelEditPart mapEditPart = (MindMapModelEditPart) selectedElement.getParent();
		Command createTopicCmd = mapEditPart.getCommand(nodeRequest);
		IAdaptable topicViewAdapter = (IAdaptable) ((List) nodeRequest.getNewObject()).get(0);

		cc.add(createTopicCmd);

		// create the subtopics link command
		ICommand createSubTopicsCmd = null;
		if (!reserve) {
			createSubTopicsCmd = new DeferredCreateConnectionViewAndElementCommand(new CreateConnectionViewAndElementRequest(MmclassElementTypes.Edge_4001,
					((IHintedType) MmclassElementTypes.Edge_4001).getSemanticHint(), ((GraphicalEditPart) selectedElement).getDiagramPreferencesHint()), new EObjectAdapter((EObject) selectedElement.getModel()),
					topicViewAdapter, selectedElement.getViewer());
		} else {
			createSubTopicsCmd = new DeferredCreateConnectionViewAndElementCommand(new CreateConnectionViewAndElementRequest(MmclassElementTypes.Edge_4001,
					((IHintedType) MmclassElementTypes.Edge_4001).getSemanticHint(), ((GraphicalEditPart) selectedElement).getDiagramPreferencesHint()),topicViewAdapter, new EObjectAdapter((EObject) selectedElement.getModel()),
					selectedElement.getViewer());
		}
		cc.add(new ICommandProxy(createSubTopicsCmd));

		((GraphicalEditPart) selectedElement).getDiagramEditDomain().getDiagramCommandStack().execute(cc);
//		EntityEditPart e = (EntityEditPart) selectedElement;
//		Entity ee = ((Entity) e.getNotationView().getElement());
//		ee.getEntities().add(elementPart);
		// put the new topic in edit mode
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
