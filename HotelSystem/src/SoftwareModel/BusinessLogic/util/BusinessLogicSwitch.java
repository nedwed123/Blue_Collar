/**
 */
package SoftwareModel.BusinessLogic.util;

import SoftwareModel.BusinessLogic.*;

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
 * @see SoftwareModel.BusinessLogic.BusinessLogicPackage
 * @generated
 */
public class BusinessLogicSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BusinessLogicPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessLogicSwitch() {
		if (modelPackage == null) {
			modelPackage = BusinessLogicPackage.eINSTANCE;
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
			case BusinessLogicPackage.RESERVATIONS: {
				Reservations reservations = (Reservations)theEObject;
				T result = caseReservations(reservations);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BusinessLogicPackage.ROOM_BOOKINGS: {
				RoomBookings roomBookings = (RoomBookings)theEObject;
				T result = caseRoomBookings(roomBookings);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BusinessLogicPackage.AVAILIBLE_ROOM_FINDER: {
				AvailibleRoomFinder availibleRoomFinder = (AvailibleRoomFinder)theEObject;
				T result = caseAvailibleRoomFinder(availibleRoomFinder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BusinessLogicPackage.ROOM_OPERATIONS: {
				RoomOperations roomOperations = (RoomOperations)theEObject;
				T result = caseRoomOperations(roomOperations);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BusinessLogicPackage.AUTHORIZER: {
				Authorizer authorizer = (Authorizer)theEObject;
				T result = caseAuthorizer(authorizer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BusinessLogicPackage.ROOMS: {
				Rooms rooms = (Rooms)theEObject;
				T result = caseRooms(rooms);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reservations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reservations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReservations(Reservations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Room Bookings</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Room Bookings</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoomBookings(RoomBookings object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Availible Room Finder</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Availible Room Finder</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAvailibleRoomFinder(AvailibleRoomFinder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Room Operations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Room Operations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoomOperations(RoomOperations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Authorizer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Authorizer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuthorizer(Authorizer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rooms</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rooms</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRooms(Rooms object) {
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

} //BusinessLogicSwitch
