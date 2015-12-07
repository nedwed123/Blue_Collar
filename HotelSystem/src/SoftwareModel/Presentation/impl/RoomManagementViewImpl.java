/**
 */
package SoftwareModel.Presentation.impl;

import SoftwareModel.BusinessLogic.RoomOperations;
import SoftwareModel.BusinessLogic.impl.RoomOperationsImpl;
import SoftwareModel.Presentation.Frame;
import SoftwareModel.Presentation.PresentationPackage;
import SoftwareModel.Presentation.RoomManagementView;
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
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Room Management View</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link SoftwareModel.Presentation.impl.RoomManagementViewImpl#getRoomoperations <em>Roomoperations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoomManagementViewImpl extends MinimalEObjectImpl.Container implements RoomManagementView {
	/**
	 * The cached value of the '{@link #getRoomoperations()
	 * <em>Roomoperations</em>}' containment reference. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getRoomoperations()
	 * @ordered
	 */
	protected RoomOperations roomoperations = new RoomOperationsImpl();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public RoomManagementViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PresentationPackage.Literals.ROOM_MANAGEMENT_VIEW;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public RoomOperations getRoomoperations() {
		return roomoperations;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoomoperations(RoomOperations newRoomoperations, NotificationChain msgs) {
		RoomOperations oldRoomoperations = roomoperations;
		roomoperations = newRoomoperations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PresentationPackage.ROOM_MANAGEMENT_VIEW__ROOMOPERATIONS, oldRoomoperations, newRoomoperations);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoomoperations(RoomOperations newRoomoperations) {
		if (newRoomoperations != roomoperations) {
			NotificationChain msgs = null;
			if (roomoperations != null)
				msgs = ((InternalEObject)roomoperations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PresentationPackage.ROOM_MANAGEMENT_VIEW__ROOMOPERATIONS, null, msgs);
			if (newRoomoperations != null)
				msgs = ((InternalEObject)newRoomoperations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PresentationPackage.ROOM_MANAGEMENT_VIEW__ROOMOPERATIONS, null, msgs);
			msgs = basicSetRoomoperations(newRoomoperations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationPackage.ROOM_MANAGEMENT_VIEW__ROOMOPERATIONS, newRoomoperations, newRoomoperations));
	}

	/**
	 * <!-- begin-user-doc --> 
	 * <!-- end-user-doc -->
	 */
	public void run(Frame frame) {
		System.out.print("Available operations: \n" + "1.Add Room \n" + "2.Modify Rate \n" + "3.Make Room Available \n"
				+ "4.Make Room Unavailable \n" + "5.Remove Room \n");
		Scanner scan = new Scanner(System.in);
		int choice = scan.nextInt();
		/*switch (choice) {
		case 1:
			System.out.println("Please enter room number to add");
			int roomNumber = scan.nextInt();
			System.out.println("Please choose Availability \n" + "1.Available \n" + "2.To Be Cleaned \n"
					+ "3.Under Maintenence \n" + "4.Occupied");
			int statusChoice = scan.nextInt();
			switch (statusChoice) {
			case 1:
				roomoperations.addRoom(roomNumber, Availability.AVAILIBLE, "");
				break;
			case 2:
				roomoperations.addRoom(roomNumber, Availability.TO_BE_CLEANED, "");
				break;
			case 3:
				roomoperations.addRoom(roomNumber, Availability.UNDER_MAINTENENCE, "");
				break;
			case 4:
				roomoperations.addRoom(roomNumber, Availability.USED, "");
				break;
			default:
				break;
			}
		case 2:
			System.out.println("Please enter room type id");
			String roomTypeId=scan.next();
			System.out.println("Please enter the new rate");
			double rate=scan.nextDouble();
			roomoperations.modifyRate(roomTypeId, rate);
			break;
		case 3:
			System.out.println("Please enter room number to make available");
			int roomNumberAv=scan.nextInt();
			roomoperations.makeRoomAvailable(roomNumberAv);
			break;
		case 4:
			System.out.println("Please enter room number to make unavailable");
			int roomNumUnav=scan.nextInt();
			roomoperations.makeRoomUnavailable(roomNumUnav);
			break;
		case 5:
			System.out.println("Please enter room number to remove");
			int roomNumberR=scan.nextInt();
			roomoperations.removeRoom(roomNumberR);
		default:
			break;
		

		}*/
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		//throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PresentationPackage.ROOM_MANAGEMENT_VIEW__ROOMOPERATIONS:
				return basicSetRoomoperations(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PresentationPackage.ROOM_MANAGEMENT_VIEW__ROOMOPERATIONS:
				return getRoomoperations();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PresentationPackage.ROOM_MANAGEMENT_VIEW__ROOMOPERATIONS:
				setRoomoperations((RoomOperations)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PresentationPackage.ROOM_MANAGEMENT_VIEW__ROOMOPERATIONS:
				setRoomoperations((RoomOperations)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PresentationPackage.ROOM_MANAGEMENT_VIEW__ROOMOPERATIONS:
				return roomoperations != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case PresentationPackage.ROOM_MANAGEMENT_VIEW___RUN__FRAME:
				run((Frame)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} // RoomManagementViewImpl
