/**
 */
package SoftwareModel.BusinessLogic;

import SoftwareModel.DomainEntities.RoomBooking;
import SoftwareModel.DomainEntities.RoomType;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rooms</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see SoftwareModel.BusinessLogic.BusinessLogicPackage#getRooms()
 * @model
 * @generated
 */
public interface Rooms extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model roomBookingRequired="true" roomBookingOrdered="false"
	 * @generated
	 */
	void checkOut(RoomBooking roomBooking);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model roomBookingRequired="true" roomBookingOrdered="false"
	 * @generated
	 */
	void checkIn(RoomBooking roomBooking);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model roomNrDataType="org.eclipse.uml2.types.Integer" roomNrRequired="true" roomNrOrdered="false"
	 * @generated
	 */
	void findByRoomNr(int roomNr);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" adultsDataType="org.eclipse.uml2.types.Integer" adultsRequired="true" adultsOrdered="false" childrenDataType="org.eclipse.uml2.types.Integer" childrenRequired="true" childrenOrdered="false" startDateRequired="true" startDateOrdered="false" endDateRequired="true" endDateOrdered="false"
	 * @generated
	 */
	RoomType availibleRoomTypes(int adults, int children, Date startDate, Date endDate);

} // Rooms
