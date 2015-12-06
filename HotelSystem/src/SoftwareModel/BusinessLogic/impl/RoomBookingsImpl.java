/**
 */
package SoftwareModel.BusinessLogic.impl;

import SoftwareModel.BusinessLogic.AvailibleRoomFinder;
import SoftwareModel.BusinessLogic.BusinessLogicPackage;
import SoftwareModel.BusinessLogic.RoomBookings;

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
 * An implementation of the model object '<em><b>Room Bookings</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link SoftwareModel.BusinessLogic.impl.RoomBookingsImpl#getRoombookingsrepository <em>Roombookingsrepository</em>}</li>
 *   <li>{@link SoftwareModel.BusinessLogic.impl.RoomBookingsImpl#getAvailibleroomfinder <em>Availibleroomfinder</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoomBookingsImpl extends MinimalEObjectImpl.Container implements RoomBookings {
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
	 * The cached value of the '{@link #getAvailibleroomfinder() <em>Availibleroomfinder</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailibleroomfinder()
	 * @generated
	 * @ordered
	 */
	protected AvailibleRoomFinder availibleroomfinder;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomBookingsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BusinessLogicPackage.Literals.ROOM_BOOKINGS;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BusinessLogicPackage.ROOM_BOOKINGS__ROOMBOOKINGSREPOSITORY, oldRoombookingsrepository, roombookingsrepository));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BusinessLogicPackage.ROOM_BOOKINGS__ROOMBOOKINGSREPOSITORY, oldRoombookingsrepository, roombookingsrepository));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AvailibleRoomFinder getAvailibleroomfinder() {
		if (availibleroomfinder != null && availibleroomfinder.eIsProxy()) {
			InternalEObject oldAvailibleroomfinder = (InternalEObject)availibleroomfinder;
			availibleroomfinder = (AvailibleRoomFinder)eResolveProxy(oldAvailibleroomfinder);
			if (availibleroomfinder != oldAvailibleroomfinder) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BusinessLogicPackage.ROOM_BOOKINGS__AVAILIBLEROOMFINDER, oldAvailibleroomfinder, availibleroomfinder));
			}
		}
		return availibleroomfinder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AvailibleRoomFinder basicGetAvailibleroomfinder() {
		return availibleroomfinder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvailibleroomfinder(AvailibleRoomFinder newAvailibleroomfinder) {
		AvailibleRoomFinder oldAvailibleroomfinder = availibleroomfinder;
		availibleroomfinder = newAvailibleroomfinder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BusinessLogicPackage.ROOM_BOOKINGS__AVAILIBLEROOMFINDER, oldAvailibleroomfinder, availibleroomfinder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void checkOut(RoomBooking roomBooking) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void checkIn(RoomBooking roomBooking) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void findByRoomNr(int roomNr) {
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
			case BusinessLogicPackage.ROOM_BOOKINGS__ROOMBOOKINGSREPOSITORY:
				if (resolve) return getRoombookingsrepository();
				return basicGetRoombookingsrepository();
			case BusinessLogicPackage.ROOM_BOOKINGS__AVAILIBLEROOMFINDER:
				if (resolve) return getAvailibleroomfinder();
				return basicGetAvailibleroomfinder();
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
			case BusinessLogicPackage.ROOM_BOOKINGS__ROOMBOOKINGSREPOSITORY:
				setRoombookingsrepository((RoomBookingsRepository)newValue);
				return;
			case BusinessLogicPackage.ROOM_BOOKINGS__AVAILIBLEROOMFINDER:
				setAvailibleroomfinder((AvailibleRoomFinder)newValue);
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
			case BusinessLogicPackage.ROOM_BOOKINGS__ROOMBOOKINGSREPOSITORY:
				setRoombookingsrepository((RoomBookingsRepository)null);
				return;
			case BusinessLogicPackage.ROOM_BOOKINGS__AVAILIBLEROOMFINDER:
				setAvailibleroomfinder((AvailibleRoomFinder)null);
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
			case BusinessLogicPackage.ROOM_BOOKINGS__ROOMBOOKINGSREPOSITORY:
				return roombookingsrepository != null;
			case BusinessLogicPackage.ROOM_BOOKINGS__AVAILIBLEROOMFINDER:
				return availibleroomfinder != null;
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
			case BusinessLogicPackage.ROOM_BOOKINGS___CHECK_OUT__ROOMBOOKING:
				checkOut((RoomBooking)arguments.get(0));
				return null;
			case BusinessLogicPackage.ROOM_BOOKINGS___CHECK_IN__ROOMBOOKING:
				checkIn((RoomBooking)arguments.get(0));
				return null;
			case BusinessLogicPackage.ROOM_BOOKINGS___FIND_BY_ROOM_NR__INT:
				findByRoomNr((Integer)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //RoomBookingsImpl
