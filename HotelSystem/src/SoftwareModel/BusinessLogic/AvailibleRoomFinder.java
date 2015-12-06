/**
 */
package SoftwareModel.BusinessLogic;

import SoftwareModel.DataAccess.RoomBookingsRepository;
import SoftwareModel.DataAccess.RoomRepository;

import SoftwareModel.DomainEntities.RoomBooking;
import SoftwareModel.DomainEntities.RoomType;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Availible Room Finder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SoftwareModel.BusinessLogic.AvailibleRoomFinder#getRoomrepository <em>Roomrepository</em>}</li>
 *   <li>{@link SoftwareModel.BusinessLogic.AvailibleRoomFinder#getRoombookingsrepository <em>Roombookingsrepository</em>}</li>
 * </ul>
 *
 * @see SoftwareModel.BusinessLogic.BusinessLogicPackage#getAvailibleRoomFinder()
 * @model
 * @generated
 */
public interface AvailibleRoomFinder extends EObject {
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
	 * @see SoftwareModel.BusinessLogic.BusinessLogicPackage#getAvailibleRoomFinder_Roomrepository()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	RoomRepository getRoomrepository();

	/**
	 * Sets the value of the '{@link SoftwareModel.BusinessLogic.AvailibleRoomFinder#getRoomrepository <em>Roomrepository</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Roomrepository</em>' containment reference.
	 * @see #getRoomrepository()
	 * @generated
	 */
	void setRoomrepository(RoomRepository value);

	/**
	 * Returns the value of the '<em><b>Roombookingsrepository</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roombookingsrepository</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roombookingsrepository</em>' reference.
	 * @see #setRoombookingsrepository(RoomBookingsRepository)
	 * @see SoftwareModel.BusinessLogic.BusinessLogicPackage#getAvailibleRoomFinder_Roombookingsrepository()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	RoomBookingsRepository getRoombookingsrepository();

	/**
	 * Sets the value of the '{@link SoftwareModel.BusinessLogic.AvailibleRoomFinder#getRoombookingsrepository <em>Roombookingsrepository</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Roombookingsrepository</em>' reference.
	 * @see #getRoombookingsrepository()
	 * @generated
	 */
	void setRoombookingsrepository(RoomBookingsRepository value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" adultsRequired="true" adultsOrdered="false" childrenRequired="true" childrenOrdered="false" startDateRequired="true" startDateOrdered="false" endDateRequired="true" endDateOrdered="false"
	 * @generated
	 */
	RoomType availableRoomTypes(int adults, int children, Date startDate, Date endDate);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model roomBookingRequired="true" roomBookingOrdered="false"
	 * @generated
	 */
	void availibleRoom(RoomBooking roomBooking);

} // AvailibleRoomFinder
