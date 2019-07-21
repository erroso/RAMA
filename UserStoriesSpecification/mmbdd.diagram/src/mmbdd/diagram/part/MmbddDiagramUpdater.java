/*
 * 
 */
package mmbdd.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import mmbdd.Center;
import mmbdd.Edge;
import mmbdd.Leaf;
import mmbdd.MindMapModel;
import mmbdd.MmbddPackage;
import mmbdd.Node;
import mmbdd.Relationship;
import mmbdd.diagram.edit.parts.CenterEditPart;
import mmbdd.diagram.edit.parts.EdgeEditPart;
import mmbdd.diagram.edit.parts.LeafEditPart;
import mmbdd.diagram.edit.parts.MindMapModelEditPart;
import mmbdd.diagram.edit.parts.RelationshipEditPart;
import mmbdd.diagram.providers.MmbddElementTypes;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

/**
 * @generated
 */
public class MmbddDiagramUpdater {

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
	public static List<MmbddNodeDescriptor> getSemanticChildren(View view) {
		switch (MmbddVisualIDRegistry.getVisualID(view)) {
		case MindMapModelEditPart.VISUAL_ID:
			return getMindMapModel_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MmbddNodeDescriptor> getMindMapModel_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		MindMapModel modelElement = (MindMapModel) view.getElement();
		LinkedList<MmbddNodeDescriptor> result = new LinkedList<MmbddNodeDescriptor>();
		for (Iterator<?> it = modelElement.getNodes().iterator(); it.hasNext();) {
			Node childElement = (Node) it.next();
			int visualID = MmbddVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == CenterEditPart.VISUAL_ID) {
				result.add(new MmbddNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RelationshipEditPart.VISUAL_ID) {
				result.add(new MmbddNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LeafEditPart.VISUAL_ID) {
				result.add(new MmbddNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MmbddLinkDescriptor> getContainedLinks(View view) {
		switch (MmbddVisualIDRegistry.getVisualID(view)) {
		case MindMapModelEditPart.VISUAL_ID:
			return getMindMapModel_1000ContainedLinks(view);
		case CenterEditPart.VISUAL_ID:
			return getCenter_2004ContainedLinks(view);
		case RelationshipEditPart.VISUAL_ID:
			return getRelationship_2002ContainedLinks(view);
		case LeafEditPart.VISUAL_ID:
			return getLeaf_2003ContainedLinks(view);
		case EdgeEditPart.VISUAL_ID:
			return getEdge_4001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MmbddLinkDescriptor> getIncomingLinks(View view) {
		switch (MmbddVisualIDRegistry.getVisualID(view)) {
		case CenterEditPart.VISUAL_ID:
			return getCenter_2004IncomingLinks(view);
		case RelationshipEditPart.VISUAL_ID:
			return getRelationship_2002IncomingLinks(view);
		case LeafEditPart.VISUAL_ID:
			return getLeaf_2003IncomingLinks(view);
		case EdgeEditPart.VISUAL_ID:
			return getEdge_4001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MmbddLinkDescriptor> getOutgoingLinks(View view) {
		switch (MmbddVisualIDRegistry.getVisualID(view)) {
		case CenterEditPart.VISUAL_ID:
			return getCenter_2004OutgoingLinks(view);
		case RelationshipEditPart.VISUAL_ID:
			return getRelationship_2002OutgoingLinks(view);
		case LeafEditPart.VISUAL_ID:
			return getLeaf_2003OutgoingLinks(view);
		case EdgeEditPart.VISUAL_ID:
			return getEdge_4001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MmbddLinkDescriptor> getMindMapModel_1000ContainedLinks(
			View view) {
		MindMapModel modelElement = (MindMapModel) view.getElement();
		LinkedList<MmbddLinkDescriptor> result = new LinkedList<MmbddLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Edge_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MmbddLinkDescriptor> getCenter_2004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MmbddLinkDescriptor> getRelationship_2002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MmbddLinkDescriptor> getLeaf_2003ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MmbddLinkDescriptor> getEdge_4001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MmbddLinkDescriptor> getCenter_2004IncomingLinks(
			View view) {
		Center modelElement = (Center) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<MmbddLinkDescriptor> result = new LinkedList<MmbddLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Edge_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MmbddLinkDescriptor> getRelationship_2002IncomingLinks(
			View view) {
		Relationship modelElement = (Relationship) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<MmbddLinkDescriptor> result = new LinkedList<MmbddLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Edge_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MmbddLinkDescriptor> getLeaf_2003IncomingLinks(View view) {
		Leaf modelElement = (Leaf) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<MmbddLinkDescriptor> result = new LinkedList<MmbddLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Edge_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MmbddLinkDescriptor> getEdge_4001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MmbddLinkDescriptor> getCenter_2004OutgoingLinks(
			View view) {
		Center modelElement = (Center) view.getElement();
		LinkedList<MmbddLinkDescriptor> result = new LinkedList<MmbddLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Edge_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MmbddLinkDescriptor> getRelationship_2002OutgoingLinks(
			View view) {
		Relationship modelElement = (Relationship) view.getElement();
		LinkedList<MmbddLinkDescriptor> result = new LinkedList<MmbddLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Edge_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MmbddLinkDescriptor> getLeaf_2003OutgoingLinks(View view) {
		Leaf modelElement = (Leaf) view.getElement();
		LinkedList<MmbddLinkDescriptor> result = new LinkedList<MmbddLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Edge_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MmbddLinkDescriptor> getEdge_4001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<MmbddLinkDescriptor> getContainedTypeModelFacetLinks_Edge_4001(
			MindMapModel container) {
		LinkedList<MmbddLinkDescriptor> result = new LinkedList<MmbddLinkDescriptor>();
		for (Iterator<?> links = container.getEdges().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Edge) {
				continue;
			}
			Edge link = (Edge) linkObject;
			if (EdgeEditPart.VISUAL_ID != MmbddVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Node dst = link.getTarget();
			Node src = link.getSource();
			result.add(new MmbddLinkDescriptor(src, dst, link,
					MmbddElementTypes.Edge_4001, EdgeEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<MmbddLinkDescriptor> getIncomingTypeModelFacetLinks_Edge_4001(
			Node target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<MmbddLinkDescriptor> result = new LinkedList<MmbddLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != MmbddPackage.eINSTANCE
					.getEdge_Target()
					|| false == setting.getEObject() instanceof Edge) {
				continue;
			}
			Edge link = (Edge) setting.getEObject();
			if (EdgeEditPart.VISUAL_ID != MmbddVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Node src = link.getSource();
			result.add(new MmbddLinkDescriptor(src, target, link,
					MmbddElementTypes.Edge_4001, EdgeEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<MmbddLinkDescriptor> getOutgoingTypeModelFacetLinks_Edge_4001(
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
		LinkedList<MmbddLinkDescriptor> result = new LinkedList<MmbddLinkDescriptor>();
		for (Iterator<?> links = container.getEdges().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Edge) {
				continue;
			}
			Edge link = (Edge) linkObject;
			if (EdgeEditPart.VISUAL_ID != MmbddVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Node dst = link.getTarget();
			Node src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new MmbddLinkDescriptor(src, dst, link,
					MmbddElementTypes.Edge_4001, EdgeEditPart.VISUAL_ID));
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
		public List<MmbddNodeDescriptor> getSemanticChildren(View view) {
			return MmbddDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<MmbddLinkDescriptor> getContainedLinks(View view) {
			return MmbddDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<MmbddLinkDescriptor> getIncomingLinks(View view) {
			return MmbddDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<MmbddLinkDescriptor> getOutgoingLinks(View view) {
			return MmbddDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
