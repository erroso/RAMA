package mmclass.diagram.providers.popups.changeAttributes;

import mmclass.Entity;
import mmclass.MmclassPackage;
import mmclass.diagram.edit.parts.MindMapModelEditPart;
import mmclass.diagram.part.MmclassDiagramEditorPlugin;
import mmclass.diagram.part.MmclassVisualIDRegistry;
import mmclass.impl.EntityImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.diagram.core.listener.DiagramEventBroker;
import org.eclipse.gmf.runtime.diagram.core.listener.NotificationListener;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.services.decorator.AbstractDecorator;
import org.eclipse.gmf.runtime.diagram.ui.services.decorator.CreateDecoratorsOperation;
import org.eclipse.gmf.runtime.diagram.ui.services.decorator.IDecoratorProvider;
import org.eclipse.gmf.runtime.diagram.ui.services.decorator.IDecoratorTarget;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Image;

public class OclDecoratorProvider extends AbstractProvider implements IDecoratorProvider {
	public static final String HYPERLINK_DECORATOR_ID = "hyperlink";
	
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
			if (view.getElement() instanceof EntityImpl) {				
				//if (ri.getOclRules().trim().length() > 0) {
					decoratorTarget.installDecorator(HYPERLINK_DECORATOR_ID,new OclDecorator(decoratorTarget));
				//}
			}
		}
	}
	protected class OclDecorator  extends AbstractDecorator {
		
		private NotificationListener notificationListener = new NotificationListener() {
			public void notifyChanged(Notification notification) { 
				refresh();					
			}
		};
        private EObject semanticElement;
        private IGraphicalEditPart gep;

		public OclDecorator(IDecoratorTarget decoratorTarget) {
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
			Image image = MmclassDiagramEditorPlugin.getInstance().getBundledImage("icons/ocl.gif"); //$NON-NLS-1$			
			if (editPart instanceof ShapeEditPart) {
				//if (((ShapeEditPart) editPart).getNotationView().getElement() instanceof Relationship) {
					Entity node = (Entity) ((ShapeEditPart) editPart).getNotationView().getElement();
					if (node.getOclRules() != null) {
						if (node.getOclRules().length() > 0)
							setDecoration(getDecoratorTarget().addShapeDecoration(image,IDecoratorTarget.Direction.SOUTH_WEST, -2, false));
					}
				//}
			}
		}					
	}
}
