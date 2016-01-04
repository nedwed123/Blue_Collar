package SoftwareModel.BusinessLogic.tests;

import static org.junit.Assert.assertNotEquals;

import java.util.Date;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import SoftwareModel.BusinessLogic.Reservations;
import SoftwareModel.BusinessLogic.impl.AvailibleRoomFinderImpl;
import SoftwareModel.BusinessLogic.impl.ReservationsImpl;
import SoftwareModel.BusinessLogic.impl.RoomBookingsImpl;
import SoftwareModel.DataAccess.impl.DatabaseContextImpl;
import SoftwareModel.DomainEntities.Availability;
import SoftwareModel.DomainEntities.BedType;
import SoftwareModel.DomainEntities.PaymentDetails;
import SoftwareModel.DomainEntities.Reservation;
import SoftwareModel.DomainEntities.Room;
import SoftwareModel.DomainEntities.RoomBooking;
import SoftwareModel.DomainEntities.RoomType;
import SoftwareModel.DomainEntities.impl.PaymentDetailsImpl;
import SoftwareModel.DomainEntities.impl.ReservationImpl;
import SoftwareModel.DomainEntities.impl.RoomBookingImpl;
import SoftwareModel.DomainEntities.impl.RoomImpl;
import SoftwareModel.DomainEntities.impl.RoomTypeImpl;
import junit.framework.TestCase;

public class MakeReservationTests extends TestCase {

	public void testMakeReservationReturnsUniqueReservationIds() {
		EList<Room> rooms = DatabaseContextImpl.GetDatabaseContext().getRooms();
		
		EList<BedType> beds = new BasicEList<BedType>();
		beds.add(BedType.SINGLE);
		beds.add(BedType.KID);
		RoomTypeImpl singleWithKid = new RoomTypeImpl("SingleParentWithKid",beds, 0.0, 0.0);

		rooms.add(new RoomImpl(1,singleWithKid,Availability.AVAILIBLE));
		rooms.add(new RoomImpl(2,singleWithKid,Availability.AVAILIBLE));
		
		Date startDate = new Date(1993, 8, 16);
		Date endDate = new Date(1993, 8, 18);
		
		RoomBooking booking = new RoomBookingImpl();
		booking.setRoomtype(singleWithKid);
		booking.setAdults(1);
		booking.setChildren(1);
		booking.setCheckInDate(startDate);
		booking.setCheckOutDate(endDate);
		
		PaymentDetails paymentDetails = new PaymentDetailsImpl();
		EList<RoomBooking> bookings = new BasicEList<RoomBooking>();
		
		Reservations reservations = new ReservationsImpl();		
		Reservation reservation = reservations.make(bookings, paymentDetails , false, "", true);
		Reservation reservation2 = reservations.make(bookings, paymentDetails , false, "", true);
		assertNotEquals(reservation.getReservationId(), reservation2.getReservationId());
	}
}
