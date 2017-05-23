/**
 */
package gestionmodelosconsultas.modeloconsultas.impl;

import gestionmodelosconsultas.GestionmodelosconsultasPackage;

import gestionmodelosconsultas.datatypes.DatatypesPackage;

import gestionmodelosconsultas.datatypes.impl.DatatypesPackageImpl;

import gestionmodelosconsultas.entitymodel.EntitymodelPackage;

import gestionmodelosconsultas.entitymodel.impl.EntitymodelPackageImpl;

import gestionmodelosconsultas.impl.GestionmodelosconsultasPackageImpl;

import gestionmodelosconsultas.modeloconsultas.FactoryModeloConsulta;
import gestionmodelosconsultas.modeloconsultas.ModeloConsulta;
import gestionmodelosconsultas.modeloconsultas.ModeloconsultasFactory;
import gestionmodelosconsultas.modeloconsultas.ModeloconsultasPackage;

import gestionmodelosconsultas.modeloconsultas.cotracir.CotracirPackage;

import gestionmodelosconsultas.modeloconsultas.cotracir.impl.CotracirPackageImpl;

import gestionmodelosconsultas.modeloconsultas.model.ModelPackage;

import gestionmodelosconsultas.modeloconsultas.model.impl.ModelPackageImpl;

import gestionmodelosconsultas.modeloconsultas.resultset.ResultsetPackage;

import gestionmodelosconsultas.modeloconsultas.resultset.impl.ResultsetPackageImpl;

import gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.ResultcotracirPackage;

import gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.impl.ResultcotracirPackageImpl;

import gestionmodelosconsultas.rules.factoryrules.FactoryrulesPackage;

