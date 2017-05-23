/**
 */
package gestionmodelosconsultas.modeloconsultas.cotracir;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see gestionmodelosconsultas.modeloconsultas.cotracir.CotracirPackage
 * @generated
 */
public interface CotracirFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CotracirFactory eINSTANCE = gestionmodelosconsultas.modeloconsultas.cotracir.impl.CotracirFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Planilla</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Planilla</em>'.
	 * @generated
	 */
	Planilla createPlanilla();

	/**
	 * Returns a new object of class '<em>Consolidado</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Consolidado</em>'.
	 * @generated
	 */
	Consolidado createConsolidado();

	/**
	 * Returns a new object of class '<em>Transaccion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transaccion</em>'.
	 * @generated
	 */
	Transaccion createTransaccion();

	/**
	 * Returns a new object of class '<em>Trama</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trama</em>'.
	 * @generated
	 */
	Trama createTrama();

	/**
	 * Returns a new object of class '<em>Propietario</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Propietario</em>'.
	 * @generated
	 */
	Propietario createPropietario();

	/**
	 * Returns a new object of class '<em>Detallado</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Detallado</em>'.
	 * @generated
	 */
	Detallado createDetallado();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CotracirPackage getCotracirPackage();

} //CotracirFactory
