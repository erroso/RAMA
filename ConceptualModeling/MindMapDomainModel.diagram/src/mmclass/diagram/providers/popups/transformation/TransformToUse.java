package mmclass.diagram.providers.popups.transformation;

//import mmclass.diagram.transformations.EglStandaloneExample;

import mmclass.diagram.part.ValidateAction;
import mmclass.diagram.providers.popups.transformation.MODELS.ToJavaStandalone;
import mmclass.diagram.providers.popups.transformation.MODELS.ToUseStandalone;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.gmf.runtime.notation.View;

import UTIL.ActiveDiagram;

public class TransformToUse extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		// TODO Auto-generated method stub
		
		try {
//			ValidateAction.runValidation((View) ActiveDiagram.getActiveEditor().getDiagramEditPart().getDiagramView());
//			if (ValidateAction.RESULT.equals(Boolean.TRUE)) {
				(new ToUseStandalone()).execute();
//			} else {
//				System.out.println("There are errors in your diagram. Correct them and then transform");
//			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
