/**
 */
package gestionmodelosconsultas.entitymodel.tests;

import gestionmodelosconsultas.entitymodel.EntityRelation;
import gestionmodelosconsultas.entitymodel.EntitymodelFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Entity Relation</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EntityRelationTest extends ModelElementEntityTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EntityRelationTest.class);
	}

	/**
	 * Constructs a new Entity Relation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityRelationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Entity Relation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EntityRelation getFixture() {
		return (EntityRelation)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(EntitymodelFactory.eINSTANCE.createEntityRelation());
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

} //EntityRelationTest
