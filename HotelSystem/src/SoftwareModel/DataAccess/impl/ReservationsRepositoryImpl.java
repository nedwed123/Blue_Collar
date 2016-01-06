/**
 */
package SoftwareModel.DataAccess.impl;

import SoftwareModel.DataAccess.DataAccessPackage;
import SoftwareModel.DataAccess.DatabaseContext;
import SoftwareModel.DataAccess.ReservationsRepository;
import SoftwareModel.DomainEntities.Reservation;
import SoftwareModel.DomainEntities.RoomBooking;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import java.lang.reflect.InvocationTargetException;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reservations Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link SoftwareModel.DataAccess.impl.ReservationsRepositoryImpl#getDatabasecontext <em>Databasecontext</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReservationsRepositoryImpl extends MinimalEObjectImpl.Container implements ReservationsRepository {
	/**
	 * The cached value of the '{@link #getDatabasecontext() <em>Databasecontext</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabasecontext()
	 * @ordered
	 */
	protected DatabaseContext databasecontext = DatabaseContextImpl.GetDatabaseContext();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReservationsRepositoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataAccessPackage.Literals.RESERVATIONS_REPOSITORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabaseContext getDatabasecontext() {
		if (databasecontext != null && databasecontext.eIsProxy()) {
			InternalEObject oldDatabasecontext = (InternalEObject)databasecontext;
			databasecontext = (DatabaseContext)eResolveProxy(oldDatabasecontext);
			if (databasecontext != oldDatabasecontext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataAccessPackage.RESERVATIONS_REPOSITORY__DATABASECONTEXT, oldDatabasecontext, databasecontext));
			}
		}
		return databasecontext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabaseContext basicGetDatabasecontext() {
		return databasecontext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatabasecontext(DatabaseContext newDatabasecontext) {
		DatabaseContext oldDatabasecontext = databasecontext;
		databasecontext = newDatabasecontext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataAccessPackage.RESERVATIONS_REPOSITORY__DATABASECONTEXT, oldDatabasecontext, databasecontext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void update(Reservation reservation) {
		databasecontext.getReservations().set(databasecontext.getReservations().indexOf(reservation),reservation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * Finds a reservation, returns null if not found
	 * <!-- end-user-doc -->
	 */
	public Reservation get(int reservationNumber) {
		EList<Reservation> reservations = databasecontext.getReservations();

		for (int i = 0; i < reservations.size(); i++) {
			Reservation reservation = reservations.get(i);
			if(reservationNumber == reservation.getReservationId()){
				return reservation;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Reservation addNew(Reservation reservation) {
		databasecontext.getReservations().add(reservation);
		
		for(int i = 0; i < reservation.getRoombooking().size(); i++)
			databasecontext.getRoomBookings().add(reservation.getRoombooking().get(i));
		//TODO: is this really needed?
		return reservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void remove(int reservationNumber) {
		databasecontext.getReservations().remove(this.get(reservationNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataAccessPackage.RESERVATIONS_REPOSITORY__DATABASECONTEXT:
				if (resolve) return getDatabasecontext();
				return basicGetDatabasecontext();
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
			case DataAccessPackage.RESERVATIONS_REPOSITORY__DATABASECONTEXT:
				setDatabasecontext((DatabaseContext)newValue);
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
			case DataAccessPackage.RESERVATIONS_REPOSITORY__DATABASECONTEXT:
				setDatabasecontext((DatabaseContext)null);
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
			case DataAccessPackage.RESERVATIONS_REPOSITORY__DATABASECONTEXT:
				return databasecontext != null;
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
			case DataAccessPackage.RESERVATIONS_REPOSITORY___UPDATE__RESERVATION:
				update((Reservation)arguments.get(0));
				return null;
			case DataAccessPackage.RESERVATIONS_REPOSITORY___GET__INT:
				return get((Integer)arguments.get(0));
			case DataAccessPackage.RESERVATIONS_REPOSITORY___ADD_NEW__RESERVATION:
				return addNew((Reservation)arguments.get(0));
			case DataAccessPackage.RESERVATIONS_REPOSITORY___REMOVE__INT:
				remove((Integer)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //ReservationsRepositoryImpl
