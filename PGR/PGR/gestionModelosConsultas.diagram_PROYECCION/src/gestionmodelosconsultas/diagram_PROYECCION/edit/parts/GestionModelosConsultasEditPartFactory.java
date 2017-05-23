package gestionmodelosconsultas.diagram_PROYECCION.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

/**
 * @generated
 */
public class GestionModelosConsultasEditPartFactory implements EditPartFactory {

	/**
	* @generated
	*/
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry
					.getVisualID(view)) {

			case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ProyeccionEditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ProyeccionEditPart(view);

			case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ConsolidadoEditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ConsolidadoEditPart(view);

			case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ConsolidadoNombreEditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ConsolidadoNombreEditPart(view);

			case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.DetalladoEditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_PROYECCION.edit.parts.DetalladoEditPart(view);

			case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.DetalladoNombreEditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_PROYECCION.edit.parts.DetalladoNombreEditPart(view);

			case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.PlanillaEditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_PROYECCION.edit.parts.PlanillaEditPart(view);

			case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.PlanillaNombreEditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_PROYECCION.edit.parts.PlanillaNombreEditPart(view);

			case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.PropietarioEditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_PROYECCION.edit.parts.PropietarioEditPart(view);

			case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.PropietarioNombreEditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_PROYECCION.edit.parts.PropietarioNombreEditPart(view);

			case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.TramaEditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_PROYECCION.edit.parts.TramaEditPart(view);

			case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.TramaNombreEditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_PROYECCION.edit.parts.TramaNombreEditPart(view);

			case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.TransaccionEditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_PROYECCION.edit.parts.TransaccionEditPart(view);

			case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.TransaccionNombreEditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_PROYECCION.edit.parts.TransaccionNombreEditPart(view);

			case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.CampoEditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_PROYECCION.edit.parts.CampoEditPart(view);

			case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.CampoNombreCampoEditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_PROYECCION.edit.parts.CampoNombreCampoEditPart(view);

			case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo2EditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo2EditPart(view);

			case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.CampoNombreCampo2EditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_PROYECCION.edit.parts.CampoNombreCampo2EditPart(view);

			case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo3EditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo3EditPart(view);

			case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.CampoNombreCampo3EditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_PROYECCION.edit.parts.CampoNombreCampo3EditPart(view);

			case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo4EditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo4EditPart(view);

			case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.CampoNombreCampo4EditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_PROYECCION.edit.parts.CampoNombreCampo4EditPart(view);

			case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo5EditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo5EditPart(view);

			case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.CampoNombreCampo5EditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_PROYECCION.edit.parts.CampoNombreCampo5EditPart(view);

			case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo6EditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo6EditPart(view);

			case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.CampoNombreCampo6EditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_PROYECCION.edit.parts.CampoNombreCampo6EditPart(view);

			case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ConsolidadoCompartmentConsolidadoEditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ConsolidadoCompartmentConsolidadoEditPart(
						view);

			case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.DetalladoCompartmentDetalladoEditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_PROYECCION.edit.parts.DetalladoCompartmentDetalladoEditPart(
						view);

			case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.PlanillaCompartmentPlanillaEditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_PROYECCION.edit.parts.PlanillaCompartmentPlanillaEditPart(
						view);

			case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.PropietarioCompartmentPropietarioEditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_PROYECCION.edit.parts.PropietarioCompartmentPropietarioEditPart(
						view);

			case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.TramaCompartmentTramaEditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_PROYECCION.edit.parts.TramaCompartmentTramaEditPart(view);

			case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.TransaccionCompartmentTransaccionEditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_PROYECCION.edit.parts.TransaccionCompartmentTransaccionEditPart(
						view);

			case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.RelacionEditPart.VISUAL_ID:
				return new gestionmodelosconsultas.diagram_PROYECCION.edit.parts.RelacionEditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	* @generated
	*/
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	* @generated
	*/
	public static CellEditorLocator getTextCellEditorLocator(ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE.getTextCellEditorLocator(source);
	}

}
