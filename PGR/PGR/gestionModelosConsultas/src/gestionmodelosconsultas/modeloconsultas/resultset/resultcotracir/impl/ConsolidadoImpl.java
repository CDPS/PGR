/**
 */
package gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.impl;

import gestionmodelosconsultas.modeloconsultas.resultset.impl.ElementoModeloResultadoImpl;

import gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Consolidado;
import gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.ResultcotracirPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Consolidado</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.impl.ConsolidadoImpl#getID <em>ID</em>}</li>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.impl.ConsolidadoImpl#getRUTA_DESPACHO <em>RUTA DESPACHO</em>}</li>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.impl.ConsolidadoImpl#getHORA_DESPACHO <em>HORA DESPACHO</em>}</li>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.impl.ConsolidadoImpl#getREGISTRO_CONSOLIDADO <em>REGISTRO CONSOLIDADO</em>}</li>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.impl.ConsolidadoImpl#getTOTAL_RECAUDO_BRUTO <em>TOTAL RECAUDO BRUTO</em>}</li>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.impl.ConsolidadoImpl#getTOTAL_RECAUDO_DESPACHO <em>TOTAL RECAUDO DESPACHO</em>}</li>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.impl.ConsolidadoImpl#getESTADO_CONSOLIDADO <em>ESTADO CONSOLIDADO</em>}</li>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.impl.ConsolidadoImpl#getESTADO_IMPRESION <em>ESTADO IMPRESION</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConsolidadoImpl extends ElementoModeloResultadoImpl implements Consolidado {
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
	 * The default value of the '{@link #getRUTA_DESPACHO() <em>RUTA DESPACHO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRUTA_DESPACHO()
	 * @generated
	 * @ordered
	 */
	protected static final String RUTA_DESPACHO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRUTA_DESPACHO() <em>RUTA DESPACHO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRUTA_DESPACHO()
	 * @generated
	 * @ordered
	 */
	protected String rutA_DESPACHO = RUTA_DESPACHO_EDEFAULT;

	/**
	 * The default value of the '{@link #getHORA_DESPACHO() <em>HORA DESPACHO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHORA_DESPACHO()
	 * @generated
	 * @ordered
	 */
	protected static final Integer HORA_DESPACHO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHORA_DESPACHO() <em>HORA DESPACHO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHORA_DESPACHO()
	 * @generated
	 * @ordered
	 */
	protected Integer horA_DESPACHO = HORA_DESPACHO_EDEFAULT;

	/**
	 * The default value of the '{@link #getREGISTRO_CONSOLIDADO() <em>REGISTRO CONSOLIDADO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getREGISTRO_CONSOLIDADO()
	 * @generated
	 * @ordered
	 */
	protected static final String REGISTRO_CONSOLIDADO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getREGISTRO_CONSOLIDADO() <em>REGISTRO CONSOLIDADO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getREGISTRO_CONSOLIDADO()
	 * @generated
	 * @ordered
	 */
	protected String registrO_CONSOLIDADO = REGISTRO_CONSOLIDADO_EDEFAULT;

	/**
	 * The default value of the '{@link #getTOTAL_RECAUDO_BRUTO() <em>TOTAL RECAUDO BRUTO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTOTAL_RECAUDO_BRUTO()
	 * @generated
	 * @ordered
	 */
	protected static final Integer TOTAL_RECAUDO_BRUTO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTOTAL_RECAUDO_BRUTO() <em>TOTAL RECAUDO BRUTO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTOTAL_RECAUDO_BRUTO()
	 * @generated
	 * @ordered
	 */
	protected Integer totaL_RECAUDO_BRUTO = TOTAL_RECAUDO_BRUTO_EDEFAULT;

	/**
	 * The default value of the '{@link #getTOTAL_RECAUDO_DESPACHO() <em>TOTAL RECAUDO DESPACHO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTOTAL_RECAUDO_DESPACHO()
	 * @generated
	 * @ordered
	 */
	protected static final Integer TOTAL_RECAUDO_DESPACHO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTOTAL_RECAUDO_DESPACHO() <em>TOTAL RECAUDO DESPACHO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTOTAL_RECAUDO_DESPACHO()
	 * @generated
	 * @ordered
	 */
	protected Integer totaL_RECAUDO_DESPACHO = TOTAL_RECAUDO_DESPACHO_EDEFAULT;

	/**
	 * The default value of the '{@link #getESTADO_CONSOLIDADO() <em>ESTADO CONSOLIDADO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getESTADO_CONSOLIDADO()
	 * @generated
	 * @ordered
	 */
	protected static final String ESTADO_CONSOLIDADO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getESTADO_CONSOLIDADO() <em>ESTADO CONSOLIDADO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getESTADO_CONSOLIDADO()
	 * @generated
	 * @ordered
	 */
	protected String estadO_CONSOLIDADO = ESTADO_CONSOLIDADO_EDEFAULT;

	/**
	 * The default value of the '{@link #getESTADO_IMPRESION() <em>ESTADO IMPRESION</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getESTADO_IMPRESION()
	 * @generated
	 * @ordered
	 */
	protected static final String ESTADO_IMPRESION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getESTADO_IMPRESION() <em>ESTADO IMPRESION</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getESTADO_IMPRESION()
	 * @generated
	 * @ordered
	 */
	protected String estadO_IMPRESION = ESTADO_IMPRESION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConsolidadoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResultcotracirPackage.Literals.CONSOLIDADO;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResultcotracirPackage.CONSOLIDADO__ID, oldID, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRUTA_DESPACHO() {
		return rutA_DESPACHO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRUTA_DESPACHO(String newRUTA_DESPACHO) {
		String oldRUTA_DESPACHO = rutA_DESPACHO;
		rutA_DESPACHO = newRUTA_DESPACHO;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultcotracirPackage.CONSOLIDADO__RUTA_DESPACHO, oldRUTA_DESPACHO, rutA_DESPACHO));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getHORA_DESPACHO() {
		return horA_DESPACHO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHORA_DESPACHO(Integer newHORA_DESPACHO) {
		Integer oldHORA_DESPACHO = horA_DESPACHO;
		horA_DESPACHO = newHORA_DESPACHO;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultcotracirPackage.CONSOLIDADO__HORA_DESPACHO, oldHORA_DESPACHO, horA_DESPACHO));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getREGISTRO_CONSOLIDADO() {
		return registrO_CONSOLIDADO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setREGISTRO_CONSOLIDADO(String newREGISTRO_CONSOLIDADO) {
		String oldREGISTRO_CONSOLIDADO = registrO_CONSOLIDADO;
		registrO_CONSOLIDADO = newREGISTRO_CONSOLIDADO;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultcotracirPackage.CONSOLIDADO__REGISTRO_CONSOLIDADO, oldREGISTRO_CONSOLIDADO, registrO_CONSOLIDADO));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getTOTAL_RECAUDO_BRUTO() {
		return totaL_RECAUDO_BRUTO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTOTAL_RECAUDO_BRUTO(Integer newTOTAL_RECAUDO_BRUTO) {
		Integer oldTOTAL_RECAUDO_BRUTO = totaL_RECAUDO_BRUTO;
		totaL_RECAUDO_BRUTO = newTOTAL_RECAUDO_BRUTO;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultcotracirPackage.CONSOLIDADO__TOTAL_RECAUDO_BRUTO, oldTOTAL_RECAUDO_BRUTO, totaL_RECAUDO_BRUTO));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getTOTAL_RECAUDO_DESPACHO() {
		return totaL_RECAUDO_DESPACHO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTOTAL_RECAUDO_DESPACHO(Integer newTOTAL_RECAUDO_DESPACHO) {
		Integer oldTOTAL_RECAUDO_DESPACHO = totaL_RECAUDO_DESPACHO;
		totaL_RECAUDO_DESPACHO = newTOTAL_RECAUDO_DESPACHO;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultcotracirPackage.CONSOLIDADO__TOTAL_RECAUDO_DESPACHO, oldTOTAL_RECAUDO_DESPACHO, totaL_RECAUDO_DESPACHO));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getESTADO_CONSOLIDADO() {
		return estadO_CONSOLIDADO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setESTADO_CONSOLIDADO(String newESTADO_CONSOLIDADO) {
		String oldESTADO_CONSOLIDADO = estadO_CONSOLIDADO;
		estadO_CONSOLIDADO = newESTADO_CONSOLIDADO;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultcotracirPackage.CONSOLIDADO__ESTADO_CONSOLIDADO, oldESTADO_CONSOLIDADO, estadO_CONSOLIDADO));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getESTADO_IMPRESION() {
		return estadO_IMPRESION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setESTADO_IMPRESION(String newESTADO_IMPRESION) {
		String oldESTADO_IMPRESION = estadO_IMPRESION;
		estadO_IMPRESION = newESTADO_IMPRESION;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultcotracirPackage.CONSOLIDADO__ESTADO_IMPRESION, oldESTADO_IMPRESION, estadO_IMPRESION));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResultcotracirPackage.CONSOLIDADO__ID:
				return getID();
			case ResultcotracirPackage.CONSOLIDADO__RUTA_DESPACHO:
				return getRUTA_DESPACHO();
			case ResultcotracirPackage.CONSOLIDADO__HORA_DESPACHO:
				return getHORA_DESPACHO();
			case ResultcotracirPackage.CONSOLIDADO__REGISTRO_CONSOLIDADO:
				return getREGISTRO_CONSOLIDADO();
			case ResultcotracirPackage.CONSOLIDADO__TOTAL_RECAUDO_BRUTO:
				return getTOTAL_RECAUDO_BRUTO();
			case ResultcotracirPackage.CONSOLIDADO__TOTAL_RECAUDO_DESPACHO:
				return getTOTAL_RECAUDO_DESPACHO();
			case ResultcotracirPackage.CONSOLIDADO__ESTADO_CONSOLIDADO:
				return getESTADO_CONSOLIDADO();
			case ResultcotracirPackage.CONSOLIDADO__ESTADO_IMPRESION:
				return getESTADO_IMPRESION();
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
			case ResultcotracirPackage.CONSOLIDADO__ID:
				setID((Integer)newValue);
				return;
			case ResultcotracirPackage.CONSOLIDADO__RUTA_DESPACHO:
				setRUTA_DESPACHO((String)newValue);
				return;
			case ResultcotracirPackage.CONSOLIDADO__HORA_DESPACHO:
				setHORA_DESPACHO((Integer)newValue);
				return;
			case ResultcotracirPackage.CONSOLIDADO__REGISTRO_CONSOLIDADO:
				setREGISTRO_CONSOLIDADO((String)newValue);
				return;
			case ResultcotracirPackage.CONSOLIDADO__TOTAL_RECAUDO_BRUTO:
				setTOTAL_RECAUDO_BRUTO((Integer)newValue);
				return;
			case ResultcotracirPackage.CONSOLIDADO__TOTAL_RECAUDO_DESPACHO:
				setTOTAL_RECAUDO_DESPACHO((Integer)newValue);
				return;
			case ResultcotracirPackage.CONSOLIDADO__ESTADO_CONSOLIDADO:
				setESTADO_CONSOLIDADO((String)newValue);
				return;
			case ResultcotracirPackage.CONSOLIDADO__ESTADO_IMPRESION:
				setESTADO_IMPRESION((String)newValue);
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
			case ResultcotracirPackage.CONSOLIDADO__ID:
				setID(ID_EDEFAULT);
				return;
			case ResultcotracirPackage.CONSOLIDADO__RUTA_DESPACHO:
				setRUTA_DESPACHO(RUTA_DESPACHO_EDEFAULT);
				return;
			case ResultcotracirPackage.CONSOLIDADO__HORA_DESPACHO:
				setHORA_DESPACHO(HORA_DESPACHO_EDEFAULT);
				return;
			case ResultcotracirPackage.CONSOLIDADO__REGISTRO_CONSOLIDADO:
				setREGISTRO_CONSOLIDADO(REGISTRO_CONSOLIDADO_EDEFAULT);
				return;
			case ResultcotracirPackage.CONSOLIDADO__TOTAL_RECAUDO_BRUTO:
				setTOTAL_RECAUDO_BRUTO(TOTAL_RECAUDO_BRUTO_EDEFAULT);
				return;
			case ResultcotracirPackage.CONSOLIDADO__TOTAL_RECAUDO_DESPACHO:
				setTOTAL_RECAUDO_DESPACHO(TOTAL_RECAUDO_DESPACHO_EDEFAULT);
				return;
			case ResultcotracirPackage.CONSOLIDADO__ESTADO_CONSOLIDADO:
				setESTADO_CONSOLIDADO(ESTADO_CONSOLIDADO_EDEFAULT);
				return;
			case ResultcotracirPackage.CONSOLIDADO__ESTADO_IMPRESION:
				setESTADO_IMPRESION(ESTADO_IMPRESION_EDEFAULT);
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
			case ResultcotracirPackage.CONSOLIDADO__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case ResultcotracirPackage.CONSOLIDADO__RUTA_DESPACHO:
				return RUTA_DESPACHO_EDEFAULT == null ? rutA_DESPACHO != null : !RUTA_DESPACHO_EDEFAULT.equals(rutA_DESPACHO);
			case ResultcotracirPackage.CONSOLIDADO__HORA_DESPACHO:
				return HORA_DESPACHO_EDEFAULT == null ? horA_DESPACHO != null : !HORA_DESPACHO_EDEFAULT.equals(horA_DESPACHO);
			case ResultcotracirPackage.CONSOLIDADO__REGISTRO_CONSOLIDADO:
				return REGISTRO_CONSOLIDADO_EDEFAULT == null ? registrO_CONSOLIDADO != null : !REGISTRO_CONSOLIDADO_EDEFAULT.equals(registrO_CONSOLIDADO);
			case ResultcotracirPackage.CONSOLIDADO__TOTAL_RECAUDO_BRUTO:
				return TOTAL_RECAUDO_BRUTO_EDEFAULT == null ? totaL_RECAUDO_BRUTO != null : !TOTAL_RECAUDO_BRUTO_EDEFAULT.equals(totaL_RECAUDO_BRUTO);
			case ResultcotracirPackage.CONSOLIDADO__TOTAL_RECAUDO_DESPACHO:
				return TOTAL_RECAUDO_DESPACHO_EDEFAULT == null ? totaL_RECAUDO_DESPACHO != null : !TOTAL_RECAUDO_DESPACHO_EDEFAULT.equals(totaL_RECAUDO_DESPACHO);
			case ResultcotracirPackage.CONSOLIDADO__ESTADO_CONSOLIDADO:
				return ESTADO_CONSOLIDADO_EDEFAULT == null ? estadO_CONSOLIDADO != null : !ESTADO_CONSOLIDADO_EDEFAULT.equals(estadO_CONSOLIDADO);
			case ResultcotracirPackage.CONSOLIDADO__ESTADO_IMPRESION:
				return ESTADO_IMPRESION_EDEFAULT == null ? estadO_IMPRESION != null : !ESTADO_IMPRESION_EDEFAULT.equals(estadO_IMPRESION);
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
		result.append(", RUTA_DESPACHO: ");
		result.append(rutA_DESPACHO);
		result.append(", HORA_DESPACHO: ");
		result.append(horA_DESPACHO);
		result.append(", REGISTRO_CONSOLIDADO: ");
		result.append(registrO_CONSOLIDADO);
		result.append(", TOTAL_RECAUDO_BRUTO: ");
		result.append(totaL_RECAUDO_BRUTO);
		result.append(", TOTAL_RECAUDO_DESPACHO: ");
		result.append(totaL_RECAUDO_DESPACHO);
		result.append(", ESTADO_CONSOLIDADO: ");
		result.append(estadO_CONSOLIDADO);
		result.append(", ESTADO_IMPRESION: ");
		result.append(estadO_IMPRESION);
		result.append(')');
		return result.toString();
	}

} //ConsolidadoImpl
