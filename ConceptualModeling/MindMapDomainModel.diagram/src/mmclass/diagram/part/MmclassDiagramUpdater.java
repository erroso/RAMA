/*
 * 
 */
package mmclass.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import mmclass.AssociationEntity;
import mmclass.Attribute;
import mmclass.Constant;
import mmclass.Edge;
import mmclass.Entity;
import mmclass.Enum;
import mmclass.FloatNode;
import mmclass.MindMapModel;
import mmclass.MmclassPackage;
import mmclass.Node;
import mmclass.RootNode;
import mmclass.diagram.edit.parts.AssociationEntity2EditPart;
import mmclass.diagram.edit.parts.AssociationEntityAssociationEntityAssociationsCompartment2EditPart;
import mmclass.diagram.edit.parts.AssociationEntityAssociationEntityAssociationsCompartmentEditPart;
import mmclass.diagram.edit.parts.AssociationEntityEditPart;
import mmclass.diagram.edit.parts.AttributeEditPart;
import mmclass.diagram.edit.parts.ConstantEditPart;
import mmclass.diagram.edit.parts.EdgeEditPart;
import mmclass.diagram.edit.parts.Entity2EditPart;
import mmclass.diagram.edit.parts.EntityEditPart;
import mmclass.diagram.edit.parts.EnumEditPart;
import mmclass.diagram.edit.parts.MindMapModelEditPart;
import mmclass.diagram.edit.parts.RootNodeEditPart;
import mmclass.diagram.providers.MmclassElementTypes;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

/**
 * @generated
 */
public class MmclassDiagramUpdater {

