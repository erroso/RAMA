/*
 * 
 */
package mmclass.diagram.providers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import mmclass.diagram.edit.parts.AssociationEntity2EditPart;
import mmclass.diagram.edit.parts.AssociationEntityEditPart;
import mmclass.diagram.edit.parts.AttributeEditPart;
import mmclass.diagram.edit.parts.ConstantEditPart;
import mmclass.diagram.edit.parts.Entity2EditPart;
import mmclass.diagram.edit.parts.EntityEditPart;
import mmclass.diagram.edit.parts.EnumEditPart;
import mmclass.diagram.edit.parts.MindMapModelEditPart;
import mmclass.diagram.edit.parts.RootNodeEditPart;
import mmclass.diagram.part.Messages;
import mmclass.diagram.part.MmclassDiagramEditorPlugin;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.modelingassistant.ModelingAssistantProvider;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;

/**
 * @generated
 */
public class MmclassModelingAssistantProvider extends ModelingAssistantProvider {

	/**
	 * @generated
	 */
	public List getTypesForPopupBar(IAdaptable host) {
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
		if (editPart instanceof MindMapModelEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(6);
			types.add(MmclassElementTypes.Enum_2001);
			types.add(MmclassElementTypes.AssociationEntity_2002);
			types.add(MmclassElementTypes.Attribute_2003);
			types.add(MmclassElementTypes.RootNode_2004);
			types.add(MmclassElementTypes.Constant_2006);
			types.add(MmclassElementTypes.Entity_2007);
			return types;
		}
		if (editPart instanceof AssociationEntityEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(MmclassElementTypes.AssociationEntity_3001);
			types.add(MmclassElementTypes.Entity_3002);
			return types;
		}
		if (editPart instanceof AssociationEntity2EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(MmclassElementTypes.AssociationEntity_3001);
			types.add(MmclassElementTypes.Entity_3002);
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof EnumEditPart) {
			return ((EnumEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof AssociationEntityEditPart) {
			return ((AssociationEntityEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof AttributeEditPart) {
			return ((AttributeEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof RootNodeEditPart) {
			return ((RootNodeEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof ConstantEditPart) {
			return ((ConstantEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof EntityEditPart) {
			return ((EntityEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof AssociationEntity2EditPart) {
			return ((AssociationEntity2EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Entity2EditPart) {
			return ((Entity2EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (targetEditPart instanceof EnumEditPart) {
			return ((EnumEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof AssociationEntityEditPart) {
			return ((AssociationEntityEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof AttributeEditPart) {
			return ((AttributeEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof RootNodeEditPart) {
			return ((RootNodeEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof ConstantEditPart) {
			return ((ConstantEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof EntityEditPart) {
			return ((EntityEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof AssociationEntity2EditPart) {
			return ((AssociationEntity2EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof Entity2EditPart) {
			return ((Entity2EditPart) targetEditPart).getMARelTypesOnTarget();
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSourceAndTarget(IAdaptable source,
			IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof EnumEditPart) {
			return ((EnumEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof AssociationEntityEditPart) {
			return ((AssociationEntityEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof AttributeEditPart) {
			return ((AttributeEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof RootNodeEditPart) {
			return ((RootNodeEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof ConstantEditPart) {
			return ((ConstantEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof EntityEditPart) {
			return ((EntityEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof AssociationEntity2EditPart) {
			return ((AssociationEntity2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Entity2EditPart) {
			return ((Entity2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForSource(IAdaptable target,
			IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (targetEditPart instanceof EnumEditPart) {
			return ((EnumEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof AssociationEntityEditPart) {
			return ((AssociationEntityEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof AttributeEditPart) {
			return ((AttributeEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof RootNodeEditPart) {
			return ((RootNodeEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof ConstantEditPart) {
			return ((ConstantEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof EntityEditPart) {
			return ((EntityEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof AssociationEntity2EditPart) {
			return ((AssociationEntity2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof Entity2EditPart) {
			return ((Entity2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForTarget(IAdaptable source,
			IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof EnumEditPart) {
			return ((EnumEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof AssociationEntityEditPart) {
			return ((AssociationEntityEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof AttributeEditPart) {
			return ((AttributeEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof RootNodeEditPart) {
			return ((RootNodeEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof ConstantEditPart) {
			return ((ConstantEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof EntityEditPart) {
			return ((EntityEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof AssociationEntity2EditPart) {
			return ((AssociationEntity2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Entity2EditPart) {
			return ((Entity2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForSource(IAdaptable target,
			IElementType relationshipType) {
		return selectExistingElement(target,
				getTypesForSource(target, relationshipType));
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForTarget(IAdaptable source,
			IElementType relationshipType) {
		return selectExistingElement(source,
				getTypesForTarget(source, relationshipType));
	}

	/**
	 * @generated
	 */
	protected EObject selectExistingElement(IAdaptable host, Collection types) {
		if (types.isEmpty()) {
			return null;
		}
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
		if (editPart == null) {
			return null;
		}
		Diagram diagram = (Diagram) editPart.getRoot().getContents().getModel();
		HashSet<EObject> elements = new HashSet<EObject>();
		for (Iterator<EObject> it = diagram.getElement().eAllContents(); it
				.hasNext();) {
			EObject element = it.next();
			if (isApplicableElement(element, types)) {
				elements.add(element);
			}
		}
		if (elements.isEmpty()) {
			return null;
		}
		return selectElement((EObject[]) elements.toArray(new EObject[elements
				.size()]));
	}

	/**
	 * @generated
	 */
	protected boolean isApplicableElement(EObject element, Collection types) {
		IElementType type = ElementTypeRegistry.getInstance().getElementType(element);
		return types.contains(type);
	}

	/**
	 * @generated
	 */
	protected EObject selectElement(EObject[] elements) {
		Shell shell = Display.getCurrent().getActiveShell();
		ILabelProvider labelProvider = new AdapterFactoryLabelProvider(
				MmclassDiagramEditorPlugin.getInstance()
						.getItemProvidersAdapterFactory());
		ElementListSelectionDialog dialog = new ElementListSelectionDialog(
				shell, labelProvider);
		dialog.setMessage(Messages.MmclassModelingAssistantProviderMessage);
		dialog.setTitle(Messages.MmclassModelingAssistantProviderTitle);
		dialog.setMultipleSelection(false);
		dialog.setElements(elements);
		EObject selected = null;
		if (dialog.open() == Window.OK) {
			selected = (EObject) dialog.getFirstResult();
		}
		return selected;
	}
}
