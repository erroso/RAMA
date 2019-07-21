/*
 * 
 */
package mmbdd.diagram.edit.parts;

import mmbdd.diagram.part.MmbddVisualIDRegistry;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

/**
 * @generated
 */
public class MmbddEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (MmbddVisualIDRegistry.getVisualID(view)) {

			case MindMapModelEditPart.VISUAL_ID:
				return new MindMapModelEditPart(view);

			case CenterEditPart.VISUAL_ID:
				return new CenterEditPart(view);

			case CenterNodeTextEditPart.VISUAL_ID:
				return new CenterNodeTextEditPart(view);

			case RelationshipEditPart.VISUAL_ID:
				return new RelationshipEditPart(view);

			case RelationshipNodeTextEditPart.VISUAL_ID:
				return new RelationshipNodeTextEditPart(view);

			case LeafEditPart.VISUAL_ID:
				return new LeafEditPart(view);

			case LeafNodeTextEditPart.VISUAL_ID:
				return new LeafNodeTextEditPart(view);

			case EdgeEditPart.VISUAL_ID:
				return new EdgeEditPart(view);

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
