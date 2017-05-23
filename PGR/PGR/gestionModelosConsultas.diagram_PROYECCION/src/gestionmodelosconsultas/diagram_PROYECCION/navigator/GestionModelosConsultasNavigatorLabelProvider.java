package gestionmodelosconsultas.diagram_PROYECCION.navigator;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

import gestionmodelosconsultas.modeloconsultas.model.Proyeccion;
import gestionmodelosconsultas.modeloconsultas.model.Relacion;

/**
 * @generated
 */
public class GestionModelosConsultasNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	* @generated
	*/
	static {
		gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasDiagramEditorPlugin.getInstance()
				.getImageRegistry().put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasDiagramEditorPlugin.getInstance()
				.getImageRegistry().put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof gestionmodelosconsultas.diagram_PROYECCION.navigator.GestionModelosConsultasNavigatorItem
				&& !isOwnView(
						((gestionmodelosconsultas.diagram_PROYECCION.navigator.GestionModelosConsultasNavigatorItem) element)
								.getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	* @generated
	*/
	public Image getImage(Object element) {
		if (element instanceof gestionmodelosconsultas.diagram_PROYECCION.navigator.GestionModelosConsultasNavigatorGroup) {
			gestionmodelosconsultas.diagram_PROYECCION.navigator.GestionModelosConsultasNavigatorGroup group = (gestionmodelosconsultas.diagram_PROYECCION.navigator.GestionModelosConsultasNavigatorGroup) element;
			return gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasDiagramEditorPlugin
					.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof gestionmodelosconsultas.diagram_PROYECCION.navigator.GestionModelosConsultasNavigatorItem) {
			gestionmodelosconsultas.diagram_PROYECCION.navigator.GestionModelosConsultasNavigatorItem navigatorItem = (gestionmodelosconsultas.diagram_PROYECCION.navigator.GestionModelosConsultasNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	* @generated
	*/
	public Image getImage(View view) {
		switch (gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry
				.getVisualID(view)) {
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ProyeccionEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?http:///gestionmodelosconsultas/modeloconsultas/model.ecore?Proyeccion", //$NON-NLS-1$
					gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Proyeccion_1000);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ConsolidadoEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http:///gestionmodelosconsultas/modeloconsultas/cotracir.ecore?Consolidado", //$NON-NLS-1$
					gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Consolidado_2001);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.DetalladoEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http:///gestionmodelosconsultas/modeloconsultas/cotracir.ecore?Detallado", //$NON-NLS-1$
					gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Detallado_2002);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.PlanillaEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http:///gestionmodelosconsultas/modeloconsultas/cotracir.ecore?Planilla", //$NON-NLS-1$
					gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Planilla_2003);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.PropietarioEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http:///gestionmodelosconsultas/modeloconsultas/cotracir.ecore?Propietario", //$NON-NLS-1$
					gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Propietario_2004);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.TramaEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http:///gestionmodelosconsultas/modeloconsultas/cotracir.ecore?Trama", //$NON-NLS-1$
					gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Trama_2005);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.TransaccionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http:///gestionmodelosconsultas/modeloconsultas/cotracir.ecore?Transaccion", //$NON-NLS-1$
					gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Transaccion_2006);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.CampoEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http:///gestionmodelosconsultas/modeloconsultas/model.ecore?Campo", //$NON-NLS-1$
					gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Campo_3001);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http:///gestionmodelosconsultas/modeloconsultas/model.ecore?Campo", //$NON-NLS-1$
					gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Campo_3002);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http:///gestionmodelosconsultas/modeloconsultas/model.ecore?Campo", //$NON-NLS-1$
					gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Campo_3003);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo4EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http:///gestionmodelosconsultas/modeloconsultas/model.ecore?Campo", //$NON-NLS-1$
					gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Campo_3004);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo5EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http:///gestionmodelosconsultas/modeloconsultas/model.ecore?Campo", //$NON-NLS-1$
					gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Campo_3005);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo6EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http:///gestionmodelosconsultas/modeloconsultas/model.ecore?Campo", //$NON-NLS-1$
					gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Campo_3006);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.RelacionEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http:///gestionmodelosconsultas/modeloconsultas/model.ecore?Relacion", //$NON-NLS-1$
					gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Relacion_4001);
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes
						.isKnownElementType(elementType)) {
			image = gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes
					.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	* @generated
	*/
	public String getText(Object element) {
		if (element instanceof gestionmodelosconsultas.diagram_PROYECCION.navigator.GestionModelosConsultasNavigatorGroup) {
			gestionmodelosconsultas.diagram_PROYECCION.navigator.GestionModelosConsultasNavigatorGroup group = (gestionmodelosconsultas.diagram_PROYECCION.navigator.GestionModelosConsultasNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof gestionmodelosconsultas.diagram_PROYECCION.navigator.GestionModelosConsultasNavigatorItem) {
			gestionmodelosconsultas.diagram_PROYECCION.navigator.GestionModelosConsultasNavigatorItem navigatorItem = (gestionmodelosconsultas.diagram_PROYECCION.navigator.GestionModelosConsultasNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		return super.getText(element);
	}

	/**
	* @generated
	*/
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry
				.getVisualID(view)) {
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ProyeccionEditPart.VISUAL_ID:
			return getProyeccion_1000Text(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ConsolidadoEditPart.VISUAL_ID:
			return getConsolidado_2001Text(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.DetalladoEditPart.VISUAL_ID:
			return getDetallado_2002Text(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.PlanillaEditPart.VISUAL_ID:
			return getPlanilla_2003Text(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.PropietarioEditPart.VISUAL_ID:
			return getPropietario_2004Text(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.TramaEditPart.VISUAL_ID:
			return getTrama_2005Text(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.TransaccionEditPart.VISUAL_ID:
			return getTransaccion_2006Text(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.CampoEditPart.VISUAL_ID:
			return getCampo_3001Text(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo2EditPart.VISUAL_ID:
			return getCampo_3002Text(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo3EditPart.VISUAL_ID:
			return getCampo_3003Text(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo4EditPart.VISUAL_ID:
			return getCampo_3004Text(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo5EditPart.VISUAL_ID:
			return getCampo_3005Text(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo6EditPart.VISUAL_ID:
			return getCampo_3006Text(view);
		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.RelacionEditPart.VISUAL_ID:
			return getRelacion_4001Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	* @generated
	*/
	private String getProyeccion_1000Text(View view) {
		Proyeccion domainModelElement = (Proyeccion) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getNombre();
		} else {
			gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getConsolidado_2001Text(View view) {
		IParser parser = gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasParserProvider
				.getParser(
						gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Consolidado_2001,
						view.getElement() != null ? view.getElement() : view,
						gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry.getType(
								gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ConsolidadoNombreEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getDetallado_2002Text(View view) {
		IParser parser = gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasParserProvider
				.getParser(
						gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Detallado_2002,
						view.getElement() != null ? view.getElement() : view,
						gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry.getType(
								gestionmodelosconsultas.diagram_PROYECCION.edit.parts.DetalladoNombreEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPlanilla_2003Text(View view) {
		IParser parser = gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasParserProvider
				.getParser(
						gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Planilla_2003,
						view.getElement() != null ? view.getElement() : view,
						gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry.getType(
								gestionmodelosconsultas.diagram_PROYECCION.edit.parts.PlanillaNombreEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPropietario_2004Text(View view) {
		IParser parser = gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasParserProvider
				.getParser(
						gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Propietario_2004,
						view.getElement() != null ? view.getElement() : view,
						gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry.getType(
								gestionmodelosconsultas.diagram_PROYECCION.edit.parts.PropietarioNombreEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTrama_2005Text(View view) {
		IParser parser = gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasParserProvider
				.getParser(
						gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Trama_2005,
						view.getElement() != null ? view.getElement() : view,
						gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry.getType(
								gestionmodelosconsultas.diagram_PROYECCION.edit.parts.TramaNombreEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTransaccion_2006Text(View view) {
		IParser parser = gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasParserProvider
				.getParser(
						gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Transaccion_2006,
						view.getElement() != null ? view.getElement() : view,
						gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry.getType(
								gestionmodelosconsultas.diagram_PROYECCION.edit.parts.TransaccionNombreEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5012); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCampo_3001Text(View view) {
		IParser parser = gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasParserProvider
				.getParser(
						gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Campo_3001,
						view.getElement() != null ? view.getElement() : view,
						gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry.getType(
								gestionmodelosconsultas.diagram_PROYECCION.edit.parts.CampoNombreCampoEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCampo_3002Text(View view) {
		IParser parser = gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasParserProvider
				.getParser(
						gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Campo_3002,
						view.getElement() != null ? view.getElement() : view,
						gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry.getType(
								gestionmodelosconsultas.diagram_PROYECCION.edit.parts.CampoNombreCampo2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCampo_3003Text(View view) {
		IParser parser = gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasParserProvider
				.getParser(
						gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Campo_3003,
						view.getElement() != null ? view.getElement() : view,
						gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry.getType(
								gestionmodelosconsultas.diagram_PROYECCION.edit.parts.CampoNombreCampo3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCampo_3004Text(View view) {
		IParser parser = gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasParserProvider
				.getParser(
						gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Campo_3004,
						view.getElement() != null ? view.getElement() : view,
						gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry.getType(
								gestionmodelosconsultas.diagram_PROYECCION.edit.parts.CampoNombreCampo4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCampo_3005Text(View view) {
		IParser parser = gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasParserProvider
				.getParser(
						gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Campo_3005,
						view.getElement() != null ? view.getElement() : view,
						gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry.getType(
								gestionmodelosconsultas.diagram_PROYECCION.edit.parts.CampoNombreCampo5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCampo_3006Text(View view) {
		IParser parser = gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasParserProvider
				.getParser(
						gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Campo_3006,
						view.getElement() != null ? view.getElement() : view,
						gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry.getType(
								gestionmodelosconsultas.diagram_PROYECCION.edit.parts.CampoNombreCampo6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5011); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getRelacion_4001Text(View view) {
		Relacion domainModelElement = (Relacion) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getNombre();
		} else {
			gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 4001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	* @generated
	*/
	public void restoreState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public void saveState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	* @generated
	*/
	private boolean isOwnView(View view) {
		return gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ProyeccionEditPart.MODEL_ID
				.equals(gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry
						.getModelID(view));
	}

}
