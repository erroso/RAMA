/*
 * 
 */
package mmbdd.diagram.part;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import mmbdd.diagram.providers.MmbddElementTypes;

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
public class MmbddPaletteFactory {

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
		paletteContainer.add(createCenter1CreationTool());
		paletteContainer.add(createLeaf2CreationTool());
		paletteContainer.add(createRelationship3CreationTool());
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
	private ToolEntry createCenter1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Center1CreationTool_title,
				Messages.Center1CreationTool_desc,
				Collections.singletonList(MmbddElementTypes.Center_2004));
		entry.setId("createCenter1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MmbddElementTypes
				.getImageDescriptor(MmbddElementTypes.Center_2004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLeaf2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Leaf2CreationTool_title,
				Messages.Leaf2CreationTool_desc,
				Collections.singletonList(MmbddElementTypes.Leaf_2003));
		entry.setId("createLeaf2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MmbddElementTypes
				.getImageDescriptor(MmbddElementTypes.Leaf_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRelationship3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Relationship3CreationTool_title,
				Messages.Relationship3CreationTool_desc,
				Collections.singletonList(MmbddElementTypes.Relationship_2002));
		entry.setId("createRelationship3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MmbddElementTypes
				.getImageDescriptor(MmbddElementTypes.Relationship_2002));
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
				Collections.singletonList(MmbddElementTypes.Edge_4001));
		entry.setId("createEdge1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MmbddElementTypes
				.getImageDescriptor(MmbddElementTypes.Edge_4001));
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
