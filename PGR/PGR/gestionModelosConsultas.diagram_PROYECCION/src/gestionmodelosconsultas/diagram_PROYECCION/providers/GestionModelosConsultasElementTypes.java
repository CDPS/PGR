package gestionmodelosconsultas.diagram_PROYECCION.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

import gestionmodelosconsultas.modeloconsultas.cotracir.CotracirPackage;
import gestionmodelosconsultas.modeloconsultas.model.ModelPackage;

/**
 * @generated
 */
public class GestionModelosConsultasElementTypes {

	/**
	* @generated
	*/
	private GestionModelosConsultasElementTypes() {
	}

	/**
	* @generated
	*/
	private static Map<IElementType, ENamedElement> elements;

	/**
	* @generated
	*/
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasDiagramEditorPlugin.getInstance()
					.getItemProvidersAdapterFactory());

	/**
	* @generated
	*/
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	* @generated
	*/
	public static final IElementType Proyeccion_1000 = getElementType(
			"gestionModelosConsultas.diagram.Proyeccion_1000"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Consolidado_2001 = getElementType(
			"gestionModelosConsultas.diagram.Consolidado_2001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Detallado_2002 = getElementType("gestionModelosConsultas.diagram.Detallado_2002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Planilla_2003 = getElementType("gestionModelosConsultas.diagram.Planilla_2003"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Propietario_2004 = getElementType(
			"gestionModelosConsultas.diagram.Propietario_2004"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Trama_2005 = getElementType("gestionModelosConsultas.diagram.Trama_2005"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Transaccion_2006 = getElementType(
			"gestionModelosConsultas.diagram.Transaccion_2006"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Campo_3001 = getElementType("gestionModelosConsultas.diagram.Campo_3001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Campo_3002 = getElementType("gestionModelosConsultas.diagram.Campo_3002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Campo_3003 = getElementType("gestionModelosConsultas.diagram.Campo_3003"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Campo_3004 = getElementType("gestionModelosConsultas.diagram.Campo_3004"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Campo_3005 = getElementType("gestionModelosConsultas.diagram.Campo_3005"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Campo_3006 = getElementType("gestionModelosConsultas.diagram.Campo_3006"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Relacion_4001 = getElementType("gestionModelosConsultas.diagram.Relacion_4001"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	* @generated
	*/
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	* @generated
	*/
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	* Returns 'type' of the ecore object associated with the hint.
	* 
	* @generated
	*/
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(Proyeccion_1000, ModelPackage.eINSTANCE.getProyeccion());

			elements.put(Consolidado_2001, CotracirPackage.eINSTANCE.getConsolidado());

			elements.put(Detallado_2002, CotracirPackage.eINSTANCE.getDetallado());

			elements.put(Planilla_2003, CotracirPackage.eINSTANCE.getPlanilla());

			elements.put(Propietario_2004, CotracirPackage.eINSTANCE.getPropietario());

			elements.put(Trama_2005, CotracirPackage.eINSTANCE.getTrama());

			elements.put(Transaccion_2006, CotracirPackage.eINSTANCE.getTransaccion());

			elements.put(Campo_3001, ModelPackage.eINSTANCE.getCampo());

			elements.put(Campo_3002, ModelPackage.eINSTANCE.getCampo());

			elements.put(Campo_3003, ModelPackage.eINSTANCE.getCampo());

			elements.put(Campo_3004, ModelPackage.eINSTANCE.getCampo());

			elements.put(Campo_3005, ModelPackage.eINSTANCE.getCampo());

			elements.put(Campo_3006, ModelPackage.eINSTANCE.getCampo());

			elements.put(Relacion_4001, ModelPackage.eINSTANCE.getRelacion());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	* @generated
	*/
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	* @generated
	*/
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(Proyeccion_1000);
			KNOWN_ELEMENT_TYPES.add(Consolidado_2001);
			KNOWN_ELEMENT_TYPES.add(Detallado_2002);
			KNOWN_ELEMENT_TYPES.add(Planilla_2003);
			KNOWN_ELEMENT_TYPES.add(Propietario_2004);
			KNOWN_ELEMENT_TYPES.add(Trama_2005);
			KNOWN_ELEMENT_TYPES.add(Transaccion_2006);
			KNOWN_ELEMENT_TYPES.add(Campo_3001);
			KNOWN_ELEMENT_TYPES.add(Campo_3002);
			KNOWN_ELEMENT_TYPES.add(Campo_3003);
			KNOWN_ELEMENT_TYPES.add(Campo_3004);
			KNOWN_ELEMENT_TYPES.add(Campo_3005);
			KNOWN_ELEMENT_TYPES.add(Campo_3006);
			KNOWN_ELEMENT_TYPES.add(Relacion_4001);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	* @generated
	*/
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ProyeccionEditPart.VISUAL_ID:
			return Proyeccion_1000;
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ConsolidadoEditPart.VISUAL_ID:
			return Consolidado_2001;
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.DetalladoEditPart.VISUAL_ID:
			return Detallado_2002;
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.PlanillaEditPart.VISUAL_ID:
			return Planilla_2003;
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.PropietarioEditPart.VISUAL_ID:
			return Propietario_2004;
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.TramaEditPart.VISUAL_ID:
			return Trama_2005;
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.TransaccionEditPart.VISUAL_ID:
			return Transaccion_2006;
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.CampoEditPart.VISUAL_ID:
			return Campo_3001;
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo2EditPart.VISUAL_ID:
			return Campo_3002;
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo3EditPart.VISUAL_ID:
			return Campo_3003;
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo4EditPart.VISUAL_ID:
			return Campo_3004;
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo5EditPart.VISUAL_ID:
			return Campo_3005;
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo6EditPart.VISUAL_ID:
			return Campo_3006;
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.RelacionEditPart.VISUAL_ID:
			return Relacion_4001;
		}
		return null;
	}

	/**
	* @generated
	*/
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(elementTypeImages) {

		/**
		* @generated
		*/
		@Override

		public boolean isKnownElementType(IElementType elementType) {
			return gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes
					.isKnownElementType(elementType);
		}

		/**
		* @generated
		*/
		@Override

		public IElementType getElementTypeForVisualId(int visualID) {
			return gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes
					.getElementType(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public ENamedElement getDefiningNamedElement(IAdaptable elementTypeAdapter) {
			return gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes
					.getElement(elementTypeAdapter);
		}
	};

}
