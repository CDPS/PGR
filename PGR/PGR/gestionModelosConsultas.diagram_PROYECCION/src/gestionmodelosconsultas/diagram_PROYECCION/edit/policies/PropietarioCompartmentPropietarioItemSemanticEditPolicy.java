package gestionmodelosconsultas.diagram_PROYECCION.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class PropietarioCompartmentPropietarioItemSemanticEditPolicy extends
		gestionmodelosconsultas.diagram_PROYECCION.edit.policies.GestionModelosConsultasBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public PropietarioCompartmentPropietarioItemSemanticEditPolicy() {
		super(gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Propietario_2004);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Campo_3004 == req
				.getElementType()) {
			return getGEFWrapper(new gestionmodelosconsultas.diagram_PROYECCION.edit.commands.Campo4CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
