/**
 */
package SoftwareModel.Presentation.impl;

import SoftwareModel.BusinessLogic.Reservations;
import SoftwareModel.BusinessLogic.Rooms;
import SoftwareModel.BusinessLogic.impl.ReservationsImpl;
import SoftwareModel.BusinessLogic.impl.RoomsImpl;
import SoftwareModel.DomainEntities.PaymentDetails;
import SoftwareModel.DomainEntities.Reservation;
import SoftwareModel.DomainEntities.RoomBooking;
import SoftwareModel.DomainEntities.RoomResponsible;
import SoftwareModel.DomainEntities.RoomType;
import SoftwareModel.DomainEntities.impl.PaymentDetailsImpl;
import SoftwareModel.DomainEntities.impl.RoomBookingImpl;
import SoftwareModel.DomainEntities.impl.RoomResponsibleImpl;
import SoftwareModel.Presentation.Frame;
import SoftwareModel.Presentation.MakeReservationView;
import SoftwareModel.Presentation.PresentationPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import java.lang.reflect.InvocationTargetException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Make Reservation View</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link SoftwareModel.Presentation.impl.MakeReservationViewImpl#getReservations <em>Reservations</em>}</li>
 *   <li>{@link SoftwareModel.Presentation.impl.MakeReservationViewImpl#getRooms <em>Rooms</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MakeReservationViewImpl extends MinimalEObjectImpl.Container implements MakeReservationView {
	/**
	 * The cached value of the '{@link #getReservations() <em>Reservations</em>}
	 * ' containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getReservations()
	 * @ordered
	 */
	protected Reservations reservations = new ReservationsImpl();
	/**
	 * The cached value of the '{@link #getRooms() <em>Rooms</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getRooms()
	 * @ordered
	 */
	protected Rooms rooms = new RoomsImpl();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public MakeReservationViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PresentationPackage.Literals.MAKE_RESERVATION_VIEW;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Reservations getReservations() {
		return reservations;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReservations(Reservations newReservations, NotificationChain msgs) {
		Reservations oldReservations = reservations;
		reservations = newReservations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PresentationPackage.MAKE_RESERVATION_VIEW__RESERVATIONS, oldReservations, newReservations);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setReservations(Reservations newReservations) {
		if (newReservations != reservations) {
			NotificationChain msgs = null;
			if (reservations != null)
				msgs = ((InternalEObject)reservations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PresentationPackage.MAKE_RESERVATION_VIEW__RESERVATIONS, null, msgs);
			if (newReservations != null)
				msgs = ((InternalEObject)newReservations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PresentationPackage.MAKE_RESERVATION_VIEW__RESERVATIONS, null, msgs);
			msgs = basicSetReservations(newReservations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationPackage.MAKE_RESERVATION_VIEW__RESERVATIONS, newReservations, newReservations));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Rooms getRooms() {
		if (rooms != null && rooms.eIsProxy()) {
			InternalEObject oldRooms = (InternalEObject)rooms;
			rooms = (Rooms)eResolveProxy(oldRooms);
			if (rooms != oldRooms) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PresentationPackage.MAKE_RESERVATION_VIEW__ROOMS, oldRooms, rooms));
			}
		}
		return rooms;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Rooms basicGetRooms() {
		return rooms;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setRooms(Rooms newRooms) {
		Rooms oldRooms = rooms;
		rooms = newRooms;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationPackage.MAKE_RESERVATION_VIEW__ROOMS, oldRooms, rooms));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	private Date getDate(Date startDate, Frame frame, String description) {

		DateFormat format = new SimpleDateFormat("yy-MM-dd", Locale.ENGLISH);
		do{
			
			try {

				String dateString = frame.inputTextFor(description);
				Date date = format.parse(dateString);
				if (date.after(startDate))
					return date;
				System.out.println("The date needs to be a later than " + format.format(startDate));

			} catch (ParseException e) {
				System.out.println("The format is incorrect.");
			}
		} while (true);
	}

	
	private boolean isValidEmailAddress(Frame frame, String email) {
		String inputEmail = frame.inputTextFor(email);
		 String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
         java.util.regex.Pattern p = java.util.regex.Pattern.compile(ePattern);
         java.util.regex.Matcher m = p.matcher(inputEmail);
         return m.matches();
		}

	public void run(Frame frame) {

		System.out.println("Make Reservation\n---------------------");

		Date checkInDate = getDate(new Date(), frame, "check in date (format YY-MM-DD)");

		Date checkOutDate = getDate(checkInDate, frame, "check out date (format YY-MM-DD)");

		int numberOfRooms;
		do{
			numberOfRooms = frame.input("number of rooms to reserve (1-9)");
		}while(numberOfRooms > 9 || numberOfRooms < 1);

		EList<RoomBooking> roomInterests = new BasicEList<RoomBooking>();
		for (int i = 0; i < numberOfRooms; i++) {
			roomInterests.add(new RoomBookingImpl());
		}

		int room = 1;
		for (RoomBooking roomInterest : roomInterests) {
			roomInterest.setAdults(frame.input("number of adults for room " + room));
			roomInterest.setChildren(frame.input("number of children for room " + room));
			roomInterest.setCheckInDate(checkInDate);
			roomInterest.setCheckOutDate(checkOutDate);
			room++;
		}

		room = 1;
		for (RoomBooking roomInterest : roomInterests) {
			EList<RoomType> roomTypes = getRooms().availibleRoomTypes(roomInterest.getAdults(),
					roomInterest.getChildren(), checkInDate, checkOutDate);

			if (roomTypes.size() < 1) {
				System.out.println("No rooms available.");
				frame.goBack();
				return;
			}

			RoomType selectedRoomType = (RoomType)frame.displaySelectionMenu("Select room type for room " + room +":",
					roomTypes.toArray());
			roomInterest.setRoomtype(selectedRoomType);
			
			// Add and set room responsible
			RoomResponsible responsible = new RoomResponsibleImpl();
			responsible.setFirstName(frame.inputTextFor("first name for room responsible for room " + room));
			responsible.setLastName(frame.inputTextFor("last name for room responsible for room " + room));
			responsible.setEmail(frame.inputTextFor("e-mail for room responsible for room " + room));
			responsible.setAddress(frame.inputTextFor("address for room responsible for room " + room));
			responsible.setPhoneNumber(frame.input("phone number for room responsible for room " + room));
			
			roomInterest.setRoomresponsible(responsible);
			
			room++;
		}

		// Receive input from user about reservation responsible
		PaymentDetails paymentDetails = new PaymentDetailsImpl();
		paymentDetails.setName(frame.inputTextFor("name of card holder:"));
		paymentDetails.setAddress(frame.inputTextFor("address of card holder:"));
		paymentDetails.setPhoneNumber(frame.input("phone number of card holder:"));
		
		
		boolean payNow = frame.inputTextFor("if you want to pay now [y/n]:").toLowerCase() == "y";
		
		Reservation reservation = reservations.make(roomInterests, paymentDetails, payNow,"",false);
		
		System.out.println("Reservation successful");
		System.out.println("Reservation nr is: " + reservation.getReservationId());
		frame.goBack();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PresentationPackage.MAKE_RESERVATION_VIEW__RESERVATIONS:
				return basicSetReservations(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PresentationPackage.MAKE_RESERVATION_VIEW__RESERVATIONS:
				return getReservations();
			case PresentationPackage.MAKE_RESERVATION_VIEW__ROOMS:
				if (resolve) return getRooms();
				return basicGetRooms();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PresentationPackage.MAKE_RESERVATION_VIEW__RESERVATIONS:
				setReservations((Reservations)newValue);
				return;
			case PresentationPackage.MAKE_RESERVATION_VIEW__ROOMS:
				setRooms((Rooms)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PresentationPackage.MAKE_RESERVATION_VIEW__RESERVATIONS:
				setReservations((Reservations)null);
				return;
			case PresentationPackage.MAKE_RESERVATION_VIEW__ROOMS:
				setRooms((Rooms)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PresentationPackage.MAKE_RESERVATION_VIEW__RESERVATIONS:
				return reservations != null;
			case PresentationPackage.MAKE_RESERVATION_VIEW__ROOMS:
				return rooms != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case PresentationPackage.MAKE_RESERVATION_VIEW___RUN__FRAME:
				run((Frame)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} // MakeReservationViewImpl
