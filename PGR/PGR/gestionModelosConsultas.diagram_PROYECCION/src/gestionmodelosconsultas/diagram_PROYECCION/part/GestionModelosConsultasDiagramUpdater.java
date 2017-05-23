package gestionmodelosconsultas.diagram_PROYECCION.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import gestionmodelosconsultas.modeloconsultas.cotracir.Consolidado;
import gestionmodelosconsultas.modeloconsultas.cotracir.Detallado;
import gestionmodelosconsultas.modeloconsultas.cotracir.Planilla;
import gestionmodelosconsultas.modeloconsultas.cotracir.Propietario;
import gestionmodelosconsultas.modeloconsultas.cotracir.Trama;
import gestionmodelosconsultas.modeloconsultas.cotracir.Transaccion;
import gestionmodelosconsultas.modeloconsultas.model.Campo;
import gestionmodelosconsultas.modeloconsultas.model.EADiagram;
import gestionmodelosconsultas.modeloconsultas.model.ElementoConsulta;
import gestionmodelosconsultas.modeloconsultas.model.ModelPackage;
import gestionmodelosconsultas.modeloconsultas.model.Proyeccion;
import gestionmodelosconsultas.modeloconsultas.model.Relacion;

/**
 * @generated
 */
public class GestionModelosConsultasDiagramUpdater {

