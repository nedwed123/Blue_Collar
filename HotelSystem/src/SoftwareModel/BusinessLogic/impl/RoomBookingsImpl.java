/**
 */
package SoftwareModel.BusinessLogic.impl;

import SoftwareModel.BusinessLogic.AvailibleRoomFinder;
import SoftwareModel.BusinessLogic.BusinessLogicPackage;
import SoftwareModel.BusinessLogic.RoomBookings;

import SoftwareModel.DataAccess.RoomBookingsRepository;
import SoftwareModel.DataAccess.impl.RoomBookingsRepositoryImpl;
import SoftwareModel.DomainEntities.RoomBooking;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
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
	 * The cached value of the '{@link #getRoombookingsrepository() <em>Roombookingsrepository</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoombookingsrepository()
	
	 * @ordered
	 */
	protected RoomBookingsRepository roombookingsrepository = new RoomBookingsRepositoryImpl();

	/**
	 * The cached value of the '{@link #getAvailibleroomfinder() <em>Availibleroomfinder</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailibleroomfinder()
	
	 * @ordered
	 */
	protected AvailibleRoomFinder availibleroomfinder = new AvailibleRoomFinderImpl();


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
		return roombookingsrepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoombookingsrepository(RoomBookingsRepository newRoombookingsrepository, NotificationChain msgs) {
		RoomBookingsRepository oldRoombookingsrepository = roombookingsrepository;
		roombookingsrepository = newRoombookingsrepository;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BusinessLogicPackage.ROOM_BOOKINGS__ROOMBOOKINGSREPOSITORY, oldRoombookingsrepository, newRoombookingsrepository);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoombookingsrepository(RoomBookingsRepository newRoombookingsrepository) {
		if (newRoombookingsrepository != roombookingsrepository) {
			NotificationChain msgs = null;
			if (roombookingsrepository != null)
				msgs = ((InternalEObject)roombookingsrepository).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BusinessLogicPackage.ROOM_BOOKINGS__ROOMBOOKINGSREPOSITORY, null, msgs);
			if (newRoombookingsrepository != null)
				msgs = ((InternalEObject)newRoombookingsrepository).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BusinessLogicPackage.ROOM_BOOKINGS__ROOMBOOKINGSREPOSITORY, null, msgs);
			msgs = basicSetRoombookingsrepository(newRoombookingsrepository, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BusinessLogicPackage.ROOM_BOOKINGS__ROOMBOOKINGSREPOSITORY, newRoombookingsrepository, newRoombookingsrepository));
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
	public int checkIn(RoomBooking roomBooking) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	public RoomBooking findByRoomNr(int roomNr) {
		return roombookingsrepository.getByRoomNr(roomNr);//roombookingsrepository.ge;
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		//throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RoomBooking> findByRoomResponsible(String roomResponsible) {
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
			case BusinessLogicPackage.ROOM_BOOKINGS__ROOMBOOKINGSREPOSITORY:
				return basicSetRoombookingsrepository(null, msgs);
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
			case BusinessLogicPackage.ROOM_BOOKINGS__ROOMBOOKINGSREPOSITORY:
				return getRoombookingsrepository();
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
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case BusinessLogicPackage.ROOM_BOOKINGS___CHECK_OUT__ROOMBOOKING:
				checkOut((RoomBooking)arguments.get(0));
				return null;
			case BusinessLogicPackage.ROOM_BOOKINGS___CHECK_IN__ROOMBOOKING:
				return checkIn((RoomBooking)arguments.get(0));
			case BusinessLogicPackage.ROOM_BOOKINGS___FIND_BY_ROOM_NR__INT:
				return findByRoomNr((Integer)arguments.get(0));
			case BusinessLogicPackage.ROOM_BOOKINGS___FIND_BY_ROOM_RESPONSIBLE__STRING:
				return findByRoomResponsible((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //RoomBookingsImpl
