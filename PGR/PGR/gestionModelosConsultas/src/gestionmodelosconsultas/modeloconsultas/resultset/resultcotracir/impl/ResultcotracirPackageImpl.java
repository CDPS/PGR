/**
 */
package gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.impl;

import gestionmodelosconsultas.GestionmodelosconsultasPackage;

import gestionmodelosconsultas.datatypes.DatatypesPackage;

import gestionmodelosconsultas.datatypes.impl.DatatypesPackageImpl;

import gestionmodelosconsultas.entitymodel.EntitymodelPackage;

import gestionmodelosconsultas.entitymodel.impl.EntitymodelPackageImpl;

import gestionmodelosconsultas.impl.GestionmodelosconsultasPackageImpl;

import gestionmodelosconsultas.modeloconsultas.ModeloconsultasPackage;

import gestionmodelosconsultas.modeloconsultas.cotracir.CotracirPackage;

import gestionmodelosconsultas.modeloconsultas.cotracir.impl.CotracirPackageImpl;

import gestionmodelosconsultas.modeloconsultas.impl.ModeloconsultasPackageImpl;

import gestionmodelosconsultas.modeloconsultas.model.ModelPackage;

import gestionmodelosconsultas.modeloconsultas.model.impl.ModelPackageImpl;

import gestionmodelosconsultas.modeloconsultas.resultset.ResultsetPackage;

import gestionmodelosconsultas.modeloconsultas.resultset.impl.ResultsetPackageImpl;

import gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Consolidado;
import gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Detallado;
import gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.NewClass;
import gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Planilla;
import gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Propietario;
import gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.ResultcotracirFactory;
import gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.ResultcotracirPackage;
import gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Trama;
import gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Transaccion;

import gestionmodelosconsultas.rules.factoryrules.FactoryrulesPackage;

