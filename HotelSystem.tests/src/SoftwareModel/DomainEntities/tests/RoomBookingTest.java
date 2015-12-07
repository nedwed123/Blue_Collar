/**
 */
package SoftwareModel.DomainEntities.tests;

import SoftwareModel.DomainEntities.DomainEntitiesFactory;
import SoftwareModel.DomainEntities.RoomBooking;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Room Booking</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RoomBookingTest extends TestCase {

	/**
	 * The fixture for this Room Booking test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoomBooking fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RoomBookingTest.class);
	}

	/**
	 * Constructs a new Room Booking test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomBookingTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Room Booking test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(RoomBooking fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Room Booking test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoomBooking getFixture() {
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
		setFixture(DomainEntitiesFactory.eINSTANCE.createRoomBooking());
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

} //RoomBookingTest
