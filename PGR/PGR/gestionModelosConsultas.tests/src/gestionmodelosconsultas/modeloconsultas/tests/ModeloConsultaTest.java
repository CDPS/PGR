/**
 */
package gestionmodelosconsultas.modeloconsultas.tests;

import gestionmodelosconsultas.modeloconsultas.ModeloConsulta;
import gestionmodelosconsultas.modeloconsultas.ModeloconsultasFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Modelo Consulta</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModeloConsultaTest extends TestCase {

	/**
	 * The fixture for this Modelo Consulta test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModeloConsulta fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ModeloConsultaTest.class);
	}

	/**
	 * Constructs a new Modelo Consulta test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeloConsultaTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Modelo Consulta test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ModeloConsulta fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Modelo Consulta test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModeloConsulta getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ModeloconsultasFactory.eINSTANCE.createModeloConsulta());
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

} //ModeloConsultaTest
