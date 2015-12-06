/**
 */
package SoftwareModel.Presentation.impl;

import SoftwareModel.BusinessLogic.RoomOperations;
import SoftwareModel.Presentation.Frame;
import SoftwareModel.Presentation.PresentationPackage;
import SoftwareModel.Presentation.RoomManagementView;

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
 * An implementation of the model object '<em><b>Room Management View</b></em>'.
 * <!-- end-user-doc -->
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
	 * The cached value of the '{@link #getRoomoperations() <em>Roomoperations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomoperations()
	 * @generated
	 * @ordered
	 */
	protected RoomOperations roomoperations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomManagementViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PresentationPackage.Literals.ROOM_MANAGEMENT_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomOperations getRoomoperations() {
		return roomoperations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	 * @generated
	 */
	public void Run(Frame frame) {
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
			case PresentationPackage.ROOM_MANAGEMENT_VIEW__ROOMOPERATIONS:
				return basicSetRoomoperations(null, msgs);
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
			case PresentationPackage.ROOM_MANAGEMENT_VIEW__ROOMOPERATIONS:
				return getRoomoperations();
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
			case PresentationPackage.ROOM_MANAGEMENT_VIEW__ROOMOPERATIONS:
				setRoomoperations((RoomOperations)newValue);
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
			case PresentationPackage.ROOM_MANAGEMENT_VIEW__ROOMOPERATIONS:
				setRoomoperations((RoomOperations)null);
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
			case PresentationPackage.ROOM_MANAGEMENT_VIEW__ROOMOPERATIONS:
				return roomoperations != null;
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
			case PresentationPackage.ROOM_MANAGEMENT_VIEW___RUN__FRAME:
				Run((Frame)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //RoomManagementViewImpl
