/*
 * 
 */
package mmbdd.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import mmbdd.MmbddPackage;
import mmbdd.diagram.edit.parts.CenterEditPart;
import mmbdd.diagram.edit.parts.EdgeEditPart;
import mmbdd.diagram.edit.parts.LeafEditPart;
import mmbdd.diagram.edit.parts.MindMapModelEditPart;
import mmbdd.diagram.edit.parts.RelationshipEditPart;
import mmbdd.diagram.part.MmbddDiagramEditorPlugin;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;

/**
 * @generated
 */
public class MmbddElementTypes {

	/**
	 * @generated
	 */
	private MmbddElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static ImageRegistry imageRegistry;

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType MindMapModel_1000 = getElementType("mmbdd.diagram.MindMapModel_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Center_2004 = getElementType("mmbdd.diagram.Center_2004"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Relationship_2002 = getElementType("mmbdd.diagram.Relationship_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Leaf_2003 = getElementType("mmbdd.diagram.Leaf_2003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Edge_4001 = getElementType("mmbdd.diagram.Edge_4001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	private static ImageRegistry getImageRegistry() {
		if (imageRegistry == null) {
			imageRegistry = new ImageRegistry();
		}
		return imageRegistry;
	}

	/**
	 * @generated
	 */
	private static String getImageRegistryKey(ENamedElement element) {
		return element.getName();
	}

	/**
	 * @generated
	 */
	private static ImageDescriptor getProvidedImageDescriptor(
			ENamedElement element) {
		if (element instanceof EStructuralFeature) {
			EStructuralFeature feature = ((EStructuralFeature) element);
			EClass eContainingClass = feature.getEContainingClass();
			EClassifier eType = feature.getEType();
			if (eContainingClass != null && !eContainingClass.isAbstract()) {
				element = eContainingClass;
			} else if (eType instanceof EClass
					&& !((EClass) eType).isAbstract()) {
				element = eType;
			}
		}
		if (element instanceof EClass) {
			EClass eClass = (EClass) element;
			if (!eClass.isAbstract()) {
				return MmbddDiagramEditorPlugin.getInstance()
						.getItemImageDescriptor(
								eClass.getEPackage().getEFactoryInstance()
										.create(eClass));
			}
		}
		// TODO : support structural features
		return null;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		String key = getImageRegistryKey(element);
		ImageDescriptor imageDescriptor = getImageRegistry().getDescriptor(key);
		if (imageDescriptor == null) {
			imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
		}
		return imageDescriptor;
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		String key = getImageRegistryKey(element);
		Image image = getImageRegistry().get(key);
		if (image == null) {
			ImageDescriptor imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
			image = getImageRegistry().get(key);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImage(element);
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(MindMapModel_1000,
					MmbddPackage.eINSTANCE.getMindMapModel());

			elements.put(Center_2004, MmbddPackage.eINSTANCE.getCenter());

			elements.put(Relationship_2002,
					MmbddPackage.eINSTANCE.getRelationship());

			elements.put(Leaf_2003, MmbddPackage.eINSTANCE.getLeaf());

			elements.put(Edge_4001, MmbddPackage.eINSTANCE.getEdge());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(MindMapModel_1000);
			KNOWN_ELEMENT_TYPES.add(Center_2004);
			KNOWN_ELEMENT_TYPES.add(Relationship_2002);
			KNOWN_ELEMENT_TYPES.add(Leaf_2003);
			KNOWN_ELEMENT_TYPES.add(Edge_4001);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case MindMapModelEditPart.VISUAL_ID:
			return MindMapModel_1000;
		case CenterEditPart.VISUAL_ID:
			return Center_2004;
		case RelationshipEditPart.VISUAL_ID:
			return Relationship_2002;
		case LeafEditPart.VISUAL_ID:
			return Leaf_2003;
		case EdgeEditPart.VISUAL_ID:
			return Edge_4001;
		}
		return null;
	}

}
