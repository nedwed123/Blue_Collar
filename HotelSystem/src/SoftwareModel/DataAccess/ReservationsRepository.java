/**
 */
package SoftwareModel.DataAccess;

import SoftwareModel.DomainEntities.Reservation;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reservations Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SoftwareModel.DataAccess.ReservationsRepository#getDatabasecontext <em>Databasecontext</em>}</li>
 * </ul>
 *
 * @see SoftwareModel.DataAccess.DataAccessPackage#getReservationsRepository()
 * @model
 * @generated
 */
public interface ReservationsRepository extends EObject {
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
	 * @see SoftwareModel.DataAccess.DataAccessPackage#getReservationsRepository_Databasecontext()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	DatabaseContext getDatabasecontext();

	/**
	 * Sets the value of the '{@link SoftwareModel.DataAccess.ReservationsRepository#getDatabasecontext <em>Databasecontext</em>}' reference.
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
	 * @model reservationRequired="true" reservationOrdered="false"
	 * @generated
	 */
	void update(Reservation reservation);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" reservationNumberRequired="true" reservationNumberOrdered="false"
	 * @generated
	 */
	Reservation get(int reservationNumber);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" reservationRequired="true" reservationOrdered="false"
	 * @generated
	 */
	Reservation addNew(Reservation reservation);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model reservationNumberRequired="true" reservationNumberOrdered="false"
	 * @generated
	 */
	void remove(int reservationNumber);

} // ReservationsRepository
