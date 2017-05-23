/**
 */
package gestionmodelosconsultas.modeloconsultas.cotracir.tests;

import gestionmodelosconsultas.modeloconsultas.cotracir.CotracirFactory;
import gestionmodelosconsultas.modeloconsultas.cotracir.Detallado;

import gestionmodelosconsultas.modeloconsultas.model.tests.ElementoConsultaTest;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Detallado</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DetalladoTest extends ElementoConsultaTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DetalladoTest.class);
	}

	/**
	 * Constructs a new Detallado test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DetalladoTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Detallado test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Detallado getFixture() {
		return (Detallado)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CotracirFactory.eINSTANCE.createDetallado());
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

} //DetalladoTest
