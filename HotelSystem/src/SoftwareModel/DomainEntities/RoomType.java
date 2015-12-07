/**
 */
package SoftwareModel.DomainEntities;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SoftwareModel.DomainEntities.RoomType#getSize <em>Size</em>}</li>
 *   <li>{@link SoftwareModel.DomainEntities.RoomType#getRate <em>Rate</em>}</li>
 *   <li>{@link SoftwareModel.DomainEntities.RoomType#getBedtype <em>Bedtype</em>}</li>
 *   <li>{@link SoftwareModel.DomainEntities.RoomType#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see SoftwareModel.DomainEntities.DomainEntitiesPackage#getRoomType()
 * @model
 * @generated
 */
public interface RoomType extends EObject {
	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(double)
	 * @see SoftwareModel.DomainEntities.DomainEntitiesPackage#getRoomType_Size()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	double getSize();

	/**
	 * Sets the value of the '{@link SoftwareModel.DomainEntities.RoomType#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(double value);

	/**
	 * Returns the value of the '<em><b>Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rate</em>' attribute.
	 * @see #setRate(double)
	 * @see SoftwareModel.DomainEntities.DomainEntitiesPackage#getRoomType_Rate()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	double getRate();

	/**
	 * Sets the value of the '{@link SoftwareModel.DomainEntities.RoomType#getRate <em>Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rate</em>' attribute.
	 * @see #getRate()
	 * @generated
	 */
	void setRate(double value);

	/**
	 * Returns the value of the '<em><b>Bedtype</b></em>' attribute list.
	 * The list contents are of type {@link SoftwareModel.DomainEntities.BedType}.
	 * The literals are from the enumeration {@link SoftwareModel.DomainEntities.BedType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bedtype</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bedtype</em>' attribute list.
	 * @see SoftwareModel.DomainEntities.BedType
	 * @see SoftwareModel.DomainEntities.DomainEntitiesPackage#getRoomType_Bedtype()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<BedType> getBedtype();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see SoftwareModel.DomainEntities.DomainEntitiesPackage#getRoomType_Name()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link SoftwareModel.DomainEntities.RoomType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // RoomType
