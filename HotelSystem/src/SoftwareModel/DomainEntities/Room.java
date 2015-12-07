/**
 */
package SoftwareModel.DomainEntities;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SoftwareModel.DomainEntities.Room#getNumber <em>Number</em>}</li>
 *   <li>{@link SoftwareModel.DomainEntities.Room#getAvailability <em>Availability</em>}</li>
 *   <li>{@link SoftwareModel.DomainEntities.Room#getView <em>View</em>}</li>
 *   <li>{@link SoftwareModel.DomainEntities.Room#isSmoking <em>Smoking</em>}</li>
 *   <li>{@link SoftwareModel.DomainEntities.Room#isPetsAllowed <em>Pets Allowed</em>}</li>
 *   <li>{@link SoftwareModel.DomainEntities.Room#isDisabledAccess <em>Disabled Access</em>}</li>
 *   <li>{@link SoftwareModel.DomainEntities.Room#getRoomtype <em>Roomtype</em>}</li>
 * </ul>
 *
 * @see SoftwareModel.DomainEntities.DomainEntitiesPackage#getRoom()
 * @model
 * @generated
 */
public interface Room extends EObject {
	/**
	 * Returns the value of the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number</em>' attribute.
	 * @see #setNumber(int)
	 * @see SoftwareModel.DomainEntities.DomainEntitiesPackage#getRoom_Number()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getNumber();

	/**
	 * Sets the value of the '{@link SoftwareModel.DomainEntities.Room#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(int value);

	/**
	 * Returns the value of the '<em><b>Availability</b></em>' attribute.
	 * The literals are from the enumeration {@link SoftwareModel.DomainEntities.Availability}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Availability</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Availability</em>' attribute.
	 * @see SoftwareModel.DomainEntities.Availability
	 * @see #setAvailability(Availability)
	 * @see SoftwareModel.DomainEntities.DomainEntitiesPackage#getRoom_Availability()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Availability getAvailability();

	/**
	 * Sets the value of the '{@link SoftwareModel.DomainEntities.Room#getAvailability <em>Availability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Availability</em>' attribute.
	 * @see SoftwareModel.DomainEntities.Availability
	 * @see #getAvailability()
	 * @generated
	 */
	void setAvailability(Availability value);

	/**
	 * Returns the value of the '<em><b>View</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>View</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View</em>' attribute.
	 * @see #setView(String)
	 * @see SoftwareModel.DomainEntities.DomainEntitiesPackage#getRoom_View()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getView();

	/**
	 * Sets the value of the '{@link SoftwareModel.DomainEntities.Room#getView <em>View</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>View</em>' attribute.
	 * @see #getView()
	 * @generated
	 */
	void setView(String value);

	/**
	 * Returns the value of the '<em><b>Smoking</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Smoking</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Smoking</em>' attribute.
	 * @see #setSmoking(boolean)
	 * @see SoftwareModel.DomainEntities.DomainEntitiesPackage#getRoom_Smoking()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isSmoking();

	/**
	 * Sets the value of the '{@link SoftwareModel.DomainEntities.Room#isSmoking <em>Smoking</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Smoking</em>' attribute.
	 * @see #isSmoking()
	 * @generated
	 */
	void setSmoking(boolean value);

	/**
	 * Returns the value of the '<em><b>Pets Allowed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pets Allowed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pets Allowed</em>' attribute.
	 * @see #setPetsAllowed(boolean)
	 * @see SoftwareModel.DomainEntities.DomainEntitiesPackage#getRoom_PetsAllowed()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isPetsAllowed();

	/**
	 * Sets the value of the '{@link SoftwareModel.DomainEntities.Room#isPetsAllowed <em>Pets Allowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pets Allowed</em>' attribute.
	 * @see #isPetsAllowed()
	 * @generated
	 */
	void setPetsAllowed(boolean value);

	/**
	 * Returns the value of the '<em><b>Disabled Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disabled Access</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disabled Access</em>' attribute.
	 * @see #setDisabledAccess(boolean)
	 * @see SoftwareModel.DomainEntities.DomainEntitiesPackage#getRoom_DisabledAccess()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isDisabledAccess();

	/**
	 * Sets the value of the '{@link SoftwareModel.DomainEntities.Room#isDisabledAccess <em>Disabled Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disabled Access</em>' attribute.
	 * @see #isDisabledAccess()
	 * @generated
	 */
	void setDisabledAccess(boolean value);

	/**
	 * Returns the value of the '<em><b>Roomtype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roomtype</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roomtype</em>' containment reference.
	 * @see #setRoomtype(RoomType)
	 * @see SoftwareModel.DomainEntities.DomainEntitiesPackage#getRoom_Roomtype()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	RoomType getRoomtype();

	/**
	 * Sets the value of the '{@link SoftwareModel.DomainEntities.Room#getRoomtype <em>Roomtype</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Roomtype</em>' containment reference.
	 * @see #getRoomtype()
	 * @generated
	 */
	void setRoomtype(RoomType value);

} // Room
