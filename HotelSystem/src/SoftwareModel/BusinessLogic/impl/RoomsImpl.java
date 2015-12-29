/**
 */
package SoftwareModel.BusinessLogic.impl;

import SoftwareModel.BusinessLogic.AvailibleRoomFinder;
import SoftwareModel.BusinessLogic.BusinessLogicPackage;
import SoftwareModel.BusinessLogic.RoomBookings;
import SoftwareModel.BusinessLogic.Rooms;
import SoftwareModel.DomainEntities.RoomBooking;
import SoftwareModel.DomainEntities.RoomType;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rooms</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link SoftwareModel.BusinessLogic.impl.RoomsImpl#getAvailibleroomfinder <em>Availibleroomfinder</em>}</li>
 *   <li>{@link SoftwareModel.BusinessLogic.impl.RoomsImpl#getRoombookings <em>Roombookings</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoomsImpl extends MinimalEObjectImpl.Container implements Rooms {
	/**
	 * The cached value of the '{@link #getAvailibleroomfinder() <em>Availibleroomfinder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailibleroomfinder()
	
	 * @ordered
	 */
	protected AvailibleRoomFinder availibleroomfinder = new AvailibleRoomFinderImpl();
	/**
	 * The cached value of the '{@link #getRoombookings() <em>Roombookings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoombookings()

	 * @ordered
	 */
	protected RoomBookings roombookings = new RoomBookingsImpl();



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BusinessLogicPackage.Literals.ROOMS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AvailibleRoomFinder getAvailibleroomfinder() {
		return availibleroomfinder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAvailibleroomfinder(AvailibleRoomFinder newAvailibleroomfinder, NotificationChain msgs) {
		AvailibleRoomFinder oldAvailibleroomfinder = availibleroomfinder;
		availibleroomfinder = newAvailibleroomfinder;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BusinessLogicPackage.ROOMS__AVAILIBLEROOMFINDER, oldAvailibleroomfinder, newAvailibleroomfinder);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvailibleroomfinder(AvailibleRoomFinder newAvailibleroomfinder) {
		if (newAvailibleroomfinder != availibleroomfinder) {
			NotificationChain msgs = null;
			if (availibleroomfinder != null)
				msgs = ((InternalEObject)availibleroomfinder).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BusinessLogicPackage.ROOMS__AVAILIBLEROOMFINDER, null, msgs);
			if (newAvailibleroomfinder != null)
				msgs = ((InternalEObject)newAvailibleroomfinder).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BusinessLogicPackage.ROOMS__AVAILIBLEROOMFINDER, null, msgs);
			msgs = basicSetAvailibleroomfinder(newAvailibleroomfinder, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BusinessLogicPackage.ROOMS__AVAILIBLEROOMFINDER, newAvailibleroomfinder, newAvailibleroomfinder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomBookings getRoombookings() {
		return roombookings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoombookings(RoomBookings newRoombookings, NotificationChain msgs) {
		RoomBookings oldRoombookings = roombookings;
		roombookings = newRoombookings;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BusinessLogicPackage.ROOMS__ROOMBOOKINGS, oldRoombookings, newRoombookings);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoombookings(RoomBookings newRoombookings) {
		if (newRoombookings != roombookings) {
			NotificationChain msgs = null;
			if (roombookings != null)
				msgs = ((InternalEObject)roombookings).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BusinessLogicPackage.ROOMS__ROOMBOOKINGS, null, msgs);
			if (newRoombookings != null)
				msgs = ((InternalEObject)newRoombookings).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BusinessLogicPackage.ROOMS__ROOMBOOKINGS, null, msgs);
			msgs = basicSetRoombookings(newRoombookings, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BusinessLogicPackage.ROOMS__ROOMBOOKINGS, newRoombookings, newRoombookings));
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

	public RoomBooking getBooking(int roomNr) {
		
		return roombookings.findByRoomNr(roomNr);
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		//throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EList<RoomType> availibleRoomTypes(int adults, int children, Date startDate, Date endDate) {
		return availibleroomfinder.availableRoomTypes(adults,children,startDate,endDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RoomBooking> getBooking(String nameOfRoomResponsible) {
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
			case BusinessLogicPackage.ROOMS__AVAILIBLEROOMFINDER:
				return basicSetAvailibleroomfinder(null, msgs);
			case BusinessLogicPackage.ROOMS__ROOMBOOKINGS:
				return basicSetRoombookings(null, msgs);
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
			case BusinessLogicPackage.ROOMS__AVAILIBLEROOMFINDER:
				return getAvailibleroomfinder();
			case BusinessLogicPackage.ROOMS__ROOMBOOKINGS:
				return getRoombookings();
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
			case BusinessLogicPackage.ROOMS__AVAILIBLEROOMFINDER:
				setAvailibleroomfinder((AvailibleRoomFinder)newValue);
				return;
			case BusinessLogicPackage.ROOMS__ROOMBOOKINGS:
				setRoombookings((RoomBookings)newValue);
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
			case BusinessLogicPackage.ROOMS__AVAILIBLEROOMFINDER:
				setAvailibleroomfinder((AvailibleRoomFinder)null);
				return;
			case BusinessLogicPackage.ROOMS__ROOMBOOKINGS:
				setRoombookings((RoomBookings)null);
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
			case BusinessLogicPackage.ROOMS__AVAILIBLEROOMFINDER:
				return availibleroomfinder != null;
			case BusinessLogicPackage.ROOMS__ROOMBOOKINGS:
				return roombookings != null;
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
			case BusinessLogicPackage.ROOMS___CHECK_OUT__ROOMBOOKING:
				checkOut((RoomBooking)arguments.get(0));
				return null;
			case BusinessLogicPackage.ROOMS___CHECK_IN__ROOMBOOKING:
				return checkIn((RoomBooking)arguments.get(0));
			case BusinessLogicPackage.ROOMS___GET_BOOKING__INT:
				return getBooking((Integer)arguments.get(0));
			case BusinessLogicPackage.ROOMS___AVAILIBLE_ROOM_TYPES__INT_INT_DATE_DATE:
				return availibleRoomTypes((Integer)arguments.get(0), (Integer)arguments.get(1), (Date)arguments.get(2), (Date)arguments.get(3));
			case BusinessLogicPackage.ROOMS___GET_BOOKING__STRING:
				return getBooking((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //RoomsImpl
