/**
 */
package SoftwareModel.DataAccess;

import SoftwareModel.DomainEntities.Reservation;
import SoftwareModel.DomainEntities.Room;
import SoftwareModel.DomainEntities.RoomBooking;
import SoftwareModel.DomainEntities.RoomType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Database Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SoftwareModel.DataAccess.DatabaseContext#getRooms <em>Rooms</em>}</li>
 *   <li>{@link SoftwareModel.DataAccess.DatabaseContext#getRoomTypes <em>Room Types</em>}</li>
 *   <li>{@link SoftwareModel.DataAccess.DatabaseContext#getReservations <em>Reservations</em>}</li>
 *   <li>{@link SoftwareModel.DataAccess.DatabaseContext#getRoomBookings <em>Room Bookings</em>}</li>
 *   <li>{@link SoftwareModel.DataAccess.DatabaseContext#getPasswords <em>Passwords</em>}</li>
 * </ul>
 *
 * @see SoftwareModel.DataAccess.DataAccessPackage#getDatabaseContext()
 * @model
 * @generated
 */
public interface DatabaseContext extends EObject {
	/**
	 * Returns the value of the '<em><b>Rooms</b></em>' reference list.
	 * The list contents are of type {@link SoftwareModel.DomainEntities.Room}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rooms</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rooms</em>' reference list.
	 * @see SoftwareModel.DataAccess.DataAccessPackage#getDatabaseContext_Rooms()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Room> getRooms();

	/**
	 * Returns the value of the '<em><b>Room Types</b></em>' reference list.
	 * The list contents are of type {@link SoftwareModel.DomainEntities.RoomType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room Types</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room Types</em>' reference list.
	 * @see SoftwareModel.DataAccess.DataAccessPackage#getDatabaseContext_RoomTypes()
	 * @model ordered="false"
	 * @generated
	 */
	EList<RoomType> getRoomTypes();

	/**
	 * Returns the value of the '<em><b>Reservations</b></em>' reference list.
	 * The list contents are of type {@link SoftwareModel.DomainEntities.Reservation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reservations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reservations</em>' reference list.
	 * @see SoftwareModel.DataAccess.DataAccessPackage#getDatabaseContext_Reservations()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Reservation> getReservations();

	/**
	 * Returns the value of the '<em><b>Room Bookings</b></em>' reference list.
	 * The list contents are of type {@link SoftwareModel.DomainEntities.RoomBooking}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room Bookings</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room Bookings</em>' reference list.
	 * @see SoftwareModel.DataAccess.DataAccessPackage#getDatabaseContext_RoomBookings()
	 * @model ordered="false"
	 * @generated
	 */
	EList<RoomBooking> getRoomBookings();

	/**
	 * Returns the value of the '<em><b>Passwords</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Passwords</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passwords</em>' attribute list.
	 * @see SoftwareModel.DataAccess.DataAccessPackage#getDatabaseContext_Passwords()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	EList<String> getPasswords();


} // DatabaseContext
