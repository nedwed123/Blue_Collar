/**
 */
package SoftwareModel.Presentation;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see SoftwareModel.Presentation.PresentationPackage
 * @generated
 */
public interface PresentationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PresentationFactory eINSTANCE = SoftwareModel.Presentation.impl.PresentationFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Frame</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Frame</em>'.
	 * @generated
	 */
	Frame createFrame();

	/**
	 * Returns a new object of class '<em>Customer Home View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Customer Home View</em>'.
	 * @generated
	 */
	CustomerHomeView createCustomerHomeView();

	/**
	 * Returns a new object of class '<em>Room Booking View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Room Booking View</em>'.
	 * @generated
	 */
	RoomBookingView createRoomBookingView();

	/**
	 * Returns a new object of class '<em>Reservation View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reservation View</em>'.
	 * @generated
	 */
	ReservationView createReservationView();

	/**
	 * Returns a new object of class '<em>Room Management View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Room Management View</em>'.
	 * @generated
	 */
	RoomManagementView createRoomManagementView();

	/**
	 * Returns a new object of class '<em>Login View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Login View</em>'.
	 * @generated
	 */
	LoginView createLoginView();

	/**
	 * Returns a new object of class '<em>Employee Home View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Employee Home View</em>'.
	 * @generated
	 */
	EmployeeHomeView createEmployeeHomeView();

	/**
	 * Returns a new object of class '<em>Make Reservation View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Make Reservation View</em>'.
	 * @generated
	 */
	MakeReservationView createMakeReservationView();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PresentationPackage getPresentationPackage();

} //PresentationFactory
