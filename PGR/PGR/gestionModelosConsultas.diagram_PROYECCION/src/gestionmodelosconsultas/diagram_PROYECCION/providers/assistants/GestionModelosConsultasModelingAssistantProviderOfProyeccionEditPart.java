package gestionmodelosconsultas.diagram_PROYECCION.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class GestionModelosConsultasModelingAssistantProviderOfProyeccionEditPart
		extends gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(6);
		types.add(
				gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Consolidado_2001);
		types.add(
				gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Detallado_2002);
		types.add(
				gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Planilla_2003);
		types.add(
				gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Propietario_2004);
		types.add(gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Trama_2005);
		types.add(
				gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Transaccion_2006);
		return types;
	}

}
