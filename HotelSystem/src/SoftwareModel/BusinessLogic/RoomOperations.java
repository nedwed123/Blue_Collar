/**
 */
package SoftwareModel.BusinessLogic;

import SoftwareModel.DataAccess.RoomRepository;

import org.eclipse.emf.common.util.Enumerator;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room Operations</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SoftwareModel.BusinessLogic.RoomOperations#getRoomrepository <em>Roomrepository</em>}</li>
 * </ul>
 *
 * @see SoftwareModel.BusinessLogic.BusinessLogicPackage#getRoomOperations()
 * @model
 * @generated
 */
public interface RoomOperations extends EObject {
	/**
	 * Returns the value of the '<em><b>Roomrepository</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roomrepository</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roomrepository</em>' containment reference.
	 * @see #setRoomrepository(RoomRepository)
	 * @see SoftwareModel.BusinessLogic.BusinessLogicPackage#getRoomOperations_Roomrepository()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	RoomRepository getRoomrepository();

	/**
	 * Sets the value of the '{@link SoftwareModel.BusinessLogic.RoomOperations#getRoomrepository <em>Roomrepository</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Roomrepository</em>' containment reference.
	 * @see #getRoomrepository()
	 * @generated
	 */
	void setRoomrepository(RoomRepository value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model roomTypeIdRequired="true" roomTypeIdOrdered="false" rateRequired="true" rateOrdered="false"
	 * @generated
	 */
	void modifyRate(int roomTypeId, double rate);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model roomNumberRequired="true" roomNumberOrdered="false"
	 * @generated
	 */
	void makeRoomAvailable(int roomNumber);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model roomNumberRequired="true" roomNumberOrdered="false" availabilityRequired="true" availabilityOrdered="false"
	 * @generated
	 */
	void addRoom(int roomNumber, Enumerator availability);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model roomNumberRequired="true" roomNumberOrdered="false"
	 * @generated
	 */
	void removeRoom(int roomNumber);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model roomNumberRequired="true" roomNumberOrdered="false"
	 * @generated
	 */
	void makeRoomUnavailable(int roomNumber);

} // RoomOperations
