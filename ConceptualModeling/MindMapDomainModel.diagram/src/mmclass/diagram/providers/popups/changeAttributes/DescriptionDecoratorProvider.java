package mmclass.diagram.providers.popups.changeAttributes;

import mmclass.Node;
import mmclass.diagram.edit.parts.MindMapModelEditPart;
import mmclass.diagram.part.MmclassDiagramEditorPlugin;
import mmclass.diagram.part.MmclassVisualIDRegistry;
import mmclass.impl.NodeImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.diagram.core.listener.DiagramEventBroker;
import org.eclipse.gmf.runtime.diagram.core.listener.NotificationListener;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.services.decorator.AbstractDecorator;
import org.eclipse.gmf.runtime.diagram.ui.services.decorator.CreateDecoratorsOperation;
import org.eclipse.gmf.runtime.diagram.ui.services.decorator.IDecoratorProvider;
import org.eclipse.gmf.runtime.diagram.ui.services.decorator.IDecoratorTarget;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Image;

public class DescriptionDecoratorProvider  extends AbstractProvider implements IDecoratorProvider {
	public static final String COMMENTS_DECORATOR_ID = "comments";
	
	public boolean provides(IOperation operation) {
		if (!(operation instanceof CreateDecoratorsOperation)) {
			return false;
		}
		IDecoratorTarget decoratorTarget = ((CreateDecoratorsOperation) operation).getDecoratorTarget();
		View view = (View) decoratorTarget.getAdapter(View.class);
		return view != null && MindMapModelEditPart.MODEL_ID.equals(MmclassVisualIDRegistry.getModelID(view));
	}
	
	public void createDecorators(IDecoratorTarget decoratorTarget) {
		View view = (View) decoratorTarget.getAdapter(View.class);
		if (view != null) {
			if (view.getElement() instanceof NodeImpl) {				
				//if (ri.getOclRules().trim().length() > 0) {
					decoratorTarget.installDecorator(COMMENTS_DECORATOR_ID,new CommentsDecorator(decoratorTarget));
				//}
			}
		}
	}
	protected class CommentsDecorator  extends AbstractDecorator {
		
		private NotificationListener notificationListener = new NotificationListener() {
			public void notifyChanged(Notification notification) { 
				refresh();					
			}
		};
        private EObject semanticElement;
        private IGraphicalEditPart gep;

		public CommentsDecorator(IDecoratorTarget decoratorTarget) {
			super(decoratorTarget);
			// TODO Auto-generated constructor stub
			 gep = (IGraphicalEditPart) getDecoratorTarget().getAdapter(
                     IGraphicalEditPart.class);
			 semanticElement = gep.resolveSemanticElement();

		}
				
		/**
		 * @generated
		 */
		public void activate() {
			DiagramEventBroker.getInstance(gep.getEditingDomain()).addNotificationListener(semanticElement, notificationListener);			
		}		
		
		public void deactivate() { 
			removeDecoration();
			IGraphicalEditPart gep = (IGraphicalEditPart) getDecoratorTarget().getAdapter(IGraphicalEditPart.class);
			assert gep != null; DiagramEventBroker.getInstance(gep.getEditingDomain()).removeNotificationListener(
		       gep.getNotationView(), notificationListener);
		 }
		
		/**
		 * @generated
		 */
		public void refresh() {
			removeDecoration();
			EditPart editPart = (EditPart) getDecoratorTarget().getAdapter(EditPart.class);
			Image image = MmclassDiagramEditorPlugin.getInstance().getBundledImage("icons/comments.gif"); //$NON-NLS-1$			
			if (editPart instanceof ShapeEditPart) {
				//if (((ShapeEditPart) editPart).getNotationView().getElement() instanceof Relationship) {
					Node node = (Node) ((ShapeEditPart) editPart).getNotationView().getElement();
					if (node.getDescription() != null) {
						if (node.getDescription().length() > 0)
							setDecoration(getDecoratorTarget().addShapeDecoration(image,IDecoratorTarget.Direction.NORTH_WEST, -3, false));
					}
				//}
			}
		}					
	}
}