import gestionmodelosconsultas.rules.factoryrules.impl.FactoryrulesPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModeloconsultasPackageImpl extends EPackageImpl implements ModeloconsultasPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modeloConsultaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass factoryModeloConsultaEClass = null;

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
	 * @see gestionmodelosconsultas.modeloconsultas.ModeloconsultasPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ModeloconsultasPackageImpl() {
		super(eNS_URI, ModeloconsultasFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ModeloconsultasPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ModeloconsultasPackage init() {
		if (isInited) return (ModeloconsultasPackage)EPackage.Registry.INSTANCE.getEPackage(ModeloconsultasPackage.eNS_URI);

		// Obtain or create and register package
		ModeloconsultasPackageImpl theModeloconsultasPackage = (ModeloconsultasPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ModeloconsultasPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ModeloconsultasPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		GestionmodelosconsultasPackageImpl theGestionmodelosconsultasPackage = (GestionmodelosconsultasPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GestionmodelosconsultasPackage.eNS_URI) instanceof GestionmodelosconsultasPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GestionmodelosconsultasPackage.eNS_URI) : GestionmodelosconsultasPackage.eINSTANCE);
		FactoryrulesPackageImpl theFactoryrulesPackage = (FactoryrulesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FactoryrulesPackage.eNS_URI) instanceof FactoryrulesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FactoryrulesPackage.eNS_URI) : FactoryrulesPackage.eINSTANCE);
		EntitymodelPackageImpl theEntitymodelPackage = (EntitymodelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EntitymodelPackage.eNS_URI) instanceof EntitymodelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EntitymodelPackage.eNS_URI) : EntitymodelPackage.eINSTANCE);
		ModelPackageImpl theModelPackage = (ModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI) instanceof ModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI) : ModelPackage.eINSTANCE);
		ResultsetPackageImpl theResultsetPackage = (ResultsetPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ResultsetPackage.eNS_URI) instanceof ResultsetPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ResultsetPackage.eNS_URI) : ResultsetPackage.eINSTANCE);
		ResultcotracirPackageImpl theResultcotracirPackage = (ResultcotracirPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ResultcotracirPackage.eNS_URI) instanceof ResultcotracirPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ResultcotracirPackage.eNS_URI) : ResultcotracirPackage.eINSTANCE);
		CotracirPackageImpl theCotracirPackage = (CotracirPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CotracirPackage.eNS_URI) instanceof CotracirPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CotracirPackage.eNS_URI) : CotracirPackage.eINSTANCE);
		DatatypesPackageImpl theDatatypesPackage = (DatatypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DatatypesPackage.eNS_URI) instanceof DatatypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DatatypesPackage.eNS_URI) : DatatypesPackage.eINSTANCE);

		// Create package meta-data objects
		theModeloconsultasPackage.createPackageContents();
		theGestionmodelosconsultasPackage.createPackageContents();
		theFactoryrulesPackage.createPackageContents();
		theEntitymodelPackage.createPackageContents();
		theModelPackage.createPackageContents();
		theResultsetPackage.createPackageContents();
		theResultcotracirPackage.createPackageContents();
		theCotracirPackage.createPackageContents();
		theDatatypesPackage.createPackageContents();

		// Initialize created meta-data
		theModeloconsultasPackage.initializePackageContents();
		theGestionmodelosconsultasPackage.initializePackageContents();
		theFactoryrulesPackage.initializePackageContents();
		theEntitymodelPackage.initializePackageContents();
		theModelPackage.initializePackageContents();
		theResultsetPackage.initializePackageContents();
		theResultcotracirPackage.initializePackageContents();
		theCotracirPackage.initializePackageContents();
		theDatatypesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theModeloconsultasPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ModeloconsultasPackage.eNS_URI, theModeloconsultasPackage);
		return theModeloconsultasPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModeloConsulta() {
		return modeloConsultaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModeloConsulta_RealizacionDiagramEntity() {
		return (EReference)modeloConsultaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModeloConsulta_Nombre() {
		return (EAttribute)modeloConsultaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModeloConsulta_FactoryModeloConsulta() {
		return (EReference)modeloConsultaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModeloConsulta_ListEADiagram() {
		return (EReference)modeloConsultaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModeloConsulta_ListResultado() {
		return (EReference)modeloConsultaEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFactoryModeloConsulta() {
		return factoryModeloConsultaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFactoryModeloConsulta_ModelFactory() {
		return (EReference)factoryModeloConsultaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFactoryModeloConsulta_ListModeloConsulta() {
		return (EReference)factoryModeloConsultaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeloconsultasFactory getModeloconsultasFactory() {
		return (ModeloconsultasFactory)getEFactoryInstance();
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
		modeloConsultaEClass = createEClass(MODELO_CONSULTA);
		createEReference(modeloConsultaEClass, MODELO_CONSULTA__REALIZACION_DIAGRAM_ENTITY);
		createEAttribute(modeloConsultaEClass, MODELO_CONSULTA__NOMBRE);
		createEReference(modeloConsultaEClass, MODELO_CONSULTA__FACTORY_MODELO_CONSULTA);
		createEReference(modeloConsultaEClass, MODELO_CONSULTA__LIST_EA_DIAGRAM);
		createEReference(modeloConsultaEClass, MODELO_CONSULTA__LIST_RESULTADO);

		factoryModeloConsultaEClass = createEClass(FACTORY_MODELO_CONSULTA);
		createEReference(factoryModeloConsultaEClass, FACTORY_MODELO_CONSULTA__MODEL_FACTORY);
		createEReference(factoryModeloConsultaEClass, FACTORY_MODELO_CONSULTA__LIST_MODELO_CONSULTA);
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
		ModelPackage theModelPackage = (ModelPackage)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI);
		ResultsetPackage theResultsetPackage = (ResultsetPackage)EPackage.Registry.INSTANCE.getEPackage(ResultsetPackage.eNS_URI);
		CotracirPackage theCotracirPackage = (CotracirPackage)EPackage.Registry.INSTANCE.getEPackage(CotracirPackage.eNS_URI);
		EntitymodelPackage theEntitymodelPackage = (EntitymodelPackage)EPackage.Registry.INSTANCE.getEPackage(EntitymodelPackage.eNS_URI);
		GestionmodelosconsultasPackage theGestionmodelosconsultasPackage = (GestionmodelosconsultasPackage)EPackage.Registry.INSTANCE.getEPackage(GestionmodelosconsultasPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theModelPackage);
		getESubpackages().add(theResultsetPackage);
		getESubpackages().add(theCotracirPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(modeloConsultaEClass, ModeloConsulta.class, "ModeloConsulta", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModeloConsulta_RealizacionDiagramEntity(), theEntitymodelPackage.getRealizacionDiagramEntity(), theEntitymodelPackage.getRealizacionDiagramEntity_ModeloConsulta(), "realizacionDiagramEntity", null, 1, 1, ModeloConsulta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModeloConsulta_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, ModeloConsulta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModeloConsulta_FactoryModeloConsulta(), this.getFactoryModeloConsulta(), this.getFactoryModeloConsulta_ListModeloConsulta(), "FactoryModeloConsulta", null, 0, 1, ModeloConsulta.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModeloConsulta_ListEADiagram(), theModelPackage.getEADiagram(), theModelPackage.getEADiagram_ModeloConsulta(), "listEADiagram", null, 0, -1, ModeloConsulta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModeloConsulta_ListResultado(), theResultsetPackage.getResultado(), theResultsetPackage.getResultado_ModeloConsulta(), "listResultado", null, 0, -1, ModeloConsulta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(factoryModeloConsultaEClass, FactoryModeloConsulta.class, "FactoryModeloConsulta", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFactoryModeloConsulta_ModelFactory(), theGestionmodelosconsultasPackage.getModelFactory(), theGestionmodelosconsultasPackage.getModelFactory_FactoryModeloConsultas(), "ModelFactory", null, 0, 1, FactoryModeloConsulta.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFactoryModeloConsulta_ListModeloConsulta(), this.getModeloConsulta(), this.getModeloConsulta_FactoryModeloConsulta(), "listModeloConsulta", null, 0, -1, FactoryModeloConsulta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //ModeloconsultasPackageImpl
