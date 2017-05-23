/**
 */
package gestionmodelosconsultas.modeloconsultas.model.tests;

import gestionmodelosconsultas.modeloconsultas.model.ModelFactory;
import gestionmodelosconsultas.modeloconsultas.model.Relacion;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Relacion</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RelacionTest extends ElementoModeloTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RelacionTest.class);
	}

	/**
	 * Constructs a new Relacion test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelacionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Relacion test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Relacion getFixture() {
		return (Relacion)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ModelFactory.eINSTANCE.createRelacion());
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

} //RelacionTest
