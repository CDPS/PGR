/**
 */
package gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.impl;

import gestionmodelosconsultas.modeloconsultas.resultset.impl.ElementoModeloResultadoImpl;

import gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Detallado;
import gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.ResultcotracirPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Detallado</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.impl.DetalladoImpl#getID <em>ID</em>}</li>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.impl.DetalladoImpl#getNOMBRE <em>NOMBRE</em>}</li>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.impl.DetalladoImpl#getREGISTRO <em>REGISTRO</em>}</li>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.impl.DetalladoImpl#getTOTAL_RECAUDO_TARIFA <em>TOTAL RECAUDO TARIFA</em>}</li>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.impl.DetalladoImpl#getREGISTRO_RECAUDO <em>REGISTRO RECAUDO</em>}</li>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.impl.DetalladoImpl#getCOSTO_TARIFA <em>COSTO TARIFA</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DetalladoImpl extends ElementoModeloResultadoImpl implements Detallado {
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
	 * The default value of the '{@link #getREGISTRO() <em>REGISTRO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getREGISTRO()
	 * @generated
	 * @ordered
	 */
	protected static final Integer REGISTRO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getREGISTRO() <em>REGISTRO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getREGISTRO()
	 * @generated
	 * @ordered
	 */
	protected Integer registro = REGISTRO_EDEFAULT;

	/**
	 * The default value of the '{@link #getTOTAL_RECAUDO_TARIFA() <em>TOTAL RECAUDO TARIFA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTOTAL_RECAUDO_TARIFA()
	 * @generated
	 * @ordered
	 */
	protected static final Integer TOTAL_RECAUDO_TARIFA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTOTAL_RECAUDO_TARIFA() <em>TOTAL RECAUDO TARIFA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTOTAL_RECAUDO_TARIFA()
	 * @generated
	 * @ordered
	 */
	protected Integer totaL_RECAUDO_TARIFA = TOTAL_RECAUDO_TARIFA_EDEFAULT;

	/**
	 * The default value of the '{@link #getREGISTRO_RECAUDO() <em>REGISTRO RECAUDO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getREGISTRO_RECAUDO()
	 * @generated
	 * @ordered
	 */
	protected static final Integer REGISTRO_RECAUDO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getREGISTRO_RECAUDO() <em>REGISTRO RECAUDO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getREGISTRO_RECAUDO()
	 * @generated
	 * @ordered
	 */
	protected Integer registrO_RECAUDO = REGISTRO_RECAUDO_EDEFAULT;

	/**
	 * The default value of the '{@link #getCOSTO_TARIFA() <em>COSTO TARIFA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCOSTO_TARIFA()
	 * @generated
	 * @ordered
	 */
	protected static final Integer COSTO_TARIFA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCOSTO_TARIFA() <em>COSTO TARIFA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCOSTO_TARIFA()
	 * @generated
	 * @ordered
	 */
	protected Integer costO_TARIFA = COSTO_TARIFA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DetalladoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResultcotracirPackage.Literals.DETALLADO;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResultcotracirPackage.DETALLADO__ID, oldID, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResultcotracirPackage.DETALLADO__NOMBRE, oldNOMBRE, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getREGISTRO() {
		return registro;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setREGISTRO(Integer newREGISTRO) {
		Integer oldREGISTRO = registro;
		registro = newREGISTRO;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultcotracirPackage.DETALLADO__REGISTRO, oldREGISTRO, registro));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getTOTAL_RECAUDO_TARIFA() {
		return totaL_RECAUDO_TARIFA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTOTAL_RECAUDO_TARIFA(Integer newTOTAL_RECAUDO_TARIFA) {
		Integer oldTOTAL_RECAUDO_TARIFA = totaL_RECAUDO_TARIFA;
		totaL_RECAUDO_TARIFA = newTOTAL_RECAUDO_TARIFA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultcotracirPackage.DETALLADO__TOTAL_RECAUDO_TARIFA, oldTOTAL_RECAUDO_TARIFA, totaL_RECAUDO_TARIFA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getREGISTRO_RECAUDO() {
		return registrO_RECAUDO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setREGISTRO_RECAUDO(Integer newREGISTRO_RECAUDO) {
		Integer oldREGISTRO_RECAUDO = registrO_RECAUDO;
		registrO_RECAUDO = newREGISTRO_RECAUDO;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultcotracirPackage.DETALLADO__REGISTRO_RECAUDO, oldREGISTRO_RECAUDO, registrO_RECAUDO));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getCOSTO_TARIFA() {
		return costO_TARIFA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCOSTO_TARIFA(Integer newCOSTO_TARIFA) {
		Integer oldCOSTO_TARIFA = costO_TARIFA;
		costO_TARIFA = newCOSTO_TARIFA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultcotracirPackage.DETALLADO__COSTO_TARIFA, oldCOSTO_TARIFA, costO_TARIFA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResultcotracirPackage.DETALLADO__ID:
				return getID();
			case ResultcotracirPackage.DETALLADO__NOMBRE:
				return getNOMBRE();
			case ResultcotracirPackage.DETALLADO__REGISTRO:
				return getREGISTRO();
			case ResultcotracirPackage.DETALLADO__TOTAL_RECAUDO_TARIFA:
				return getTOTAL_RECAUDO_TARIFA();
			case ResultcotracirPackage.DETALLADO__REGISTRO_RECAUDO:
				return getREGISTRO_RECAUDO();
			case ResultcotracirPackage.DETALLADO__COSTO_TARIFA:
				return getCOSTO_TARIFA();
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
			case ResultcotracirPackage.DETALLADO__ID:
				setID((Integer)newValue);
				return;
			case ResultcotracirPackage.DETALLADO__NOMBRE:
				setNOMBRE((String)newValue);
				return;
			case ResultcotracirPackage.DETALLADO__REGISTRO:
				setREGISTRO((Integer)newValue);
				return;
			case ResultcotracirPackage.DETALLADO__TOTAL_RECAUDO_TARIFA:
				setTOTAL_RECAUDO_TARIFA((Integer)newValue);
				return;
			case ResultcotracirPackage.DETALLADO__REGISTRO_RECAUDO:
				setREGISTRO_RECAUDO((Integer)newValue);
				return;
			case ResultcotracirPackage.DETALLADO__COSTO_TARIFA:
				setCOSTO_TARIFA((Integer)newValue);
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
			case ResultcotracirPackage.DETALLADO__ID:
				setID(ID_EDEFAULT);
				return;
			case ResultcotracirPackage.DETALLADO__NOMBRE:
				setNOMBRE(NOMBRE_EDEFAULT);
				return;
			case ResultcotracirPackage.DETALLADO__REGISTRO:
				setREGISTRO(REGISTRO_EDEFAULT);
				return;
			case ResultcotracirPackage.DETALLADO__TOTAL_RECAUDO_TARIFA:
				setTOTAL_RECAUDO_TARIFA(TOTAL_RECAUDO_TARIFA_EDEFAULT);
				return;
			case ResultcotracirPackage.DETALLADO__REGISTRO_RECAUDO:
				setREGISTRO_RECAUDO(REGISTRO_RECAUDO_EDEFAULT);
				return;
			case ResultcotracirPackage.DETALLADO__COSTO_TARIFA:
				setCOSTO_TARIFA(COSTO_TARIFA_EDEFAULT);
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
			case ResultcotracirPackage.DETALLADO__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case ResultcotracirPackage.DETALLADO__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case ResultcotracirPackage.DETALLADO__REGISTRO:
				return REGISTRO_EDEFAULT == null ? registro != null : !REGISTRO_EDEFAULT.equals(registro);
			case ResultcotracirPackage.DETALLADO__TOTAL_RECAUDO_TARIFA:
				return TOTAL_RECAUDO_TARIFA_EDEFAULT == null ? totaL_RECAUDO_TARIFA != null : !TOTAL_RECAUDO_TARIFA_EDEFAULT.equals(totaL_RECAUDO_TARIFA);
			case ResultcotracirPackage.DETALLADO__REGISTRO_RECAUDO:
				return REGISTRO_RECAUDO_EDEFAULT == null ? registrO_RECAUDO != null : !REGISTRO_RECAUDO_EDEFAULT.equals(registrO_RECAUDO);
			case ResultcotracirPackage.DETALLADO__COSTO_TARIFA:
				return COSTO_TARIFA_EDEFAULT == null ? costO_TARIFA != null : !COSTO_TARIFA_EDEFAULT.equals(costO_TARIFA);
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
		result.append(", REGISTRO: ");
		result.append(registro);
		result.append(", TOTAL_RECAUDO_TARIFA: ");
		result.append(totaL_RECAUDO_TARIFA);
		result.append(", REGISTRO_RECAUDO: ");
		result.append(registrO_RECAUDO);
		result.append(", COSTO_TARIFA: ");
		result.append(costO_TARIFA);
		result.append(')');
		return result.toString();
	}

} //DetalladoImpl