	/**
	* @generated
	*/
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasNodeDescriptor> getSemanticChildren(
			View view) {
		switch (gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry
				.getVisualID(view)) {
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ProyeccionEditPart.VISUAL_ID:
			return getProyeccion_1000SemanticChildren(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ConsolidadoCompartmentConsolidadoEditPart.VISUAL_ID:
			return getConsolidadoCompartmentConsolidado_7001SemanticChildren(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.DetalladoCompartmentDetalladoEditPart.VISUAL_ID:
			return getDetalladoCompartmentDetallado_7002SemanticChildren(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.PlanillaCompartmentPlanillaEditPart.VISUAL_ID:
			return getPlanillaCompartmentPlanilla_7003SemanticChildren(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.PropietarioCompartmentPropietarioEditPart.VISUAL_ID:
			return getPropietarioCompartmentPropietario_7004SemanticChildren(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.TramaCompartmentTramaEditPart.VISUAL_ID:
			return getTramaCompartmentTrama_7005SemanticChildren(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.TransaccionCompartmentTransaccionEditPart.VISUAL_ID:
			return getTransaccionCompartmentTransaccion_7006SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasNodeDescriptor> getProyeccion_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Proyeccion modelElement = (Proyeccion) view.getElement();
		LinkedList<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasNodeDescriptor> result = new LinkedList<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasNodeDescriptor>();
		for (Iterator<?> it = modelElement.getListElementoConsulta().iterator(); it.hasNext();) {
			ElementoConsulta childElement = (ElementoConsulta) it.next();
			int visualID = gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ConsolidadoEditPart.VISUAL_ID) {
				result.add(new gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == gestionmodelosconsultas.diagram_PROYECCION.edit.parts.DetalladoEditPart.VISUAL_ID) {
				result.add(new gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == gestionmodelosconsultas.diagram_PROYECCION.edit.parts.PlanillaEditPart.VISUAL_ID) {
				result.add(new gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == gestionmodelosconsultas.diagram_PROYECCION.edit.parts.PropietarioEditPart.VISUAL_ID) {
				result.add(new gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == gestionmodelosconsultas.diagram_PROYECCION.edit.parts.TramaEditPart.VISUAL_ID) {
				result.add(new gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == gestionmodelosconsultas.diagram_PROYECCION.edit.parts.TransaccionEditPart.VISUAL_ID) {
				result.add(new gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasNodeDescriptor> getConsolidadoCompartmentConsolidado_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Consolidado modelElement = (Consolidado) containerView.getElement();
		LinkedList<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasNodeDescriptor> result = new LinkedList<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasNodeDescriptor>();
		for (Iterator<?> it = modelElement.getListCampos().iterator(); it.hasNext();) {
			Campo childElement = (Campo) it.next();
			int visualID = gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == gestionmodelosconsultas.diagram_PROYECCION.edit.parts.CampoEditPart.VISUAL_ID) {
				result.add(new gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasNodeDescriptor> getDetalladoCompartmentDetallado_7002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Detallado modelElement = (Detallado) containerView.getElement();
		LinkedList<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasNodeDescriptor> result = new LinkedList<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasNodeDescriptor>();
		for (Iterator<?> it = modelElement.getListCampos().iterator(); it.hasNext();) {
			Campo childElement = (Campo) it.next();
			int visualID = gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo2EditPart.VISUAL_ID) {
				result.add(new gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasNodeDescriptor> getPlanillaCompartmentPlanilla_7003SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Planilla modelElement = (Planilla) containerView.getElement();
		LinkedList<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasNodeDescriptor> result = new LinkedList<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasNodeDescriptor>();
		for (Iterator<?> it = modelElement.getListCampos().iterator(); it.hasNext();) {
			Campo childElement = (Campo) it.next();
			int visualID = gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo3EditPart.VISUAL_ID) {
				result.add(new gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasNodeDescriptor> getPropietarioCompartmentPropietario_7004SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Propietario modelElement = (Propietario) containerView.getElement();
		LinkedList<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasNodeDescriptor> result = new LinkedList<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasNodeDescriptor>();
		for (Iterator<?> it = modelElement.getListCampos().iterator(); it.hasNext();) {
			Campo childElement = (Campo) it.next();
			int visualID = gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo4EditPart.VISUAL_ID) {
				result.add(new gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasNodeDescriptor> getTramaCompartmentTrama_7005SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Trama modelElement = (Trama) containerView.getElement();
		LinkedList<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasNodeDescriptor> result = new LinkedList<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasNodeDescriptor>();
		for (Iterator<?> it = modelElement.getListCampos().iterator(); it.hasNext();) {
			Campo childElement = (Campo) it.next();
			int visualID = gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo5EditPart.VISUAL_ID) {
				result.add(new gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasNodeDescriptor> getTransaccionCompartmentTransaccion_7006SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Transaccion modelElement = (Transaccion) containerView.getElement();
		LinkedList<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasNodeDescriptor> result = new LinkedList<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasNodeDescriptor>();
		for (Iterator<?> it = modelElement.getListCampos().iterator(); it.hasNext();) {
			Campo childElement = (Campo) it.next();
			int visualID = gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo6EditPart.VISUAL_ID) {
				result.add(new gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> getContainedLinks(
			View view) {
		switch (gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry
				.getVisualID(view)) {
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ProyeccionEditPart.VISUAL_ID:
			return getProyeccion_1000ContainedLinks(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ConsolidadoEditPart.VISUAL_ID:
			return getConsolidado_2001ContainedLinks(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.DetalladoEditPart.VISUAL_ID:
			return getDetallado_2002ContainedLinks(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.PlanillaEditPart.VISUAL_ID:
			return getPlanilla_2003ContainedLinks(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.PropietarioEditPart.VISUAL_ID:
			return getPropietario_2004ContainedLinks(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.TramaEditPart.VISUAL_ID:
			return getTrama_2005ContainedLinks(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.TransaccionEditPart.VISUAL_ID:
			return getTransaccion_2006ContainedLinks(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.CampoEditPart.VISUAL_ID:
			return getCampo_3001ContainedLinks(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo2EditPart.VISUAL_ID:
			return getCampo_3002ContainedLinks(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo3EditPart.VISUAL_ID:
			return getCampo_3003ContainedLinks(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo4EditPart.VISUAL_ID:
			return getCampo_3004ContainedLinks(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo5EditPart.VISUAL_ID:
			return getCampo_3005ContainedLinks(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo6EditPart.VISUAL_ID:
			return getCampo_3006ContainedLinks(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.RelacionEditPart.VISUAL_ID:
			return getRelacion_4001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> getIncomingLinks(
			View view) {
		switch (gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry
				.getVisualID(view)) {
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ConsolidadoEditPart.VISUAL_ID:
			return getConsolidado_2001IncomingLinks(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.DetalladoEditPart.VISUAL_ID:
			return getDetallado_2002IncomingLinks(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.PlanillaEditPart.VISUAL_ID:
			return getPlanilla_2003IncomingLinks(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.PropietarioEditPart.VISUAL_ID:
			return getPropietario_2004IncomingLinks(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.TramaEditPart.VISUAL_ID:
			return getTrama_2005IncomingLinks(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.TransaccionEditPart.VISUAL_ID:
			return getTransaccion_2006IncomingLinks(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.CampoEditPart.VISUAL_ID:
			return getCampo_3001IncomingLinks(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo2EditPart.VISUAL_ID:
			return getCampo_3002IncomingLinks(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo3EditPart.VISUAL_ID:
			return getCampo_3003IncomingLinks(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo4EditPart.VISUAL_ID:
			return getCampo_3004IncomingLinks(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo5EditPart.VISUAL_ID:
			return getCampo_3005IncomingLinks(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo6EditPart.VISUAL_ID:
			return getCampo_3006IncomingLinks(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.RelacionEditPart.VISUAL_ID:
			return getRelacion_4001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> getOutgoingLinks(
			View view) {
		switch (gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry
				.getVisualID(view)) {
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ConsolidadoEditPart.VISUAL_ID:
			return getConsolidado_2001OutgoingLinks(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.DetalladoEditPart.VISUAL_ID:
			return getDetallado_2002OutgoingLinks(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.PlanillaEditPart.VISUAL_ID:
			return getPlanilla_2003OutgoingLinks(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.PropietarioEditPart.VISUAL_ID:
			return getPropietario_2004OutgoingLinks(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.TramaEditPart.VISUAL_ID:
			return getTrama_2005OutgoingLinks(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.TransaccionEditPart.VISUAL_ID:
			return getTransaccion_2006OutgoingLinks(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.CampoEditPart.VISUAL_ID:
			return getCampo_3001OutgoingLinks(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo2EditPart.VISUAL_ID:
			return getCampo_3002OutgoingLinks(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo3EditPart.VISUAL_ID:
			return getCampo_3003OutgoingLinks(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo4EditPart.VISUAL_ID:
			return getCampo_3004OutgoingLinks(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo5EditPart.VISUAL_ID:
			return getCampo_3005OutgoingLinks(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo6EditPart.VISUAL_ID:
			return getCampo_3006OutgoingLinks(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.RelacionEditPart.VISUAL_ID:
			return getRelacion_4001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> getProyeccion_1000ContainedLinks(
			View view) {
		Proyeccion modelElement = (Proyeccion) view.getElement();
		LinkedList<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> result = new LinkedList<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Relacion_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> getConsolidado_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> getDetallado_2002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> getPlanilla_2003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> getPropietario_2004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> getTrama_2005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> getTransaccion_2006ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> getCampo_3001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> getCampo_3002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> getCampo_3003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> getCampo_3004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> getCampo_3005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> getCampo_3006ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> getRelacion_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> getConsolidado_2001IncomingLinks(
			View view) {
		Consolidado modelElement = (Consolidado) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> result = new LinkedList<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Relacion_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> getDetallado_2002IncomingLinks(
			View view) {
		Detallado modelElement = (Detallado) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> result = new LinkedList<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Relacion_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> getPlanilla_2003IncomingLinks(
			View view) {
		Planilla modelElement = (Planilla) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> result = new LinkedList<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Relacion_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> getPropietario_2004IncomingLinks(
			View view) {
		Propietario modelElement = (Propietario) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> result = new LinkedList<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Relacion_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> getTrama_2005IncomingLinks(
			View view) {
		Trama modelElement = (Trama) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> result = new LinkedList<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Relacion_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> getTransaccion_2006IncomingLinks(
			View view) {
		Transaccion modelElement = (Transaccion) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> result = new LinkedList<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Relacion_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> getCampo_3001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> getCampo_3002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> getCampo_3003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> getCampo_3004IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> getCampo_3005IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> getCampo_3006IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> getRelacion_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> getConsolidado_2001OutgoingLinks(
			View view) {
		Consolidado modelElement = (Consolidado) view.getElement();
		LinkedList<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> result = new LinkedList<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Relacion_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> getDetallado_2002OutgoingLinks(
			View view) {
		Detallado modelElement = (Detallado) view.getElement();
		LinkedList<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> result = new LinkedList<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Relacion_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> getPlanilla_2003OutgoingLinks(
			View view) {
		Planilla modelElement = (Planilla) view.getElement();
		LinkedList<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> result = new LinkedList<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Relacion_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> getPropietario_2004OutgoingLinks(
			View view) {
		Propietario modelElement = (Propietario) view.getElement();
		LinkedList<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> result = new LinkedList<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Relacion_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> getTrama_2005OutgoingLinks(
			View view) {
		Trama modelElement = (Trama) view.getElement();
		LinkedList<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> result = new LinkedList<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Relacion_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> getTransaccion_2006OutgoingLinks(
			View view) {
		Transaccion modelElement = (Transaccion) view.getElement();
		LinkedList<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> result = new LinkedList<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Relacion_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> getCampo_3001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> getCampo_3002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> getCampo_3003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> getCampo_3004OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> getCampo_3005OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> getCampo_3006OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> getRelacion_4001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	private static Collection<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> getContainedTypeModelFacetLinks_Relacion_4001(
			EADiagram container) {
		LinkedList<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> result = new LinkedList<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor>();
		for (Iterator<?> links = container.getListRelacion().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Relacion) {
				continue;
			}
			Relacion link = (Relacion) linkObject;
			if (gestionmodelosconsultas.diagram_PROYECCION.edit.parts.RelacionEditPart.VISUAL_ID != gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ElementoConsulta dst = link.getTarget();
			ElementoConsulta src = link.getSource();
			result.add(new gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor(src,
					dst, link,
					gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Relacion_4001,
					gestionmodelosconsultas.diagram_PROYECCION.edit.parts.RelacionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> getIncomingTypeModelFacetLinks_Relacion_4001(
			ElementoConsulta target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> result = new LinkedList<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != ModelPackage.eINSTANCE.getRelacion_Target()
					|| false == setting.getEObject() instanceof Relacion) {
				continue;
			}
			Relacion link = (Relacion) setting.getEObject();
			if (gestionmodelosconsultas.diagram_PROYECCION.edit.parts.RelacionEditPart.VISUAL_ID != gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ElementoConsulta src = link.getSource();
			result.add(new gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor(src,
					target, link,
					gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Relacion_4001,
					gestionmodelosconsultas.diagram_PROYECCION.edit.parts.RelacionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> getOutgoingTypeModelFacetLinks_Relacion_4001(
			ElementoConsulta source) {
		EADiagram container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof EADiagram) {
				container = (EADiagram) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> result = new LinkedList<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor>();
		for (Iterator<?> links = container.getListRelacion().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Relacion) {
				continue;
			}
			Relacion link = (Relacion) linkObject;
			if (gestionmodelosconsultas.diagram_PROYECCION.edit.parts.RelacionEditPart.VISUAL_ID != gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ElementoConsulta dst = link.getTarget();
			ElementoConsulta src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor(src,
					dst, link,
					gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Relacion_4001,
					gestionmodelosconsultas.diagram_PROYECCION.edit.parts.RelacionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		* @generated
		*/

		public List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasNodeDescriptor> getSemanticChildren(
				View view) {
			return GestionModelosConsultasDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/

		public List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> getContainedLinks(
				View view) {
			return GestionModelosConsultasDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/

		public List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> getIncomingLinks(
				View view) {
			return GestionModelosConsultasDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/

		public List<gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasLinkDescriptor> getOutgoingLinks(
				View view) {
			return GestionModelosConsultasDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
