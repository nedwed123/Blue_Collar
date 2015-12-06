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
 *   <li>{@link SoftwareModel.DomainEntities.RoomType#getView <em>View</em>}</li>
 *   <li>{@link SoftwareModel.DomainEntities.RoomType#isDisableAccess <em>Disable Access</em>}</li>
 *   <li>{@link SoftwareModel.DomainEntities.RoomType#getRate <em>Rate</em>}</li>
 *   <li>{@link SoftwareModel.DomainEntities.RoomType#isSmoking <em>Smoking</em>}</li>
 *   <li>{@link SoftwareModel.DomainEntities.RoomType#isPetsAllowed <em>Pets Allowed</em>}</li>
 *   <li>{@link SoftwareModel.DomainEntities.RoomType#getRoomTypeId <em>Room Type Id</em>}</li>
 *   <li>{@link SoftwareModel.DomainEntities.RoomType#getBedtype <em>Bedtype</em>}</li>
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
	 * Returns the value of the '<em><b>View</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>View</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View</em>' attribute.
	 * @see #setView(String)
	 * @see SoftwareModel.DomainEntities.DomainEntitiesPackage#getRoomType_View()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getView();

	/**
	 * Sets the value of the '{@link SoftwareModel.DomainEntities.RoomType#getView <em>View</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>View</em>' attribute.
	 * @see #getView()
	 * @generated
	 */
	void setView(String value);

	/**
	 * Returns the value of the '<em><b>Disable Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disable Access</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disable Access</em>' attribute.
	 * @see #setDisableAccess(boolean)
	 * @see SoftwareModel.DomainEntities.DomainEntitiesPackage#getRoomType_DisableAccess()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isDisableAccess();

	/**
	 * Sets the value of the '{@link SoftwareModel.DomainEntities.RoomType#isDisableAccess <em>Disable Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disable Access</em>' attribute.
	 * @see #isDisableAccess()
	 * @generated
	 */
	void setDisableAccess(boolean value);

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
	 * Returns the value of the '<em><b>Smoking</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Smoking</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Smoking</em>' attribute.
	 * @see #setSmoking(boolean)
	 * @see SoftwareModel.DomainEntities.DomainEntitiesPackage#getRoomType_Smoking()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isSmoking();

	/**
	 * Sets the value of the '{@link SoftwareModel.DomainEntities.RoomType#isSmoking <em>Smoking</em>}' attribute.
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
	 * @see SoftwareModel.DomainEntities.DomainEntitiesPackage#getRoomType_PetsAllowed()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isPetsAllowed();

	/**
	 * Sets the value of the '{@link SoftwareModel.DomainEntities.RoomType#isPetsAllowed <em>Pets Allowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pets Allowed</em>' attribute.
	 * @see #isPetsAllowed()
	 * @generated
	 */
	void setPetsAllowed(boolean value);

	/**
	 * Returns the value of the '<em><b>Room Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room Type Id</em>' attribute.
	 * @see #setRoomTypeId(int)
	 * @see SoftwareModel.DomainEntities.DomainEntitiesPackage#getRoomType_RoomTypeId()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getRoomTypeId();

	/**
	 * Sets the value of the '{@link SoftwareModel.DomainEntities.RoomType#getRoomTypeId <em>Room Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room Type Id</em>' attribute.
	 * @see #getRoomTypeId()
	 * @generated
	 */
	void setRoomTypeId(int value);

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

} // RoomType
