/**
 */
package SoftwareModel.BusinessLogic.impl;

import SoftwareModel.BusinessLogic.BusinessLogicPackage;
import SoftwareModel.BusinessLogic.Reservations;
import SoftwareModel.BusinessLogic.RoomBookings;
import SoftwareModel.DataAccess.ReservationsRepository;
import SoftwareModel.DataAccess.impl.ReservationsRepositoryImpl;
import SoftwareModel.DomainEntities.PaymentDetails;
import SoftwareModel.DomainEntities.Reservation;
import SoftwareModel.DomainEntities.RoomBooking;
import SoftwareModel.DomainEntities.impl.ReservationImpl;

import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Reservations</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>
 * {@link SoftwareModel.BusinessLogic.impl.ReservationsImpl#getReservationsrepository
 * <em>Reservationsrepository</em>}</li>
 * <li>{@link SoftwareModel.BusinessLogic.impl.ReservationsImpl#getRoombookings
 * <em>Roombookings</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReservationsImpl extends MinimalEObjectImpl.Container implements Reservations {
	/**
	 * The cached value of the '{@link #getReservationsrepository()
	 * <em>Reservationsrepository</em>}' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getReservationsrepository()
	 * @ordered
	 */
	protected ReservationsRepository reservationsrepository = new ReservationsRepositoryImpl();

	/**
	 * The cached value of the '{@link #getRoombookings() <em>Roombookings</em>}
	 * ' containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getRoombookings()
	 * @ordered
	 */
	protected RoomBookings roombookings = new RoomBookingsImpl();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ReservationsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BusinessLogicPackage.Literals.RESERVATIONS;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ReservationsRepository getReservationsrepository() {
		return reservationsrepository;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetReservationsrepository(ReservationsRepository newReservationsrepository,
			NotificationChain msgs) {
		ReservationsRepository oldReservationsrepository = reservationsrepository;
		reservationsrepository = newReservationsrepository;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					BusinessLogicPackage.RESERVATIONS__RESERVATIONSREPOSITORY, oldReservationsrepository,
					newReservationsrepository);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setReservationsrepository(ReservationsRepository newReservationsrepository) {
		if (newReservationsrepository != reservationsrepository) {
			NotificationChain msgs = null;
			if (reservationsrepository != null)
				msgs = ((InternalEObject) reservationsrepository).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - BusinessLogicPackage.RESERVATIONS__RESERVATIONSREPOSITORY, null, msgs);
			if (newReservationsrepository != null)
				msgs = ((InternalEObject) newReservationsrepository).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - BusinessLogicPackage.RESERVATIONS__RESERVATIONSREPOSITORY, null, msgs);
			msgs = basicSetReservationsrepository(newReservationsrepository, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					BusinessLogicPackage.RESERVATIONS__RESERVATIONSREPOSITORY, newReservationsrepository,
					newReservationsrepository));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public RoomBookings getRoombookings() {
		return roombookings;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetRoombookings(RoomBookings newRoombookings, NotificationChain msgs) {
		RoomBookings oldRoombookings = roombookings;
		roombookings = newRoombookings;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					BusinessLogicPackage.RESERVATIONS__ROOMBOOKINGS, oldRoombookings, newRoombookings);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setRoombookings(RoomBookings newRoombookings) {
		if (newRoombookings != roombookings) {
			NotificationChain msgs = null;
			if (roombookings != null)
				msgs = ((InternalEObject) roombookings).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - BusinessLogicPackage.RESERVATIONS__ROOMBOOKINGS, null, msgs);
			if (newRoombookings != null)
				msgs = ((InternalEObject) newRoombookings).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - BusinessLogicPackage.RESERVATIONS__ROOMBOOKINGS, null, msgs);
			msgs = basicSetRoombookings(newRoombookings, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BusinessLogicPackage.RESERVATIONS__ROOMBOOKINGS,
					newRoombookings, newRoombookings));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void updateReservationDetails(Reservation reservation) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	protected static int nextReservationID=1;

	public Reservation make(EList<RoomBooking> selectedRooms, PaymentDetails paymentDetails, boolean payNow,
			String discountCode, boolean madeByCustomer) {

		Reservation reservation = new ReservationImpl(selectedRooms);
		reservation.setDiscountCode(discountCode);
		reservation.setPaymentdetails(paymentDetails);
		reservation.setPreliminaryCheckIn(selectedRooms.get(0).getCheckInDate());
		reservation.setPreliminaryCheckOut(selectedRooms.get(0).getCheckOutDate());
		reservation.setReservationId(nextReservationID++);
		return reservationsrepository.addNew(reservation);

	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 
	 */
	public void cancel(Reservation reservation) {
		reservation.setIsCanceled(true);
		for (RoomBooking booking : reservation.getRoombooking()) {
			booking.setIsCanceled(true);
		}
	}

	/**
	 * <!-- begin-user-doc --> Finds the reservation with the specified
	 * reservationNumber <!-- end-user-doc -->
	 */
	public Reservation getReservation(int reservationNumber) {
		return reservationsrepository.get(reservationNumber);
	}

	/**
	 * <!-- begin-user-doc --> Checks in all rooms bookings related to a
	 * reservation <!-- end-user-doc -->
	 */
	public void CheckInAllGuests(Reservation reservation) {
		for (RoomBooking roomBooking : reservation.getRoombooking()) {
			int roomNr = roombookings.checkIn(roomBooking);
			if (roomNr > 0)
				System.out.println("Guest " + roomBooking.getRoomresponsible().getFirstName() + " "
					+ roomBooking.getRoomresponsible().getLastName() + " got room number " + roomNr);
		}
	}

	/**
	 * <!-- begin-user-doc --> Checks in out rooms bookings related to a
	 * reservation <!-- end-user-doc -->
	 */
	public void CheckOutAllGuests(Reservation reservation) {
		for (RoomBooking roomBooking : reservation.getRoombooking()) {
			roombookings.checkOut(roomBooking);
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case BusinessLogicPackage.RESERVATIONS__RESERVATIONSREPOSITORY:
			return basicSetReservationsrepository(null, msgs);
		case BusinessLogicPackage.RESERVATIONS__ROOMBOOKINGS:
			return basicSetRoombookings(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case BusinessLogicPackage.RESERVATIONS__RESERVATIONSREPOSITORY:
			return getReservationsrepository();
		case BusinessLogicPackage.RESERVATIONS__ROOMBOOKINGS:
			return getRoombookings();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case BusinessLogicPackage.RESERVATIONS__RESERVATIONSREPOSITORY:
			setReservationsrepository((ReservationsRepository) newValue);
			return;
		case BusinessLogicPackage.RESERVATIONS__ROOMBOOKINGS:
			setRoombookings((RoomBookings) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case BusinessLogicPackage.RESERVATIONS__RESERVATIONSREPOSITORY:
			setReservationsrepository((ReservationsRepository) null);
			return;
		case BusinessLogicPackage.RESERVATIONS__ROOMBOOKINGS:
			setRoombookings((RoomBookings) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case BusinessLogicPackage.RESERVATIONS__RESERVATIONSREPOSITORY:
			return reservationsrepository != null;
		case BusinessLogicPackage.RESERVATIONS__ROOMBOOKINGS:
			return roombookings != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case BusinessLogicPackage.RESERVATIONS___UPDATE_RESERVATION_DETAILS__RESERVATION:
			updateReservationDetails((Reservation) arguments.get(0));
			return null;
		case BusinessLogicPackage.RESERVATIONS___MAKE__ELIST_PAYMENTDETAILS_BOOLEAN_STRING_BOOLEAN:
			return make((EList<RoomBooking>) arguments.get(0), (PaymentDetails) arguments.get(1),
					(Boolean) arguments.get(2), (String) arguments.get(3), (Boolean) arguments.get(4));
		case BusinessLogicPackage.RESERVATIONS___CANCEL__RESERVATION:
			cancel((Reservation) arguments.get(0));
			return null;
		case BusinessLogicPackage.RESERVATIONS___GET_RESERVATION__INT:
			return getReservation((Integer) arguments.get(0));
		case BusinessLogicPackage.RESERVATIONS___CHECK_IN_ALL_GUESTS__RESERVATION:
			CheckInAllGuests((Reservation) arguments.get(0));
			return null;
		case BusinessLogicPackage.RESERVATIONS___CHECK_OUT_ALL_GUESTS__RESERVATION:
			CheckOutAllGuests((Reservation) arguments.get(0));
			return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} // ReservationsImpl
