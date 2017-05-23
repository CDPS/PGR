/**
 */
package gestionmodelosconsultas.rules.factoryrules.impl;

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

import gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.ResultcotracirPackage;

import gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.impl.ResultcotracirPackageImpl;

import gestionmodelosconsultas.rules.factoryrules.ChildRule;
import gestionmodelosconsultas.rules.factoryrules.EntityName;
import gestionmodelosconsultas.rules.factoryrules.FactoryrulesFactory;
import gestionmodelosconsultas.rules.factoryrules.FactoryrulesPackage;
import gestionmodelosconsultas.rules.factoryrules.RelationName;
import gestionmodelosconsultas.rules.factoryrules.Rule;
import gestionmodelosconsultas.rules.factoryrules.RulesFactory;

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
public class FactoryrulesPackageImpl extends EPackageImpl implements FactoryrulesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rulesFactoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ruleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass childRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityNameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationNameEClass = null;

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
	 * @see gestionmodelosconsultas.rules.factoryrules.FactoryrulesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FactoryrulesPackageImpl() {
		super(eNS_URI, FactoryrulesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link FactoryrulesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FactoryrulesPackage init() {
		if (isInited) return (FactoryrulesPackage)EPackage.Registry.INSTANCE.getEPackage(FactoryrulesPackage.eNS_URI);

		// Obtain or create and register package
		FactoryrulesPackageImpl theFactoryrulesPackage = (FactoryrulesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof FactoryrulesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new FactoryrulesPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		GestionmodelosconsultasPackageImpl theGestionmodelosconsultasPackage = (GestionmodelosconsultasPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GestionmodelosconsultasPackage.eNS_URI) instanceof GestionmodelosconsultasPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GestionmodelosconsultasPackage.eNS_URI) : GestionmodelosconsultasPackage.eINSTANCE);
		EntitymodelPackageImpl theEntitymodelPackage = (EntitymodelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EntitymodelPackage.eNS_URI) instanceof EntitymodelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EntitymodelPackage.eNS_URI) : EntitymodelPackage.eINSTANCE);
		ModeloconsultasPackageImpl theModeloconsultasPackage = (ModeloconsultasPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ModeloconsultasPackage.eNS_URI) instanceof ModeloconsultasPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ModeloconsultasPackage.eNS_URI) : ModeloconsultasPackage.eINSTANCE);
		ModelPackageImpl theModelPackage = (ModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI) instanceof ModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI) : ModelPackage.eINSTANCE);
		ResultsetPackageImpl theResultsetPackage = (ResultsetPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ResultsetPackage.eNS_URI) instanceof ResultsetPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ResultsetPackage.eNS_URI) : ResultsetPackage.eINSTANCE);
		ResultcotracirPackageImpl theResultcotracirPackage = (ResultcotracirPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ResultcotracirPackage.eNS_URI) instanceof ResultcotracirPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ResultcotracirPackage.eNS_URI) : ResultcotracirPackage.eINSTANCE);
		CotracirPackageImpl theCotracirPackage = (CotracirPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CotracirPackage.eNS_URI) instanceof CotracirPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CotracirPackage.eNS_URI) : CotracirPackage.eINSTANCE);
		DatatypesPackageImpl theDatatypesPackage = (DatatypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DatatypesPackage.eNS_URI) instanceof DatatypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DatatypesPackage.eNS_URI) : DatatypesPackage.eINSTANCE);

		// Create package meta-data objects
		theFactoryrulesPackage.createPackageContents();
		theGestionmodelosconsultasPackage.createPackageContents();
		theEntitymodelPackage.createPackageContents();
		theModeloconsultasPackage.createPackageContents();
		theModelPackage.createPackageContents();
		theResultsetPackage.createPackageContents();
		theResultcotracirPackage.createPackageContents();
		theCotracirPackage.createPackageContents();
		theDatatypesPackage.createPackageContents();

		// Initialize created meta-data
		theFactoryrulesPackage.initializePackageContents();
		theGestionmodelosconsultasPackage.initializePackageContents();
		theEntitymodelPackage.initializePackageContents();
		theModeloconsultasPackage.initializePackageContents();
		theModelPackage.initializePackageContents();
		theResultsetPackage.initializePackageContents();
		theResultcotracirPackage.initializePackageContents();
		theCotracirPackage.initializePackageContents();
		theDatatypesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFactoryrulesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FactoryrulesPackage.eNS_URI, theFactoryrulesPackage);
		return theFactoryrulesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRulesFactory() {
		return rulesFactoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRulesFactory_ModelFactory() {
		return (EReference)rulesFactoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRulesFactory_ListRuleDiagramEntity() {
		return (EReference)rulesFactoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRule() {
		return ruleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRule_Name() {
		return (EAttribute)ruleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_RulesFactory() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_ListChildRule() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChildRule() {
		return childRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChildRule_Name() {
		return (EAttribute)childRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChildRule_Rule() {
		return (EReference)childRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntityName() {
		return entityNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationName() {
		return relationNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FactoryrulesFactory getFactoryrulesFactory() {
		return (FactoryrulesFactory)getEFactoryInstance();
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
		rulesFactoryEClass = createEClass(RULES_FACTORY);
		createEReference(rulesFactoryEClass, RULES_FACTORY__MODEL_FACTORY);
		createEReference(rulesFactoryEClass, RULES_FACTORY__LIST_RULE_DIAGRAM_ENTITY);

		ruleEClass = createEClass(RULE);
		createEAttribute(ruleEClass, RULE__NAME);
		createEReference(ruleEClass, RULE__RULES_FACTORY);
		createEReference(ruleEClass, RULE__LIST_CHILD_RULE);

		childRuleEClass = createEClass(CHILD_RULE);
		createEAttribute(childRuleEClass, CHILD_RULE__NAME);
		createEReference(childRuleEClass, CHILD_RULE__RULE);

		entityNameEClass = createEClass(ENTITY_NAME);

		relationNameEClass = createEClass(RELATION_NAME);
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
		GestionmodelosconsultasPackage theGestionmodelosconsultasPackage = (GestionmodelosconsultasPackage)EPackage.Registry.INSTANCE.getEPackage(GestionmodelosconsultasPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		entityNameEClass.getESuperTypes().add(this.getChildRule());
		relationNameEClass.getESuperTypes().add(this.getChildRule());

		// Initialize classes, features, and operations; add parameters
		initEClass(rulesFactoryEClass, RulesFactory.class, "RulesFactory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRulesFactory_ModelFactory(), theGestionmodelosconsultasPackage.getModelFactory(), theGestionmodelosconsultasPackage.getModelFactory_RulesFactory(), "ModelFactory", null, 0, 1, RulesFactory.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRulesFactory_ListRuleDiagramEntity(), this.getRule(), this.getRule_RulesFactory(), "listRuleDiagramEntity", null, 0, -1, RulesFactory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ruleEClass, Rule.class, "Rule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRule_Name(), ecorePackage.getEString(), "name", null, 0, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRule_RulesFactory(), this.getRulesFactory(), this.getRulesFactory_ListRuleDiagramEntity(), "RulesFactory", null, 0, 1, Rule.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRule_ListChildRule(), this.getChildRule(), this.getChildRule_Rule(), "listChildRule", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(childRuleEClass, ChildRule.class, "ChildRule", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChildRule_Name(), ecorePackage.getEString(), "name", null, 0, 1, ChildRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChildRule_Rule(), this.getRule(), this.getRule_ListChildRule(), "Rule", null, 0, 1, ChildRule.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entityNameEClass, EntityName.class, "EntityName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(relationNameEClass, RelationName.class, "RelationName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	}

} //FactoryrulesPackageImpl
