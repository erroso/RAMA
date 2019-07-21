/*
 * 
 */
package mmclass.diagram.providers;

import mmclass.diagram.part.MmclassDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = MmclassDiagramEditorPlugin.getInstance()
				.getElementInitializers();
		if (cached == null) {
			MmclassDiagramEditorPlugin.getInstance().setElementInitializers(
					cached = new ElementInitializers());
		}
		return cached;
	}
}
