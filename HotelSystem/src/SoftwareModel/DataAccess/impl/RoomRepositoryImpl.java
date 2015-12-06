/**
 */
package SoftwareModel.DataAccess.impl;

import SoftwareModel.DataAccess.DataAccessPackage;
import SoftwareModel.DataAccess.DatabaseContext;
import SoftwareModel.DataAccess.RoomRepository;

import SoftwareModel.DomainEntities.Room;
import SoftwareModel.DomainEntities.RoomType;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Room Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link SoftwareModel.DataAccess.impl.RoomRepositoryImpl#getDatabasecontext <em>Databasecontext</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoomRepositoryImpl extends MinimalEObjectImpl.Container implements RoomRepository {
	/**
	 * The cached value of the '{@link #getDatabasecontext() <em>Databasecontext</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabasecontext()
	 * @generated
	 * @ordered
	 */
	protected DatabaseContext databasecontext;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomRepositoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataAccessPackage.Literals.ROOM_REPOSITORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabaseContext getDatabasecontext() {
		if (databasecontext != null && databasecontext.eIsProxy()) {
			InternalEObject oldDatabasecontext = (InternalEObject)databasecontext;
			databasecontext = (DatabaseContext)eResolveProxy(oldDatabasecontext);
			if (databasecontext != oldDatabasecontext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataAccessPackage.ROOM_REPOSITORY__DATABASECONTEXT, oldDatabasecontext, databasecontext));
			}
		}
		return databasecontext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabaseContext basicGetDatabasecontext() {
		return databasecontext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatabasecontext(DatabaseContext newDatabasecontext) {
		DatabaseContext oldDatabasecontext = databasecontext;
		databasecontext = newDatabasecontext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataAccessPackage.ROOM_REPOSITORY__DATABASECONTEXT, oldDatabasecontext, databasecontext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * Updates a room object in the database, UnsupportedOperationException if the room does not exist in the database
	 * <!-- end-user-doc -->
	 */
	public void updateRoom(Room room) {
		EList<Room> rooms = databasecontext.getRooms();
		for (int i = 0; i < rooms.size(); i++) {
			Room room2 = rooms.get(i);
			if(room.getNumber() == room2.getNumber()){
				rooms.set(i, room2);
				return;
			}
		}
		
		throw new UnsupportedOperationException("Room did not exist in database");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void updateRoomType(RoomType roomType) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getRoom(int roomNumber) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getRoomType(int roomTypeId) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeRoom(Room room) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addRoom(Room room) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Room getRooms() {
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
			case DataAccessPackage.ROOM_REPOSITORY__DATABASECONTEXT:
				if (resolve) return getDatabasecontext();
				return basicGetDatabasecontext();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DataAccessPackage.ROOM_REPOSITORY__DATABASECONTEXT:
				setDatabasecontext((DatabaseContext)newValue);
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
			case DataAccessPackage.ROOM_REPOSITORY__DATABASECONTEXT:
				setDatabasecontext((DatabaseContext)null);
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
			case DataAccessPackage.ROOM_REPOSITORY__DATABASECONTEXT:
				return databasecontext != null;
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
			case DataAccessPackage.ROOM_REPOSITORY___UPDATE_ROOM__ROOM:
				updateRoom((Room)arguments.get(0));
				return null;
			case DataAccessPackage.ROOM_REPOSITORY___UPDATE_ROOM_TYPE__ROOMTYPE:
				updateRoomType((RoomType)arguments.get(0));
				return null;
			case DataAccessPackage.ROOM_REPOSITORY___GET_ROOM__INT:
				getRoom((Integer)arguments.get(0));
				return null;
			case DataAccessPackage.ROOM_REPOSITORY___GET_ROOM_TYPE__INT:
				getRoomType((Integer)arguments.get(0));
				return null;
			case DataAccessPackage.ROOM_REPOSITORY___REMOVE_ROOM__ROOM:
				removeRoom((Room)arguments.get(0));
				return null;
			case DataAccessPackage.ROOM_REPOSITORY___ADD_ROOM__ROOM:
				addRoom((Room)arguments.get(0));
				return null;
			case DataAccessPackage.ROOM_REPOSITORY___GET_ROOMS:
				return getRooms();
		}
		return super.eInvoke(operationID, arguments);
	}

} //RoomRepositoryImpl
