/**
 */
package gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.provider;


import gestionmodelosconsultas.modeloconsultas.resultset.provider.ElementoModeloResultadoItemProvider;

import gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Detallado;
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
 * This is the item provider adapter for a {@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Detallado} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DetalladoItemProvider extends ElementoModeloResultadoItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DetalladoItemProvider(AdapterFactory adapterFactory) {
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
			addNOMBREPropertyDescriptor(object);
			addREGISTROPropertyDescriptor(object);
			addTOTAL_RECAUDO_TARIFAPropertyDescriptor(object);
			addREGISTRO_RECAUDOPropertyDescriptor(object);
			addCOSTO_TARIFAPropertyDescriptor(object);
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
				 getString("_UI_Detallado_ID_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Detallado_ID_feature", "_UI_Detallado_type"),
				 ResultcotracirPackage.Literals.DETALLADO__ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the NOMBRE feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNOMBREPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Detallado_NOMBRE_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Detallado_NOMBRE_feature", "_UI_Detallado_type"),
				 ResultcotracirPackage.Literals.DETALLADO__NOMBRE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the REGISTRO feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addREGISTROPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Detallado_REGISTRO_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Detallado_REGISTRO_feature", "_UI_Detallado_type"),
				 ResultcotracirPackage.Literals.DETALLADO__REGISTRO,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the TOTAL RECAUDO TARIFA feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTOTAL_RECAUDO_TARIFAPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Detallado_TOTAL_RECAUDO_TARIFA_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Detallado_TOTAL_RECAUDO_TARIFA_feature", "_UI_Detallado_type"),
				 ResultcotracirPackage.Literals.DETALLADO__TOTAL_RECAUDO_TARIFA,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the REGISTRO RECAUDO feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addREGISTRO_RECAUDOPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Detallado_REGISTRO_RECAUDO_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Detallado_REGISTRO_RECAUDO_feature", "_UI_Detallado_type"),
				 ResultcotracirPackage.Literals.DETALLADO__REGISTRO_RECAUDO,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the COSTO TARIFA feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCOSTO_TARIFAPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Detallado_COSTO_TARIFA_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Detallado_COSTO_TARIFA_feature", "_UI_Detallado_type"),
				 ResultcotracirPackage.Literals.DETALLADO__COSTO_TARIFA,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns Detallado.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Detallado"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		Integer labelValue = ((Detallado)object).getID();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_Detallado_type") :
			getString("_UI_Detallado_type") + " " + label;
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

		switch (notification.getFeatureID(Detallado.class)) {
			case ResultcotracirPackage.DETALLADO__ID:
			case ResultcotracirPackage.DETALLADO__NOMBRE:
			case ResultcotracirPackage.DETALLADO__REGISTRO:
			case ResultcotracirPackage.DETALLADO__TOTAL_RECAUDO_TARIFA:
			case ResultcotracirPackage.DETALLADO__REGISTRO_RECAUDO:
			case ResultcotracirPackage.DETALLADO__COSTO_TARIFA:
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
