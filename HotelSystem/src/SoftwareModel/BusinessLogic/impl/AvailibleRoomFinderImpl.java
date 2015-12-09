/**
 */
package SoftwareModel.BusinessLogic.impl;

import SoftwareModel.BusinessLogic.AvailibleRoomFinder;
import SoftwareModel.BusinessLogic.BusinessLogicPackage;

import SoftwareModel.DataAccess.RoomBookingsRepository;
import SoftwareModel.DataAccess.RoomRepository;
import SoftwareModel.DataAccess.impl.RoomBookingsRepositoryImpl;
import SoftwareModel.DataAccess.impl.RoomRepositoryImpl;
import SoftwareModel.DomainEntities.Room;
import SoftwareModel.DomainEntities.RoomBooking;
import SoftwareModel.DomainEntities.RoomType;

import java.lang.reflect.InvocationTargetException;

import java.util.Date;
import java.util.Iterator;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Availible Room Finder</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link SoftwareModel.BusinessLogic.impl.AvailibleRoomFinderImpl#getRoomrepository <em>Roomrepository</em>}</li>
 *   <li>{@link SoftwareModel.BusinessLogic.impl.AvailibleRoomFinderImpl#getRoombookingsrepository <em>Roombookingsrepository</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AvailibleRoomFinderImpl extends MinimalEObjectImpl.Container implements AvailibleRoomFinder {
	/**
	 * The cached value of the '{@link #getRoomrepository() <em>Roomrepository</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomrepository()
	 * @ordered
	 */
	protected RoomRepository roomrepository = new RoomRepositoryImpl();

	/**
	 * The cached value of the '{@link #getRoombookingsrepository() <em>Roombookingsrepository</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoombookingsrepository()
	 * @ordered
	 */
	protected RoomBookingsRepository roombookingsrepository = new RoomBookingsRepositoryImpl();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AvailibleRoomFinderImpl() {
		super();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public AvailibleRoomFinderImpl(RoomBookingsRepository roomBookings,RoomRepository rooms) {
		super();
		roombookingsrepository = roomBookings;
		roomrepository = rooms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BusinessLogicPackage.Literals.AVAILIBLE_ROOM_FINDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomRepository getRoomrepository() {
		return roomrepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoomrepository(RoomRepository newRoomrepository, NotificationChain msgs) {
		RoomRepository oldRoomrepository = roomrepository;
		roomrepository = newRoomrepository;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BusinessLogicPackage.AVAILIBLE_ROOM_FINDER__ROOMREPOSITORY, oldRoomrepository, newRoomrepository);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoomrepository(RoomRepository newRoomrepository) {
		if (newRoomrepository != roomrepository) {
			NotificationChain msgs = null;
			if (roomrepository != null)
				msgs = ((InternalEObject)roomrepository).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BusinessLogicPackage.AVAILIBLE_ROOM_FINDER__ROOMREPOSITORY, null, msgs);
			if (newRoomrepository != null)
				msgs = ((InternalEObject)newRoomrepository).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BusinessLogicPackage.AVAILIBLE_ROOM_FINDER__ROOMREPOSITORY, null, msgs);
			msgs = basicSetRoomrepository(newRoomrepository, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BusinessLogicPackage.AVAILIBLE_ROOM_FINDER__ROOMREPOSITORY, newRoomrepository, newRoomrepository));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomBookingsRepository getRoombookingsrepository() {
		if (roombookingsrepository != null && roombookingsrepository.eIsProxy()) {
			InternalEObject oldRoombookingsrepository = (InternalEObject)roombookingsrepository;
			roombookingsrepository = (RoomBookingsRepository)eResolveProxy(oldRoombookingsrepository);
			if (roombookingsrepository != oldRoombookingsrepository) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BusinessLogicPackage.AVAILIBLE_ROOM_FINDER__ROOMBOOKINGSREPOSITORY, oldRoombookingsrepository, roombookingsrepository));
			}
		}
		return roombookingsrepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomBookingsRepository basicGetRoombookingsrepository() {
		return roombookingsrepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoombookingsrepository(RoomBookingsRepository newRoombookingsrepository) {
		RoomBookingsRepository oldRoombookingsrepository = roombookingsrepository;
		roombookingsrepository = newRoombookingsrepository;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BusinessLogicPackage.AVAILIBLE_ROOM_FINDER__ROOMBOOKINGSREPOSITORY, oldRoombookingsrepository, roombookingsrepository));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RoomType> availableRoomTypes(int adults, int children, Date startDate, Date endDate) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		
		EList<RoomBooking> roomBookings = roombookingsrepository.getAll();
		EList<Room> rooms = roomrepository.getRooms();
		EList<RoomBooking> collidingRoomBookings = new BasicEList<RoomBooking>();
		EList<RoomType> roomTypes = new BasicEList<RoomType>();

		for (int i = 0; i < roomBookings.size(); i++) {
			if (!(endDate.before(roomBookings.get(i).getCheckInDate())
					|| startDate.after(roomBookings.get(i).getCheckOutDate()))) {
				collidingRoomBookings.add(roomBookings.get(i));
			}
		}
		
		for(int i = 0; i < rooms.size(); i++)
			roomTypes.add(rooms.get(i).getRoomtype());
		
		
		
		for (int i = 0; i < collidingRoomBookings.size(); i++){
			for (Iterator<RoomType> iterator = roomTypes.iterator(); iterator.hasNext();) {
			    RoomType roomType = iterator.next();
			    if (roomType.equals(collidingRoomBookings.get(i).getRoomtype())) {
			        // Remove the current element from the iterator and the list.
			        iterator.remove();
			    }
			}
		}
		
		return roomTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RoomType> availibleRoom(RoomBooking roomBooking) {
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BusinessLogicPackage.AVAILIBLE_ROOM_FINDER__ROOMREPOSITORY:
				return basicSetRoomrepository(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BusinessLogicPackage.AVAILIBLE_ROOM_FINDER__ROOMREPOSITORY:
				return getRoomrepository();
			case BusinessLogicPackage.AVAILIBLE_ROOM_FINDER__ROOMBOOKINGSREPOSITORY:
				if (resolve) return getRoombookingsrepository();
				return basicGetRoombookingsrepository();
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
			case BusinessLogicPackage.AVAILIBLE_ROOM_FINDER__ROOMREPOSITORY:
				setRoomrepository((RoomRepository)newValue);
				return;
			case BusinessLogicPackage.AVAILIBLE_ROOM_FINDER__ROOMBOOKINGSREPOSITORY:
				setRoombookingsrepository((RoomBookingsRepository)newValue);
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
			case BusinessLogicPackage.AVAILIBLE_ROOM_FINDER__ROOMREPOSITORY:
				setRoomrepository((RoomRepository)null);
				return;
			case BusinessLogicPackage.AVAILIBLE_ROOM_FINDER__ROOMBOOKINGSREPOSITORY:
				setRoombookingsrepository((RoomBookingsRepository)null);
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
			case BusinessLogicPackage.AVAILIBLE_ROOM_FINDER__ROOMREPOSITORY:
				return roomrepository != null;
			case BusinessLogicPackage.AVAILIBLE_ROOM_FINDER__ROOMBOOKINGSREPOSITORY:
				return roombookingsrepository != null;
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
			case BusinessLogicPackage.AVAILIBLE_ROOM_FINDER___AVAILABLE_ROOM_TYPES__INT_INT_DATE_DATE:
				return availableRoomTypes((Integer)arguments.get(0), (Integer)arguments.get(1), (Date)arguments.get(2), (Date)arguments.get(3));
			case BusinessLogicPackage.AVAILIBLE_ROOM_FINDER___AVAILIBLE_ROOM__ROOMBOOKING:
				return availibleRoom((RoomBooking)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //AvailibleRoomFinderImpl
