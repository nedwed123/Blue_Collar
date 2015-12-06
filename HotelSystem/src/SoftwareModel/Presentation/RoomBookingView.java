/**
 */
package SoftwareModel.Presentation;

import SoftwareModel.BusinessLogic.Rooms;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room Booking View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SoftwareModel.Presentation.RoomBookingView#getRooms <em>Rooms</em>}</li>
 * </ul>
 *
 * @see SoftwareModel.Presentation.PresentationPackage#getRoomBookingView()
 * @model
 * @generated
 */
public interface RoomBookingView extends IView {

	/**
	 * Returns the value of the '<em><b>Rooms</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rooms</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rooms</em>' containment reference.
	 * @see #setRooms(Rooms)
	 * @see SoftwareModel.Presentation.PresentationPackage#getRoomBookingView_Rooms()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Rooms getRooms();

	/**
	 * Sets the value of the '{@link SoftwareModel.Presentation.RoomBookingView#getRooms <em>Rooms</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rooms</em>' containment reference.
	 * @see #getRooms()
	 * @generated
	 */
	void setRooms(Rooms value);
} // RoomBookingView
