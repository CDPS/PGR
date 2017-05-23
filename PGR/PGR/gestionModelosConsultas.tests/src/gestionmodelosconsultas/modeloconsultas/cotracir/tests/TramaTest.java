/**
 */
package gestionmodelosconsultas.modeloconsultas.cotracir.tests;

import gestionmodelosconsultas.modeloconsultas.cotracir.CotracirFactory;
import gestionmodelosconsultas.modeloconsultas.cotracir.Trama;

import gestionmodelosconsultas.modeloconsultas.model.tests.ElementoConsultaTest;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Trama</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TramaTest extends ElementoConsultaTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TramaTest.class);
	}

	/**
	 * Constructs a new Trama test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TramaTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Trama test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Trama getFixture() {
		return (Trama)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CotracirFactory.eINSTANCE.createTrama());
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

} //TramaTest
