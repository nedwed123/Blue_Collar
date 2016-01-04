/**
 */
package SoftwareModel.DomainEntities;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Customer Cancelation Policy</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see SoftwareModel.DomainEntities.DomainEntitiesPackage#getCustomerCancelationPolicy()
 * @model
 * @generated
 */
public interface CustomerCancelationPolicy extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model reservationRequired="true" reservationOrdered="false"
	 * @generated
	 */
	void canBeCancelledByCustomer(Reservation reservation);

} // CustomerCancelationPolicy
