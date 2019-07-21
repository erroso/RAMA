/*
 * 
 */
package mmclass.diagram.part;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gmf.runtime.common.ui.action.actions.global.GlobalActionManager;
import org.eclipse.gmf.runtime.common.ui.action.global.GlobalActionId;
import org.eclipse.gmf.runtime.common.ui.services.action.contributionitem.ContributionItemService;
import org.eclipse.gmf.runtime.diagram.ui.actions.ActionIds;
import org.eclipse.gmf.runtime.diagram.ui.providers.DiagramContextMenuProvider;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.ui.IWorkbenchPart;

/**
 * @generated
 */
public class DiagramEditorContextMenuProvider extends
		DiagramContextMenuProvider {

	/**
	 * @generated
	 */
	private IWorkbenchPart part;

	/**
	 * @generated
	 */
	private DeleteElementAction deleteAction;

	/**
	 * @generated
	 */
	public DiagramEditorContextMenuProvider(IWorkbenchPart part,
			EditPartViewer viewer) {
		super(part, viewer);
		this.part = part;
		deleteAction = new DeleteElementAction(part);
		deleteAction.init();
	}

	/**
	 * @generated
	 */
	public void dispose() {
		if (deleteAction != null) {
			deleteAction.dispose();
			deleteAction = null;
		}
		super.dispose();
	}

	/**
	 * @generated NOT
	 */
	public void buildContextMenu(final IMenuManager menu) {
		getViewer().flush();
		try {
			TransactionUtil.getEditingDomain(
					(EObject) getViewer().getContents().getModel())
					.runExclusive(new Runnable() {

						public void run() {
							ContributionItemService
									.getInstance()
									.contributeToPopupMenu(
											DiagramEditorContextMenuProvider.this,
											part);
							//							for (int i = 0; i < menu.getItems().length; i++) {
							//								System.out.println(menu.getItems()[i]);
							//							}
							menu.removeAll();
							menu.add(new Separator("addGroup"));
							menu.add(new Separator("logicGroup"));
							menu.add(new Separator("typeGroup"));
							menu.add(new Separator("leafGroup"));
							menu.add(new Separator("editGroup"));
							menu.add(new Separator("iconGroup"));
							menu.add(new Separator("removeGroup"));
							menu.add(new Separator("miscGroup"));
							menu.add(new Separator("transformationGroup"));
							menu.appendToGroup("removeGroup", deleteAction);

							menu.appendToGroup(
									"miscGroup",
									GlobalActionManager.getInstance()
											.createActionHandler(part,
													GlobalActionId.PRINT));
							//							menu.appendToGroup("miscGroup",
							//									new ShowPropertiesViewAction(part));
						}
					});
		} catch (Exception e) {
			MmclassDiagramEditorPlugin.getInstance().logError(
					"Error building context menu", e);
		}
	}
}
