/*
 * 
 */
package mmclass.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import mmclass.MmclassPackage;
import mmclass.diagram.edit.parts.AssociationEntity2EditPart;
import mmclass.diagram.edit.parts.AssociationEntityEditPart;
import mmclass.diagram.edit.parts.AttributeEditPart;
import mmclass.diagram.edit.parts.ConstantEditPart;
import mmclass.diagram.edit.parts.EdgeEditPart;
import mmclass.diagram.edit.parts.Entity2EditPart;
import mmclass.diagram.edit.parts.EntityEditPart;
import mmclass.diagram.edit.parts.EnumEditPart;
import mmclass.diagram.edit.parts.MindMapModelEditPart;
import mmclass.diagram.edit.parts.RootNodeEditPart;
import mmclass.diagram.part.MmclassDiagramEditorPlugin;

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
public class MmclassElementTypes {

	/**
	 * @generated
	 */
	private MmclassElementTypes() {
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
	public static final IElementType MindMapModel_1000 = getElementType("MindMapDomainModel.diagram.MindMapModel_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Enum_2001 = getElementType("MindMapDomainModel.diagram.Enum_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType AssociationEntity_2002 = getElementType("MindMapDomainModel.diagram.AssociationEntity_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Attribute_2003 = getElementType("MindMapDomainModel.diagram.Attribute_2003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RootNode_2004 = getElementType("MindMapDomainModel.diagram.RootNode_2004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Constant_2006 = getElementType("MindMapDomainModel.diagram.Constant_2006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Entity_2007 = getElementType("MindMapDomainModel.diagram.Entity_2007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType AssociationEntity_3001 = getElementType("MindMapDomainModel.diagram.AssociationEntity_3001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Entity_3002 = getElementType("MindMapDomainModel.diagram.Entity_3002"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Edge_4001 = getElementType("MindMapDomainModel.diagram.Edge_4001"); //$NON-NLS-1$

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
				return MmclassDiagramEditorPlugin.getInstance()
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
					MmclassPackage.eINSTANCE.getMindMapModel());

			elements.put(Enum_2001, MmclassPackage.eINSTANCE.getEnum());

			elements.put(AssociationEntity_2002,
					MmclassPackage.eINSTANCE.getAssociationEntity());

			elements.put(Attribute_2003,
					MmclassPackage.eINSTANCE.getAttribute());

			elements.put(RootNode_2004, MmclassPackage.eINSTANCE.getRootNode());

			elements.put(Constant_2006, MmclassPackage.eINSTANCE.getConstant());

			elements.put(Entity_2007, MmclassPackage.eINSTANCE.getEntity());

			elements.put(AssociationEntity_3001,
					MmclassPackage.eINSTANCE.getAssociationEntity());

			elements.put(Entity_3002, MmclassPackage.eINSTANCE.getEntity());

			elements.put(Edge_4001, MmclassPackage.eINSTANCE.getEdge());
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
			KNOWN_ELEMENT_TYPES.add(Enum_2001);
			KNOWN_ELEMENT_TYPES.add(AssociationEntity_2002);
			KNOWN_ELEMENT_TYPES.add(Attribute_2003);
			KNOWN_ELEMENT_TYPES.add(RootNode_2004);
			KNOWN_ELEMENT_TYPES.add(Constant_2006);
			KNOWN_ELEMENT_TYPES.add(Entity_2007);
			KNOWN_ELEMENT_TYPES.add(AssociationEntity_3001);
			KNOWN_ELEMENT_TYPES.add(Entity_3002);
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
		case EnumEditPart.VISUAL_ID:
			return Enum_2001;
		case AssociationEntityEditPart.VISUAL_ID:
			return AssociationEntity_2002;
		case AttributeEditPart.VISUAL_ID:
			return Attribute_2003;
		case RootNodeEditPart.VISUAL_ID:
			return RootNode_2004;
		case ConstantEditPart.VISUAL_ID:
			return Constant_2006;
		case EntityEditPart.VISUAL_ID:
			return Entity_2007;
		case AssociationEntity2EditPart.VISUAL_ID:
			return AssociationEntity_3001;
		case Entity2EditPart.VISUAL_ID:
			return Entity_3002;
		case EdgeEditPart.VISUAL_ID:
			return Edge_4001;
		}
		return null;
	}

}
