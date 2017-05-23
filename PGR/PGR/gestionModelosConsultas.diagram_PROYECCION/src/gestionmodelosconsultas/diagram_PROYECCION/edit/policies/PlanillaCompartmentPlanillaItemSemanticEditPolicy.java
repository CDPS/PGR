package gestionmodelosconsultas.diagram_PROYECCION.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class PlanillaCompartmentPlanillaItemSemanticEditPolicy extends
		gestionmodelosconsultas.diagram_PROYECCION.edit.policies.GestionModelosConsultasBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public PlanillaCompartmentPlanillaItemSemanticEditPolicy() {
		super(gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Planilla_2003);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Campo_3003 == req
				.getElementType()) {
			return getGEFWrapper(new gestionmodelosconsultas.diagram_PROYECCION.edit.commands.Campo3CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
