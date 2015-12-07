/**
 */
package SoftwareModel.BusinessLogic;

import SoftwareModel.DataAccess.RoomBookingsRepository;

import SoftwareModel.DomainEntities.RoomBooking;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room Bookings</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SoftwareModel.BusinessLogic.RoomBookings#getRoombookingsrepository <em>Roombookingsrepository</em>}</li>
 *   <li>{@link SoftwareModel.BusinessLogic.RoomBookings#getAvailibleroomfinder <em>Availibleroomfinder</em>}</li>
 * </ul>
 *
 * @see SoftwareModel.BusinessLogic.BusinessLogicPackage#getRoomBookings()
 * @model
 * @generated
 */
public interface RoomBookings extends EObject {
	/**
	 * Returns the value of the '<em><b>Roombookingsrepository</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roombookingsrepository</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roombookingsrepository</em>' containment reference.
	 * @see #setRoombookingsrepository(RoomBookingsRepository)
	 * @see SoftwareModel.BusinessLogic.BusinessLogicPackage#getRoomBookings_Roombookingsrepository()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	RoomBookingsRepository getRoombookingsrepository();

	/**
	 * Sets the value of the '{@link SoftwareModel.BusinessLogic.RoomBookings#getRoombookingsrepository <em>Roombookingsrepository</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Roombookingsrepository</em>' containment reference.
	 * @see #getRoombookingsrepository()
	 * @generated
	 */
	void setRoombookingsrepository(RoomBookingsRepository value);

	/**
	 * Returns the value of the '<em><b>Availibleroomfinder</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Availibleroomfinder</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Availibleroomfinder</em>' reference.
	 * @see #setAvailibleroomfinder(AvailibleRoomFinder)
	 * @see SoftwareModel.BusinessLogic.BusinessLogicPackage#getRoomBookings_Availibleroomfinder()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	AvailibleRoomFinder getAvailibleroomfinder();

	/**
	 * Sets the value of the '{@link SoftwareModel.BusinessLogic.RoomBookings#getAvailibleroomfinder <em>Availibleroomfinder</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Availibleroomfinder</em>' reference.
	 * @see #getAvailibleroomfinder()
	 * @generated
	 */
	void setAvailibleroomfinder(AvailibleRoomFinder value);

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
	RoomBooking findByRoomNr(int roomNr);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false" roomResponsibleDataType="org.eclipse.uml2.types.String" roomResponsibleRequired="true" roomResponsibleOrdered="false"
	 * @generated
	 */
	EList<RoomBooking> findByRoomResponsible(String roomResponsible);

} // RoomBookings
