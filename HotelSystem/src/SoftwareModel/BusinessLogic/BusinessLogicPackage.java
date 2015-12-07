/**
 */
package SoftwareModel.BusinessLogic;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see SoftwareModel.BusinessLogic.BusinessLogicFactory
 * @model kind="package"
 * @generated
 */
public interface BusinessLogicPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "BusinessLogic";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///SoftwareModel/BusinessLogic.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "SoftwareModel.BusinessLogic";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BusinessLogicPackage eINSTANCE = SoftwareModel.BusinessLogic.impl.BusinessLogicPackageImpl.init();

	/**
	 * The meta object id for the '{@link SoftwareModel.BusinessLogic.impl.ReservationsImpl <em>Reservations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SoftwareModel.BusinessLogic.impl.ReservationsImpl
	 * @see SoftwareModel.BusinessLogic.impl.BusinessLogicPackageImpl#getReservations()
	 * @generated
	 */
	int RESERVATIONS = 0;

	/**
	 * The feature id for the '<em><b>Reservationsrepository</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATIONS__RESERVATIONSREPOSITORY = 0;

	/**
	 * The number of structural features of the '<em>Reservations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATIONS_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Update Reservation Details</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATIONS___UPDATE_RESERVATION_DETAILS__RESERVATION = 0;

	/**
	 * The operation id for the '<em>Make</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATIONS___MAKE__ELIST_PAYMENTDETAILS_BOOLEAN = 1;

	/**
	 * The operation id for the '<em>Cancel</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATIONS___CANCEL__RESERVATION = 2;

	/**
	 * The operation id for the '<em>Get Reservation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATIONS___GET_RESERVATION__INT = 3;

	/**
	 * The number of operations of the '<em>Reservations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATIONS_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link SoftwareModel.BusinessLogic.impl.RoomBookingsImpl <em>Room Bookings</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SoftwareModel.BusinessLogic.impl.RoomBookingsImpl
	 * @see SoftwareModel.BusinessLogic.impl.BusinessLogicPackageImpl#getRoomBookings()
	 * @generated
	 */
	int ROOM_BOOKINGS = 1;

	/**
	 * The feature id for the '<em><b>Roombookingsrepository</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_BOOKINGS__ROOMBOOKINGSREPOSITORY = 0;

	/**
	 * The feature id for the '<em><b>Availibleroomfinder</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_BOOKINGS__AVAILIBLEROOMFINDER = 1;

	/**
	 * The number of structural features of the '<em>Room Bookings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_BOOKINGS_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Check Out</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_BOOKINGS___CHECK_OUT__ROOMBOOKING = 0;

	/**
	 * The operation id for the '<em>Check In</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_BOOKINGS___CHECK_IN__ROOMBOOKING = 1;

	/**
	 * The operation id for the '<em>Find By Room Nr</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_BOOKINGS___FIND_BY_ROOM_NR__INT = 2;

	/**
	 * The number of operations of the '<em>Room Bookings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_BOOKINGS_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link SoftwareModel.BusinessLogic.impl.AvailibleRoomFinderImpl <em>Availible Room Finder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SoftwareModel.BusinessLogic.impl.AvailibleRoomFinderImpl
	 * @see SoftwareModel.BusinessLogic.impl.BusinessLogicPackageImpl#getAvailibleRoomFinder()
	 * @generated
	 */
	int AVAILIBLE_ROOM_FINDER = 2;

	/**
	 * The feature id for the '<em><b>Roomrepository</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILIBLE_ROOM_FINDER__ROOMREPOSITORY = 0;

	/**
	 * The feature id for the '<em><b>Roombookingsrepository</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILIBLE_ROOM_FINDER__ROOMBOOKINGSREPOSITORY = 1;

	/**
	 * The number of structural features of the '<em>Availible Room Finder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILIBLE_ROOM_FINDER_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Available Room Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILIBLE_ROOM_FINDER___AVAILABLE_ROOM_TYPES__INT_INT_DATE_DATE = 0;

	/**
	 * The operation id for the '<em>Availible Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILIBLE_ROOM_FINDER___AVAILIBLE_ROOM__ROOMBOOKING = 1;

	/**
	 * The number of operations of the '<em>Availible Room Finder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILIBLE_ROOM_FINDER_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link SoftwareModel.BusinessLogic.impl.RoomOperationsImpl <em>Room Operations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SoftwareModel.BusinessLogic.impl.RoomOperationsImpl
	 * @see SoftwareModel.BusinessLogic.impl.BusinessLogicPackageImpl#getRoomOperations()
	 * @generated
	 */
	int ROOM_OPERATIONS = 3;

	/**
	 * The feature id for the '<em><b>Roomrepository</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_OPERATIONS__ROOMREPOSITORY = 0;

	/**
	 * The number of structural features of the '<em>Room Operations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_OPERATIONS_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Modify Rate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_OPERATIONS___MODIFY_RATE__STRING_DOUBLE = 0;

	/**
	 * The operation id for the '<em>Make Room Available</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_OPERATIONS___MAKE_ROOM_AVAILABLE__INT = 1;

	/**
	 * The operation id for the '<em>Add Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_OPERATIONS___ADD_ROOM__INT_ENUMERATOR_STRING = 2;

	/**
	 * The operation id for the '<em>Remove Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_OPERATIONS___REMOVE_ROOM__INT = 3;

	/**
	 * The operation id for the '<em>Make Room Unavailable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_OPERATIONS___MAKE_ROOM_UNAVAILABLE__INT = 4;

	/**
	 * The number of operations of the '<em>Room Operations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_OPERATIONS_OPERATION_COUNT = 5;

	/**
	 * The meta object id for the '{@link SoftwareModel.BusinessLogic.impl.AuthorizerImpl <em>Authorizer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SoftwareModel.BusinessLogic.impl.AuthorizerImpl
	 * @see SoftwareModel.BusinessLogic.impl.BusinessLogicPackageImpl#getAuthorizer()
	 * @generated
	 */
	int AUTHORIZER = 4;

	/**
	 * The feature id for the '<em><b>Managerrepository</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZER__MANAGERREPOSITORY = 0;

	/**
	 * The number of structural features of the '<em>Authorizer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZER_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Authorize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZER___AUTHORIZE__STRING = 0;

	/**
	 * The number of operations of the '<em>Authorizer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZER_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link SoftwareModel.BusinessLogic.impl.RoomsImpl <em>Rooms</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SoftwareModel.BusinessLogic.impl.RoomsImpl
	 * @see SoftwareModel.BusinessLogic.impl.BusinessLogicPackageImpl#getRooms()
	 * @generated
	 */
	int ROOMS = 5;

	/**
	 * The feature id for the '<em><b>Availibleroomfinder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOMS__AVAILIBLEROOMFINDER = 0;

	/**
	 * The feature id for the '<em><b>Roombookings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOMS__ROOMBOOKINGS = 1;

	/**
	 * The number of structural features of the '<em>Rooms</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOMS_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Check Out</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOMS___CHECK_OUT__ROOMBOOKING = 0;

	/**
	 * The operation id for the '<em>Check In</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOMS___CHECK_IN__ROOMBOOKING = 1;

	/**
	 * The operation id for the '<em>Get Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOMS___GET_BOOKING__INT = 2;

	/**
	 * The operation id for the '<em>Availible Room Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOMS___AVAILIBLE_ROOM_TYPES__INT_INT_DATE_DATE = 3;

	/**
	 * The operation id for the '<em>Get Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOMS___GET_BOOKING__STRING = 4;

	/**
	 * The number of operations of the '<em>Rooms</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOMS_OPERATION_COUNT = 5;


	/**
	 * Returns the meta object for class '{@link SoftwareModel.BusinessLogic.Reservations <em>Reservations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reservations</em>'.
	 * @see SoftwareModel.BusinessLogic.Reservations
	 * @generated
	 */
	EClass getReservations();

	/**
	 * Returns the meta object for the containment reference '{@link SoftwareModel.BusinessLogic.Reservations#getReservationsrepository <em>Reservationsrepository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reservationsrepository</em>'.
	 * @see SoftwareModel.BusinessLogic.Reservations#getReservationsrepository()
	 * @see #getReservations()
	 * @generated
	 */
	EReference getReservations_Reservationsrepository();

	/**
	 * Returns the meta object for the '{@link SoftwareModel.BusinessLogic.Reservations#updateReservationDetails(SoftwareModel.DomainEntities.Reservation) <em>Update Reservation Details</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Reservation Details</em>' operation.
	 * @see SoftwareModel.BusinessLogic.Reservations#updateReservationDetails(SoftwareModel.DomainEntities.Reservation)
	 * @generated
	 */
	EOperation getReservations__UpdateReservationDetails__Reservation();

	/**
	 * Returns the meta object for the '{@link SoftwareModel.BusinessLogic.Reservations#make(org.eclipse.emf.common.util.EList, SoftwareModel.DomainEntities.PaymentDetails, boolean) <em>Make</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Make</em>' operation.
	 * @see SoftwareModel.BusinessLogic.Reservations#make(org.eclipse.emf.common.util.EList, SoftwareModel.DomainEntities.PaymentDetails, boolean)
	 * @generated
	 */
	EOperation getReservations__Make__EList_PaymentDetails_boolean();

	/**
	 * Returns the meta object for the '{@link SoftwareModel.BusinessLogic.Reservations#cancel(SoftwareModel.DomainEntities.Reservation) <em>Cancel</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Cancel</em>' operation.
	 * @see SoftwareModel.BusinessLogic.Reservations#cancel(SoftwareModel.DomainEntities.Reservation)
	 * @generated
	 */
	EOperation getReservations__Cancel__Reservation();

	/**
	 * Returns the meta object for the '{@link SoftwareModel.BusinessLogic.Reservations#getReservation(int) <em>Get Reservation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Reservation</em>' operation.
	 * @see SoftwareModel.BusinessLogic.Reservations#getReservation(int)
	 * @generated
	 */
	EOperation getReservations__GetReservation__int();

	/**
	 * Returns the meta object for class '{@link SoftwareModel.BusinessLogic.RoomBookings <em>Room Bookings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room Bookings</em>'.
	 * @see SoftwareModel.BusinessLogic.RoomBookings
	 * @generated
	 */
	EClass getRoomBookings();

	/**
	 * Returns the meta object for the containment reference '{@link SoftwareModel.BusinessLogic.RoomBookings#getRoombookingsrepository <em>Roombookingsrepository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Roombookingsrepository</em>'.
	 * @see SoftwareModel.BusinessLogic.RoomBookings#getRoombookingsrepository()
	 * @see #getRoomBookings()
	 * @generated
	 */
	EReference getRoomBookings_Roombookingsrepository();

	/**
	 * Returns the meta object for the reference '{@link SoftwareModel.BusinessLogic.RoomBookings#getAvailibleroomfinder <em>Availibleroomfinder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Availibleroomfinder</em>'.
	 * @see SoftwareModel.BusinessLogic.RoomBookings#getAvailibleroomfinder()
	 * @see #getRoomBookings()
	 * @generated
	 */
	EReference getRoomBookings_Availibleroomfinder();

	/**
	 * Returns the meta object for the '{@link SoftwareModel.BusinessLogic.RoomBookings#checkOut(SoftwareModel.DomainEntities.RoomBooking) <em>Check Out</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Out</em>' operation.
	 * @see SoftwareModel.BusinessLogic.RoomBookings#checkOut(SoftwareModel.DomainEntities.RoomBooking)
	 * @generated
	 */
	EOperation getRoomBookings__CheckOut__RoomBooking();

	/**
	 * Returns the meta object for the '{@link SoftwareModel.BusinessLogic.RoomBookings#checkIn(SoftwareModel.DomainEntities.RoomBooking) <em>Check In</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check In</em>' operation.
	 * @see SoftwareModel.BusinessLogic.RoomBookings#checkIn(SoftwareModel.DomainEntities.RoomBooking)
	 * @generated
	 */
	EOperation getRoomBookings__CheckIn__RoomBooking();

	/**
	 * Returns the meta object for the '{@link SoftwareModel.BusinessLogic.RoomBookings#findByRoomNr(int) <em>Find By Room Nr</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find By Room Nr</em>' operation.
	 * @see SoftwareModel.BusinessLogic.RoomBookings#findByRoomNr(int)
	 * @generated
	 */
	EOperation getRoomBookings__FindByRoomNr__int();

	/**
	 * Returns the meta object for class '{@link SoftwareModel.BusinessLogic.AvailibleRoomFinder <em>Availible Room Finder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Availible Room Finder</em>'.
	 * @see SoftwareModel.BusinessLogic.AvailibleRoomFinder
	 * @generated
	 */
	EClass getAvailibleRoomFinder();

	/**
	 * Returns the meta object for the containment reference '{@link SoftwareModel.BusinessLogic.AvailibleRoomFinder#getRoomrepository <em>Roomrepository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Roomrepository</em>'.
	 * @see SoftwareModel.BusinessLogic.AvailibleRoomFinder#getRoomrepository()
	 * @see #getAvailibleRoomFinder()
	 * @generated
	 */
	EReference getAvailibleRoomFinder_Roomrepository();

	/**
	 * Returns the meta object for the reference '{@link SoftwareModel.BusinessLogic.AvailibleRoomFinder#getRoombookingsrepository <em>Roombookingsrepository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Roombookingsrepository</em>'.
	 * @see SoftwareModel.BusinessLogic.AvailibleRoomFinder#getRoombookingsrepository()
	 * @see #getAvailibleRoomFinder()
	 * @generated
	 */
	EReference getAvailibleRoomFinder_Roombookingsrepository();

	/**
	 * Returns the meta object for the '{@link SoftwareModel.BusinessLogic.AvailibleRoomFinder#availableRoomTypes(int, int, java.util.Date, java.util.Date) <em>Available Room Types</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Available Room Types</em>' operation.
	 * @see SoftwareModel.BusinessLogic.AvailibleRoomFinder#availableRoomTypes(int, int, java.util.Date, java.util.Date)
	 * @generated
	 */
	EOperation getAvailibleRoomFinder__AvailableRoomTypes__int_int_Date_Date();

	/**
	 * Returns the meta object for the '{@link SoftwareModel.BusinessLogic.AvailibleRoomFinder#availibleRoom(SoftwareModel.DomainEntities.RoomBooking) <em>Availible Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Availible Room</em>' operation.
	 * @see SoftwareModel.BusinessLogic.AvailibleRoomFinder#availibleRoom(SoftwareModel.DomainEntities.RoomBooking)
	 * @generated
	 */
	EOperation getAvailibleRoomFinder__AvailibleRoom__RoomBooking();

	/**
	 * Returns the meta object for class '{@link SoftwareModel.BusinessLogic.RoomOperations <em>Room Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room Operations</em>'.
	 * @see SoftwareModel.BusinessLogic.RoomOperations
	 * @generated
	 */
	EClass getRoomOperations();

	/**
	 * Returns the meta object for the containment reference '{@link SoftwareModel.BusinessLogic.RoomOperations#getRoomrepository <em>Roomrepository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Roomrepository</em>'.
	 * @see SoftwareModel.BusinessLogic.RoomOperations#getRoomrepository()
	 * @see #getRoomOperations()
	 * @generated
	 */
	EReference getRoomOperations_Roomrepository();

	/**
	 * Returns the meta object for the '{@link SoftwareModel.BusinessLogic.RoomOperations#modifyRate(java.lang.String, double) <em>Modify Rate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Modify Rate</em>' operation.
	 * @see SoftwareModel.BusinessLogic.RoomOperations#modifyRate(java.lang.String, double)
	 * @generated
	 */
	EOperation getRoomOperations__ModifyRate__String_double();

	/**
	 * Returns the meta object for the '{@link SoftwareModel.BusinessLogic.RoomOperations#makeRoomAvailable(int) <em>Make Room Available</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Make Room Available</em>' operation.
	 * @see SoftwareModel.BusinessLogic.RoomOperations#makeRoomAvailable(int)
	 * @generated
	 */
	EOperation getRoomOperations__MakeRoomAvailable__int();

	/**
	 * Returns the meta object for the '{@link SoftwareModel.BusinessLogic.RoomOperations#addRoom(int, org.eclipse.emf.common.util.Enumerator, java.lang.String) <em>Add Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Room</em>' operation.
	 * @see SoftwareModel.BusinessLogic.RoomOperations#addRoom(int, org.eclipse.emf.common.util.Enumerator, java.lang.String)
	 * @generated
	 */
	EOperation getRoomOperations__AddRoom__int_Enumerator_String();

	/**
	 * Returns the meta object for the '{@link SoftwareModel.BusinessLogic.RoomOperations#removeRoom(int) <em>Remove Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Room</em>' operation.
	 * @see SoftwareModel.BusinessLogic.RoomOperations#removeRoom(int)
	 * @generated
	 */
	EOperation getRoomOperations__RemoveRoom__int();

	/**
	 * Returns the meta object for the '{@link SoftwareModel.BusinessLogic.RoomOperations#makeRoomUnavailable(int) <em>Make Room Unavailable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Make Room Unavailable</em>' operation.
	 * @see SoftwareModel.BusinessLogic.RoomOperations#makeRoomUnavailable(int)
	 * @generated
	 */
	EOperation getRoomOperations__MakeRoomUnavailable__int();

	/**
	 * Returns the meta object for class '{@link SoftwareModel.BusinessLogic.Authorizer <em>Authorizer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Authorizer</em>'.
	 * @see SoftwareModel.BusinessLogic.Authorizer
	 * @generated
	 */
	EClass getAuthorizer();

	/**
	 * Returns the meta object for the containment reference '{@link SoftwareModel.BusinessLogic.Authorizer#getManagerrepository <em>Managerrepository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Managerrepository</em>'.
	 * @see SoftwareModel.BusinessLogic.Authorizer#getManagerrepository()
	 * @see #getAuthorizer()
	 * @generated
	 */
	EReference getAuthorizer_Managerrepository();

	/**
	 * Returns the meta object for the '{@link SoftwareModel.BusinessLogic.Authorizer#Authorize(java.lang.String) <em>Authorize</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Authorize</em>' operation.
	 * @see SoftwareModel.BusinessLogic.Authorizer#Authorize(java.lang.String)
	 * @generated
	 */
	EOperation getAuthorizer__Authorize__String();

	/**
	 * Returns the meta object for class '{@link SoftwareModel.BusinessLogic.Rooms <em>Rooms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rooms</em>'.
	 * @see SoftwareModel.BusinessLogic.Rooms
	 * @generated
	 */
	EClass getRooms();

	/**
	 * Returns the meta object for the containment reference '{@link SoftwareModel.BusinessLogic.Rooms#getAvailibleroomfinder <em>Availibleroomfinder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Availibleroomfinder</em>'.
	 * @see SoftwareModel.BusinessLogic.Rooms#getAvailibleroomfinder()
	 * @see #getRooms()
	 * @generated
	 */
	EReference getRooms_Availibleroomfinder();

	/**
	 * Returns the meta object for the containment reference '{@link SoftwareModel.BusinessLogic.Rooms#getRoombookings <em>Roombookings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Roombookings</em>'.
	 * @see SoftwareModel.BusinessLogic.Rooms#getRoombookings()
	 * @see #getRooms()
	 * @generated
	 */
	EReference getRooms_Roombookings();

	/**
	 * Returns the meta object for the '{@link SoftwareModel.BusinessLogic.Rooms#checkOut(SoftwareModel.DomainEntities.RoomBooking) <em>Check Out</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Out</em>' operation.
	 * @see SoftwareModel.BusinessLogic.Rooms#checkOut(SoftwareModel.DomainEntities.RoomBooking)
	 * @generated
	 */
	EOperation getRooms__CheckOut__RoomBooking();

	/**
	 * Returns the meta object for the '{@link SoftwareModel.BusinessLogic.Rooms#checkIn(SoftwareModel.DomainEntities.RoomBooking) <em>Check In</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check In</em>' operation.
	 * @see SoftwareModel.BusinessLogic.Rooms#checkIn(SoftwareModel.DomainEntities.RoomBooking)
	 * @generated
	 */
	EOperation getRooms__CheckIn__RoomBooking();

	/**
	 * Returns the meta object for the '{@link SoftwareModel.BusinessLogic.Rooms#getBooking(int) <em>Get Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Booking</em>' operation.
	 * @see SoftwareModel.BusinessLogic.Rooms#getBooking(int)
	 * @generated
	 */
	EOperation getRooms__GetBooking__int();

	/**
	 * Returns the meta object for the '{@link SoftwareModel.BusinessLogic.Rooms#availibleRoomTypes(int, int, java.util.Date, java.util.Date) <em>Availible Room Types</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Availible Room Types</em>' operation.
	 * @see SoftwareModel.BusinessLogic.Rooms#availibleRoomTypes(int, int, java.util.Date, java.util.Date)
	 * @generated
	 */
	EOperation getRooms__AvailibleRoomTypes__int_int_Date_Date();

	/**
	 * Returns the meta object for the '{@link SoftwareModel.BusinessLogic.Rooms#getBooking(java.lang.String) <em>Get Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Booking</em>' operation.
	 * @see SoftwareModel.BusinessLogic.Rooms#getBooking(java.lang.String)
	 * @generated
	 */
	EOperation getRooms__GetBooking__String();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BusinessLogicFactory getBusinessLogicFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link SoftwareModel.BusinessLogic.impl.ReservationsImpl <em>Reservations</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SoftwareModel.BusinessLogic.impl.ReservationsImpl
		 * @see SoftwareModel.BusinessLogic.impl.BusinessLogicPackageImpl#getReservations()
		 * @generated
		 */
		EClass RESERVATIONS = eINSTANCE.getReservations();

		/**
		 * The meta object literal for the '<em><b>Reservationsrepository</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESERVATIONS__RESERVATIONSREPOSITORY = eINSTANCE.getReservations_Reservationsrepository();

		/**
		 * The meta object literal for the '<em><b>Update Reservation Details</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESERVATIONS___UPDATE_RESERVATION_DETAILS__RESERVATION = eINSTANCE.getReservations__UpdateReservationDetails__Reservation();

		/**
		 * The meta object literal for the '<em><b>Make</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESERVATIONS___MAKE__ELIST_PAYMENTDETAILS_BOOLEAN = eINSTANCE.getReservations__Make__EList_PaymentDetails_boolean();

		/**
		 * The meta object literal for the '<em><b>Cancel</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESERVATIONS___CANCEL__RESERVATION = eINSTANCE.getReservations__Cancel__Reservation();

		/**
		 * The meta object literal for the '<em><b>Get Reservation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESERVATIONS___GET_RESERVATION__INT = eINSTANCE.getReservations__GetReservation__int();

		/**
		 * The meta object literal for the '{@link SoftwareModel.BusinessLogic.impl.RoomBookingsImpl <em>Room Bookings</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SoftwareModel.BusinessLogic.impl.RoomBookingsImpl
		 * @see SoftwareModel.BusinessLogic.impl.BusinessLogicPackageImpl#getRoomBookings()
		 * @generated
		 */
		EClass ROOM_BOOKINGS = eINSTANCE.getRoomBookings();

		/**
		 * The meta object literal for the '<em><b>Roombookingsrepository</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM_BOOKINGS__ROOMBOOKINGSREPOSITORY = eINSTANCE.getRoomBookings_Roombookingsrepository();

		/**
		 * The meta object literal for the '<em><b>Availibleroomfinder</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM_BOOKINGS__AVAILIBLEROOMFINDER = eINSTANCE.getRoomBookings_Availibleroomfinder();

		/**
		 * The meta object literal for the '<em><b>Check Out</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_BOOKINGS___CHECK_OUT__ROOMBOOKING = eINSTANCE.getRoomBookings__CheckOut__RoomBooking();

		/**
		 * The meta object literal for the '<em><b>Check In</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_BOOKINGS___CHECK_IN__ROOMBOOKING = eINSTANCE.getRoomBookings__CheckIn__RoomBooking();

		/**
		 * The meta object literal for the '<em><b>Find By Room Nr</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_BOOKINGS___FIND_BY_ROOM_NR__INT = eINSTANCE.getRoomBookings__FindByRoomNr__int();

		/**
		 * The meta object literal for the '{@link SoftwareModel.BusinessLogic.impl.AvailibleRoomFinderImpl <em>Availible Room Finder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SoftwareModel.BusinessLogic.impl.AvailibleRoomFinderImpl
		 * @see SoftwareModel.BusinessLogic.impl.BusinessLogicPackageImpl#getAvailibleRoomFinder()
		 * @generated
		 */
		EClass AVAILIBLE_ROOM_FINDER = eINSTANCE.getAvailibleRoomFinder();

		/**
		 * The meta object literal for the '<em><b>Roomrepository</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AVAILIBLE_ROOM_FINDER__ROOMREPOSITORY = eINSTANCE.getAvailibleRoomFinder_Roomrepository();

		/**
		 * The meta object literal for the '<em><b>Roombookingsrepository</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AVAILIBLE_ROOM_FINDER__ROOMBOOKINGSREPOSITORY = eINSTANCE.getAvailibleRoomFinder_Roombookingsrepository();

		/**
		 * The meta object literal for the '<em><b>Available Room Types</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation AVAILIBLE_ROOM_FINDER___AVAILABLE_ROOM_TYPES__INT_INT_DATE_DATE = eINSTANCE.getAvailibleRoomFinder__AvailableRoomTypes__int_int_Date_Date();

		/**
		 * The meta object literal for the '<em><b>Availible Room</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation AVAILIBLE_ROOM_FINDER___AVAILIBLE_ROOM__ROOMBOOKING = eINSTANCE.getAvailibleRoomFinder__AvailibleRoom__RoomBooking();

		/**
		 * The meta object literal for the '{@link SoftwareModel.BusinessLogic.impl.RoomOperationsImpl <em>Room Operations</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SoftwareModel.BusinessLogic.impl.RoomOperationsImpl
		 * @see SoftwareModel.BusinessLogic.impl.BusinessLogicPackageImpl#getRoomOperations()
		 * @generated
		 */
		EClass ROOM_OPERATIONS = eINSTANCE.getRoomOperations();

		/**
		 * The meta object literal for the '<em><b>Roomrepository</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM_OPERATIONS__ROOMREPOSITORY = eINSTANCE.getRoomOperations_Roomrepository();

		/**
		 * The meta object literal for the '<em><b>Modify Rate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_OPERATIONS___MODIFY_RATE__STRING_DOUBLE = eINSTANCE.getRoomOperations__ModifyRate__String_double();

		/**
		 * The meta object literal for the '<em><b>Make Room Available</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_OPERATIONS___MAKE_ROOM_AVAILABLE__INT = eINSTANCE.getRoomOperations__MakeRoomAvailable__int();

		/**
		 * The meta object literal for the '<em><b>Add Room</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_OPERATIONS___ADD_ROOM__INT_ENUMERATOR_STRING = eINSTANCE.getRoomOperations__AddRoom__int_Enumerator_String();

		/**
		 * The meta object literal for the '<em><b>Remove Room</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_OPERATIONS___REMOVE_ROOM__INT = eINSTANCE.getRoomOperations__RemoveRoom__int();

		/**
		 * The meta object literal for the '<em><b>Make Room Unavailable</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_OPERATIONS___MAKE_ROOM_UNAVAILABLE__INT = eINSTANCE.getRoomOperations__MakeRoomUnavailable__int();

		/**
		 * The meta object literal for the '{@link SoftwareModel.BusinessLogic.impl.AuthorizerImpl <em>Authorizer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SoftwareModel.BusinessLogic.impl.AuthorizerImpl
		 * @see SoftwareModel.BusinessLogic.impl.BusinessLogicPackageImpl#getAuthorizer()
		 * @generated
		 */
		EClass AUTHORIZER = eINSTANCE.getAuthorizer();

		/**
		 * The meta object literal for the '<em><b>Managerrepository</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTHORIZER__MANAGERREPOSITORY = eINSTANCE.getAuthorizer_Managerrepository();

		/**
		 * The meta object literal for the '<em><b>Authorize</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation AUTHORIZER___AUTHORIZE__STRING = eINSTANCE.getAuthorizer__Authorize__String();

		/**
		 * The meta object literal for the '{@link SoftwareModel.BusinessLogic.impl.RoomsImpl <em>Rooms</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SoftwareModel.BusinessLogic.impl.RoomsImpl
		 * @see SoftwareModel.BusinessLogic.impl.BusinessLogicPackageImpl#getRooms()
		 * @generated
		 */
		EClass ROOMS = eINSTANCE.getRooms();

		/**
		 * The meta object literal for the '<em><b>Availibleroomfinder</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOMS__AVAILIBLEROOMFINDER = eINSTANCE.getRooms_Availibleroomfinder();

		/**
		 * The meta object literal for the '<em><b>Roombookings</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOMS__ROOMBOOKINGS = eINSTANCE.getRooms_Roombookings();

		/**
		 * The meta object literal for the '<em><b>Check Out</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOMS___CHECK_OUT__ROOMBOOKING = eINSTANCE.getRooms__CheckOut__RoomBooking();

		/**
		 * The meta object literal for the '<em><b>Check In</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOMS___CHECK_IN__ROOMBOOKING = eINSTANCE.getRooms__CheckIn__RoomBooking();

		/**
		 * The meta object literal for the '<em><b>Get Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOMS___GET_BOOKING__INT = eINSTANCE.getRooms__GetBooking__int();

		/**
		 * The meta object literal for the '<em><b>Availible Room Types</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOMS___AVAILIBLE_ROOM_TYPES__INT_INT_DATE_DATE = eINSTANCE.getRooms__AvailibleRoomTypes__int_int_Date_Date();

		/**
		 * The meta object literal for the '<em><b>Get Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOMS___GET_BOOKING__STRING = eINSTANCE.getRooms__GetBooking__String();

	}

} //BusinessLogicPackage
