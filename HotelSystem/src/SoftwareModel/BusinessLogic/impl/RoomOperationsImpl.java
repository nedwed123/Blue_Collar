/**
 */
package SoftwareModel.BusinessLogic.impl;

import SoftwareModel.BusinessLogic.BusinessLogicPackage;
import SoftwareModel.BusinessLogic.RoomOperations;

import SoftwareModel.DataAccess.RoomRepository;
import SoftwareModel.DataAccess.impl.RoomRepositoryImpl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.Enumerator;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Room Operations</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link SoftwareModel.BusinessLogic.impl.RoomOperationsImpl#getRoomrepository <em>Roomrepository</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoomOperationsImpl extends MinimalEObjectImpl.Container implements RoomOperations {
	/**
	 * The cached value of the '{@link #getRoomrepository() <em>Roomrepository</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomrepository()
	 * @ordered
	 */
	protected RoomRepository roomrepository = new RoomRepositoryImpl();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomOperationsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BusinessLogicPackage.Literals.ROOM_OPERATIONS;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BusinessLogicPackage.ROOM_OPERATIONS__ROOMREPOSITORY, oldRoomrepository, newRoomrepository);
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
				msgs = ((InternalEObject)roomrepository).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BusinessLogicPackage.ROOM_OPERATIONS__ROOMREPOSITORY, null, msgs);
			if (newRoomrepository != null)
				msgs = ((InternalEObject)newRoomrepository).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BusinessLogicPackage.ROOM_OPERATIONS__ROOMREPOSITORY, null, msgs);
			msgs = basicSetRoomrepository(newRoomrepository, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BusinessLogicPackage.ROOM_OPERATIONS__ROOMREPOSITORY, newRoomrepository, newRoomrepository));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void modifyRate(int roomTypeId, double rate) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void makeRoomAvailable(int roomNumber) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addRoom(int roomNumber, Enumerator availability) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeRoom(int roomNumber) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void makeRoomUnavailable(int roomNumber) {
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
			case BusinessLogicPackage.ROOM_OPERATIONS__ROOMREPOSITORY:
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
			case BusinessLogicPackage.ROOM_OPERATIONS__ROOMREPOSITORY:
				return getRoomrepository();
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
			case BusinessLogicPackage.ROOM_OPERATIONS__ROOMREPOSITORY:
				setRoomrepository((RoomRepository)newValue);
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
			case BusinessLogicPackage.ROOM_OPERATIONS__ROOMREPOSITORY:
				setRoomrepository((RoomRepository)null);
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
			case BusinessLogicPackage.ROOM_OPERATIONS__ROOMREPOSITORY:
				return roomrepository != null;
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
			case BusinessLogicPackage.ROOM_OPERATIONS___MODIFY_RATE__INT_DOUBLE:
				modifyRate((Integer)arguments.get(0), (Double)arguments.get(1));
				return null;
			case BusinessLogicPackage.ROOM_OPERATIONS___MAKE_ROOM_AVAILABLE__INT:
				makeRoomAvailable((Integer)arguments.get(0));
				return null;
			case BusinessLogicPackage.ROOM_OPERATIONS___ADD_ROOM__INT_ENUMERATOR:
				addRoom((Integer)arguments.get(0), (Enumerator)arguments.get(1));
				return null;
			case BusinessLogicPackage.ROOM_OPERATIONS___REMOVE_ROOM__INT:
				removeRoom((Integer)arguments.get(0));
				return null;
			case BusinessLogicPackage.ROOM_OPERATIONS___MAKE_ROOM_UNAVAILABLE__INT:
				makeRoomUnavailable((Integer)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //RoomOperationsImpl