import gestionmodelosconsultas.rules.factoryrules.impl.FactoryrulesPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ResultcotracirPackageImpl extends EPackageImpl implements ResultcotracirPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transaccionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tramaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass consolidadoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propietarioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass planillaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass newClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass detalladoEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.ResultcotracirPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ResultcotracirPackageImpl() {
		super(eNS_URI, ResultcotracirFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ResultcotracirPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ResultcotracirPackage init() {
		if (isInited) return (ResultcotracirPackage)EPackage.Registry.INSTANCE.getEPackage(ResultcotracirPackage.eNS_URI);

		// Obtain or create and register package
		ResultcotracirPackageImpl theResultcotracirPackage = (ResultcotracirPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ResultcotracirPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ResultcotracirPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		GestionmodelosconsultasPackageImpl theGestionmodelosconsultasPackage = (GestionmodelosconsultasPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GestionmodelosconsultasPackage.eNS_URI) instanceof GestionmodelosconsultasPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GestionmodelosconsultasPackage.eNS_URI) : GestionmodelosconsultasPackage.eINSTANCE);
		FactoryrulesPackageImpl theFactoryrulesPackage = (FactoryrulesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FactoryrulesPackage.eNS_URI) instanceof FactoryrulesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FactoryrulesPackage.eNS_URI) : FactoryrulesPackage.eINSTANCE);
		EntitymodelPackageImpl theEntitymodelPackage = (EntitymodelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EntitymodelPackage.eNS_URI) instanceof EntitymodelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EntitymodelPackage.eNS_URI) : EntitymodelPackage.eINSTANCE);
		ModeloconsultasPackageImpl theModeloconsultasPackage = (ModeloconsultasPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ModeloconsultasPackage.eNS_URI) instanceof ModeloconsultasPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ModeloconsultasPackage.eNS_URI) : ModeloconsultasPackage.eINSTANCE);
		ModelPackageImpl theModelPackage = (ModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI) instanceof ModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI) : ModelPackage.eINSTANCE);
		ResultsetPackageImpl theResultsetPackage = (ResultsetPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ResultsetPackage.eNS_URI) instanceof ResultsetPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ResultsetPackage.eNS_URI) : ResultsetPackage.eINSTANCE);
		CotracirPackageImpl theCotracirPackage = (CotracirPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CotracirPackage.eNS_URI) instanceof CotracirPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CotracirPackage.eNS_URI) : CotracirPackage.eINSTANCE);
		DatatypesPackageImpl theDatatypesPackage = (DatatypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DatatypesPackage.eNS_URI) instanceof DatatypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DatatypesPackage.eNS_URI) : DatatypesPackage.eINSTANCE);

		// Create package meta-data objects
		theResultcotracirPackage.createPackageContents();
		theGestionmodelosconsultasPackage.createPackageContents();
		theFactoryrulesPackage.createPackageContents();
		theEntitymodelPackage.createPackageContents();
		theModeloconsultasPackage.createPackageContents();
		theModelPackage.createPackageContents();
		theResultsetPackage.createPackageContents();
		theCotracirPackage.createPackageContents();
		theDatatypesPackage.createPackageContents();

		// Initialize created meta-data
		theResultcotracirPackage.initializePackageContents();
		theGestionmodelosconsultasPackage.initializePackageContents();
		theFactoryrulesPackage.initializePackageContents();
		theEntitymodelPackage.initializePackageContents();
		theModeloconsultasPackage.initializePackageContents();
		theModelPackage.initializePackageContents();
		theResultsetPackage.initializePackageContents();
		theCotracirPackage.initializePackageContents();
		theDatatypesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theResultcotracirPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ResultcotracirPackage.eNS_URI, theResultcotracirPackage);
		return theResultcotracirPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransaccion() {
		return transaccionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransaccion_ESTADO_TRANSACCION() {
		return (EAttribute)transaccionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransaccion_HORA() {
		return (EAttribute)transaccionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransaccion_TIPO() {
		return (EAttribute)transaccionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransaccion_DESCRIPCION() {
		return (EAttribute)transaccionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransaccion_CATEGORIA() {
		return (EAttribute)transaccionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransaccion_ID() {
		return (EAttribute)transaccionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransaccion_VALOR() {
		return (EAttribute)transaccionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrama() {
		return tramaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrama_ID() {
		return (EAttribute)tramaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrama_CADENA_TRAMA() {
		return (EAttribute)tramaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConsolidado() {
		return consolidadoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConsolidado_ID() {
		return (EAttribute)consolidadoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConsolidado_RUTA_DESPACHO() {
		return (EAttribute)consolidadoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConsolidado_HORA_DESPACHO() {
		return (EAttribute)consolidadoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConsolidado_REGISTRO_CONSOLIDADO() {
		return (EAttribute)consolidadoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConsolidado_TOTAL_RECAUDO_BRUTO() {
		return (EAttribute)consolidadoEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConsolidado_TOTAL_RECAUDO_DESPACHO() {
		return (EAttribute)consolidadoEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConsolidado_ESTADO_CONSOLIDADO() {
		return (EAttribute)consolidadoEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConsolidado_ESTADO_IMPRESION() {
		return (EAttribute)consolidadoEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropietario() {
		return propietarioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropietario_ID() {
		return (EAttribute)propietarioEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropietario_NOMBRE() {
		return (EAttribute)propietarioEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropietario_CEDULA() {
		return (EAttribute)propietarioEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlanilla() {
		return planillaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlanilla_ID() {
		return (EAttribute)planillaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlanilla_NUMERO_MOVIL() {
		return (EAttribute)planillaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlanilla_FECHA() {
		return (EAttribute)planillaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlanilla_CEDULA_CONDUCTOR() {
		return (EAttribute)planillaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlanilla_CONDUCTOR() {
		return (EAttribute)planillaEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlanilla_TOTAL() {
		return (EAttribute)planillaEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlanilla_TOTAL_RECAUDO_BRUTO() {
		return (EAttribute)planillaEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlanilla_TOTAL_RECAUDO_NETO() {
		return (EAttribute)planillaEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlanilla_TOTAL_DEPOSITO() {
		return (EAttribute)planillaEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlanilla_TOTAL_GASTOS() {
		return (EAttribute)planillaEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlanilla_LIQUIDADO() {
		return (EAttribute)planillaEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlanilla_USUARIO() {
		return (EAttribute)planillaEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlanilla_NOMBRE_PERSONA() {
		return (EAttribute)planillaEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlanilla_APELLIDO() {
		return (EAttribute)planillaEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlanilla_CEDULA() {
		return (EAttribute)planillaEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlanilla_HORA_MODIFICACION() {
		return (EAttribute)planillaEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNewClass() {
		return newClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDetallado() {
		return detalladoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDetallado_ID() {
		return (EAttribute)detalladoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDetallado_NOMBRE() {
		return (EAttribute)detalladoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDetallado_REGISTRO() {
		return (EAttribute)detalladoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDetallado_TOTAL_RECAUDO_TARIFA() {
		return (EAttribute)detalladoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDetallado_REGISTRO_RECAUDO() {
		return (EAttribute)detalladoEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDetallado_COSTO_TARIFA() {
		return (EAttribute)detalladoEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultcotracirFactory getResultcotracirFactory() {
		return (ResultcotracirFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		transaccionEClass = createEClass(TRANSACCION);
		createEAttribute(transaccionEClass, TRANSACCION__ESTADO_TRANSACCION);
		createEAttribute(transaccionEClass, TRANSACCION__HORA);
		createEAttribute(transaccionEClass, TRANSACCION__TIPO);
		createEAttribute(transaccionEClass, TRANSACCION__DESCRIPCION);
		createEAttribute(transaccionEClass, TRANSACCION__CATEGORIA);
		createEAttribute(transaccionEClass, TRANSACCION__ID);
		createEAttribute(transaccionEClass, TRANSACCION__VALOR);

		tramaEClass = createEClass(TRAMA);
		createEAttribute(tramaEClass, TRAMA__ID);
		createEAttribute(tramaEClass, TRAMA__CADENA_TRAMA);

		consolidadoEClass = createEClass(CONSOLIDADO);
		createEAttribute(consolidadoEClass, CONSOLIDADO__ID);
		createEAttribute(consolidadoEClass, CONSOLIDADO__RUTA_DESPACHO);
		createEAttribute(consolidadoEClass, CONSOLIDADO__HORA_DESPACHO);
		createEAttribute(consolidadoEClass, CONSOLIDADO__REGISTRO_CONSOLIDADO);
		createEAttribute(consolidadoEClass, CONSOLIDADO__TOTAL_RECAUDO_BRUTO);
		createEAttribute(consolidadoEClass, CONSOLIDADO__TOTAL_RECAUDO_DESPACHO);
		createEAttribute(consolidadoEClass, CONSOLIDADO__ESTADO_CONSOLIDADO);
		createEAttribute(consolidadoEClass, CONSOLIDADO__ESTADO_IMPRESION);

		propietarioEClass = createEClass(PROPIETARIO);
		createEAttribute(propietarioEClass, PROPIETARIO__ID);
		createEAttribute(propietarioEClass, PROPIETARIO__NOMBRE);
		createEAttribute(propietarioEClass, PROPIETARIO__CEDULA);

		planillaEClass = createEClass(PLANILLA);
		createEAttribute(planillaEClass, PLANILLA__ID);
		createEAttribute(planillaEClass, PLANILLA__NUMERO_MOVIL);
		createEAttribute(planillaEClass, PLANILLA__FECHA);
		createEAttribute(planillaEClass, PLANILLA__CEDULA_CONDUCTOR);
		createEAttribute(planillaEClass, PLANILLA__CONDUCTOR);
		createEAttribute(planillaEClass, PLANILLA__TOTAL);
		createEAttribute(planillaEClass, PLANILLA__TOTAL_RECAUDO_BRUTO);
		createEAttribute(planillaEClass, PLANILLA__TOTAL_RECAUDO_NETO);
		createEAttribute(planillaEClass, PLANILLA__TOTAL_DEPOSITO);
		createEAttribute(planillaEClass, PLANILLA__TOTAL_GASTOS);
		createEAttribute(planillaEClass, PLANILLA__LIQUIDADO);
		createEAttribute(planillaEClass, PLANILLA__USUARIO);
		createEAttribute(planillaEClass, PLANILLA__NOMBRE_PERSONA);
		createEAttribute(planillaEClass, PLANILLA__APELLIDO);
		createEAttribute(planillaEClass, PLANILLA__CEDULA);
		createEAttribute(planillaEClass, PLANILLA__HORA_MODIFICACION);

		newClassEClass = createEClass(NEW_CLASS);

		detalladoEClass = createEClass(DETALLADO);
		createEAttribute(detalladoEClass, DETALLADO__ID);
		createEAttribute(detalladoEClass, DETALLADO__NOMBRE);
		createEAttribute(detalladoEClass, DETALLADO__REGISTRO);
		createEAttribute(detalladoEClass, DETALLADO__TOTAL_RECAUDO_TARIFA);
		createEAttribute(detalladoEClass, DETALLADO__REGISTRO_RECAUDO);
		createEAttribute(detalladoEClass, DETALLADO__COSTO_TARIFA);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ResultsetPackage theResultsetPackage = (ResultsetPackage)EPackage.Registry.INSTANCE.getEPackage(ResultsetPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		transaccionEClass.getESuperTypes().add(theResultsetPackage.getElementoModeloResultado());
		tramaEClass.getESuperTypes().add(theResultsetPackage.getElementoModeloResultado());
		consolidadoEClass.getESuperTypes().add(theResultsetPackage.getElementoModeloResultado());
		propietarioEClass.getESuperTypes().add(theResultsetPackage.getElementoModeloResultado());
		planillaEClass.getESuperTypes().add(theResultsetPackage.getElementoModeloResultado());
		detalladoEClass.getESuperTypes().add(theResultsetPackage.getElementoModeloResultado());

		// Initialize classes, features, and operations; add parameters
		initEClass(transaccionEClass, Transaccion.class, "Transaccion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransaccion_ESTADO_TRANSACCION(), ecorePackage.getEString(), "ESTADO_TRANSACCION", "false", 0, 1, Transaccion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransaccion_HORA(), ecorePackage.getEIntegerObject(), "HORA", null, 0, 1, Transaccion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransaccion_TIPO(), ecorePackage.getEString(), "TIPO", null, 0, 1, Transaccion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransaccion_DESCRIPCION(), ecorePackage.getEString(), "DESCRIPCION", null, 0, 1, Transaccion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransaccion_CATEGORIA(), ecorePackage.getEString(), "CATEGORIA", null, 0, 1, Transaccion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransaccion_ID(), ecorePackage.getEIntegerObject(), "ID", null, 0, 1, Transaccion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransaccion_VALOR(), ecorePackage.getEIntegerObject(), "VALOR", null, 0, 1, Transaccion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tramaEClass, Trama.class, "Trama", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTrama_ID(), ecorePackage.getEIntegerObject(), "ID", null, 0, 1, Trama.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrama_CADENA_TRAMA(), ecorePackage.getEString(), "CADENA_TRAMA", null, 0, 1, Trama.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(consolidadoEClass, Consolidado.class, "Consolidado", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConsolidado_ID(), ecorePackage.getEIntegerObject(), "ID", null, 0, 1, Consolidado.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConsolidado_RUTA_DESPACHO(), ecorePackage.getEString(), "RUTA_DESPACHO", null, 0, 1, Consolidado.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConsolidado_HORA_DESPACHO(), ecorePackage.getEIntegerObject(), "HORA_DESPACHO", null, 0, 1, Consolidado.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConsolidado_REGISTRO_CONSOLIDADO(), ecorePackage.getEString(), "REGISTRO_CONSOLIDADO", null, 0, 1, Consolidado.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConsolidado_TOTAL_RECAUDO_BRUTO(), ecorePackage.getEIntegerObject(), "TOTAL_RECAUDO_BRUTO", null, 0, 1, Consolidado.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConsolidado_TOTAL_RECAUDO_DESPACHO(), ecorePackage.getEIntegerObject(), "TOTAL_RECAUDO_DESPACHO", null, 0, 1, Consolidado.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConsolidado_ESTADO_CONSOLIDADO(), ecorePackage.getEString(), "ESTADO_CONSOLIDADO", null, 0, 1, Consolidado.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConsolidado_ESTADO_IMPRESION(), ecorePackage.getEString(), "ESTADO_IMPRESION", null, 0, 1, Consolidado.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propietarioEClass, Propietario.class, "Propietario", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPropietario_ID(), ecorePackage.getEIntegerObject(), "ID", null, 0, 1, Propietario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropietario_NOMBRE(), ecorePackage.getEString(), "NOMBRE", null, 0, 1, Propietario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropietario_CEDULA(), ecorePackage.getEString(), "CEDULA", null, 0, 1, Propietario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(planillaEClass, Planilla.class, "Planilla", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlanilla_ID(), ecorePackage.getEIntegerObject(), "ID", null, 0, 1, Planilla.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlanilla_NUMERO_MOVIL(), ecorePackage.getEString(), "NUMERO_MOVIL", null, 0, 1, Planilla.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlanilla_FECHA(), ecorePackage.getEString(), "FECHA", null, 0, 1, Planilla.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlanilla_CEDULA_CONDUCTOR(), ecorePackage.getEString(), "CEDULA_CONDUCTOR", null, 0, 1, Planilla.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlanilla_CONDUCTOR(), ecorePackage.getEString(), "CONDUCTOR", null, 0, 1, Planilla.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlanilla_TOTAL(), ecorePackage.getEIntegerObject(), "TOTAL", null, 0, 1, Planilla.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlanilla_TOTAL_RECAUDO_BRUTO(), ecorePackage.getEIntegerObject(), "TOTAL_RECAUDO_BRUTO", null, 0, 1, Planilla.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlanilla_TOTAL_RECAUDO_NETO(), ecorePackage.getEIntegerObject(), "TOTAL_RECAUDO_NETO", null, 0, 1, Planilla.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlanilla_TOTAL_DEPOSITO(), ecorePackage.getEIntegerObject(), "TOTAL_DEPOSITO", null, 0, 1, Planilla.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlanilla_TOTAL_GASTOS(), ecorePackage.getEIntegerObject(), "TOTAL_GASTOS", null, 0, 1, Planilla.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlanilla_LIQUIDADO(), ecorePackage.getEBooleanObject(), "LIQUIDADO", null, 0, 1, Planilla.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlanilla_USUARIO(), ecorePackage.getEIntegerObject(), "USUARIO", null, 0, 1, Planilla.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlanilla_NOMBRE_PERSONA(), ecorePackage.getEString(), "NOMBRE_PERSONA", null, 0, 1, Planilla.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlanilla_APELLIDO(), ecorePackage.getEString(), "APELLIDO", null, 0, 1, Planilla.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlanilla_CEDULA(), ecorePackage.getEString(), "CEDULA", null, 0, 1, Planilla.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlanilla_HORA_MODIFICACION(), ecorePackage.getEString(), "HORA_MODIFICACION", null, 0, 1, Planilla.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(newClassEClass, NewClass.class, "NewClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(detalladoEClass, Detallado.class, "Detallado", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDetallado_ID(), ecorePackage.getEIntegerObject(), "ID", null, 0, 1, Detallado.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDetallado_NOMBRE(), ecorePackage.getEString(), "NOMBRE", null, 0, 1, Detallado.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDetallado_REGISTRO(), ecorePackage.getEIntegerObject(), "REGISTRO", null, 0, 1, Detallado.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDetallado_TOTAL_RECAUDO_TARIFA(), ecorePackage.getEIntegerObject(), "TOTAL_RECAUDO_TARIFA", null, 0, 1, Detallado.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDetallado_REGISTRO_RECAUDO(), ecorePackage.getEIntegerObject(), "REGISTRO_RECAUDO", null, 0, 1, Detallado.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDetallado_COSTO_TARIFA(), ecorePackage.getEIntegerObject(), "COSTO_TARIFA", null, 0, 1, Detallado.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //ResultcotracirPackageImpl
