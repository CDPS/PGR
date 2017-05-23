/**
 */
package gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.impl;

import gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ResultcotracirFactoryImpl extends EFactoryImpl implements ResultcotracirFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ResultcotracirFactory init() {
		try {
			ResultcotracirFactory theResultcotracirFactory = (ResultcotracirFactory)EPackage.Registry.INSTANCE.getEFactory(ResultcotracirPackage.eNS_URI);
			if (theResultcotracirFactory != null) {
				return theResultcotracirFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ResultcotracirFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultcotracirFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ResultcotracirPackage.TRANSACCION: return createTransaccion();
			case ResultcotracirPackage.TRAMA: return createTrama();
			case ResultcotracirPackage.CONSOLIDADO: return createConsolidado();
			case ResultcotracirPackage.PROPIETARIO: return createPropietario();
			case ResultcotracirPackage.PLANILLA: return createPlanilla();
			case ResultcotracirPackage.NEW_CLASS: return createNewClass();
			case ResultcotracirPackage.DETALLADO: return createDetallado();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transaccion createTransaccion() {
		TransaccionImpl transaccion = new TransaccionImpl();
		return transaccion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trama createTrama() {
		TramaImpl trama = new TramaImpl();
		return trama;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Consolidado createConsolidado() {
		ConsolidadoImpl consolidado = new ConsolidadoImpl();
		return consolidado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Propietario createPropietario() {
		PropietarioImpl propietario = new PropietarioImpl();
		return propietario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Planilla createPlanilla() {
		PlanillaImpl planilla = new PlanillaImpl();
		return planilla;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NewClass createNewClass() {
		NewClassImpl newClass = new NewClassImpl();
		return newClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Detallado createDetallado() {
		DetalladoImpl detallado = new DetalladoImpl();
		return detallado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultcotracirPackage getResultcotracirPackage() {
		return (ResultcotracirPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ResultcotracirPackage getPackage() {
		return ResultcotracirPackage.eINSTANCE;
	}

} //ResultcotracirFactoryImpl
