/*******************************************************************************
 * Copyright 2005, CHISEL Group, University of Victoria, Victoria, BC, Canada.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     The Chisel Group, University of Victoria
 *******************************************************************************/
package mmclass.diagram.providers.layouts;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import mmclass.diagram.edit.parts.AttributeEditPart;
import mmclass.diagram.edit.parts.EdgeEditPart;
import mmclass.diagram.edit.parts.EntityEditPart;
import mmclass.diagram.edit.parts.RootNodeEditPart;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.LayoutListener;
import org.eclipse.gef.RootEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.zest.core.widgets.GraphNode;
import org.eclipse.zest.layouts.Filter;
import org.eclipse.zest.layouts.InvalidLayoutConfiguration;
import org.eclipse.zest.layouts.LayoutEntity;
import org.eclipse.zest.layouts.LayoutGraph;
import org.eclipse.zest.layouts.LayoutItem;
import org.eclipse.zest.layouts.LayoutRelationship;
import org.eclipse.zest.layouts.LayoutStyles;
import org.eclipse.zest.layouts.algorithms.HorizontalTreeLayoutAlgorithm;
import org.eclipse.zest.layouts.algorithms.RadialLayoutAlgorithm;
import org.eclipse.zest.layouts.algorithms.TreeLayoutAlgorithm;
import org.eclipse.zest.layouts.dataStructures.DisplayIndependentDimension;
import org.eclipse.zest.layouts.dataStructures.DisplayIndependentPoint;
import org.eclipse.zest.layouts.dataStructures.DisplayIndependentRectangle;
import org.eclipse.zest.layouts.dataStructures.InternalNode;
import org.eclipse.zest.layouts.dataStructures.InternalRelationship;
import org.eclipse.zest.layouts.progress.ProgressListener;

/**
 * The TreeLayoutAlgorithm class implements a simple algorithm to arrange graph
 * nodes in a layered tree-like layout.
 * 
 * @version 3.0
 * @author Mateusz Matela
 * @author Casey Best and Rob Lintern (version 2.0)
 * @author Jingwei Wu (version 1.0)
 */
public class MindMapTreeLayoutAlgorithm extends TreeLayoutAlgorithm {
	
	public MindMapTreeLayoutAlgorithm() {
		this(LayoutStyles.NONE);
	}

	/**
	 * 
	 */
	public MindMapTreeLayoutAlgorithm(int styles) {
		super(styles);
	}
	@Override
	protected void preLayoutAlgorithm(InternalNode[] entitiesToLayout, InternalRelationship[] relationshipsToConsider, double x, double y, double width, double height) {
		// NOTE: width and height are swtiched here when calling super method
		super.preLayoutAlgorithm(entitiesToLayout, relationshipsToConsider, x, y, height, width);
	}
	@Override
	protected void postLayoutAlgorithm(InternalNode[] entitiesToLayout, InternalRelationship[] relationshipsToConsider) {
		// swap x->y and width->height
		HashMap<ShapeNodeEditPart,Integer> whereTo = new HashMap<ShapeNodeEditPart,Integer>();			
		int one = 1;
		int majorCount = 0;
		int padding = 0;
		for (int i = 0; i < relationshipsToConsider.length; i++) {
			InternalRelationship r = relationshipsToConsider[i];
			if (((GraphNode) r.getSource().getLayoutEntity().getGraphData()).getData() instanceof RootNodeEditPart) {
				InternalNode le = r.getDestination();
				if (majorCount == 0) { padding = (int) le.getInternalX(); }
				majorCount++;
				if (majorCount == relationshipsToConsider.length/2) { padding = (int) le.getInternalX(); }
			}
		}
		majorCount = (int) majorCount/2;		
		for (int i = 0; i < entitiesToLayout.length; i++) {
			InternalNode entity = entitiesToLayout[i];			
			LayoutEntity li = (LayoutEntity) entity.getLayoutEntity();			
			GraphNode gn = (GraphNode) li.getGraphData(); 			
			if (gn.getData() instanceof EntityEditPart) {
				EntityEditPart edp = (EntityEditPart) gn.getData();
				if (((EdgeEditPart) edp.getTargetConnections().get(0)).getSource() instanceof RootNodeEditPart) {					
					if (majorCount > 0) {
						one = 1;						
					} else {
						one = -1;
					}								
					majorCount--;					 
					whereTo.put(edp, one);
										
				}					
			} else if (gn.getData() instanceof AttributeEditPart) {
				AttributeEditPart adp = (AttributeEditPart) gn.getData();
				EntityEditPart parent = (EntityEditPart) ((EdgeEditPart) adp.getTargetConnections().get(0)).getSource();
				one = whereTo.get(parent);
			}						
			System.out.println("PLACING NODE: " + entity.getLayoutEntity().getGraphData().toString() + " WITH PADDING: " + padding);			
			if (one == 1) {
				if (((GraphNode) entity.getLayoutEntity().getGraphData()).getData() instanceof RootNodeEditPart) {
					entity.setInternalLocation(entity.getInternalY() * one, entity.getInternalX() + padding/2);
				} else {
					entity.setInternalLocation(entity.getInternalY() * one, entity.getInternalX());
				}				
			} else {
				entity.setInternalLocation(entity.getInternalY() * one, entity.getInternalX());
			}
			entity.setInternalSize(entity.getInternalWidth(), entity.getInternalHeight());
		}
		super.postLayoutAlgorithm(entitiesToLayout, relationshipsToConsider);
	}
	@Override
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