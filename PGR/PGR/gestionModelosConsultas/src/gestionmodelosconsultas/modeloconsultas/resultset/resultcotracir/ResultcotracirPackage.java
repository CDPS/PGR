/**
 */
package gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir;

import gestionmodelosconsultas.modeloconsultas.resultset.ResultsetPackage;

import org.eclipse.emf.ecore.EAttribute;
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
 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.ResultcotracirFactory
 * @model kind="package"
 * @generated
 */
public interface ResultcotracirPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "resultcotracir";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///gestionmodelosconsultas/modeloconsultas/resultset/resultcotracir.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ResultcotracirPackage eINSTANCE = gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.impl.ResultcotracirPackageImpl.init();

	/**
	 * The meta object id for the '{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.impl.TransaccionImpl <em>Transaccion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.impl.TransaccionImpl
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.impl.ResultcotracirPackageImpl#getTransaccion()
	 * @generated
	 */
	int TRANSACCION = 0;

	/**
	 * The feature id for the '<em><b>Resultado</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACCION__RESULTADO = ResultsetPackage.ELEMENTO_MODELO_RESULTADO__RESULTADO;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACCION__KEY = ResultsetPackage.ELEMENTO_MODELO_RESULTADO__KEY;

	/**
	 * The feature id for the '<em><b>List Elemento Modelo Resultado</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACCION__LIST_ELEMENTO_MODELO_RESULTADO = ResultsetPackage.ELEMENTO_MODELO_RESULTADO__LIST_ELEMENTO_MODELO_RESULTADO;

	/**
	 * The feature id for the '<em><b>Elemento Modelo Resultado</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACCION__ELEMENTO_MODELO_RESULTADO = ResultsetPackage.ELEMENTO_MODELO_RESULTADO__ELEMENTO_MODELO_RESULTADO;

	/**
	 * The feature id for the '<em><b>ESTADO TRANSACCION</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACCION__ESTADO_TRANSACCION = ResultsetPackage.ELEMENTO_MODELO_RESULTADO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>HORA</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACCION__HORA = ResultsetPackage.ELEMENTO_MODELO_RESULTADO_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>TIPO</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACCION__TIPO = ResultsetPackage.ELEMENTO_MODELO_RESULTADO_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>DESCRIPCION</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACCION__DESCRIPCION = ResultsetPackage.ELEMENTO_MODELO_RESULTADO_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>CATEGORIA</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACCION__CATEGORIA = ResultsetPackage.ELEMENTO_MODELO_RESULTADO_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACCION__ID = ResultsetPackage.ELEMENTO_MODELO_RESULTADO_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>VALOR</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACCION__VALOR = ResultsetPackage.ELEMENTO_MODELO_RESULTADO_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Transaccion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACCION_FEATURE_COUNT = ResultsetPackage.ELEMENTO_MODELO_RESULTADO_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Transaccion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACCION_OPERATION_COUNT = ResultsetPackage.ELEMENTO_MODELO_RESULTADO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.impl.TramaImpl <em>Trama</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.impl.TramaImpl
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.impl.ResultcotracirPackageImpl#getTrama()
	 * @generated
	 */
	int TRAMA = 1;

	/**
	 * The feature id for the '<em><b>Resultado</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAMA__RESULTADO = ResultsetPackage.ELEMENTO_MODELO_RESULTADO__RESULTADO;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAMA__KEY = ResultsetPackage.ELEMENTO_MODELO_RESULTADO__KEY;

	/**
	 * The feature id for the '<em><b>List Elemento Modelo Resultado</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAMA__LIST_ELEMENTO_MODELO_RESULTADO = ResultsetPackage.ELEMENTO_MODELO_RESULTADO__LIST_ELEMENTO_MODELO_RESULTADO;

	/**
	 * The feature id for the '<em><b>Elemento Modelo Resultado</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAMA__ELEMENTO_MODELO_RESULTADO = ResultsetPackage.ELEMENTO_MODELO_RESULTADO__ELEMENTO_MODELO_RESULTADO;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAMA__ID = ResultsetPackage.ELEMENTO_MODELO_RESULTADO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>CADENA TRAMA</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAMA__CADENA_TRAMA = ResultsetPackage.ELEMENTO_MODELO_RESULTADO_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Trama</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAMA_FEATURE_COUNT = ResultsetPackage.ELEMENTO_MODELO_RESULTADO_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Trama</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAMA_OPERATION_COUNT = ResultsetPackage.ELEMENTO_MODELO_RESULTADO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.impl.ConsolidadoImpl <em>Consolidado</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.impl.ConsolidadoImpl
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.impl.ResultcotracirPackageImpl#getConsolidado()
	 * @generated
	 */
	int CONSOLIDADO = 2;

	/**
	 * The feature id for the '<em><b>Resultado</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSOLIDADO__RESULTADO = ResultsetPackage.ELEMENTO_MODELO_RESULTADO__RESULTADO;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSOLIDADO__KEY = ResultsetPackage.ELEMENTO_MODELO_RESULTADO__KEY;

	/**
	 * The feature id for the '<em><b>List Elemento Modelo Resultado</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSOLIDADO__LIST_ELEMENTO_MODELO_RESULTADO = ResultsetPackage.ELEMENTO_MODELO_RESULTADO__LIST_ELEMENTO_MODELO_RESULTADO;

	/**
	 * The feature id for the '<em><b>Elemento Modelo Resultado</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSOLIDADO__ELEMENTO_MODELO_RESULTADO = ResultsetPackage.ELEMENTO_MODELO_RESULTADO__ELEMENTO_MODELO_RESULTADO;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSOLIDADO__ID = ResultsetPackage.ELEMENTO_MODELO_RESULTADO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>RUTA DESPACHO</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSOLIDADO__RUTA_DESPACHO = ResultsetPackage.ELEMENTO_MODELO_RESULTADO_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>HORA DESPACHO</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSOLIDADO__HORA_DESPACHO = ResultsetPackage.ELEMENTO_MODELO_RESULTADO_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>REGISTRO CONSOLIDADO</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSOLIDADO__REGISTRO_CONSOLIDADO = ResultsetPackage.ELEMENTO_MODELO_RESULTADO_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>TOTAL RECAUDO BRUTO</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSOLIDADO__TOTAL_RECAUDO_BRUTO = ResultsetPackage.ELEMENTO_MODELO_RESULTADO_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>TOTAL RECAUDO DESPACHO</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSOLIDADO__TOTAL_RECAUDO_DESPACHO = ResultsetPackage.ELEMENTO_MODELO_RESULTADO_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>ESTADO CONSOLIDADO</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSOLIDADO__ESTADO_CONSOLIDADO = ResultsetPackage.ELEMENTO_MODELO_RESULTADO_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>ESTADO IMPRESION</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSOLIDADO__ESTADO_IMPRESION = ResultsetPackage.ELEMENTO_MODELO_RESULTADO_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Consolidado</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSOLIDADO_FEATURE_COUNT = ResultsetPackage.ELEMENTO_MODELO_RESULTADO_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Consolidado</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSOLIDADO_OPERATION_COUNT = ResultsetPackage.ELEMENTO_MODELO_RESULTADO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.impl.PropietarioImpl <em>Propietario</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.impl.PropietarioImpl
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.impl.ResultcotracirPackageImpl#getPropietario()
	 * @generated
	 */
	int PROPIETARIO = 3;

	/**
	 * The feature id for the '<em><b>Resultado</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPIETARIO__RESULTADO = ResultsetPackage.ELEMENTO_MODELO_RESULTADO__RESULTADO;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPIETARIO__KEY = ResultsetPackage.ELEMENTO_MODELO_RESULTADO__KEY;

	/**
	 * The feature id for the '<em><b>List Elemento Modelo Resultado</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPIETARIO__LIST_ELEMENTO_MODELO_RESULTADO = ResultsetPackage.ELEMENTO_MODELO_RESULTADO__LIST_ELEMENTO_MODELO_RESULTADO;

	/**
	 * The feature id for the '<em><b>Elemento Modelo Resultado</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPIETARIO__ELEMENTO_MODELO_RESULTADO = ResultsetPackage.ELEMENTO_MODELO_RESULTADO__ELEMENTO_MODELO_RESULTADO;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPIETARIO__ID = ResultsetPackage.ELEMENTO_MODELO_RESULTADO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>NOMBRE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPIETARIO__NOMBRE = ResultsetPackage.ELEMENTO_MODELO_RESULTADO_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>CEDULA</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPIETARIO__CEDULA = ResultsetPackage.ELEMENTO_MODELO_RESULTADO_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Propietario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPIETARIO_FEATURE_COUNT = ResultsetPackage.ELEMENTO_MODELO_RESULTADO_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Propietario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPIETARIO_OPERATION_COUNT = ResultsetPackage.ELEMENTO_MODELO_RESULTADO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.impl.PlanillaImpl <em>Planilla</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.impl.PlanillaImpl
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.impl.ResultcotracirPackageImpl#getPlanilla()
	 * @generated
	 */
	int PLANILLA = 4;

	/**
	 * The feature id for the '<em><b>Resultado</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANILLA__RESULTADO = ResultsetPackage.ELEMENTO_MODELO_RESULTADO__RESULTADO;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANILLA__KEY = ResultsetPackage.ELEMENTO_MODELO_RESULTADO__KEY;

	/**
	 * The feature id for the '<em><b>List Elemento Modelo Resultado</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANILLA__LIST_ELEMENTO_MODELO_RESULTADO = ResultsetPackage.ELEMENTO_MODELO_RESULTADO__LIST_ELEMENTO_MODELO_RESULTADO;

	/**
	 * The feature id for the '<em><b>Elemento Modelo Resultado</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANILLA__ELEMENTO_MODELO_RESULTADO = ResultsetPackage.ELEMENTO_MODELO_RESULTADO__ELEMENTO_MODELO_RESULTADO;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANILLA__ID = ResultsetPackage.ELEMENTO_MODELO_RESULTADO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>NUMERO MOVIL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANILLA__NUMERO_MOVIL = ResultsetPackage.ELEMENTO_MODELO_RESULTADO_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>FECHA</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANILLA__FECHA = ResultsetPackage.ELEMENTO_MODELO_RESULTADO_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>CEDULA CONDUCTOR</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANILLA__CEDULA_CONDUCTOR = ResultsetPackage.ELEMENTO_MODELO_RESULTADO_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>CONDUCTOR</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANILLA__CONDUCTOR = ResultsetPackage.ELEMENTO_MODELO_RESULTADO_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>TOTAL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANILLA__TOTAL = ResultsetPackage.ELEMENTO_MODELO_RESULTADO_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>TOTAL RECAUDO BRUTO</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANILLA__TOTAL_RECAUDO_BRUTO = ResultsetPackage.ELEMENTO_MODELO_RESULTADO_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>TOTAL RECAUDO NETO</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANILLA__TOTAL_RECAUDO_NETO = ResultsetPackage.ELEMENTO_MODELO_RESULTADO_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>TOTAL DEPOSITO</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANILLA__TOTAL_DEPOSITO = ResultsetPackage.ELEMENTO_MODELO_RESULTADO_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>TOTAL GASTOS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANILLA__TOTAL_GASTOS = ResultsetPackage.ELEMENTO_MODELO_RESULTADO_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>LIQUIDADO</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANILLA__LIQUIDADO = ResultsetPackage.ELEMENTO_MODELO_RESULTADO_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>USUARIO</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANILLA__USUARIO = ResultsetPackage.ELEMENTO_MODELO_RESULTADO_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>NOMBRE PERSONA</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANILLA__NOMBRE_PERSONA = ResultsetPackage.ELEMENTO_MODELO_RESULTADO_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>APELLIDO</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANILLA__APELLIDO = ResultsetPackage.ELEMENTO_MODELO_RESULTADO_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>CEDULA</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANILLA__CEDULA = ResultsetPackage.ELEMENTO_MODELO_RESULTADO_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>HORA MODIFICACION</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANILLA__HORA_MODIFICACION = ResultsetPackage.ELEMENTO_MODELO_RESULTADO_FEATURE_COUNT + 15;

	/**
	 * The number of structural features of the '<em>Planilla</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANILLA_FEATURE_COUNT = ResultsetPackage.ELEMENTO_MODELO_RESULTADO_FEATURE_COUNT + 16;

	/**
	 * The number of operations of the '<em>Planilla</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANILLA_OPERATION_COUNT = ResultsetPackage.ELEMENTO_MODELO_RESULTADO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.impl.NewClassImpl <em>New Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.impl.NewClassImpl
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.impl.ResultcotracirPackageImpl#getNewClass()
	 * @generated
	 */
	int NEW_CLASS = 5;

	/**
	 * The number of structural features of the '<em>New Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_CLASS_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>New Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_CLASS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.impl.DetalladoImpl <em>Detallado</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.impl.DetalladoImpl
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.impl.ResultcotracirPackageImpl#getDetallado()
	 * @generated
	 */
	int DETALLADO = 6;

	/**
	 * The feature id for the '<em><b>Resultado</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETALLADO__RESULTADO = ResultsetPackage.ELEMENTO_MODELO_RESULTADO__RESULTADO;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETALLADO__KEY = ResultsetPackage.ELEMENTO_MODELO_RESULTADO__KEY;

	/**
	 * The feature id for the '<em><b>List Elemento Modelo Resultado</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETALLADO__LIST_ELEMENTO_MODELO_RESULTADO = ResultsetPackage.ELEMENTO_MODELO_RESULTADO__LIST_ELEMENTO_MODELO_RESULTADO;

	/**
	 * The feature id for the '<em><b>Elemento Modelo Resultado</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETALLADO__ELEMENTO_MODELO_RESULTADO = ResultsetPackage.ELEMENTO_MODELO_RESULTADO__ELEMENTO_MODELO_RESULTADO;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETALLADO__ID = ResultsetPackage.ELEMENTO_MODELO_RESULTADO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>NOMBRE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETALLADO__NOMBRE = ResultsetPackage.ELEMENTO_MODELO_RESULTADO_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>REGISTRO</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETALLADO__REGISTRO = ResultsetPackage.ELEMENTO_MODELO_RESULTADO_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>TOTAL RECAUDO TARIFA</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETALLADO__TOTAL_RECAUDO_TARIFA = ResultsetPackage.ELEMENTO_MODELO_RESULTADO_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>REGISTRO RECAUDO</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETALLADO__REGISTRO_RECAUDO = ResultsetPackage.ELEMENTO_MODELO_RESULTADO_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>COSTO TARIFA</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETALLADO__COSTO_TARIFA = ResultsetPackage.ELEMENTO_MODELO_RESULTADO_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Detallado</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETALLADO_FEATURE_COUNT = ResultsetPackage.ELEMENTO_MODELO_RESULTADO_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Detallado</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETALLADO_OPERATION_COUNT = ResultsetPackage.ELEMENTO_MODELO_RESULTADO_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Transaccion <em>Transaccion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transaccion</em>'.
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Transaccion
	 * @generated
	 */
	EClass getTransaccion();

	/**
	 * Returns the meta object for the attribute '{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Transaccion#getESTADO_TRANSACCION <em>ESTADO TRANSACCION</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ESTADO TRANSACCION</em>'.
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Transaccion#getESTADO_TRANSACCION()
	 * @see #getTransaccion()
	 * @generated
	 */
	EAttribute getTransaccion_ESTADO_TRANSACCION();

	/**
	 * Returns the meta object for the attribute '{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Transaccion#getHORA <em>HORA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>HORA</em>'.
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Transaccion#getHORA()
	 * @see #getTransaccion()
	 * @generated
	 */
	EAttribute getTransaccion_HORA();

	/**
	 * Returns the meta object for the attribute '{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Transaccion#getTIPO <em>TIPO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>TIPO</em>'.
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Transaccion#getTIPO()
	 * @see #getTransaccion()
	 * @generated
	 */
	EAttribute getTransaccion_TIPO();

	/**
	 * Returns the meta object for the attribute '{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Transaccion#getDESCRIPCION <em>DESCRIPCION</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DESCRIPCION</em>'.
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Transaccion#getDESCRIPCION()
	 * @see #getTransaccion()
	 * @generated
	 */
	EAttribute getTransaccion_DESCRIPCION();

	/**
	 * Returns the meta object for the attribute '{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Transaccion#getCATEGORIA <em>CATEGORIA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>CATEGORIA</em>'.
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Transaccion#getCATEGORIA()
	 * @see #getTransaccion()
	 * @generated
	 */
	EAttribute getTransaccion_CATEGORIA();

	/**
	 * Returns the meta object for the attribute '{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Transaccion#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Transaccion#getID()
	 * @see #getTransaccion()
	 * @generated
	 */
	EAttribute getTransaccion_ID();

	/**
	 * Returns the meta object for the attribute '{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Transaccion#getVALOR <em>VALOR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>VALOR</em>'.
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Transaccion#getVALOR()
	 * @see #getTransaccion()
	 * @generated
	 */
	EAttribute getTransaccion_VALOR();

	/**
	 * Returns the meta object for class '{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Trama <em>Trama</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trama</em>'.
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Trama
	 * @generated
	 */
	EClass getTrama();

	/**
	 * Returns the meta object for the attribute '{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Trama#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Trama#getID()
	 * @see #getTrama()
	 * @generated
	 */
	EAttribute getTrama_ID();

	/**
	 * Returns the meta object for the attribute '{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Trama#getCADENA_TRAMA <em>CADENA TRAMA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>CADENA TRAMA</em>'.
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Trama#getCADENA_TRAMA()
	 * @see #getTrama()
	 * @generated
	 */
	EAttribute getTrama_CADENA_TRAMA();

	/**
	 * Returns the meta object for class '{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Consolidado <em>Consolidado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Consolidado</em>'.
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Consolidado
	 * @generated
	 */
	EClass getConsolidado();

	/**
	 * Returns the meta object for the attribute '{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Consolidado#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Consolidado#getID()
	 * @see #getConsolidado()
	 * @generated
	 */
	EAttribute getConsolidado_ID();

	/**
	 * Returns the meta object for the attribute '{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Consolidado#getRUTA_DESPACHO <em>RUTA DESPACHO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>RUTA DESPACHO</em>'.
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Consolidado#getRUTA_DESPACHO()
	 * @see #getConsolidado()
	 * @generated
	 */
	EAttribute getConsolidado_RUTA_DESPACHO();

	/**
	 * Returns the meta object for the attribute '{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Consolidado#getHORA_DESPACHO <em>HORA DESPACHO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>HORA DESPACHO</em>'.
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Consolidado#getHORA_DESPACHO()
	 * @see #getConsolidado()
	 * @generated
	 */
	EAttribute getConsolidado_HORA_DESPACHO();

	/**
	 * Returns the meta object for the attribute '{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Consolidado#getREGISTRO_CONSOLIDADO <em>REGISTRO CONSOLIDADO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>REGISTRO CONSOLIDADO</em>'.
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Consolidado#getREGISTRO_CONSOLIDADO()
	 * @see #getConsolidado()
	 * @generated
	 */
	EAttribute getConsolidado_REGISTRO_CONSOLIDADO();

	/**
	 * Returns the meta object for the attribute '{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Consolidado#getTOTAL_RECAUDO_BRUTO <em>TOTAL RECAUDO BRUTO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>TOTAL RECAUDO BRUTO</em>'.
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Consolidado#getTOTAL_RECAUDO_BRUTO()
	 * @see #getConsolidado()
	 * @generated
	 */
	EAttribute getConsolidado_TOTAL_RECAUDO_BRUTO();

	/**
	 * Returns the meta object for the attribute '{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Consolidado#getTOTAL_RECAUDO_DESPACHO <em>TOTAL RECAUDO DESPACHO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>TOTAL RECAUDO DESPACHO</em>'.
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Consolidado#getTOTAL_RECAUDO_DESPACHO()
	 * @see #getConsolidado()
	 * @generated
	 */
	EAttribute getConsolidado_TOTAL_RECAUDO_DESPACHO();

	/**
	 * Returns the meta object for the attribute '{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Consolidado#getESTADO_CONSOLIDADO <em>ESTADO CONSOLIDADO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ESTADO CONSOLIDADO</em>'.
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Consolidado#getESTADO_CONSOLIDADO()
	 * @see #getConsolidado()
	 * @generated
	 */
	EAttribute getConsolidado_ESTADO_CONSOLIDADO();

	/**
	 * Returns the meta object for the attribute '{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Consolidado#getESTADO_IMPRESION <em>ESTADO IMPRESION</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ESTADO IMPRESION</em>'.
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Consolidado#getESTADO_IMPRESION()
	 * @see #getConsolidado()
	 * @generated
	 */
	EAttribute getConsolidado_ESTADO_IMPRESION();

	/**
	 * Returns the meta object for class '{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Propietario <em>Propietario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Propietario</em>'.
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Propietario
	 * @generated
	 */
	EClass getPropietario();

	/**
	 * Returns the meta object for the attribute '{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Propietario#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Propietario#getID()
	 * @see #getPropietario()
	 * @generated
	 */
	EAttribute getPropietario_ID();

	/**
	 * Returns the meta object for the attribute '{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Propietario#getNOMBRE <em>NOMBRE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>NOMBRE</em>'.
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Propietario#getNOMBRE()
	 * @see #getPropietario()
	 * @generated
	 */
	EAttribute getPropietario_NOMBRE();

	/**
	 * Returns the meta object for the attribute '{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Propietario#getCEDULA <em>CEDULA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>CEDULA</em>'.
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Propietario#getCEDULA()
	 * @see #getPropietario()
	 * @generated
	 */
	EAttribute getPropietario_CEDULA();

	/**
	 * Returns the meta object for class '{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Planilla <em>Planilla</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Planilla</em>'.
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Planilla
	 * @generated
	 */
	EClass getPlanilla();

	/**
	 * Returns the meta object for the attribute '{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Planilla#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Planilla#getID()
	 * @see #getPlanilla()
	 * @generated
	 */
	EAttribute getPlanilla_ID();

	/**
	 * Returns the meta object for the attribute '{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Planilla#getNUMERO_MOVIL <em>NUMERO MOVIL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>NUMERO MOVIL</em>'.
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Planilla#getNUMERO_MOVIL()
	 * @see #getPlanilla()
	 * @generated
	 */
	EAttribute getPlanilla_NUMERO_MOVIL();

	/**
	 * Returns the meta object for the attribute '{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Planilla#getFECHA <em>FECHA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>FECHA</em>'.
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Planilla#getFECHA()
	 * @see #getPlanilla()
	 * @generated
	 */
	EAttribute getPlanilla_FECHA();

	/**
	 * Returns the meta object for the attribute '{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Planilla#getCEDULA_CONDUCTOR <em>CEDULA CONDUCTOR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>CEDULA CONDUCTOR</em>'.
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Planilla#getCEDULA_CONDUCTOR()
	 * @see #getPlanilla()
	 * @generated
	 */
	EAttribute getPlanilla_CEDULA_CONDUCTOR();

	/**
	 * Returns the meta object for the attribute '{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Planilla#getCONDUCTOR <em>CONDUCTOR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>CONDUCTOR</em>'.
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Planilla#getCONDUCTOR()
	 * @see #getPlanilla()
	 * @generated
	 */
	EAttribute getPlanilla_CONDUCTOR();

	/**
	 * Returns the meta object for the attribute '{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Planilla#getTOTAL <em>TOTAL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>TOTAL</em>'.
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Planilla#getTOTAL()
	 * @see #getPlanilla()
	 * @generated
	 */
	EAttribute getPlanilla_TOTAL();

	/**
	 * Returns the meta object for the attribute '{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Planilla#getTOTAL_RECAUDO_BRUTO <em>TOTAL RECAUDO BRUTO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>TOTAL RECAUDO BRUTO</em>'.
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Planilla#getTOTAL_RECAUDO_BRUTO()
	 * @see #getPlanilla()
	 * @generated
	 */
	EAttribute getPlanilla_TOTAL_RECAUDO_BRUTO();

	/**
	 * Returns the meta object for the attribute '{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Planilla#getTOTAL_RECAUDO_NETO <em>TOTAL RECAUDO NETO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>TOTAL RECAUDO NETO</em>'.
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Planilla#getTOTAL_RECAUDO_NETO()
	 * @see #getPlanilla()
	 * @generated
	 */
	EAttribute getPlanilla_TOTAL_RECAUDO_NETO();

	/**
	 * Returns the meta object for the attribute '{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Planilla#getTOTAL_DEPOSITO <em>TOTAL DEPOSITO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>TOTAL DEPOSITO</em>'.
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Planilla#getTOTAL_DEPOSITO()
	 * @see #getPlanilla()
	 * @generated
	 */
	EAttribute getPlanilla_TOTAL_DEPOSITO();

	/**
	 * Returns the meta object for the attribute '{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Planilla#getTOTAL_GASTOS <em>TOTAL GASTOS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>TOTAL GASTOS</em>'.
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Planilla#getTOTAL_GASTOS()
	 * @see #getPlanilla()
	 * @generated
	 */
	EAttribute getPlanilla_TOTAL_GASTOS();

	/**
	 * Returns the meta object for the attribute '{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Planilla#getLIQUIDADO <em>LIQUIDADO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LIQUIDADO</em>'.
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Planilla#getLIQUIDADO()
	 * @see #getPlanilla()
	 * @generated
	 */
	EAttribute getPlanilla_LIQUIDADO();

	/**
	 * Returns the meta object for the attribute '{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Planilla#getUSUARIO <em>USUARIO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>USUARIO</em>'.
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Planilla#getUSUARIO()
	 * @see #getPlanilla()
	 * @generated
	 */
	EAttribute getPlanilla_USUARIO();

	/**
	 * Returns the meta object for the attribute '{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Planilla#getNOMBRE_PERSONA <em>NOMBRE PERSONA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>NOMBRE PERSONA</em>'.
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Planilla#getNOMBRE_PERSONA()
	 * @see #getPlanilla()
	 * @generated
	 */
	EAttribute getPlanilla_NOMBRE_PERSONA();

	/**
	 * Returns the meta object for the attribute '{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Planilla#getAPELLIDO <em>APELLIDO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>APELLIDO</em>'.
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Planilla#getAPELLIDO()
	 * @see #getPlanilla()
	 * @generated
	 */
	EAttribute getPlanilla_APELLIDO();

	/**
	 * Returns the meta object for the attribute '{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Planilla#getCEDULA <em>CEDULA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>CEDULA</em>'.
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Planilla#getCEDULA()
	 * @see #getPlanilla()
	 * @generated
	 */
	EAttribute getPlanilla_CEDULA();

	/**
	 * Returns the meta object for the attribute '{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Planilla#getHORA_MODIFICACION <em>HORA MODIFICACION</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>HORA MODIFICACION</em>'.
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Planilla#getHORA_MODIFICACION()
	 * @see #getPlanilla()
	 * @generated
	 */
	EAttribute getPlanilla_HORA_MODIFICACION();

	/**
	 * Returns the meta object for class '{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.NewClass <em>New Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>New Class</em>'.
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.NewClass
	 * @generated
	 */
	EClass getNewClass();

	/**
	 * Returns the meta object for class '{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Detallado <em>Detallado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Detallado</em>'.
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Detallado
	 * @generated
	 */
	EClass getDetallado();

	/**
	 * Returns the meta object for the attribute '{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Detallado#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Detallado#getID()
	 * @see #getDetallado()
	 * @generated
	 */
	EAttribute getDetallado_ID();

	/**
	 * Returns the meta object for the attribute '{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Detallado#getNOMBRE <em>NOMBRE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>NOMBRE</em>'.
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Detallado#getNOMBRE()
	 * @see #getDetallado()
	 * @generated
	 */
	EAttribute getDetallado_NOMBRE();

	/**
	 * Returns the meta object for the attribute '{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Detallado#getREGISTRO <em>REGISTRO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>REGISTRO</em>'.
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Detallado#getREGISTRO()
	 * @see #getDetallado()
	 * @generated
	 */
	EAttribute getDetallado_REGISTRO();

	/**
	 * Returns the meta object for the attribute '{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Detallado#getTOTAL_RECAUDO_TARIFA <em>TOTAL RECAUDO TARIFA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>TOTAL RECAUDO TARIFA</em>'.
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Detallado#getTOTAL_RECAUDO_TARIFA()
	 * @see #getDetallado()
	 * @generated
	 */
	EAttribute getDetallado_TOTAL_RECAUDO_TARIFA();

	/**
	 * Returns the meta object for the attribute '{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Detallado#getREGISTRO_RECAUDO <em>REGISTRO RECAUDO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>REGISTRO RECAUDO</em>'.
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Detallado#getREGISTRO_RECAUDO()
	 * @see #getDetallado()
	 * @generated
	 */
	EAttribute getDetallado_REGISTRO_RECAUDO();

	/**
	 * Returns the meta object for the attribute '{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Detallado#getCOSTO_TARIFA <em>COSTO TARIFA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>COSTO TARIFA</em>'.
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Detallado#getCOSTO_TARIFA()
	 * @see #getDetallado()
	 * @generated
	 */
	EAttribute getDetallado_COSTO_TARIFA();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ResultcotracirFactory getResultcotracirFactory();

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
		 * The meta object literal for the '{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.impl.TransaccionImpl <em>Transaccion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.impl.TransaccionImpl
		 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.impl.ResultcotracirPackageImpl#getTransaccion()
		 * @generated
		 */
		EClass TRANSACCION = eINSTANCE.getTransaccion();

		/**
		 * The meta object literal for the '<em><b>ESTADO TRANSACCION</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSACCION__ESTADO_TRANSACCION = eINSTANCE.getTransaccion_ESTADO_TRANSACCION();

		/**
		 * The meta object literal for the '<em><b>HORA</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSACCION__HORA = eINSTANCE.getTransaccion_HORA();

		/**
		 * The meta object literal for the '<em><b>TIPO</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSACCION__TIPO = eINSTANCE.getTransaccion_TIPO();

		/**
		 * The meta object literal for the '<em><b>DESCRIPCION</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSACCION__DESCRIPCION = eINSTANCE.getTransaccion_DESCRIPCION();

		/**
		 * The meta object literal for the '<em><b>CATEGORIA</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSACCION__CATEGORIA = eINSTANCE.getTransaccion_CATEGORIA();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSACCION__ID = eINSTANCE.getTransaccion_ID();

		/**
		 * The meta object literal for the '<em><b>VALOR</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSACCION__VALOR = eINSTANCE.getTransaccion_VALOR();

		/**
		 * The meta object literal for the '{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.impl.TramaImpl <em>Trama</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.impl.TramaImpl
		 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.impl.ResultcotracirPackageImpl#getTrama()
		 * @generated
		 */
		EClass TRAMA = eINSTANCE.getTrama();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAMA__ID = eINSTANCE.getTrama_ID();

		/**
		 * The meta object literal for the '<em><b>CADENA TRAMA</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAMA__CADENA_TRAMA = eINSTANCE.getTrama_CADENA_TRAMA();

		/**
		 * The meta object literal for the '{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.impl.ConsolidadoImpl <em>Consolidado</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.impl.ConsolidadoImpl
		 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.impl.ResultcotracirPackageImpl#getConsolidado()
		 * @generated
		 */
		EClass CONSOLIDADO = eINSTANCE.getConsolidado();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSOLIDADO__ID = eINSTANCE.getConsolidado_ID();

		/**
		 * The meta object literal for the '<em><b>RUTA DESPACHO</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSOLIDADO__RUTA_DESPACHO = eINSTANCE.getConsolidado_RUTA_DESPACHO();

		/**
		 * The meta object literal for the '<em><b>HORA DESPACHO</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSOLIDADO__HORA_DESPACHO = eINSTANCE.getConsolidado_HORA_DESPACHO();

		/**
		 * The meta object literal for the '<em><b>REGISTRO CONSOLIDADO</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSOLIDADO__REGISTRO_CONSOLIDADO = eINSTANCE.getConsolidado_REGISTRO_CONSOLIDADO();

		/**
		 * The meta object literal for the '<em><b>TOTAL RECAUDO BRUTO</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSOLIDADO__TOTAL_RECAUDO_BRUTO = eINSTANCE.getConsolidado_TOTAL_RECAUDO_BRUTO();

		/**
		 * The meta object literal for the '<em><b>TOTAL RECAUDO DESPACHO</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSOLIDADO__TOTAL_RECAUDO_DESPACHO = eINSTANCE.getConsolidado_TOTAL_RECAUDO_DESPACHO();

		/**
		 * The meta object literal for the '<em><b>ESTADO CONSOLIDADO</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSOLIDADO__ESTADO_CONSOLIDADO = eINSTANCE.getConsolidado_ESTADO_CONSOLIDADO();

		/**
		 * The meta object literal for the '<em><b>ESTADO IMPRESION</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSOLIDADO__ESTADO_IMPRESION = eINSTANCE.getConsolidado_ESTADO_IMPRESION();

		/**
		 * The meta object literal for the '{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.impl.PropietarioImpl <em>Propietario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.impl.PropietarioImpl
		 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.impl.ResultcotracirPackageImpl#getPropietario()
		 * @generated
		 */
		EClass PROPIETARIO = eINSTANCE.getPropietario();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPIETARIO__ID = eINSTANCE.getPropietario_ID();

		/**
		 * The meta object literal for the '<em><b>NOMBRE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPIETARIO__NOMBRE = eINSTANCE.getPropietario_NOMBRE();

		/**
		 * The meta object literal for the '<em><b>CEDULA</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPIETARIO__CEDULA = eINSTANCE.getPropietario_CEDULA();

		/**
		 * The meta object literal for the '{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.impl.PlanillaImpl <em>Planilla</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.impl.PlanillaImpl
		 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.impl.ResultcotracirPackageImpl#getPlanilla()
		 * @generated
		 */
		EClass PLANILLA = eINSTANCE.getPlanilla();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLANILLA__ID = eINSTANCE.getPlanilla_ID();

		/**
		 * The meta object literal for the '<em><b>NUMERO MOVIL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLANILLA__NUMERO_MOVIL = eINSTANCE.getPlanilla_NUMERO_MOVIL();

		/**
		 * The meta object literal for the '<em><b>FECHA</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLANILLA__FECHA = eINSTANCE.getPlanilla_FECHA();

		/**
		 * The meta object literal for the '<em><b>CEDULA CONDUCTOR</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLANILLA__CEDULA_CONDUCTOR = eINSTANCE.getPlanilla_CEDULA_CONDUCTOR();

		/**
		 * The meta object literal for the '<em><b>CONDUCTOR</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLANILLA__CONDUCTOR = eINSTANCE.getPlanilla_CONDUCTOR();

		/**
		 * The meta object literal for the '<em><b>TOTAL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLANILLA__TOTAL = eINSTANCE.getPlanilla_TOTAL();

		/**
		 * The meta object literal for the '<em><b>TOTAL RECAUDO BRUTO</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLANILLA__TOTAL_RECAUDO_BRUTO = eINSTANCE.getPlanilla_TOTAL_RECAUDO_BRUTO();

		/**
		 * The meta object literal for the '<em><b>TOTAL RECAUDO NETO</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLANILLA__TOTAL_RECAUDO_NETO = eINSTANCE.getPlanilla_TOTAL_RECAUDO_NETO();

		/**
		 * The meta object literal for the '<em><b>TOTAL DEPOSITO</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLANILLA__TOTAL_DEPOSITO = eINSTANCE.getPlanilla_TOTAL_DEPOSITO();

		/**
		 * The meta object literal for the '<em><b>TOTAL GASTOS</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLANILLA__TOTAL_GASTOS = eINSTANCE.getPlanilla_TOTAL_GASTOS();

		/**
		 * The meta object literal for the '<em><b>LIQUIDADO</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLANILLA__LIQUIDADO = eINSTANCE.getPlanilla_LIQUIDADO();

		/**
		 * The meta object literal for the '<em><b>USUARIO</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLANILLA__USUARIO = eINSTANCE.getPlanilla_USUARIO();

		/**
		 * The meta object literal for the '<em><b>NOMBRE PERSONA</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLANILLA__NOMBRE_PERSONA = eINSTANCE.getPlanilla_NOMBRE_PERSONA();

		/**
		 * The meta object literal for the '<em><b>APELLIDO</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLANILLA__APELLIDO = eINSTANCE.getPlanilla_APELLIDO();

		/**
		 * The meta object literal for the '<em><b>CEDULA</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLANILLA__CEDULA = eINSTANCE.getPlanilla_CEDULA();

		/**
		 * The meta object literal for the '<em><b>HORA MODIFICACION</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLANILLA__HORA_MODIFICACION = eINSTANCE.getPlanilla_HORA_MODIFICACION();

		/**
		 * The meta object literal for the '{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.impl.NewClassImpl <em>New Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.impl.NewClassImpl
		 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.impl.ResultcotracirPackageImpl#getNewClass()
		 * @generated
		 */
		EClass NEW_CLASS = eINSTANCE.getNewClass();

		/**
		 * The meta object literal for the '{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.impl.DetalladoImpl <em>Detallado</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.impl.DetalladoImpl
		 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.impl.ResultcotracirPackageImpl#getDetallado()
		 * @generated
		 */
		EClass DETALLADO = eINSTANCE.getDetallado();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DETALLADO__ID = eINSTANCE.getDetallado_ID();

		/**
		 * The meta object literal for the '<em><b>NOMBRE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DETALLADO__NOMBRE = eINSTANCE.getDetallado_NOMBRE();

		/**
		 * The meta object literal for the '<em><b>REGISTRO</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DETALLADO__REGISTRO = eINSTANCE.getDetallado_REGISTRO();

		/**
		 * The meta object literal for the '<em><b>TOTAL RECAUDO TARIFA</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DETALLADO__TOTAL_RECAUDO_TARIFA = eINSTANCE.getDetallado_TOTAL_RECAUDO_TARIFA();

		/**
		 * The meta object literal for the '<em><b>REGISTRO RECAUDO</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DETALLADO__REGISTRO_RECAUDO = eINSTANCE.getDetallado_REGISTRO_RECAUDO();

		/**
		 * The meta object literal for the '<em><b>COSTO TARIFA</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DETALLADO__COSTO_TARIFA = eINSTANCE.getDetallado_COSTO_TARIFA();

	}

} //ResultcotracirPackage
