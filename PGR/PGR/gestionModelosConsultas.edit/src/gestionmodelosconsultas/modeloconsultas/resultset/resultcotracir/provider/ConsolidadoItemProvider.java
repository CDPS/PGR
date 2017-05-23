/**
 */
package gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.provider;


import gestionmodelosconsultas.modeloconsultas.resultset.provider.ElementoModeloResultadoItemProvider;

import gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Consolidado;
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
 * This is the item provider adapter for a {@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Consolidado} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ConsolidadoItemProvider extends ElementoModeloResultadoItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsolidadoItemProvider(AdapterFactory adapterFactory) {
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
			addRUTA_DESPACHOPropertyDescriptor(object);
			addHORA_DESPACHOPropertyDescriptor(object);
			addREGISTRO_CONSOLIDADOPropertyDescriptor(object);
			addTOTAL_RECAUDO_BRUTOPropertyDescriptor(object);
			addTOTAL_RECAUDO_DESPACHOPropertyDescriptor(object);
			addESTADO_CONSOLIDADOPropertyDescriptor(object);
			addESTADO_IMPRESIONPropertyDescriptor(object);
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
				 getString("_UI_Consolidado_ID_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Consolidado_ID_feature", "_UI_Consolidado_type"),
				 ResultcotracirPackage.Literals.CONSOLIDADO__ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the RUTA DESPACHO feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRUTA_DESPACHOPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Consolidado_RUTA_DESPACHO_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Consolidado_RUTA_DESPACHO_feature", "_UI_Consolidado_type"),
				 ResultcotracirPackage.Literals.CONSOLIDADO__RUTA_DESPACHO,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the HORA DESPACHO feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHORA_DESPACHOPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Consolidado_HORA_DESPACHO_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Consolidado_HORA_DESPACHO_feature", "_UI_Consolidado_type"),
				 ResultcotracirPackage.Literals.CONSOLIDADO__HORA_DESPACHO,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the REGISTRO CONSOLIDADO feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addREGISTRO_CONSOLIDADOPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Consolidado_REGISTRO_CONSOLIDADO_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Consolidado_REGISTRO_CONSOLIDADO_feature", "_UI_Consolidado_type"),
				 ResultcotracirPackage.Literals.CONSOLIDADO__REGISTRO_CONSOLIDADO,
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
				 getString("_UI_Consolidado_TOTAL_RECAUDO_BRUTO_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Consolidado_TOTAL_RECAUDO_BRUTO_feature", "_UI_Consolidado_type"),
				 ResultcotracirPackage.Literals.CONSOLIDADO__TOTAL_RECAUDO_BRUTO,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the TOTAL RECAUDO DESPACHO feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTOTAL_RECAUDO_DESPACHOPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Consolidado_TOTAL_RECAUDO_DESPACHO_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Consolidado_TOTAL_RECAUDO_DESPACHO_feature", "_UI_Consolidado_type"),
				 ResultcotracirPackage.Literals.CONSOLIDADO__TOTAL_RECAUDO_DESPACHO,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the ESTADO CONSOLIDADO feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addESTADO_CONSOLIDADOPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Consolidado_ESTADO_CONSOLIDADO_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Consolidado_ESTADO_CONSOLIDADO_feature", "_UI_Consolidado_type"),
				 ResultcotracirPackage.Literals.CONSOLIDADO__ESTADO_CONSOLIDADO,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the ESTADO IMPRESION feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addESTADO_IMPRESIONPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Consolidado_ESTADO_IMPRESION_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Consolidado_ESTADO_IMPRESION_feature", "_UI_Consolidado_type"),
				 ResultcotracirPackage.Literals.CONSOLIDADO__ESTADO_IMPRESION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns Consolidado.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Consolidado"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		Integer labelValue = ((Consolidado)object).getID();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_Consolidado_type") :
			getString("_UI_Consolidado_type") + " " + label;
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

		switch (notification.getFeatureID(Consolidado.class)) {
			case ResultcotracirPackage.CONSOLIDADO__ID:
			case ResultcotracirPackage.CONSOLIDADO__RUTA_DESPACHO:
			case ResultcotracirPackage.CONSOLIDADO__HORA_DESPACHO:
			case ResultcotracirPackage.CONSOLIDADO__REGISTRO_CONSOLIDADO:
			case ResultcotracirPackage.CONSOLIDADO__TOTAL_RECAUDO_BRUTO:
			case ResultcotracirPackage.CONSOLIDADO__TOTAL_RECAUDO_DESPACHO:
			case ResultcotracirPackage.CONSOLIDADO__ESTADO_CONSOLIDADO:
			case ResultcotracirPackage.CONSOLIDADO__ESTADO_IMPRESION:
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
