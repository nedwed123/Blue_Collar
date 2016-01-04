/**
 */
package SoftwareModel.DomainEntities.impl;

import SoftwareModel.DomainEntities.DomainEntitiesPackage;
import SoftwareModel.DomainEntities.Room;
import SoftwareModel.DomainEntities.RoomBooking;
import SoftwareModel.DomainEntities.RoomResponsible;
import SoftwareModel.DomainEntities.RoomType;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Room Booking</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link SoftwareModel.DomainEntities.impl.RoomBookingImpl#isIsCheckedIn <em>Is Checked In</em>}</li>
 *   <li>{@link SoftwareModel.DomainEntities.impl.RoomBookingImpl#getRoomresponsible <em>Roomresponsible</em>}</li>
 *   <li>{@link SoftwareModel.DomainEntities.impl.RoomBookingImpl#getAdults <em>Adults</em>}</li>
 *   <li>{@link SoftwareModel.DomainEntities.impl.RoomBookingImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link SoftwareModel.DomainEntities.impl.RoomBookingImpl#getCheckOutDate <em>Check Out Date</em>}</li>
 *   <li>{@link SoftwareModel.DomainEntities.impl.RoomBookingImpl#getCheckInDate <em>Check In Date</em>}</li>
 *   <li>{@link SoftwareModel.DomainEntities.impl.RoomBookingImpl#getRoomtype <em>Roomtype</em>}</li>
 *   <li>{@link SoftwareModel.DomainEntities.impl.RoomBookingImpl#getRoom <em>Room</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoomBookingImpl extends MinimalEObjectImpl.Container implements RoomBooking {
	/**
	 * The default value of the '{@link #isIsCheckedIn() <em>Is Checked In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsCheckedIn()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_CHECKED_IN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsCheckedIn() <em>Is Checked In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsCheckedIn()
	 * @generated
	 * @ordered
	 */
	protected boolean isCheckedIn = IS_CHECKED_IN_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRoomresponsible() <em>Roomresponsible</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomresponsible()
	 * @generated
	 * @ordered
	 */
	protected RoomResponsible roomresponsible;

	/**
	 * The default value of the '{@link #getAdults() <em>Adults</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdults()
	 * @generated
	 * @ordered
	 */
	protected static final int ADULTS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAdults() <em>Adults</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdults()
	 * @generated
	 * @ordered
	 */
	protected int adults = ADULTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getChildren() <em>Children</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
	protected static final int CHILDREN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getChildren() <em>Children</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
	protected int children = CHILDREN_EDEFAULT;

	/**
	 * The default value of the '{@link #getCheckOutDate() <em>Check Out Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheckOutDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date CHECK_OUT_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCheckOutDate() <em>Check Out Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheckOutDate()
	 * @generated
	 * @ordered
	 */
	protected Date checkOutDate = CHECK_OUT_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCheckInDate() <em>Check In Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheckInDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date CHECK_IN_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCheckInDate() <em>Check In Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheckInDate()
	 * @generated
	 * @ordered
	 */
	protected Date checkInDate = CHECK_IN_DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRoomtype() <em>Roomtype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomtype()
	 * @generated
	 * @ordered
	 */
	protected RoomType roomtype;

	/**
	 * The cached value of the '{@link #getRoom() <em>Room</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoom()
	 * @generated
	 * @ordered
	 */
	protected Room room;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomBookingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomainEntitiesPackage.Literals.ROOM_BOOKING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsCheckedIn() {
		return isCheckedIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsCheckedIn(boolean newIsCheckedIn) {
		boolean oldIsCheckedIn = isCheckedIn;
		isCheckedIn = newIsCheckedIn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainEntitiesPackage.ROOM_BOOKING__IS_CHECKED_IN, oldIsCheckedIn, isCheckedIn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomResponsible getRoomresponsible() {
		if (roomresponsible != null && roomresponsible.eIsProxy()) {
			InternalEObject oldRoomresponsible = (InternalEObject)roomresponsible;
			roomresponsible = (RoomResponsible)eResolveProxy(oldRoomresponsible);
			if (roomresponsible != oldRoomresponsible) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainEntitiesPackage.ROOM_BOOKING__ROOMRESPONSIBLE, oldRoomresponsible, roomresponsible));
			}
		}
		return roomresponsible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomResponsible basicGetRoomresponsible() {
		return roomresponsible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoomresponsible(RoomResponsible newRoomresponsible) {
		RoomResponsible oldRoomresponsible = roomresponsible;
		roomresponsible = newRoomresponsible;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainEntitiesPackage.ROOM_BOOKING__ROOMRESPONSIBLE, oldRoomresponsible, roomresponsible));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAdults() {
		return adults;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdults(int newAdults) {
		int oldAdults = adults;
		adults = newAdults;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainEntitiesPackage.ROOM_BOOKING__ADULTS, oldAdults, adults));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getChildren() {
		return children;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChildren(int newChildren) {
		int oldChildren = children;
		children = newChildren;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainEntitiesPackage.ROOM_BOOKING__CHILDREN, oldChildren, children));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getCheckOutDate() {
		return checkOutDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCheckOutDate(Date newCheckOutDate) {
		Date oldCheckOutDate = checkOutDate;
		checkOutDate = newCheckOutDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainEntitiesPackage.ROOM_BOOKING__CHECK_OUT_DATE, oldCheckOutDate, checkOutDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getCheckInDate() {
		return checkInDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCheckInDate(Date newCheckInDate) {
		Date oldCheckInDate = checkInDate;
		checkInDate = newCheckInDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainEntitiesPackage.ROOM_BOOKING__CHECK_IN_DATE, oldCheckInDate, checkInDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomType getRoomtype() {
		if (roomtype != null && roomtype.eIsProxy()) {
			InternalEObject oldRoomtype = (InternalEObject)roomtype;
			roomtype = (RoomType)eResolveProxy(oldRoomtype);
			if (roomtype != oldRoomtype) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainEntitiesPackage.ROOM_BOOKING__ROOMTYPE, oldRoomtype, roomtype));
			}
		}
		return roomtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomType basicGetRoomtype() {
		return roomtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoomtype(RoomType newRoomtype) {
		RoomType oldRoomtype = roomtype;
		roomtype = newRoomtype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainEntitiesPackage.ROOM_BOOKING__ROOMTYPE, oldRoomtype, roomtype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Room getRoom() {
		if (room != null && room.eIsProxy()) {
			InternalEObject oldRoom = (InternalEObject)room;
			room = (Room)eResolveProxy(oldRoom);
			if (room != oldRoom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainEntitiesPackage.ROOM_BOOKING__ROOM, oldRoom, room));
			}
		}
		return room;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Room basicGetRoom() {
		return room;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoom(Room newRoom) {
		Room oldRoom = room;
		room = newRoom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainEntitiesPackage.ROOM_BOOKING__ROOM, oldRoom, room));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void checkIn() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void checkOut() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
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
			case DomainEntitiesPackage.ROOM_BOOKING__IS_CHECKED_IN:
				return isIsCheckedIn();
			case DomainEntitiesPackage.ROOM_BOOKING__ROOMRESPONSIBLE:
				if (resolve) return getRoomresponsible();
				return basicGetRoomresponsible();
			case DomainEntitiesPackage.ROOM_BOOKING__ADULTS:
				return getAdults();
			case DomainEntitiesPackage.ROOM_BOOKING__CHILDREN:
				return getChildren();
			case DomainEntitiesPackage.ROOM_BOOKING__CHECK_OUT_DATE:
				return getCheckOutDate();
			case DomainEntitiesPackage.ROOM_BOOKING__CHECK_IN_DATE:
				return getCheckInDate();
			case DomainEntitiesPackage.ROOM_BOOKING__ROOMTYPE:
				if (resolve) return getRoomtype();
				return basicGetRoomtype();
			case DomainEntitiesPackage.ROOM_BOOKING__ROOM:
				if (resolve) return getRoom();
				return basicGetRoom();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DomainEntitiesPackage.ROOM_BOOKING__IS_CHECKED_IN:
				setIsCheckedIn((Boolean)newValue);
				return;
			case DomainEntitiesPackage.ROOM_BOOKING__ROOMRESPONSIBLE:
				setRoomresponsible((RoomResponsible)newValue);
				return;
			case DomainEntitiesPackage.ROOM_BOOKING__ADULTS:
				setAdults((Integer)newValue);
				return;
			case DomainEntitiesPackage.ROOM_BOOKING__CHILDREN:
				setChildren((Integer)newValue);
				return;
			case DomainEntitiesPackage.ROOM_BOOKING__CHECK_OUT_DATE:
				setCheckOutDate((Date)newValue);
				return;
			case DomainEntitiesPackage.ROOM_BOOKING__CHECK_IN_DATE:
				setCheckInDate((Date)newValue);
				return;
			case DomainEntitiesPackage.ROOM_BOOKING__ROOMTYPE:
				setRoomtype((RoomType)newValue);
				return;
			case DomainEntitiesPackage.ROOM_BOOKING__ROOM:
				setRoom((Room)newValue);
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
			case DomainEntitiesPackage.ROOM_BOOKING__IS_CHECKED_IN:
				setIsCheckedIn(IS_CHECKED_IN_EDEFAULT);
				return;
			case DomainEntitiesPackage.ROOM_BOOKING__ROOMRESPONSIBLE:
				setRoomresponsible((RoomResponsible)null);
				return;
			case DomainEntitiesPackage.ROOM_BOOKING__ADULTS:
				setAdults(ADULTS_EDEFAULT);
				return;
			case DomainEntitiesPackage.ROOM_BOOKING__CHILDREN:
				setChildren(CHILDREN_EDEFAULT);
				return;
			case DomainEntitiesPackage.ROOM_BOOKING__CHECK_OUT_DATE:
				setCheckOutDate(CHECK_OUT_DATE_EDEFAULT);
				return;
			case DomainEntitiesPackage.ROOM_BOOKING__CHECK_IN_DATE:
				setCheckInDate(CHECK_IN_DATE_EDEFAULT);
				return;
			case DomainEntitiesPackage.ROOM_BOOKING__ROOMTYPE:
				setRoomtype((RoomType)null);
				return;
			case DomainEntitiesPackage.ROOM_BOOKING__ROOM:
				setRoom((Room)null);
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
			case DomainEntitiesPackage.ROOM_BOOKING__IS_CHECKED_IN:
				return isCheckedIn != IS_CHECKED_IN_EDEFAULT;
			case DomainEntitiesPackage.ROOM_BOOKING__ROOMRESPONSIBLE:
				return roomresponsible != null;
			case DomainEntitiesPackage.ROOM_BOOKING__ADULTS:
				return adults != ADULTS_EDEFAULT;
			case DomainEntitiesPackage.ROOM_BOOKING__CHILDREN:
				return children != CHILDREN_EDEFAULT;
			case DomainEntitiesPackage.ROOM_BOOKING__CHECK_OUT_DATE:
				return CHECK_OUT_DATE_EDEFAULT == null ? checkOutDate != null : !CHECK_OUT_DATE_EDEFAULT.equals(checkOutDate);
			case DomainEntitiesPackage.ROOM_BOOKING__CHECK_IN_DATE:
				return CHECK_IN_DATE_EDEFAULT == null ? checkInDate != null : !CHECK_IN_DATE_EDEFAULT.equals(checkInDate);
			case DomainEntitiesPackage.ROOM_BOOKING__ROOMTYPE:
				return roomtype != null;
			case DomainEntitiesPackage.ROOM_BOOKING__ROOM:
				return room != null;
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
			case DomainEntitiesPackage.ROOM_BOOKING___CHECK_IN:
				checkIn();
				return null;
			case DomainEntitiesPackage.ROOM_BOOKING___CHECK_OUT:
				checkOut();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer();
		result.append(" (IsCheckedIn: ");
		result.append(isCheckedIn);
		result.append(", adults: ");
		result.append(adults);
		result.append(", children: ");
		result.append(children);
		result.append(", checkOutDate: ");
		result.append(checkOutDate);
		result.append(", checkInDate: ");
		result.append(checkInDate);
		result.append(')');
		return result.toString();
	}

} //RoomBookingImpl
