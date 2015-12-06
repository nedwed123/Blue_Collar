/**
 */
package SoftwareModel.BusinessLogic.impl;

import SoftwareModel.BusinessLogic.BusinessLogicPackage;
import SoftwareModel.BusinessLogic.RoomOperations;

import SoftwareModel.DataAccess.RoomRepository;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

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
	 * The cached value of the '{@link #getRoomrepository() <em>Roomrepository</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomrepository()
	 * @generated
	 * @ordered
	 */
	protected RoomRepository roomrepository;

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
		if (roomrepository != null && roomrepository.eIsProxy()) {
			InternalEObject oldRoomrepository = (InternalEObject)roomrepository;
			roomrepository = (RoomRepository)eResolveProxy(oldRoomrepository);
			if (roomrepository != oldRoomrepository) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BusinessLogicPackage.ROOM_OPERATIONS__ROOMREPOSITORY, oldRoomrepository, roomrepository));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BusinessLogicPackage.ROOM_OPERATIONS__ROOMREPOSITORY, oldRoomrepository, roomrepository));
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BusinessLogicPackage.ROOM_OPERATIONS__ROOMREPOSITORY:
				if (resolve) return getRoomrepository();
				return basicGetRoomrepository();
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
