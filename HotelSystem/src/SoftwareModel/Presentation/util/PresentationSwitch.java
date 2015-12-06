/**
 */
package SoftwareModel.Presentation.util;

import SoftwareModel.Presentation.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see SoftwareModel.Presentation.PresentationPackage
 * @generated
 */
public class PresentationSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PresentationPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PresentationSwitch() {
		if (modelPackage == null) {
			modelPackage = PresentationPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case PresentationPackage.CUSTOMER_HOME_VIEW: {
				CustomerHomeView customerHomeView = (CustomerHomeView)theEObject;
				T result = caseCustomerHomeView(customerHomeView);
				if (result == null) result = caseIView(customerHomeView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PresentationPackage.IVIEW: {
				IView iView = (IView)theEObject;
				T result = caseIView(iView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PresentationPackage.FRAME: {
				Frame frame = (Frame)theEObject;
				T result = caseFrame(frame);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PresentationPackage.ROOM_BOOKING_VIEW: {
				RoomBookingView roomBookingView = (RoomBookingView)theEObject;
				T result = caseRoomBookingView(roomBookingView);
				if (result == null) result = caseIView(roomBookingView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PresentationPackage.RESERVATION_VIEW: {
				ReservationView reservationView = (ReservationView)theEObject;
				T result = caseReservationView(reservationView);
				if (result == null) result = caseIView(reservationView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PresentationPackage.ROOM_MANAGEMENT_VIEW: {
				RoomManagementView roomManagementView = (RoomManagementView)theEObject;
				T result = caseRoomManagementView(roomManagementView);
				if (result == null) result = caseIView(roomManagementView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PresentationPackage.LOGIN_VIEW: {
				LoginView loginView = (LoginView)theEObject;
				T result = caseLoginView(loginView);
				if (result == null) result = caseIView(loginView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PresentationPackage.EMPLOYEE_HOME_VIEW: {
				EmployeeHomeView employeeHomeView = (EmployeeHomeView)theEObject;
				T result = caseEmployeeHomeView(employeeHomeView);
				if (result == null) result = caseIView(employeeHomeView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PresentationPackage.MAKE_RESERVATION_VIEW: {
				MakeReservationView makeReservationView = (MakeReservationView)theEObject;
				T result = caseMakeReservationView(makeReservationView);
				if (result == null) result = caseIView(makeReservationView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Frame</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Frame</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFrame(Frame object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Customer Home View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Customer Home View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomerHomeView(CustomerHomeView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IView</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IView</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIView(IView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Room Booking View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Room Booking View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoomBookingView(RoomBookingView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reservation View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reservation View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReservationView(ReservationView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Room Management View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Room Management View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoomManagementView(RoomManagementView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Login View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Login View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoginView(LoginView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Employee Home View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Employee Home View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEmployeeHomeView(EmployeeHomeView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Make Reservation View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Make Reservation View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMakeReservationView(MakeReservationView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //PresentationSwitch
