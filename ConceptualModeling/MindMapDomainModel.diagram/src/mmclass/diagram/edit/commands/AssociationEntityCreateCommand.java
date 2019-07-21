/*
 * 
 */
package mmclass.diagram.edit.commands;

import mmclass.AssociationEntity;
import mmclass.Entity;
import mmclass.MindMapModel;
import mmclass.MmclassFactory;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class AssociationEntityCreateCommand extends EditElementCommand {

	/**
	 * @generated
	 */
	public AssociationEntityCreateCommand(CreateElementRequest req) {
		super(req.getLabel(), null, req);
	}

	/**
	 * FIXME: replace with setElementToEdit()
	 * @generated
	 */
	protected EObject getElementToEdit() {
		EObject container = ((CreateElementRequest) getRequest())
				.getContainer();
		if (container instanceof View) {
			container = ((View) container).getElement();
		}
		return container;
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		return true;

	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		AssociationEntity newElement = MmclassFactory.eINSTANCE
				.createAssociationEntity();

		MindMapModel owner = (MindMapModel) getElementToEdit();
		owner.getNodes().add(newElement);

		doConfigure(newElement, monitor, info);

		((CreateElementRequest) getRequest()).setNewElement(newElement);
		return CommandResult.newOKCommandResult(newElement);
	}

	/**
	 * @generated NOT
	 */
	protected void doConfigure(AssociationEntity newElement,
			IProgressMonitor monitor, IAdaptable info)
			throws ExecutionException {
		Entity aE = MmclassFactory.eINSTANCE.createEntity();
		Entity aE2 = MmclassFactory.eINSTANCE.createEntity();
		aE.setNodeText("AssociationEntity");
		aE2.setNodeText("AssociationEntity");
		newElement.getAssociations().add(
				aE);
		newElement.getAssociations().add(
				aE2);

		IElementType elementType = ((CreateElementRequest) getRequest())
				.getElementType();
		ConfigureRequest configureRequest = new ConfigureRequest(
				getEditingDomain(), newElement, elementType);
		configureRequest.setClientContext(((CreateElementRequest) getRequest())
				.getClientContext());
		configureRequest.addParameters(getRequest().getParameters());
		ICommand configureCommand = elementType
				.getEditCommand(configureRequest);
		if (configureCommand != null && configureCommand.canExecute()) {
			configureCommand.execute(monitor, info);
		}
	}

}
