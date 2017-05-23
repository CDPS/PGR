package gestionmodelosconsultas.diagram_PROYECCION.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;

/**
 * @generated
 */
public class GestionModelosConsultasNavigatorContentProvider implements ICommonContentProvider {

	/**
	* @generated
	*/
	private static final Object[] EMPTY_ARRAY = new Object[0];

	/**
	* @generated
	*/
	private Viewer myViewer;

	/**
	* @generated
	*/
	private AdapterFactoryEditingDomain myEditingDomain;

	/**
	* @generated
	*/
	private WorkspaceSynchronizer myWorkspaceSynchronizer;

	/**
	* @generated
	*/
	private Runnable myViewerRefreshRunnable;

	/**
	* @generated
	*/
	@SuppressWarnings({ "unchecked", "serial", "rawtypes" })
	public GestionModelosConsultasNavigatorContentProvider() {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE.createEditingDomain();
		myEditingDomain = (AdapterFactoryEditingDomain) editingDomain;
		myEditingDomain.setResourceToReadOnlyMap(new HashMap() {
			public Object get(Object key) {
				if (!containsKey(key)) {
					put(key, Boolean.TRUE);
				}
				return super.get(key);
			}
		});
		myViewerRefreshRunnable = new Runnable() {
			public void run() {
				if (myViewer != null) {
					myViewer.refresh();
				}
			}
		};
		myWorkspaceSynchronizer = new WorkspaceSynchronizer(editingDomain, new WorkspaceSynchronizer.Delegate() {
			public void dispose() {
			}

			public boolean handleResourceChanged(final Resource resource) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}

			public boolean handleResourceDeleted(Resource resource) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}

			public boolean handleResourceMoved(Resource resource, final URI newURI) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}
		});
	}

	/**
	* @generated
	*/
	public void dispose() {
		myWorkspaceSynchronizer.dispose();
		myWorkspaceSynchronizer = null;
		myViewerRefreshRunnable = null;
		myViewer = null;
		unloadAllResources();
		((TransactionalEditingDomain) myEditingDomain).dispose();
		myEditingDomain = null;
	}

	/**
	* @generated
	*/
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		myViewer = viewer;
	}

	/**
	* @generated
	*/
	void unloadAllResources() {
		for (Resource nextResource : myEditingDomain.getResourceSet().getResources()) {
			nextResource.unload();
		}
	}

	/**
	* @generated
	*/
	void asyncRefresh() {
		if (myViewer != null && !myViewer.getControl().isDisposed()) {
			myViewer.getControl().getDisplay().asyncExec(myViewerRefreshRunnable);
		}
	}

	/**
	* @generated
	*/
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
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
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	* @generated
	*/
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof IFile) {
			IFile file = (IFile) parentElement;
			URI fileURI = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
			Resource resource = myEditingDomain.getResourceSet().getResource(fileURI, true);
			ArrayList<gestionmodelosconsultas.diagram_PROYECCION.navigator.GestionModelosConsultasNavigatorItem> result = new ArrayList<gestionmodelosconsultas.diagram_PROYECCION.navigator.GestionModelosConsultasNavigatorItem>();
			ArrayList<View> topViews = new ArrayList<View>(resource.getContents().size());
			for (EObject o : resource.getContents()) {
				if (o instanceof View) {
					topViews.add((View) o);
				}
			}
			result.addAll(createNavigatorItems(
					selectViewsByType(topViews,
							gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ProyeccionEditPart.MODEL_ID),
					file, false));
			return result.toArray();
		}

		if (parentElement instanceof gestionmodelosconsultas.diagram_PROYECCION.navigator.GestionModelosConsultasNavigatorGroup) {
			gestionmodelosconsultas.diagram_PROYECCION.navigator.GestionModelosConsultasNavigatorGroup group = (gestionmodelosconsultas.diagram_PROYECCION.navigator.GestionModelosConsultasNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof gestionmodelosconsultas.diagram_PROYECCION.navigator.GestionModelosConsultasNavigatorItem) {
			gestionmodelosconsultas.diagram_PROYECCION.navigator.GestionModelosConsultasNavigatorItem navigatorItem = (gestionmodelosconsultas.diagram_PROYECCION.navigator.GestionModelosConsultasNavigatorItem) parentElement;
			if (navigatorItem.isLeaf() || !isOwnView(navigatorItem.getView())) {
				return EMPTY_ARRAY;
			}
			return getViewChildren(navigatorItem.getView(), parentElement);
		}

		return EMPTY_ARRAY;
	}

	/**
	* @generated
	*/
	private Object[] getViewChildren(View view, Object parentElement) {
		switch (gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry
				.getVisualID(view)) {

		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ProyeccionEditPart.VISUAL_ID: {
			LinkedList<gestionmodelosconsultas.diagram_PROYECCION.navigator.GestionModelosConsultasAbstractNavigatorItem> result = new LinkedList<gestionmodelosconsultas.diagram_PROYECCION.navigator.GestionModelosConsultasAbstractNavigatorItem>();
			Diagram sv = (Diagram) view;
			gestionmodelosconsultas.diagram_PROYECCION.navigator.GestionModelosConsultasNavigatorGroup links = new gestionmodelosconsultas.diagram_PROYECCION.navigator.GestionModelosConsultasNavigatorGroup(
					gestionmodelosconsultas.diagram_PROYECCION.part.Messages.NavigatorGroupName_Proyeccion_1000_links,
					"icons/linksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry.getType(
							gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ConsolidadoEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry.getType(
							gestionmodelosconsultas.diagram_PROYECCION.edit.parts.DetalladoEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry
							.getType(gestionmodelosconsultas.diagram_PROYECCION.edit.parts.PlanillaEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry.getType(
							gestionmodelosconsultas.diagram_PROYECCION.edit.parts.PropietarioEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry
							.getType(gestionmodelosconsultas.diagram_PROYECCION.edit.parts.TramaEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry.getType(
							gestionmodelosconsultas.diagram_PROYECCION.edit.parts.TransaccionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry
							.getType(gestionmodelosconsultas.diagram_PROYECCION.edit.parts.RelacionEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}

		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ConsolidadoEditPart.VISUAL_ID: {
			LinkedList<gestionmodelosconsultas.diagram_PROYECCION.navigator.GestionModelosConsultasAbstractNavigatorItem> result = new LinkedList<gestionmodelosconsultas.diagram_PROYECCION.navigator.GestionModelosConsultasAbstractNavigatorItem>();
			Node sv = (Node) view;
			gestionmodelosconsultas.diagram_PROYECCION.navigator.GestionModelosConsultasNavigatorGroup incominglinks = new gestionmodelosconsultas.diagram_PROYECCION.navigator.GestionModelosConsultasNavigatorGroup(
					gestionmodelosconsultas.diagram_PROYECCION.part.Messages.NavigatorGroupName_Consolidado_2001_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			gestionmodelosconsultas.diagram_PROYECCION.navigator.GestionModelosConsultasNavigatorGroup outgoinglinks = new gestionmodelosconsultas.diagram_PROYECCION.navigator.GestionModelosConsultasNavigatorGroup(
					gestionmodelosconsultas.diagram_PROYECCION.part.Messages.NavigatorGroupName_Consolidado_2001_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry.getType(
							gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ConsolidadoCompartmentConsolidadoEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry
							.getType(gestionmodelosconsultas.diagram_PROYECCION.edit.parts.CampoEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry
							.getType(gestionmodelosconsultas.diagram_PROYECCION.edit.parts.RelacionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry
							.getType(gestionmodelosconsultas.diagram_PROYECCION.edit.parts.RelacionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.DetalladoEditPart.VISUAL_ID: {
			LinkedList<gestionmodelosconsultas.diagram_PROYECCION.navigator.GestionModelosConsultasAbstractNavigatorItem> result = new LinkedList<gestionmodelosconsultas.diagram_PROYECCION.navigator.GestionModelosConsultasAbstractNavigatorItem>();
			Node sv = (Node) view;
			gestionmodelosconsultas.diagram_PROYECCION.navigator.GestionModelosConsultasNavigatorGroup incominglinks = new gestionmodelosconsultas.diagram_PROYECCION.navigator.GestionModelosConsultasNavigatorGroup(
					gestionmodelosconsultas.diagram_PROYECCION.part.Messages.NavigatorGroupName_Detallado_2002_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			gestionmodelosconsultas.diagram_PROYECCION.navigator.GestionModelosConsultasNavigatorGroup outgoinglinks = new gestionmodelosconsultas.diagram_PROYECCION.navigator.GestionModelosConsultasNavigatorGroup(
					gestionmodelosconsultas.diagram_PROYECCION.part.Messages.NavigatorGroupName_Detallado_2002_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry.getType(
							gestionmodelosconsultas.diagram_PROYECCION.edit.parts.DetalladoCompartmentDetalladoEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry
							.getType(gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry
							.getType(gestionmodelosconsultas.diagram_PROYECCION.edit.parts.RelacionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry
							.getType(gestionmodelosconsultas.diagram_PROYECCION.edit.parts.RelacionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.PlanillaEditPart.VISUAL_ID: {
			LinkedList<gestionmodelosconsultas.diagram_PROYECCION.navigator.GestionModelosConsultasAbstractNavigatorItem> result = new LinkedList<gestionmodelosconsultas.diagram_PROYECCION.navigator.GestionModelosConsultasAbstractNavigatorItem>();
			Node sv = (Node) view;
			gestionmodelosconsultas.diagram_PROYECCION.navigator.GestionModelosConsultasNavigatorGroup incominglinks = new gestionmodelosconsultas.diagram_PROYECCION.navigator.GestionModelosConsultasNavigatorGroup(
					gestionmodelosconsultas.diagram_PROYECCION.part.Messages.NavigatorGroupName_Planilla_2003_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			gestionmodelosconsultas.diagram_PROYECCION.navigator.GestionModelosConsultasNavigatorGroup outgoinglinks = new gestionmodelosconsultas.diagram_PROYECCION.navigator.GestionModelosConsultasNavigatorGroup(
					gestionmodelosconsultas.diagram_PROYECCION.part.Messages.NavigatorGroupName_Planilla_2003_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry.getType(
							gestionmodelosconsultas.diagram_PROYECCION.edit.parts.PlanillaCompartmentPlanillaEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry
							.getType(gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry
							.getType(gestionmodelosconsultas.diagram_PROYECCION.edit.parts.RelacionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry
							.getType(gestionmodelosconsultas.diagram_PROYECCION.edit.parts.RelacionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.PropietarioEditPart.VISUAL_ID: {
			LinkedList<gestionmodelosconsultas.diagram_PROYECCION.navigator.GestionModelosConsultasAbstractNavigatorItem> result = new LinkedList<gestionmodelosconsultas.diagram_PROYECCION.navigator.GestionModelosConsultasAbstractNavigatorItem>();
			Node sv = (Node) view;
			gestionmodelosconsultas.diagram_PROYECCION.navigator.GestionModelosConsultasNavigatorGroup incominglinks = new gestionmodelosconsultas.diagram_PROYECCION.navigator.GestionModelosConsultasNavigatorGroup(
					gestionmodelosconsultas.diagram_PROYECCION.part.Messages.NavigatorGroupName_Propietario_2004_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			gestionmodelosconsultas.diagram_PROYECCION.navigator.GestionModelosConsultasNavigatorGroup outgoinglinks = new gestionmodelosconsultas.diagram_PROYECCION.navigator.GestionModelosConsultasNavigatorGroup(
					gestionmodelosconsultas.diagram_PROYECCION.part.Messages.NavigatorGroupName_Propietario_2004_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry.getType(
							gestionmodelosconsultas.diagram_PROYECCION.edit.parts.PropietarioCompartmentPropietarioEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry
							.getType(gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry
							.getType(gestionmodelosconsultas.diagram_PROYECCION.edit.parts.RelacionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry
							.getType(gestionmodelosconsultas.diagram_PROYECCION.edit.parts.RelacionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.TramaEditPart.VISUAL_ID: {
			LinkedList<gestionmodelosconsultas.diagram_PROYECCION.navigator.GestionModelosConsultasAbstractNavigatorItem> result = new LinkedList<gestionmodelosconsultas.diagram_PROYECCION.navigator.GestionModelosConsultasAbstractNavigatorItem>();
			Node sv = (Node) view;
			gestionmodelosconsultas.diagram_PROYECCION.navigator.GestionModelosConsultasNavigatorGroup incominglinks = new gestionmodelosconsultas.diagram_PROYECCION.navigator.GestionModelosConsultasNavigatorGroup(
					gestionmodelosconsultas.diagram_PROYECCION.part.Messages.NavigatorGroupName_Trama_2005_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			gestionmodelosconsultas.diagram_PROYECCION.navigator.GestionModelosConsultasNavigatorGroup outgoinglinks = new gestionmodelosconsultas.diagram_PROYECCION.navigator.GestionModelosConsultasNavigatorGroup(
					gestionmodelosconsultas.diagram_PROYECCION.part.Messages.NavigatorGroupName_Trama_2005_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry.getType(
							gestionmodelosconsultas.diagram_PROYECCION.edit.parts.TramaCompartmentTramaEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry
							.getType(gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry
							.getType(gestionmodelosconsultas.diagram_PROYECCION.edit.parts.RelacionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry
							.getType(gestionmodelosconsultas.diagram_PROYECCION.edit.parts.RelacionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.TransaccionEditPart.VISUAL_ID: {
			LinkedList<gestionmodelosconsultas.diagram_PROYECCION.navigator.GestionModelosConsultasAbstractNavigatorItem> result = new LinkedList<gestionmodelosconsultas.diagram_PROYECCION.navigator.GestionModelosConsultasAbstractNavigatorItem>();
			Node sv = (Node) view;
			gestionmodelosconsultas.diagram_PROYECCION.navigator.GestionModelosConsultasNavigatorGroup incominglinks = new gestionmodelosconsultas.diagram_PROYECCION.navigator.GestionModelosConsultasNavigatorGroup(
					gestionmodelosconsultas.diagram_PROYECCION.part.Messages.NavigatorGroupName_Transaccion_2006_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			gestionmodelosconsultas.diagram_PROYECCION.navigator.GestionModelosConsultasNavigatorGroup outgoinglinks = new gestionmodelosconsultas.diagram_PROYECCION.navigator.GestionModelosConsultasNavigatorGroup(
					gestionmodelosconsultas.diagram_PROYECCION.part.Messages.NavigatorGroupName_Transaccion_2006_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry.getType(
							gestionmodelosconsultas.diagram_PROYECCION.edit.parts.TransaccionCompartmentTransaccionEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry
							.getType(gestionmodelosconsultas.diagram_PROYECCION.edit.parts.Campo6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry
							.getType(gestionmodelosconsultas.diagram_PROYECCION.edit.parts.RelacionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry
							.getType(gestionmodelosconsultas.diagram_PROYECCION.edit.parts.RelacionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case gestionmodelosconsultas.diagram_PROYECCION.edit.parts.RelacionEditPart.VISUAL_ID: {
			LinkedList<gestionmodelosconsultas.diagram_PROYECCION.navigator.GestionModelosConsultasAbstractNavigatorItem> result = new LinkedList<gestionmodelosconsultas.diagram_PROYECCION.navigator.GestionModelosConsultasAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			gestionmodelosconsultas.diagram_PROYECCION.navigator.GestionModelosConsultasNavigatorGroup target = new gestionmodelosconsultas.diagram_PROYECCION.navigator.GestionModelosConsultasNavigatorGroup(
					gestionmodelosconsultas.diagram_PROYECCION.part.Messages.NavigatorGroupName_Relacion_4001_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			gestionmodelosconsultas.diagram_PROYECCION.navigator.GestionModelosConsultasNavigatorGroup source = new gestionmodelosconsultas.diagram_PROYECCION.navigator.GestionModelosConsultasNavigatorGroup(
					gestionmodelosconsultas.diagram_PROYECCION.part.Messages.NavigatorGroupName_Relacion_4001_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry.getType(
							gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ConsolidadoEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry.getType(
							gestionmodelosconsultas.diagram_PROYECCION.edit.parts.DetalladoEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry
							.getType(gestionmodelosconsultas.diagram_PROYECCION.edit.parts.PlanillaEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry.getType(
							gestionmodelosconsultas.diagram_PROYECCION.edit.parts.PropietarioEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry
							.getType(gestionmodelosconsultas.diagram_PROYECCION.edit.parts.TramaEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry.getType(
							gestionmodelosconsultas.diagram_PROYECCION.edit.parts.TransaccionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry.getType(
							gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ConsolidadoEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry.getType(
							gestionmodelosconsultas.diagram_PROYECCION.edit.parts.DetalladoEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry
							.getType(gestionmodelosconsultas.diagram_PROYECCION.edit.parts.PlanillaEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry.getType(
							gestionmodelosconsultas.diagram_PROYECCION.edit.parts.PropietarioEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry
							.getType(gestionmodelosconsultas.diagram_PROYECCION.edit.parts.TramaEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry.getType(
							gestionmodelosconsultas.diagram_PROYECCION.edit.parts.TransaccionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}
		}
		return EMPTY_ARRAY;
	}

	/**
	* @generated
	*/
	private Collection<View> getLinksSourceByType(Collection<Edge> edges, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeSource = nextEdge.getSource();
			if (type.equals(nextEdgeSource.getType()) && isOwnView(nextEdgeSource)) {
				result.add(nextEdgeSource);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksTargetByType(Collection<Edge> edges, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeTarget = nextEdge.getTarget();
			if (type.equals(nextEdgeTarget.getType()) && isOwnView(nextEdgeTarget)) {
				result.add(nextEdgeTarget);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getOutgoingLinksByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getSourceEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getIncomingLinksByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getTargetEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getChildrenByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getChildren(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getDiagramLinksByType(Collection<Diagram> diagrams, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (Diagram nextDiagram : diagrams) {
			result.addAll(selectViewsByType(nextDiagram.getEdges(), type));
		}
		return result;
	}

	// TODO refactor as static method
	/**
	 * @generated
	 */
	private Collection<View> selectViewsByType(Collection<View> views, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (View nextView : views) {
			if (type.equals(nextView.getType()) && isOwnView(nextView)) {
				result.add(nextView);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ProyeccionEditPart.MODEL_ID
				.equals(gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry
						.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection<gestionmodelosconsultas.diagram_PROYECCION.navigator.GestionModelosConsultasNavigatorItem> createNavigatorItems(
			Collection<View> views, Object parent, boolean isLeafs) {
		ArrayList<gestionmodelosconsultas.diagram_PROYECCION.navigator.GestionModelosConsultasNavigatorItem> result = new ArrayList<gestionmodelosconsultas.diagram_PROYECCION.navigator.GestionModelosConsultasNavigatorItem>(
				views.size());
		for (View nextView : views) {
			result.add(new gestionmodelosconsultas.diagram_PROYECCION.navigator.GestionModelosConsultasNavigatorItem(
					nextView, parent, isLeafs));
		}
		return result;
	}

	/**
	* @generated
	*/
	public Object getParent(Object element) {
		if (element instanceof gestionmodelosconsultas.diagram_PROYECCION.navigator.GestionModelosConsultasAbstractNavigatorItem) {
			gestionmodelosconsultas.diagram_PROYECCION.navigator.GestionModelosConsultasAbstractNavigatorItem abstractNavigatorItem = (gestionmodelosconsultas.diagram_PROYECCION.navigator.GestionModelosConsultasAbstractNavigatorItem) element;
			return abstractNavigatorItem.getParent();
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean hasChildren(Object element) {
		return element instanceof IFile || getChildren(element).length > 0;
	}

}
