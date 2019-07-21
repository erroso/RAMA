/*
 * 
 */
package mmclass.diagram.edit.parts;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import mmclass.diagram.edit.parts.custom.HighlightingWrappingLabel;
import mmclass.diagram.edit.parts.custom.LeafSourceFixedConnectionAnchor;
import mmclass.diagram.edit.parts.custom.LeafTargetFixedConnectionAnchor;
import mmclass.diagram.edit.policies.AttributeItemSemanticEditPolicy;
import mmclass.diagram.part.MmclassVisualIDRegistry;
import mmclass.diagram.providers.MmclassElementTypes;

import org.eclipse.draw2d.Border;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.gef.ConnectionEditPart;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.OneLineBorder;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

/**
 * @generated
 */
public class AttributeEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2003;

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated
	 */
	protected IFigure primaryShape;

	/**
	 * @generated
	 */
	public AttributeEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new AttributeItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {
		org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy lep = new org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				EditPolicy result = child
						.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
				if (result == null) {
					result = new NonResizableEditPolicy();
				}
				return result;
			}

			protected Command getMoveChildrenCommand(Request request) {
				return null;
			}

			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		return primaryShape = new AttributeFigure();
	}

	/**
	 * @generated
	 */
	public AttributeFigure getPrimaryShape() {
		return (AttributeFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof AttributeNodeTextEditPart) {
			((AttributeNodeTextEditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureAttributeLabelFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof AttributeNodeTextEditPart) {
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	 * @generated
	 */
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	 * @generated
	 */
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		return getContentPane();
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(50, 10);
		return result;
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	 * Default implementation treats passed figure as content pane.
	 * Respects layout one may have set for generated figure.
	 * @param nodeShape instance of generated figure class
	 * @generated
	 */
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(5);
			nodeShape.setLayoutManager(layout);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	 * @generated
	 */
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	 * @generated NOT
	 */
	protected void setForegroundColor(Color color) {
		if (primaryShape != null) {
			this.getPrimaryShape().setBorderLine(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setBackgroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setBackgroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineWidth(int width) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineWidth(width);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineType(int style) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineStyle(style);
		}
	}

	/**
	 * @generated
	 */
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(MmclassVisualIDRegistry
				.getType(AttributeNodeTextEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(MmclassElementTypes.Edge_4001);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof EnumEditPart) {
			types.add(MmclassElementTypes.Edge_4001);
		}
		if (targetEditPart instanceof AssociationEntityEditPart) {
			types.add(MmclassElementTypes.Edge_4001);
		}
		if (targetEditPart instanceof mmclass.diagram.edit.parts.AttributeEditPart) {
			types.add(MmclassElementTypes.Edge_4001);
		}
		if (targetEditPart instanceof RootNodeEditPart) {
			types.add(MmclassElementTypes.Edge_4001);
		}
		if (targetEditPart instanceof ConstantEditPart) {
			types.add(MmclassElementTypes.Edge_4001);
		}
		if (targetEditPart instanceof EntityEditPart) {
			types.add(MmclassElementTypes.Edge_4001);
		}
		if (targetEditPart instanceof AssociationEntity2EditPart) {
			types.add(MmclassElementTypes.Edge_4001);
		}
		if (targetEditPart instanceof Entity2EditPart) {
			types.add(MmclassElementTypes.Edge_4001);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == MmclassElementTypes.Edge_4001) {
			types.add(MmclassElementTypes.Enum_2001);
			types.add(MmclassElementTypes.AssociationEntity_2002);
			types.add(MmclassElementTypes.Attribute_2003);
			types.add(MmclassElementTypes.RootNode_2004);
			types.add(MmclassElementTypes.Constant_2006);
			types.add(MmclassElementTypes.Entity_2007);
			types.add(MmclassElementTypes.AssociationEntity_3001);
			types.add(MmclassElementTypes.Entity_3002);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(MmclassElementTypes.Edge_4001);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == MmclassElementTypes.Edge_4001) {
			types.add(MmclassElementTypes.Enum_2001);
			types.add(MmclassElementTypes.AssociationEntity_2002);
			types.add(MmclassElementTypes.Attribute_2003);
			types.add(MmclassElementTypes.RootNode_2004);
			types.add(MmclassElementTypes.Constant_2006);
			types.add(MmclassElementTypes.Entity_2007);
			types.add(MmclassElementTypes.AssociationEntity_3001);
			types.add(MmclassElementTypes.Entity_3002);
		}
		return types;
	}

	/**
	 * @generated
	 */
	protected void handleNotificationEvent(Notification event) {
		if (event.getNotifier() == getModel()
				&& EcorePackage.eINSTANCE.getEModelElement_EAnnotations()
						.equals(event.getFeature())) {
			handleMajorSemanticChange();
		} else {
			super.handleNotificationEvent(event);
		}
	}

	private ConnectionAnchor sourceAnchor;
	private ConnectionAnchor targetAnchor;

	@Override
	public ConnectionAnchor getSourceConnectionAnchor(
			ConnectionEditPart connEditPart) {
		if (sourceAnchor == null) {
			sourceAnchor = new LeafSourceFixedConnectionAnchor(getNodeFigure());
		}
		return sourceAnchor;
	}

	@Override
	public ConnectionAnchor getTargetConnectionAnchor(
			ConnectionEditPart connEditPart) {
		//System.out.println("??? : " + connEditPart.getSource() + " -> " + connEditPart.getTarget());
		//if (targetAnchor == null) {
		targetAnchor = new LeafTargetFixedConnectionAnchor(getNodeFigure());
		//}
		return targetAnchor;
	}

	/**
	 * @generated
	 */
	public class AttributeFigure extends RoundedRectangle {

		/**
		 * @generated NOT
		 */
		private HighlightingWrappingLabel fFigureAttributeLabelFigure;
		private OneLineBorder result = new OneLineBorder();

		/**
		 * @generated
		 */
		public AttributeFigure() {
			this.setCornerDimensions(new Dimension(getMapMode().DPtoLP(8),
					getMapMode().DPtoLP(8)));
			this.setFill(false);
			this.setOutline(false);
			createContents();
		}

		/**
		 * @generated NOT
		 */
		private void createContents() {

			fFigureAttributeLabelFigure = new HighlightingWrappingLabel();

			fFigureAttributeLabelFigure.setText("Attribute");
			fFigureAttributeLabelFigure.setAlignment(PositionConstants.CENTER);

			this.add(fFigureAttributeLabelFigure);

			RectangleFigure attributeNameRectangleFigure0 = new RectangleFigure();

			attributeNameRectangleFigure0.setFill(false);
			attributeNameRectangleFigure0.setOutline(false);

			attributeNameRectangleFigure0.setBorder(new MarginBorder(
					getMapMode().DPtoLP(0), getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(5), getMapMode().DPtoLP(0)));
			attributeNameRectangleFigure0.setBorder(createBorder0());

			this.add(attributeNameRectangleFigure0);
			attributeNameRectangleFigure0.setLayoutManager(new StackLayout());

			WrappingLabel attributeNameFigure1 = new WrappingLabel();

			attributeNameFigure1.setText("");

			attributeNameRectangleFigure0.add(attributeNameFigure1);

		}

		/**
		 * @generated NOT
		 */
		private Border createBorder0() {
			result.setPosition(PositionConstants.BOTTOM);
			result.setColor(ColorConstants.black);
			result.setWidth(2);
			return result;
		}

		public void setBorderLine(Color c) {
			result.setColor(c);
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureAttributeLabelFigure() {
			return fFigureAttributeLabelFigure;
		}

	}

}
