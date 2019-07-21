/*
 * 
 */
package mmbdd.diagram.navigator;

import mmbdd.Edge;
import mmbdd.Relationship;
import mmbdd.diagram.edit.parts.CenterEditPart;
import mmbdd.diagram.edit.parts.CenterNodeTextEditPart;
import mmbdd.diagram.edit.parts.EdgeEditPart;
import mmbdd.diagram.edit.parts.LeafEditPart;
import mmbdd.diagram.edit.parts.LeafNodeTextEditPart;
import mmbdd.diagram.edit.parts.MindMapModelEditPart;
import mmbdd.diagram.edit.parts.RelationshipEditPart;
import mmbdd.diagram.edit.parts.RelationshipNodeTextEditPart;
import mmbdd.diagram.edit.parts.WrappingLabelEditPart;
import mmbdd.diagram.part.MmbddDiagramEditorPlugin;
import mmbdd.diagram.part.MmbddVisualIDRegistry;
import mmbdd.diagram.providers.MmbddElementTypes;
import mmbdd.diagram.providers.MmbddParserProvider;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

/**
 * @generated
 */
public class MmbddNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		MmbddDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		MmbddDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof MmbddNavigatorItem
				&& !isOwnView(((MmbddNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof MmbddNavigatorGroup) {
			MmbddNavigatorGroup group = (MmbddNavigatorGroup) element;
			return MmbddDiagramEditorPlugin.getInstance().getBundledImage(
					group.getIcon());
		}

		if (element instanceof MmbddNavigatorItem) {
			MmbddNavigatorItem navigatorItem = (MmbddNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getImage(view);
			}
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (MmbddVisualIDRegistry.getVisualID(view)) {
		case MindMapModelEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://mmbdd.com?MindMapModel", MmbddElementTypes.MindMapModel_1000); //$NON-NLS-1$
		case EdgeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://mmbdd.com?Edge", MmbddElementTypes.Edge_4001); //$NON-NLS-1$
		case LeafEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://mmbdd.com?Leaf", MmbddElementTypes.Leaf_2003); //$NON-NLS-1$
		case RelationshipEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://mmbdd.com?Relationship", MmbddElementTypes.Relationship_2002); //$NON-NLS-1$
		case CenterEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://mmbdd.com?Center", MmbddElementTypes.Center_2004); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = MmbddDiagramEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& MmbddElementTypes.isKnownElementType(elementType)) {
			image = MmbddElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof MmbddNavigatorGroup) {
			MmbddNavigatorGroup group = (MmbddNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof MmbddNavigatorItem) {
			MmbddNavigatorItem navigatorItem = (MmbddNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getText(view);
			}
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (MmbddVisualIDRegistry.getVisualID(view)) {
		case MindMapModelEditPart.VISUAL_ID:
			return getMindMapModel_1000Text(view);
		case EdgeEditPart.VISUAL_ID:
			return getEdge_4001Text(view);
		case LeafEditPart.VISUAL_ID:
			return getLeaf_2003Text(view);
		case RelationshipEditPart.VISUAL_ID:
			return getRelationship_2002Text(view);
		case CenterEditPart.VISUAL_ID:
			return getCenter_2004Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getLeaf_2003Text(View view) {
		IParser parser = MmbddParserProvider.getParser(
				MmbddElementTypes.Leaf_2003,
				view.getElement() != null ? view.getElement() : view,
				MmbddVisualIDRegistry.getType(LeafNodeTextEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MmbddDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRelationship_2002Text(View view) {
		IParser parser = MmbddParserProvider.getParser(
				MmbddElementTypes.Relationship_2002,
				view.getElement() != null ? view.getElement() : view,
				MmbddVisualIDRegistry
						.getType(RelationshipNodeTextEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MmbddDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCenter_2004Text(View view) {
		IParser parser = MmbddParserProvider
				.getParser(MmbddElementTypes.Center_2004,
						view.getElement() != null ? view.getElement() : view,
						MmbddVisualIDRegistry
								.getType(CenterNodeTextEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MmbddDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEdge_4001Text(View view) {
		Edge domainModelElement = (Edge) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getLogic());
		} else {
			MmbddDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 4001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMindMapModel_1000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return MindMapModelEditPart.MODEL_ID.equals(MmbddVisualIDRegistry
				.getModelID(view));
	}

}
