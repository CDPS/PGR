/**
 */
package gestionmodelosconsultas.entitymodel.tests;

import gestionmodelosconsultas.entitymodel.EntitymodelFactory;
import gestionmodelosconsultas.entitymodel.SimpleRelation;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Simple Relation</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimpleRelationTest extends EntityRelationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SimpleRelationTest.class);
	}

	/**
	 * Constructs a new Simple Relation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleRelationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Simple Relation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SimpleRelation getFixture() {
		return (SimpleRelation)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(EntitymodelFactory.eINSTANCE.createSimpleRelation());
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

} //SimpleRelationTest
