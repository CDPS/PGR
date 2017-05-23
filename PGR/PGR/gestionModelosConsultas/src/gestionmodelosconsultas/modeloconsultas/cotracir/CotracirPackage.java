/**
 */
package gestionmodelosconsultas.modeloconsultas.cotracir;

import gestionmodelosconsultas.modeloconsultas.model.ModelPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see gestionmodelosconsultas.modeloconsultas.cotracir.CotracirFactory
 * @model kind="package"
 * @generated
 */
public interface CotracirPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "cotracir";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///gestionmodelosconsultas/modeloconsultas/cotracir.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "gestionmodelosconsultas.modeloconsultas.cotracir";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CotracirPackage eINSTANCE = gestionmodelosconsultas.modeloconsultas.cotracir.impl.CotracirPackageImpl.init();

	/**
	 * The meta object id for the '{@link gestionmodelosconsultas.modeloconsultas.cotracir.impl.PlanillaImpl <em>Planilla</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gestionmodelosconsultas.modeloconsultas.cotracir.impl.PlanillaImpl
	 * @see gestionmodelosconsultas.modeloconsultas.cotracir.impl.CotracirPackageImpl#getPlanilla()
	 * @generated
	 */
	int PLANILLA = 0;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANILLA__NOMBRE = ModelPackage.ELEMENTO_CONSULTA__NOMBRE;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANILLA__FROM = ModelPackage.ELEMENTO_CONSULTA__FROM;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANILLA__TO = ModelPackage.ELEMENTO_CONSULTA__TO;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANILLA__ORDER = ModelPackage.ELEMENTO_CONSULTA__ORDER;

	/**
	 * The feature id for the '<em><b>EA Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANILLA__EA_DIAGRAM = ModelPackage.ELEMENTO_CONSULTA__EA_DIAGRAM;

	/**
	 * The feature id for the '<em><b>List Campos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANILLA__LIST_CAMPOS = ModelPackage.ELEMENTO_CONSULTA__LIST_CAMPOS;

	/**
	 * The number of structural features of the '<em>Planilla</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANILLA_FEATURE_COUNT = ModelPackage.ELEMENTO_CONSULTA_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Planilla</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANILLA_OPERATION_COUNT = ModelPackage.ELEMENTO_CONSULTA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gestionmodelosconsultas.modeloconsultas.cotracir.impl.ConsolidadoImpl <em>Consolidado</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gestionmodelosconsultas.modeloconsultas.cotracir.impl.ConsolidadoImpl
	 * @see gestionmodelosconsultas.modeloconsultas.cotracir.impl.CotracirPackageImpl#getConsolidado()
	 * @generated
	 */
	int CONSOLIDADO = 1;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSOLIDADO__NOMBRE = ModelPackage.ELEMENTO_CONSULTA__NOMBRE;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSOLIDADO__FROM = ModelPackage.ELEMENTO_CONSULTA__FROM;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSOLIDADO__TO = ModelPackage.ELEMENTO_CONSULTA__TO;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSOLIDADO__ORDER = ModelPackage.ELEMENTO_CONSULTA__ORDER;

	/**
	 * The feature id for the '<em><b>EA Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSOLIDADO__EA_DIAGRAM = ModelPackage.ELEMENTO_CONSULTA__EA_DIAGRAM;

	/**
	 * The feature id for the '<em><b>List Campos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSOLIDADO__LIST_CAMPOS = ModelPackage.ELEMENTO_CONSULTA__LIST_CAMPOS;

	/**
	 * The number of structural features of the '<em>Consolidado</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSOLIDADO_FEATURE_COUNT = ModelPackage.ELEMENTO_CONSULTA_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Consolidado</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSOLIDADO_OPERATION_COUNT = ModelPackage.ELEMENTO_CONSULTA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gestionmodelosconsultas.modeloconsultas.cotracir.impl.TransaccionImpl <em>Transaccion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gestionmodelosconsultas.modeloconsultas.cotracir.impl.TransaccionImpl
	 * @see gestionmodelosconsultas.modeloconsultas.cotracir.impl.CotracirPackageImpl#getTransaccion()
	 * @generated
	 */
	int TRANSACCION = 2;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACCION__NOMBRE = ModelPackage.ELEMENTO_CONSULTA__NOMBRE;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACCION__FROM = ModelPackage.ELEMENTO_CONSULTA__FROM;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACCION__TO = ModelPackage.ELEMENTO_CONSULTA__TO;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACCION__ORDER = ModelPackage.ELEMENTO_CONSULTA__ORDER;

	/**
	 * The feature id for the '<em><b>EA Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACCION__EA_DIAGRAM = ModelPackage.ELEMENTO_CONSULTA__EA_DIAGRAM;

	/**
	 * The feature id for the '<em><b>List Campos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACCION__LIST_CAMPOS = ModelPackage.ELEMENTO_CONSULTA__LIST_CAMPOS;

	/**
	 * The number of structural features of the '<em>Transaccion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACCION_FEATURE_COUNT = ModelPackage.ELEMENTO_CONSULTA_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Transaccion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACCION_OPERATION_COUNT = ModelPackage.ELEMENTO_CONSULTA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gestionmodelosconsultas.modeloconsultas.cotracir.impl.TramaImpl <em>Trama</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gestionmodelosconsultas.modeloconsultas.cotracir.impl.TramaImpl
	 * @see gestionmodelosconsultas.modeloconsultas.cotracir.impl.CotracirPackageImpl#getTrama()
	 * @generated
	 */
	int TRAMA = 3;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAMA__NOMBRE = ModelPackage.ELEMENTO_CONSULTA__NOMBRE;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAMA__FROM = ModelPackage.ELEMENTO_CONSULTA__FROM;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAMA__TO = ModelPackage.ELEMENTO_CONSULTA__TO;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAMA__ORDER = ModelPackage.ELEMENTO_CONSULTA__ORDER;

	/**
	 * The feature id for the '<em><b>EA Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAMA__EA_DIAGRAM = ModelPackage.ELEMENTO_CONSULTA__EA_DIAGRAM;

	/**
	 * The feature id for the '<em><b>List Campos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAMA__LIST_CAMPOS = ModelPackage.ELEMENTO_CONSULTA__LIST_CAMPOS;

	/**
	 * The number of structural features of the '<em>Trama</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAMA_FEATURE_COUNT = ModelPackage.ELEMENTO_CONSULTA_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Trama</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAMA_OPERATION_COUNT = ModelPackage.ELEMENTO_CONSULTA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gestionmodelosconsultas.modeloconsultas.cotracir.impl.PropietarioImpl <em>Propietario</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gestionmodelosconsultas.modeloconsultas.cotracir.impl.PropietarioImpl
	 * @see gestionmodelosconsultas.modeloconsultas.cotracir.impl.CotracirPackageImpl#getPropietario()
	 * @generated
	 */
	int PROPIETARIO = 4;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPIETARIO__NOMBRE = ModelPackage.ELEMENTO_CONSULTA__NOMBRE;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPIETARIO__FROM = ModelPackage.ELEMENTO_CONSULTA__FROM;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPIETARIO__TO = ModelPackage.ELEMENTO_CONSULTA__TO;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPIETARIO__ORDER = ModelPackage.ELEMENTO_CONSULTA__ORDER;

	/**
	 * The feature id for the '<em><b>EA Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPIETARIO__EA_DIAGRAM = ModelPackage.ELEMENTO_CONSULTA__EA_DIAGRAM;

	/**
	 * The feature id for the '<em><b>List Campos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPIETARIO__LIST_CAMPOS = ModelPackage.ELEMENTO_CONSULTA__LIST_CAMPOS;

	/**
	 * The number of structural features of the '<em>Propietario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPIETARIO_FEATURE_COUNT = ModelPackage.ELEMENTO_CONSULTA_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Propietario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPIETARIO_OPERATION_COUNT = ModelPackage.ELEMENTO_CONSULTA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gestionmodelosconsultas.modeloconsultas.cotracir.impl.DetalladoImpl <em>Detallado</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gestionmodelosconsultas.modeloconsultas.cotracir.impl.DetalladoImpl
	 * @see gestionmodelosconsultas.modeloconsultas.cotracir.impl.CotracirPackageImpl#getDetallado()
	 * @generated
	 */
	int DETALLADO = 5;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETALLADO__NOMBRE = ModelPackage.ELEMENTO_CONSULTA__NOMBRE;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETALLADO__FROM = ModelPackage.ELEMENTO_CONSULTA__FROM;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETALLADO__TO = ModelPackage.ELEMENTO_CONSULTA__TO;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETALLADO__ORDER = ModelPackage.ELEMENTO_CONSULTA__ORDER;

	/**
	 * The feature id for the '<em><b>EA Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETALLADO__EA_DIAGRAM = ModelPackage.ELEMENTO_CONSULTA__EA_DIAGRAM;

	/**
	 * The feature id for the '<em><b>List Campos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETALLADO__LIST_CAMPOS = ModelPackage.ELEMENTO_CONSULTA__LIST_CAMPOS;

	/**
	 * The number of structural features of the '<em>Detallado</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETALLADO_FEATURE_COUNT = ModelPackage.ELEMENTO_CONSULTA_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Detallado</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETALLADO_OPERATION_COUNT = ModelPackage.ELEMENTO_CONSULTA_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link gestionmodelosconsultas.modeloconsultas.cotracir.Planilla <em>Planilla</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Planilla</em>'.
	 * @see gestionmodelosconsultas.modeloconsultas.cotracir.Planilla
	 * @generated
	 */
	EClass getPlanilla();

	/**
	 * Returns the meta object for class '{@link gestionmodelosconsultas.modeloconsultas.cotracir.Consolidado <em>Consolidado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Consolidado</em>'.
	 * @see gestionmodelosconsultas.modeloconsultas.cotracir.Consolidado
	 * @generated
	 */
	EClass getConsolidado();

	/**
	 * Returns the meta object for class '{@link gestionmodelosconsultas.modeloconsultas.cotracir.Transaccion <em>Transaccion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transaccion</em>'.
	 * @see gestionmodelosconsultas.modeloconsultas.cotracir.Transaccion
	 * @generated
	 */
	EClass getTransaccion();

	/**
	 * Returns the meta object for class '{@link gestionmodelosconsultas.modeloconsultas.cotracir.Trama <em>Trama</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trama</em>'.
	 * @see gestionmodelosconsultas.modeloconsultas.cotracir.Trama
	 * @generated
	 */
	EClass getTrama();

	/**
	 * Returns the meta object for class '{@link gestionmodelosconsultas.modeloconsultas.cotracir.Propietario <em>Propietario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Propietario</em>'.
	 * @see gestionmodelosconsultas.modeloconsultas.cotracir.Propietario
	 * @generated
	 */
	EClass getPropietario();

	/**
	 * Returns the meta object for class '{@link gestionmodelosconsultas.modeloconsultas.cotracir.Detallado <em>Detallado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Detallado</em>'.
	 * @see gestionmodelosconsultas.modeloconsultas.cotracir.Detallado
	 * @generated
	 */
	EClass getDetallado();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CotracirFactory getCotracirFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link gestionmodelosconsultas.modeloconsultas.cotracir.impl.PlanillaImpl <em>Planilla</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gestionmodelosconsultas.modeloconsultas.cotracir.impl.PlanillaImpl
		 * @see gestionmodelosconsultas.modeloconsultas.cotracir.impl.CotracirPackageImpl#getPlanilla()
		 * @generated
		 */
		EClass PLANILLA = eINSTANCE.getPlanilla();

		/**
		 * The meta object literal for the '{@link gestionmodelosconsultas.modeloconsultas.cotracir.impl.ConsolidadoImpl <em>Consolidado</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gestionmodelosconsultas.modeloconsultas.cotracir.impl.ConsolidadoImpl
		 * @see gestionmodelosconsultas.modeloconsultas.cotracir.impl.CotracirPackageImpl#getConsolidado()
		 * @generated
		 */
		EClass CONSOLIDADO = eINSTANCE.getConsolidado();

		/**
		 * The meta object literal for the '{@link gestionmodelosconsultas.modeloconsultas.cotracir.impl.TransaccionImpl <em>Transaccion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gestionmodelosconsultas.modeloconsultas.cotracir.impl.TransaccionImpl
		 * @see gestionmodelosconsultas.modeloconsultas.cotracir.impl.CotracirPackageImpl#getTransaccion()
		 * @generated
		 */
		EClass TRANSACCION = eINSTANCE.getTransaccion();

		/**
		 * The meta object literal for the '{@link gestionmodelosconsultas.modeloconsultas.cotracir.impl.TramaImpl <em>Trama</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gestionmodelosconsultas.modeloconsultas.cotracir.impl.TramaImpl
		 * @see gestionmodelosconsultas.modeloconsultas.cotracir.impl.CotracirPackageImpl#getTrama()
		 * @generated
		 */
		EClass TRAMA = eINSTANCE.getTrama();

		/**
		 * The meta object literal for the '{@link gestionmodelosconsultas.modeloconsultas.cotracir.impl.PropietarioImpl <em>Propietario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gestionmodelosconsultas.modeloconsultas.cotracir.impl.PropietarioImpl
		 * @see gestionmodelosconsultas.modeloconsultas.cotracir.impl.CotracirPackageImpl#getPropietario()
		 * @generated
		 */
		EClass PROPIETARIO = eINSTANCE.getPropietario();

		/**
		 * The meta object literal for the '{@link gestionmodelosconsultas.modeloconsultas.cotracir.impl.DetalladoImpl <em>Detallado</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gestionmodelosconsultas.modeloconsultas.cotracir.impl.DetalladoImpl
		 * @see gestionmodelosconsultas.modeloconsultas.cotracir.impl.CotracirPackageImpl#getDetallado()
		 * @generated
		 */
		EClass DETALLADO = eINSTANCE.getDetallado();

	}

} //CotracirPackage
