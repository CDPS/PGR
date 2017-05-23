/**
 */
package gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.impl;

import gestionmodelosconsultas.modeloconsultas.resultset.impl.ElementoModeloResultadoImpl;

import gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Propietario;
import gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.ResultcotracirPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Propietario</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.impl.PropietarioImpl#getID <em>ID</em>}</li>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.impl.PropietarioImpl#getNOMBRE <em>NOMBRE</em>}</li>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.impl.PropietarioImpl#getCEDULA <em>CEDULA</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PropietarioImpl extends ElementoModeloResultadoImpl implements Propietario {
	/**
	 * The default value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected Integer id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getNOMBRE() <em>NOMBRE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNOMBRE()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNOMBRE() <em>NOMBRE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNOMBRE()
	 * @generated
	 * @ordered
	 */
	protected String nombre = NOMBRE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCEDULA() <em>CEDULA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCEDULA()
	 * @generated
	 * @ordered
	 */
	protected static final String CEDULA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCEDULA() <em>CEDULA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCEDULA()
	 * @generated
	 * @ordered
	 */
	protected String cedula = CEDULA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropietarioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResultcotracirPackage.Literals.PROPIETARIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getID() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setID(Integer newID) {
		Integer oldID = id;
		id = newID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultcotracirPackage.PROPIETARIO__ID, oldID, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNOMBRE() {
		return nombre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNOMBRE(String newNOMBRE) {
		String oldNOMBRE = nombre;
		nombre = newNOMBRE;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultcotracirPackage.PROPIETARIO__NOMBRE, oldNOMBRE, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCEDULA() {
		return cedula;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCEDULA(String newCEDULA) {
		String oldCEDULA = cedula;
		cedula = newCEDULA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultcotracirPackage.PROPIETARIO__CEDULA, oldCEDULA, cedula));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResultcotracirPackage.PROPIETARIO__ID:
				return getID();
			case ResultcotracirPackage.PROPIETARIO__NOMBRE:
				return getNOMBRE();
			case ResultcotracirPackage.PROPIETARIO__CEDULA:
				return getCEDULA();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ResultcotracirPackage.PROPIETARIO__ID:
				setID((Integer)newValue);
				return;
			case ResultcotracirPackage.PROPIETARIO__NOMBRE:
				setNOMBRE((String)newValue);
				return;
			case ResultcotracirPackage.PROPIETARIO__CEDULA:
				setCEDULA((String)newValue);
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
			case ResultcotracirPackage.PROPIETARIO__ID:
				setID(ID_EDEFAULT);
				return;
			case ResultcotracirPackage.PROPIETARIO__NOMBRE:
				setNOMBRE(NOMBRE_EDEFAULT);
				return;
			case ResultcotracirPackage.PROPIETARIO__CEDULA:
				setCEDULA(CEDULA_EDEFAULT);
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
			case ResultcotracirPackage.PROPIETARIO__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case ResultcotracirPackage.PROPIETARIO__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case ResultcotracirPackage.PROPIETARIO__CEDULA:
				return CEDULA_EDEFAULT == null ? cedula != null : !CEDULA_EDEFAULT.equals(cedula);
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
		result.append(" (ID: ");
		result.append(id);
		result.append(", NOMBRE: ");
		result.append(nombre);
		result.append(", CEDULA: ");
		result.append(cedula);
		result.append(')');
		return result.toString();
	}

} //PropietarioImpl
