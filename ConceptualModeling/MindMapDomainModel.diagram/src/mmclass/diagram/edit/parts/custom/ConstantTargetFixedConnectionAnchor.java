package mmclass.diagram.edit.parts.custom;

import java.util.Iterator;

import UTIL.ActiveDiagram;

import mmclass.diagram.edit.parts.EdgeEditPart;

import org.eclipse.draw2d.AbstractConnectionAnchor;
import org.eclipse.draw2d.AnchorListener;
import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.XYAnchor;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PrecisionPoint;
import org.eclipse.emf.transaction.RunnableWithResult;

import org.eclipse.gef.ConnectionEditPart;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.Anchor;

public class ConstantTargetFixedConnectionAnchor extends AbstractConnectionAnchor {

	private ConnectionEditPart connEditPart;
	public ConstantTargetFixedConnectionAnchor(IFigure owner) { 
		super(owner);
		
	}
	public Point getLocation(Point reference) { 
		Point left = getOwner().getBounds().getBottomLeft();
		Point right = getOwner().getBounds().getBottomRight();
		Point p, p2;
		p2 = ActiveDiagram.getCenterNodePosition();
		//System.out.println("REFERENCE: " + reference);
		//System.out.println("LEFT: " + left);
		//System.out.println("RIGHT: " + right);
//		if (p2.x < left.x) {
			p = new PrecisionPoint(left.x-1,left.y - 1);
//		} else {
//			p = new PrecisionPoint(right.x-1,right.y - 1);
//		}		
		getOwner().translateToAbsolute(p);  
		return p;
	}
	public EdgeEditPart getConnEditPart() {
		// TODO Auto-generated method stub
		return (EdgeEditPart) connEditPart;
	}
}
