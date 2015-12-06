/**
 */
package SoftwareModel.DomainEntities;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room Booking</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SoftwareModel.DomainEntities.RoomBooking#isIsCheckedIn <em>Is Checked In</em>}</li>
 *   <li>{@link SoftwareModel.DomainEntities.RoomBooking#getRoomresponsible <em>Roomresponsible</em>}</li>
 *   <li>{@link SoftwareModel.DomainEntities.RoomBooking#getAdults <em>Adults</em>}</li>
 *   <li>{@link SoftwareModel.DomainEntities.RoomBooking#getChildren <em>Children</em>}</li>
 *   <li>{@link SoftwareModel.DomainEntities.RoomBooking#getCheckOutDate <em>Check Out Date</em>}</li>
 *   <li>{@link SoftwareModel.DomainEntities.RoomBooking#getCheckInDate <em>Check In Date</em>}</li>
 *   <li>{@link SoftwareModel.DomainEntities.RoomBooking#getRoomtype <em>Roomtype</em>}</li>
 * </ul>
 *
 * @see SoftwareModel.DomainEntities.DomainEntitiesPackage#getRoomBooking()
 * @model
 * @generated
 */
public interface RoomBooking extends EObject {
	/**
	 * Returns the value of the '<em><b>Is Checked In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Checked In</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Checked In</em>' attribute.
	 * @see #setIsCheckedIn(boolean)
	 * @see SoftwareModel.DomainEntities.DomainEntitiesPackage#getRoomBooking_IsCheckedIn()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsCheckedIn();

	/**
	 * Sets the value of the '{@link SoftwareModel.DomainEntities.RoomBooking#isIsCheckedIn <em>Is Checked In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Checked In</em>' attribute.
	 * @see #isIsCheckedIn()
	 * @generated
	 */
	void setIsCheckedIn(boolean value);

	/**
	 * Returns the value of the '<em><b>Roomresponsible</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roomresponsible</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roomresponsible</em>' reference.
	 * @see #setRoomresponsible(RoomResponsible)
	 * @see SoftwareModel.DomainEntities.DomainEntitiesPackage#getRoomBooking_Roomresponsible()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	RoomResponsible getRoomresponsible();

	/**
	 * Sets the value of the '{@link SoftwareModel.DomainEntities.RoomBooking#getRoomresponsible <em>Roomresponsible</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Roomresponsible</em>' reference.
	 * @see #getRoomresponsible()
	 * @generated
	 */
	void setRoomresponsible(RoomResponsible value);

	/**
	 * Returns the value of the '<em><b>Adults</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Adults</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adults</em>' attribute.
	 * @see #setAdults(int)
	 * @see SoftwareModel.DomainEntities.DomainEntitiesPackage#getRoomBooking_Adults()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getAdults();

	/**
	 * Sets the value of the '{@link SoftwareModel.DomainEntities.RoomBooking#getAdults <em>Adults</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adults</em>' attribute.
	 * @see #getAdults()
	 * @generated
	 */
	void setAdults(int value);

	/**
	 * Returns the value of the '<em><b>Children</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' attribute.
	 * @see #setChildren(int)
	 * @see SoftwareModel.DomainEntities.DomainEntitiesPackage#getRoomBooking_Children()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getChildren();

	/**
	 * Sets the value of the '{@link SoftwareModel.DomainEntities.RoomBooking#getChildren <em>Children</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Children</em>' attribute.
	 * @see #getChildren()
	 * @generated
	 */
	void setChildren(int value);

	/**
	 * Returns the value of the '<em><b>Check Out Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Check Out Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Check Out Date</em>' attribute.
	 * @see #setCheckOutDate(Date)
	 * @see SoftwareModel.DomainEntities.DomainEntitiesPackage#getRoomBooking_CheckOutDate()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Date getCheckOutDate();

	/**
	 * Sets the value of the '{@link SoftwareModel.DomainEntities.RoomBooking#getCheckOutDate <em>Check Out Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Check Out Date</em>' attribute.
	 * @see #getCheckOutDate()
	 * @generated
	 */
	void setCheckOutDate(Date value);

	/**
	 * Returns the value of the '<em><b>Check In Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Check In Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Check In Date</em>' attribute.
	 * @see #setCheckInDate(Date)
	 * @see SoftwareModel.DomainEntities.DomainEntitiesPackage#getRoomBooking_CheckInDate()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Date getCheckInDate();

	/**
	 * Sets the value of the '{@link SoftwareModel.DomainEntities.RoomBooking#getCheckInDate <em>Check In Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Check In Date</em>' attribute.
	 * @see #getCheckInDate()
	 * @generated
	 */
	void setCheckInDate(Date value);

	/**
	 * Returns the value of the '<em><b>Roomtype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roomtype</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roomtype</em>' reference.
	 * @see #setRoomtype(RoomType)
	 * @see SoftwareModel.DomainEntities.DomainEntitiesPackage#getRoomBooking_Roomtype()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	RoomType getRoomtype();

	/**
	 * Sets the value of the '{@link SoftwareModel.DomainEntities.RoomBooking#getRoomtype <em>Roomtype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Roomtype</em>' reference.
	 * @see #getRoomtype()
	 * @generated
	 */
	void setRoomtype(RoomType value);

} // RoomBooking
