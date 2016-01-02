/**
 */
package SoftwareModel.DomainEntities;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reservation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SoftwareModel.DomainEntities.Reservation#getRoombooking <em>Roombooking</em>}</li>
 *   <li>{@link SoftwareModel.DomainEntities.Reservation#getPreliminaryCheckIn <em>Preliminary Check In</em>}</li>
 *   <li>{@link SoftwareModel.DomainEntities.Reservation#getPreliminaryCheckOut <em>Preliminary Check Out</em>}</li>
 *   <li>{@link SoftwareModel.DomainEntities.Reservation#getReservationId <em>Reservation Id</em>}</li>
 *   <li>{@link SoftwareModel.DomainEntities.Reservation#getDiscountCode <em>Discount Code</em>}</li>
 *   <li>{@link SoftwareModel.DomainEntities.Reservation#getPaymentdetails <em>Paymentdetails</em>}</li>
 *   <li>{@link SoftwareModel.DomainEntities.Reservation#getCancelationpolicy <em>Cancelationpolicy</em>}</li>
 * </ul>
 *
 * @see SoftwareModel.DomainEntities.DomainEntitiesPackage#getReservation()
 * @model
 * @generated
 */
public interface Reservation extends EObject {
	/**
	 * Returns the value of the '<em><b>Roombooking</b></em>' reference list.
	 * The list contents are of type {@link SoftwareModel.DomainEntities.RoomBooking}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roombooking</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roombooking</em>' reference list.
	 * @see SoftwareModel.DomainEntities.DomainEntitiesPackage#getReservation_Roombooking()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<RoomBooking> getRoombooking();

	/**
	 * Returns the value of the '<em><b>Preliminary Check In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Preliminary Check In</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preliminary Check In</em>' attribute.
	 * @see #setPreliminaryCheckIn(Date)
	 * @see SoftwareModel.DomainEntities.DomainEntitiesPackage#getReservation_PreliminaryCheckIn()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Date getPreliminaryCheckIn();

	/**
	 * Sets the value of the '{@link SoftwareModel.DomainEntities.Reservation#getPreliminaryCheckIn <em>Preliminary Check In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preliminary Check In</em>' attribute.
	 * @see #getPreliminaryCheckIn()
	 * @generated
	 */
	void setPreliminaryCheckIn(Date value);

	/**
	 * Returns the value of the '<em><b>Preliminary Check Out</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Preliminary Check Out</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preliminary Check Out</em>' attribute.
	 * @see #setPreliminaryCheckOut(Date)
	 * @see SoftwareModel.DomainEntities.DomainEntitiesPackage#getReservation_PreliminaryCheckOut()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Date getPreliminaryCheckOut();

	/**
	 * Sets the value of the '{@link SoftwareModel.DomainEntities.Reservation#getPreliminaryCheckOut <em>Preliminary Check Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preliminary Check Out</em>' attribute.
	 * @see #getPreliminaryCheckOut()
	 * @generated
	 */
	void setPreliminaryCheckOut(Date value);

	/**
	 * Returns the value of the '<em><b>Reservation Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reservation Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reservation Id</em>' attribute.
	 * @see #setReservationId(int)
	 * @see SoftwareModel.DomainEntities.DomainEntitiesPackage#getReservation_ReservationId()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getReservationId();

	/**
	 * Sets the value of the '{@link SoftwareModel.DomainEntities.Reservation#getReservationId <em>Reservation Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reservation Id</em>' attribute.
	 * @see #getReservationId()
	 * @generated
	 */
	void setReservationId(int value);

	/**
	 * Returns the value of the '<em><b>Discount Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Discount Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discount Code</em>' attribute.
	 * @see #setDiscountCode(String)
	 * @see SoftwareModel.DomainEntities.DomainEntitiesPackage#getReservation_DiscountCode()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getDiscountCode();

	/**
	 * Sets the value of the '{@link SoftwareModel.DomainEntities.Reservation#getDiscountCode <em>Discount Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discount Code</em>' attribute.
	 * @see #getDiscountCode()
	 * @generated
	 */
	void setDiscountCode(String value);

	/**
	 * Returns the value of the '<em><b>Paymentdetails</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Paymentdetails</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paymentdetails</em>' reference.
	 * @see #setPaymentdetails(PaymentDetails)
	 * @see SoftwareModel.DomainEntities.DomainEntitiesPackage#getReservation_Paymentdetails()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	PaymentDetails getPaymentdetails();

	/**
	 * Sets the value of the '{@link SoftwareModel.DomainEntities.Reservation#getPaymentdetails <em>Paymentdetails</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Paymentdetails</em>' reference.
	 * @see #getPaymentdetails()
	 * @generated
	 */
	void setPaymentdetails(PaymentDetails value);

	/**
	 * Returns the value of the '<em><b>Cancelationpolicy</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cancelationpolicy</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cancelationpolicy</em>' reference.
	 * @see #setCancelationpolicy(CustomerCancelationPolicy)
	 * @see SoftwareModel.DomainEntities.DomainEntitiesPackage#getReservation_Cancelationpolicy()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	CustomerCancelationPolicy getCancelationpolicy();

	/**
	 * Sets the value of the '{@link SoftwareModel.DomainEntities.Reservation#getCancelationpolicy <em>Cancelationpolicy</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cancelationpolicy</em>' reference.
	 * @see #getCancelationpolicy()
	 * @generated
	 */
	void setCancelationpolicy(CustomerCancelationPolicy value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void cancel();

} // Reservation
