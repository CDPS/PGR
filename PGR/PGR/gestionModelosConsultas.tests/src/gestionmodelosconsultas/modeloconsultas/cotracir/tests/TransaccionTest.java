/**
 */
package gestionmodelosconsultas.modeloconsultas.cotracir.tests;

import gestionmodelosconsultas.modeloconsultas.cotracir.CotracirFactory;
import gestionmodelosconsultas.modeloconsultas.cotracir.Transaccion;

import gestionmodelosconsultas.modeloconsultas.model.tests.ElementoConsultaTest;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Transaccion</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TransaccionTest extends ElementoConsultaTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TransaccionTest.class);
	}

	/**
	 * Constructs a new Transaccion test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransaccionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Transaccion test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Transaccion getFixture() {
		return (Transaccion)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CotracirFactory.eINSTANCE.createTransaccion());
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

} //TransaccionTest
