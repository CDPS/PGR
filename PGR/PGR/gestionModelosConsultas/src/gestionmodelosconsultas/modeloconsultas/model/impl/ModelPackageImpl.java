/**
 */
package gestionmodelosconsultas.modeloconsultas.model.impl;

import gestionmodelosconsultas.GestionmodelosconsultasPackage;

import gestionmodelosconsultas.datatypes.DatatypesPackage;

import gestionmodelosconsultas.datatypes.impl.DatatypesPackageImpl;

import gestionmodelosconsultas.entitymodel.EntitymodelPackage;

import gestionmodelosconsultas.entitymodel.impl.EntitymodelPackageImpl;

import gestionmodelosconsultas.impl.GestionmodelosconsultasPackageImpl;

import gestionmodelosconsultas.modeloconsultas.ModeloconsultasPackage;
import gestionmodelosconsultas.modeloconsultas.cotracir.Consolidado;
import gestionmodelosconsultas.modeloconsultas.cotracir.CotracirPackage;
import gestionmodelosconsultas.modeloconsultas.cotracir.Detallado;
import gestionmodelosconsultas.modeloconsultas.cotracir.Planilla;
import gestionmodelosconsultas.modeloconsultas.cotracir.Propietario;
import gestionmodelosconsultas.modeloconsultas.cotracir.Trama;
import gestionmodelosconsultas.modeloconsultas.cotracir.Transaccion;
import gestionmodelosconsultas.modeloconsultas.cotracir.impl.CotracirPackageImpl;

import gestionmodelosconsultas.modeloconsultas.impl.ModeloconsultasPackageImpl;

import gestionmodelosconsultas.modeloconsultas.model.Campo;
import gestionmodelosconsultas.modeloconsultas.model.EADiagram;
import gestionmodelosconsultas.modeloconsultas.model.ElementoConsulta;
import gestionmodelosconsultas.modeloconsultas.model.ElementoModelo;
import gestionmodelosconsultas.modeloconsultas.model.ModelFactory;
import gestionmodelosconsultas.modeloconsultas.model.ModelPackage;
import gestionmodelosconsultas.modeloconsultas.model.NombreCampo;
import gestionmodelosconsultas.modeloconsultas.model.Proyeccion;
import gestionmodelosconsultas.modeloconsultas.model.Relacion;
import gestionmodelosconsultas.modeloconsultas.model.ViewModel;

import gestionmodelosconsultas.modeloconsultas.resultset.ResultsetPackage;

import gestionmodelosconsultas.modeloconsultas.resultset.impl.ResultsetPackageImpl;

import gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.ResultcotracirPackage;

import gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.impl.ResultcotracirPackageImpl;

import gestionmodelosconsultas.rules.factoryrules.FactoryrulesPackage;

