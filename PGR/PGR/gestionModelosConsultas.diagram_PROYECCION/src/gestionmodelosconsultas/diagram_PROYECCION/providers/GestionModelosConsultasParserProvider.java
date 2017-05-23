package gestionmodelosconsultas.diagram_PROYECCION.providers;

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
import org.eclipse.gmf.tooling.runtime.parsers.EnumParser;

import gestionmodelosconsultas.modeloconsultas.model.ModelPackage;

/**
 * @generated
 */
public class GestionModelosConsultasParserProvider extends AbstractProvider implements IParserProvider {

	/**
	* @generated
	*/
	private IParser consolidadoNombre_5002Parser;

	/**
	* @generated
	*/
	private IParser getConsolidadoNombre_5002Parser() {
		if (consolidadoNombre_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { ModelPackage.eINSTANCE.getElementoModelo_Nombre() };
			gestionmodelosconsultas.diagram_PROYECCION.parsers.MessageFormatParser parser = new gestionmodelosconsultas.diagram_PROYECCION.parsers.MessageFormatParser(
					features);
			consolidadoNombre_5002Parser = parser;
		}
		return consolidadoNombre_5002Parser;
	}

	/**
	* @generated
	*/
	private IParser detalladoNombre_5004Parser;

	/**
	* @generated
	*/
	private IParser getDetalladoNombre_5004Parser() {
		if (detalladoNombre_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { ModelPackage.eINSTANCE.getElementoModelo_Nombre() };
			gestionmodelosconsultas.diagram_PROYECCION.parsers.MessageFormatParser parser = new gestionmodelosconsultas.diagram_PROYECCION.parsers.MessageFormatParser(
					features);
			detalladoNombre_5004Parser = parser;
		}
		return detalladoNombre_5004Parser;
	}

	/**
	* @generated
	*/
	private IParser planillaNombre_5006Parser;

	/**
	* @generated
	*/
	private IParser getPlanillaNombre_5006Parser() {
		if (planillaNombre_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { ModelPackage.eINSTANCE.getElementoModelo_Nombre() };
			gestionmodelosconsultas.diagram_PROYECCION.parsers.MessageFormatParser parser = new gestionmodelosconsultas.diagram_PROYECCION.parsers.MessageFormatParser(
					features);
			planillaNombre_5006Parser = parser;
		}
		return planillaNombre_5006Parser;
	}

	/**
	* @generated
	*/
	private IParser propietarioNombre_5008Parser;

	/**
	* @generated
	*/
	private IParser getPropietarioNombre_5008Parser() {
		if (propietarioNombre_5008Parser == null) {
			EAttribute[] features = new EAttribute[] { ModelPackage.eINSTANCE.getElementoModelo_Nombre() };
			gestionmodelosconsultas.diagram_PROYECCION.parsers.MessageFormatParser parser = new gestionmodelosconsultas.diagram_PROYECCION.parsers.MessageFormatParser(
					features);
			propietarioNombre_5008Parser = parser;
		}
		return propietarioNombre_5008Parser;
	}

	/**
	* @generated
	*/
	private IParser tramaNombre_5010Parser;

	/**
	* @generated
	*/
	private IParser getTramaNombre_5010Parser() {
		if (tramaNombre_5010Parser == null) {
			EAttribute[] features = new EAttribute[] { ModelPackage.eINSTANCE.getElementoModelo_Nombre() };
			gestionmodelosconsultas.diagram_PROYECCION.parsers.MessageFormatParser parser = new gestionmodelosconsultas.diagram_PROYECCION.parsers.MessageFormatParser(
					features);
			tramaNombre_5010Parser = parser;
		}
		return tramaNombre_5010Parser;
	}

	/**
	* @generated
	*/
	private IParser transaccionNombre_5012Parser;

	/**
	* @generated
	*/
	private IParser getTransaccionNombre_5012Parser() {
		if (transaccionNombre_5012Parser == null) {
			EAttribute[] features = new EAttribute[] { ModelPackage.eINSTANCE.getElementoModelo_Nombre() };
			gestionmodelosconsultas.diagram_PROYECCION.parsers.MessageFormatParser parser = new gestionmodelosconsultas.diagram_PROYECCION.parsers.MessageFormatParser(
					features);
			transaccionNombre_5012Parser = parser;
		}
		return transaccionNombre_5012Parser;
	}

	/**
	* @generated
	*/
	private IParser campoNombreCampo_5001Parser;

