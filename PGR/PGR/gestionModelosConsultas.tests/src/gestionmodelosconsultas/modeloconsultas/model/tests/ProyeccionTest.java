/**
 */
package gestionmodelosconsultas.modeloconsultas.model.tests;

import gestionmodelosconsultas.modeloconsultas.model.ModelFactory;
import gestionmodelosconsultas.modeloconsultas.model.Proyeccion;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Proyeccion</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProyeccionTest extends EADiagramTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ProyeccionTest.class);
	}

	/**
	 * Constructs a new Proyeccion test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProyeccionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Proyeccion test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Proyeccion getFixture() {
		return (Proyeccion)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ModelFactory.eINSTANCE.createProyeccion());
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

} //ProyeccionTest
