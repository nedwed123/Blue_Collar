/**
 */
package SoftwareModel.DomainEntities.tests;

import SoftwareModel.DomainEntities.DomainEntitiesFactory;
import SoftwareModel.DomainEntities.RoomType;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Room Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RoomTypeTest extends TestCase {

	/**
	 * The fixture for this Room Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoomType fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RoomTypeTest.class);
	}

	/**
	 * Constructs a new Room Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomTypeTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Room Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(RoomType fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Room Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoomType getFixture() {
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
		setFixture(DomainEntitiesFactory.eINSTANCE.createRoomType());
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

} //RoomTypeTest
