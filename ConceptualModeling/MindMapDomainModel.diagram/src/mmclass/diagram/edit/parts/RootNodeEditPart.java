/*
 * 
 */
package mmclass.diagram.edit.parts;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import mmclass.diagram.edit.parts.custom.EntitySourceFixedConnectionAnchor;
import mmclass.diagram.edit.parts.custom.HighlightingWrappingLabel;
import mmclass.diagram.edit.parts.custom.RootSourceFixedConnectionAnchor;
import mmclass.diagram.edit.policies.MindMapModelCanonicalEditPolicy;
import mmclass.diagram.edit.policies.RootNodeItemSemanticEditPolicy;
import mmclass.diagram.part.MmclassDiagramEditorPlugin;
import mmclass.diagram.part.MmclassVisualIDRegistry;
import mmclass.diagram.providers.MmclassElementTypes;
import mmclass.provider.MmclassEditPlugin;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.CompoundBorder;
import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.ImageFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;
import org.eclipse.gef.ConnectionEditPart;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.UnexecutableCommand;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.editpolicies.ResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ComponentEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.requests.RequestConstants;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.RoundedRectangleBorder;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;

import UTIL.ColorScheme;

/**
 * @generated
 */
public class RootNodeEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2004;

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
	public RootNodeEditPart(View view) {
		super(view);
	}

	//	/**
	//	 * @generated
	//	 */
	//	protected void createDefaultEditPolicies() {
	//		super.createDefaultEditPolicies();
	//		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
	//				new RootNodeItemSemanticEditPolicy());
	//		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
	//		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
	//		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	//	}

	/**
	 * @generated NOT
	 */
	protected void createDefaultEditPolicies() {
		//		installEditPolicy(EditPolicyRoles.CREATION_ROLE,new CreationEditPolicy());
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new RootNodeItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		installEditPolicy(EditPolicy.COMPONENT_ROLE, new ComponentEditPolicy() {
			public Command getCommand(Request request) {
				// If the user presses the delete key, don't delete
				if (RequestConstants.REQ_DELETE.equals(request.getType())) {
					
					return UnexecutableCommand.INSTANCE;
				}
				return super.getCommand(request);
			}
		});
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
		return primaryShape = new RootNodeFigure();
	}

	/**
	 * @generated
	 */
	public RootNodeFigure getPrimaryShape() {
		return (RootNodeFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof RootNodeNodeTextEditPart) {
			((RootNodeNodeTextEditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureRootNodeLabelFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof RootNodeNodeTextEditPart) {
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
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(40, 40);
		return result;
	}

	/**
	 * @generated NOT
	 */
	public EditPolicy getPrimaryDragEditPolicy() { //TO CANT RESIZE
		EditPolicy result = super.getPrimaryDragEditPolicy();
		if (result instanceof ResizableEditPolicy) {
			ResizableEditPolicy ep = (ResizableEditPolicy) result;
			ep.setResizeDirections(PositionConstants.NONE);
		}
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
				.getType(RootNodeNodeTextEditPart.VISUAL_ID));
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
		if (targetEditPart instanceof mmclass.diagram.edit.parts.RootNodeEditPart) {
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
	 * @generated NOT
	 */
	//	protected void handleNotificationEvent(Notification event) {
	//		if (event.getNotifier() == getModel()
	//				&& EcorePackage.eINSTANCE.getEModelElement_EAnnotations()
	//						.equals(event.getFeature())) {
	//			handleMajorSemanticChange();
	//		} else {
	//			super.handleNotificationEvent(event);
	//		}
	//	}
	@Override
	protected void handleNotificationEvent(Notification notification) {
		int type = notification.getEventType();
		Object feature = notification.getFeature();
		if (notification.getNotifier() == getModel()
				&& (type == Notification.ADD || type == Notification.REMOVE)) {
			CanonicalEditPolicy canonicalEditPolicy = (CanonicalEditPolicy) getParent()
					.getEditPolicy(EditPolicyRoles.CANONICAL_ROLE);
			canonicalEditPolicy.refresh();
			if (getParent().getEditPolicy(EditPolicyRoles.CANONICAL_ROLE) instanceof MindMapModelCanonicalEditPolicy) {
				((MindMapModelCanonicalEditPolicy) canonicalEditPolicy)
						.layout();
			}
		}
		super.handleNotificationEvent(notification);
	}

	
//	private ConnectionAnchor sourceAnchor;
//
//	@Override
//	public ConnectionAnchor getSourceConnectionAnchor(
//			ConnectionEditPart connEditPart) {
//		if (sourceAnchor == null) {
//			sourceAnchor = new RootSourceFixedConnectionAnchor(getNodeFigure(), connEditPart);
//		}
//		return sourceAnchor;
//	}
	
	/**
	 * @generated
	 */
	public class RootNodeFigure extends RoundedRectangle {

		//		Image unspecified = null;

		/**
		 * @generated NOT
		 */
		private HighlightingWrappingLabel fFigureRootNodeLabelFigure;

		/**
		 * @generated NOT
		 */
		public RootNodeFigure() {
			this.setCornerDimensions(new Dimension(getMapMode().DPtoLP(19),
					getMapMode().DPtoLP(19)));
			this.setBackgroundColor(UTIL.ColorScheme.generateRandomColor()); //new Color(null, 150, 204, 255)); //ColorConstants.orange);
			RoundedRectangleBorder rrb = new RoundedRectangleBorder(7, 7);
			rrb.setWidth(3);
			rrb.setColor(UTIL.ColorScheme.generateRandomColor());
			this.setBorder(new CompoundBorder(rrb, new MarginBorder(
					getMapMode().DPtoLP(7), getMapMode().DPtoLP(19),
					getMapMode().DPtoLP(7), getMapMode().DPtoLP(19))));
			createContents();
		}

		/**
		 * @generated NOT
		 */
		private void createContents() {

			fFigureRootNodeLabelFigure = new HighlightingWrappingLabel();

//			fFigureRootNodeLabelFigure.setText("Domain");

			fFigureRootNodeLabelFigure.setFont(FFIGUREROOTNODELABELFIGURE_FONT);

			this.fFigureRootNodeLabelFigure
					.setAlignment(PositionConstants.CENTER);

			//			if (unspecified == null) {
			//		      unspecified = ExtendedImageRegistry.INSTANCE.getImageDescriptor(
			//		       						MmclassEditPlugin.INSTANCE.getImage("/full/obj16"
			//		       								+ "/"
			//		       								+ "RootNode.gif")).createImage();
			//		      }		
			//			IFigure fImage = new ImageFigure(unspecified);			
			//			this.add(fImage);
			this.add(fFigureRootNodeLabelFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureRootNodeLabelFigure() {
			return fFigureRootNodeLabelFigure;
		}

		//		public Image createImage(String imagePath) {
		//		      try {
		//		          IFile res=(IFile)ResourcesPlugin.getWorkspace().getRoot().
		//		                               findMember(new Path(imagePath));
		//		          File file = new File(res.getRawLocation().toOSString());
		//		          return ImageDescriptor.createFromURL(file.toURI().toURL()).createImage();
		//		      }
		//		      catch (Exception ex) {
		//		          return unspecified;
		//		      }
		//		  }

	}

	/**
	 * @generated NOT
	 */
	static final Font FFIGUREROOTNODELABELFIGURE_FONT = new Font(
			Display.getCurrent(), Display.getDefault().getSystemFont()
					.getFontData()[0].getName(), 16, SWT.BOLD);

}