	/**
	* @generated
	*/
	private IParser getCampoNombreCampo_5001Parser() {
		if (campoNombreCampo_5001Parser == null) {
			EAttribute editableFeature = ModelPackage.eINSTANCE.getCampo_NombreCampo();
			EnumParser parser = new EnumParser(editableFeature);
			campoNombreCampo_5001Parser = parser;
		}
		return campoNombreCampo_5001Parser;
	}

	/**
	* @generated
	*/
	private IParser campoNombreCampo_5003Parser;

	/**
	* @generated
	*/
	private IParser getCampoNombreCampo_5003Parser() {
		if (campoNombreCampo_5003Parser == null) {
			EAttribute editableFeature = ModelPackage.eINSTANCE.getCampo_NombreCampo();
			EnumParser parser = new EnumParser(editableFeature);
			campoNombreCampo_5003Parser = parser;
		}
		return campoNombreCampo_5003Parser;
	}

	/**
	* @generated
	*/
	private IParser campoNombreCampo_5005Parser;

	/**
	* @generated
	*/
	private IParser getCampoNombreCampo_5005Parser() {
		if (campoNombreCampo_5005Parser == null) {
			EAttribute editableFeature = ModelPackage.eINSTANCE.getCampo_NombreCampo();
			EnumParser parser = new EnumParser(editableFeature);
			campoNombreCampo_5005Parser = parser;
		}
		return campoNombreCampo_5005Parser;
	}

	/**
	* @generated
	*/
	private IParser campoNombreCampo_5007Parser;

	/**
	* @generated
	*/
	private IParser getCampoNombreCampo_5007Parser() {
		if (campoNombreCampo_5007Parser == null) {
			EAttribute editableFeature = ModelPackage.eINSTANCE.getCampo_NombreCampo();
			EnumParser parser = new EnumParser(editableFeature);
			campoNombreCampo_5007Parser = parser;
		}
		return campoNombreCampo_5007Parser;
	}

	/**
	* @generated
	*/
	private IParser campoNombreCampo_5009Parser;

	/**
	* @generated
	*/
	private IParser getCampoNombreCampo_5009Parser() {
		if (campoNombreCampo_5009Parser == null) {
			EAttribute editableFeature = ModelPackage.eINSTANCE.getCampo_NombreCampo();
			EnumParser parser = new EnumParser(editableFeature);
			campoNombreCampo_5009Parser = parser;
		}
		return campoNombreCampo_5009Parser;
	}

	/**
	* @generated
	*/
	private IParser campoNombreCampo_5011Parser;

	/**
	* @generated
	*/
	private IParser getCampoNombreCampo_5011Parser() {
		if (campoNombreCampo_5011Parser == null) {
			EAttribute editableFeature = ModelPackage.eINSTANCE.getCampo_NombreCampo();
			EnumParser parser = new EnumParser(editableFeature);
			campoNombreCampo_5011Parser = parser;
		}
		return campoNombreCampo_5011Parser;
	}

	/**
	* @generated
	*/
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ConsolidadoNombreEditPart.VISUAL_ID:
			return getConsolidadoNombre_5002Parser();
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.DetalladoNombreEditPart.VISUAL_ID:
			return getDetalladoNombre_5004Parser();
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.PlanillaNombreEditPart.VISUAL_ID:
			return getPlanillaNombre_5006Parser();
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.PropietarioNombreEditPart.VISUAL_ID:
			return getPropietarioNombre_5008Parser();
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.TramaNombreEditPart.VISUAL_ID:
			return getTramaNombre_5010Parser();
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.TransaccionNombreEditPart.VISUAL_ID:
			return getTransaccionNombre_5012Parser();

		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.CampoNombreCampoEditPart.VISUAL_ID:
			return getCampoNombreCampo_5001Parser();

		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.CampoNombreCampo2EditPart.VISUAL_ID:
			return getCampoNombreCampo_5003Parser();

		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.CampoNombreCampo3EditPart.VISUAL_ID:
			return getCampoNombreCampo_5005Parser();

		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.CampoNombreCampo4EditPart.VISUAL_ID:
			return getCampoNombreCampo_5007Parser();

		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.CampoNombreCampo5EditPart.VISUAL_ID:
			return getCampoNombreCampo_5009Parser();

		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.CampoNombreCampo6EditPart.VISUAL_ID:
			return getCampoNombreCampo_5011Parser();
		}
		return null;
	}

	/**
	* Utility method that consults ParserService
	* @generated
	*/
	public static IParser getParser(IElementType type, EObject object, String parserHint) {
		return ParserService.getInstance().getParser(new HintAdapter(type, object, parserHint));
	}

	/**
	* @generated
	*/
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry
					.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry
					.getVisualID(view));
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes
					.getElement(hint) == null) {
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
