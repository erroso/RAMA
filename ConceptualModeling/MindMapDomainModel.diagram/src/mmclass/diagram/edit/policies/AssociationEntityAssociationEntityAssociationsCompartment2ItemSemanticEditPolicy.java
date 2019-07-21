/*
 * 
 */
package mmclass.diagram.edit.policies;

import mmclass.diagram.edit.commands.AssociationEntity2CreateCommand;
import mmclass.diagram.edit.commands.Entity2CreateCommand;
import mmclass.diagram.providers.MmclassElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class AssociationEntityAssociationEntityAssociationsCompartment2ItemSemanticEditPolicy
		extends MmclassBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public AssociationEntityAssociationEntityAssociationsCompartment2ItemSemanticEditPolicy() {
		super(MmclassElementTypes.AssociationEntity_3001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (MmclassElementTypes.AssociationEntity_3001 == req.getElementType()) {
			return getGEFWrapper(new AssociationEntity2CreateCommand(req));
		}
		if (MmclassElementTypes.Entity_3002 == req.getElementType()) {
			return getGEFWrapper(new Entity2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
