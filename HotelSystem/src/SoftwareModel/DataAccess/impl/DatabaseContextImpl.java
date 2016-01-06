/**
 */
package SoftwareModel.DataAccess.impl;

import SoftwareModel.DataAccess.DataAccessPackage;
import SoftwareModel.DataAccess.DatabaseContext;
import SoftwareModel.DomainEntities.Availability;
import SoftwareModel.DomainEntities.BedType;
import SoftwareModel.DomainEntities.Reservation;
import SoftwareModel.DomainEntities.Room;
import SoftwareModel.DomainEntities.RoomBooking;
import SoftwareModel.DomainEntities.RoomType;
import SoftwareModel.DomainEntities.impl.RoomImpl;
import SoftwareModel.DomainEntities.impl.RoomTypeImpl;

import java.util.Collection;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
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
 *   <li>{@link SoftwareModel.DataAccess.impl.DatabaseContextImpl#getPasswords <em>Passwords</em>}</li>
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
	 * The cached value of the '{@link #getPasswords() <em>Passwords</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPasswords()
	 * @generated
	 * @ordered
	 */
	protected EList<String> passwords;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public DatabaseContextImpl() {
		super();		
		EList<BedType> singleBed = new BasicEList<BedType>();
		EList<BedType> doubleBed = new BasicEList<BedType>();
		EList<BedType> juniorBed = new BasicEList<BedType>();
		EList<BedType> superiorBed = new BasicEList<BedType>();
		
		singleBed.add(0, BedType.SINGLE);
		singleBed.add(1, BedType.KID);
		
		doubleBed.add(0, BedType.SINGLE);
		doubleBed.add(1, BedType.SINGLE);
		doubleBed.add(2, BedType.KID);
		
		juniorBed.add(0, BedType.QUEEN);
		
		superiorBed.add(0, BedType.KING);
		
		roomTypes = getRoomTypes();
		
		roomTypes.add(0, new RoomTypeImpl("Single Room", singleBed ,300.0, 25.0));
		roomTypes.add(1, new RoomTypeImpl("Double Room", doubleBed, 450.0, 35.0));
		roomTypes.add(2, new RoomTypeImpl("Junior Suite", juniorBed, 550.0, 45.0));
		roomTypes.add(3, new RoomTypeImpl("Superior Suite", superiorBed, 700.0, 60.0));
		
		rooms = getRooms();
		
		rooms.add(new RoomImpl(101, roomTypes.get(0), Availability.TO_BE_CLEANED));
		rooms.add(new RoomImpl(102, roomTypes.get(1), Availability.AVAILIBLE));
		rooms.add(new RoomImpl(201, roomTypes.get(2), Availability.AVAILIBLE));
		rooms.add(new RoomImpl(202, roomTypes.get(3), Availability.AVAILIBLE));
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
	public EList<String> getPasswords() {
		if (passwords == null) {
			passwords = new EDataTypeUniqueEList<String>(String.class, this, DataAccessPackage.DATABASE_CONTEXT__PASSWORDS);
		}
		return passwords;
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
			case DataAccessPackage.DATABASE_CONTEXT__PASSWORDS:
				return getPasswords();
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
			case DataAccessPackage.DATABASE_CONTEXT__PASSWORDS:
				getPasswords().clear();
				getPasswords().addAll((Collection<? extends String>)newValue);
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
			case DataAccessPackage.DATABASE_CONTEXT__PASSWORDS:
				getPasswords().clear();
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
			case DataAccessPackage.DATABASE_CONTEXT__PASSWORDS:
				return passwords != null && !passwords.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (passwords: ");
		result.append(passwords);
		result.append(')');
		return result.toString();
	}

	public static DatabaseContext instance = null;
	
	public static DatabaseContext GetNewDatabaseContext(){
		instance = GetDatabaseContext();
		instance.getRooms().clear();
		instance.getReservations().clear();
		instance.getRoomBookings().clear();
		instance.getRoomTypes().clear();
		return instance;
	}
	
	public static DatabaseContext GetDatabaseContext() {
		if(instance == null)
			instance = new DatabaseContextImpl();
		return instance;
	}

} //DatabaseContextImpl
