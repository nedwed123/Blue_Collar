/**
 */
package SoftwareModel.Presentation;

import SoftwareModel.BusinessLogic.Reservations;
import SoftwareModel.BusinessLogic.Rooms;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Make Reservation View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SoftwareModel.Presentation.MakeReservationView#getReservations <em>Reservations</em>}</li>
 *   <li>{@link SoftwareModel.Presentation.MakeReservationView#getRooms <em>Rooms</em>}</li>
 * </ul>
 *
 * @see SoftwareModel.Presentation.PresentationPackage#getMakeReservationView()
 * @model
 * @generated
 */
public interface MakeReservationView extends IView {

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
	 * @see SoftwareModel.Presentation.PresentationPackage#getMakeReservationView_Reservations()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Reservations getReservations();

	/**
	 * Sets the value of the '{@link SoftwareModel.Presentation.MakeReservationView#getReservations <em>Reservations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reservations</em>' containment reference.
	 * @see #getReservations()
	 * @generated
	 */
	void setReservations(Reservations value);

	/**
	 * Returns the value of the '<em><b>Rooms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rooms</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rooms</em>' reference.
	 * @see #setRooms(Rooms)
	 * @see SoftwareModel.Presentation.PresentationPackage#getMakeReservationView_Rooms()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Rooms getRooms();

	/**
	 * Sets the value of the '{@link SoftwareModel.Presentation.MakeReservationView#getRooms <em>Rooms</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rooms</em>' reference.
	 * @see #getRooms()
	 * @generated
	 */
	void setRooms(Rooms value);
} // MakeReservationView
