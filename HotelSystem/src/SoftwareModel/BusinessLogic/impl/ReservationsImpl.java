/**
 */
package SoftwareModel.BusinessLogic.impl;

import SoftwareModel.BusinessLogic.BusinessLogicPackage;
import SoftwareModel.BusinessLogic.Reservations;

import SoftwareModel.DataAccess.ReservationsRepository;

import SoftwareModel.DomainEntities.PaymentDetails;
import SoftwareModel.DomainEntities.Reservation;
import SoftwareModel.DomainEntities.RoomBooking;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reservations</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link SoftwareModel.BusinessLogic.impl.ReservationsImpl#getReservationsrepository <em>Reservationsrepository</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReservationsImpl extends MinimalEObjectImpl.Container implements Reservations {
	/**
	 * The cached value of the '{@link #getReservationsrepository() <em>Reservationsrepository</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReservationsrepository()
	 * @generated
	 * @ordered
	 */
	protected ReservationsRepository reservationsrepository;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReservationsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BusinessLogicPackage.Literals.RESERVATIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReservationsRepository getReservationsrepository() {
		if (reservationsrepository != null && reservationsrepository.eIsProxy()) {
			InternalEObject oldReservationsrepository = (InternalEObject)reservationsrepository;
			reservationsrepository = (ReservationsRepository)eResolveProxy(oldReservationsrepository);
			if (reservationsrepository != oldReservationsrepository) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BusinessLogicPackage.RESERVATIONS__RESERVATIONSREPOSITORY, oldReservationsrepository, reservationsrepository));
			}
		}
		return reservationsrepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReservationsRepository basicGetReservationsrepository() {
		return reservationsrepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReservationsrepository(ReservationsRepository newReservationsrepository) {
		ReservationsRepository oldReservationsrepository = reservationsrepository;
		reservationsrepository = newReservationsrepository;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BusinessLogicPackage.RESERVATIONS__RESERVATIONSREPOSITORY, oldReservationsrepository, reservationsrepository));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void updateReservationDetails(Reservation reservation) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reservation make(EList<RoomBooking> selectedRooms, PaymentDetails paymentDetails, boolean payNow) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void cancel(Reservation reservation) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getReservation(int reservationNumber) {
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
			case BusinessLogicPackage.RESERVATIONS__RESERVATIONSREPOSITORY:
				if (resolve) return getReservationsrepository();
				return basicGetReservationsrepository();
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
			case BusinessLogicPackage.RESERVATIONS__RESERVATIONSREPOSITORY:
				setReservationsrepository((ReservationsRepository)newValue);
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
			case BusinessLogicPackage.RESERVATIONS__RESERVATIONSREPOSITORY:
				setReservationsrepository((ReservationsRepository)null);
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
			case BusinessLogicPackage.RESERVATIONS__RESERVATIONSREPOSITORY:
				return reservationsrepository != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case BusinessLogicPackage.RESERVATIONS___UPDATE_RESERVATION_DETAILS__RESERVATION:
				updateReservationDetails((Reservation)arguments.get(0));
				return null;
			case BusinessLogicPackage.RESERVATIONS___MAKE__ELIST_PAYMENTDETAILS_BOOLEAN:
				return make((EList<RoomBooking>)arguments.get(0), (PaymentDetails)arguments.get(1), (Boolean)arguments.get(2));
			case BusinessLogicPackage.RESERVATIONS___CANCEL__RESERVATION:
				cancel((Reservation)arguments.get(0));
				return null;
			case BusinessLogicPackage.RESERVATIONS___GET_RESERVATION__INT:
				getReservation((Integer)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //ReservationsImpl
