/**
 */
package gestionmodelosconsultas.modeloconsultas.cotracir.util;

import gestionmodelosconsultas.modeloconsultas.cotracir.*;

import gestionmodelosconsultas.modeloconsultas.model.ElementoConsulta;
import gestionmodelosconsultas.modeloconsultas.model.ElementoModelo;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see gestionmodelosconsultas.modeloconsultas.cotracir.CotracirPackage
 * @generated
 */
public class CotracirAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CotracirPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CotracirAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CotracirPackage.eINSTANCE;
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
	protected CotracirSwitch<Adapter> modelSwitch =
		new CotracirSwitch<Adapter>() {
			@Override
			public Adapter casePlanilla(Planilla object) {
				return createPlanillaAdapter();
			}
			@Override
			public Adapter caseConsolidado(Consolidado object) {
				return createConsolidadoAdapter();
			}
			@Override
			public Adapter caseTransaccion(Transaccion object) {
				return createTransaccionAdapter();
			}
			@Override
			public Adapter caseTrama(Trama object) {
				return createTramaAdapter();
			}
			@Override
			public Adapter casePropietario(Propietario object) {
				return createPropietarioAdapter();
			}
			@Override
			public Adapter caseDetallado(Detallado object) {
				return createDetalladoAdapter();
			}
			@Override
			public Adapter caseElementoModelo(ElementoModelo object) {
				return createElementoModeloAdapter();
			}
			@Override
			public Adapter caseElementoConsulta(ElementoConsulta object) {
				return createElementoConsultaAdapter();
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
	 * Creates a new adapter for an object of class '{@link gestionmodelosconsultas.modeloconsultas.cotracir.Planilla <em>Planilla</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gestionmodelosconsultas.modeloconsultas.cotracir.Planilla
	 * @generated
	 */
	public Adapter createPlanillaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gestionmodelosconsultas.modeloconsultas.cotracir.Consolidado <em>Consolidado</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gestionmodelosconsultas.modeloconsultas.cotracir.Consolidado
	 * @generated
	 */
	public Adapter createConsolidadoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gestionmodelosconsultas.modeloconsultas.cotracir.Transaccion <em>Transaccion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gestionmodelosconsultas.modeloconsultas.cotracir.Transaccion
	 * @generated
	 */
	public Adapter createTransaccionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gestionmodelosconsultas.modeloconsultas.cotracir.Trama <em>Trama</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gestionmodelosconsultas.modeloconsultas.cotracir.Trama
	 * @generated
	 */
	public Adapter createTramaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gestionmodelosconsultas.modeloconsultas.cotracir.Propietario <em>Propietario</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gestionmodelosconsultas.modeloconsultas.cotracir.Propietario
	 * @generated
	 */
	public Adapter createPropietarioAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gestionmodelosconsultas.modeloconsultas.cotracir.Detallado <em>Detallado</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gestionmodelosconsultas.modeloconsultas.cotracir.Detallado
	 * @generated
	 */
	public Adapter createDetalladoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gestionmodelosconsultas.modeloconsultas.model.ElementoModelo <em>Elemento Modelo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gestionmodelosconsultas.modeloconsultas.model.ElementoModelo
	 * @generated
	 */
	public Adapter createElementoModeloAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gestionmodelosconsultas.modeloconsultas.model.ElementoConsulta <em>Elemento Consulta</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gestionmodelosconsultas.modeloconsultas.model.ElementoConsulta
	 * @generated
	 */
	public Adapter createElementoConsultaAdapter() {
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

} //CotracirAdapterFactory
