/**
 */
package gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.provider;


import gestionmodelosconsultas.modeloconsultas.resultset.provider.ElementoModeloResultadoItemProvider;

import gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.ResultcotracirPackage;
import gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Transaccion;

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
 * This is the item provider adapter for a {@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Transaccion} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TransaccionItemProvider extends ElementoModeloResultadoItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransaccionItemProvider(AdapterFactory adapterFactory) {
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

			addESTADO_TRANSACCIONPropertyDescriptor(object);
			addHORAPropertyDescriptor(object);
			addTIPOPropertyDescriptor(object);
			addDESCRIPCIONPropertyDescriptor(object);
			addCATEGORIAPropertyDescriptor(object);
			addIDPropertyDescriptor(object);
			addVALORPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the ESTADO TRANSACCION feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addESTADO_TRANSACCIONPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Transaccion_ESTADO_TRANSACCION_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Transaccion_ESTADO_TRANSACCION_feature", "_UI_Transaccion_type"),
				 ResultcotracirPackage.Literals.TRANSACCION__ESTADO_TRANSACCION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the HORA feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHORAPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Transaccion_HORA_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Transaccion_HORA_feature", "_UI_Transaccion_type"),
				 ResultcotracirPackage.Literals.TRANSACCION__HORA,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the TIPO feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTIPOPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Transaccion_TIPO_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Transaccion_TIPO_feature", "_UI_Transaccion_type"),
				 ResultcotracirPackage.Literals.TRANSACCION__TIPO,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the DESCRIPCION feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDESCRIPCIONPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Transaccion_DESCRIPCION_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Transaccion_DESCRIPCION_feature", "_UI_Transaccion_type"),
				 ResultcotracirPackage.Literals.TRANSACCION__DESCRIPCION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the CATEGORIA feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCATEGORIAPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Transaccion_CATEGORIA_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Transaccion_CATEGORIA_feature", "_UI_Transaccion_type"),
				 ResultcotracirPackage.Literals.TRANSACCION__CATEGORIA,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
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
				 getString("_UI_Transaccion_ID_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Transaccion_ID_feature", "_UI_Transaccion_type"),
				 ResultcotracirPackage.Literals.TRANSACCION__ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the VALOR feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVALORPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Transaccion_VALOR_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Transaccion_VALOR_feature", "_UI_Transaccion_type"),
				 ResultcotracirPackage.Literals.TRANSACCION__VALOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns Transaccion.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Transaccion"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		Integer labelValue = ((Transaccion)object).getID();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_Transaccion_type") :
			getString("_UI_Transaccion_type") + " " + label;
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

		switch (notification.getFeatureID(Transaccion.class)) {
			case ResultcotracirPackage.TRANSACCION__ESTADO_TRANSACCION:
			case ResultcotracirPackage.TRANSACCION__HORA:
			case ResultcotracirPackage.TRANSACCION__TIPO:
			case ResultcotracirPackage.TRANSACCION__DESCRIPCION:
			case ResultcotracirPackage.TRANSACCION__CATEGORIA:
			case ResultcotracirPackage.TRANSACCION__ID:
			case ResultcotracirPackage.TRANSACCION__VALOR:
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
