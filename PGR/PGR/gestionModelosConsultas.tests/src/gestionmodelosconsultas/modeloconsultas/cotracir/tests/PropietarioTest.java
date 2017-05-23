/**
 */
package gestionmodelosconsultas.modeloconsultas.cotracir.tests;

import gestionmodelosconsultas.modeloconsultas.cotracir.CotracirFactory;
import gestionmodelosconsultas.modeloconsultas.cotracir.Propietario;

import gestionmodelosconsultas.modeloconsultas.model.tests.ElementoConsultaTest;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Propietario</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PropietarioTest extends ElementoConsultaTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PropietarioTest.class);
	}

	/**
	 * Constructs a new Propietario test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropietarioTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Propietario test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Propietario getFixture() {
		return (Propietario)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CotracirFactory.eINSTANCE.createPropietario());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //PropietarioTest
