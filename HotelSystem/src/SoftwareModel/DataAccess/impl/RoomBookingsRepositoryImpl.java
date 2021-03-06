/**
 */
package SoftwareModel.DataAccess.impl;

import SoftwareModel.DataAccess.DataAccessPackage;
import SoftwareModel.DataAccess.DatabaseContext;
import SoftwareModel.DataAccess.RoomBookingsRepository;
import SoftwareModel.DomainEntities.Reservation;
import SoftwareModel.DomainEntities.RoomBooking;
import SoftwareModel.DomainEntities.RoomResponsible;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import java.lang.reflect.InvocationTargetException;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Room Bookings Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link SoftwareModel.DataAccess.impl.RoomBookingsRepositoryImpl#getDatabasecontext <em>Databasecontext</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoomBookingsRepositoryImpl extends MinimalEObjectImpl.Container implements RoomBookingsRepository {
	/**
	 * The cached value of the '{@link #getDatabasecontext() <em>Databasecontext</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabasecontext()
	 * @ordered
	 */
	protected DatabaseContext databasecontext = DatabaseContextImpl.GetDatabaseContext();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomBookingsRepositoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataAccessPackage.Literals.ROOM_BOOKINGS_REPOSITORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabaseContext getDatabasecontext() {
		if (databasecontext != null && databasecontext.eIsProxy()) {
			InternalEObject oldDatabasecontext = (InternalEObject)databasecontext;
			databasecontext = (DatabaseContext)eResolveProxy(oldDatabasecontext);
			if (databasecontext != oldDatabasecontext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataAccessPackage.ROOM_BOOKINGS_REPOSITORY__DATABASECONTEXT, oldDatabasecontext, databasecontext));
			}
		}
		return databasecontext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabaseContext basicGetDatabasecontext() {
		return databasecontext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatabasecontext(DatabaseContext newDatabasecontext) {
		DatabaseContext oldDatabasecontext = databasecontext;
		databasecontext = newDatabasecontext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataAccessPackage.ROOM_BOOKINGS_REPOSITORY__DATABASECONTEXT, oldDatabasecontext, databasecontext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void update(RoomBooking roomBooking) {
		databasecontext.getRoomBookings().set(databasecontext.getRoomBookings().indexOf(roomBooking),roomBooking);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EList<RoomBooking> getByRoomResponsible(String name) {
		EList<RoomBooking> bookings = new BasicEList<RoomBooking>();
		for (RoomBooking booking : databasecontext.getRoomBookings()){
			RoomResponsible roomresponsible = booking.getRoomresponsible();
			System.out.println(roomresponsible.getFirstName() + " " + roomresponsible.getLastName());
			if((roomresponsible.getFirstName() + " " + roomresponsible.getLastName()).equals(name))
				bookings.add(booking);
		}
		return bookings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public RoomBooking getByReservationNr(int reservationNumber) {
		for (Reservation reservation : databasecontext.getReservations()){
			if(reservation.getReservationId() == reservationNumber)
				//TODO: Change to return list
				return reservation.getRoombooking().get(0);
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EList<RoomBooking> getAll() {
		return databasecontext.getRoomBookings();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public RoomBooking getByRoomNr(int roomNr) {
		// TODO: implement this method, check get by room responsible
		// Ensure that you remove @generated or mark it @generated NOT
		EList<RoomBooking> bookings = getAll();
		
		for(RoomBooking booking: bookings)
			if (booking.getRoom().getNumber() == roomNr)
				return booking;
		System.out.println("Cannot find booking");
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataAccessPackage.ROOM_BOOKINGS_REPOSITORY__DATABASECONTEXT:
				if (resolve) return getDatabasecontext();
				return basicGetDatabasecontext();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DataAccessPackage.ROOM_BOOKINGS_REPOSITORY__DATABASECONTEXT:
				setDatabasecontext((DatabaseContext)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DataAccessPackage.ROOM_BOOKINGS_REPOSITORY__DATABASECONTEXT:
				setDatabasecontext((DatabaseContext)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DataAccessPackage.ROOM_BOOKINGS_REPOSITORY__DATABASECONTEXT:
				return databasecontext != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case DataAccessPackage.ROOM_BOOKINGS_REPOSITORY___UPDATE__ROOMBOOKING:
				update((RoomBooking)arguments.get(0));
				return null;
			case DataAccessPackage.ROOM_BOOKINGS_REPOSITORY___GET_BY_ROOM_RESPONSIBLE__STRING:
				return getByRoomResponsible((String)arguments.get(0));
			case DataAccessPackage.ROOM_BOOKINGS_REPOSITORY___GET_BY_RESERVATION_NR__INT:
				return getByReservationNr((Integer)arguments.get(0));
			case DataAccessPackage.ROOM_BOOKINGS_REPOSITORY___GET_ALL:
				return getAll();
			case DataAccessPackage.ROOM_BOOKINGS_REPOSITORY___GET_BY_ROOM_NR__INT:
				return getByRoomNr((Integer)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //RoomBookingsRepositoryImpl
