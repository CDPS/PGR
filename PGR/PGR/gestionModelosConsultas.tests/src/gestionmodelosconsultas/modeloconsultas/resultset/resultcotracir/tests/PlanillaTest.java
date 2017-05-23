/**
 */
package gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.tests;

import gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Planilla;
import gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.ResultcotracirFactory;

import gestionmodelosconsultas.modeloconsultas.resultset.tests.ElementoModeloResultadoTest;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Planilla</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PlanillaTest extends ElementoModeloResultadoTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PlanillaTest.class);
	}

	/**
	 * Constructs a new Planilla test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanillaTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Planilla test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Planilla getFixture() {
		return (Planilla)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ResultcotracirFactory.eINSTANCE.createPlanilla());
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

} //PlanillaTest
