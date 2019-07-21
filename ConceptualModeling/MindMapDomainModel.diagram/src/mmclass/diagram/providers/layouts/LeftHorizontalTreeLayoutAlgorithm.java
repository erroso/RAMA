package mmclass.diagram.providers.layouts;

import org.eclipse.zest.layouts.LayoutStyles;
import org.eclipse.zest.layouts.algorithms.TreeLayoutAlgorithm;
import org.eclipse.zest.layouts.dataStructures.InternalNode;
import org.eclipse.zest.layouts.dataStructures.InternalRelationship;

public class LeftHorizontalTreeLayoutAlgorithm extends TreeLayoutAlgorithm {

	/**
	 * Creates a horizontal tree layout with no style
	 */
	public LeftHorizontalTreeLayoutAlgorithm() {
		this(LayoutStyles.NONE);
	}

	/**
	 * 
	 */
	public LeftHorizontalTreeLayoutAlgorithm(int styles) {
		super(styles);
	}

	protected void preLayoutAlgorithm(InternalNode[] entitiesToLayout, InternalRelationship[] relationshipsToConsider, double x, double y, double width, double height) {
		// NOTE: width and height are swtiched here when calling super method
		super.preLayoutAlgorithm(entitiesToLayout, relationshipsToConsider, x, y, height, width);
	}

	protected void postLayoutAlgorithm(InternalNode[] entitiesToLayout, InternalRelationship[] relationshipsToConsider) {
		// swap x->y and width->height
		for (int i = 0; i < entitiesToLayout.length; i++) {
			InternalNode entity = entitiesToLayout[i];
			entity.setInternalLocation(entity.getInternalY()*-1, entity.getInternalX());
			entity.setInternalSize(entity.getInternalWidth(), entity.getInternalHeight());
		}
		super.postLayoutAlgorithm(entitiesToLayout, relationshipsToConsider);
	}

	protected boolean isValidConfiguration(boolean asynchronous, boolean continueous) {
		if (asynchronous && continueous)
			return false;
		else if (asynchronous && !continueous)
			return true;
		else if (!asynchronous && continueous)
			return false;
		else if (!asynchronous && !continueous)
			return true;

		return false;
	}

}