	/**
	 * @generated
	 */
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null
				|| view.getElement().eIsProxy();
	}

	/**
	 * @generated
	 */
	public static List<MmclassNodeDescriptor> getSemanticChildren(View view) {
		switch (MmclassVisualIDRegistry.getVisualID(view)) {
		case MindMapModelEditPart.VISUAL_ID:
			return getMindMapModel_1000SemanticChildren(view);
		case AssociationEntityAssociationEntityAssociationsCompartmentEditPart.VISUAL_ID:
			return getAssociationEntityAssociationEntityAssociationsCompartment_7001SemanticChildren(view);
		case AssociationEntityAssociationEntityAssociationsCompartment2EditPart.VISUAL_ID:
			return getAssociationEntityAssociationEntityAssociationsCompartment_7002SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MmclassNodeDescriptor> getMindMapModel_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		MindMapModel modelElement = (MindMapModel) view.getElement();
		LinkedList<MmclassNodeDescriptor> result = new LinkedList<MmclassNodeDescriptor>();
		for (Iterator<?> it = modelElement.getNodes().iterator(); it.hasNext();) {
			Node childElement = (Node) it.next();
			int visualID = MmclassVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == EnumEditPart.VISUAL_ID) {
				result.add(new MmclassNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AssociationEntityEditPart.VISUAL_ID) {
				result.add(new MmclassNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AttributeEditPart.VISUAL_ID) {
				result.add(new MmclassNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RootNodeEditPart.VISUAL_ID) {
				result.add(new MmclassNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ConstantEditPart.VISUAL_ID) {
				result.add(new MmclassNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == EntityEditPart.VISUAL_ID) {
				result.add(new MmclassNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MmclassNodeDescriptor> getAssociationEntityAssociationEntityAssociationsCompartment_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		AssociationEntity modelElement = (AssociationEntity) containerView
				.getElement();
		LinkedList<MmclassNodeDescriptor> result = new LinkedList<MmclassNodeDescriptor>();
		for (Iterator<?> it = modelElement.getAssociations().iterator(); it
				.hasNext();) {
			Entity childElement = (Entity) it.next();
			int visualID = MmclassVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == AssociationEntity2EditPart.VISUAL_ID) {
				result.add(new MmclassNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Entity2EditPart.VISUAL_ID) {
				result.add(new MmclassNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MmclassNodeDescriptor> getAssociationEntityAssociationEntityAssociationsCompartment_7002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		AssociationEntity modelElement = (AssociationEntity) containerView
				.getElement();
		LinkedList<MmclassNodeDescriptor> result = new LinkedList<MmclassNodeDescriptor>();
		for (Iterator<?> it = modelElement.getAssociations().iterator(); it
				.hasNext();) {
			Entity childElement = (Entity) it.next();
			int visualID = MmclassVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == AssociationEntity2EditPart.VISUAL_ID) {
				result.add(new MmclassNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Entity2EditPart.VISUAL_ID) {
				result.add(new MmclassNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MmclassLinkDescriptor> getContainedLinks(View view) {
		switch (MmclassVisualIDRegistry.getVisualID(view)) {
		case MindMapModelEditPart.VISUAL_ID:
			return getMindMapModel_1000ContainedLinks(view);
		case EnumEditPart.VISUAL_ID:
			return getEnum_2001ContainedLinks(view);
		case AssociationEntityEditPart.VISUAL_ID:
			return getAssociationEntity_2002ContainedLinks(view);
		case AttributeEditPart.VISUAL_ID:
			return getAttribute_2003ContainedLinks(view);
		case RootNodeEditPart.VISUAL_ID:
			return getRootNode_2004ContainedLinks(view);
		case ConstantEditPart.VISUAL_ID:
			return getConstant_2006ContainedLinks(view);
		case EntityEditPart.VISUAL_ID:
			return getEntity_2007ContainedLinks(view);
		case AssociationEntity2EditPart.VISUAL_ID:
			return getAssociationEntity_3001ContainedLinks(view);
		case Entity2EditPart.VISUAL_ID:
			return getEntity_3002ContainedLinks(view);
		case EdgeEditPart.VISUAL_ID:
			return getEdge_4001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MmclassLinkDescriptor> getIncomingLinks(View view) {
		switch (MmclassVisualIDRegistry.getVisualID(view)) {
		case EnumEditPart.VISUAL_ID:
			return getEnum_2001IncomingLinks(view);
		case AssociationEntityEditPart.VISUAL_ID:
			return getAssociationEntity_2002IncomingLinks(view);
		case AttributeEditPart.VISUAL_ID:
			return getAttribute_2003IncomingLinks(view);
		case RootNodeEditPart.VISUAL_ID:
			return getRootNode_2004IncomingLinks(view);
		case ConstantEditPart.VISUAL_ID:
			return getConstant_2006IncomingLinks(view);
		case EntityEditPart.VISUAL_ID:
			return getEntity_2007IncomingLinks(view);
		case AssociationEntity2EditPart.VISUAL_ID:
			return getAssociationEntity_3001IncomingLinks(view);
		case Entity2EditPart.VISUAL_ID:
			return getEntity_3002IncomingLinks(view);
		case EdgeEditPart.VISUAL_ID:
			return getEdge_4001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MmclassLinkDescriptor> getOutgoingLinks(View view) {
		switch (MmclassVisualIDRegistry.getVisualID(view)) {
		case EnumEditPart.VISUAL_ID:
			return getEnum_2001OutgoingLinks(view);
		case AssociationEntityEditPart.VISUAL_ID:
			return getAssociationEntity_2002OutgoingLinks(view);
		case AttributeEditPart.VISUAL_ID:
			return getAttribute_2003OutgoingLinks(view);
		case RootNodeEditPart.VISUAL_ID:
			return getRootNode_2004OutgoingLinks(view);
		case ConstantEditPart.VISUAL_ID:
			return getConstant_2006OutgoingLinks(view);
		case EntityEditPart.VISUAL_ID:
			return getEntity_2007OutgoingLinks(view);
		case AssociationEntity2EditPart.VISUAL_ID:
			return getAssociationEntity_3001OutgoingLinks(view);
		case Entity2EditPart.VISUAL_ID:
			return getEntity_3002OutgoingLinks(view);
		case EdgeEditPart.VISUAL_ID:
			return getEdge_4001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MmclassLinkDescriptor> getMindMapModel_1000ContainedLinks(
			View view) {
		MindMapModel modelElement = (MindMapModel) view.getElement();
		LinkedList<MmclassLinkDescriptor> result = new LinkedList<MmclassLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Edge_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MmclassLinkDescriptor> getEnum_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MmclassLinkDescriptor> getAssociationEntity_2002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MmclassLinkDescriptor> getAttribute_2003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MmclassLinkDescriptor> getRootNode_2004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MmclassLinkDescriptor> getConstant_2006ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MmclassLinkDescriptor> getEntity_2007ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MmclassLinkDescriptor> getAssociationEntity_3001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MmclassLinkDescriptor> getEntity_3002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MmclassLinkDescriptor> getEdge_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MmclassLinkDescriptor> getEnum_2001IncomingLinks(
			View view) {
		Enum modelElement = (Enum) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<MmclassLinkDescriptor> result = new LinkedList<MmclassLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Edge_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MmclassLinkDescriptor> getAssociationEntity_2002IncomingLinks(
			View view) {
		AssociationEntity modelElement = (AssociationEntity) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<MmclassLinkDescriptor> result = new LinkedList<MmclassLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Edge_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MmclassLinkDescriptor> getAttribute_2003IncomingLinks(
			View view) {
		Attribute modelElement = (Attribute) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<MmclassLinkDescriptor> result = new LinkedList<MmclassLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Edge_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MmclassLinkDescriptor> getRootNode_2004IncomingLinks(
			View view) {
		RootNode modelElement = (RootNode) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<MmclassLinkDescriptor> result = new LinkedList<MmclassLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Edge_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MmclassLinkDescriptor> getConstant_2006IncomingLinks(
			View view) {
		Constant modelElement = (Constant) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<MmclassLinkDescriptor> result = new LinkedList<MmclassLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Edge_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MmclassLinkDescriptor> getEntity_2007IncomingLinks(
			View view) {
		Entity modelElement = (Entity) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<MmclassLinkDescriptor> result = new LinkedList<MmclassLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Edge_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MmclassLinkDescriptor> getAssociationEntity_3001IncomingLinks(
			View view) {
		AssociationEntity modelElement = (AssociationEntity) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<MmclassLinkDescriptor> result = new LinkedList<MmclassLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Edge_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MmclassLinkDescriptor> getEntity_3002IncomingLinks(
			View view) {
		Entity modelElement = (Entity) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<MmclassLinkDescriptor> result = new LinkedList<MmclassLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Edge_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MmclassLinkDescriptor> getEdge_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MmclassLinkDescriptor> getEnum_2001OutgoingLinks(
			View view) {
		Enum modelElement = (Enum) view.getElement();
		LinkedList<MmclassLinkDescriptor> result = new LinkedList<MmclassLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Edge_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MmclassLinkDescriptor> getAssociationEntity_2002OutgoingLinks(
			View view) {
		AssociationEntity modelElement = (AssociationEntity) view.getElement();
		LinkedList<MmclassLinkDescriptor> result = new LinkedList<MmclassLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Edge_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MmclassLinkDescriptor> getAttribute_2003OutgoingLinks(
			View view) {
		Attribute modelElement = (Attribute) view.getElement();
		LinkedList<MmclassLinkDescriptor> result = new LinkedList<MmclassLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Edge_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MmclassLinkDescriptor> getRootNode_2004OutgoingLinks(
			View view) {
		RootNode modelElement = (RootNode) view.getElement();
		LinkedList<MmclassLinkDescriptor> result = new LinkedList<MmclassLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Edge_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MmclassLinkDescriptor> getConstant_2006OutgoingLinks(
			View view) {
		Constant modelElement = (Constant) view.getElement();
		LinkedList<MmclassLinkDescriptor> result = new LinkedList<MmclassLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Edge_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MmclassLinkDescriptor> getEntity_2007OutgoingLinks(
			View view) {
		Entity modelElement = (Entity) view.getElement();
		LinkedList<MmclassLinkDescriptor> result = new LinkedList<MmclassLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Edge_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MmclassLinkDescriptor> getAssociationEntity_3001OutgoingLinks(
			View view) {
		AssociationEntity modelElement = (AssociationEntity) view.getElement();
		LinkedList<MmclassLinkDescriptor> result = new LinkedList<MmclassLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Edge_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MmclassLinkDescriptor> getEntity_3002OutgoingLinks(
			View view) {
		Entity modelElement = (Entity) view.getElement();
		LinkedList<MmclassLinkDescriptor> result = new LinkedList<MmclassLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Edge_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MmclassLinkDescriptor> getEdge_4001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<MmclassLinkDescriptor> getContainedTypeModelFacetLinks_Edge_4001(
			MindMapModel container) {
		LinkedList<MmclassLinkDescriptor> result = new LinkedList<MmclassLinkDescriptor>();
		for (Iterator<?> links = container.getEdges().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Edge) {
				continue;
			}
			Edge link = (Edge) linkObject;
			if (EdgeEditPart.VISUAL_ID != MmclassVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Node dst = link.getTarget();
			Node src = link.getSource();
			result.add(new MmclassLinkDescriptor(src, dst, link,
					MmclassElementTypes.Edge_4001, EdgeEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<MmclassLinkDescriptor> getIncomingTypeModelFacetLinks_Edge_4001(
			Node target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<MmclassLinkDescriptor> result = new LinkedList<MmclassLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != MmclassPackage.eINSTANCE
					.getEdge_Target()
					|| false == setting.getEObject() instanceof Edge) {
				continue;
			}
			Edge link = (Edge) setting.getEObject();
			if (EdgeEditPart.VISUAL_ID != MmclassVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Node src = link.getSource();
			result.add(new MmclassLinkDescriptor(src, target, link,
					MmclassElementTypes.Edge_4001, EdgeEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<MmclassLinkDescriptor> getOutgoingTypeModelFacetLinks_Edge_4001(
			Node source) {
		MindMapModel container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof MindMapModel) {
				container = (MindMapModel) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<MmclassLinkDescriptor> result = new LinkedList<MmclassLinkDescriptor>();
		for (Iterator<?> links = container.getEdges().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Edge) {
				continue;
			}
			Edge link = (Edge) linkObject;
			if (EdgeEditPart.VISUAL_ID != MmclassVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Node dst = link.getTarget();
			Node src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new MmclassLinkDescriptor(src, dst, link,
					MmclassElementTypes.Edge_4001, EdgeEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		 * @generated
		 */
		@Override
		public List<MmclassNodeDescriptor> getSemanticChildren(View view) {
			return MmclassDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<MmclassLinkDescriptor> getContainedLinks(View view) {
			return MmclassDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<MmclassLinkDescriptor> getIncomingLinks(View view) {
			return MmclassDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<MmclassLinkDescriptor> getOutgoingLinks(View view) {
			return MmclassDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
