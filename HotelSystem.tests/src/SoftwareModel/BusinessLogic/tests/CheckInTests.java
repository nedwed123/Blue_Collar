package SoftwareModel.BusinessLogic.tests;

import SoftwareModel.BusinessLogic.AvailibleRoomFinder;
import SoftwareModel.BusinessLogic.RoomBookings;
import SoftwareModel.BusinessLogic.impl.AvailibleRoomFinderImpl;
import SoftwareModel.BusinessLogic.impl.RoomBookingsImpl;
import SoftwareModel.DataAccess.RoomBookingsRepository;
import SoftwareModel.DataAccess.RoomRepository;
import SoftwareModel.DomainEntities.Availability;
import SoftwareModel.DomainEntities.Room;
import SoftwareModel.DomainEntities.RoomBooking;
import SoftwareModel.DomainEntities.impl.RoomBookingImpl;
import SoftwareModel.DomainEntities.impl.RoomImpl;
import SoftwareModel.DomainEntities.impl.RoomTypeImpl;
import junit.framework.TestCase;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CheckInTests extends TestCase {

	RoomBookings roomBookings;

	public void testCheckInSetsCheckedInToTrue() {
		RoomBooking booking = new RoomBookingImpl();
		roomBookings.checkIn(booking);
		assertTrue(booking.isIsCheckedIn());
	}


	public void testCheckinReturnsRoomNr() {
		RoomBooking booking = new RoomBookingImpl();
		RoomTypeImpl roomtype = new RoomTypeImpl();
		booking.setRoomtype(roomtype);
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