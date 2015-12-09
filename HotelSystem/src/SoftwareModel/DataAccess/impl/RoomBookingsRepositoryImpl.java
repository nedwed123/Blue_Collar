/**
 */
package SoftwareModel.DataAccess.impl;

import SoftwareModel.DataAccess.DataAccessPackage;
import SoftwareModel.DataAccess.DatabaseContext;
import SoftwareModel.DataAccess.RoomBookingsRepository;

import SoftwareModel.DomainEntities.RoomBooking;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

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
	 * @generated
	 */
	public void update(RoomBooking roomBooking) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomBooking getByRoomResponsible(String name) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomBooking getByReservationNr(int reservationNumber) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RoomBooking> getAll() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomBooking getByRoomNr(int roomNr) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		EList<RoomBooking> bookings = databasecontext.getRoomBookings();
		
		throw new UnsupportedOperationException();
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
