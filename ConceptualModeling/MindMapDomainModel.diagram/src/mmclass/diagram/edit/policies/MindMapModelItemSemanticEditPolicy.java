/*
 * 
 */
package mmclass.diagram.edit.policies;

import mmclass.diagram.edit.commands.AssociationEntityCreateCommand;
import mmclass.diagram.edit.commands.AttributeCreateCommand;
import mmclass.diagram.edit.commands.ConstantCreateCommand;
import mmclass.diagram.edit.commands.EntityCreateCommand;
import mmclass.diagram.edit.commands.EnumCreateCommand;
import mmclass.diagram.edit.commands.FloatNodeCreateCommand;
import mmclass.diagram.edit.commands.RootNodeCreateCommand;
import mmclass.diagram.providers.MmclassElementTypes;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

/**
 * @generated
 */
public class MindMapModelItemSemanticEditPolicy extends
		MmclassBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public MindMapModelItemSemanticEditPolicy() {
		super(MmclassElementTypes.MindMapModel_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (MmclassElementTypes.Enum_2001 == req.getElementType()) {
			return getGEFWrapper(new EnumCreateCommand(req));
		}
		if (MmclassElementTypes.AssociationEntity_2002 == req.getElementType()) {
			return getGEFWrapper(new AssociationEntityCreateCommand(req));
		}
		if (MmclassElementTypes.Attribute_2003 == req.getElementType()) {
			return getGEFWrapper(new AttributeCreateCommand(req));
		}
		if (MmclassElementTypes.RootNode_2004 == req.getElementType()) {
			return getGEFWrapper(new RootNodeCreateCommand(req));
		}
		if (MmclassElementTypes.Constant_2006 == req.getElementType()) {
			return getGEFWrapper(new ConstantCreateCommand(req));
		}
		if (MmclassElementTypes.Entity_2007 == req.getElementType()) {
			return getGEFWrapper(new EntityCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
				.getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	 * @generated
	 */
	private static class DuplicateAnythingCommand extends
			DuplicateEObjectsCommand {

		/**
		 * @generated
		 */
		public DuplicateAnythingCommand(
				TransactionalEditingDomain editingDomain,
				DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req
					.getElementsToBeDuplicated(), req
					.getAllDuplicatedElementsMap());
		}

	}

}
