/**
 */
package gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.impl;

import gestionmodelosconsultas.modeloconsultas.resultset.impl.ElementoModeloResultadoImpl;

import gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.ResultcotracirPackage;
import gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Trama;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trama</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.impl.TramaImpl#getID <em>ID</em>}</li>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.impl.TramaImpl#getCADENA_TRAMA <em>CADENA TRAMA</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TramaImpl extends ElementoModeloResultadoImpl implements Trama {
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
	 * The default value of the '{@link #getCADENA_TRAMA() <em>CADENA TRAMA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCADENA_TRAMA()
	 * @generated
	 * @ordered
	 */
	protected static final String CADENA_TRAMA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCADENA_TRAMA() <em>CADENA TRAMA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCADENA_TRAMA()
	 * @generated
	 * @ordered
	 */
	protected String cadenA_TRAMA = CADENA_TRAMA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TramaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResultcotracirPackage.Literals.TRAMA;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResultcotracirPackage.TRAMA__ID, oldID, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCADENA_TRAMA() {
		return cadenA_TRAMA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCADENA_TRAMA(String newCADENA_TRAMA) {
		String oldCADENA_TRAMA = cadenA_TRAMA;
		cadenA_TRAMA = newCADENA_TRAMA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultcotracirPackage.TRAMA__CADENA_TRAMA, oldCADENA_TRAMA, cadenA_TRAMA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResultcotracirPackage.TRAMA__ID:
				return getID();
			case ResultcotracirPackage.TRAMA__CADENA_TRAMA:
				return getCADENA_TRAMA();
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
			case ResultcotracirPackage.TRAMA__ID:
				setID((Integer)newValue);
				return;
			case ResultcotracirPackage.TRAMA__CADENA_TRAMA:
				setCADENA_TRAMA((String)newValue);
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
			case ResultcotracirPackage.TRAMA__ID:
				setID(ID_EDEFAULT);
				return;
			case ResultcotracirPackage.TRAMA__CADENA_TRAMA:
				setCADENA_TRAMA(CADENA_TRAMA_EDEFAULT);
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
			case ResultcotracirPackage.TRAMA__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case ResultcotracirPackage.TRAMA__CADENA_TRAMA:
				return CADENA_TRAMA_EDEFAULT == null ? cadenA_TRAMA != null : !CADENA_TRAMA_EDEFAULT.equals(cadenA_TRAMA);
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
		result.append(", CADENA_TRAMA: ");
		result.append(cadenA_TRAMA);
		result.append(')');
		return result.toString();
	}

} //TramaImpl
