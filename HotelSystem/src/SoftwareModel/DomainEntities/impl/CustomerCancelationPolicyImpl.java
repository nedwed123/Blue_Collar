/**
 */
package SoftwareModel.DomainEntities.impl;

import SoftwareModel.DomainEntities.CustomerCancelationPolicy;
import SoftwareModel.DomainEntities.DomainEntitiesPackage;
import SoftwareModel.DomainEntities.Reservation;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

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
	 */
	public void canBeCancelledByCustomer(Reservation reservation) {
		Date currentDate = new Date();
		Date checkInDate = reservation.getRoombooking().get(0).getCheckInDate();
		//if(getDateDiff(currentDate, checkInDate, TimeUnit.DAYS) < 5)
		//	return true;
	}

	public static long getDateDiff(Date date1, Date date2, TimeUnit timeUnit) {
	    long diffInMillies = date2.getTime() - date1.getTime();
	    return timeUnit.convert(diffInMillies,TimeUnit.MILLISECONDS);
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
