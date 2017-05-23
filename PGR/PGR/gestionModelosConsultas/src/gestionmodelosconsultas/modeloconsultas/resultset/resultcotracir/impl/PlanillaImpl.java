/**
 */
package gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.impl;

import gestionmodelosconsultas.modeloconsultas.resultset.impl.ElementoModeloResultadoImpl;

import gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Planilla;
import gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.ResultcotracirPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Planilla</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.impl.PlanillaImpl#getID <em>ID</em>}</li>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.impl.PlanillaImpl#getNUMERO_MOVIL <em>NUMERO MOVIL</em>}</li>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.impl.PlanillaImpl#getFECHA <em>FECHA</em>}</li>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.impl.PlanillaImpl#getCEDULA_CONDUCTOR <em>CEDULA CONDUCTOR</em>}</li>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.impl.PlanillaImpl#getCONDUCTOR <em>CONDUCTOR</em>}</li>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.impl.PlanillaImpl#getTOTAL <em>TOTAL</em>}</li>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.impl.PlanillaImpl#getTOTAL_RECAUDO_BRUTO <em>TOTAL RECAUDO BRUTO</em>}</li>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.impl.PlanillaImpl#getTOTAL_RECAUDO_NETO <em>TOTAL RECAUDO NETO</em>}</li>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.impl.PlanillaImpl#getTOTAL_DEPOSITO <em>TOTAL DEPOSITO</em>}</li>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.impl.PlanillaImpl#getTOTAL_GASTOS <em>TOTAL GASTOS</em>}</li>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.impl.PlanillaImpl#getLIQUIDADO <em>LIQUIDADO</em>}</li>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.impl.PlanillaImpl#getUSUARIO <em>USUARIO</em>}</li>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.impl.PlanillaImpl#getNOMBRE_PERSONA <em>NOMBRE PERSONA</em>}</li>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.impl.PlanillaImpl#getAPELLIDO <em>APELLIDO</em>}</li>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.impl.PlanillaImpl#getCEDULA <em>CEDULA</em>}</li>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.impl.PlanillaImpl#getHORA_MODIFICACION <em>HORA MODIFICACION</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlanillaImpl extends ElementoModeloResultadoImpl implements Planilla {
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
	 * The default value of the '{@link #getNUMERO_MOVIL() <em>NUMERO MOVIL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNUMERO_MOVIL()
	 * @generated
	 * @ordered
	 */
	protected static final String NUMERO_MOVIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNUMERO_MOVIL() <em>NUMERO MOVIL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNUMERO_MOVIL()
	 * @generated
	 * @ordered
	 */
	protected String numerO_MOVIL = NUMERO_MOVIL_EDEFAULT;

	/**
	 * The default value of the '{@link #getFECHA() <em>FECHA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFECHA()
	 * @generated
	 * @ordered
	 */
	protected static final String FECHA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFECHA() <em>FECHA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFECHA()
	 * @generated
	 * @ordered
	 */
	protected String fecha = FECHA_EDEFAULT;

	/**
	 * The default value of the '{@link #getCEDULA_CONDUCTOR() <em>CEDULA CONDUCTOR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCEDULA_CONDUCTOR()
	 * @generated
	 * @ordered
	 */
	protected static final String CEDULA_CONDUCTOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCEDULA_CONDUCTOR() <em>CEDULA CONDUCTOR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCEDULA_CONDUCTOR()
	 * @generated
	 * @ordered
	 */
	protected String cedulA_CONDUCTOR = CEDULA_CONDUCTOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getCONDUCTOR() <em>CONDUCTOR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONDUCTOR()
	 * @generated
	 * @ordered
	 */
	protected static final String CONDUCTOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCONDUCTOR() <em>CONDUCTOR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONDUCTOR()
	 * @generated
	 * @ordered
	 */
	protected String conductor = CONDUCTOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getTOTAL() <em>TOTAL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTOTAL()
	 * @generated
	 * @ordered
	 */
	protected static final Integer TOTAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTOTAL() <em>TOTAL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTOTAL()
	 * @generated
	 * @ordered
	 */
	protected Integer total = TOTAL_EDEFAULT;

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
	 * The default value of the '{@link #getTOTAL_RECAUDO_NETO() <em>TOTAL RECAUDO NETO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTOTAL_RECAUDO_NETO()
	 * @generated
	 * @ordered
	 */
	protected static final Integer TOTAL_RECAUDO_NETO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTOTAL_RECAUDO_NETO() <em>TOTAL RECAUDO NETO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTOTAL_RECAUDO_NETO()
	 * @generated
	 * @ordered
	 */
	protected Integer totaL_RECAUDO_NETO = TOTAL_RECAUDO_NETO_EDEFAULT;

	/**
	 * The default value of the '{@link #getTOTAL_DEPOSITO() <em>TOTAL DEPOSITO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTOTAL_DEPOSITO()
	 * @generated
	 * @ordered
	 */
	protected static final Integer TOTAL_DEPOSITO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTOTAL_DEPOSITO() <em>TOTAL DEPOSITO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTOTAL_DEPOSITO()
	 * @generated
	 * @ordered
	 */
	protected Integer totaL_DEPOSITO = TOTAL_DEPOSITO_EDEFAULT;

	/**
	 * The default value of the '{@link #getTOTAL_GASTOS() <em>TOTAL GASTOS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTOTAL_GASTOS()
	 * @generated
	 * @ordered
	 */
	protected static final Integer TOTAL_GASTOS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTOTAL_GASTOS() <em>TOTAL GASTOS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTOTAL_GASTOS()
	 * @generated
	 * @ordered
	 */
	protected Integer totaL_GASTOS = TOTAL_GASTOS_EDEFAULT;

	/**
	 * The default value of the '{@link #getLIQUIDADO() <em>LIQUIDADO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLIQUIDADO()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean LIQUIDADO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLIQUIDADO() <em>LIQUIDADO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLIQUIDADO()
	 * @generated
	 * @ordered
	 */
	protected Boolean liquidado = LIQUIDADO_EDEFAULT;

	/**
	 * The default value of the '{@link #getUSUARIO() <em>USUARIO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUSUARIO()
	 * @generated
	 * @ordered
	 */
	protected static final Integer USUARIO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUSUARIO() <em>USUARIO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUSUARIO()
	 * @generated
	 * @ordered
	 */
	protected Integer usuario = USUARIO_EDEFAULT;

	/**
	 * The default value of the '{@link #getNOMBRE_PERSONA() <em>NOMBRE PERSONA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNOMBRE_PERSONA()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_PERSONA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNOMBRE_PERSONA() <em>NOMBRE PERSONA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNOMBRE_PERSONA()
	 * @generated
	 * @ordered
	 */
	protected String nombrE_PERSONA = NOMBRE_PERSONA_EDEFAULT;

	/**
	 * The default value of the '{@link #getAPELLIDO() <em>APELLIDO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPELLIDO()
	 * @generated
	 * @ordered
	 */
	protected static final String APELLIDO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAPELLIDO() <em>APELLIDO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPELLIDO()
	 * @generated
	 * @ordered
	 */
	protected String apellido = APELLIDO_EDEFAULT;

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
	 * The default value of the '{@link #getHORA_MODIFICACION() <em>HORA MODIFICACION</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHORA_MODIFICACION()
	 * @generated
	 * @ordered
	 */
	protected static final String HORA_MODIFICACION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHORA_MODIFICACION() <em>HORA MODIFICACION</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHORA_MODIFICACION()
	 * @generated
	 * @ordered
	 */
	protected String horA_MODIFICACION = HORA_MODIFICACION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlanillaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResultcotracirPackage.Literals.PLANILLA;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResultcotracirPackage.PLANILLA__ID, oldID, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNUMERO_MOVIL() {
		return numerO_MOVIL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNUMERO_MOVIL(String newNUMERO_MOVIL) {
		String oldNUMERO_MOVIL = numerO_MOVIL;
		numerO_MOVIL = newNUMERO_MOVIL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultcotracirPackage.PLANILLA__NUMERO_MOVIL, oldNUMERO_MOVIL, numerO_MOVIL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFECHA() {
		return fecha;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFECHA(String newFECHA) {
		String oldFECHA = fecha;
		fecha = newFECHA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultcotracirPackage.PLANILLA__FECHA, oldFECHA, fecha));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCEDULA_CONDUCTOR() {
		return cedulA_CONDUCTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCEDULA_CONDUCTOR(String newCEDULA_CONDUCTOR) {
		String oldCEDULA_CONDUCTOR = cedulA_CONDUCTOR;
		cedulA_CONDUCTOR = newCEDULA_CONDUCTOR;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultcotracirPackage.PLANILLA__CEDULA_CONDUCTOR, oldCEDULA_CONDUCTOR, cedulA_CONDUCTOR));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCONDUCTOR() {
		return conductor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCONDUCTOR(String newCONDUCTOR) {
		String oldCONDUCTOR = conductor;
		conductor = newCONDUCTOR;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultcotracirPackage.PLANILLA__CONDUCTOR, oldCONDUCTOR, conductor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getTOTAL() {
		return total;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTOTAL(Integer newTOTAL) {
		Integer oldTOTAL = total;
		total = newTOTAL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultcotracirPackage.PLANILLA__TOTAL, oldTOTAL, total));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResultcotracirPackage.PLANILLA__TOTAL_RECAUDO_BRUTO, oldTOTAL_RECAUDO_BRUTO, totaL_RECAUDO_BRUTO));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getTOTAL_RECAUDO_NETO() {
		return totaL_RECAUDO_NETO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTOTAL_RECAUDO_NETO(Integer newTOTAL_RECAUDO_NETO) {
		Integer oldTOTAL_RECAUDO_NETO = totaL_RECAUDO_NETO;
		totaL_RECAUDO_NETO = newTOTAL_RECAUDO_NETO;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultcotracirPackage.PLANILLA__TOTAL_RECAUDO_NETO, oldTOTAL_RECAUDO_NETO, totaL_RECAUDO_NETO));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getTOTAL_DEPOSITO() {
		return totaL_DEPOSITO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTOTAL_DEPOSITO(Integer newTOTAL_DEPOSITO) {
		Integer oldTOTAL_DEPOSITO = totaL_DEPOSITO;
		totaL_DEPOSITO = newTOTAL_DEPOSITO;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultcotracirPackage.PLANILLA__TOTAL_DEPOSITO, oldTOTAL_DEPOSITO, totaL_DEPOSITO));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getTOTAL_GASTOS() {
		return totaL_GASTOS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTOTAL_GASTOS(Integer newTOTAL_GASTOS) {
		Integer oldTOTAL_GASTOS = totaL_GASTOS;
		totaL_GASTOS = newTOTAL_GASTOS;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultcotracirPackage.PLANILLA__TOTAL_GASTOS, oldTOTAL_GASTOS, totaL_GASTOS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getLIQUIDADO() {
		return liquidado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLIQUIDADO(Boolean newLIQUIDADO) {
		Boolean oldLIQUIDADO = liquidado;
		liquidado = newLIQUIDADO;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultcotracirPackage.PLANILLA__LIQUIDADO, oldLIQUIDADO, liquidado));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getUSUARIO() {
		return usuario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUSUARIO(Integer newUSUARIO) {
		Integer oldUSUARIO = usuario;
		usuario = newUSUARIO;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultcotracirPackage.PLANILLA__USUARIO, oldUSUARIO, usuario));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNOMBRE_PERSONA() {
		return nombrE_PERSONA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNOMBRE_PERSONA(String newNOMBRE_PERSONA) {
		String oldNOMBRE_PERSONA = nombrE_PERSONA;
		nombrE_PERSONA = newNOMBRE_PERSONA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultcotracirPackage.PLANILLA__NOMBRE_PERSONA, oldNOMBRE_PERSONA, nombrE_PERSONA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAPELLIDO() {
		return apellido;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPELLIDO(String newAPELLIDO) {
		String oldAPELLIDO = apellido;
		apellido = newAPELLIDO;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultcotracirPackage.PLANILLA__APELLIDO, oldAPELLIDO, apellido));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResultcotracirPackage.PLANILLA__CEDULA, oldCEDULA, cedula));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHORA_MODIFICACION() {
		return horA_MODIFICACION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHORA_MODIFICACION(String newHORA_MODIFICACION) {
		String oldHORA_MODIFICACION = horA_MODIFICACION;
		horA_MODIFICACION = newHORA_MODIFICACION;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultcotracirPackage.PLANILLA__HORA_MODIFICACION, oldHORA_MODIFICACION, horA_MODIFICACION));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResultcotracirPackage.PLANILLA__ID:
				return getID();
			case ResultcotracirPackage.PLANILLA__NUMERO_MOVIL:
				return getNUMERO_MOVIL();
			case ResultcotracirPackage.PLANILLA__FECHA:
				return getFECHA();
			case ResultcotracirPackage.PLANILLA__CEDULA_CONDUCTOR:
				return getCEDULA_CONDUCTOR();
			case ResultcotracirPackage.PLANILLA__CONDUCTOR:
				return getCONDUCTOR();
			case ResultcotracirPackage.PLANILLA__TOTAL:
				return getTOTAL();
			case ResultcotracirPackage.PLANILLA__TOTAL_RECAUDO_BRUTO:
				return getTOTAL_RECAUDO_BRUTO();
			case ResultcotracirPackage.PLANILLA__TOTAL_RECAUDO_NETO:
				return getTOTAL_RECAUDO_NETO();
			case ResultcotracirPackage.PLANILLA__TOTAL_DEPOSITO:
				return getTOTAL_DEPOSITO();
			case ResultcotracirPackage.PLANILLA__TOTAL_GASTOS:
				return getTOTAL_GASTOS();
			case ResultcotracirPackage.PLANILLA__LIQUIDADO:
				return getLIQUIDADO();
			case ResultcotracirPackage.PLANILLA__USUARIO:
				return getUSUARIO();
			case ResultcotracirPackage.PLANILLA__NOMBRE_PERSONA:
				return getNOMBRE_PERSONA();
			case ResultcotracirPackage.PLANILLA__APELLIDO:
				return getAPELLIDO();
			case ResultcotracirPackage.PLANILLA__CEDULA:
				return getCEDULA();
			case ResultcotracirPackage.PLANILLA__HORA_MODIFICACION:
				return getHORA_MODIFICACION();
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
			case ResultcotracirPackage.PLANILLA__ID:
				setID((Integer)newValue);
				return;
			case ResultcotracirPackage.PLANILLA__NUMERO_MOVIL:
				setNUMERO_MOVIL((String)newValue);
				return;
			case ResultcotracirPackage.PLANILLA__FECHA:
				setFECHA((String)newValue);
				return;
			case ResultcotracirPackage.PLANILLA__CEDULA_CONDUCTOR:
				setCEDULA_CONDUCTOR((String)newValue);
				return;
			case ResultcotracirPackage.PLANILLA__CONDUCTOR:
				setCONDUCTOR((String)newValue);
				return;
			case ResultcotracirPackage.PLANILLA__TOTAL:
				setTOTAL((Integer)newValue);
				return;
			case ResultcotracirPackage.PLANILLA__TOTAL_RECAUDO_BRUTO:
				setTOTAL_RECAUDO_BRUTO((Integer)newValue);
				return;
			case ResultcotracirPackage.PLANILLA__TOTAL_RECAUDO_NETO:
				setTOTAL_RECAUDO_NETO((Integer)newValue);
				return;
			case ResultcotracirPackage.PLANILLA__TOTAL_DEPOSITO:
				setTOTAL_DEPOSITO((Integer)newValue);
				return;
			case ResultcotracirPackage.PLANILLA__TOTAL_GASTOS:
				setTOTAL_GASTOS((Integer)newValue);
				return;
			case ResultcotracirPackage.PLANILLA__LIQUIDADO:
				setLIQUIDADO((Boolean)newValue);
				return;
			case ResultcotracirPackage.PLANILLA__USUARIO:
				setUSUARIO((Integer)newValue);
				return;
			case ResultcotracirPackage.PLANILLA__NOMBRE_PERSONA:
				setNOMBRE_PERSONA((String)newValue);
				return;
			case ResultcotracirPackage.PLANILLA__APELLIDO:
				setAPELLIDO((String)newValue);
				return;
			case ResultcotracirPackage.PLANILLA__CEDULA:
				setCEDULA((String)newValue);
				return;
			case ResultcotracirPackage.PLANILLA__HORA_MODIFICACION:
				setHORA_MODIFICACION((String)newValue);
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
			case ResultcotracirPackage.PLANILLA__ID:
				setID(ID_EDEFAULT);
				return;
			case ResultcotracirPackage.PLANILLA__NUMERO_MOVIL:
				setNUMERO_MOVIL(NUMERO_MOVIL_EDEFAULT);
				return;
			case ResultcotracirPackage.PLANILLA__FECHA:
				setFECHA(FECHA_EDEFAULT);
				return;
			case ResultcotracirPackage.PLANILLA__CEDULA_CONDUCTOR:
				setCEDULA_CONDUCTOR(CEDULA_CONDUCTOR_EDEFAULT);
				return;
			case ResultcotracirPackage.PLANILLA__CONDUCTOR:
				setCONDUCTOR(CONDUCTOR_EDEFAULT);
				return;
			case ResultcotracirPackage.PLANILLA__TOTAL:
				setTOTAL(TOTAL_EDEFAULT);
				return;
			case ResultcotracirPackage.PLANILLA__TOTAL_RECAUDO_BRUTO:
				setTOTAL_RECAUDO_BRUTO(TOTAL_RECAUDO_BRUTO_EDEFAULT);
				return;
			case ResultcotracirPackage.PLANILLA__TOTAL_RECAUDO_NETO:
				setTOTAL_RECAUDO_NETO(TOTAL_RECAUDO_NETO_EDEFAULT);
				return;
			case ResultcotracirPackage.PLANILLA__TOTAL_DEPOSITO:
				setTOTAL_DEPOSITO(TOTAL_DEPOSITO_EDEFAULT);
				return;
			case ResultcotracirPackage.PLANILLA__TOTAL_GASTOS:
				setTOTAL_GASTOS(TOTAL_GASTOS_EDEFAULT);
				return;
			case ResultcotracirPackage.PLANILLA__LIQUIDADO:
				setLIQUIDADO(LIQUIDADO_EDEFAULT);
				return;
			case ResultcotracirPackage.PLANILLA__USUARIO:
				setUSUARIO(USUARIO_EDEFAULT);
				return;
			case ResultcotracirPackage.PLANILLA__NOMBRE_PERSONA:
				setNOMBRE_PERSONA(NOMBRE_PERSONA_EDEFAULT);
				return;
			case ResultcotracirPackage.PLANILLA__APELLIDO:
				setAPELLIDO(APELLIDO_EDEFAULT);
				return;
			case ResultcotracirPackage.PLANILLA__CEDULA:
				setCEDULA(CEDULA_EDEFAULT);
				return;
			case ResultcotracirPackage.PLANILLA__HORA_MODIFICACION:
				setHORA_MODIFICACION(HORA_MODIFICACION_EDEFAULT);
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
			case ResultcotracirPackage.PLANILLA__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case ResultcotracirPackage.PLANILLA__NUMERO_MOVIL:
				return NUMERO_MOVIL_EDEFAULT == null ? numerO_MOVIL != null : !NUMERO_MOVIL_EDEFAULT.equals(numerO_MOVIL);
			case ResultcotracirPackage.PLANILLA__FECHA:
				return FECHA_EDEFAULT == null ? fecha != null : !FECHA_EDEFAULT.equals(fecha);
			case ResultcotracirPackage.PLANILLA__CEDULA_CONDUCTOR:
				return CEDULA_CONDUCTOR_EDEFAULT == null ? cedulA_CONDUCTOR != null : !CEDULA_CONDUCTOR_EDEFAULT.equals(cedulA_CONDUCTOR);
			case ResultcotracirPackage.PLANILLA__CONDUCTOR:
				return CONDUCTOR_EDEFAULT == null ? conductor != null : !CONDUCTOR_EDEFAULT.equals(conductor);
			case ResultcotracirPackage.PLANILLA__TOTAL:
				return TOTAL_EDEFAULT == null ? total != null : !TOTAL_EDEFAULT.equals(total);
			case ResultcotracirPackage.PLANILLA__TOTAL_RECAUDO_BRUTO:
				return TOTAL_RECAUDO_BRUTO_EDEFAULT == null ? totaL_RECAUDO_BRUTO != null : !TOTAL_RECAUDO_BRUTO_EDEFAULT.equals(totaL_RECAUDO_BRUTO);
			case ResultcotracirPackage.PLANILLA__TOTAL_RECAUDO_NETO:
				return TOTAL_RECAUDO_NETO_EDEFAULT == null ? totaL_RECAUDO_NETO != null : !TOTAL_RECAUDO_NETO_EDEFAULT.equals(totaL_RECAUDO_NETO);
			case ResultcotracirPackage.PLANILLA__TOTAL_DEPOSITO:
				return TOTAL_DEPOSITO_EDEFAULT == null ? totaL_DEPOSITO != null : !TOTAL_DEPOSITO_EDEFAULT.equals(totaL_DEPOSITO);
			case ResultcotracirPackage.PLANILLA__TOTAL_GASTOS:
				return TOTAL_GASTOS_EDEFAULT == null ? totaL_GASTOS != null : !TOTAL_GASTOS_EDEFAULT.equals(totaL_GASTOS);
			case ResultcotracirPackage.PLANILLA__LIQUIDADO:
				return LIQUIDADO_EDEFAULT == null ? liquidado != null : !LIQUIDADO_EDEFAULT.equals(liquidado);
			case ResultcotracirPackage.PLANILLA__USUARIO:
				return USUARIO_EDEFAULT == null ? usuario != null : !USUARIO_EDEFAULT.equals(usuario);
			case ResultcotracirPackage.PLANILLA__NOMBRE_PERSONA:
				return NOMBRE_PERSONA_EDEFAULT == null ? nombrE_PERSONA != null : !NOMBRE_PERSONA_EDEFAULT.equals(nombrE_PERSONA);
			case ResultcotracirPackage.PLANILLA__APELLIDO:
				return APELLIDO_EDEFAULT == null ? apellido != null : !APELLIDO_EDEFAULT.equals(apellido);
			case ResultcotracirPackage.PLANILLA__CEDULA:
				return CEDULA_EDEFAULT == null ? cedula != null : !CEDULA_EDEFAULT.equals(cedula);
			case ResultcotracirPackage.PLANILLA__HORA_MODIFICACION:
				return HORA_MODIFICACION_EDEFAULT == null ? horA_MODIFICACION != null : !HORA_MODIFICACION_EDEFAULT.equals(horA_MODIFICACION);
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
		result.append(", NUMERO_MOVIL: ");
		result.append(numerO_MOVIL);
		result.append(", FECHA: ");
		result.append(fecha);
		result.append(", CEDULA_CONDUCTOR: ");
		result.append(cedulA_CONDUCTOR);
		result.append(", CONDUCTOR: ");
		result.append(conductor);
		result.append(", TOTAL: ");
		result.append(total);
		result.append(", TOTAL_RECAUDO_BRUTO: ");
		result.append(totaL_RECAUDO_BRUTO);
		result.append(", TOTAL_RECAUDO_NETO: ");
		result.append(totaL_RECAUDO_NETO);
		result.append(", TOTAL_DEPOSITO: ");
		result.append(totaL_DEPOSITO);
		result.append(", TOTAL_GASTOS: ");
		result.append(totaL_GASTOS);
		result.append(", LIQUIDADO: ");
		result.append(liquidado);
		result.append(", USUARIO: ");
		result.append(usuario);
		result.append(", NOMBRE_PERSONA: ");
		result.append(nombrE_PERSONA);
		result.append(", APELLIDO: ");
		result.append(apellido);
		result.append(", CEDULA: ");
		result.append(cedula);
		result.append(", HORA_MODIFICACION: ");
		result.append(horA_MODIFICACION);
		result.append(')');
		return result.toString();
	}

} //PlanillaImpl
