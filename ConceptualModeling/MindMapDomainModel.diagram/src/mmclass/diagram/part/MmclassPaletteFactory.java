/*
 * 
 */
package mmclass.diagram.part;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import mmclass.diagram.providers.MmclassElementTypes;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class MmclassPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createObjects1Group());
		paletteRoot.add(createConnections2Group());
	}

	/**
	 * Creates "Objects" palette tool group
	 * @generated
	 */
	private PaletteContainer createObjects1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createEntity4CreationTool());
		paletteContainer.add(createAssociationEntity1CreationTool());
		paletteContainer.add(createAttribute2CreationTool());
		paletteContainer.add(createEnumeration5CreationTool());
		paletteContainer.add(createConstant3CreationTool());		
		
//		paletteContainer.add(createDomain6CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Connections" palette tool group
	 * @generated
	 */
	private PaletteContainer createConnections2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Connections2Group_title);
		paletteContainer.setId("createConnections2Group"); //$NON-NLS-1$
		paletteContainer.add(createEdge1CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAssociationEntity1CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(MmclassElementTypes.AssociationEntity_2002);
		types.add(MmclassElementTypes.AssociationEntity_3001);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.AssociationEntity1CreationTool_title,
				Messages.AssociationEntity1CreationTool_desc, types);
		entry.setId("createAssociationEntity1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MmclassElementTypes
				.getImageDescriptor(MmclassElementTypes.AssociationEntity_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAttribute2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Attribute2CreationTool_title,
				Messages.Attribute2CreationTool_desc,
				Collections.singletonList(MmclassElementTypes.Attribute_2003));
		entry.setId("createAttribute2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MmclassElementTypes
				.getImageDescriptor(MmclassElementTypes.Attribute_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConstant3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Constant3CreationTool_title,
				Messages.Constant3CreationTool_desc,
				Collections.singletonList(MmclassElementTypes.Constant_2006));
		entry.setId("createConstant3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MmclassElementTypes
				.getImageDescriptor(MmclassElementTypes.Constant_2006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEntity4CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(MmclassElementTypes.Entity_3002);
		types.add(MmclassElementTypes.Entity_2007);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Entity4CreationTool_title,
				Messages.Entity4CreationTool_desc, types);
		entry.setId("createEntity4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MmclassElementTypes
				.getImageDescriptor(MmclassElementTypes.Entity_3002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEnumeration5CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Enumeration5CreationTool_title,
				Messages.Enumeration5CreationTool_desc,
				Collections.singletonList(MmclassElementTypes.Enum_2001));
		entry.setId("createEnumeration5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MmclassElementTypes
				.getImageDescriptor(MmclassElementTypes.Enum_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDomain6CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Domain6CreationTool_title,
				Messages.Domain6CreationTool_desc,
				Collections.singletonList(MmclassElementTypes.RootNode_2004));
		entry.setId("createDomain6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MmclassElementTypes
				.getImageDescriptor(MmclassElementTypes.RootNode_2004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEdge1CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Edge1CreationTool_title,
				Messages.Edge1CreationTool_desc,
				Collections.singletonList(MmclassElementTypes.Edge_4001));
		entry.setId("createEdge1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MmclassElementTypes
				.getImageDescriptor(MmclassElementTypes.Edge_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description,
				List<IElementType> elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	/**
	 * @generated
	 */
	private static class LinkToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(String title, String description,
				List<IElementType> relationshipTypes) {
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
