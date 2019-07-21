/*
 * 
 */
package mmclass.diagram.navigator;

import mmclass.diagram.edit.parts.AssociationEntity2EditPart;
import mmclass.diagram.edit.parts.AssociationEntityEditPart;
import mmclass.diagram.edit.parts.AssociationEntityNodeText2EditPart;
import mmclass.diagram.edit.parts.AssociationEntityNodeTextEditPart;
import mmclass.diagram.edit.parts.AttributeEditPart;
import mmclass.diagram.edit.parts.AttributeNodeTextEditPart;
import mmclass.diagram.edit.parts.ConstantEditPart;
import mmclass.diagram.edit.parts.ConstantNodeTextEditPart;
import mmclass.diagram.edit.parts.EdgeEditPart;
import mmclass.diagram.edit.parts.EdgeNameEditPart;
import mmclass.diagram.edit.parts.Entity2EditPart;
import mmclass.diagram.edit.parts.EntityEditPart;
import mmclass.diagram.edit.parts.EntityNodeText2EditPart;
import mmclass.diagram.edit.parts.EntityNodeTextEditPart;
import mmclass.diagram.edit.parts.EnumEditPart;
import mmclass.diagram.edit.parts.EnumNodeTextEditPart;
import mmclass.diagram.edit.parts.MindMapModelEditPart;
import mmclass.diagram.edit.parts.RootNodeEditPart;
import mmclass.diagram.edit.parts.RootNodeNodeTextEditPart;
import mmclass.diagram.part.MmclassDiagramEditorPlugin;
import mmclass.diagram.part.MmclassVisualIDRegistry;
import mmclass.diagram.providers.MmclassElementTypes;
import mmclass.diagram.providers.MmclassParserProvider;

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
public class MmclassNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		MmclassDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		MmclassDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof MmclassNavigatorItem
				&& !isOwnView(((MmclassNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof MmclassNavigatorGroup) {
			MmclassNavigatorGroup group = (MmclassNavigatorGroup) element;
			return MmclassDiagramEditorPlugin.getInstance().getBundledImage(
					group.getIcon());
		}

		if (element instanceof MmclassNavigatorItem) {
			MmclassNavigatorItem navigatorItem = (MmclassNavigatorItem) element;
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
		switch (MmclassVisualIDRegistry.getVisualID(view)) {
		case RootNodeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?MindMapDomainModel?RootNode", MmclassElementTypes.RootNode_2004); //$NON-NLS-1$
		case AttributeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?MindMapDomainModel?Attribute", MmclassElementTypes.Attribute_2003); //$NON-NLS-1$
		case EnumEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?MindMapDomainModel?Enum", MmclassElementTypes.Enum_2001); //$NON-NLS-1$
		case MindMapModelEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?MindMapDomainModel?MindMapModel", MmclassElementTypes.MindMapModel_1000); //$NON-NLS-1$
		case EdgeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?MindMapDomainModel?Edge", MmclassElementTypes.Edge_4001); //$NON-NLS-1$
		case AssociationEntityEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?MindMapDomainModel?AssociationEntity", MmclassElementTypes.AssociationEntity_2002); //$NON-NLS-1$
		case Entity2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?MindMapDomainModel?Entity", MmclassElementTypes.Entity_3002); //$NON-NLS-1$
		case AssociationEntity2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?MindMapDomainModel?AssociationEntity", MmclassElementTypes.AssociationEntity_3001); //$NON-NLS-1$
		case ConstantEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?MindMapDomainModel?Constant", MmclassElementTypes.Constant_2006); //$NON-NLS-1$
		case EntityEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?MindMapDomainModel?Entity", MmclassElementTypes.Entity_2007); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = MmclassDiagramEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& MmclassElementTypes.isKnownElementType(elementType)) {
			image = MmclassElementTypes.getImage(elementType);
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
		if (element instanceof MmclassNavigatorGroup) {
			MmclassNavigatorGroup group = (MmclassNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof MmclassNavigatorItem) {
			MmclassNavigatorItem navigatorItem = (MmclassNavigatorItem) element;
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
		switch (MmclassVisualIDRegistry.getVisualID(view)) {
		case RootNodeEditPart.VISUAL_ID:
			return getRootNode_2004Text(view);
		case AttributeEditPart.VISUAL_ID:
			return getAttribute_2003Text(view);
		case EnumEditPart.VISUAL_ID:
			return getEnum_2001Text(view);
		case MindMapModelEditPart.VISUAL_ID:
			return getMindMapModel_1000Text(view);
		case EdgeEditPart.VISUAL_ID:
			return getEdge_4001Text(view);
		case AssociationEntityEditPart.VISUAL_ID:
			return getAssociationEntity_2002Text(view);
		case Entity2EditPart.VISUAL_ID:
			return getEntity_3002Text(view);
		case AssociationEntity2EditPart.VISUAL_ID:
			return getAssociationEntity_3001Text(view);
		case ConstantEditPart.VISUAL_ID:
			return getConstant_2006Text(view);
		case EntityEditPart.VISUAL_ID:
			return getEntity_2007Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getAssociationEntity_2002Text(View view) {
		IParser parser = MmclassParserProvider.getParser(
				MmclassElementTypes.AssociationEntity_2002,
				view.getElement() != null ? view.getElement() : view,
				MmclassVisualIDRegistry
						.getType(AssociationEntityNodeTextEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MmclassDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEnum_2001Text(View view) {
		IParser parser = MmclassParserProvider
				.getParser(MmclassElementTypes.Enum_2001,
						view.getElement() != null ? view.getElement() : view,
						MmclassVisualIDRegistry
								.getType(EnumNodeTextEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MmclassDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEdge_4001Text(View view) {
		IParser parser = MmclassParserProvider.getParser(
				MmclassElementTypes.Edge_4001,
				view.getElement() != null ? view.getElement() : view,
				MmclassVisualIDRegistry.getType(EdgeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MmclassDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6001); //$NON-NLS-1$
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
	private String getAttribute_2003Text(View view) {
		IParser parser = MmclassParserProvider.getParser(
				MmclassElementTypes.Attribute_2003,
				view.getElement() != null ? view.getElement() : view,
				MmclassVisualIDRegistry
						.getType(AttributeNodeTextEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MmclassDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEntity_3002Text(View view) {
		IParser parser = MmclassParserProvider.getParser(
				MmclassElementTypes.Entity_3002,
				view.getElement() != null ? view.getElement() : view,
				MmclassVisualIDRegistry
						.getType(EntityNodeText2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MmclassDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAssociationEntity_3001Text(View view) {
		IParser parser = MmclassParserProvider.getParser(
				MmclassElementTypes.AssociationEntity_3001,
				view.getElement() != null ? view.getElement() : view,
				MmclassVisualIDRegistry
						.getType(AssociationEntityNodeText2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MmclassDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEntity_2007Text(View view) {
		IParser parser = MmclassParserProvider.getParser(
				MmclassElementTypes.Entity_2007,
				view.getElement() != null ? view.getElement() : view,
				MmclassVisualIDRegistry
						.getType(EntityNodeTextEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MmclassDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRootNode_2004Text(View view) {
		IParser parser = MmclassParserProvider.getParser(
				MmclassElementTypes.RootNode_2004,
				view.getElement() != null ? view.getElement() : view,
				MmclassVisualIDRegistry
						.getType(RootNodeNodeTextEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MmclassDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getConstant_2006Text(View view) {
		IParser parser = MmclassParserProvider.getParser(
				MmclassElementTypes.Constant_2006,
				view.getElement() != null ? view.getElement() : view,
				MmclassVisualIDRegistry
						.getType(ConstantNodeTextEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MmclassDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
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
		return MindMapModelEditPart.MODEL_ID.equals(MmclassVisualIDRegistry
				.getModelID(view));
	}

}
