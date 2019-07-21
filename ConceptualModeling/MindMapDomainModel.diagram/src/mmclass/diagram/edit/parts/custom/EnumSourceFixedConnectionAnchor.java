package mmclass.diagram.edit.parts.custom;


import org.eclipse.draw2d.AbstractConnectionAnchor;
import org.eclipse.draw2d.AnchorListener;
import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PrecisionPoint;

public class EnumSourceFixedConnectionAnchor extends AbstractConnectionAnchor { 
	
	public EnumSourceFixedConnectionAnchor(IFigure owner) {
		super(owner);
	}
	
	public Point getLocation(Point reference) { 
		//System.out.println("REF: " + reference);		
		Point left = getOwner().getBounds().getLeft();
		Point right = getOwner().getBounds().getRight();
		Point p, p2;
		p2 = UTIL.ActiveDiagram.getCenterNodePosition();
		
//		if (p2.x < left.x) {
			p = new PrecisionPoint(right.x,right.y);
//		} else {
//			p = new PrecisionPoint(left.x,left.y);
//		}		
		getOwner().translateToAbsolute(p); 
		return p;
	}

}
