/**
 */
package SoftwareModel.BusinessLogic.tests;

import java.util.Date;

import SoftwareModel.BusinessLogic.BusinessLogicFactory;
import SoftwareModel.BusinessLogic.Rooms;
import SoftwareModel.BusinessLogic.impl.AvailibleRoomFinderImpl;
import SoftwareModel.DataAccess.RoomRepository;
import SoftwareModel.DataAccess.impl.RoomRepositoryImpl;
import SoftwareModel.DomainEntities.RoomType;
import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Rooms</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link SoftwareModel.BusinessLogic.Rooms#checkOut(SoftwareModel.DomainEntities.RoomBooking) <em>Check Out</em>}</li>
 *   <li>{@link SoftwareModel.BusinessLogic.Rooms#checkIn(SoftwareModel.DomainEntities.RoomBooking) <em>Check In</em>}</li>
 *   <li>{@link SoftwareModel.BusinessLogic.Rooms#getBooking(int) <em>Get Booking</em>}</li>
 *   <li>{@link SoftwareModel.BusinessLogic.Rooms#availibleRoomTypes(int, int, java.util.Date, java.util.Date) <em>Availible Room Types</em>}</li>
 *   <li>{@link SoftwareModel.BusinessLogic.Rooms#getBooking(java.lang.String) <em>Get Booking</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class RoomsTest extends TestCase {

	/**
	 * The fixture for this Rooms test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Rooms fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RoomsTest.class);
	}

	/**
	 * Constructs a new Rooms test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomsTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Rooms test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Rooms fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Rooms test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Rooms getFixture() {
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
		setFixture(BusinessLogicFactory.eINSTANCE.createRooms());
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

	/**
	 * Tests the '{@link SoftwareModel.BusinessLogic.Rooms#checkOut(SoftwareModel.DomainEntities.RoomBooking) <em>Check Out</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SoftwareModel.BusinessLogic.Rooms#checkOut(SoftwareModel.DomainEntities.RoomBooking)
	 * @generated
	 */
	public void testCheckOut__RoomBooking() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link SoftwareModel.BusinessLogic.Rooms#checkIn(SoftwareModel.DomainEntities.RoomBooking) <em>Check In</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SoftwareModel.BusinessLogic.Rooms#checkIn(SoftwareModel.DomainEntities.RoomBooking)
	 * @generated
	 */
	public void testCheckIn__RoomBooking() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link SoftwareModel.BusinessLogic.Rooms#getBooking(int) <em>Get Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SoftwareModel.BusinessLogic.Rooms#getBooking(int)
	 * @generated
	 */
	public void testGetBooking__int() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link SoftwareModel.BusinessLogic.Rooms#availibleRoomTypes(int, int, java.util.Date, java.util.Date) <em>Availible Room Types</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SoftwareModel.BusinessLogic.Rooms#availibleRoomTypes(int, int, java.util.Date, java.util.Date)
	 */
	public void testAvailibleRoomTypes__int_int_Date_Date() {
		RoomRepository newRoomrepository = new RoomRepositoryImpl();
		
		((AvailibleRoomFinderImpl)fixture).setRoomrepository(newRoomrepository );
		int adults = 1;
		int children = 1;
		Date startDate = new Date(1993, 8, 16);
		Date endDate = new Date(1993, 8, 16);
		RoomType roomtype = fixture.availibleRoomTypes(adults, children, startDate, endDate);
		
		//TODO: Implement
		
		
		fail();
	}

	/**
	 * Tests the '{@link SoftwareModel.BusinessLogic.Rooms#getBooking(java.lang.String) <em>Get Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SoftwareModel.BusinessLogic.Rooms#getBooking(java.lang.String)
	 * @generated
	 */
	public void testGetBooking__String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //RoomsTest
