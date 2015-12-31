/**
 */
package SoftwareModel.Presentation.impl;

import SoftwareModel.BusinessLogic.RoomOperations;
import SoftwareModel.BusinessLogic.impl.RoomOperationsImpl;
import SoftwareModel.DomainEntities.Availability;
import SoftwareModel.Presentation.Frame;
import SoftwareModel.Presentation.PresentationPackage;
import SoftwareModel.Presentation.RoomManagementView;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import java.lang.reflect.InvocationTargetException;

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
		frame.displayMenu("Available operations:",
				new Frame.MenuItem[]{
						new Frame.MenuItem("Add Room ",
								new Runnable() {
									@Override
									public void run() {
										int roomNumber = frame.input("room number to add");
										Availability availability = (Availability)frame.displaySelectionMenu("Please choose Availability",
												new Availability[] {Availability.AVAILIBLE,Availability.TO_BE_CLEANED,Availability.UNDER_MAINTENENCE,Availability.USED});
										roomoperations.addRoom(roomNumber, availability, "");
									}
								}
						),
						new Frame.MenuItem("Modify Rate",
								new Runnable() {
									@Override
									public void run() {
										String roomTypeId = frame.inputTextFor("room type id");
										double rate = frame.inputDoubleFor("the new rate");
										roomoperations.modifyRate(roomTypeId, rate);
									}
								}
						),
						new Frame.MenuItem("Make room Availible",
								new Runnable() {
									@Override
									public void run() {
										roomoperations.makeRoomAvailable(frame.input("room number to make available"));
									}
								}
						),
						new Frame.MenuItem("Make room Unavailible",
								new Runnable() {
									@Override
									public void run() {
										roomoperations.makeRoomUnavailable(frame.input("room number to make unavailable"));
									}
								}
						),
						new Frame.MenuItem("Remove room",
								new Runnable() {
									@Override
									public void run() {
										roomoperations.removeRoom(frame.input("room number to remove"));
									}
								}
						)
				});

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
