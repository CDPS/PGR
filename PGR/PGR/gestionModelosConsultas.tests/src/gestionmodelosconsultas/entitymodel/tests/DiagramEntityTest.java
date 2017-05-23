/**
 */
package gestionmodelosconsultas.entitymodel.tests;

import gestionmodelosconsultas.entitymodel.DiagramEntity;
import gestionmodelosconsultas.entitymodel.EntitymodelFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Diagram Entity</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DiagramEntityTest extends TestCase {

	/**
	 * The fixture for this Diagram Entity test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiagramEntity fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DiagramEntityTest.class);
	}

	/**
	 * Constructs a new Diagram Entity test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagramEntityTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Diagram Entity test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(DiagramEntity fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Diagram Entity test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiagramEntity getFixture() {
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
		setFixture(EntitymodelFactory.eINSTANCE.createDiagramEntity());
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

} //DiagramEntityTest
