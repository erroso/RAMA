/*
 * 
 */
package mmclass.diagram.part;

import mmclass.MindMapModel;
import mmclass.MmclassPackage;
import mmclass.diagram.edit.parts.AssociationEntity2EditPart;
import mmclass.diagram.edit.parts.AssociationEntityAssociationEntityAssociationsCompartment2EditPart;
import mmclass.diagram.edit.parts.AssociationEntityAssociationEntityAssociationsCompartmentEditPart;
import mmclass.diagram.edit.parts.AssociationEntityEditPart;
import mmclass.diagram.edit.parts.AssociationEntityNodeText2EditPart;
import mmclass.diagram.edit.parts.AssociationEntityNodeTextEditPart;
import mmclass.diagram.edit.parts.AttributeEditPart;
import mmclass.diagram.edit.parts.AttributeNodeTextEditPart;
import mmclass.diagram.edit.parts.ConstantEditPart;
import mmclass.diagram.edit.parts.ConstantNodeTextEditPart;
import mmclass.diagram.edit.parts.EdgeEditPart;
import mmclass.diagram.edit.parts.EdgeNameEditPart;
import mmclass.diagram.edit.parts.Entity2EditPart;
import mmclass.diagram.edit.parts.EntityEditPart;
import mmclass.diagram.edit.parts.EntityNodeText2EditPart;
import mmclass.diagram.edit.parts.EntityNodeTextEditPart;
import mmclass.diagram.edit.parts.EnumEditPart;
import mmclass.diagram.edit.parts.EnumNodeTextEditPart;
import mmclass.diagram.edit.parts.MindMapModelEditPart;
import mmclass.diagram.edit.parts.RootNodeEditPart;
import mmclass.diagram.edit.parts.RootNodeNodeTextEditPart;

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
public class MmclassVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "MindMapDomainModel.diagram/debug/visualID"; //$NON-NLS-1$

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
		return mmclass.diagram.part.MmclassVisualIDRegistry.getVisualID(view
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
				MmclassDiagramEditorPlugin.getInstance().logError(
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
		if (MmclassPackage.eINSTANCE.getMindMapModel().isSuperTypeOf(
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
		String containerModelID = mmclass.diagram.part.MmclassVisualIDRegistry
				.getModelID(containerView);
		if (!MindMapModelEditPart.MODEL_ID.equals(containerModelID)
				&& !"mdm".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (MindMapModelEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = mmclass.diagram.part.MmclassVisualIDRegistry
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
			if (MmclassPackage.eINSTANCE.getEnum().isSuperTypeOf(
					domainElement.eClass())) {
				return EnumEditPart.VISUAL_ID;
			}
			if (MmclassPackage.eINSTANCE.getAssociationEntity().isSuperTypeOf(
					domainElement.eClass())) {
				return AssociationEntityEditPart.VISUAL_ID;
			}
			if (MmclassPackage.eINSTANCE.getAttribute().isSuperTypeOf(
					domainElement.eClass())) {
				return AttributeEditPart.VISUAL_ID;
			}
			if (MmclassPackage.eINSTANCE.getRootNode().isSuperTypeOf(
					domainElement.eClass())) {
				return RootNodeEditPart.VISUAL_ID;
			}
			if (MmclassPackage.eINSTANCE.getConstant().isSuperTypeOf(
					domainElement.eClass())) {
				return ConstantEditPart.VISUAL_ID;
			}
			if (MmclassPackage.eINSTANCE.getEntity().isSuperTypeOf(
					domainElement.eClass())) {
				return EntityEditPart.VISUAL_ID;
			}
			break;
		case AssociationEntityAssociationEntityAssociationsCompartmentEditPart.VISUAL_ID:
			if (MmclassPackage.eINSTANCE.getAssociationEntity().isSuperTypeOf(
					domainElement.eClass())) {
				return AssociationEntity2EditPart.VISUAL_ID;
			}
			if (MmclassPackage.eINSTANCE.getEntity().isSuperTypeOf(
					domainElement.eClass())) {
				return Entity2EditPart.VISUAL_ID;
			}
			break;
		case AssociationEntityAssociationEntityAssociationsCompartment2EditPart.VISUAL_ID:
			if (MmclassPackage.eINSTANCE.getAssociationEntity().isSuperTypeOf(
					domainElement.eClass())) {
				return AssociationEntity2EditPart.VISUAL_ID;
			}
			if (MmclassPackage.eINSTANCE.getEntity().isSuperTypeOf(
					domainElement.eClass())) {
				return Entity2EditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = mmclass.diagram.part.MmclassVisualIDRegistry
				.getModelID(containerView);
		if (!MindMapModelEditPart.MODEL_ID.equals(containerModelID)
				&& !"mdm".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (MindMapModelEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = mmclass.diagram.part.MmclassVisualIDRegistry
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
			if (EnumEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AssociationEntityEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AttributeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RootNodeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConstantEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EntityEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EnumEditPart.VISUAL_ID:
			if (EnumNodeTextEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AssociationEntityEditPart.VISUAL_ID:
			if (AssociationEntityNodeTextEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AssociationEntityAssociationEntityAssociationsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AttributeEditPart.VISUAL_ID:
			if (AttributeNodeTextEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RootNodeEditPart.VISUAL_ID:
			if (RootNodeNodeTextEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ConstantEditPart.VISUAL_ID:
			if (ConstantNodeTextEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EntityEditPart.VISUAL_ID:
			if (EntityNodeTextEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AssociationEntity2EditPart.VISUAL_ID:
			if (AssociationEntityNodeText2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AssociationEntityAssociationEntityAssociationsCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Entity2EditPart.VISUAL_ID:
			if (EntityNodeText2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AssociationEntityAssociationEntityAssociationsCompartmentEditPart.VISUAL_ID:
			if (AssociationEntity2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Entity2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AssociationEntityAssociationEntityAssociationsCompartment2EditPart.VISUAL_ID:
			if (AssociationEntity2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Entity2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EdgeEditPart.VISUAL_ID:
			if (EdgeNameEditPart.VISUAL_ID == nodeVisualID) {
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
		if (MmclassPackage.eINSTANCE.getEdge().isSuperTypeOf(
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
		switch (visualID) {
		case AssociationEntityAssociationEntityAssociationsCompartmentEditPart.VISUAL_ID:
		case AssociationEntityAssociationEntityAssociationsCompartment2EditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case MindMapModelEditPart.VISUAL_ID:
			return false;
		case EnumEditPart.VISUAL_ID:
		case AttributeEditPart.VISUAL_ID:
		case RootNodeEditPart.VISUAL_ID:
		case ConstantEditPart.VISUAL_ID:
		case EntityEditPart.VISUAL_ID:
		case Entity2EditPart.VISUAL_ID:
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
			return mmclass.diagram.part.MmclassVisualIDRegistry
					.getVisualID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public String getModelID(View view) {
			return mmclass.diagram.part.MmclassVisualIDRegistry
					.getModelID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return mmclass.diagram.part.MmclassVisualIDRegistry
					.getNodeVisualID(containerView, domainElement);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return mmclass.diagram.part.MmclassVisualIDRegistry
					.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isCompartmentVisualID(int visualID) {
			return mmclass.diagram.part.MmclassVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isSemanticLeafVisualID(int visualID) {
			return mmclass.diagram.part.MmclassVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