import gestionmodelosconsultas.rules.factoryrules.impl.FactoryrulesPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelPackageImpl extends EPackageImpl implements ModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relacionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass campoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eaDiagramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementoConsultaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass proyeccionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementoModeloEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum nombreCampoEEnum = null;

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
	 * @see gestionmodelosconsultas.modeloconsultas.model.ModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ModelPackageImpl() {
		super(eNS_URI, ModelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ModelPackage init() {
		if (isInited) return (ModelPackage)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI);

		// Obtain or create and register package
		ModelPackageImpl theModelPackage = (ModelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ModelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ModelPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		GestionmodelosconsultasPackageImpl theGestionmodelosconsultasPackage = (GestionmodelosconsultasPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GestionmodelosconsultasPackage.eNS_URI) instanceof GestionmodelosconsultasPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GestionmodelosconsultasPackage.eNS_URI) : GestionmodelosconsultasPackage.eINSTANCE);
		FactoryrulesPackageImpl theFactoryrulesPackage = (FactoryrulesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FactoryrulesPackage.eNS_URI) instanceof FactoryrulesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FactoryrulesPackage.eNS_URI) : FactoryrulesPackage.eINSTANCE);
		EntitymodelPackageImpl theEntitymodelPackage = (EntitymodelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EntitymodelPackage.eNS_URI) instanceof EntitymodelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EntitymodelPackage.eNS_URI) : EntitymodelPackage.eINSTANCE);
		ModeloconsultasPackageImpl theModeloconsultasPackage = (ModeloconsultasPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ModeloconsultasPackage.eNS_URI) instanceof ModeloconsultasPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ModeloconsultasPackage.eNS_URI) : ModeloconsultasPackage.eINSTANCE);
		ResultsetPackageImpl theResultsetPackage = (ResultsetPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ResultsetPackage.eNS_URI) instanceof ResultsetPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ResultsetPackage.eNS_URI) : ResultsetPackage.eINSTANCE);
		ResultcotracirPackageImpl theResultcotracirPackage = (ResultcotracirPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ResultcotracirPackage.eNS_URI) instanceof ResultcotracirPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ResultcotracirPackage.eNS_URI) : ResultcotracirPackage.eINSTANCE);
		CotracirPackageImpl theCotracirPackage = (CotracirPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CotracirPackage.eNS_URI) instanceof CotracirPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CotracirPackage.eNS_URI) : CotracirPackage.eINSTANCE);
		DatatypesPackageImpl theDatatypesPackage = (DatatypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DatatypesPackage.eNS_URI) instanceof DatatypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DatatypesPackage.eNS_URI) : DatatypesPackage.eINSTANCE);

		// Create package meta-data objects
		theModelPackage.createPackageContents();
		theGestionmodelosconsultasPackage.createPackageContents();
		theFactoryrulesPackage.createPackageContents();
		theEntitymodelPackage.createPackageContents();
		theModeloconsultasPackage.createPackageContents();
		theResultsetPackage.createPackageContents();
		theResultcotracirPackage.createPackageContents();
		theCotracirPackage.createPackageContents();
		theDatatypesPackage.createPackageContents();

		// Initialize created meta-data
		theModelPackage.initializePackageContents();
		theGestionmodelosconsultasPackage.initializePackageContents();
		theFactoryrulesPackage.initializePackageContents();
		theEntitymodelPackage.initializePackageContents();
		theModeloconsultasPackage.initializePackageContents();
		theResultsetPackage.initializePackageContents();
		theResultcotracirPackage.initializePackageContents();
		theCotracirPackage.initializePackageContents();
		theDatatypesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theModelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ModelPackage.eNS_URI, theModelPackage);
		return theModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelacion() {
		return relacionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelacion_Estereotipo() {
		return (EAttribute)relacionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelacion_Order() {
		return (EAttribute)relacionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelacion_EADiagram() {
		return (EReference)relacionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelacion_Target() {
		return (EReference)relacionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelacion_Source() {
		return (EReference)relacionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCampo() {
		return campoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCampo_NombreCampo() {
		return (EAttribute)campoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCampo_Criterio() {
		return (EAttribute)campoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCampo_Seleccion() {
		return (EAttribute)campoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCampo_OwnedElementoConsulta() {
		return (EReference)campoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEADiagram() {
		return eaDiagramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEADiagram_Nombre() {
		return (EAttribute)eaDiagramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEADiagram_ListRelacion() {
		return (EReference)eaDiagramEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEADiagram_ModeloConsulta() {
		return (EReference)eaDiagramEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEADiagram_ListElementoConsulta() {
		return (EReference)eaDiagramEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getViewModel() {
		return viewModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElementoConsulta() {
		return elementoConsultaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementoConsulta_Order() {
		return (EAttribute)elementoConsultaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementoConsulta_EADiagram() {
		return (EReference)elementoConsultaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementoConsulta_ListCampos() {
		return (EReference)elementoConsultaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProyeccion() {
		return proyeccionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElementoModelo() {
		return elementoModeloEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementoModelo_Nombre() {
		return (EAttribute)elementoModeloEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementoModelo_From() {
		return (EReference)elementoModeloEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementoModelo_To() {
		return (EReference)elementoModeloEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNombreCampo() {
		return nombreCampoEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactory getModelFactory() {
		return (ModelFactory)getEFactoryInstance();
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
		relacionEClass = createEClass(RELACION);
		createEAttribute(relacionEClass, RELACION__ESTEREOTIPO);
		createEAttribute(relacionEClass, RELACION__ORDER);
		createEReference(relacionEClass, RELACION__EA_DIAGRAM);
		createEReference(relacionEClass, RELACION__TARGET);
		createEReference(relacionEClass, RELACION__SOURCE);

		campoEClass = createEClass(CAMPO);
		createEAttribute(campoEClass, CAMPO__NOMBRE_CAMPO);
		createEAttribute(campoEClass, CAMPO__CRITERIO);
		createEAttribute(campoEClass, CAMPO__SELECCION);
		createEReference(campoEClass, CAMPO__OWNED_ELEMENTO_CONSULTA);

		eaDiagramEClass = createEClass(EA_DIAGRAM);
		createEAttribute(eaDiagramEClass, EA_DIAGRAM__NOMBRE);
		createEReference(eaDiagramEClass, EA_DIAGRAM__LIST_RELACION);
		createEReference(eaDiagramEClass, EA_DIAGRAM__MODELO_CONSULTA);
		createEReference(eaDiagramEClass, EA_DIAGRAM__LIST_ELEMENTO_CONSULTA);

		viewModelEClass = createEClass(VIEW_MODEL);

		elementoConsultaEClass = createEClass(ELEMENTO_CONSULTA);
		createEAttribute(elementoConsultaEClass, ELEMENTO_CONSULTA__ORDER);
		createEReference(elementoConsultaEClass, ELEMENTO_CONSULTA__EA_DIAGRAM);
		createEReference(elementoConsultaEClass, ELEMENTO_CONSULTA__LIST_CAMPOS);

		proyeccionEClass = createEClass(PROYECCION);

		elementoModeloEClass = createEClass(ELEMENTO_MODELO);
		createEAttribute(elementoModeloEClass, ELEMENTO_MODELO__NOMBRE);
		createEReference(elementoModeloEClass, ELEMENTO_MODELO__FROM);
		createEReference(elementoModeloEClass, ELEMENTO_MODELO__TO);

		// Create enums
		nombreCampoEEnum = createEEnum(NOMBRE_CAMPO);
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
		ModeloconsultasPackage theModeloconsultasPackage = (ModeloconsultasPackage)EPackage.Registry.INSTANCE.getEPackage(ModeloconsultasPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		relacionEClass.getESuperTypes().add(this.getElementoModelo());
		viewModelEClass.getESuperTypes().add(this.getEADiagram());
		elementoConsultaEClass.getESuperTypes().add(this.getElementoModelo());
		proyeccionEClass.getESuperTypes().add(this.getEADiagram());

		// Initialize classes, features, and operations; add parameters
		initEClass(relacionEClass, Relacion.class, "Relacion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelacion_Estereotipo(), ecorePackage.getEString(), "estereotipo", null, 0, 1, Relacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelacion_Order(), ecorePackage.getEIntegerObject(), "order", null, 0, 1, Relacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelacion_EADiagram(), this.getEADiagram(), this.getEADiagram_ListRelacion(), "EADiagram", null, 0, 1, Relacion.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelacion_Target(), this.getElementoConsulta(), null, "target", null, 1, 1, Relacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelacion_Source(), this.getElementoConsulta(), null, "source", null, 1, 1, Relacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(campoEClass, Campo.class, "Campo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCampo_NombreCampo(), this.getNombreCampo(), "nombreCampo", "default", 0, 1, Campo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCampo_Criterio(), ecorePackage.getEString(), "criterio", null, 0, 1, Campo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCampo_Seleccion(), ecorePackage.getEBoolean(), "seleccion", "false", 0, 1, Campo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCampo_OwnedElementoConsulta(), this.getElementoConsulta(), this.getElementoConsulta_ListCampos(), "ownedElementoConsulta", null, 0, 1, Campo.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eaDiagramEClass, EADiagram.class, "EADiagram", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEADiagram_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, EADiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEADiagram_ListRelacion(), this.getRelacion(), this.getRelacion_EADiagram(), "listRelacion", null, 0, -1, EADiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEADiagram_ModeloConsulta(), theModeloconsultasPackage.getModeloConsulta(), theModeloconsultasPackage.getModeloConsulta_ListEADiagram(), "ModeloConsulta", null, 0, 1, EADiagram.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEADiagram_ListElementoConsulta(), this.getElementoConsulta(), this.getElementoConsulta_EADiagram(), "listElementoConsulta", null, 0, -1, EADiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(viewModelEClass, ViewModel.class, "ViewModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(elementoConsultaEClass, ElementoConsulta.class, "ElementoConsulta", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getElementoConsulta_Order(), ecorePackage.getEIntegerObject(), "order", null, 0, 1, ElementoConsulta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElementoConsulta_EADiagram(), this.getEADiagram(), this.getEADiagram_ListElementoConsulta(), "EADiagram", null, 0, 1, ElementoConsulta.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElementoConsulta_ListCampos(), this.getCampo(), this.getCampo_OwnedElementoConsulta(), "listCampos", null, 0, -1, ElementoConsulta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(proyeccionEClass, Proyeccion.class, "Proyeccion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(elementoModeloEClass, ElementoModelo.class, "ElementoModelo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getElementoModelo_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, ElementoModelo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElementoModelo_From(), this.getElementoModelo(), this.getElementoModelo_To(), "from", null, 0, -1, ElementoModelo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElementoModelo_To(), this.getElementoModelo(), this.getElementoModelo_From(), "to", null, 0, -1, ElementoModelo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(nombreCampoEEnum, NombreCampo.class, "NombreCampo");
		addEEnumLiteral(nombreCampoEEnum, NombreCampo.ID);
		addEEnumLiteral(nombreCampoEEnum, NombreCampo.ESTADO_TRANSACCION);
		addEEnumLiteral(nombreCampoEEnum, NombreCampo.HORA);
		addEEnumLiteral(nombreCampoEEnum, NombreCampo.TIPO);
		addEEnumLiteral(nombreCampoEEnum, NombreCampo.DESCRIPCION);
		addEEnumLiteral(nombreCampoEEnum, NombreCampo.CATEGORIA);
		addEEnumLiteral(nombreCampoEEnum, NombreCampo.VALOR);
		addEEnumLiteral(nombreCampoEEnum, NombreCampo.CADENA_TRAMA);
		addEEnumLiteral(nombreCampoEEnum, NombreCampo.NUMERO_MOVIL);
		addEEnumLiteral(nombreCampoEEnum, NombreCampo.FECHA);
		addEEnumLiteral(nombreCampoEEnum, NombreCampo.CEDULA_CONDUCTOR);
		addEEnumLiteral(nombreCampoEEnum, NombreCampo.CONDUCTOR);
		addEEnumLiteral(nombreCampoEEnum, NombreCampo.TOTAL);
		addEEnumLiteral(nombreCampoEEnum, NombreCampo.TOTAL_RECAUDO_BRUTO);
		addEEnumLiteral(nombreCampoEEnum, NombreCampo.TOTAL_RECAUDO_NETO);
		addEEnumLiteral(nombreCampoEEnum, NombreCampo.TOTAL_DEPOSITO);
		addEEnumLiteral(nombreCampoEEnum, NombreCampo.TOTAL_GASTOS);
		addEEnumLiteral(nombreCampoEEnum, NombreCampo.LIQUIDADO);
		addEEnumLiteral(nombreCampoEEnum, NombreCampo.USUARIO);
		addEEnumLiteral(nombreCampoEEnum, NombreCampo.NOMBRE_PERSONA);
		addEEnumLiteral(nombreCampoEEnum, NombreCampo.APELLIDO);
		addEEnumLiteral(nombreCampoEEnum, NombreCampo.CEDULA);
		addEEnumLiteral(nombreCampoEEnum, NombreCampo.HORA_MODIFICACION);
		addEEnumLiteral(nombreCampoEEnum, NombreCampo.NOMBRE);
		addEEnumLiteral(nombreCampoEEnum, NombreCampo.REGISTRO);
		addEEnumLiteral(nombreCampoEEnum, NombreCampo.TOTAL_RECAUDO_TARIFA);
		addEEnumLiteral(nombreCampoEEnum, NombreCampo.REGISTRO_RECAUDO);
		addEEnumLiteral(nombreCampoEEnum, NombreCampo.COSTO_TARIFA);
		addEEnumLiteral(nombreCampoEEnum, NombreCampo.RUTA_DESPACHO);
		addEEnumLiteral(nombreCampoEEnum, NombreCampo.HORA_DESPACHO);
		addEEnumLiteral(nombreCampoEEnum, NombreCampo.REGISTRO_CONSOLIDADO);
		addEEnumLiteral(nombreCampoEEnum, NombreCampo.TOTAL_RECAUDO_RUTO);
		addEEnumLiteral(nombreCampoEEnum, NombreCampo.TOTAL_RECAUDO_DESPACHO);
		addEEnumLiteral(nombreCampoEEnum, NombreCampo.ESTADO_CONSOLIDADO);
		addEEnumLiteral(nombreCampoEEnum, NombreCampo.ESTADO_IMPRESION);
		addEEnumLiteral(nombreCampoEEnum, NombreCampo.DEFAULT);
	}
	
	
	@Override
	public void inizializarEEnum(ElementoConsulta elementoConsulta) {
		
		// TODO Auto-generated method stub
		if(elementoConsulta instanceof Transaccion ){
			
			nombreCampoEEnum.getELiterals().clear();
			initEEnum(nombreCampoEEnum, NombreCampo.class, "NombreCampo");
			addEEnumLiteral(nombreCampoEEnum, NombreCampo.ESTADO_TRANSACCION);
			addEEnumLiteral(nombreCampoEEnum, NombreCampo.HORA);
			addEEnumLiteral(nombreCampoEEnum, NombreCampo.TIPO);
			addEEnumLiteral(nombreCampoEEnum, NombreCampo.DESCRIPCION);
			addEEnumLiteral(nombreCampoEEnum, NombreCampo.CATEGORIA);
			addEEnumLiteral(nombreCampoEEnum, NombreCampo.ID);
			addEEnumLiteral(nombreCampoEEnum, NombreCampo.VALOR);
		}
		
		if(elementoConsulta instanceof Trama ){
			nombreCampoEEnum.getELiterals().clear();
			initEEnum(nombreCampoEEnum, NombreCampo.class, "NombreCampo");
			addEEnumLiteral(nombreCampoEEnum, NombreCampo.ID);
			addEEnumLiteral(nombreCampoEEnum, NombreCampo.CADENA_TRAMA);
		}
		
		if(elementoConsulta instanceof Planilla ){
			nombreCampoEEnum.getELiterals().clear();
			initEEnum(nombreCampoEEnum, NombreCampo.class, "NombreCampo");
			addEEnumLiteral(nombreCampoEEnum, NombreCampo.ID);
			addEEnumLiteral(nombreCampoEEnum, NombreCampo.NUMERO_MOVIL);
			addEEnumLiteral(nombreCampoEEnum, NombreCampo.CEDULA_CONDUCTOR);
			addEEnumLiteral(nombreCampoEEnum, NombreCampo.CONDUCTOR);
			addEEnumLiteral(nombreCampoEEnum, NombreCampo.TOTAL);
			addEEnumLiteral(nombreCampoEEnum, NombreCampo.TOTAL_RECAUDO_BRUTO);
			addEEnumLiteral(nombreCampoEEnum, NombreCampo.TOTAL_RECAUDO_NETO);
			addEEnumLiteral(nombreCampoEEnum, NombreCampo.TOTAL_DEPOSITO);
			addEEnumLiteral(nombreCampoEEnum, NombreCampo.TOTAL_GASTOS);
			addEEnumLiteral(nombreCampoEEnum, NombreCampo.LIQUIDADO);
			addEEnumLiteral(nombreCampoEEnum, NombreCampo.USUARIO);
			addEEnumLiteral(nombreCampoEEnum, NombreCampo.NOMBRE_PERSONA);
			addEEnumLiteral(nombreCampoEEnum, NombreCampo.APELLIDO);
			addEEnumLiteral(nombreCampoEEnum, NombreCampo.CEDULA);
			addEEnumLiteral(nombreCampoEEnum, NombreCampo.HORA_MODIFICACION);
		}
		
		if(elementoConsulta instanceof Detallado ){
			nombreCampoEEnum.getELiterals().clear();
			initEEnum(nombreCampoEEnum, NombreCampo.class, "NombreCampo");
			addEEnumLiteral(nombreCampoEEnum, NombreCampo.ID);
			addEEnumLiteral(nombreCampoEEnum, NombreCampo.NOMBRE);
			addEEnumLiteral(nombreCampoEEnum, NombreCampo.REGISTRO);
			addEEnumLiteral(nombreCampoEEnum, NombreCampo.TOTAL_RECAUDO_TARIFA);
			addEEnumLiteral(nombreCampoEEnum, NombreCampo.REGISTRO_RECAUDO);
			addEEnumLiteral(nombreCampoEEnum, NombreCampo.COSTO_TARIFA);
		}
		
		if(elementoConsulta instanceof Propietario ){
			nombreCampoEEnum.getELiterals().clear();
			initEEnum(nombreCampoEEnum, NombreCampo.class, "NombreCampo");
			addEEnumLiteral(nombreCampoEEnum, NombreCampo.ID);
			addEEnumLiteral(nombreCampoEEnum, NombreCampo.NOMBRE);
			addEEnumLiteral(nombreCampoEEnum, NombreCampo.CEDULA);
		}
		
		if(elementoConsulta instanceof Consolidado ){
			nombreCampoEEnum.getELiterals().clear();
			initEEnum(nombreCampoEEnum, NombreCampo.class, "NombreCampo");
			addEEnumLiteral(nombreCampoEEnum, NombreCampo.ID);
			addEEnumLiteral(nombreCampoEEnum, NombreCampo.RUTA_DESPACHO);
			addEEnumLiteral(nombreCampoEEnum, NombreCampo.HORA_DESPACHO);
			addEEnumLiteral(nombreCampoEEnum, NombreCampo.REGISTRO_CONSOLIDADO);
			addEEnumLiteral(nombreCampoEEnum, NombreCampo.TOTAL_RECAUDO_BRUTO);
			addEEnumLiteral(nombreCampoEEnum, NombreCampo.TOTAL_RECAUDO_DESPACHO);
			addEEnumLiteral(nombreCampoEEnum, NombreCampo.ESTADO_CONSOLIDADO);
			addEEnumLiteral(nombreCampoEEnum, NombreCampo.ESTADO_IMPRESION);
		}
	}

} //ModelPackageImpl
