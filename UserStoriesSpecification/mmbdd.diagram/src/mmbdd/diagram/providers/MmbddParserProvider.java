/*
 * 
 */
package mmbdd.diagram.providers;

import mmbdd.MmbddPackage;
import mmbdd.diagram.edit.parts.CenterNodeTextEditPart;
import mmbdd.diagram.edit.parts.LeafNodeTextEditPart;
import mmbdd.diagram.edit.parts.RelationshipNodeTextEditPart;
import mmbdd.diagram.edit.parts.WrappingLabelEditPart;
import mmbdd.diagram.parsers.MessageFormatParser;
import mmbdd.diagram.part.MmbddVisualIDRegistry;

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
public class MmbddParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser centerNodeText_5004Parser;

	/**
	 * @generated
	 */
	private IParser getCenterNodeText_5004Parser() {
		if (centerNodeText_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { MmbddPackage.eINSTANCE
					.getNode_NodeText() };
			MessageFormatParser parser = new MessageFormatParser(features);
			centerNodeText_5004Parser = parser;
		}
		return centerNodeText_5004Parser;
	}

	/**
	 * @generated
	 */
	private IParser relationshipNodeText_5005Parser;

	/**
	 * @generated
	 */
	private IParser getRelationshipNodeText_5005Parser() {
		if (relationshipNodeText_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { MmbddPackage.eINSTANCE
					.getNode_NodeText() };
			MessageFormatParser parser = new MessageFormatParser(features);
			relationshipNodeText_5005Parser = parser;
		}
		return relationshipNodeText_5005Parser;
	}

	/**
	 * @generated
	 */
	private IParser leafNodeText_5003Parser;

	/**
	 * @generated
	 */
	private IParser getLeafNodeText_5003Parser() {
		if (leafNodeText_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { MmbddPackage.eINSTANCE
					.getNode_NodeText() };
			MessageFormatParser parser = new MessageFormatParser(features);
			leafNodeText_5003Parser = parser;
		}
		return leafNodeText_5003Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case CenterNodeTextEditPart.VISUAL_ID:
			return getCenterNodeText_5004Parser();
		case RelationshipNodeTextEditPart.VISUAL_ID:
			return getRelationshipNodeText_5005Parser();
		case LeafNodeTextEditPart.VISUAL_ID:
			return getLeafNodeText_5003Parser();
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
			return getParser(MmbddVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(MmbddVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (MmbddElementTypes.getElement(hint) == null) {
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
