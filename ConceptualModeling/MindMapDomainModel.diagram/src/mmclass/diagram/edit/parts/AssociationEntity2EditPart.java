/*
 * 
 */
package mmclass.diagram.edit.parts;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import mmclass.diagram.edit.parts.custom.HighlightingWrappingLabel;
import mmclass.diagram.edit.policies.AssociationEntity2ItemSemanticEditPolicy;
import mmclass.diagram.edit.policies.OpenDiagramEditPolicy;
import mmclass.diagram.part.MmclassVisualIDRegistry;
import mmclass.diagram.providers.MmclassElementTypes;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.edit.policies.reparent.CreationEditPolicyWithCustomReparent;
import org.eclipse.swt.graphics.Color;

/**
 * @generated
 */
public class AssociationEntity2EditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3001;

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
	public AssociationEntity2EditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicyWithCustomReparent(
						MmclassVisualIDRegistry.TYPED_INSTANCE));
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new AssociationEntity2ItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		installEditPolicy(EditPolicyRoles.OPEN_ROLE,
				new OpenDiagramEditPolicy());
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
		return primaryShape = new AssociationEntityFigure();
	}

	/**
	 * @generated
	 */
	public AssociationEntityFigure getPrimaryShape() {
		return (AssociationEntityFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof AssociationEntityNodeText2EditPart) {
			((AssociationEntityNodeText2EditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureAssociationEntityLabelFigure());
			return true;
		}
		if (childEditPart instanceof AssociationEntityAssociationEntityAssociationsCompartment2EditPart) {
			IFigure pane = getPrimaryShape()
					.getAssociationEntityAssociationsCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((AssociationEntityAssociationEntityAssociationsCompartment2EditPart) childEditPart)
					.getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof AssociationEntityNodeText2EditPart) {
			return true;
		}
		if (childEditPart instanceof AssociationEntityAssociationEntityAssociationsCompartment2EditPart) {
			IFigure pane = getPrimaryShape()
					.getAssociationEntityAssociationsCompartmentFigure();
			pane.remove(((AssociationEntityAssociationEntityAssociationsCompartment2EditPart) childEditPart)
					.getFigure());
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
		if (editPart instanceof AssociationEntityAssociationEntityAssociationsCompartment2EditPart) {
			return getPrimaryShape()
					.getAssociationEntityAssociationsCompartmentFigure();
		}
		return getContentPane();
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(40, 40);
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
	 * @generated
	 */
	protected void setForegroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setForegroundColor(color);
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
				.getType(AssociationEntityNodeText2EditPart.VISUAL_ID));
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
		if (targetEditPart instanceof AttributeEditPart) {
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
		if (targetEditPart instanceof mmclass.diagram.edit.parts.AssociationEntity2EditPart) {
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
	public EditPart getTargetEditPart(Request request) {
		if (request instanceof CreateViewAndElementRequest) {
			CreateElementRequestAdapter adapter = ((CreateViewAndElementRequest) request)
					.getViewAndElementDescriptor()
					.getCreateElementRequestAdapter();
			IElementType type = (IElementType) adapter
					.getAdapter(IElementType.class);
			if (type == MmclassElementTypes.AssociationEntity_3001) {
				return getChildBySemanticHint(MmclassVisualIDRegistry
						.getType(AssociationEntityAssociationEntityAssociationsCompartment2EditPart.VISUAL_ID));
			}
			if (type == MmclassElementTypes.Entity_3002) {
				return getChildBySemanticHint(MmclassVisualIDRegistry
						.getType(AssociationEntityAssociationEntityAssociationsCompartment2EditPart.VISUAL_ID));
			}
		}
		return super.getTargetEditPart(request);
	}

	/**
	 * @generated
	 */
	public class AssociationEntityFigure extends RoundedRectangle {

		/**
		 * @generated NOT
		 */
		private HighlightingWrappingLabel fFigureAssociationEntityLabelFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fAssociationEntityAssociationsCompartmentFigure;

		/**
		 * @generated
		 */
		public AssociationEntityFigure() {
			this.setCornerDimensions(new Dimension(getMapMode().DPtoLP(8),
					getMapMode().DPtoLP(8)));
			this.setBorder(new MarginBorder(getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(5), getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(5)));
			createContents();
		}

		/**
		 * @generated NOT
		 */
		private void createContents() {

			fFigureAssociationEntityLabelFigure = new HighlightingWrappingLabel();

			fFigureAssociationEntityLabelFigure.setText("AssociationEntity");
			fFigureAssociationEntityLabelFigure.setMaximumSize(new Dimension(
					getMapMode().DPtoLP(10000), getMapMode().DPtoLP(50)));

			this.add(fFigureAssociationEntityLabelFigure);

			fAssociationEntityAssociationsCompartmentFigure = new RectangleFigure();

			fAssociationEntityAssociationsCompartmentFigure.setOutline(false);

			this.add(fAssociationEntityAssociationsCompartmentFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureAssociationEntityLabelFigure() {
			return fFigureAssociationEntityLabelFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getAssociationEntityAssociationsCompartmentFigure() {
			return fAssociationEntityAssociationsCompartmentFigure;
		}

	}

}
