/**
 */
package SoftwareModel.DataAccess;

import SoftwareModel.DomainEntities.RoomBooking;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room Bookings Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SoftwareModel.DataAccess.RoomBookingsRepository#getDatabasecontext <em>Databasecontext</em>}</li>
 * </ul>
 *
 * @see SoftwareModel.DataAccess.DataAccessPackage#getRoomBookingsRepository()
 * @model
 * @generated
 */
public interface RoomBookingsRepository extends EObject {
	/**
	 * Returns the value of the '<em><b>Databasecontext</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Databasecontext</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Databasecontext</em>' reference.
	 * @see #setDatabasecontext(DatabaseContext)
	 * @see SoftwareModel.DataAccess.DataAccessPackage#getRoomBookingsRepository_Databasecontext()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	DatabaseContext getDatabasecontext();

	/**
	 * Sets the value of the '{@link SoftwareModel.DataAccess.RoomBookingsRepository#getDatabasecontext <em>Databasecontext</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Databasecontext</em>' reference.
	 * @see #getDatabasecontext()
	 * @generated
	 */
	void setDatabasecontext(DatabaseContext value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model roomBookingRequired="true" roomBookingOrdered="false"
	 * @generated
	 */
	void update(RoomBooking roomBooking);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" nameDataType="org.eclipse.uml2.types.String" nameRequired="true" nameOrdered="false"
	 * @generated
	 */
	RoomBooking getByRoomResponsible(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" reservationNumberRequired="true" reservationNumberOrdered="false"
	 * @generated
	 */
	RoomBooking getByReservationNr(int reservationNumber);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 * @generated
	 */
	EList<RoomBooking> getAll();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" roomNrDataType="org.eclipse.uml2.types.Integer" roomNrRequired="true" roomNrOrdered="false"
	 * @generated
	 */
	RoomBooking getByRoomNr(int roomNr);

} // RoomBookingsRepository
