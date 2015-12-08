/**
 */
package SoftwareModel.BusinessLogic.tests;

import java.util.Date;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreEList;

import SoftwareModel.BusinessLogic.BusinessLogicFactory;
import SoftwareModel.BusinessLogic.Rooms;
import SoftwareModel.BusinessLogic.impl.AvailibleRoomFinderImpl;
import SoftwareModel.DataAccess.RoomBookingsRepository;
import SoftwareModel.DataAccess.RoomRepository;
import SoftwareModel.DataAccess.impl.RoomRepositoryImpl;
import SoftwareModel.DomainEntities.Availability;
import SoftwareModel.DomainEntities.BedType;
import SoftwareModel.DomainEntities.Room;
import SoftwareModel.DomainEntities.RoomBooking;
import SoftwareModel.DomainEntities.RoomType;
import SoftwareModel.DomainEntities.impl.RoomImpl;
import SoftwareModel.DomainEntities.impl.RoomTypeImpl;
import junit.framework.TestCase;
import static org.mockito.Mockito.*;
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
		RoomRepository fakeRepo = mock(RoomRepository.class);
		RoomBookingsRepository fakeBookings = mock(RoomBookingsRepository.class);
		
		((AvailibleRoomFinderImpl)fixture).setRoomrepository(fakeRepo );
		((AvailibleRoomFinderImpl)fixture).setRoombookingsrepository(fakeBookings);
		
		EList<Room> rooms = new BasicEList<Room>();
		EList<BedType> beds = new BasicEList<BedType>();
		beds.add(BedType.SINGLE);
		beds.add(BedType.KID);
		RoomTypeImpl singleWithKid = new RoomTypeImpl("SingleParentWithKid",beds);

		rooms.add(new RoomImpl(1,singleWithKid,Availability.AVAILIBLE));
		rooms.add(new RoomImpl(2,singleWithKid,Availability.AVAILIBLE));

		EList<RoomBooking> bookings = new BasicEList<RoomBooking>();
		
		when(fakeRepo.getRooms()).thenReturn(rooms);
		when(fakeBookings.getAll()).thenReturn(bookings);
		
		int adults = 1;
		int children = 1;
		Date startDate = new Date(1993, 8, 16);
		Date endDate = new Date(1993, 8, 18);
		EList<RoomType> roomtypes = fixture.availibleRoomTypes(adults, children, startDate, endDate);
		
		assertEquals(1, roomtypes.size());
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
