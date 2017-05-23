/**
 */
package gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.tests;

import gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Consolidado;
import gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.ResultcotracirFactory;

import gestionmodelosconsultas.modeloconsultas.resultset.tests.ElementoModeloResultadoTest;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Consolidado</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConsolidadoTest extends ElementoModeloResultadoTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ConsolidadoTest.class);
	}

	/**
	 * Constructs a new Consolidado test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsolidadoTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Consolidado test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Consolidado getFixture() {
		return (Consolidado)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ResultcotracirFactory.eINSTANCE.createConsolidado());
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

} //ConsolidadoTest
