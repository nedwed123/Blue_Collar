/**
 */
package SoftwareModel.DomainEntities.impl;

import SoftwareModel.DomainEntities.CustomerCancelationPolicy;
import SoftwareModel.DomainEntities.DomainEntitiesPackage;
import SoftwareModel.DomainEntities.Reservation;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Customer Cancelation Policy</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CustomerCancelationPolicyImpl extends MinimalEObjectImpl.Container implements CustomerCancelationPolicy {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomerCancelationPolicyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomainEntitiesPackage.Literals.CUSTOMER_CANCELATION_POLICY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void canBeCancelledByCustomer(Reservation reservation) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case DomainEntitiesPackage.CUSTOMER_CANCELATION_POLICY___CAN_BE_CANCELLED_BY_CUSTOMER__RESERVATION:
				canBeCancelledByCustomer((Reservation)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //CustomerCancelationPolicyImpl
