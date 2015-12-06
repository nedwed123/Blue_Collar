/**
 */
package SoftwareModel.DataAccess.impl;

import SoftwareModel.DataAccess.DataAccessPackage;
import SoftwareModel.DataAccess.DatabaseContext;

import SoftwareModel.DomainEntities.Reservation;
import SoftwareModel.DomainEntities.Room;
import SoftwareModel.DomainEntities.RoomBooking;
import SoftwareModel.DomainEntities.RoomType;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Database Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link SoftwareModel.DataAccess.impl.DatabaseContextImpl#getRooms <em>Rooms</em>}</li>
 *   <li>{@link SoftwareModel.DataAccess.impl.DatabaseContextImpl#getRoomTypes <em>Room Types</em>}</li>
 *   <li>{@link SoftwareModel.DataAccess.impl.DatabaseContextImpl#getReservations <em>Reservations</em>}</li>
 *   <li>{@link SoftwareModel.DataAccess.impl.DatabaseContextImpl#getRoomBookings <em>Room Bookings</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DatabaseContextImpl extends MinimalEObjectImpl.Container implements DatabaseContext {
	/**
	 * The cached value of the '{@link #getRooms() <em>Rooms</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRooms()
	 * @generated
	 * @ordered
	 */
	protected EList<Room> rooms;

	/**
	 * The cached value of the '{@link #getRoomTypes() <em>Room Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<RoomType> roomTypes;

	/**
	 * The cached value of the '{@link #getReservations() <em>Reservations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReservations()
	 * @generated
	 * @ordered
	 */
	protected EList<Reservation> reservations;

	/**
	 * The cached value of the '{@link #getRoomBookings() <em>Room Bookings</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomBookings()
	 * @generated
	 * @ordered
	 */
	protected EList<RoomBooking> roomBookings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabaseContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataAccessPackage.Literals.DATABASE_CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Room> getRooms() {
		if (rooms == null) {
			rooms = new EObjectResolvingEList<Room>(Room.class, this, DataAccessPackage.DATABASE_CONTEXT__ROOMS);
		}
		return rooms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RoomType> getRoomTypes() {
		if (roomTypes == null) {
			roomTypes = new EObjectResolvingEList<RoomType>(RoomType.class, this, DataAccessPackage.DATABASE_CONTEXT__ROOM_TYPES);
		}
		return roomTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reservation> getReservations() {
		if (reservations == null) {
			reservations = new EObjectResolvingEList<Reservation>(Reservation.class, this, DataAccessPackage.DATABASE_CONTEXT__RESERVATIONS);
		}
		return reservations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RoomBooking> getRoomBookings() {
		if (roomBookings == null) {
			roomBookings = new EObjectResolvingEList<RoomBooking>(RoomBooking.class, this, DataAccessPackage.DATABASE_CONTEXT__ROOM_BOOKINGS);
		}
		return roomBookings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataAccessPackage.DATABASE_CONTEXT__ROOMS:
				return getRooms();
			case DataAccessPackage.DATABASE_CONTEXT__ROOM_TYPES:
				return getRoomTypes();
			case DataAccessPackage.DATABASE_CONTEXT__RESERVATIONS:
				return getReservations();
			case DataAccessPackage.DATABASE_CONTEXT__ROOM_BOOKINGS:
				return getRoomBookings();
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
			case DataAccessPackage.DATABASE_CONTEXT__ROOMS:
				getRooms().clear();
				getRooms().addAll((Collection<? extends Room>)newValue);
				return;
			case DataAccessPackage.DATABASE_CONTEXT__ROOM_TYPES:
				getRoomTypes().clear();
				getRoomTypes().addAll((Collection<? extends RoomType>)newValue);
				return;
			case DataAccessPackage.DATABASE_CONTEXT__RESERVATIONS:
				getReservations().clear();
				getReservations().addAll((Collection<? extends Reservation>)newValue);
				return;
			case DataAccessPackage.DATABASE_CONTEXT__ROOM_BOOKINGS:
				getRoomBookings().clear();
				getRoomBookings().addAll((Collection<? extends RoomBooking>)newValue);
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
			case DataAccessPackage.DATABASE_CONTEXT__ROOMS:
				getRooms().clear();
				return;
			case DataAccessPackage.DATABASE_CONTEXT__ROOM_TYPES:
				getRoomTypes().clear();
				return;
			case DataAccessPackage.DATABASE_CONTEXT__RESERVATIONS:
				getReservations().clear();
				return;
			case DataAccessPackage.DATABASE_CONTEXT__ROOM_BOOKINGS:
				getRoomBookings().clear();
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
			case DataAccessPackage.DATABASE_CONTEXT__ROOMS:
				return rooms != null && !rooms.isEmpty();
			case DataAccessPackage.DATABASE_CONTEXT__ROOM_TYPES:
				return roomTypes != null && !roomTypes.isEmpty();
			case DataAccessPackage.DATABASE_CONTEXT__RESERVATIONS:
				return reservations != null && !reservations.isEmpty();
			case DataAccessPackage.DATABASE_CONTEXT__ROOM_BOOKINGS:
				return roomBookings != null && !roomBookings.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DatabaseContextImpl
