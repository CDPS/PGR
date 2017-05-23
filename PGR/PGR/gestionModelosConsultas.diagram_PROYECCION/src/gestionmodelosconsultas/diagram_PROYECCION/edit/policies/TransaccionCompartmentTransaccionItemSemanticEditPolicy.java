package gestionmodelosconsultas.diagram_PROYECCION.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class TransaccionCompartmentTransaccionItemSemanticEditPolicy extends
		gestionmodelosconsultas.diagram_PROYECCION.edit.policies.GestionModelosConsultasBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public TransaccionCompartmentTransaccionItemSemanticEditPolicy() {
		super(gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Transaccion_2006);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Campo_3006 == req
				.getElementType()) {
			return getGEFWrapper(new gestionmodelosconsultas.diagram_PROYECCION.edit.commands.Campo6CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
