/**
 */
package SoftwareModel.BusinessLogic;

import SoftwareModel.DomainEntities.RoomBooking;
import SoftwareModel.DomainEntities.RoomType;

import java.util.Date;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rooms</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SoftwareModel.BusinessLogic.Rooms#getAvailibleroomfinder <em>Availibleroomfinder</em>}</li>
 *   <li>{@link SoftwareModel.BusinessLogic.Rooms#getRoombookings <em>Roombookings</em>}</li>
 * </ul>
 *
 * @see SoftwareModel.BusinessLogic.BusinessLogicPackage#getRooms()
 * @model
 * @generated
 */
public interface Rooms extends EObject {
	/**
	 * Returns the value of the '<em><b>Availibleroomfinder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Availibleroomfinder</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Availibleroomfinder</em>' containment reference.
	 * @see #setAvailibleroomfinder(AvailibleRoomFinder)
	 * @see SoftwareModel.BusinessLogic.BusinessLogicPackage#getRooms_Availibleroomfinder()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	AvailibleRoomFinder getAvailibleroomfinder();

	/**
	 * Sets the value of the '{@link SoftwareModel.BusinessLogic.Rooms#getAvailibleroomfinder <em>Availibleroomfinder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Availibleroomfinder</em>' containment reference.
	 * @see #getAvailibleroomfinder()
	 * @generated
	 */
	void setAvailibleroomfinder(AvailibleRoomFinder value);

	/**
	 * Returns the value of the '<em><b>Roombookings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roombookings</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roombookings</em>' containment reference.
	 * @see #setRoombookings(RoomBookings)
	 * @see SoftwareModel.BusinessLogic.BusinessLogicPackage#getRooms_Roombookings()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	RoomBookings getRoombookings();

	/**
	 * Sets the value of the '{@link SoftwareModel.BusinessLogic.Rooms#getRoombookings <em>Roombookings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Roombookings</em>' containment reference.
	 * @see #getRoombookings()
	 * @generated
	 */
	void setRoombookings(RoomBookings value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model roomBookingRequired="true" roomBookingOrdered="false"
	 * @generated
	 */
	void checkOut(RoomBooking roomBooking);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model roomBookingRequired="true" roomBookingOrdered="false"
	 * @generated
	 */
	void checkIn(RoomBooking roomBooking);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" roomNrDataType="org.eclipse.uml2.types.Integer" roomNrRequired="true" roomNrOrdered="false"
	 * @generated
	 */
	RoomBooking getBooking(int roomNr);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false" adultsDataType="org.eclipse.uml2.types.Integer" adultsRequired="true" adultsOrdered="false" childrenDataType="org.eclipse.uml2.types.Integer" childrenRequired="true" childrenOrdered="false" startDateRequired="true" startDateOrdered="false" endDateRequired="true" endDateOrdered="false"
	 * @generated
	 */
	EList<RoomType> availibleRoomTypes(int adults, int children, Date startDate, Date endDate);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" nameOfRoomResponsibleDataType="org.eclipse.uml2.types.String" nameOfRoomResponsibleRequired="true" nameOfRoomResponsibleOrdered="false"
	 * @generated
	 */
	RoomBooking getBooking(String nameOfRoomResponsible);

} // Rooms
