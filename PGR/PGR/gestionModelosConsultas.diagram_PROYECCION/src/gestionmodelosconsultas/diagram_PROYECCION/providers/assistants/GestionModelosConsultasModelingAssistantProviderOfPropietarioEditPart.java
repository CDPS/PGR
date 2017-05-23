package gestionmodelosconsultas.diagram_PROYECCION.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class GestionModelosConsultasModelingAssistantProviderOfPropietarioEditPart
		extends gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Campo_3004);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource(
				(gestionmodelosconsultas.diagram_PROYECCION.edit.parts.PropietarioEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(
			gestionmodelosconsultas.diagram_PROYECCION.edit.parts.PropietarioEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(
				gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Relacion_4001);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget(
				(gestionmodelosconsultas.diagram_PROYECCION.edit.parts.PropietarioEditPart) sourceEditPart,
				targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(
			gestionmodelosconsultas.diagram_PROYECCION.edit.parts.PropietarioEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ConsolidadoEditPart) {
			types.add(
					gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Relacion_4001);
		}
		if (targetEditPart instanceof gestionmodelosconsultas.diagram_PROYECCION.edit.parts.DetalladoEditPart) {
			types.add(
					gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Relacion_4001);
		}
		if (targetEditPart instanceof gestionmodelosconsultas.diagram_PROYECCION.edit.parts.PlanillaEditPart) {
			types.add(
					gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Relacion_4001);
		}
		if (targetEditPart instanceof gestionmodelosconsultas.diagram_PROYECCION.edit.parts.PropietarioEditPart) {
			types.add(
					gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Relacion_4001);
		}
		if (targetEditPart instanceof gestionmodelosconsultas.diagram_PROYECCION.edit.parts.TramaEditPart) {
			types.add(
					gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Relacion_4001);
		}
		if (targetEditPart instanceof gestionmodelosconsultas.diagram_PROYECCION.edit.parts.TransaccionEditPart) {
			types.add(
					gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Relacion_4001);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget(
				(gestionmodelosconsultas.diagram_PROYECCION.edit.parts.PropietarioEditPart) sourceEditPart,
				relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(
			gestionmodelosconsultas.diagram_PROYECCION.edit.parts.PropietarioEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Relacion_4001) {
			types.add(
					gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Consolidado_2001);
			types.add(
					gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Detallado_2002);
			types.add(
					gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Planilla_2003);
			types.add(
					gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Propietario_2004);
			types.add(
					gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Trama_2005);
			types.add(
					gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Transaccion_2006);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget(
				(gestionmodelosconsultas.diagram_PROYECCION.edit.parts.PropietarioEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(
			gestionmodelosconsultas.diagram_PROYECCION.edit.parts.PropietarioEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(
				gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Relacion_4001);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource(
				(gestionmodelosconsultas.diagram_PROYECCION.edit.parts.PropietarioEditPart) targetEditPart,
				relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(
			gestionmodelosconsultas.diagram_PROYECCION.edit.parts.PropietarioEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Relacion_4001) {
			types.add(
					gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Consolidado_2001);
			types.add(
					gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Detallado_2002);
			types.add(
					gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Planilla_2003);
			types.add(
					gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Propietario_2004);
			types.add(
					gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Trama_2005);
			types.add(
					gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Transaccion_2006);
		}
		return types;
	}

}
