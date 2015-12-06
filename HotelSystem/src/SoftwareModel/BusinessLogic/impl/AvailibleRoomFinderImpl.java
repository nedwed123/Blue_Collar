/**
 */
package SoftwareModel.BusinessLogic.impl;

import SoftwareModel.BusinessLogic.AvailibleRoomFinder;
import SoftwareModel.BusinessLogic.BusinessLogicPackage;

import SoftwareModel.DataAccess.RoomBookingsRepository;
import SoftwareModel.DataAccess.RoomRepository;

import SoftwareModel.DomainEntities.RoomBooking;
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
	 * The cached value of the '{@link #getRoomrepository() <em>Roomrepository</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomrepository()
	 * @generated
	 * @ordered
	 */
	protected RoomRepository roomrepository;

	/**
	 * The cached value of the '{@link #getRoombookingsrepository() <em>Roombookingsrepository</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoombookingsrepository()
	 * @generated
	 * @ordered
	 */
	protected RoomBookingsRepository roombookingsrepository;

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
		if (roomrepository != null && roomrepository.eIsProxy()) {
			InternalEObject oldRoomrepository = (InternalEObject)roomrepository;
			roomrepository = (RoomRepository)eResolveProxy(oldRoomrepository);
			if (roomrepository != oldRoomrepository) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BusinessLogicPackage.AVAILIBLE_ROOM_FINDER__ROOMREPOSITORY, oldRoomrepository, roomrepository));
			}
		}
		return roomrepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomRepository basicGetRoomrepository() {
		return roomrepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoomrepository(RoomRepository newRoomrepository) {
		RoomRepository oldRoomrepository = roomrepository;
		roomrepository = newRoomrepository;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BusinessLogicPackage.AVAILIBLE_ROOM_FINDER__ROOMREPOSITORY, oldRoomrepository, roomrepository));
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
	public RoomType availableRoomTypes(int adults, int children, Date startDate, Date endDate) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void availibleRoom(RoomBooking roomBooking) {
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
			case BusinessLogicPackage.AVAILIBLE_ROOM_FINDER__ROOMREPOSITORY:
				if (resolve) return getRoomrepository();
				return basicGetRoomrepository();
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
				availibleRoom((RoomBooking)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //AvailibleRoomFinderImpl
