/**
 */
package gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.util;

import gestionmodelosconsultas.modeloconsultas.resultset.ElementoModeloResultado;
import gestionmodelosconsultas.modeloconsultas.resultset.ResultElement;

import gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.ResultcotracirPackage
 * @generated
 */
public class ResultcotracirAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ResultcotracirPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultcotracirAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ResultcotracirPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResultcotracirSwitch<Adapter> modelSwitch =
		new ResultcotracirSwitch<Adapter>() {
			@Override
			public Adapter caseTransaccion(Transaccion object) {
				return createTransaccionAdapter();
			}
			@Override
			public Adapter caseTrama(Trama object) {
				return createTramaAdapter();
			}
			@Override
			public Adapter caseConsolidado(Consolidado object) {
				return createConsolidadoAdapter();
			}
			@Override
			public Adapter casePropietario(Propietario object) {
				return createPropietarioAdapter();
			}
			@Override
			public Adapter casePlanilla(Planilla object) {
				return createPlanillaAdapter();
			}
			@Override
			public Adapter caseNewClass(NewClass object) {
				return createNewClassAdapter();
			}
			@Override
			public Adapter caseDetallado(Detallado object) {
				return createDetalladoAdapter();
			}
			@Override
			public Adapter caseResultElement(ResultElement object) {
				return createResultElementAdapter();
			}
			@Override
			public Adapter caseElementoModeloResultado(ElementoModeloResultado object) {
				return createElementoModeloResultadoAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Transaccion <em>Transaccion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Transaccion
	 * @generated
	 */
	public Adapter createTransaccionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Trama <em>Trama</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Trama
	 * @generated
	 */
	public Adapter createTramaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Consolidado <em>Consolidado</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Consolidado
	 * @generated
	 */
	public Adapter createConsolidadoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Propietario <em>Propietario</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Propietario
	 * @generated
	 */
	public Adapter createPropietarioAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Planilla <em>Planilla</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Planilla
	 * @generated
	 */
	public Adapter createPlanillaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.NewClass <em>New Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.NewClass
	 * @generated
	 */
	public Adapter createNewClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Detallado <em>Detallado</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Detallado
	 * @generated
	 */
	public Adapter createDetalladoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gestionmodelosconsultas.modeloconsultas.resultset.ResultElement <em>Result Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.ResultElement
	 * @generated
	 */
	public Adapter createResultElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gestionmodelosconsultas.modeloconsultas.resultset.ElementoModeloResultado <em>Elemento Modelo Resultado</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.ElementoModeloResultado
	 * @generated
	 */
	public Adapter createElementoModeloResultadoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ResultcotracirAdapterFactory
