package gestionmodelosconsultas.diagram_PROYECCION.part;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.actions.WorkspaceModifyOperation;

/**
 * @generated
 */
public class GestionModelosConsultasCreationWizard extends Wizard implements INewWizard {

	/**
	* @generated
	*/
	private IWorkbench workbench;

	/**
	* @generated
	*/
	protected IStructuredSelection selection;

	/**
	* @generated
	*/
	protected gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasCreationWizardPage diagramModelFilePage;

	/**
	* @generated
	*/
	protected gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasCreationWizardPage domainModelFilePage;

	/**
	* @generated
	*/
	protected Resource diagram;

	/**
	* @generated
	*/
	private boolean openNewlyCreatedDiagramEditor = true;

	/**
	* @generated
	*/
	public IWorkbench getWorkbench() {
		return workbench;
	}

	/**
	* @generated
	*/
	public IStructuredSelection getSelection() {
		return selection;
	}

	/**
	* @generated
	*/
	public final Resource getDiagram() {
		return diagram;
	}

	/**
	* @generated
	*/
	public final boolean isOpenNewlyCreatedDiagramEditor() {
		return openNewlyCreatedDiagramEditor;
	}

	/**
	* @generated
	*/
	public void setOpenNewlyCreatedDiagramEditor(boolean openNewlyCreatedDiagramEditor) {
		this.openNewlyCreatedDiagramEditor = openNewlyCreatedDiagramEditor;
	}

	/**
	* @generated
	*/
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;
		setWindowTitle(
				gestionmodelosconsultas.diagram_PROYECCION.part.Messages.GestionModelosConsultasCreationWizardTitle);
		setDefaultPageImageDescriptor(
				gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasDiagramEditorPlugin
						.getBundledImageDescriptor("icons/wizban/NewModelWizard.gif")); //$NON-NLS-1$
		setNeedsProgressMonitor(true);
	}

	/**
	* @generated
	*/
	public void addPages() {
		diagramModelFilePage = new gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasCreationWizardPage(
				"DiagramModelFile", getSelection(), "gestionmodelosconsultas_diagram_PROYECCION"); //$NON-NLS-1$ //$NON-NLS-2$
		diagramModelFilePage.setTitle(
				gestionmodelosconsultas.diagram_PROYECCION.part.Messages.GestionModelosConsultasCreationWizard_DiagramModelFilePageTitle);
		diagramModelFilePage.setDescription(
				gestionmodelosconsultas.diagram_PROYECCION.part.Messages.GestionModelosConsultasCreationWizard_DiagramModelFilePageDescription);
		addPage(diagramModelFilePage);

		domainModelFilePage = new gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasCreationWizardPage(
				"DomainModelFile", getSelection(), "gestionmodelosconsultas") { //$NON-NLS-1$ //$NON-NLS-2$

			public void setVisible(boolean visible) {
				if (visible) {
					String fileName = diagramModelFilePage.getFileName();
					fileName = fileName.substring(0,
							fileName.length() - ".gestionmodelosconsultas_diagram_PROYECCION".length()); //$NON-NLS-1$
					setFileName(gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasDiagramEditorUtil
							.getUniqueFileName(getContainerFullPath(), fileName, "gestionmodelosconsultas")); //$NON-NLS-1$
				}
				super.setVisible(visible);
			}
		};
		domainModelFilePage.setTitle(
				gestionmodelosconsultas.diagram_PROYECCION.part.Messages.GestionModelosConsultasCreationWizard_DomainModelFilePageTitle);
		domainModelFilePage.setDescription(
				gestionmodelosconsultas.diagram_PROYECCION.part.Messages.GestionModelosConsultasCreationWizard_DomainModelFilePageDescription);
		addPage(domainModelFilePage);
	}

	/**
	* @generated
	*/
	public boolean performFinish() {
		IRunnableWithProgress op = new WorkspaceModifyOperation(null) {

			protected void execute(IProgressMonitor monitor) throws CoreException, InterruptedException {
				diagram = gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasDiagramEditorUtil
						.createDiagram(diagramModelFilePage.getURI(), domainModelFilePage.getURI(), monitor);
				if (isOpenNewlyCreatedDiagramEditor() && diagram != null) {
					try {
						gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasDiagramEditorUtil
								.openDiagram(diagram);
					} catch (PartInitException e) {
						ErrorDialog.openError(getContainer().getShell(),
								gestionmodelosconsultas.diagram_PROYECCION.part.Messages.GestionModelosConsultasCreationWizardOpenEditorError,
								null, e.getStatus());
					}
				}
			}
		};
		try {
			getContainer().run(false, true, op);
		} catch (InterruptedException e) {
			return false;
		} catch (InvocationTargetException e) {
			if (e.getTargetException() instanceof CoreException) {
				ErrorDialog.openError(getContainer().getShell(),
						gestionmodelosconsultas.diagram_PROYECCION.part.Messages.GestionModelosConsultasCreationWizardCreationError,
						null, ((CoreException) e.getTargetException()).getStatus());
			} else {
				gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasDiagramEditorPlugin.getInstance()
						.logError("Error creating diagram", e.getTargetException()); //$NON-NLS-1$
			}
			return false;
		}
		return diagram != null;
	}
}
