/**
 */
package gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.impl;

import gestionmodelosconsultas.modeloconsultas.resultset.impl.ElementoModeloResultadoImpl;

import gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.ResultcotracirPackage;
import gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Transaccion;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transaccion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.impl.TransaccionImpl#getESTADO_TRANSACCION <em>ESTADO TRANSACCION</em>}</li>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.impl.TransaccionImpl#getHORA <em>HORA</em>}</li>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.impl.TransaccionImpl#getTIPO <em>TIPO</em>}</li>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.impl.TransaccionImpl#getDESCRIPCION <em>DESCRIPCION</em>}</li>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.impl.TransaccionImpl#getCATEGORIA <em>CATEGORIA</em>}</li>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.impl.TransaccionImpl#getID <em>ID</em>}</li>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.impl.TransaccionImpl#getVALOR <em>VALOR</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransaccionImpl extends ElementoModeloResultadoImpl implements Transaccion {
	/**
	 * The default value of the '{@link #getESTADO_TRANSACCION() <em>ESTADO TRANSACCION</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getESTADO_TRANSACCION()
	 * @generated
	 * @ordered
	 */
	protected static final String ESTADO_TRANSACCION_EDEFAULT = "false";

	/**
	 * The cached value of the '{@link #getESTADO_TRANSACCION() <em>ESTADO TRANSACCION</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getESTADO_TRANSACCION()
	 * @generated
	 * @ordered
	 */
	protected String estadO_TRANSACCION = ESTADO_TRANSACCION_EDEFAULT;

	/**
	 * The default value of the '{@link #getHORA() <em>HORA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHORA()
	 * @generated
	 * @ordered
	 */
	protected static final Integer HORA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHORA() <em>HORA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHORA()
	 * @generated
	 * @ordered
	 */
	protected Integer hora = HORA_EDEFAULT;

	/**
	 * The default value of the '{@link #getTIPO() <em>TIPO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTIPO()
	 * @generated
	 * @ordered
	 */
	protected static final String TIPO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTIPO() <em>TIPO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTIPO()
	 * @generated
	 * @ordered
	 */
	protected String tipo = TIPO_EDEFAULT;

	/**
	 * The default value of the '{@link #getDESCRIPCION() <em>DESCRIPCION</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDESCRIPCION()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPCION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDESCRIPCION() <em>DESCRIPCION</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDESCRIPCION()
	 * @generated
	 * @ordered
	 */
	protected String descripcion = DESCRIPCION_EDEFAULT;

	/**
	 * The default value of the '{@link #getCATEGORIA() <em>CATEGORIA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCATEGORIA()
	 * @generated
	 * @ordered
	 */
	protected static final String CATEGORIA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCATEGORIA() <em>CATEGORIA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCATEGORIA()
	 * @generated
	 * @ordered
	 */
	protected String categoria = CATEGORIA_EDEFAULT;

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
	 * The default value of the '{@link #getVALOR() <em>VALOR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVALOR()
	 * @generated
	 * @ordered
	 */
	protected static final Integer VALOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVALOR() <em>VALOR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVALOR()
	 * @generated
	 * @ordered
	 */
	protected Integer valor = VALOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransaccionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResultcotracirPackage.Literals.TRANSACCION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getESTADO_TRANSACCION() {
		return estadO_TRANSACCION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setESTADO_TRANSACCION(String newESTADO_TRANSACCION) {
		String oldESTADO_TRANSACCION = estadO_TRANSACCION;
		estadO_TRANSACCION = newESTADO_TRANSACCION;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultcotracirPackage.TRANSACCION__ESTADO_TRANSACCION, oldESTADO_TRANSACCION, estadO_TRANSACCION));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getHORA() {
		return hora;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHORA(Integer newHORA) {
		Integer oldHORA = hora;
		hora = newHORA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultcotracirPackage.TRANSACCION__HORA, oldHORA, hora));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTIPO() {
		return tipo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTIPO(String newTIPO) {
		String oldTIPO = tipo;
		tipo = newTIPO;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultcotracirPackage.TRANSACCION__TIPO, oldTIPO, tipo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDESCRIPCION() {
		return descripcion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDESCRIPCION(String newDESCRIPCION) {
		String oldDESCRIPCION = descripcion;
		descripcion = newDESCRIPCION;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultcotracirPackage.TRANSACCION__DESCRIPCION, oldDESCRIPCION, descripcion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCATEGORIA() {
		return categoria;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCATEGORIA(String newCATEGORIA) {
		String oldCATEGORIA = categoria;
		categoria = newCATEGORIA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultcotracirPackage.TRANSACCION__CATEGORIA, oldCATEGORIA, categoria));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResultcotracirPackage.TRANSACCION__ID, oldID, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getVALOR() {
		return valor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVALOR(Integer newVALOR) {
		Integer oldVALOR = valor;
		valor = newVALOR;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultcotracirPackage.TRANSACCION__VALOR, oldVALOR, valor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResultcotracirPackage.TRANSACCION__ESTADO_TRANSACCION:
				return getESTADO_TRANSACCION();
			case ResultcotracirPackage.TRANSACCION__HORA:
				return getHORA();
			case ResultcotracirPackage.TRANSACCION__TIPO:
				return getTIPO();
			case ResultcotracirPackage.TRANSACCION__DESCRIPCION:
				return getDESCRIPCION();
			case ResultcotracirPackage.TRANSACCION__CATEGORIA:
				return getCATEGORIA();
			case ResultcotracirPackage.TRANSACCION__ID:
				return getID();
			case ResultcotracirPackage.TRANSACCION__VALOR:
				return getVALOR();
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
			case ResultcotracirPackage.TRANSACCION__ESTADO_TRANSACCION:
				setESTADO_TRANSACCION((String)newValue);
				return;
			case ResultcotracirPackage.TRANSACCION__HORA:
				setHORA((Integer)newValue);
				return;
			case ResultcotracirPackage.TRANSACCION__TIPO:
				setTIPO((String)newValue);
				return;
			case ResultcotracirPackage.TRANSACCION__DESCRIPCION:
				setDESCRIPCION((String)newValue);
				return;
			case ResultcotracirPackage.TRANSACCION__CATEGORIA:
				setCATEGORIA((String)newValue);
				return;
			case ResultcotracirPackage.TRANSACCION__ID:
				setID((Integer)newValue);
				return;
			case ResultcotracirPackage.TRANSACCION__VALOR:
				setVALOR((Integer)newValue);
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
			case ResultcotracirPackage.TRANSACCION__ESTADO_TRANSACCION:
				setESTADO_TRANSACCION(ESTADO_TRANSACCION_EDEFAULT);
				return;
			case ResultcotracirPackage.TRANSACCION__HORA:
				setHORA(HORA_EDEFAULT);
				return;
			case ResultcotracirPackage.TRANSACCION__TIPO:
				setTIPO(TIPO_EDEFAULT);
				return;
			case ResultcotracirPackage.TRANSACCION__DESCRIPCION:
				setDESCRIPCION(DESCRIPCION_EDEFAULT);
				return;
			case ResultcotracirPackage.TRANSACCION__CATEGORIA:
				setCATEGORIA(CATEGORIA_EDEFAULT);
				return;
			case ResultcotracirPackage.TRANSACCION__ID:
				setID(ID_EDEFAULT);
				return;
			case ResultcotracirPackage.TRANSACCION__VALOR:
				setVALOR(VALOR_EDEFAULT);
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
			case ResultcotracirPackage.TRANSACCION__ESTADO_TRANSACCION:
				return ESTADO_TRANSACCION_EDEFAULT == null ? estadO_TRANSACCION != null : !ESTADO_TRANSACCION_EDEFAULT.equals(estadO_TRANSACCION);
			case ResultcotracirPackage.TRANSACCION__HORA:
				return HORA_EDEFAULT == null ? hora != null : !HORA_EDEFAULT.equals(hora);
			case ResultcotracirPackage.TRANSACCION__TIPO:
				return TIPO_EDEFAULT == null ? tipo != null : !TIPO_EDEFAULT.equals(tipo);
			case ResultcotracirPackage.TRANSACCION__DESCRIPCION:
				return DESCRIPCION_EDEFAULT == null ? descripcion != null : !DESCRIPCION_EDEFAULT.equals(descripcion);
			case ResultcotracirPackage.TRANSACCION__CATEGORIA:
				return CATEGORIA_EDEFAULT == null ? categoria != null : !CATEGORIA_EDEFAULT.equals(categoria);
			case ResultcotracirPackage.TRANSACCION__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case ResultcotracirPackage.TRANSACCION__VALOR:
				return VALOR_EDEFAULT == null ? valor != null : !VALOR_EDEFAULT.equals(valor);
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
		result.append(" (ESTADO_TRANSACCION: ");
		result.append(estadO_TRANSACCION);
		result.append(", HORA: ");
		result.append(hora);
		result.append(", TIPO: ");
		result.append(tipo);
		result.append(", DESCRIPCION: ");
		result.append(descripcion);
		result.append(", CATEGORIA: ");
		result.append(categoria);
		result.append(", ID: ");
		result.append(id);
		result.append(", VALOR: ");
		result.append(valor);
		result.append(')');
		return result.toString();
	}

} //TransaccionImpl
