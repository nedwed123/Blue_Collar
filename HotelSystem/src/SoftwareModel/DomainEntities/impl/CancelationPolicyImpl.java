/**
 */
package SoftwareModel.DomainEntities.impl;

import SoftwareModel.DomainEntities.CancelationPolicy;
import SoftwareModel.DomainEntities.DomainEntitiesPackage;
import SoftwareModel.DomainEntities.Reservation;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cancelation Policy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link SoftwareModel.DomainEntities.impl.CancelationPolicyImpl#getMinDaysBeforeCancelationByCustomer <em>Min Days Before Cancelation By Customer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CancelationPolicyImpl extends MinimalEObjectImpl.Container implements CancelationPolicy {
	/**
	 * The default value of the '{@link #getMinDaysBeforeCancelationByCustomer() <em>Min Days Before Cancelation By Customer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinDaysBeforeCancelationByCustomer()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_DAYS_BEFORE_CANCELATION_BY_CUSTOMER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinDaysBeforeCancelationByCustomer() <em>Min Days Before Cancelation By Customer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinDaysBeforeCancelationByCustomer()
	 * @generated
	 * @ordered
	 */
	protected int minDaysBeforeCancelationByCustomer = MIN_DAYS_BEFORE_CANCELATION_BY_CUSTOMER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CancelationPolicyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomainEntitiesPackage.Literals.CANCELATION_POLICY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMinDaysBeforeCancelationByCustomer() {
		return minDaysBeforeCancelationByCustomer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinDaysBeforeCancelationByCustomer(int newMinDaysBeforeCancelationByCustomer) {
		int oldMinDaysBeforeCancelationByCustomer = minDaysBeforeCancelationByCustomer;
		minDaysBeforeCancelationByCustomer = newMinDaysBeforeCancelationByCustomer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainEntitiesPackage.CANCELATION_POLICY__MIN_DAYS_BEFORE_CANCELATION_BY_CUSTOMER, oldMinDaysBeforeCancelationByCustomer, minDaysBeforeCancelationByCustomer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean canBeCancelled(boolean isCustomer, Reservation reservation) {
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DomainEntitiesPackage.CANCELATION_POLICY__MIN_DAYS_BEFORE_CANCELATION_BY_CUSTOMER:
				return getMinDaysBeforeCancelationByCustomer();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DomainEntitiesPackage.CANCELATION_POLICY__MIN_DAYS_BEFORE_CANCELATION_BY_CUSTOMER:
				setMinDaysBeforeCancelationByCustomer((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DomainEntitiesPackage.CANCELATION_POLICY__MIN_DAYS_BEFORE_CANCELATION_BY_CUSTOMER:
				setMinDaysBeforeCancelationByCustomer(MIN_DAYS_BEFORE_CANCELATION_BY_CUSTOMER_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DomainEntitiesPackage.CANCELATION_POLICY__MIN_DAYS_BEFORE_CANCELATION_BY_CUSTOMER:
				return minDaysBeforeCancelationByCustomer != MIN_DAYS_BEFORE_CANCELATION_BY_CUSTOMER_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case DomainEntitiesPackage.CANCELATION_POLICY___CAN_BE_CANCELLED__BOOLEAN_RESERVATION:
				return canBeCancelled((Boolean)arguments.get(0), (Reservation)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (MinDaysBeforeCancelationByCustomer: ");
		result.append(minDaysBeforeCancelationByCustomer);
		result.append(')');
		return result.toString();
	}

} //CancelationPolicyImpl
