/*
 * 
 */
package mmclass.diagram.providers;

import mmclass.MmclassPackage;
import mmclass.diagram.edit.parts.AssociationEntityNodeText2EditPart;
import mmclass.diagram.edit.parts.AssociationEntityNodeTextEditPart;
import mmclass.diagram.edit.parts.AttributeNodeTextEditPart;
import mmclass.diagram.edit.parts.ConstantNodeTextEditPart;
import mmclass.diagram.edit.parts.EdgeNameEditPart;
import mmclass.diagram.edit.parts.EntityNodeText2EditPart;
import mmclass.diagram.edit.parts.EntityNodeTextEditPart;
import mmclass.diagram.edit.parts.EnumNodeTextEditPart;
import mmclass.diagram.edit.parts.RootNodeNodeTextEditPart;
import mmclass.diagram.parsers.MessageFormatParser;
import mmclass.diagram.part.MmclassVisualIDRegistry;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class MmclassParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser enumNodeText_5001Parser;

	/**
	 * @generated
	 */
	private IParser getEnumNodeText_5001Parser() {
		if (enumNodeText_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { MmclassPackage.eINSTANCE
					.getNode_NodeText() };
			MessageFormatParser parser = new MessageFormatParser(features);
			enumNodeText_5001Parser = parser;
		}
		return enumNodeText_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser associationEntityNodeText_5002Parser;

	/**
	 * @generated
	 */
	private IParser getAssociationEntityNodeText_5002Parser() {
		if (associationEntityNodeText_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { MmclassPackage.eINSTANCE
					.getNode_NodeText() };
			MessageFormatParser parser = new MessageFormatParser(features);
			associationEntityNodeText_5002Parser = parser;
		}
		return associationEntityNodeText_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser attributeNodeText_5003Parser;

	/**
	 * @generated
	 */
	private IParser getAttributeNodeText_5003Parser() {
		if (attributeNodeText_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { MmclassPackage.eINSTANCE
					.getNode_NodeText() };
			MessageFormatParser parser = new MessageFormatParser(features);
			attributeNodeText_5003Parser = parser;
		}
		return attributeNodeText_5003Parser;
	}

	/**
	 * @generated
	 */
	private IParser rootNodeNodeText_5004Parser;

	/**
	 * @generated
	 */
	private IParser getRootNodeNodeText_5004Parser() {
		if (rootNodeNodeText_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { MmclassPackage.eINSTANCE
					.getNode_NodeText() };
			MessageFormatParser parser = new MessageFormatParser(features);
			rootNodeNodeText_5004Parser = parser;
		}
		return rootNodeNodeText_5004Parser;
	}

	/**
	 * @generated
	 */
	private IParser constantNodeText_5006Parser;

	/**
	 * @generated
	 */
	private IParser getConstantNodeText_5006Parser() {
		if (constantNodeText_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { MmclassPackage.eINSTANCE
					.getNode_NodeText() };
			MessageFormatParser parser = new MessageFormatParser(features);
			constantNodeText_5006Parser = parser;
		}
		return constantNodeText_5006Parser;
	}

	/**
	 * @generated
	 */
	private IParser entityNodeText_5007Parser;

	/**
	 * @generated
	 */
	private IParser getEntityNodeText_5007Parser() {
		if (entityNodeText_5007Parser == null) {
			EAttribute[] features = new EAttribute[] { MmclassPackage.eINSTANCE
					.getNode_NodeText() };
			MessageFormatParser parser = new MessageFormatParser(features);
			entityNodeText_5007Parser = parser;
		}
		return entityNodeText_5007Parser;
	}

	/**
	 * @generated
	 */
	private IParser associationEntityNodeText_5009Parser;

	/**
	 * @generated
	 */
	private IParser getAssociationEntityNodeText_5009Parser() {
		if (associationEntityNodeText_5009Parser == null) {
			EAttribute[] features = new EAttribute[] { MmclassPackage.eINSTANCE
					.getNode_NodeText() };
			MessageFormatParser parser = new MessageFormatParser(features);
			associationEntityNodeText_5009Parser = parser;
		}
		return associationEntityNodeText_5009Parser;
	}

	/**
	 * @generated
	 */
	private IParser entityNodeText_5008Parser;

	/**
	 * @generated
	 */
	private IParser getEntityNodeText_5008Parser() {
		if (entityNodeText_5008Parser == null) {
			EAttribute[] features = new EAttribute[] { MmclassPackage.eINSTANCE
					.getNode_NodeText() };
			MessageFormatParser parser = new MessageFormatParser(features);
			entityNodeText_5008Parser = parser;
		}
		return entityNodeText_5008Parser;
	}

	/**
	 * @generated
	 */
	private IParser edgeName_6001Parser;

	/**
	 * @generated
	 */
	private IParser getEdgeName_6001Parser() {
		if (edgeName_6001Parser == null) {
			EAttribute[] features = new EAttribute[] { MmclassPackage.eINSTANCE
					.getEdge_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			edgeName_6001Parser = parser;
		}
		return edgeName_6001Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case EnumNodeTextEditPart.VISUAL_ID:
			return getEnumNodeText_5001Parser();
		case AssociationEntityNodeTextEditPart.VISUAL_ID:
			return getAssociationEntityNodeText_5002Parser();
		case AttributeNodeTextEditPart.VISUAL_ID:
			return getAttributeNodeText_5003Parser();
		case RootNodeNodeTextEditPart.VISUAL_ID:
			return getRootNodeNodeText_5004Parser();
		case ConstantNodeTextEditPart.VISUAL_ID:
			return getConstantNodeText_5006Parser();
		case EntityNodeTextEditPart.VISUAL_ID:
			return getEntityNodeText_5007Parser();
		case AssociationEntityNodeText2EditPart.VISUAL_ID:
			return getAssociationEntityNodeText_5009Parser();
		case EntityNodeText2EditPart.VISUAL_ID:
			return getEntityNodeText_5008Parser();
		case EdgeNameEditPart.VISUAL_ID:
			return getEdgeName_6001Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object,
			String parserHint) {
		return ParserService.getInstance().getParser(
				new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(MmclassVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(MmclassVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (MmclassElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
