/**
 */
package gestionmodelosconsultas.rules.factoryrules.tests;

import gestionmodelosconsultas.rules.factoryrules.FactoryrulesFactory;
import gestionmodelosconsultas.rules.factoryrules.RelationName;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Relation Name</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RelationNameTest extends ChildRuleTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RelationNameTest.class);
	}

	/**
	 * Constructs a new Relation Name test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationNameTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Relation Name test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected RelationName getFixture() {
		return (RelationName)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(FactoryrulesFactory.eINSTANCE.createRelationName());
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

} //RelationNameTest
