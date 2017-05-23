/**
 */
package gestionmodelosconsultas.modeloconsultas.cotracir.util;

import gestionmodelosconsultas.modeloconsultas.cotracir.*;

import gestionmodelosconsultas.modeloconsultas.model.ElementoConsulta;
import gestionmodelosconsultas.modeloconsultas.model.ElementoModelo;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see gestionmodelosconsultas.modeloconsultas.cotracir.CotracirPackage
 * @generated
 */
public class CotracirSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CotracirPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CotracirSwitch() {
		if (modelPackage == null) {
			modelPackage = CotracirPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case CotracirPackage.PLANILLA: {
				Planilla planilla = (Planilla)theEObject;
				T result = casePlanilla(planilla);
				if (result == null) result = caseElementoConsulta(planilla);
				if (result == null) result = caseElementoModelo(planilla);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CotracirPackage.CONSOLIDADO: {
				Consolidado consolidado = (Consolidado)theEObject;
				T result = caseConsolidado(consolidado);
				if (result == null) result = caseElementoConsulta(consolidado);
				if (result == null) result = caseElementoModelo(consolidado);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CotracirPackage.TRANSACCION: {
				Transaccion transaccion = (Transaccion)theEObject;
				T result = caseTransaccion(transaccion);
				if (result == null) result = caseElementoConsulta(transaccion);
				if (result == null) result = caseElementoModelo(transaccion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CotracirPackage.TRAMA: {
				Trama trama = (Trama)theEObject;
				T result = caseTrama(trama);
				if (result == null) result = caseElementoConsulta(trama);
				if (result == null) result = caseElementoModelo(trama);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CotracirPackage.PROPIETARIO: {
				Propietario propietario = (Propietario)theEObject;
				T result = casePropietario(propietario);
				if (result == null) result = caseElementoConsulta(propietario);
				if (result == null) result = caseElementoModelo(propietario);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CotracirPackage.DETALLADO: {
				Detallado detallado = (Detallado)theEObject;
				T result = caseDetallado(detallado);
				if (result == null) result = caseElementoConsulta(detallado);
				if (result == null) result = caseElementoModelo(detallado);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Planilla</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Planilla</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlanilla(Planilla object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Consolidado</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Consolidado</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConsolidado(Consolidado object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transaccion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transaccion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransaccion(Transaccion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trama</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trama</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrama(Trama object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Propietario</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Propietario</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropietario(Propietario object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Detallado</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Detallado</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDetallado(Detallado object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Elemento Modelo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Elemento Modelo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementoModelo(ElementoModelo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Elemento Consulta</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Elemento Consulta</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementoConsulta(ElementoConsulta object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //CotracirSwitch
