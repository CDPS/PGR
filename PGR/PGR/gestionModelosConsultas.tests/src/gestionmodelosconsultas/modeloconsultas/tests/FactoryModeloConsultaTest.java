/**
 */
package gestionmodelosconsultas.modeloconsultas.tests;

import gestionmodelosconsultas.modeloconsultas.FactoryModeloConsulta;
import gestionmodelosconsultas.modeloconsultas.ModeloconsultasFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Factory Modelo Consulta</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FactoryModeloConsultaTest extends TestCase {

	/**
	 * The fixture for this Factory Modelo Consulta test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FactoryModeloConsulta fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FactoryModeloConsultaTest.class);
	}

	/**
	 * Constructs a new Factory Modelo Consulta test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FactoryModeloConsultaTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Factory Modelo Consulta test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(FactoryModeloConsulta fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Factory Modelo Consulta test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FactoryModeloConsulta getFixture() {
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
		setFixture(ModeloconsultasFactory.eINSTANCE.createFactoryModeloConsulta());
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

} //FactoryModeloConsultaTest
