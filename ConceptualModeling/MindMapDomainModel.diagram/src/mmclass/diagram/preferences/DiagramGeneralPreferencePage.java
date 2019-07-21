/*
 * 
 */
package mmclass.diagram.preferences;

import mmclass.diagram.part.MmclassDiagramEditorPlugin;

import org.eclipse.gmf.runtime.diagram.ui.preferences.DiagramsPreferencePage;
import org.eclipse.gmf.runtime.diagram.ui.preferences.IPreferenceConstants;
import org.eclipse.jface.preference.IPreferenceStore;

/**
 * @generated
 */
public class DiagramGeneralPreferencePage extends DiagramsPreferencePage {

	/**
	 * @generated
	 */
	public DiagramGeneralPreferencePage() {
		setPreferenceStore(MmclassDiagramEditorPlugin.getInstance()
				.getPreferenceStore());
	}

	/**
	 *
	 * @generated NOT
	 */
	public static void initDefaults(IPreferenceStore ps) {
		ps.setDefault(IPreferenceConstants.PREF_ENABLE_ANTIALIAS, true);
		ps.setDefault(IPreferenceConstants.PREF_SHOW_POPUP_BARS, false);
		ps.setDefault(IPreferenceConstants.PREF_SHOW_CONNECTION_HANDLES, false);
	}
}
