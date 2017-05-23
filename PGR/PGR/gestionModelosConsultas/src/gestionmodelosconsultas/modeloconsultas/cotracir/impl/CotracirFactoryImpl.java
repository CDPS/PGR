/**
 */
package gestionmodelosconsultas.modeloconsultas.cotracir.impl;

import gestionmodelosconsultas.modeloconsultas.cotracir.*;

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
public class CotracirFactoryImpl extends EFactoryImpl implements CotracirFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CotracirFactory init() {
		try {
			CotracirFactory theCotracirFactory = (CotracirFactory)EPackage.Registry.INSTANCE.getEFactory(CotracirPackage.eNS_URI);
			if (theCotracirFactory != null) {
				return theCotracirFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CotracirFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CotracirFactoryImpl() {
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
			case CotracirPackage.PLANILLA: return createPlanilla();
			case CotracirPackage.CONSOLIDADO: return createConsolidado();
			case CotracirPackage.TRANSACCION: return createTransaccion();
			case CotracirPackage.TRAMA: return createTrama();
			case CotracirPackage.PROPIETARIO: return createPropietario();
			case CotracirPackage.DETALLADO: return createDetallado();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
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
	public Consolidado createConsolidado() {
		ConsolidadoImpl consolidado = new ConsolidadoImpl();
		return consolidado;
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
	public Propietario createPropietario() {
		PropietarioImpl propietario = new PropietarioImpl();
		return propietario;
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
	public CotracirPackage getCotracirPackage() {
		return (CotracirPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CotracirPackage getPackage() {
		return CotracirPackage.eINSTANCE;
	}

} //CotracirFactoryImpl
