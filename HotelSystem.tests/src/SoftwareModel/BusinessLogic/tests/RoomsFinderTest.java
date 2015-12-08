/**
 */
package SoftwareModel.BusinessLogic.tests;

import java.util.Date;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import SoftwareModel.BusinessLogic.impl.AvailibleRoomFinderImpl;
import SoftwareModel.DataAccess.RoomBookingsRepository;
import SoftwareModel.DataAccess.RoomRepository;
import SoftwareModel.DomainEntities.Availability;
import SoftwareModel.DomainEntities.BedType;
import SoftwareModel.DomainEntities.Room;
import SoftwareModel.DomainEntities.RoomBooking;
import SoftwareModel.DomainEntities.RoomType;
import SoftwareModel.DomainEntities.impl.RoomBookingImpl;
import SoftwareModel.DomainEntities.impl.RoomImpl;
import SoftwareModel.DomainEntities.impl.RoomTypeImpl;
import junit.framework.TestCase;
import static org.mockito.Mockito.*;
import junit.textui.TestRunner;

public class RoomsFinderTest extends TestCase {

	RoomRepository fakeRepo;
	RoomBookingsRepository fakeBookings;
	AvailibleRoomFinderImpl roomFinder;

	public static void main(String[] args) {
		TestRunner.run(RoomsFinderTest.class);
	}

	@Override
	protected void setUp() throws Exception {
		fakeRepo = mock(RoomRepository.class);
		fakeBookings = mock(RoomBookingsRepository.class);
		roomFinder = new AvailibleRoomFinderImpl(fakeBookings,fakeRepo);
	}

	@Override
	protected void tearDown() throws Exception {
		roomFinder = null;
	}
	
	public void testAvailibleRoomTypesOnlyReturnsDistinctRoomTypes() {
		RoomRepository fakeRepo = mock(RoomRepository.class);
		RoomBookingsRepository fakeBookings = mock(RoomBookingsRepository.class);
		AvailibleRoomFinderImpl roomFinder = new AvailibleRoomFinderImpl(fakeBookings,fakeRepo);
		
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
		EList<RoomType> roomtypes = roomFinder.availableRoomTypes(adults, children, startDate, endDate);
		
		assertEquals(1, roomtypes.size());
	}
	
	public void testAvailibleRoomTypesDoesNotReturnedBookedRoomTypes() {
		RoomRepository fakeRepo = mock(RoomRepository.class);
		RoomBookingsRepository fakeBookings = mock(RoomBookingsRepository.class);
		AvailibleRoomFinderImpl roomFinder = new AvailibleRoomFinderImpl(fakeBookings,fakeRepo);
		
		EList<Room> rooms = new BasicEList<Room>();
		EList<BedType> beds = new BasicEList<BedType>();
		beds.add(BedType.SINGLE);
		beds.add(BedType.KID);
		RoomTypeImpl singleWithKid = new RoomTypeImpl("SingleParentWithKid",beds);

		rooms.add(new RoomImpl(1,singleWithKid,Availability.AVAILIBLE));
		rooms.add(new RoomImpl(2,singleWithKid,Availability.AVAILIBLE));

		EList<RoomBooking> bookings = new BasicEList<RoomBooking>();
		
		Date startDate = new Date(1993, 8, 16);
		Date endDate = new Date(1993, 8, 18);
		
		RoomBooking booking1 = new RoomBookingImpl();
		booking1.setRoomtype(singleWithKid);
		booking1.setAdults(1);
		booking1.setChildren(1);
		booking1.setCheckInDate(startDate);
		booking1.setCheckOutDate(endDate);
		//Add the booking twice, booking both rooms
		bookings.add(booking1);
		bookings.add(booking1);
		
		when(fakeRepo.getRooms()).thenReturn(rooms);
		when(fakeBookings.getAll()).thenReturn(bookings);
		
		int adults = 1;
		int children = 1;
		EList<RoomType> roomtypes = roomFinder.availableRoomTypes(adults, children, startDate, endDate);
		
		assertEquals(0, roomtypes.size());
	}

}
