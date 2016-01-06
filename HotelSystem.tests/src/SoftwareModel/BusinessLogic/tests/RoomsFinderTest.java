/**
 */
package SoftwareModel.BusinessLogic.tests;

import SoftwareModel.BusinessLogic.impl.AvailibleRoomFinderImpl;
import SoftwareModel.DataAccess.DatabaseContext;
import SoftwareModel.DataAccess.RoomBookingsRepository;
import SoftwareModel.DataAccess.RoomRepository;
import SoftwareModel.DataAccess.impl.DatabaseContextImpl;
import SoftwareModel.DomainEntities.*;
import SoftwareModel.DomainEntities.impl.RoomBookingImpl;
import SoftwareModel.DomainEntities.impl.RoomImpl;
import SoftwareModel.DomainEntities.impl.RoomTypeImpl;
import junit.framework.TestCase;
import junit.textui.TestRunner;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import java.util.Date;

import static org.mockito.Mockito.mock;

public class RoomsFinderTest extends TestCase {

	public static void main(String[] args) {
		TestRunner.run(RoomsFinderTest.class);
	}

	public void testAvailibleRoomTypesOnlyReturnsDistinctRoomTypes() {
		AvailibleRoomFinderImpl roomFinder = new AvailibleRoomFinderImpl();
		EList<Room> rooms = DatabaseContextImpl.GetNewDatabaseContext().getRooms();

		EList<BedType> beds = new BasicEList<BedType>();
		beds.add(BedType.SINGLE);
		beds.add(BedType.KID);
		RoomTypeImpl singleWithKid = new RoomTypeImpl("SingleParentWithKid",beds, 0.0, 0.0);

		rooms.add(new RoomImpl(1,singleWithKid,Availability.AVAILIBLE));
		rooms.add(new RoomImpl(2,singleWithKid,Availability.AVAILIBLE));
		
		int adults = 1;
		int children = 1;
		Date startDate = new Date(1993, 8, 16);
		Date endDate = new Date(1993, 8, 18);
		EList<RoomType> roomtypes = roomFinder.availableRoomTypes(adults, children, startDate, endDate);
		
		assertEquals(1, roomtypes.size());
	}
	
	public void testAvailibleRoomTypesDoesNotReturnedBookedRoomTypes() {
		AvailibleRoomFinderImpl roomFinder = new AvailibleRoomFinderImpl();

		DatabaseContext context = DatabaseContextImpl.GetNewDatabaseContext();
		EList<Room> rooms = context.getRooms();
		EList<RoomBooking> bookings = context.getRoomBookings();

		EList<BedType> beds = new BasicEList<BedType>();
		beds.add(BedType.SINGLE);
		beds.add(BedType.KID);
		RoomTypeImpl singleWithKid = new RoomTypeImpl("SingleParentWithKid",beds, 0.0, 0.0);

		rooms.add(new RoomImpl(1,singleWithKid,Availability.AVAILIBLE));
		rooms.add(new RoomImpl(2,singleWithKid,Availability.AVAILIBLE));

		
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

		int adults = 1;
		int children = 1;
		EList<RoomType> roomtypes = roomFinder.availableRoomTypes(adults, children, startDate, endDate);
		
		assertEquals(0, roomtypes.size());
	}
	
	
	public void testAvailibleRoomDoesNotReturnUsedRooms() {
		AvailibleRoomFinderImpl roomFinder = new AvailibleRoomFinderImpl();
		DatabaseContext context = DatabaseContextImpl.GetNewDatabaseContext();
		EList<Room> rooms = context.getRooms();
		EList<RoomBooking> bookings = context.getRoomBookings();

		EList<BedType> beds = new BasicEList<BedType>();
		RoomTypeImpl singleWithKid = new RoomTypeImpl("SingleParentWithKid",beds, 0.0, 0.0);

		RoomImpl room1 = new RoomImpl(1, singleWithKid, Availability.AVAILIBLE);
		RoomImpl room2 = new RoomImpl(2, singleWithKid, Availability.AVAILIBLE);
		rooms.add(room1);
		rooms.add(room2);
		
		Date startDate = new Date(1993, 8, 16);
		Date endDate = new Date(1993, 8, 18);

		//Create a booking for room 1
		RoomBooking booking = new RoomBookingImpl();
		booking.setCheckInDate(startDate);
		booking.setCheckOutDate(endDate);
		booking.setRoomtype(singleWithKid);
		booking.setRoom(room1);
		booking.setIsCheckedIn(true);
		bookings.add(booking);

		//Try make the same booking, should return room 2
		Room room = roomFinder.availibleRoom(booking);
		
		assertEquals(2, room.getNumber());
	}

}
