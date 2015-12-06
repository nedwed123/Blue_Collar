/**
 */
package SoftwareModel.Presentation;

import SoftwareModel.BusinessLogic.RoomOperations;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room Management View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SoftwareModel.Presentation.RoomManagementView#getRoomoperations <em>Roomoperations</em>}</li>
 * </ul>
 *
 * @see SoftwareModel.Presentation.PresentationPackage#getRoomManagementView()
 * @model
 * @generated
 */
public interface RoomManagementView extends IView {

	/**
	 * Returns the value of the '<em><b>Roomoperations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roomoperations</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roomoperations</em>' containment reference.
	 * @see #setRoomoperations(RoomOperations)
	 * @see SoftwareModel.Presentation.PresentationPackage#getRoomManagementView_Roomoperations()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	RoomOperations getRoomoperations();

	/**
	 * Sets the value of the '{@link SoftwareModel.Presentation.RoomManagementView#getRoomoperations <em>Roomoperations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Roomoperations</em>' containment reference.
	 * @see #getRoomoperations()
	 * @generated
	 */
	void setRoomoperations(RoomOperations value);
} // RoomManagementView
