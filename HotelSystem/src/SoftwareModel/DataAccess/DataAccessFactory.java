/**
 */
package SoftwareModel.DataAccess;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see SoftwareModel.DataAccess.DataAccessPackage
 * @generated
 */
public interface DataAccessFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DataAccessFactory eINSTANCE = SoftwareModel.DataAccess.impl.DataAccessFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Reservations Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reservations Repository</em>'.
	 * @generated
	 */
	ReservationsRepository createReservationsRepository();

	/**
	 * Returns a new object of class '<em>Database Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Database Context</em>'.
	 * @generated
	 */
	DatabaseContext createDatabaseContext();

	/**
	 * Returns a new object of class '<em>Room Bookings Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Room Bookings Repository</em>'.
	 * @generated
	 */
	RoomBookingsRepository createRoomBookingsRepository();

	/**
	 * Returns a new object of class '<em>Authorization Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Authorization Repository</em>'.
	 * @generated
	 */
	AuthorizationRepository createAuthorizationRepository();

	/**
	 * Returns a new object of class '<em>Room Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Room Repository</em>'.
	 * @generated
	 */
	RoomRepository createRoomRepository();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DataAccessPackage getDataAccessPackage();

} //DataAccessFactory
