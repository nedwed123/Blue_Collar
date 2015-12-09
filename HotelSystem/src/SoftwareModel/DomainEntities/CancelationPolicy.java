/**
 */
package SoftwareModel.DomainEntities;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cancelation Policy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SoftwareModel.DomainEntities.CancelationPolicy#getMinDaysBeforeCancelationByCustomer <em>Min Days Before Cancelation By Customer</em>}</li>
 * </ul>
 *
 * @see SoftwareModel.DomainEntities.DomainEntitiesPackage#getCancelationPolicy()
 * @model
 * @generated
 */
public interface CancelationPolicy extends EObject {
	/**
	 * Returns the value of the '<em><b>Min Days Before Cancelation By Customer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Days Before Cancelation By Customer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Days Before Cancelation By Customer</em>' attribute.
	 * @see #setMinDaysBeforeCancelationByCustomer(int)
	 * @see SoftwareModel.DomainEntities.DomainEntitiesPackage#getCancelationPolicy_MinDaysBeforeCancelationByCustomer()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getMinDaysBeforeCancelationByCustomer();

	/**
	 * Sets the value of the '{@link SoftwareModel.DomainEntities.CancelationPolicy#getMinDaysBeforeCancelationByCustomer <em>Min Days Before Cancelation By Customer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Days Before Cancelation By Customer</em>' attribute.
	 * @see #getMinDaysBeforeCancelationByCustomer()
	 * @generated
	 */
	void setMinDaysBeforeCancelationByCustomer(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false" isCustomerDataType="org.eclipse.uml2.types.Boolean" isCustomerRequired="true" isCustomerOrdered="false" reservationRequired="true" reservationOrdered="false"
	 * @generated
	 */
	boolean canBeCancelled(boolean isCustomer, Reservation reservation);

} // CancelationPolicy
