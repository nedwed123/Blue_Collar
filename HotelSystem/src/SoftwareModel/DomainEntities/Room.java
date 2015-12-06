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

} // Room
