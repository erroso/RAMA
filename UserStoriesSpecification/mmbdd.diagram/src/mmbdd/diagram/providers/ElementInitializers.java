/*
 * 
 */
package mmbdd.diagram.providers;

import mmbdd.diagram.part.MmbddDiagramEditorPlugin;

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
		ElementInitializers cached = MmbddDiagramEditorPlugin.getInstance()
				.getElementInitializers();
		if (cached == null) {
			MmbddDiagramEditorPlugin.getInstance().setElementInitializers(
					cached = new ElementInitializers());
		}
		return cached;
	}
}
