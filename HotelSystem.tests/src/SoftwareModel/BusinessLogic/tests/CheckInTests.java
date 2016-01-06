package SoftwareModel.BusinessLogic.tests;

import SoftwareModel.BusinessLogic.AvailibleRoomFinder;
import SoftwareModel.BusinessLogic.RoomBookings;
import SoftwareModel.BusinessLogic.RoomOperations;
import SoftwareModel.BusinessLogic.impl.AvailibleRoomFinderImpl;
import SoftwareModel.BusinessLogic.impl.RoomBookingsImpl;
import SoftwareModel.BusinessLogic.impl.RoomsImpl;
import SoftwareModel.DataAccess.DatabaseContext;
import SoftwareModel.DataAccess.RoomBookingsRepository;
import SoftwareModel.DataAccess.RoomRepository;
import SoftwareModel.DataAccess.impl.DatabaseContextImpl;
import SoftwareModel.DomainEntities.Availability;
import SoftwareModel.DomainEntities.Room;
import SoftwareModel.DomainEntities.RoomBooking;
import SoftwareModel.DomainEntities.impl.RoomBookingImpl;
import SoftwareModel.DomainEntities.impl.RoomImpl;
import SoftwareModel.DomainEntities.impl.RoomTypeImpl;
import junit.framework.TestCase;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Date;

public class CheckInTests extends TestCase {

	RoomBookings roomBookings;

	public void testCheckInSetsCheckedInToTrue() {
		DatabaseContext context = DatabaseContextImpl.GetNewDatabaseContext();
		context.getRooms().add(new RoomImpl());
		RoomBooking booking = new RoomBookingImpl();
		booking.setCheckInDate(new Date());
		booking.setCheckOutDate(new Date());
		AvailibleRoomFinder roomFinder = mock(AvailibleRoomFinder.class);		
		when(roomFinder.availibleRoom(booking)).thenReturn(new RoomImpl());
		
		roomBookings.setAvailibleroomfinder(roomFinder);
		roomBookings.checkIn(booking);
		assertTrue(booking.isIsCheckedIn());
	}


	public void testCheckinReturnsRoomNr() {
		DatabaseContextImpl.GetNewDatabaseContext();
		RoomBooking booking = new RoomBookingImpl();
		RoomTypeImpl roomtype = new RoomTypeImpl();
		booking.setRoomtype(roomtype);
		booking.setCheckInDate(new Date());
		booking.setCheckOutDate(new Date());
		AvailibleRoomFinder roomFinder = mock(AvailibleRoomFinder.class);
		Room room23 = new RoomImpl();
		room23.setNumber(23);
		when(roomFinder.availibleRoom(booking)).thenReturn(room23);
		roomBookings.setAvailibleroomfinder(roomFinder);
		int roomNr = roomBookings.checkIn(booking);
		assertEquals(room23.getNumber(),roomNr);
	}
	
	public void testCheckinSetsAvailabilityToUsed() {
		RoomBooking booking = new RoomBookingImpl();
		booking.setCheckInDate(new Date());
		booking.setCheckOutDate(new Date());
		RoomTypeImpl roomtype = new RoomTypeImpl();
		booking.setRoomtype(roomtype);
		AvailibleRoomFinder roomFinder = mock(AvailibleRoomFinder.class);
		Room room23 = new RoomImpl();
		room23.setNumber(23);
		when(roomFinder.availibleRoom(booking)).thenReturn(room23);
		roomBookings.setAvailibleroomfinder(roomFinder);
		roomBookings.checkIn(booking);
		assertEquals(Availability.USED,room23.getAvailability());
	}
	
	public void testCheckinAssignsRoomToRoomBooking() {
		RoomBooking booking = new RoomBookingImpl();
		RoomTypeImpl roomtype = new RoomTypeImpl();
		booking.setRoomtype(roomtype);
		booking.setCheckInDate(new Date());
		booking.setCheckOutDate(new Date());
		AvailibleRoomFinder roomFinder = mock(AvailibleRoomFinder.class);
		Room room23 = new RoomImpl();
		room23.setNumber(23);
		when(roomFinder.availibleRoom(booking)).thenReturn(room23);
		roomBookings.setAvailibleroomfinder(roomFinder);
		roomBookings.checkIn(booking);
		assertEquals(booking.getRoom(),room23);
	}
	
	@Override
	protected void setUp() throws Exception {
		roomBookings = new RoomBookingsImpl();
	}

}