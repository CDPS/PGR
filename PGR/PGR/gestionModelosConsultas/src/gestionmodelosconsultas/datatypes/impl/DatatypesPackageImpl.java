/**
 */
package gestionmodelosconsultas.datatypes.impl;

import gestionmodelosconsultas.GestionmodelosconsultasPackage;

import gestionmodelosconsultas.datatypes.DatatypesFactory;
import gestionmodelosconsultas.datatypes.DatatypesPackage;

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

import gestionmodelosconsultas.rules.factoryrules.FactoryrulesPackage;

import gestionmodelosconsultas.rules.factoryrules.impl.FactoryrulesPackageImpl;

import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DatatypesPackageImpl extends EPackageImpl implements DatatypesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType objectEDataType = null;

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
	 * @see gestionmodelosconsultas.datatypes.DatatypesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DatatypesPackageImpl() {
		super(eNS_URI, DatatypesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DatatypesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DatatypesPackage init() {
		if (isInited) return (DatatypesPackage)EPackage.Registry.INSTANCE.getEPackage(DatatypesPackage.eNS_URI);

		// Obtain or create and register package
		DatatypesPackageImpl theDatatypesPackage = (DatatypesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DatatypesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DatatypesPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		GestionmodelosconsultasPackageImpl theGestionmodelosconsultasPackage = (GestionmodelosconsultasPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GestionmodelosconsultasPackage.eNS_URI) instanceof GestionmodelosconsultasPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GestionmodelosconsultasPackage.eNS_URI) : GestionmodelosconsultasPackage.eINSTANCE);
		FactoryrulesPackageImpl theFactoryrulesPackage = (FactoryrulesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FactoryrulesPackage.eNS_URI) instanceof FactoryrulesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FactoryrulesPackage.eNS_URI) : FactoryrulesPackage.eINSTANCE);
		EntitymodelPackageImpl theEntitymodelPackage = (EntitymodelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EntitymodelPackage.eNS_URI) instanceof EntitymodelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EntitymodelPackage.eNS_URI) : EntitymodelPackage.eINSTANCE);
		ModeloconsultasPackageImpl theModeloconsultasPackage = (ModeloconsultasPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ModeloconsultasPackage.eNS_URI) instanceof ModeloconsultasPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ModeloconsultasPackage.eNS_URI) : ModeloconsultasPackage.eINSTANCE);
		ModelPackageImpl theModelPackage = (ModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI) instanceof ModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI) : ModelPackage.eINSTANCE);
		ResultsetPackageImpl theResultsetPackage = (ResultsetPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ResultsetPackage.eNS_URI) instanceof ResultsetPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ResultsetPackage.eNS_URI) : ResultsetPackage.eINSTANCE);
		ResultcotracirPackageImpl theResultcotracirPackage = (ResultcotracirPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ResultcotracirPackage.eNS_URI) instanceof ResultcotracirPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ResultcotracirPackage.eNS_URI) : ResultcotracirPackage.eINSTANCE);
		CotracirPackageImpl theCotracirPackage = (CotracirPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CotracirPackage.eNS_URI) instanceof CotracirPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CotracirPackage.eNS_URI) : CotracirPackage.eINSTANCE);

		// Create package meta-data objects
		theDatatypesPackage.createPackageContents();
		theGestionmodelosconsultasPackage.createPackageContents();
		theFactoryrulesPackage.createPackageContents();
		theEntitymodelPackage.createPackageContents();
		theModeloconsultasPackage.createPackageContents();
		theModelPackage.createPackageContents();
		theResultsetPackage.createPackageContents();
		theResultcotracirPackage.createPackageContents();
		theCotracirPackage.createPackageContents();

		// Initialize created meta-data
		theDatatypesPackage.initializePackageContents();
		theGestionmodelosconsultasPackage.initializePackageContents();
		theFactoryrulesPackage.initializePackageContents();
		theEntitymodelPackage.initializePackageContents();
		theModeloconsultasPackage.initializePackageContents();
		theModelPackage.initializePackageContents();
		theResultsetPackage.initializePackageContents();
		theResultcotracirPackage.initializePackageContents();
		theCotracirPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDatatypesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DatatypesPackage.eNS_URI, theDatatypesPackage);
		return theDatatypesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getObject() {
		return objectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatatypesFactory getDatatypesFactory() {
		return (DatatypesFactory)getEFactoryInstance();
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

		// Create data types
		objectEDataType = createEDataType(OBJECT);
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

		// Initialize data types
		initEDataType(objectEDataType, Object.class, "Object", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
	}

} //DatatypesPackageImpl
