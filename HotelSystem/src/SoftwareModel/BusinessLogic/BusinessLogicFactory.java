/**
 */
package SoftwareModel.BusinessLogic;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see SoftwareModel.BusinessLogic.BusinessLogicPackage
 * @generated
 */
public interface BusinessLogicFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BusinessLogicFactory eINSTANCE = SoftwareModel.BusinessLogic.impl.BusinessLogicFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Reservations</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reservations</em>'.
	 * @generated
	 */
	Reservations createReservations();

	/**
	 * Returns a new object of class '<em>Room Bookings</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Room Bookings</em>'.
	 * @generated
	 */
	RoomBookings createRoomBookings();

	/**
	 * Returns a new object of class '<em>Availible Room Finder</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Availible Room Finder</em>'.
	 * @generated
	 */
	AvailibleRoomFinder createAvailibleRoomFinder();

	/**
	 * Returns a new object of class '<em>Room Operations</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Room Operations</em>'.
	 * @generated
	 */
	RoomOperations createRoomOperations();

	/**
	 * Returns a new object of class '<em>Authorizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Authorizer</em>'.
	 * @generated
	 */
	Authorizer createAuthorizer();

	/**
	 * Returns a new object of class '<em>Rooms</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rooms</em>'.
	 * @generated
	 */
	Rooms createRooms();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BusinessLogicPackage getBusinessLogicPackage();

} //BusinessLogicFactory
