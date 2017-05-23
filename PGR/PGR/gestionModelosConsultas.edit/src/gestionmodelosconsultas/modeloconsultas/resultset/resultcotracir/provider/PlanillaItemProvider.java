/**
 */
package gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.provider;


import gestionmodelosconsultas.modeloconsultas.resultset.provider.ElementoModeloResultadoItemProvider;

import gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Planilla;
import gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.ResultcotracirPackage;

import gestionmodelosconsultas.provider.GestionModelosConsultasEditPlugin;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Planilla} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PlanillaItemProvider extends ElementoModeloResultadoItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanillaItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addIDPropertyDescriptor(object);
			addNUMERO_MOVILPropertyDescriptor(object);
			addFECHAPropertyDescriptor(object);
			addCEDULA_CONDUCTORPropertyDescriptor(object);
			addCONDUCTORPropertyDescriptor(object);
			addTOTALPropertyDescriptor(object);
			addTOTAL_RECAUDO_BRUTOPropertyDescriptor(object);
			addTOTAL_RECAUDO_NETOPropertyDescriptor(object);
			addTOTAL_DEPOSITOPropertyDescriptor(object);
			addTOTAL_GASTOSPropertyDescriptor(object);
			addLIQUIDADOPropertyDescriptor(object);
			addUSUARIOPropertyDescriptor(object);
			addNOMBRE_PERSONAPropertyDescriptor(object);
			addAPELLIDOPropertyDescriptor(object);
			addCEDULAPropertyDescriptor(object);
			addHORA_MODIFICACIONPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the ID feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIDPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Planilla_ID_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Planilla_ID_feature", "_UI_Planilla_type"),
				 ResultcotracirPackage.Literals.PLANILLA__ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the NUMERO MOVIL feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNUMERO_MOVILPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Planilla_NUMERO_MOVIL_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Planilla_NUMERO_MOVIL_feature", "_UI_Planilla_type"),
				 ResultcotracirPackage.Literals.PLANILLA__NUMERO_MOVIL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the FECHA feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFECHAPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Planilla_FECHA_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Planilla_FECHA_feature", "_UI_Planilla_type"),
				 ResultcotracirPackage.Literals.PLANILLA__FECHA,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the CEDULA CONDUCTOR feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCEDULA_CONDUCTORPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Planilla_CEDULA_CONDUCTOR_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Planilla_CEDULA_CONDUCTOR_feature", "_UI_Planilla_type"),
				 ResultcotracirPackage.Literals.PLANILLA__CEDULA_CONDUCTOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the CONDUCTOR feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCONDUCTORPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Planilla_CONDUCTOR_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Planilla_CONDUCTOR_feature", "_UI_Planilla_type"),
				 ResultcotracirPackage.Literals.PLANILLA__CONDUCTOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the TOTAL feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTOTALPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Planilla_TOTAL_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Planilla_TOTAL_feature", "_UI_Planilla_type"),
				 ResultcotracirPackage.Literals.PLANILLA__TOTAL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the TOTAL RECAUDO BRUTO feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTOTAL_RECAUDO_BRUTOPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Planilla_TOTAL_RECAUDO_BRUTO_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Planilla_TOTAL_RECAUDO_BRUTO_feature", "_UI_Planilla_type"),
				 ResultcotracirPackage.Literals.PLANILLA__TOTAL_RECAUDO_BRUTO,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the TOTAL RECAUDO NETO feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTOTAL_RECAUDO_NETOPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Planilla_TOTAL_RECAUDO_NETO_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Planilla_TOTAL_RECAUDO_NETO_feature", "_UI_Planilla_type"),
				 ResultcotracirPackage.Literals.PLANILLA__TOTAL_RECAUDO_NETO,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the TOTAL DEPOSITO feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTOTAL_DEPOSITOPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Planilla_TOTAL_DEPOSITO_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Planilla_TOTAL_DEPOSITO_feature", "_UI_Planilla_type"),
				 ResultcotracirPackage.Literals.PLANILLA__TOTAL_DEPOSITO,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the TOTAL GASTOS feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTOTAL_GASTOSPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Planilla_TOTAL_GASTOS_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Planilla_TOTAL_GASTOS_feature", "_UI_Planilla_type"),
				 ResultcotracirPackage.Literals.PLANILLA__TOTAL_GASTOS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the LIQUIDADO feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLIQUIDADOPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Planilla_LIQUIDADO_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Planilla_LIQUIDADO_feature", "_UI_Planilla_type"),
				 ResultcotracirPackage.Literals.PLANILLA__LIQUIDADO,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the USUARIO feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUSUARIOPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Planilla_USUARIO_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Planilla_USUARIO_feature", "_UI_Planilla_type"),
				 ResultcotracirPackage.Literals.PLANILLA__USUARIO,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the NOMBRE PERSONA feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNOMBRE_PERSONAPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Planilla_NOMBRE_PERSONA_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Planilla_NOMBRE_PERSONA_feature", "_UI_Planilla_type"),
				 ResultcotracirPackage.Literals.PLANILLA__NOMBRE_PERSONA,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the APELLIDO feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAPELLIDOPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Planilla_APELLIDO_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Planilla_APELLIDO_feature", "_UI_Planilla_type"),
				 ResultcotracirPackage.Literals.PLANILLA__APELLIDO,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the CEDULA feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCEDULAPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Planilla_CEDULA_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Planilla_CEDULA_feature", "_UI_Planilla_type"),
				 ResultcotracirPackage.Literals.PLANILLA__CEDULA,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the HORA MODIFICACION feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHORA_MODIFICACIONPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Planilla_HORA_MODIFICACION_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Planilla_HORA_MODIFICACION_feature", "_UI_Planilla_type"),
				 ResultcotracirPackage.Literals.PLANILLA__HORA_MODIFICACION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns Planilla.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Planilla"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		Integer labelValue = ((Planilla)object).getID();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_Planilla_type") :
			getString("_UI_Planilla_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Planilla.class)) {
			case ResultcotracirPackage.PLANILLA__ID:
			case ResultcotracirPackage.PLANILLA__NUMERO_MOVIL:
			case ResultcotracirPackage.PLANILLA__FECHA:
			case ResultcotracirPackage.PLANILLA__CEDULA_CONDUCTOR:
			case ResultcotracirPackage.PLANILLA__CONDUCTOR:
			case ResultcotracirPackage.PLANILLA__TOTAL:
			case ResultcotracirPackage.PLANILLA__TOTAL_RECAUDO_BRUTO:
			case ResultcotracirPackage.PLANILLA__TOTAL_RECAUDO_NETO:
			case ResultcotracirPackage.PLANILLA__TOTAL_DEPOSITO:
			case ResultcotracirPackage.PLANILLA__TOTAL_GASTOS:
			case ResultcotracirPackage.PLANILLA__LIQUIDADO:
			case ResultcotracirPackage.PLANILLA__USUARIO:
			case ResultcotracirPackage.PLANILLA__NOMBRE_PERSONA:
			case ResultcotracirPackage.PLANILLA__APELLIDO:
			case ResultcotracirPackage.PLANILLA__CEDULA:
			case ResultcotracirPackage.PLANILLA__HORA_MODIFICACION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return GestionModelosConsultasEditPlugin.INSTANCE;
	}

}
