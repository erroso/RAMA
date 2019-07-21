/*
 * 
 */
package mmclass.diagram.edit.policies;

import java.util.Iterator;

import mmclass.diagram.edit.parts.AttributeEditPart;
import mmclass.diagram.edit.parts.EdgeEditPart;
import mmclass.diagram.part.MmclassVisualIDRegistry;
import mmclass.diagram.providers.MmclassElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class EdgeItemSemanticEditPolicy extends
		MmclassBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public EdgeItemSemanticEditPolicy() {
		super(MmclassElementTypes.Edge_4001);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
