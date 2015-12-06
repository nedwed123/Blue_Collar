/**
 */
package SoftwareModel.Presentation;

import SoftwareModel.BusinessLogic.Reservations;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reservation View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SoftwareModel.Presentation.ReservationView#getReservations <em>Reservations</em>}</li>
 * </ul>
 *
 * @see SoftwareModel.Presentation.PresentationPackage#getReservationView()
 * @model
 * @generated
 */
public interface ReservationView extends IView {

	/**
	 * Returns the value of the '<em><b>Reservations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reservations</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reservations</em>' containment reference.
	 * @see #setReservations(Reservations)
	 * @see SoftwareModel.Presentation.PresentationPackage#getReservationView_Reservations()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Reservations getReservations();

	/**
	 * Sets the value of the '{@link SoftwareModel.Presentation.ReservationView#getReservations <em>Reservations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reservations</em>' containment reference.
	 * @see #getReservations()
	 * @generated
	 */
	void setReservations(Reservations value);
} // ReservationView
