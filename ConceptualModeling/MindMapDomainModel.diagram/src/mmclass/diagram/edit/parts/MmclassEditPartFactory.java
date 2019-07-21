/*
 * 
 */
package mmclass.diagram.edit.parts;

import mmclass.diagram.part.MmclassVisualIDRegistry;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

/**
 * @generated
 */
public class MmclassEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (MmclassVisualIDRegistry.getVisualID(view)) {

			case MindMapModelEditPart.VISUAL_ID:
				return new MindMapModelEditPart(view);

			case EnumEditPart.VISUAL_ID:
				return new EnumEditPart(view);

			case EnumNodeTextEditPart.VISUAL_ID:
				return new EnumNodeTextEditPart(view);

			case AssociationEntityEditPart.VISUAL_ID:
				return new AssociationEntityEditPart(view);

			case AssociationEntityNodeTextEditPart.VISUAL_ID:
				return new AssociationEntityNodeTextEditPart(view);

			case AttributeEditPart.VISUAL_ID:
				return new AttributeEditPart(view);

			case AttributeNodeTextEditPart.VISUAL_ID:
				return new AttributeNodeTextEditPart(view);

			case RootNodeEditPart.VISUAL_ID:
				return new RootNodeEditPart(view);

			case RootNodeNodeTextEditPart.VISUAL_ID:
				return new RootNodeNodeTextEditPart(view);

			case ConstantEditPart.VISUAL_ID:
				return new ConstantEditPart(view);

			case ConstantNodeTextEditPart.VISUAL_ID:
				return new ConstantNodeTextEditPart(view);

			case EntityEditPart.VISUAL_ID:
				return new EntityEditPart(view);

			case EntityNodeTextEditPart.VISUAL_ID:
				return new EntityNodeTextEditPart(view);

			case AssociationEntity2EditPart.VISUAL_ID:
				return new AssociationEntity2EditPart(view);

			case AssociationEntityNodeText2EditPart.VISUAL_ID:
				return new AssociationEntityNodeText2EditPart(view);

			case Entity2EditPart.VISUAL_ID:
				return new Entity2EditPart(view);

			case EntityNodeText2EditPart.VISUAL_ID:
				return new EntityNodeText2EditPart(view);

			case AssociationEntityAssociationEntityAssociationsCompartmentEditPart.VISUAL_ID:
				return new AssociationEntityAssociationEntityAssociationsCompartmentEditPart(
						view);

			case AssociationEntityAssociationEntityAssociationsCompartment2EditPart.VISUAL_ID:
				return new AssociationEntityAssociationEntityAssociationsCompartment2EditPart(
						view);

			case EdgeEditPart.VISUAL_ID:
				return new EdgeEditPart(view);

			case EdgeNameEditPart.VISUAL_ID:
				return new EdgeNameEditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE
				.getTextCellEditorLocator(source);
	}

}
