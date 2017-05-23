package gestionmodelosconsultas.diagram_PROYECCION.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import gestionmodelosconsultas.modeloconsultas.cotracir.CotracirPackage;
import gestionmodelosconsultas.modeloconsultas.model.ModelPackage;
import gestionmodelosconsultas.modeloconsultas.model.Proyeccion;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class GestionModelosConsultasVisualIDRegistry {

	/**
	* @generated
	*/
	private static final String DEBUG_KEY = "gestionModelosConsultas.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	* @generated
	*/
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ProyeccionEditPart.MODEL_ID
					.equals(view.getType())) {
				return gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ProyeccionEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry
				.getVisualID(view.getType());
	}

	/**
	* @generated
	*/
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	* @generated
	*/
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(Platform.getDebugOption(DEBUG_KEY))) {
				gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasDiagramEditorPlugin.getInstance()
						.logError("Unable to parse view type as a visualID number: " + type);
			}
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	* @generated
	*/
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (ModelPackage.eINSTANCE.getProyeccion().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((Proyeccion) domainElement)) {
			return gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ProyeccionEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry
				.getModelID(containerView);
		if (!gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ProyeccionEditPart.MODEL_ID
				.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ProyeccionEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ProyeccionEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ProyeccionEditPart.VISUAL_ID:
			if (CotracirPackage.eINSTANCE.getConsolidado().isSuperTypeOf(domainElement.eClass())) {
				return gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ConsolidadoEditPart.VISUAL_ID;
			}
			if (CotracirPackage.eINSTANCE.getDetallado().isSuperTypeOf(domainElement.eClass())) {
				return gestionmodelosconsultas.diagram_PROYECCION.edit.parts.DetalladoEditPart.VISUAL_ID;
			}
			if (CotracirPackage.eINSTANCE.getPlanilla().isSuperTypeOf(domainElement.eClass())) {
				return gestionmodelosconsultas.diagram_PROYECCION.edit.parts.PlanillaEditPart.VISUAL_ID;
			}
			if (CotracirPackage.eINSTANCE.getPropietario().isSuperTypeOf(domainElement.eClass())) {
				return gestionmodelosconsultas.diagram_PROYECCION.edit.parts.PropietarioEditPart.VISUAL_ID;
			}
			if (CotracirPackage.eINSTANCE.getTrama().isSuperTypeOf(domainElement.eClass())) {
				return gestionmodelosconsultas.diagram_PROYECCION.edit.parts.TramaEditPart.VISUAL_ID;
			}
			if (CotracirPackage.eINSTANCE.getTransaccion().isSuperTypeOf(domainElement.eClass())) {
				return gestionmodelosconsultas.diagram_PROYECCION.edit.parts.TransaccionEditPart.VISUAL_ID;
			}
			break;
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ConsolidadoCompartmentConsolidadoEditPart.VISUAL_ID:
			if (ModelPackage.eINSTANCE.getCampo().isSuperTypeOf(domainElement.eClass())) {
				return gestionmodelosconsultas.diagram_PROYECCION.edit.parts.CampoEditPart.VISUAL_ID;
			}
			break;
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.DetalladoCompartmentDetalladoEditPart.VISUAL_ID:
			if (ModelPackage.eINSTANCE.getCampo().isSuperTypeOf(domainElement.eClass())) {
				return gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo2EditPart.VISUAL_ID;
			}
			break;
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.PlanillaCompartmentPlanillaEditPart.VISUAL_ID:
			if (ModelPackage.eINSTANCE.getCampo().isSuperTypeOf(domainElement.eClass())) {
				return gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo3EditPart.VISUAL_ID;
			}
			break;
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.PropietarioCompartmentPropietarioEditPart.VISUAL_ID:
			if (ModelPackage.eINSTANCE.getCampo().isSuperTypeOf(domainElement.eClass())) {
				return gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo4EditPart.VISUAL_ID;
			}
			break;
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.TramaCompartmentTramaEditPart.VISUAL_ID:
			if (ModelPackage.eINSTANCE.getCampo().isSuperTypeOf(domainElement.eClass())) {
				return gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo5EditPart.VISUAL_ID;
			}
			break;
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.TransaccionCompartmentTransaccionEditPart.VISUAL_ID:
			if (ModelPackage.eINSTANCE.getCampo().isSuperTypeOf(domainElement.eClass())) {
				return gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo6EditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry
				.getModelID(containerView);
		if (!gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ProyeccionEditPart.MODEL_ID
				.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ProyeccionEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ProyeccionEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ProyeccionEditPart.VISUAL_ID:
			if (gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ConsolidadoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (gestionmodelosconsultas.diagram_PROYECCION.edit.parts.DetalladoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (gestionmodelosconsultas.diagram_PROYECCION.edit.parts.PlanillaEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (gestionmodelosconsultas.diagram_PROYECCION.edit.parts.PropietarioEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (gestionmodelosconsultas.diagram_PROYECCION.edit.parts.TramaEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (gestionmodelosconsultas.diagram_PROYECCION.edit.parts.TransaccionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ConsolidadoEditPart.VISUAL_ID:
			if (gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ConsolidadoNombreEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ConsolidadoCompartmentConsolidadoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.DetalladoEditPart.VISUAL_ID:
			if (gestionmodelosconsultas.diagram_PROYECCION.edit.parts.DetalladoNombreEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (gestionmodelosconsultas.diagram_PROYECCION.edit.parts.DetalladoCompartmentDetalladoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.PlanillaEditPart.VISUAL_ID:
			if (gestionmodelosconsultas.diagram_PROYECCION.edit.parts.PlanillaNombreEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (gestionmodelosconsultas.diagram_PROYECCION.edit.parts.PlanillaCompartmentPlanillaEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.PropietarioEditPart.VISUAL_ID:
			if (gestionmodelosconsultas.diagram_PROYECCION.edit.parts.PropietarioNombreEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (gestionmodelosconsultas.diagram_PROYECCION.edit.parts.PropietarioCompartmentPropietarioEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.TramaEditPart.VISUAL_ID:
			if (gestionmodelosconsultas.diagram_PROYECCION.edit.parts.TramaNombreEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (gestionmodelosconsultas.diagram_PROYECCION.edit.parts.TramaCompartmentTramaEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.TransaccionEditPart.VISUAL_ID:
			if (gestionmodelosconsultas.diagram_PROYECCION.edit.parts.TransaccionNombreEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (gestionmodelosconsultas.diagram_PROYECCION.edit.parts.TransaccionCompartmentTransaccionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.CampoEditPart.VISUAL_ID:
			if (gestionmodelosconsultas.diagram_PROYECCION.edit.parts.CampoNombreCampoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo2EditPart.VISUAL_ID:
			if (gestionmodelosconsultas.diagram_PROYECCION.edit.parts.CampoNombreCampo2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo3EditPart.VISUAL_ID:
			if (gestionmodelosconsultas.diagram_PROYECCION.edit.parts.CampoNombreCampo3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo4EditPart.VISUAL_ID:
			if (gestionmodelosconsultas.diagram_PROYECCION.edit.parts.CampoNombreCampo4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo5EditPart.VISUAL_ID:
			if (gestionmodelosconsultas.diagram_PROYECCION.edit.parts.CampoNombreCampo5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo6EditPart.VISUAL_ID:
			if (gestionmodelosconsultas.diagram_PROYECCION.edit.parts.CampoNombreCampo6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ConsolidadoCompartmentConsolidadoEditPart.VISUAL_ID:
			if (gestionmodelosconsultas.diagram_PROYECCION.edit.parts.CampoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.DetalladoCompartmentDetalladoEditPart.VISUAL_ID:
			if (gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.PlanillaCompartmentPlanillaEditPart.VISUAL_ID:
			if (gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.PropietarioCompartmentPropietarioEditPart.VISUAL_ID:
			if (gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.TramaCompartmentTramaEditPart.VISUAL_ID:
			if (gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.TransaccionCompartmentTransaccionEditPart.VISUAL_ID:
			if (gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (ModelPackage.eINSTANCE.getRelacion().isSuperTypeOf(domainElement.eClass())) {
			return gestionmodelosconsultas.diagram_PROYECCION.edit.parts.RelacionEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* User can change implementation of this method to handle some specific
	* situations not covered by default logic.
	* 
	* @generated
	*/
	private static boolean isDiagram(Proyeccion element) {
		return true;
	}

	/**
	* @generated
	*/
	public static boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	* @generated
	*/
	public static boolean isCompartmentVisualID(int visualID) {
		switch (visualID) {
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ConsolidadoCompartmentConsolidadoEditPart.VISUAL_ID:
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.DetalladoCompartmentDetalladoEditPart.VISUAL_ID:
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.PlanillaCompartmentPlanillaEditPart.VISUAL_ID:
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.PropietarioCompartmentPropietarioEditPart.VISUAL_ID:
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.TramaCompartmentTramaEditPart.VISUAL_ID:
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.TransaccionCompartmentTransaccionEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ProyeccionEditPart.VISUAL_ID:
			return false;
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.CampoEditPart.VISUAL_ID:
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo2EditPart.VISUAL_ID:
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo3EditPart.VISUAL_ID:
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo4EditPart.VISUAL_ID:
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo5EditPart.VISUAL_ID:
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo6EditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		* @generated
		*/

		public int getVisualID(View view) {
			return gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry
					.getVisualID(view);
		}

		/**
		* @generated
		*/

		public String getModelID(View view) {
			return gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry
					.getModelID(view);
		}

		/**
		* @generated
		*/

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry
					.getNodeVisualID(containerView, domainElement);
		}

		/**
		* @generated
		*/

		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry
					.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		* @generated
		*/

		public boolean isCompartmentVisualID(int visualID) {
			return gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		* @generated
		*/

		public boolean isSemanticLeafVisualID(int visualID) {
			return gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
