/**
 */
package gestionmodelosconsultas.entitymodel.tests;

import gestionmodelosconsultas.entitymodel.AssociativeEntity;
import gestionmodelosconsultas.entitymodel.EntitymodelFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Associative Entity</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AssociativeEntityTest extends EntityTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AssociativeEntityTest.class);
	}

	/**
	 * Constructs a new Associative Entity test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssociativeEntityTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Associative Entity test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AssociativeEntity getFixture() {
		return (AssociativeEntity)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(EntitymodelFactory.eINSTANCE.createAssociativeEntity());
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

} //AssociativeEntityTest
