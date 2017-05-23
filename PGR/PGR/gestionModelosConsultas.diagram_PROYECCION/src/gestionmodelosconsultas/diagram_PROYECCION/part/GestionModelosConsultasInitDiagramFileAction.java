package gestionmodelosconsultas.diagram_PROYECCION.part;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.osgi.util.NLS;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

/**
 * @generated
 */
public class GestionModelosConsultasInitDiagramFileAction implements IObjectActionDelegate {

	/**
	* @generated
	*/
	private IWorkbenchPart targetPart;

	/**
	* @generated
	*/
	private URI domainModelURI;

	/**
	* @generated
	*/
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		this.targetPart = targetPart;
	}

	/**
	* @generated
	*/
	public void selectionChanged(IAction action, ISelection selection) {
		domainModelURI = null;
		action.setEnabled(false);
		if (selection instanceof IStructuredSelection == false || selection.isEmpty()) {
			return;
		}
		IFile file = (IFile) ((IStructuredSelection) selection).getFirstElement();
		domainModelURI = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
		action.setEnabled(true);
	}

	/**
	* @generated
	*/
	private Shell getShell() {
		return targetPart.getSite().getShell();
	}

	/**
	* @generated
	*/
	public void run(IAction action) {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE.createEditingDomain();
		ResourceSet resourceSet = editingDomain.getResourceSet();
		EObject diagramRoot = null;
		try {
			Resource resource = resourceSet.getResource(domainModelURI, true);
			diagramRoot = (EObject) resource.getContents().get(0);
		} catch (WrappedException ex) {
			gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasDiagramEditorPlugin.getInstance()
					.logError("Unable to load resource: " + domainModelURI, ex); //$NON-NLS-1$
		}
		if (diagramRoot == null) {
			MessageDialog.openError(getShell(),
					gestionmodelosconsultas.diagram_PROYECCION.part.Messages.InitDiagramFile_ResourceErrorDialogTitle,
					gestionmodelosconsultas.diagram_PROYECCION.part.Messages.InitDiagramFile_ResourceErrorDialogMessage);
			return;
		}
		Wizard wizard = new gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasNewDiagramFileWizard(
				domainModelURI, diagramRoot, editingDomain);
		wizard.setWindowTitle(
				NLS.bind(gestionmodelosconsultas.diagram_PROYECCION.part.Messages.InitDiagramFile_WizardTitle,
						gestionmodelosconsultas.diagram_PROYECCION.edit.parts.ProyeccionEditPart.MODEL_ID));
		gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasDiagramEditorUtil.runWizard(getShell(),
				wizard, "InitDiagramFile"); //$NON-NLS-1$
	}
}
