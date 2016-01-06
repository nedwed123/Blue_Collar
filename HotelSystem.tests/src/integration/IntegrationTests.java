package integration;


import java.util.Date;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import SoftwareModel.BusinessLogic.Reservations;
import SoftwareModel.BusinessLogic.RoomOperations;
import SoftwareModel.BusinessLogic.Rooms;
import SoftwareModel.BusinessLogic.impl.ReservationsImpl;
import SoftwareModel.BusinessLogic.impl.RoomOperationsImpl;
import SoftwareModel.BusinessLogic.impl.RoomsImpl;
import SoftwareModel.DataAccess.impl.DatabaseContextImpl;
import SoftwareModel.DomainEntities.Availability;
import SoftwareModel.DomainEntities.BedType;
import SoftwareModel.DomainEntities.PaymentDetails;
import SoftwareModel.DomainEntities.RoomBooking;
import SoftwareModel.DomainEntities.RoomType;
import SoftwareModel.DomainEntities.impl.PaymentDetailsImpl;
import SoftwareModel.DomainEntities.impl.RoomBookingImpl;
import SoftwareModel.DomainEntities.impl.RoomImpl;
import SoftwareModel.DomainEntities.impl.RoomTypeImpl;
import SoftwareModel.Presentation.impl.EmployeeHomeViewImpl;
import SoftwareModel.Presentation.impl.FrameImpl;
import SoftwareModel.Presentation.impl.PresentationPackageImpl;
import junit.framework.TestCase;

public class IntegrationTests extends TestCase {

	public void testReservationMakesRoomUnavailible() {
		DatabaseContextImpl.GetNewDatabaseContext();
		
		Reservations reservations = new ReservationsImpl();
		RoomOperations roomOperations = new RoomOperationsImpl();
		Rooms rooms = new RoomsImpl();
		
		//	-	ADD ROOMS
		EList<BedType> beds = new BasicEList<BedType>();
		beds.add(BedType.SINGLE);
		beds.add(BedType.KID);
		roomOperations.addRoomType(0.0, 0.0, "SingleParentWithKid", beds);
		roomOperations.addRoom(1, Availability.AVAILIBLE, "SingleParentWithKid",beds);
		
		// -	Find an available room type
		Date startDate = new Date(1993, 8, 16);
		Date endDate = new Date(1993, 8, 18);
		
		EList<RoomType> roomTypes = rooms.availibleRoomTypes(1, 1, startDate, endDate);
		RoomType type = roomTypes.get(0);
		//The type we get is the type we created
		assertEquals("SingleParentWithKid", type.getName());

		// 	-	Create booking
		RoomBooking booking = new RoomBookingImpl();
		booking.setAdults(1);
		booking.setChildren(1);
		booking.setCheckInDate(startDate);
		booking.setCheckOutDate(endDate);		
		booking.setRoomtype(type);
		
		PaymentDetails paymentDetails = new PaymentDetailsImpl();
		EList<RoomBooking> bookings = new BasicEList<RoomBooking>();
		bookings.add(booking);
		
		reservations.make(bookings, paymentDetails, false, "", true);
		
		//The next call to availible room types should now return zero availible
		roomTypes = rooms.availibleRoomTypes(1, 1, startDate, endDate);
		assertTrue(roomTypes.isEmpty());
	}
}
