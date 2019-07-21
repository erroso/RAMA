package mmclass.diagram.edit.parts.custom;


import mmclass.diagram.edit.parts.EdgeEditPart;
import mmclass.diagram.edit.parts.EntityEditPart;

import org.eclipse.draw2d.AbstractConnectionAnchor;
import org.eclipse.draw2d.AnchorListener;
import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PrecisionPoint;
import org.eclipse.gef.ConnectionEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.view.factories.ConnectionViewFactory;

public class RootSourceFixedConnectionAnchor extends AbstractConnectionAnchor { 
	private ConnectionEditPart connEditPart;
	public RootSourceFixedConnectionAnchor(IFigure owner, ConnectionEditPart connEditPart) {
		super(owner);
		this.connEditPart = connEditPart;
	}
	
	public Point getLocation(Point reference) { 
		//System.out.println("REF: " + reference);
		Point left = getOwner().getBounds().getLeft();
		Point right = getOwner().getBounds().getRight();
		Point center = getOwner().getBounds().getCenter();		
		Point p;
		Point p2 = center;
		if (connEditPart.getTarget() instanceof EntityEditPart) {
			EntityEditPart r = (EntityEditPart) connEditPart.getTarget();
			
			p2 = r.getLocation();
			System.out.println("CONN T: " + connEditPart.getTarget());
			System.out.println("CONN S: " + connEditPart.getSource());
			System.out.println("p2 :" + p2 + " vs " + center);
			System.out.println("");
		}
		
		if (p2.x > center.x) {
			p = new PrecisionPoint(right.x,right.y);
		} else {
			p = new PrecisionPoint(left.x,left.y);
		}		
		getOwner().translateToAbsolute(p); 
		return p;
	}
	public EdgeEditPart getConnEditPart() {
		// TODO Auto-generated method stub
		return (EdgeEditPart) connEditPart;
	}

}
