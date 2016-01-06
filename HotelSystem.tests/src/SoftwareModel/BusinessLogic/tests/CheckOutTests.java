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

public class CheckOutTests extends TestCase {

	RoomBookings roomBookings;
	
	public void testCheckOutSetsAvailabilityToToBeCleaned() {
		RoomBooking booking = new RoomBookingImpl();
		RoomTypeImpl roomtype = new RoomTypeImpl();
		booking.setRoomtype(roomtype);
		AvailibleRoomFinder roomFinder = mock(AvailibleRoomFinder.class);
		Room room = new RoomImpl();
		booking.setRoom(room);
		roomBookings.checkOut(booking);
		assertEquals(Availability.USED,room.getAvailability());
	}
	
	@Override
	protected void setUp() throws Exception {
		roomBookings = new RoomBookingsImpl();
	}

}