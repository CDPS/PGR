/**
 */
package gestionmodelosconsultas.rules.factoryrules.tests;

import gestionmodelosconsultas.rules.factoryrules.EntityName;
import gestionmodelosconsultas.rules.factoryrules.FactoryrulesFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Entity Name</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EntityNameTest extends ChildRuleTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EntityNameTest.class);
	}

	/**
	 * Constructs a new Entity Name test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityNameTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Entity Name test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EntityName getFixture() {
		return (EntityName)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(FactoryrulesFactory.eINSTANCE.createEntityName());
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

} //EntityNameTest
