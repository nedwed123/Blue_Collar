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
import SoftwareModel.DomainEntities.RoomType;
import SoftwareModel.Presentation.Frame;
import SoftwareModel.Presentation.MakeReservationView;
import SoftwareModel.Presentation.PresentationPackage;

import java.lang.reflect.InvocationTargetException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

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
	private Date getDate(Date startDate) {

		DateFormat format = new SimpleDateFormat("yy-MM-dd", Locale.ENGLISH);

		Date checkInDate = new Date();
		Date checkOutDate = new Date();
		Scanner scanner = new Scanner(System.in);
		boolean isDateOk = false;
		do{
			
			try {

				String dateString = scanner.next();
				Date date = format.parse(dateString);
				if (date.after(startDate))
					return date;
				System.out.println("Please enter a later date than " + format.format(startDate));

			} catch (ParseException e) {
				System.out.println("Please enter a date in the correct format (format YY-MM-DD):");
			}
		} while (true);
	}

	public void run(Frame frame) {

		// TODO: implement this method

				System.out.println("Make Reservation\n---------------------");

				System.out.println("Enter check in date (format YY-MM-DD): ");
				Date checkInDate = getDate(new Date());

				System.out.println("Enter check out date (format YY-MM-DD): ");
				Date checkOutDate = getDate(checkInDate);

				Scanner scanner = new Scanner(System.in);
				int numberOfRooms;
				while (true) {
					System.out.println("Enter number of rooms to reserv:");
					numberOfRooms = scanner.nextInt();
					if (numberOfRooms > 9 || numberOfRooms < 1)
						System.out.println("Please enter a number between 1-9");
					else
						break;
				}
				int[] numberOfAdultsForRooms = new int[numberOfRooms];
				int[] numberOfChildrenForRooms = new int[numberOfRooms];
				for (int i = 0; i < numberOfRooms; i++) {
					System.out.println("Enter number of adults for room " + (i + 1) + ":");
					numberOfAdultsForRooms[i] = scanner.nextInt();
					System.out.println("Enter number of children for room " + (i + 1) + ":");
					numberOfChildrenForRooms[i] = scanner.nextInt();
				}

				EList<RoomType> roomTypes = getRooms().availibleRoomTypes(numberOfAdultsForRooms[0],
						numberOfChildrenForRooms[0], checkInDate, checkOutDate);

				if (roomTypes.size() < 1) {
					System.out.println("No rooms available.");
					frame.goBack();
					return;
				}

				// Recieve this input from user
				EList<RoomBooking> selectedRooms = null;
				PaymentDetails paymentDetails = null;
				boolean payNow = false;

				Reservation reservation = reservations.make(selectedRooms, paymentDetails, payNow,"",false);

				// Display reservation number?

				// throw new UnsupportedOperationException();
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
