/**
 */
package SoftwareModel.Presentation.impl;

import SoftwareModel.BusinessLogic.Rooms;
import SoftwareModel.BusinessLogic.impl.RoomsImpl;
import SoftwareModel.DomainEntities.RoomBooking;
import SoftwareModel.Presentation.Frame;
import SoftwareModel.Presentation.PresentationPackage;
import SoftwareModel.Presentation.RoomBookingView;

import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Room Booking View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link SoftwareModel.Presentation.impl.RoomBookingViewImpl#getRooms <em>Rooms</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoomBookingViewImpl extends MinimalEObjectImpl.Container implements RoomBookingView {
	/**
	 * The cached value of the '{@link #getRooms() <em>Rooms</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRooms()
	 * @ordered
	 */
	protected Rooms rooms = new RoomsImpl();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomBookingViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PresentationPackage.Literals.ROOM_BOOKING_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rooms getRooms() {
		return rooms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRooms(Rooms newRooms, NotificationChain msgs) {
		Rooms oldRooms = rooms;
		rooms = newRooms;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PresentationPackage.ROOM_BOOKING_VIEW__ROOMS, oldRooms, newRooms);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRooms(Rooms newRooms) {
		if (newRooms != rooms) {
			NotificationChain msgs = null;
			if (rooms != null)
				msgs = ((InternalEObject)rooms).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PresentationPackage.ROOM_BOOKING_VIEW__ROOMS, null, msgs);
			if (newRooms != null)
				msgs = ((InternalEObject)newRooms).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PresentationPackage.ROOM_BOOKING_VIEW__ROOMS, null, msgs);
			msgs = basicSetRooms(newRooms, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationPackage.ROOM_BOOKING_VIEW__ROOMS, newRooms, newRooms));
	}
	
	private boolean isInt(String input){
	    return input.matches("\\d+");
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void Run(Frame frame) {
		System.out.println("Input room nr or name of room responsible guest");

		Scanner in = new Scanner(System.in);
		String input = in.next();
		
		RoomBooking roombooking;
		// could be inside getBooking?
		if(isInt(input)){
			roombooking = rooms.getBooking(Integer.parseInt(input));
		}else{
			roombooking = rooms.getBooking(input);
		}
		
		if(roombooking == null){
			System.out.println("Unable to find roombooking");
			frame.ChangeView(new EmployeeHomeViewImpl());
		}
		
		// Display room booking

		System.out.println("What do you want to do with the room booking?"
				+ "1: Check in guests"
				+ "2: Check out guests");
		
		//TODO: input switch
		
		//rooms.checkIn(roomBooking);
		//rooms.checkOut(roomBooking);
		
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
			case PresentationPackage.ROOM_BOOKING_VIEW__ROOMS:
				return basicSetRooms(null, msgs);
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
			case PresentationPackage.ROOM_BOOKING_VIEW__ROOMS:
				return getRooms();
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
			case PresentationPackage.ROOM_BOOKING_VIEW__ROOMS:
				setRooms((Rooms)newValue);
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
			case PresentationPackage.ROOM_BOOKING_VIEW__ROOMS:
				setRooms((Rooms)null);
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
			case PresentationPackage.ROOM_BOOKING_VIEW__ROOMS:
				return rooms != null;
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
			case PresentationPackage.ROOM_BOOKING_VIEW___RUN__FRAME:
				Run((Frame)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //RoomBookingViewImpl
