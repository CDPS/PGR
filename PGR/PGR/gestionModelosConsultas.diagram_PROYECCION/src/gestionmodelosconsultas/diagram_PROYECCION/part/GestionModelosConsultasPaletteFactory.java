
package gestionmodelosconsultas.diagram_PROYECCION.part;

import java.util.ArrayList;
import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

/**
 * @generated
 */
public class GestionModelosConsultasPaletteFactory {

	/**
	* @generated
	*/
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createElementosConsulta1Group());
		paletteRoot.add(createRelacion2Group());
		paletteRoot.add(createCampo3Group());
	}

	/**
	* Creates "Elementos Consulta" palette tool group
	* @generated
	*/
	private PaletteContainer createElementosConsulta1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				gestionmodelosconsultas.diagram_PROYECCION.part.Messages.ElementosConsulta1Group_title);
		paletteContainer.setId("createElementosConsulta1Group"); //$NON-NLS-1$
		paletteContainer.add(createPlanilla1CreationTool());
		paletteContainer.add(createConsolidado2CreationTool());
		paletteContainer.add(createTransaccion3CreationTool());
		paletteContainer.add(createTrama4CreationTool());
		paletteContainer.add(createPropietario5CreationTool());
		paletteContainer.add(createDetallado6CreationTool());
		return paletteContainer;
	}

	/**
	* Creates "Relacion" palette tool group
	* @generated
	*/
	private PaletteContainer createRelacion2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				gestionmodelosconsultas.diagram_PROYECCION.part.Messages.Relacion2Group_title);
		paletteContainer.setId("createRelacion2Group"); //$NON-NLS-1$
		paletteContainer.add(createRelacion1CreationTool());
		return paletteContainer;
	}

	/**
	* Creates "Campo" palette tool group
	* @generated
	*/
	private PaletteContainer createCampo3Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				gestionmodelosconsultas.diagram_PROYECCION.part.Messages.Campo3Group_title);
		paletteContainer.setId("createCampo3Group"); //$NON-NLS-1$
		paletteContainer.add(createCampo1CreationTool());
		return paletteContainer;
	}

	/**
	* @generated
	*/
	private ToolEntry createPlanilla1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				gestionmodelosconsultas.diagram_PROYECCION.part.Messages.Planilla1CreationTool_title,
				gestionmodelosconsultas.diagram_PROYECCION.part.Messages.Planilla1CreationTool_desc,
				Collections.singletonList(
						gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Planilla_2003));
		entry.setId("createPlanilla1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes
				.getImageDescriptor(
						gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Planilla_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createConsolidado2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				gestionmodelosconsultas.diagram_PROYECCION.part.Messages.Consolidado2CreationTool_title,
				gestionmodelosconsultas.diagram_PROYECCION.part.Messages.Consolidado2CreationTool_desc,
				Collections.singletonList(
						gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Consolidado_2001));
		entry.setId("createConsolidado2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes
				.getImageDescriptor(
						gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Consolidado_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createTransaccion3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				gestionmodelosconsultas.diagram_PROYECCION.part.Messages.Transaccion3CreationTool_title,
				gestionmodelosconsultas.diagram_PROYECCION.part.Messages.Transaccion3CreationTool_desc,
				Collections.singletonList(
						gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Transaccion_2006));
		entry.setId("createTransaccion3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes
				.getImageDescriptor(
						gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Transaccion_2006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createTrama4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				gestionmodelosconsultas.diagram_PROYECCION.part.Messages.Trama4CreationTool_title,
				gestionmodelosconsultas.diagram_PROYECCION.part.Messages.Trama4CreationTool_desc,
				Collections.singletonList(
						gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Trama_2005));
		entry.setId("createTrama4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes
				.getImageDescriptor(
						gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Trama_2005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createPropietario5CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				gestionmodelosconsultas.diagram_PROYECCION.part.Messages.Propietario5CreationTool_title,
				gestionmodelosconsultas.diagram_PROYECCION.part.Messages.Propietario5CreationTool_desc,
				Collections.singletonList(
						gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Propietario_2004));
		entry.setId("createPropietario5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes
				.getImageDescriptor(
						gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Propietario_2004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createDetallado6CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				gestionmodelosconsultas.diagram_PROYECCION.part.Messages.Detallado6CreationTool_title,
				gestionmodelosconsultas.diagram_PROYECCION.part.Messages.Detallado6CreationTool_desc,
				Collections.singletonList(
						gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Detallado_2002));
		entry.setId("createDetallado6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes
				.getImageDescriptor(
						gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Detallado_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createRelacion1CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				gestionmodelosconsultas.diagram_PROYECCION.part.Messages.Relacion1CreationTool_title,
				gestionmodelosconsultas.diagram_PROYECCION.part.Messages.Relacion1CreationTool_desc,
				Collections.singletonList(
						gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Relacion_4001));
		entry.setId("createRelacion1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes
				.getImageDescriptor(
						gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Relacion_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createCampo1CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(6);
		types.add(gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Campo_3001);
		types.add(gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Campo_3002);
		types.add(gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Campo_3003);
		types.add(gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Campo_3004);
		types.add(gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Campo_3005);
		types.add(gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Campo_3006);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				gestionmodelosconsultas.diagram_PROYECCION.part.Messages.Campo1CreationTool_title,
				gestionmodelosconsultas.diagram_PROYECCION.part.Messages.Campo1CreationTool_desc, types);
		entry.setId("createCampo1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes
				.getImageDescriptor(
						gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Campo_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
