/**
 */
package gestionmodelosconsultas.modeloconsultas.model.impl;

import gestionmodelosconsultas.modeloconsultas.model.ElementoModelo;
import gestionmodelosconsultas.modeloconsultas.model.ModelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Elemento Modelo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.model.impl.ElementoModeloImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.model.impl.ElementoModeloImpl#getFrom <em>From</em>}</li>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.model.impl.ElementoModeloImpl#getTo <em>To</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElementoModeloImpl extends MinimalEObjectImpl.Container implements ElementoModelo {
	/**
	 * The default value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected String nombre = NOMBRE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFrom() <em>From</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected EList<ElementoModelo> from;

	/**
	 * The cached value of the '{@link #getTo() <em>To</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected EList<ElementoModelo> to;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementoModeloImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.ELEMENTO_MODELO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombre(String newNombre) {
		String oldNombre = nombre;
		nombre = newNombre;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ELEMENTO_MODELO__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ElementoModelo> getFrom() {
		if (from == null) {
			from = new EObjectWithInverseResolvingEList.ManyInverse<ElementoModelo>(ElementoModelo.class, this, ModelPackage.ELEMENTO_MODELO__FROM, ModelPackage.ELEMENTO_MODELO__TO);
		}
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ElementoModelo> getTo() {
		if (to == null) {
			to = new EObjectWithInverseResolvingEList.ManyInverse<ElementoModelo>(ElementoModelo.class, this, ModelPackage.ELEMENTO_MODELO__TO, ModelPackage.ELEMENTO_MODELO__FROM);
		}
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.ELEMENTO_MODELO__FROM:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFrom()).basicAdd(otherEnd, msgs);
			case ModelPackage.ELEMENTO_MODELO__TO:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTo()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.ELEMENTO_MODELO__FROM:
				return ((InternalEList<?>)getFrom()).basicRemove(otherEnd, msgs);
			case ModelPackage.ELEMENTO_MODELO__TO:
				return ((InternalEList<?>)getTo()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.ELEMENTO_MODELO__NOMBRE:
				return getNombre();
			case ModelPackage.ELEMENTO_MODELO__FROM:
				return getFrom();
			case ModelPackage.ELEMENTO_MODELO__TO:
				return getTo();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModelPackage.ELEMENTO_MODELO__NOMBRE:
				setNombre((String)newValue);
				return;
			case ModelPackage.ELEMENTO_MODELO__FROM:
				getFrom().clear();
				getFrom().addAll((Collection<? extends ElementoModelo>)newValue);
				return;
			case ModelPackage.ELEMENTO_MODELO__TO:
				getTo().clear();
				getTo().addAll((Collection<? extends ElementoModelo>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ModelPackage.ELEMENTO_MODELO__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case ModelPackage.ELEMENTO_MODELO__FROM:
				getFrom().clear();
				return;
			case ModelPackage.ELEMENTO_MODELO__TO:
				getTo().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ModelPackage.ELEMENTO_MODELO__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case ModelPackage.ELEMENTO_MODELO__FROM:
				return from != null && !from.isEmpty();
			case ModelPackage.ELEMENTO_MODELO__TO:
				return to != null && !to.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (nombre: ");
		result.append(nombre);
		result.append(')');
		return result.toString();
	}

} //ElementoModeloImpl
