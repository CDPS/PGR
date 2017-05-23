/**
 */
package gestionmodelosconsultas.modeloconsultas.resultset.impl;

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

import gestionmodelosconsultas.modeloconsultas.resultset.ElementoModeloResultado;
import gestionmodelosconsultas.modeloconsultas.resultset.ResultElement;
import gestionmodelosconsultas.modeloconsultas.resultset.Resultado;
import gestionmodelosconsultas.modeloconsultas.resultset.ResultsetFactory;
import gestionmodelosconsultas.modeloconsultas.resultset.ResultsetPackage;

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
public class ResultsetPackageImpl extends EPackageImpl implements ResultsetPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resultadoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementoModeloResultadoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resultElementEClass = null;

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
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.ResultsetPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ResultsetPackageImpl() {
		super(eNS_URI, ResultsetFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ResultsetPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ResultsetPackage init() {
		if (isInited) return (ResultsetPackage)EPackage.Registry.INSTANCE.getEPackage(ResultsetPackage.eNS_URI);

		// Obtain or create and register package
		ResultsetPackageImpl theResultsetPackage = (ResultsetPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ResultsetPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ResultsetPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		GestionmodelosconsultasPackageImpl theGestionmodelosconsultasPackage = (GestionmodelosconsultasPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GestionmodelosconsultasPackage.eNS_URI) instanceof GestionmodelosconsultasPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GestionmodelosconsultasPackage.eNS_URI) : GestionmodelosconsultasPackage.eINSTANCE);
		FactoryrulesPackageImpl theFactoryrulesPackage = (FactoryrulesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FactoryrulesPackage.eNS_URI) instanceof FactoryrulesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FactoryrulesPackage.eNS_URI) : FactoryrulesPackage.eINSTANCE);
		EntitymodelPackageImpl theEntitymodelPackage = (EntitymodelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EntitymodelPackage.eNS_URI) instanceof EntitymodelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EntitymodelPackage.eNS_URI) : EntitymodelPackage.eINSTANCE);
		ModeloconsultasPackageImpl theModeloconsultasPackage = (ModeloconsultasPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ModeloconsultasPackage.eNS_URI) instanceof ModeloconsultasPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ModeloconsultasPackage.eNS_URI) : ModeloconsultasPackage.eINSTANCE);
		ModelPackageImpl theModelPackage = (ModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI) instanceof ModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI) : ModelPackage.eINSTANCE);
		ResultcotracirPackageImpl theResultcotracirPackage = (ResultcotracirPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ResultcotracirPackage.eNS_URI) instanceof ResultcotracirPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ResultcotracirPackage.eNS_URI) : ResultcotracirPackage.eINSTANCE);
		CotracirPackageImpl theCotracirPackage = (CotracirPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CotracirPackage.eNS_URI) instanceof CotracirPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CotracirPackage.eNS_URI) : CotracirPackage.eINSTANCE);
		DatatypesPackageImpl theDatatypesPackage = (DatatypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DatatypesPackage.eNS_URI) instanceof DatatypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DatatypesPackage.eNS_URI) : DatatypesPackage.eINSTANCE);

		// Create package meta-data objects
		theResultsetPackage.createPackageContents();
		theGestionmodelosconsultasPackage.createPackageContents();
		theFactoryrulesPackage.createPackageContents();
		theEntitymodelPackage.createPackageContents();
		theModeloconsultasPackage.createPackageContents();
		theModelPackage.createPackageContents();
		theResultcotracirPackage.createPackageContents();
		theCotracirPackage.createPackageContents();
		theDatatypesPackage.createPackageContents();

		// Initialize created meta-data
		theResultsetPackage.initializePackageContents();
		theGestionmodelosconsultasPackage.initializePackageContents();
		theFactoryrulesPackage.initializePackageContents();
		theEntitymodelPackage.initializePackageContents();
		theModeloconsultasPackage.initializePackageContents();
		theModelPackage.initializePackageContents();
		theResultcotracirPackage.initializePackageContents();
		theCotracirPackage.initializePackageContents();
		theDatatypesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theResultsetPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ResultsetPackage.eNS_URI, theResultsetPackage);
		return theResultsetPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResultado() {
		return resultadoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultado_Nombre() {
		return (EAttribute)resultadoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResultado_ModeloConsulta() {
		return (EReference)resultadoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResultado_ListResultElement() {
		return (EReference)resultadoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElementoModeloResultado() {
		return elementoModeloResultadoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementoModeloResultado_Key() {
		return (EAttribute)elementoModeloResultadoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementoModeloResultado_ListElementoModeloResultado() {
		return (EReference)elementoModeloResultadoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementoModeloResultado_ElementoModeloResultado() {
		return (EReference)elementoModeloResultadoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResultElement() {
		return resultElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResultElement_Resultado() {
		return (EReference)resultElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultsetFactory getResultsetFactory() {
		return (ResultsetFactory)getEFactoryInstance();
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
		resultadoEClass = createEClass(RESULTADO);
		createEAttribute(resultadoEClass, RESULTADO__NOMBRE);
		createEReference(resultadoEClass, RESULTADO__MODELO_CONSULTA);
		createEReference(resultadoEClass, RESULTADO__LIST_RESULT_ELEMENT);

		elementoModeloResultadoEClass = createEClass(ELEMENTO_MODELO_RESULTADO);
		createEAttribute(elementoModeloResultadoEClass, ELEMENTO_MODELO_RESULTADO__KEY);
		createEReference(elementoModeloResultadoEClass, ELEMENTO_MODELO_RESULTADO__LIST_ELEMENTO_MODELO_RESULTADO);
		createEReference(elementoModeloResultadoEClass, ELEMENTO_MODELO_RESULTADO__ELEMENTO_MODELO_RESULTADO);

		resultElementEClass = createEClass(RESULT_ELEMENT);
		createEReference(resultElementEClass, RESULT_ELEMENT__RESULTADO);
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
		ResultcotracirPackage theResultcotracirPackage = (ResultcotracirPackage)EPackage.Registry.INSTANCE.getEPackage(ResultcotracirPackage.eNS_URI);
		ModeloconsultasPackage theModeloconsultasPackage = (ModeloconsultasPackage)EPackage.Registry.INSTANCE.getEPackage(ModeloconsultasPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theResultcotracirPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		elementoModeloResultadoEClass.getESuperTypes().add(this.getResultElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(resultadoEClass, Resultado.class, "Resultado", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResultado_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, Resultado.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResultado_ModeloConsulta(), theModeloconsultasPackage.getModeloConsulta(), theModeloconsultasPackage.getModeloConsulta_ListResultado(), "ModeloConsulta", null, 0, 1, Resultado.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResultado_ListResultElement(), this.getResultElement(), this.getResultElement_Resultado(), "listResultElement", null, 0, -1, Resultado.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elementoModeloResultadoEClass, ElementoModeloResultado.class, "ElementoModeloResultado", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getElementoModeloResultado_Key(), ecorePackage.getEString(), "key", null, 0, 1, ElementoModeloResultado.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElementoModeloResultado_ListElementoModeloResultado(), this.getElementoModeloResultado(), this.getElementoModeloResultado_ElementoModeloResultado(), "listElementoModeloResultado", null, 0, -1, ElementoModeloResultado.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElementoModeloResultado_ElementoModeloResultado(), this.getElementoModeloResultado(), this.getElementoModeloResultado_ListElementoModeloResultado(), "ElementoModeloResultado", null, 0, 1, ElementoModeloResultado.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resultElementEClass, ResultElement.class, "ResultElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResultElement_Resultado(), this.getResultado(), this.getResultado_ListResultElement(), "Resultado", null, 0, 1, ResultElement.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //ResultsetPackageImpl
