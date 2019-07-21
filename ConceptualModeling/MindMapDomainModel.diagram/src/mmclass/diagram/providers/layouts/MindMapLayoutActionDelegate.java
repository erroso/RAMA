package mmclass.diagram.providers.layouts;

import java.util.Iterator;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.emf.workspace.AbstractEMFOperation;
import org.eclipse.gmf.runtime.diagram.ui.services.layout.LayoutService;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;
import org.eclipse.ui.PlatformUI;

public class MindMapLayoutActionDelegate implements IWorkbenchWindowActionDelegate {

	public static final String LAYOUT_TYPE = "myLayoutType";
	private static final String KEY_SQUARE_LAYOUT = "MindMapLayoutTitle"; //$NON-NLS-1$
	
	
	
	@Override
	public void run(IAction action) {
		// TODO Auto-generated method stub
		/* Get selection */
	    IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
	
	    // Get selection from the window
	    final ISelection selection = window.getSelectionService().getSelection();
	    Diagram diagramView = null;
	
	    // 	get the editing domain
	    if (selection instanceof IStructuredSelection) {
	
		    IStructuredSelection structuredSelection = (IStructuredSelection) selection;
		
		    // Walk selection
		    for (Iterator i = structuredSelection.iterator(); i.hasNext();) {
		        // Try to adapt the selection to a view
		        Object selectedObject = i.next();
		        if (selectedObject instanceof IAdaptable) {
		
		            // Try to get a View (new notation)
		            Object object = ((IAdaptable) selectedObject)
		                .getAdapter(View.class);
		            
		            diagramView = ((View)object).getDiagram();
		        }
		    }
	    }
	
	    if (diagramView != null) {
		    final Diagram diag = diagramView;
		    TransactionalEditingDomain ted = TransactionUtil.getEditingDomain(diagramView);
		    AbstractEMFOperation operation = new AbstractEMFOperation(ted, KEY_SQUARE_LAYOUT, null) {
		
		        protected IStatus doExecute(IProgressMonitor monitor,IAdaptable info) throws ExecutionException {
		
		            LayoutService.getInstance().layout(diag, MindMapDefaultLayoutProvider.DEFAULT_LAYOUT);//SquareLayoutProvider.SQUARE_LAYOUT);
		            
		            return Status.OK_STATUS;
		        }
		    };
		    try {
		        operation.execute(new NullProgressMonitor(), null);
		    } 
		    catch (Exception e) {
		        throw new RuntimeException(e.getMessage());
		    }
	    }
	}
	
	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void init(IWorkbenchWindow window) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		// TODO Auto-generated method stub
		
	}
}