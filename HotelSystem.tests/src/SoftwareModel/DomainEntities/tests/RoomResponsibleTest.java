/**
 */
package SoftwareModel.DomainEntities.tests;

import SoftwareModel.DomainEntities.DomainEntitiesFactory;
import SoftwareModel.DomainEntities.RoomResponsible;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Room Responsible</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RoomResponsibleTest extends TestCase {

	/**
	 * The fixture for this Room Responsible test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoomResponsible fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RoomResponsibleTest.class);
	}

	/**
	 * Constructs a new Room Responsible test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomResponsibleTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Room Responsible test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(RoomResponsible fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Room Responsible test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoomResponsible getFixture() {
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
		setFixture(DomainEntitiesFactory.eINSTANCE.createRoomResponsible());
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

} //RoomResponsibleTest
