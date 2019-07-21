/*
 * 
 */
package mmbdd.diagram.part;

import mmbdd.MindMapModel;
import mmbdd.MmbddPackage;
import mmbdd.diagram.edit.parts.CenterEditPart;
import mmbdd.diagram.edit.parts.CenterNodeTextEditPart;
import mmbdd.diagram.edit.parts.EdgeEditPart;
import mmbdd.diagram.edit.parts.LeafEditPart;
import mmbdd.diagram.edit.parts.LeafNodeTextEditPart;
import mmbdd.diagram.edit.parts.MindMapModelEditPart;
import mmbdd.diagram.edit.parts.RelationshipEditPart;
import mmbdd.diagram.edit.parts.RelationshipNodeTextEditPart;

import mmbdd.diagram.edit.parts.WrappingLabelEditPart;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class MmbddVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "mmbdd.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (MindMapModelEditPart.MODEL_ID.equals(view.getType())) {
				return MindMapModelEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return mmbdd.diagram.part.MmbddVisualIDRegistry.getVisualID(view
				.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				MmbddDiagramEditorPlugin.getInstance().logError(
						"Unable to parse view type as a visualID number: "
								+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (MmbddPackage.eINSTANCE.getMindMapModel().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((MindMapModel) domainElement)) {
			return MindMapModelEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = mmbdd.diagram.part.MmbddVisualIDRegistry
				.getModelID(containerView);
		if (!MindMapModelEditPart.MODEL_ID.equals(containerModelID)
				&& !"mmbdd".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (MindMapModelEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = mmbdd.diagram.part.MmbddVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = MindMapModelEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case MindMapModelEditPart.VISUAL_ID:
			if (MmbddPackage.eINSTANCE.getCenter().isSuperTypeOf(
					domainElement.eClass())) {
				return CenterEditPart.VISUAL_ID;
			}
			if (MmbddPackage.eINSTANCE.getRelationship().isSuperTypeOf(
					domainElement.eClass())) {
				return RelationshipEditPart.VISUAL_ID;
			}
			if (MmbddPackage.eINSTANCE.getLeaf().isSuperTypeOf(
					domainElement.eClass())) {
				return LeafEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = mmbdd.diagram.part.MmbddVisualIDRegistry
				.getModelID(containerView);
		if (!MindMapModelEditPart.MODEL_ID.equals(containerModelID)
				&& !"mmbdd".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (MindMapModelEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = mmbdd.diagram.part.MmbddVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = MindMapModelEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case MindMapModelEditPart.VISUAL_ID:
			if (CenterEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RelationshipEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LeafEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CenterEditPart.VISUAL_ID:
			if (CenterNodeTextEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RelationshipEditPart.VISUAL_ID:
			if (RelationshipNodeTextEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case LeafEditPart.VISUAL_ID:
			if (LeafNodeTextEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (MmbddPackage.eINSTANCE.getEdge().isSuperTypeOf(
				domainElement.eClass())) {
			return EdgeEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(MindMapModel element) {
		return true;
	}

	/**
	 * @generated
	 */
	public static boolean checkNodeVisualID(View containerView,
			EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	 * @generated
	 */
	public static boolean isCompartmentVisualID(int visualID) {
		return false;
	}

	/**
	 * @generated
	 */
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case MindMapModelEditPart.VISUAL_ID:
			return false;
		case RelationshipEditPart.VISUAL_ID:
		case LeafEditPart.VISUAL_ID:
		case CenterEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		 * @generated
		 */
		@Override
		public int getVisualID(View view) {
			return mmbdd.diagram.part.MmbddVisualIDRegistry.getVisualID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public String getModelID(View view) {
			return mmbdd.diagram.part.MmbddVisualIDRegistry.getModelID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return mmbdd.diagram.part.MmbddVisualIDRegistry.getNodeVisualID(
					containerView, domainElement);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return mmbdd.diagram.part.MmbddVisualIDRegistry.checkNodeVisualID(
					containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isCompartmentVisualID(int visualID) {
			return mmbdd.diagram.part.MmbddVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isSemanticLeafVisualID(int visualID) {
			return mmbdd.diagram.part.MmbddVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
