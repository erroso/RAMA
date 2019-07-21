package mmclass.diagram.edit.parts.custom;

import UTIL.ActiveDiagram;

import org.eclipse.draw2d.AbstractConnectionAnchor;
import org.eclipse.draw2d.AnchorListener;
import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PrecisionPoint;

public class ConstantSourceFixedConnectionAnchor extends AbstractConnectionAnchor { 
	public ConstantSourceFixedConnectionAnchor(IFigure owner) {
		super(owner);
	}
	
	public Point getLocation(Point reference) { 		
		Point left = getOwner().getBounds().getBottomLeft();
		Point right = getOwner().getBounds().getBottomRight();
		Point p;			
		//System.out.println("LEAF LOCATION: " + getOwner().getBounds().getCenter());
//		if (ActiveDiagram.getCenterNodePosition().x() < left.x) {
//			p = new PrecisionPoint(left.x,left.y - 1);
//		} else {
			p = new PrecisionPoint(right.x,right.y - 1);
//		}		
		getOwner().translateToAbsolute(p); 
		return p;
	}

}
