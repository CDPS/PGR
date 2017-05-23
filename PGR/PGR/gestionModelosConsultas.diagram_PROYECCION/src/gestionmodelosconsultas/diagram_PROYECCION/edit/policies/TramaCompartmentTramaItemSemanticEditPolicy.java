package gestionmodelosconsultas.diagram_PROYECCION.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class TramaCompartmentTramaItemSemanticEditPolicy extends
		gestionmodelosconsultas.diagram_PROYECCION.edit.policies.GestionModelosConsultasBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public TramaCompartmentTramaItemSemanticEditPolicy() {
		super(gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Trama_2005);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Campo_3005 == req
				.getElementType()) {
			return getGEFWrapper(new gestionmodelosconsultas.diagram_PROYECCION.edit.commands.Campo5CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
