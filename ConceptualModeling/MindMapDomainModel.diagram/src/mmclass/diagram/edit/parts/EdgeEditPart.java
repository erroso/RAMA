/*
 * 
 */
package mmclass.diagram.edit.parts;

import java.util.Random;

import mmclass.diagram.edit.policies.EdgeItemSemanticEditPolicy;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.Ellipse;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.BasicNotifierImpl;
import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.runtime.notation.impl.EdgeImpl;
import org.eclipse.gmf.runtime.notation.impl.IdentityAnchorImpl;
import org.eclipse.gmf.runtime.notation.impl.RelativeBendpointsImpl;
import org.eclipse.swt.graphics.Color;

import UTIL.ActiveDiagram;

/**
 * @generated
 */
public class EdgeEditPart extends ConnectionNodeEditPart implements
		ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4001;

	/**
	 * @generated
	 */
	public EdgeEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new EdgeItemSemanticEditPolicy());
	}
	
	public void handleNotificationEvent(Notification notification) {
		//		System.out.println("T Anchor: " + this.getTarget());
		//		System.out.println("S Anchor: " + this.getSource());
//		System.out.println(notification);
		if (!(notification.getNotifier() instanceof RelativeBendpointsImpl) && !(notification.getNotifier() instanceof IdentityAnchorImpl)) {
			if (this.getTarget() instanceof EntityEditPart) {				
				Color c;
				EntityEditPart edp = (EntityEditPart) this.getTarget();
				if (this.getSource() instanceof RootNodeEditPart) {
					c = UTIL.ColorScheme.generateRandomColor();
				} else {
					if (this.getSource() instanceof AssociationEntityEditPart) {
						c = ((AssociationEntityEditPart) this.getSource()).getPrimaryShape().getForegroundColor();
					} else {
						c = ((EntityEditPart) this.getSource()).getPrimaryShape().getForegroundColor();
					}
				}				
				edp.getPrimaryShape().setForegroundColor(c);
				getPrimaryShape().setForegroundColor(c);
			}
			if (this.getTarget() instanceof AssociationEntityEditPart) {
				Color c;				
				AssociationEntityEditPart aedp = (AssociationEntityEditPart) this.getTarget();
				if (this.getSource() instanceof RootNodeEditPart) {
					c = UTIL.ColorScheme.generateRandomColor();
				} else {
					if (this.getSource() instanceof AssociationEntityEditPart) {
						c = ((AssociationEntityEditPart) this.getSource()).getPrimaryShape().getForegroundColor();
					} else {
						c = ((EntityEditPart) this.getSource()).getPrimaryShape().getForegroundColor();
					}
				}				
				aedp.getPrimaryShape().setForegroundColor(c);
				getPrimaryShape().setForegroundColor(c);
			}
			if (this.getTarget() instanceof AttributeEditPart) {
				AttributeEditPart adp = (AttributeEditPart) this.getTarget();
				Color toPut = new Color(null,0,0,0);
				if (this.getSource() instanceof EntityEditPart) {
					EntityEditPart edp = (EntityEditPart) this.getSource();
					toPut = edp.getPrimaryShape().getForegroundColor();
				} else if (this.getSource() instanceof AssociationEntityEditPart) {
					AssociationEntityEditPart edp = (AssociationEntityEditPart) this.getSource();
					toPut = edp.getPrimaryShape().getForegroundColor();
				}
				getPrimaryShape().setForegroundColor(toPut);
				adp.getPrimaryShape().setBorderLine(toPut);
			}
		}		
		super.handleNotificationEvent(notification);
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated NOT
	 */

	protected Connection createConnectionFigure() {
		Color c = ColorConstants.black;
		int lineWith = 1;
		EdgeImpl ei = (EdgeImpl) this.getModel();
		if (this.getSource() instanceof RootNodeEditPart) {
			lineWith = 3;
		} else if (this.getSource() instanceof EntityEditPart) {
			lineWith = 2;
			EntityEditPart edp = null;
			edp = (EntityEditPart) this.getSource();
			c = edp.getPrimaryShape().getForegroundColor();
		} else if (this.getSource() instanceof AssociationEntityEditPart) {
			lineWith = 2;
			AssociationEntityEditPart edp = null;
			edp = (AssociationEntityEditPart) this.getSource();
			c = edp.getPrimaryShape().getForegroundColor();
		}
		return new EdgeFigure(c, lineWith);
	}

	/**
	 * @generated
	 */
	public EdgeFigure getPrimaryShape() {
		return (EdgeFigure) getFigure();
	}
	
	//anchora no source, ser a bola e cor do arco.
	/**
	 * @generated NOT
	 */
	public class EdgeFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		public EdgeFigure() {
			this.setForegroundColor(THIS_FORE);

		}

		/**
		 * @generated NOT
		 */
		public EdgeFigure(Color c, int lineWith) {
			this.setForegroundColor(c);
			setLineWidth(lineWith);
			setSourceDecoration(createSourceDecoration());			
		}

		public class CircleDecoration extends Ellipse implements RotatableDecoration {
			private int myRadius = 5;
			private Point myCenter = new Point();

			public void setRadius(int radius) {
				erase();
				myRadius = Math.abs(radius);
				bounds = null;
				repaint();
			}

			public void setLineWidth(int width) {
				super.setLineWidth(width);
			}

			public Rectangle getBounds() {
				if (bounds == null) {
					int diameter = myRadius * 2;
					bounds = new Rectangle(myCenter.x - myRadius, myCenter.y
							- myRadius, diameter, diameter);
					bounds.expand(lineWidth / 2, lineWidth / 2);
				}
				return bounds;
			}

			public void setLocation(Point p) {
				if (myCenter.equals(p)) {
					return;
				}
				myCenter.setLocation(p);
				bounds = null;
			}

			public void setReferencePoint(Point p) {
				// ignore, does not make sense to rotate circle
			}
		}

		/**
		 * @generated NOT
		 */
		private RotatableDecoration createSourceDecoration() {
			CircleDecoration df = new CircleDecoration();
			return df;
		}
	}

	/**
	 * @generated
	 */
	static final Color THIS_FORE = new Color(null, 128, 128, 128);

}
