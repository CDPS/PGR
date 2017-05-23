package gestionmodelosconsultas.diagram_PROYECCION.edit.parts;

import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.edit.policies.reparent.CreationEditPolicyWithCustomReparent;
import org.eclipse.swt.graphics.Color;

/**
 * @generated
 */
public class TransaccionEditPart extends ShapeNodeEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 2006;

	/**
	* @generated
	*/
	protected IFigure contentPane;

	/**
	* @generated
	*/
	protected IFigure primaryShape;

	/**
	* @generated
	*/
	public TransaccionEditPart(View view) {
		super(view);
	}

	/**
	* @generated
	*/
	protected void createDefaultEditPolicies() {
		installEditPolicy(EditPolicyRoles.CREATION_ROLE, new CreationEditPolicyWithCustomReparent(
				gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry.TYPED_INSTANCE));
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new gestionmodelosconsultas.diagram_PROYECCION.edit.policies.TransaccionItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	* @generated
	*/
	protected LayoutEditPolicy createLayoutEditPolicy() {
		org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy lep = new org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				EditPolicy result = child.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
				if (result == null) {
					result = new NonResizableEditPolicy();
				}
				return result;
			}

			protected Command getMoveChildrenCommand(Request request) {
				return null;
			}

			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}

	/**
	* @generated
	*/
	protected IFigure createNodeShape() {
		return primaryShape = new TransaccionFigure();
	}

	/**
	* @generated
	*/
	public TransaccionFigure getPrimaryShape() {
		return (TransaccionFigure) primaryShape;
	}

	/**
	* @generated
	*/
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof gestionmodelosconsultas.diagram_PROYECCION.edit.parts.TransaccionNombreEditPart) {
			((gestionmodelosconsultas.diagram_PROYECCION.edit.parts.TransaccionNombreEditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureTransaccionNombreFigure());
			return true;
		}
		return false;
	}

	/**
	* @generated
	*/
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof gestionmodelosconsultas.diagram_PROYECCION.edit.parts.TransaccionNombreEditPart) {
			return true;
		}
		return false;
	}

	/**
	* @generated
	*/
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	* @generated
	*/
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	* @generated
	*/
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		return getContentPane();
	}

	/**
	* @generated
	*/
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(40, 40);
		return result;
	}

	/**
	* Creates figure for this edit part.
	* 
	* Body of this method does not depend on settings in generation model
	* so you may safely remove <i>generated</i> tag and modify it.
	* 
	* @generated
	*/
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	* Default implementation treats passed figure as content pane.
	* Respects layout one may have set for generated figure.
	* @param nodeShape instance of generated figure class
	* @generated
	*/
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(5);
			nodeShape.setLayoutManager(layout);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	* @generated
	*/
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	* @generated
	*/
	protected void setForegroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

	/**
	* @generated
	*/
	protected void setBackgroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setBackgroundColor(color);
		}
	}

	/**
	* @generated
	*/
	protected void setLineWidth(int width) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineWidth(width);
		}
	}

	/**
	* @generated
	*/
	protected void setLineType(int style) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineStyle(style);
		}
	}

	/**
	* @generated
	*/
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(
				gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry.getType(
						gestionmodelosconsultas.diagram_PROYECCION.edit.parts.TransaccionNombreEditPart.VISUAL_ID));
	}

	/**
	* @generated
	*/
	public EditPart getTargetEditPart(Request request) {
		if (request instanceof CreateViewAndElementRequest) {
			CreateElementRequestAdapter adapter = ((CreateViewAndElementRequest) request).getViewAndElementDescriptor()
					.getCreateElementRequestAdapter();
			IElementType type = (IElementType) adapter.getAdapter(IElementType.class);
			if (type == gestionmodelosconsultas.diagram_PROYECCION.providers.GestionModelosConsultasElementTypes.Campo_3006) {
				return getChildBySemanticHint(
						gestionmodelosconsultas.diagram_PROYECCION.part.GestionModelosConsultasVisualIDRegistry.getType(
								gestionmodelosconsultas.diagram_PROYECCION.edit.parts.TransaccionCompartmentTransaccionEditPart.VISUAL_ID));
			}
		}
		return super.getTargetEditPart(request);
	}

	/**
	 * @generated
	 */
	public class TransaccionFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureTransaccionNombreFigure;

		/**
		 * @generated
		 */
		public TransaccionFigure() {
			this.setMaximumSize(new Dimension(getMapMode().DPtoLP(80), getMapMode().DPtoLP(80)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			RectangleFigure innerClass0 = new RectangleFigure();

			innerClass0.setFill(false);
			innerClass0.setOutline(false);
			innerClass0.setMaximumSize(new Dimension(getMapMode().DPtoLP(500), getMapMode().DPtoLP(60)));

			this.add(innerClass0);

			GridLayout layoutInnerClass0 = new GridLayout();
			layoutInnerClass0.numColumns = 1;
			layoutInnerClass0.makeColumnsEqualWidth = true;
			innerClass0.setLayoutManager(layoutInnerClass0);

			fFigureTransaccionNombreFigure = new WrappingLabel();

			fFigureTransaccionNombreFigure.setText("Transaccion");

			GridData constraintFFigureTransaccionNombreFigure = new GridData();
			constraintFFigureTransaccionNombreFigure.verticalAlignment = GridData.CENTER;
			constraintFFigureTransaccionNombreFigure.horizontalAlignment = GridData.CENTER;
			constraintFFigureTransaccionNombreFigure.horizontalIndent = 0;
			constraintFFigureTransaccionNombreFigure.horizontalSpan = 1;
			constraintFFigureTransaccionNombreFigure.verticalSpan = 1;
			constraintFFigureTransaccionNombreFigure.grabExcessHorizontalSpace = true;
			constraintFFigureTransaccionNombreFigure.grabExcessVerticalSpace = true;
			innerClass0.add(fFigureTransaccionNombreFigure, constraintFFigureTransaccionNombreFigure);

			RectangleFigure innerClass1 = new RectangleFigure();

			innerClass1.setFill(false);
			innerClass1.setOutline(false);
			innerClass1.setMaximumSize(new Dimension(getMapMode().DPtoLP(500), getMapMode().DPtoLP(60)));

			innerClass0.add(innerClass1);

			GridLayout layoutInnerClass1 = new GridLayout();
			layoutInnerClass1.numColumns = 1;
			layoutInnerClass1.makeColumnsEqualWidth = true;
			innerClass1.setLayoutManager(layoutInnerClass1);

			WrappingLabel transaccionNombreFigure2 = new WrappingLabel();

			transaccionNombreFigure2.setText("Transaccion");

			GridData constraintTransaccionNombreFigure2 = new GridData();
			constraintTransaccionNombreFigure2.verticalAlignment = GridData.CENTER;
			constraintTransaccionNombreFigure2.horizontalAlignment = GridData.CENTER;
			constraintTransaccionNombreFigure2.horizontalIndent = 0;
			constraintTransaccionNombreFigure2.horizontalSpan = 1;
			constraintTransaccionNombreFigure2.verticalSpan = 1;
			constraintTransaccionNombreFigure2.grabExcessHorizontalSpace = true;
			constraintTransaccionNombreFigure2.grabExcessVerticalSpace = true;
			innerClass1.add(transaccionNombreFigure2, constraintTransaccionNombreFigure2);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTransaccionNombreFigure() {
			return fFigureTransaccionNombreFigure;
		}

	}

}
