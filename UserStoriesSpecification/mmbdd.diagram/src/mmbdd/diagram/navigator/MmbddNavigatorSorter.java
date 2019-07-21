/*
 * 
 */
package mmbdd.diagram.navigator;

import mmbdd.diagram.part.MmbddVisualIDRegistry;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class MmbddNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 4003;

	/**
	 * @generated
	 */
	private static final int SHORTCUTS_CATEGORY = 4002;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof MmbddNavigatorItem) {
			MmbddNavigatorItem item = (MmbddNavigatorItem) element;
			if (item.getView().getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				return SHORTCUTS_CATEGORY;
			}
			return MmbddVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
