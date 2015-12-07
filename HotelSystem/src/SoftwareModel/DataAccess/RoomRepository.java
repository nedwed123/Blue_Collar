/**
 */
package SoftwareModel.DataAccess;

import SoftwareModel.DomainEntities.Room;
import SoftwareModel.DomainEntities.RoomType;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SoftwareModel.DataAccess.RoomRepository#getDatabasecontext <em>Databasecontext</em>}</li>
 * </ul>
 *
 * @see SoftwareModel.DataAccess.DataAccessPackage#getRoomRepository()
 * @model
 * @generated
 */
public interface RoomRepository extends EObject {
	/**
	 * Returns the value of the '<em><b>Databasecontext</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Databasecontext</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Databasecontext</em>' reference.
	 * @see #setDatabasecontext(DatabaseContext)
	 * @see SoftwareModel.DataAccess.DataAccessPackage#getRoomRepository_Databasecontext()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	DatabaseContext getDatabasecontext();

	/**
	 * Sets the value of the '{@link SoftwareModel.DataAccess.RoomRepository#getDatabasecontext <em>Databasecontext</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Databasecontext</em>' reference.
	 * @see #getDatabasecontext()
	 * @generated
	 */
	void setDatabasecontext(DatabaseContext value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model roomRequired="true" roomOrdered="false"
	 * @generated
	 */
	void updateRoom(Room room);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model roomTypeRequired="true" roomTypeOrdered="false"
	 * @generated
	 */
	void updateRoomType(RoomType roomType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model roomNumberRequired="true" roomNumberOrdered="false"
	 * @generated
	 */
	void getRoom(int roomNumber);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model roomTypeIdRequired="true" roomTypeIdOrdered="false"
	 * @generated
	 */
	void getRoomType(int roomTypeId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model roomRequired="true" roomOrdered="false"
	 * @generated
	 */
	void removeRoom(Room room);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model roomRequired="true" roomOrdered="false"
	 * @generated
	 */
	void addRoom(Room room);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 * @generated
	 */
	EList<Room> getRooms();

} // RoomRepository
