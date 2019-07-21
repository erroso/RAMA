/*
 * 
 */
package mmbdd.diagram.edit.policies;

import mmbdd.diagram.edit.commands.CenterCreateCommand;
import mmbdd.diagram.edit.commands.LeafCreateCommand;
import mmbdd.diagram.edit.commands.RelationshipCreateCommand;
import mmbdd.diagram.providers.MmbddElementTypes;

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
		MmbddBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public MindMapModelItemSemanticEditPolicy() {
		super(MmbddElementTypes.MindMapModel_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (MmbddElementTypes.Center_2004 == req.getElementType()) {
			return getGEFWrapper(new CenterCreateCommand(req));
		}
		if (MmbddElementTypes.Relationship_2002 == req.getElementType()) {
			return getGEFWrapper(new RelationshipCreateCommand(req));
		}
		if (MmbddElementTypes.Leaf_2003 == req.getElementType()) {
			return getGEFWrapper(new LeafCreateCommand(req));
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
