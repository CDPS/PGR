/**
 */
package gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.util;

import gestionmodelosconsultas.modeloconsultas.resultset.ElementoModeloResultado;
import gestionmodelosconsultas.modeloconsultas.resultset.ResultElement;

import gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.*;

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
 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.ResultcotracirPackage
 * @generated
 */
public class ResultcotracirSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ResultcotracirPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultcotracirSwitch() {
		if (modelPackage == null) {
			modelPackage = ResultcotracirPackage.eINSTANCE;
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
			case ResultcotracirPackage.TRANSACCION: {
				Transaccion transaccion = (Transaccion)theEObject;
				T result = caseTransaccion(transaccion);
				if (result == null) result = caseElementoModeloResultado(transaccion);
				if (result == null) result = caseResultElement(transaccion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResultcotracirPackage.TRAMA: {
				Trama trama = (Trama)theEObject;
				T result = caseTrama(trama);
				if (result == null) result = caseElementoModeloResultado(trama);
				if (result == null) result = caseResultElement(trama);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResultcotracirPackage.CONSOLIDADO: {
				Consolidado consolidado = (Consolidado)theEObject;
				T result = caseConsolidado(consolidado);
				if (result == null) result = caseElementoModeloResultado(consolidado);
				if (result == null) result = caseResultElement(consolidado);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResultcotracirPackage.PROPIETARIO: {
				Propietario propietario = (Propietario)theEObject;
				T result = casePropietario(propietario);
				if (result == null) result = caseElementoModeloResultado(propietario);
				if (result == null) result = caseResultElement(propietario);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResultcotracirPackage.PLANILLA: {
				Planilla planilla = (Planilla)theEObject;
				T result = casePlanilla(planilla);
				if (result == null) result = caseElementoModeloResultado(planilla);
				if (result == null) result = caseResultElement(planilla);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResultcotracirPackage.NEW_CLASS: {
				NewClass newClass = (NewClass)theEObject;
				T result = caseNewClass(newClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResultcotracirPackage.DETALLADO: {
				Detallado detallado = (Detallado)theEObject;
				T result = caseDetallado(detallado);
				if (result == null) result = caseElementoModeloResultado(detallado);
				if (result == null) result = caseResultElement(detallado);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
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
	 * Returns the result of interpreting the object as an instance of '<em>New Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>New Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNewClass(NewClass object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Result Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Result Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResultElement(ResultElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Elemento Modelo Resultado</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Elemento Modelo Resultado</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementoModeloResultado(ElementoModeloResultado object) {
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

} //ResultcotracirSwitch
