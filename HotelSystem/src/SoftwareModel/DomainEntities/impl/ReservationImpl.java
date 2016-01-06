/**
 */
package SoftwareModel.DomainEntities.impl;

import SoftwareModel.DomainEntities.CustomerCancelationPolicy;
import SoftwareModel.DomainEntities.DomainEntitiesPackage;
import SoftwareModel.DomainEntities.PaymentDetails;
import SoftwareModel.DomainEntities.Reservation;
import SoftwareModel.DomainEntities.RoomBooking;

import java.lang.reflect.InvocationTargetException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.Locale;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reservation</b></em>'.
 * <!-- end-user-doc -->reservationId
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link SoftwareModel.DomainEntities.impl.ReservationImpl#getRoombooking <em>Roombooking</em>}</li>
 *   <li>{@link SoftwareModel.DomainEntities.impl.ReservationImpl#getPreliminaryCheckIn <em>Preliminary Check In</em>}</li>
 *   <li>{@link SoftwareModel.DomainEntities.impl.ReservationImpl#getPreliminaryCheckOut <em>Preliminary Check Out</em>}</li>
 *   <li>{@link SoftwareModel.DomainEntities.impl.ReservationImpl#getReservationId <em>Reservation Id</em>}</li>
 *   <li>{@link SoftwareModel.DomainEntities.impl.ReservationImpl#getDiscountCode <em>Discount Code</em>}</li>
 *   <li>{@link SoftwareModel.DomainEntities.impl.ReservationImpl#getPaymentdetails <em>Paymentdetails</em>}</li>
 *   <li>{@link SoftwareModel.DomainEntities.impl.ReservationImpl#getCancelationpolicy <em>Cancelationpolicy</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReservationImpl extends MinimalEObjectImpl.Container implements Reservation {
	/**
	 * The cached value of the '{@link #getRoombooking() <em>Roombooking</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoombooking()
	 * @generated
	 * @ordered
	 */
	protected EList<RoomBooking> roombooking;

	/**
	 * The default value of the '{@link #getPreliminaryCheckIn() <em>Preliminary Check In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreliminaryCheckIn()
	 * @generated
	 * @ordered
	 */
	protected static final Date PRELIMINARY_CHECK_IN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPreliminaryCheckIn() <em>Preliminary Check In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreliminaryCheckIn()
	 * @generated
	 * @ordered
	 */
	protected Date preliminaryCheckIn = PRELIMINARY_CHECK_IN_EDEFAULT;

	/**
	 * The default value of the '{@link #getPreliminaryCheckOut() <em>Preliminary Check Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreliminaryCheckOut()
	 * @generated
	 * @ordered
	 */
	protected static final Date PRELIMINARY_CHECK_OUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPreliminaryCheckOut() <em>Preliminary Check Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreliminaryCheckOut()
	 * @generated
	 * @ordered
	 */
	protected Date preliminaryCheckOut = PRELIMINARY_CHECK_OUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getReservationId() <em>Reservation Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReservationId()
	 * @generated
	 * @ordered
	 */
	protected static final int RESERVATION_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getReservationId() <em>Reservation Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReservationId()
	 * @generated
	 * @ordered
	 */
	protected int reservationId = RESERVATION_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDiscountCode() <em>Discount Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscountCode()
	 * @generated
	 * @ordered
	 */
	protected static final String DISCOUNT_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDiscountCode() <em>Discount Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscountCode()
	 * @generated
	 * @ordered
	 */
	protected String discountCode = DISCOUNT_CODE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPaymentdetails() <em>Paymentdetails</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentdetails()
	 * @generated
	 * @ordered
	 */
	protected PaymentDetails paymentdetails;

	/**
	 * The cached value of the '{@link #getCancelationpolicy() <em>Cancelationpolicy</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCancelationpolicy()
	 * @generated
	 * @ordered
	 */
	protected CustomerCancelationPolicy cancelationpolicy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReservationImpl() {
		super();
	}
	
	public ReservationImpl(EList<RoomBooking> roomBookings){
		super();
		this.roombooking = roomBookings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomainEntitiesPackage.Literals.RESERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RoomBooking> getRoombooking() {
		if (roombooking == null) {
			roombooking = new EObjectResolvingEList<RoomBooking>(RoomBooking.class, this, DomainEntitiesPackage.RESERVATION__ROOMBOOKING);
		}
		return roombooking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getPreliminaryCheckIn() {
		return preliminaryCheckIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreliminaryCheckIn(Date newPreliminaryCheckIn) {
		Date oldPreliminaryCheckIn = preliminaryCheckIn;
		preliminaryCheckIn = newPreliminaryCheckIn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainEntitiesPackage.RESERVATION__PRELIMINARY_CHECK_IN, oldPreliminaryCheckIn, preliminaryCheckIn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getPreliminaryCheckOut() {
		return preliminaryCheckOut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreliminaryCheckOut(Date newPreliminaryCheckOut) {
		Date oldPreliminaryCheckOut = preliminaryCheckOut;
		preliminaryCheckOut = newPreliminaryCheckOut;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainEntitiesPackage.RESERVATION__PRELIMINARY_CHECK_OUT, oldPreliminaryCheckOut, preliminaryCheckOut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getReservationId() {
		return reservationId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReservationId(int newReservationId) {
		int oldReservationId = reservationId;
		reservationId = newReservationId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainEntitiesPackage.RESERVATION__RESERVATION_ID, oldReservationId, reservationId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDiscountCode() {
		return discountCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiscountCode(String newDiscountCode) {
		String oldDiscountCode = discountCode;
		discountCode = newDiscountCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainEntitiesPackage.RESERVATION__DISCOUNT_CODE, oldDiscountCode, discountCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentDetails getPaymentdetails() {
		if (paymentdetails != null && paymentdetails.eIsProxy()) {
			InternalEObject oldPaymentdetails = (InternalEObject)paymentdetails;
			paymentdetails = (PaymentDetails)eResolveProxy(oldPaymentdetails);
			if (paymentdetails != oldPaymentdetails) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainEntitiesPackage.RESERVATION__PAYMENTDETAILS, oldPaymentdetails, paymentdetails));
			}
		}
		return paymentdetails;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentDetails basicGetPaymentdetails() {
		return paymentdetails;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaymentdetails(PaymentDetails newPaymentdetails) {
		PaymentDetails oldPaymentdetails = paymentdetails;
		paymentdetails = newPaymentdetails;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainEntitiesPackage.RESERVATION__PAYMENTDETAILS, oldPaymentdetails, paymentdetails));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomerCancelationPolicy getCancelationpolicy() {
		if (cancelationpolicy != null && cancelationpolicy.eIsProxy()) {
			InternalEObject oldCancelationpolicy = (InternalEObject)cancelationpolicy;
			cancelationpolicy = (CustomerCancelationPolicy)eResolveProxy(oldCancelationpolicy);
			if (cancelationpolicy != oldCancelationpolicy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainEntitiesPackage.RESERVATION__CANCELATIONPOLICY, oldCancelationpolicy, cancelationpolicy));
			}
		}
		return cancelationpolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomerCancelationPolicy basicGetCancelationpolicy() {
		return cancelationpolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCancelationpolicy(CustomerCancelationPolicy newCancelationpolicy) {
		CustomerCancelationPolicy oldCancelationpolicy = cancelationpolicy;
		cancelationpolicy = newCancelationpolicy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainEntitiesPackage.RESERVATION__CANCELATIONPOLICY, oldCancelationpolicy, cancelationpolicy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void cancel() {
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
			case DomainEntitiesPackage.RESERVATION__ROOMBOOKING:
				return getRoombooking();
			case DomainEntitiesPackage.RESERVATION__PRELIMINARY_CHECK_IN:
				return getPreliminaryCheckIn();
			case DomainEntitiesPackage.RESERVATION__PRELIMINARY_CHECK_OUT:
				return getPreliminaryCheckOut();
			case DomainEntitiesPackage.RESERVATION__RESERVATION_ID:
				return getReservationId();
			case DomainEntitiesPackage.RESERVATION__DISCOUNT_CODE:
				return getDiscountCode();
			case DomainEntitiesPackage.RESERVATION__PAYMENTDETAILS:
				if (resolve) return getPaymentdetails();
				return basicGetPaymentdetails();
			case DomainEntitiesPackage.RESERVATION__CANCELATIONPOLICY:
				if (resolve) return getCancelationpolicy();
				return basicGetCancelationpolicy();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DomainEntitiesPackage.RESERVATION__ROOMBOOKING:
				getRoombooking().clear();
				getRoombooking().addAll((Collection<? extends RoomBooking>)newValue);
				return;
			case DomainEntitiesPackage.RESERVATION__PRELIMINARY_CHECK_IN:
				setPreliminaryCheckIn((Date)newValue);
				return;
			case DomainEntitiesPackage.RESERVATION__PRELIMINARY_CHECK_OUT:
				setPreliminaryCheckOut((Date)newValue);
				return;
			case DomainEntitiesPackage.RESERVATION__RESERVATION_ID:
				setReservationId((Integer)newValue);
				return;
			case DomainEntitiesPackage.RESERVATION__DISCOUNT_CODE:
				setDiscountCode((String)newValue);
				return;
			case DomainEntitiesPackage.RESERVATION__PAYMENTDETAILS:
				setPaymentdetails((PaymentDetails)newValue);
				return;
			case DomainEntitiesPackage.RESERVATION__CANCELATIONPOLICY:
				setCancelationpolicy((CustomerCancelationPolicy)newValue);
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
			case DomainEntitiesPackage.RESERVATION__ROOMBOOKING:
				getRoombooking().clear();
				return;
			case DomainEntitiesPackage.RESERVATION__PRELIMINARY_CHECK_IN:
				setPreliminaryCheckIn(PRELIMINARY_CHECK_IN_EDEFAULT);
				return;
			case DomainEntitiesPackage.RESERVATION__PRELIMINARY_CHECK_OUT:
				setPreliminaryCheckOut(PRELIMINARY_CHECK_OUT_EDEFAULT);
				return;
			case DomainEntitiesPackage.RESERVATION__RESERVATION_ID:
				setReservationId(RESERVATION_ID_EDEFAULT);
				return;
			case DomainEntitiesPackage.RESERVATION__DISCOUNT_CODE:
				setDiscountCode(DISCOUNT_CODE_EDEFAULT);
				return;
			case DomainEntitiesPackage.RESERVATION__PAYMENTDETAILS:
				setPaymentdetails((PaymentDetails)null);
				return;
			case DomainEntitiesPackage.RESERVATION__CANCELATIONPOLICY:
				setCancelationpolicy((CustomerCancelationPolicy)null);
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
			case DomainEntitiesPackage.RESERVATION__ROOMBOOKING:
				return roombooking != null && !roombooking.isEmpty();
			case DomainEntitiesPackage.RESERVATION__PRELIMINARY_CHECK_IN:
				return PRELIMINARY_CHECK_IN_EDEFAULT == null ? preliminaryCheckIn != null : !PRELIMINARY_CHECK_IN_EDEFAULT.equals(preliminaryCheckIn);
			case DomainEntitiesPackage.RESERVATION__PRELIMINARY_CHECK_OUT:
				return PRELIMINARY_CHECK_OUT_EDEFAULT == null ? preliminaryCheckOut != null : !PRELIMINARY_CHECK_OUT_EDEFAULT.equals(preliminaryCheckOut);
			case DomainEntitiesPackage.RESERVATION__RESERVATION_ID:
				return reservationId != RESERVATION_ID_EDEFAULT;
			case DomainEntitiesPackage.RESERVATION__DISCOUNT_CODE:
				return DISCOUNT_CODE_EDEFAULT == null ? discountCode != null : !DISCOUNT_CODE_EDEFAULT.equals(discountCode);
			case DomainEntitiesPackage.RESERVATION__PAYMENTDETAILS:
				return paymentdetails != null;
			case DomainEntitiesPackage.RESERVATION__CANCELATIONPOLICY:
				return cancelationpolicy != null;
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
			case DomainEntitiesPackage.RESERVATION___CANCEL:
				cancel();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public String toString() {
		
		DateFormat format = new SimpleDateFormat("yy-MM-dd", Locale.ENGLISH);
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer();
		result.append("(Reservation number: ");
		result.append(reservationId);
		result.append(", preliminary Check In: ");
		result.append(format.format(preliminaryCheckIn));
		result.append(", preliminary Check Out: ");
		result.append(format.format(preliminaryCheckOut));
		result.append(", discount code: ");
		result.append(discountCode);
		result.append(')');
		return result.toString();
	}

} //ReservationImpl
