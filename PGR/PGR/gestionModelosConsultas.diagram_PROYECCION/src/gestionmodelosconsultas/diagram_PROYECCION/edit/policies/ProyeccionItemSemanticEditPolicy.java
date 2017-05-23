package gestionmodelosconsultas.diagram_PROYECCION.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

/**
 * @generated
 */
public class ProyeccionItemSemanticEditPolicy extends
		gestionmodelosconsultas.diagram_PROYECCION.edit.policies.GestionModelosConsultasBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public ProyeccionItemSemanticEditPolicy() {
		super(gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Proyeccion_1000);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Consolidado_2001 == req
				.getElementType()) {
			return getGEFWrapper(
					new gestionmodelosconsultas.diagram_PROYECCION.edit.commands.ConsolidadoCreateCommand(req));
		}
		if (gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Detallado_2002 == req
				.getElementType()) {
			return getGEFWrapper(
					new gestionmodelosconsultas.diagram_PROYECCION.edit.commands.DetalladoCreateCommand(req));
		}
		if (gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Planilla_2003 == req
				.getElementType()) {
			return getGEFWrapper(
					new gestionmodelosconsultas.diagram_PROYECCION.edit.commands.PlanillaCreateCommand(req));
		}
		if (gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Propietario_2004 == req
				.getElementType()) {
			return getGEFWrapper(
					new gestionmodelosconsultas.diagram_PROYECCION.edit.commands.PropietarioCreateCommand(req));
		}
		if (gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Trama_2005 == req
				.getElementType()) {
			return getGEFWrapper(new gestionmodelosconsultas.diagram_PROYECCION.edit.commands.TramaCreateCommand(req));
		}
		if (gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Transaccion_2006 == req
				.getElementType()) {
			return getGEFWrapper(
					new gestionmodelosconsultas.diagram_PROYECCION.edit.commands.TransaccionCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	* @generated
	*/
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost()).getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	* @generated
	*/
	private static class DuplicateAnythingCommand extends DuplicateEObjectsCommand {

		/**
		* @generated
		*/
		public DuplicateAnythingCommand(TransactionalEditingDomain editingDomain, DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req.getElementsToBeDuplicated(), req.getAllDuplicatedElementsMap());
		}

	}

}
