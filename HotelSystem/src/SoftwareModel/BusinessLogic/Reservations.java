/**
 */
package SoftwareModel.BusinessLogic;

import SoftwareModel.DataAccess.ReservationsRepository;

import SoftwareModel.DomainEntities.PaymentDetails;
import SoftwareModel.DomainEntities.Reservation;
import SoftwareModel.DomainEntities.RoomBooking;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reservations</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SoftwareModel.BusinessLogic.Reservations#getReservationsrepository <em>Reservationsrepository</em>}</li>
 * </ul>
 *
 * @see SoftwareModel.BusinessLogic.BusinessLogicPackage#getReservations()
 * @model
 * @generated
 */
public interface Reservations extends EObject {
	/**
	 * Returns the value of the '<em><b>Reservationsrepository</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reservationsrepository</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reservationsrepository</em>' containment reference.
	 * @see #setReservationsrepository(ReservationsRepository)
	 * @see SoftwareModel.BusinessLogic.BusinessLogicPackage#getReservations_Reservationsrepository()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	ReservationsRepository getReservationsrepository();

	/**
	 * Sets the value of the '{@link SoftwareModel.BusinessLogic.Reservations#getReservationsrepository <em>Reservationsrepository</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reservationsrepository</em>' containment reference.
	 * @see #getReservationsrepository()
	 * @generated
	 */
	void setReservationsrepository(ReservationsRepository value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model reservationRequired="true" reservationOrdered="false"
	 * @generated
	 */
	void updateReservationDetails(Reservation reservation);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" selectedRoomsRequired="true" selectedRoomsMany="true" selectedRoomsOrdered="false" paymentDetailsRequired="true" paymentDetailsOrdered="false" payNowRequired="true" payNowOrdered="false"
	 * @generated
	 */
	Reservation make(EList<RoomBooking> selectedRooms, PaymentDetails paymentDetails, boolean payNow);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model reservationRequired="true" reservationOrdered="false"
	 * @generated
	 */
	void cancel(Reservation reservation);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" reservationNumberDataType="org.eclipse.uml2.types.Integer" reservationNumberRequired="true" reservationNumberOrdered="false"
	 * @generated
	 */
	Reservation getReservation(int reservationNumber);

} // Reservations
