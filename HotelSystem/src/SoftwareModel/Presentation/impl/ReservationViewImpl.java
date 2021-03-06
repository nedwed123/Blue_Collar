/**
 */
package SoftwareModel.Presentation.impl;

import SoftwareModel.BusinessLogic.Reservations;
import SoftwareModel.BusinessLogic.impl.ReservationsImpl;
import SoftwareModel.DomainEntities.Reservation;
import SoftwareModel.DomainEntities.RoomBooking;
import SoftwareModel.Presentation.Frame;
import SoftwareModel.Presentation.PresentationPackage;
import SoftwareModel.Presentation.ReservationView;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reservation View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link SoftwareModel.Presentation.impl.ReservationViewImpl#getReservations <em>Reservations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReservationViewImpl extends MinimalEObjectImpl.Container implements ReservationView {
	/**
	 * The cached value of the '{@link #getReservations() <em>Reservations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReservations()
	 * @ordered
	 */
	protected Reservations reservations = new ReservationsImpl();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReservationViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PresentationPackage.Literals.RESERVATION_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reservations getReservations() {
		return reservations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReservations(Reservations newReservations, NotificationChain msgs) {
		Reservations oldReservations = reservations;
		reservations = newReservations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PresentationPackage.RESERVATION_VIEW__RESERVATIONS, oldReservations, newReservations);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReservations(Reservations newReservations) {
		if (newReservations != reservations) {
			NotificationChain msgs = null;
			if (reservations != null)
				msgs = ((InternalEObject)reservations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PresentationPackage.RESERVATION_VIEW__RESERVATIONS, null, msgs);
			if (newReservations != null)
				msgs = ((InternalEObject)newReservations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PresentationPackage.RESERVATION_VIEW__RESERVATIONS, null, msgs);
			msgs = basicSetReservations(newReservations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationPackage.RESERVATION_VIEW__RESERVATIONS, newReservations, newReservations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void run(Frame frame) {

		int input = frame.input("reservation number");
		final Reservation res = reservations.getReservation(input);
		if(res != null)
		{
			System.out.println("Reservation:");
			System.out.println(res.toString());
						
			EList<RoomBooking> roombookings = res.getRoombooking();
			
			int i = 1;
			for (RoomBooking roomBooking : roombookings) {
				System.out.println("-- Room " + i + " --------------");
				System.out.println(roomBooking.toString() + "\n");
				//System.out.println(roomBooking);
				i++;
			}

			frame.displayMenu("What do u want to do with the reservation?:",
					new Frame.MenuItem[]{
							new Frame.MenuItem("Check in all guests",
									new Runnable() {
										@Override
										public void run() {
											reservations.CheckInAllGuests(res);
										}
									}
							),
							new Frame.MenuItem("Check out all guests",
									new Runnable() {
										@Override
										public void run() {
											reservations.CheckOutAllGuests(res);
										}
									}
							),
							new Frame.MenuItem("Cancel reservation",
									new Runnable() {
										@Override
										public void run() {
											reservations.cancel(res);
										}
									}
							),
							new Frame.MenuItem("Go back",new Frame.Nothing())
					});
		}
		else
		{
			System.out.println("Unable to find reservation");
		}
		
		frame.goBack();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PresentationPackage.RESERVATION_VIEW__RESERVATIONS:
				return basicSetReservations(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PresentationPackage.RESERVATION_VIEW__RESERVATIONS:
				return getReservations();
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
			case PresentationPackage.RESERVATION_VIEW__RESERVATIONS:
				setReservations((Reservations)newValue);
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
			case PresentationPackage.RESERVATION_VIEW__RESERVATIONS:
				setReservations((Reservations)null);
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
			case PresentationPackage.RESERVATION_VIEW__RESERVATIONS:
				return reservations != null;
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
			case PresentationPackage.RESERVATION_VIEW___RUN__FRAME:
				run((Frame)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //ReservationViewImpl
