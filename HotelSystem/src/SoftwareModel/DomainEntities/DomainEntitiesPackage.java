/**
 */
package SoftwareModel.DomainEntities;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see SoftwareModel.DomainEntities.DomainEntitiesFactory
 * @model kind="package"
 * @generated
 */
public interface DomainEntitiesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "DomainEntities";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///SoftwareModel/DomainEntities.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "SoftwareModel.DomainEntities";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DomainEntitiesPackage eINSTANCE = SoftwareModel.DomainEntities.impl.DomainEntitiesPackageImpl.init();

	/**
	 * The meta object id for the '{@link SoftwareModel.DomainEntities.impl.RoomTypeImpl <em>Room Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SoftwareModel.DomainEntities.impl.RoomTypeImpl
	 * @see SoftwareModel.DomainEntities.impl.DomainEntitiesPackageImpl#getRoomType()
	 * @generated
	 */
	int ROOM_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE__SIZE = 0;

	/**
	 * The feature id for the '<em><b>Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE__RATE = 1;

	/**
	 * The feature id for the '<em><b>Bedtype</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE__BEDTYPE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE__NAME = 3;

	/**
	 * The feature id for the '<em><b>Beds</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE__BEDS = 4;

	/**
	 * The number of structural features of the '<em>Room Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Room Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link SoftwareModel.DomainEntities.impl.PaymentDetailsImpl <em>Payment Details</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SoftwareModel.DomainEntities.impl.PaymentDetailsImpl
	 * @see SoftwareModel.DomainEntities.impl.DomainEntitiesPackageImpl#getPaymentDetails()
	 * @generated
	 */
	int PAYMENT_DETAILS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_DETAILS__NAME = 0;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_DETAILS__ADDRESS = 1;

	/**
	 * The feature id for the '<em><b>Phone Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_DETAILS__PHONE_NUMBER = 2;

	/**
	 * The number of structural features of the '<em>Payment Details</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_DETAILS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Payment Details</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_DETAILS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link SoftwareModel.DomainEntities.impl.ReservationImpl <em>Reservation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SoftwareModel.DomainEntities.impl.ReservationImpl
	 * @see SoftwareModel.DomainEntities.impl.DomainEntitiesPackageImpl#getReservation()
	 * @generated
	 */
	int RESERVATION = 2;

	/**
	 * The feature id for the '<em><b>Roombooking</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION__ROOMBOOKING = 0;

	/**
	 * The feature id for the '<em><b>Preliminary Check In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION__PRELIMINARY_CHECK_IN = 1;

	/**
	 * The feature id for the '<em><b>Preliminary Check Out</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION__PRELIMINARY_CHECK_OUT = 2;

	/**
	 * The feature id for the '<em><b>Reservation Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION__RESERVATION_ID = 3;

	/**
	 * The feature id for the '<em><b>Discount Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION__DISCOUNT_CODE = 4;

	/**
	 * The feature id for the '<em><b>Paymentdetails</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION__PAYMENTDETAILS = 5;

	/**
	 * The number of structural features of the '<em>Reservation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_FEATURE_COUNT = 6;

	/**
	 * The operation id for the '<em>Cancel</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION___CANCEL = 0;

	/**
	 * The number of operations of the '<em>Reservation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link SoftwareModel.DomainEntities.impl.RoomBookingImpl <em>Room Booking</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SoftwareModel.DomainEntities.impl.RoomBookingImpl
	 * @see SoftwareModel.DomainEntities.impl.DomainEntitiesPackageImpl#getRoomBooking()
	 * @generated
	 */
	int ROOM_BOOKING = 3;

	/**
	 * The feature id for the '<em><b>Is Checked In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_BOOKING__IS_CHECKED_IN = 0;

	/**
	 * The feature id for the '<em><b>Roomresponsible</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_BOOKING__ROOMRESPONSIBLE = 1;

	/**
	 * The feature id for the '<em><b>Adults</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_BOOKING__ADULTS = 2;

	/**
	 * The feature id for the '<em><b>Children</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_BOOKING__CHILDREN = 3;

	/**
	 * The feature id for the '<em><b>Check Out Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_BOOKING__CHECK_OUT_DATE = 4;

	/**
	 * The feature id for the '<em><b>Check In Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_BOOKING__CHECK_IN_DATE = 5;

	/**
	 * The feature id for the '<em><b>Roomtype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_BOOKING__ROOMTYPE = 6;

	/**
	 * The feature id for the '<em><b>Room</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_BOOKING__ROOM = 7;

	/**
	 * The number of structural features of the '<em>Room Booking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_BOOKING_FEATURE_COUNT = 8;

	/**
	 * The operation id for the '<em>Check In</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_BOOKING___CHECK_IN = 0;

	/**
	 * The operation id for the '<em>Check Out</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_BOOKING___CHECK_OUT = 1;

	/**
	 * The number of operations of the '<em>Room Booking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_BOOKING_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link SoftwareModel.DomainEntities.impl.RoomResponsibleImpl <em>Room Responsible</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SoftwareModel.DomainEntities.impl.RoomResponsibleImpl
	 * @see SoftwareModel.DomainEntities.impl.DomainEntitiesPackageImpl#getRoomResponsible()
	 * @generated
	 */
	int ROOM_RESPONSIBLE = 4;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_RESPONSIBLE__FIRST_NAME = 0;

	/**
	 * The feature id for the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_RESPONSIBLE__LAST_NAME = 1;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_RESPONSIBLE__ADDRESS = 2;

	/**
	 * The feature id for the '<em><b>Phone Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_RESPONSIBLE__PHONE_NUMBER = 3;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_RESPONSIBLE__EMAIL = 4;

	/**
	 * The number of structural features of the '<em>Room Responsible</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_RESPONSIBLE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Room Responsible</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_RESPONSIBLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link SoftwareModel.DomainEntities.impl.BillImpl <em>Bill</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SoftwareModel.DomainEntities.impl.BillImpl
	 * @see SoftwareModel.DomainEntities.impl.DomainEntitiesPackageImpl#getBill()
	 * @generated
	 */
	int BILL = 6;

	/**
	 * The meta object id for the '{@link SoftwareModel.DomainEntities.impl.RoomImpl <em>Room</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SoftwareModel.DomainEntities.impl.RoomImpl
	 * @see SoftwareModel.DomainEntities.impl.DomainEntitiesPackageImpl#getRoom()
	 * @generated
	 */
	int ROOM = 5;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Availability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__AVAILABILITY = 1;

	/**
	 * The feature id for the '<em><b>View</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__VIEW = 2;

	/**
	 * The feature id for the '<em><b>Smoking</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__SMOKING = 3;

	/**
	 * The feature id for the '<em><b>Pets Allowed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__PETS_ALLOWED = 4;

	/**
	 * The feature id for the '<em><b>Disabled Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__DISABLED_ACCESS = 5;

	/**
	 * The feature id for the '<em><b>Roomtype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__ROOMTYPE = 6;

	/**
	 * The number of structural features of the '<em>Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_OPERATION_COUNT = 0;

	/**
	 * The number of structural features of the '<em>Bill</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Bill</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link SoftwareModel.DomainEntities.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SoftwareModel.DomainEntities.impl.ServiceImpl
	 * @see SoftwareModel.DomainEntities.impl.DomainEntitiesPackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 7;

	/**
	 * The feature id for the '<em><b>Service Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__SERVICE_DATE = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__PRICE = 2;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link SoftwareModel.DomainEntities.impl.CancelationPolicyImpl <em>Cancelation Policy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SoftwareModel.DomainEntities.impl.CancelationPolicyImpl
	 * @see SoftwareModel.DomainEntities.impl.DomainEntitiesPackageImpl#getCancelationPolicy()
	 * @generated
	 */
	int CANCELATION_POLICY = 8;

	/**
	 * The feature id for the '<em><b>Min Days Before Cancelation By Customer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANCELATION_POLICY__MIN_DAYS_BEFORE_CANCELATION_BY_CUSTOMER = 0;

	/**
	 * The number of structural features of the '<em>Cancelation Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANCELATION_POLICY_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Can Be Cancelled</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANCELATION_POLICY___CAN_BE_CANCELLED__BOOLEAN_RESERVATION = 0;

	/**
	 * The number of operations of the '<em>Cancelation Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANCELATION_POLICY_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link SoftwareModel.DomainEntities.BedType <em>Bed Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SoftwareModel.DomainEntities.BedType
	 * @see SoftwareModel.DomainEntities.impl.DomainEntitiesPackageImpl#getBedType()
	 * @generated
	 */
	int BED_TYPE = 9;

	/**
	 * The meta object id for the '{@link SoftwareModel.DomainEntities.Availability <em>Availability</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SoftwareModel.DomainEntities.Availability
	 * @see SoftwareModel.DomainEntities.impl.DomainEntitiesPackageImpl#getAvailability()
	 * @generated
	 */
	int AVAILABILITY = 10;


	/**
	 * Returns the meta object for class '{@link SoftwareModel.DomainEntities.RoomType <em>Room Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room Type</em>'.
	 * @see SoftwareModel.DomainEntities.RoomType
	 * @generated
	 */
	EClass getRoomType();

	/**
	 * Returns the meta object for the attribute '{@link SoftwareModel.DomainEntities.RoomType#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see SoftwareModel.DomainEntities.RoomType#getSize()
	 * @see #getRoomType()
	 * @generated
	 */
	EAttribute getRoomType_Size();

	/**
	 * Returns the meta object for the attribute '{@link SoftwareModel.DomainEntities.RoomType#getRate <em>Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rate</em>'.
	 * @see SoftwareModel.DomainEntities.RoomType#getRate()
	 * @see #getRoomType()
	 * @generated
	 */
	EAttribute getRoomType_Rate();

	/**
	 * Returns the meta object for the attribute list '{@link SoftwareModel.DomainEntities.RoomType#getBedtype <em>Bedtype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Bedtype</em>'.
	 * @see SoftwareModel.DomainEntities.RoomType#getBedtype()
	 * @see #getRoomType()
	 * @generated
	 */
	EAttribute getRoomType_Bedtype();

	/**
	 * Returns the meta object for the attribute '{@link SoftwareModel.DomainEntities.RoomType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see SoftwareModel.DomainEntities.RoomType#getName()
	 * @see #getRoomType()
	 * @generated
	 */
	EAttribute getRoomType_Name();

	/**
	 * Returns the meta object for the attribute list '{@link SoftwareModel.DomainEntities.RoomType#getBeds <em>Beds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Beds</em>'.
	 * @see SoftwareModel.DomainEntities.RoomType#getBeds()
	 * @see #getRoomType()
	 * @generated
	 */
	EAttribute getRoomType_Beds();

	/**
	 * Returns the meta object for class '{@link SoftwareModel.DomainEntities.PaymentDetails <em>Payment Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Payment Details</em>'.
	 * @see SoftwareModel.DomainEntities.PaymentDetails
	 * @generated
	 */
	EClass getPaymentDetails();

	/**
	 * Returns the meta object for the attribute '{@link SoftwareModel.DomainEntities.PaymentDetails#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see SoftwareModel.DomainEntities.PaymentDetails#getName()
	 * @see #getPaymentDetails()
	 * @generated
	 */
	EAttribute getPaymentDetails_Name();

	/**
	 * Returns the meta object for the attribute '{@link SoftwareModel.DomainEntities.PaymentDetails#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see SoftwareModel.DomainEntities.PaymentDetails#getAddress()
	 * @see #getPaymentDetails()
	 * @generated
	 */
	EAttribute getPaymentDetails_Address();

	/**
	 * Returns the meta object for the attribute '{@link SoftwareModel.DomainEntities.PaymentDetails#getPhoneNumber <em>Phone Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phone Number</em>'.
	 * @see SoftwareModel.DomainEntities.PaymentDetails#getPhoneNumber()
	 * @see #getPaymentDetails()
	 * @generated
	 */
	EAttribute getPaymentDetails_PhoneNumber();

	/**
	 * Returns the meta object for class '{@link SoftwareModel.DomainEntities.Reservation <em>Reservation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reservation</em>'.
	 * @see SoftwareModel.DomainEntities.Reservation
	 * @generated
	 */
	EClass getReservation();

	/**
	 * Returns the meta object for the reference list '{@link SoftwareModel.DomainEntities.Reservation#getRoombooking <em>Roombooking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Roombooking</em>'.
	 * @see SoftwareModel.DomainEntities.Reservation#getRoombooking()
	 * @see #getReservation()
	 * @generated
	 */
	EReference getReservation_Roombooking();

	/**
	 * Returns the meta object for the attribute '{@link SoftwareModel.DomainEntities.Reservation#getPreliminaryCheckIn <em>Preliminary Check In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Preliminary Check In</em>'.
	 * @see SoftwareModel.DomainEntities.Reservation#getPreliminaryCheckIn()
	 * @see #getReservation()
	 * @generated
	 */
	EAttribute getReservation_PreliminaryCheckIn();

	/**
	 * Returns the meta object for the attribute '{@link SoftwareModel.DomainEntities.Reservation#getPreliminaryCheckOut <em>Preliminary Check Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Preliminary Check Out</em>'.
	 * @see SoftwareModel.DomainEntities.Reservation#getPreliminaryCheckOut()
	 * @see #getReservation()
	 * @generated
	 */
	EAttribute getReservation_PreliminaryCheckOut();

	/**
	 * Returns the meta object for the attribute '{@link SoftwareModel.DomainEntities.Reservation#getReservationId <em>Reservation Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reservation Id</em>'.
	 * @see SoftwareModel.DomainEntities.Reservation#getReservationId()
	 * @see #getReservation()
	 * @generated
	 */
	EAttribute getReservation_ReservationId();

	/**
	 * Returns the meta object for the attribute '{@link SoftwareModel.DomainEntities.Reservation#getDiscountCode <em>Discount Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Discount Code</em>'.
	 * @see SoftwareModel.DomainEntities.Reservation#getDiscountCode()
	 * @see #getReservation()
	 * @generated
	 */
	EAttribute getReservation_DiscountCode();

	/**
	 * Returns the meta object for the reference '{@link SoftwareModel.DomainEntities.Reservation#getPaymentdetails <em>Paymentdetails</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Paymentdetails</em>'.
	 * @see SoftwareModel.DomainEntities.Reservation#getPaymentdetails()
	 * @see #getReservation()
	 * @generated
	 */
	EReference getReservation_Paymentdetails();

	/**
	 * Returns the meta object for the '{@link SoftwareModel.DomainEntities.Reservation#cancel() <em>Cancel</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Cancel</em>' operation.
	 * @see SoftwareModel.DomainEntities.Reservation#cancel()
	 * @generated
	 */
	EOperation getReservation__Cancel();

	/**
	 * Returns the meta object for class '{@link SoftwareModel.DomainEntities.RoomBooking <em>Room Booking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room Booking</em>'.
	 * @see SoftwareModel.DomainEntities.RoomBooking
	 * @generated
	 */
	EClass getRoomBooking();

	/**
	 * Returns the meta object for the attribute '{@link SoftwareModel.DomainEntities.RoomBooking#isIsCheckedIn <em>Is Checked In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Checked In</em>'.
	 * @see SoftwareModel.DomainEntities.RoomBooking#isIsCheckedIn()
	 * @see #getRoomBooking()
	 * @generated
	 */
	EAttribute getRoomBooking_IsCheckedIn();

	/**
	 * Returns the meta object for the reference '{@link SoftwareModel.DomainEntities.RoomBooking#getRoomresponsible <em>Roomresponsible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Roomresponsible</em>'.
	 * @see SoftwareModel.DomainEntities.RoomBooking#getRoomresponsible()
	 * @see #getRoomBooking()
	 * @generated
	 */
	EReference getRoomBooking_Roomresponsible();

	/**
	 * Returns the meta object for the attribute '{@link SoftwareModel.DomainEntities.RoomBooking#getAdults <em>Adults</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Adults</em>'.
	 * @see SoftwareModel.DomainEntities.RoomBooking#getAdults()
	 * @see #getRoomBooking()
	 * @generated
	 */
	EAttribute getRoomBooking_Adults();

	/**
	 * Returns the meta object for the attribute '{@link SoftwareModel.DomainEntities.RoomBooking#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Children</em>'.
	 * @see SoftwareModel.DomainEntities.RoomBooking#getChildren()
	 * @see #getRoomBooking()
	 * @generated
	 */
	EAttribute getRoomBooking_Children();

	/**
	 * Returns the meta object for the attribute '{@link SoftwareModel.DomainEntities.RoomBooking#getCheckOutDate <em>Check Out Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Check Out Date</em>'.
	 * @see SoftwareModel.DomainEntities.RoomBooking#getCheckOutDate()
	 * @see #getRoomBooking()
	 * @generated
	 */
	EAttribute getRoomBooking_CheckOutDate();

	/**
	 * Returns the meta object for the attribute '{@link SoftwareModel.DomainEntities.RoomBooking#getCheckInDate <em>Check In Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Check In Date</em>'.
	 * @see SoftwareModel.DomainEntities.RoomBooking#getCheckInDate()
	 * @see #getRoomBooking()
	 * @generated
	 */
	EAttribute getRoomBooking_CheckInDate();

	/**
	 * Returns the meta object for the reference '{@link SoftwareModel.DomainEntities.RoomBooking#getRoomtype <em>Roomtype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Roomtype</em>'.
	 * @see SoftwareModel.DomainEntities.RoomBooking#getRoomtype()
	 * @see #getRoomBooking()
	 * @generated
	 */
	EReference getRoomBooking_Roomtype();

	/**
	 * Returns the meta object for the reference '{@link SoftwareModel.DomainEntities.RoomBooking#getRoom <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Room</em>'.
	 * @see SoftwareModel.DomainEntities.RoomBooking#getRoom()
	 * @see #getRoomBooking()
	 * @generated
	 */
	EReference getRoomBooking_Room();

	/**
	 * Returns the meta object for the '{@link SoftwareModel.DomainEntities.RoomBooking#checkIn() <em>Check In</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check In</em>' operation.
	 * @see SoftwareModel.DomainEntities.RoomBooking#checkIn()
	 * @generated
	 */
	EOperation getRoomBooking__CheckIn();

	/**
	 * Returns the meta object for the '{@link SoftwareModel.DomainEntities.RoomBooking#checkOut() <em>Check Out</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Out</em>' operation.
	 * @see SoftwareModel.DomainEntities.RoomBooking#checkOut()
	 * @generated
	 */
	EOperation getRoomBooking__CheckOut();

	/**
	 * Returns the meta object for class '{@link SoftwareModel.DomainEntities.RoomResponsible <em>Room Responsible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room Responsible</em>'.
	 * @see SoftwareModel.DomainEntities.RoomResponsible
	 * @generated
	 */
	EClass getRoomResponsible();

	/**
	 * Returns the meta object for the attribute '{@link SoftwareModel.DomainEntities.RoomResponsible#getFirstName <em>First Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Name</em>'.
	 * @see SoftwareModel.DomainEntities.RoomResponsible#getFirstName()
	 * @see #getRoomResponsible()
	 * @generated
	 */
	EAttribute getRoomResponsible_FirstName();

	/**
	 * Returns the meta object for the attribute '{@link SoftwareModel.DomainEntities.RoomResponsible#getLastName <em>Last Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Name</em>'.
	 * @see SoftwareModel.DomainEntities.RoomResponsible#getLastName()
	 * @see #getRoomResponsible()
	 * @generated
	 */
	EAttribute getRoomResponsible_LastName();

	/**
	 * Returns the meta object for the attribute '{@link SoftwareModel.DomainEntities.RoomResponsible#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see SoftwareModel.DomainEntities.RoomResponsible#getAddress()
	 * @see #getRoomResponsible()
	 * @generated
	 */
	EAttribute getRoomResponsible_Address();

	/**
	 * Returns the meta object for the attribute '{@link SoftwareModel.DomainEntities.RoomResponsible#getPhoneNumber <em>Phone Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phone Number</em>'.
	 * @see SoftwareModel.DomainEntities.RoomResponsible#getPhoneNumber()
	 * @see #getRoomResponsible()
	 * @generated
	 */
	EAttribute getRoomResponsible_PhoneNumber();

	/**
	 * Returns the meta object for the attribute '{@link SoftwareModel.DomainEntities.RoomResponsible#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see SoftwareModel.DomainEntities.RoomResponsible#getEmail()
	 * @see #getRoomResponsible()
	 * @generated
	 */
	EAttribute getRoomResponsible_Email();

	/**
	 * Returns the meta object for class '{@link SoftwareModel.DomainEntities.Bill <em>Bill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bill</em>'.
	 * @see SoftwareModel.DomainEntities.Bill
	 * @generated
	 */
	EClass getBill();

	/**
	 * Returns the meta object for class '{@link SoftwareModel.DomainEntities.Room <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room</em>'.
	 * @see SoftwareModel.DomainEntities.Room
	 * @generated
	 */
	EClass getRoom();

	/**
	 * Returns the meta object for the attribute '{@link SoftwareModel.DomainEntities.Room#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see SoftwareModel.DomainEntities.Room#getNumber()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_Number();

	/**
	 * Returns the meta object for the attribute '{@link SoftwareModel.DomainEntities.Room#getAvailability <em>Availability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Availability</em>'.
	 * @see SoftwareModel.DomainEntities.Room#getAvailability()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_Availability();

	/**
	 * Returns the meta object for the attribute '{@link SoftwareModel.DomainEntities.Room#getView <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>View</em>'.
	 * @see SoftwareModel.DomainEntities.Room#getView()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_View();

	/**
	 * Returns the meta object for the attribute '{@link SoftwareModel.DomainEntities.Room#isSmoking <em>Smoking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Smoking</em>'.
	 * @see SoftwareModel.DomainEntities.Room#isSmoking()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_Smoking();

	/**
	 * Returns the meta object for the attribute '{@link SoftwareModel.DomainEntities.Room#isPetsAllowed <em>Pets Allowed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pets Allowed</em>'.
	 * @see SoftwareModel.DomainEntities.Room#isPetsAllowed()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_PetsAllowed();

	/**
	 * Returns the meta object for the attribute '{@link SoftwareModel.DomainEntities.Room#isDisabledAccess <em>Disabled Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disabled Access</em>'.
	 * @see SoftwareModel.DomainEntities.Room#isDisabledAccess()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_DisabledAccess();

	/**
	 * Returns the meta object for the containment reference '{@link SoftwareModel.DomainEntities.Room#getRoomtype <em>Roomtype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Roomtype</em>'.
	 * @see SoftwareModel.DomainEntities.Room#getRoomtype()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_Roomtype();

	/**
	 * Returns the meta object for class '{@link SoftwareModel.DomainEntities.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see SoftwareModel.DomainEntities.Service
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for the attribute '{@link SoftwareModel.DomainEntities.Service#getServiceDate <em>Service Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Date</em>'.
	 * @see SoftwareModel.DomainEntities.Service#getServiceDate()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_ServiceDate();

	/**
	 * Returns the meta object for the attribute '{@link SoftwareModel.DomainEntities.Service#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see SoftwareModel.DomainEntities.Service#getDescription()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Description();

	/**
	 * Returns the meta object for the attribute '{@link SoftwareModel.DomainEntities.Service#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see SoftwareModel.DomainEntities.Service#getPrice()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Price();

	/**
	 * Returns the meta object for class '{@link SoftwareModel.DomainEntities.CancelationPolicy <em>Cancelation Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cancelation Policy</em>'.
	 * @see SoftwareModel.DomainEntities.CancelationPolicy
	 * @generated
	 */
	EClass getCancelationPolicy();

	/**
	 * Returns the meta object for the attribute '{@link SoftwareModel.DomainEntities.CancelationPolicy#getMinDaysBeforeCancelationByCustomer <em>Min Days Before Cancelation By Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Days Before Cancelation By Customer</em>'.
	 * @see SoftwareModel.DomainEntities.CancelationPolicy#getMinDaysBeforeCancelationByCustomer()
	 * @see #getCancelationPolicy()
	 * @generated
	 */
	EAttribute getCancelationPolicy_MinDaysBeforeCancelationByCustomer();

	/**
	 * Returns the meta object for the '{@link SoftwareModel.DomainEntities.CancelationPolicy#canBeCancelled(boolean, SoftwareModel.DomainEntities.Reservation) <em>Can Be Cancelled</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Can Be Cancelled</em>' operation.
	 * @see SoftwareModel.DomainEntities.CancelationPolicy#canBeCancelled(boolean, SoftwareModel.DomainEntities.Reservation)
	 * @generated
	 */
	EOperation getCancelationPolicy__CanBeCancelled__boolean_Reservation();

	/**
	 * Returns the meta object for enum '{@link SoftwareModel.DomainEntities.BedType <em>Bed Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Bed Type</em>'.
	 * @see SoftwareModel.DomainEntities.BedType
	 * @generated
	 */
	EEnum getBedType();

	/**
	 * Returns the meta object for enum '{@link SoftwareModel.DomainEntities.Availability <em>Availability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Availability</em>'.
	 * @see SoftwareModel.DomainEntities.Availability
	 * @generated
	 */
	EEnum getAvailability();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DomainEntitiesFactory getDomainEntitiesFactory();

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
		 * The meta object literal for the '{@link SoftwareModel.DomainEntities.impl.RoomTypeImpl <em>Room Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SoftwareModel.DomainEntities.impl.RoomTypeImpl
		 * @see SoftwareModel.DomainEntities.impl.DomainEntitiesPackageImpl#getRoomType()
		 * @generated
		 */
		EClass ROOM_TYPE = eINSTANCE.getRoomType();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_TYPE__SIZE = eINSTANCE.getRoomType_Size();

		/**
		 * The meta object literal for the '<em><b>Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_TYPE__RATE = eINSTANCE.getRoomType_Rate();

		/**
		 * The meta object literal for the '<em><b>Bedtype</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_TYPE__BEDTYPE = eINSTANCE.getRoomType_Bedtype();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_TYPE__NAME = eINSTANCE.getRoomType_Name();

		/**
		 * The meta object literal for the '<em><b>Beds</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_TYPE__BEDS = eINSTANCE.getRoomType_Beds();

		/**
		 * The meta object literal for the '{@link SoftwareModel.DomainEntities.impl.PaymentDetailsImpl <em>Payment Details</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SoftwareModel.DomainEntities.impl.PaymentDetailsImpl
		 * @see SoftwareModel.DomainEntities.impl.DomainEntitiesPackageImpl#getPaymentDetails()
		 * @generated
		 */
		EClass PAYMENT_DETAILS = eINSTANCE.getPaymentDetails();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_DETAILS__NAME = eINSTANCE.getPaymentDetails_Name();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_DETAILS__ADDRESS = eINSTANCE.getPaymentDetails_Address();

		/**
		 * The meta object literal for the '<em><b>Phone Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_DETAILS__PHONE_NUMBER = eINSTANCE.getPaymentDetails_PhoneNumber();

		/**
		 * The meta object literal for the '{@link SoftwareModel.DomainEntities.impl.ReservationImpl <em>Reservation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SoftwareModel.DomainEntities.impl.ReservationImpl
		 * @see SoftwareModel.DomainEntities.impl.DomainEntitiesPackageImpl#getReservation()
		 * @generated
		 */
		EClass RESERVATION = eINSTANCE.getReservation();

		/**
		 * The meta object literal for the '<em><b>Roombooking</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESERVATION__ROOMBOOKING = eINSTANCE.getReservation_Roombooking();

		/**
		 * The meta object literal for the '<em><b>Preliminary Check In</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESERVATION__PRELIMINARY_CHECK_IN = eINSTANCE.getReservation_PreliminaryCheckIn();

		/**
		 * The meta object literal for the '<em><b>Preliminary Check Out</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESERVATION__PRELIMINARY_CHECK_OUT = eINSTANCE.getReservation_PreliminaryCheckOut();

		/**
		 * The meta object literal for the '<em><b>Reservation Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESERVATION__RESERVATION_ID = eINSTANCE.getReservation_ReservationId();

		/**
		 * The meta object literal for the '<em><b>Discount Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESERVATION__DISCOUNT_CODE = eINSTANCE.getReservation_DiscountCode();

		/**
		 * The meta object literal for the '<em><b>Paymentdetails</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESERVATION__PAYMENTDETAILS = eINSTANCE.getReservation_Paymentdetails();

		/**
		 * The meta object literal for the '<em><b>Cancel</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESERVATION___CANCEL = eINSTANCE.getReservation__Cancel();

		/**
		 * The meta object literal for the '{@link SoftwareModel.DomainEntities.impl.RoomBookingImpl <em>Room Booking</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SoftwareModel.DomainEntities.impl.RoomBookingImpl
		 * @see SoftwareModel.DomainEntities.impl.DomainEntitiesPackageImpl#getRoomBooking()
		 * @generated
		 */
		EClass ROOM_BOOKING = eINSTANCE.getRoomBooking();

		/**
		 * The meta object literal for the '<em><b>Is Checked In</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_BOOKING__IS_CHECKED_IN = eINSTANCE.getRoomBooking_IsCheckedIn();

		/**
		 * The meta object literal for the '<em><b>Roomresponsible</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM_BOOKING__ROOMRESPONSIBLE = eINSTANCE.getRoomBooking_Roomresponsible();

		/**
		 * The meta object literal for the '<em><b>Adults</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_BOOKING__ADULTS = eINSTANCE.getRoomBooking_Adults();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_BOOKING__CHILDREN = eINSTANCE.getRoomBooking_Children();

		/**
		 * The meta object literal for the '<em><b>Check Out Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_BOOKING__CHECK_OUT_DATE = eINSTANCE.getRoomBooking_CheckOutDate();

		/**
		 * The meta object literal for the '<em><b>Check In Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_BOOKING__CHECK_IN_DATE = eINSTANCE.getRoomBooking_CheckInDate();

		/**
		 * The meta object literal for the '<em><b>Roomtype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM_BOOKING__ROOMTYPE = eINSTANCE.getRoomBooking_Roomtype();

		/**
		 * The meta object literal for the '<em><b>Room</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM_BOOKING__ROOM = eINSTANCE.getRoomBooking_Room();

		/**
		 * The meta object literal for the '<em><b>Check In</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_BOOKING___CHECK_IN = eINSTANCE.getRoomBooking__CheckIn();

		/**
		 * The meta object literal for the '<em><b>Check Out</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_BOOKING___CHECK_OUT = eINSTANCE.getRoomBooking__CheckOut();

		/**
		 * The meta object literal for the '{@link SoftwareModel.DomainEntities.impl.RoomResponsibleImpl <em>Room Responsible</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SoftwareModel.DomainEntities.impl.RoomResponsibleImpl
		 * @see SoftwareModel.DomainEntities.impl.DomainEntitiesPackageImpl#getRoomResponsible()
		 * @generated
		 */
		EClass ROOM_RESPONSIBLE = eINSTANCE.getRoomResponsible();

		/**
		 * The meta object literal for the '<em><b>First Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_RESPONSIBLE__FIRST_NAME = eINSTANCE.getRoomResponsible_FirstName();

		/**
		 * The meta object literal for the '<em><b>Last Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_RESPONSIBLE__LAST_NAME = eINSTANCE.getRoomResponsible_LastName();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_RESPONSIBLE__ADDRESS = eINSTANCE.getRoomResponsible_Address();

		/**
		 * The meta object literal for the '<em><b>Phone Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_RESPONSIBLE__PHONE_NUMBER = eINSTANCE.getRoomResponsible_PhoneNumber();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_RESPONSIBLE__EMAIL = eINSTANCE.getRoomResponsible_Email();

		/**
		 * The meta object literal for the '{@link SoftwareModel.DomainEntities.impl.BillImpl <em>Bill</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SoftwareModel.DomainEntities.impl.BillImpl
		 * @see SoftwareModel.DomainEntities.impl.DomainEntitiesPackageImpl#getBill()
		 * @generated
		 */
		EClass BILL = eINSTANCE.getBill();

		/**
		 * The meta object literal for the '{@link SoftwareModel.DomainEntities.impl.RoomImpl <em>Room</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SoftwareModel.DomainEntities.impl.RoomImpl
		 * @see SoftwareModel.DomainEntities.impl.DomainEntitiesPackageImpl#getRoom()
		 * @generated
		 */
		EClass ROOM = eINSTANCE.getRoom();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM__NUMBER = eINSTANCE.getRoom_Number();

		/**
		 * The meta object literal for the '<em><b>Availability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM__AVAILABILITY = eINSTANCE.getRoom_Availability();

		/**
		 * The meta object literal for the '<em><b>View</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM__VIEW = eINSTANCE.getRoom_View();

		/**
		 * The meta object literal for the '<em><b>Smoking</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM__SMOKING = eINSTANCE.getRoom_Smoking();

		/**
		 * The meta object literal for the '<em><b>Pets Allowed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM__PETS_ALLOWED = eINSTANCE.getRoom_PetsAllowed();

		/**
		 * The meta object literal for the '<em><b>Disabled Access</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM__DISABLED_ACCESS = eINSTANCE.getRoom_DisabledAccess();

		/**
		 * The meta object literal for the '<em><b>Roomtype</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__ROOMTYPE = eINSTANCE.getRoom_Roomtype();

		/**
		 * The meta object literal for the '{@link SoftwareModel.DomainEntities.impl.ServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SoftwareModel.DomainEntities.impl.ServiceImpl
		 * @see SoftwareModel.DomainEntities.impl.DomainEntitiesPackageImpl#getService()
		 * @generated
		 */
		EClass SERVICE = eINSTANCE.getService();

		/**
		 * The meta object literal for the '<em><b>Service Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__SERVICE_DATE = eINSTANCE.getService_ServiceDate();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__DESCRIPTION = eINSTANCE.getService_Description();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__PRICE = eINSTANCE.getService_Price();

		/**
		 * The meta object literal for the '{@link SoftwareModel.DomainEntities.impl.CancelationPolicyImpl <em>Cancelation Policy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SoftwareModel.DomainEntities.impl.CancelationPolicyImpl
		 * @see SoftwareModel.DomainEntities.impl.DomainEntitiesPackageImpl#getCancelationPolicy()
		 * @generated
		 */
		EClass CANCELATION_POLICY = eINSTANCE.getCancelationPolicy();

		/**
		 * The meta object literal for the '<em><b>Min Days Before Cancelation By Customer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CANCELATION_POLICY__MIN_DAYS_BEFORE_CANCELATION_BY_CUSTOMER = eINSTANCE.getCancelationPolicy_MinDaysBeforeCancelationByCustomer();

		/**
		 * The meta object literal for the '<em><b>Can Be Cancelled</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CANCELATION_POLICY___CAN_BE_CANCELLED__BOOLEAN_RESERVATION = eINSTANCE.getCancelationPolicy__CanBeCancelled__boolean_Reservation();

		/**
		 * The meta object literal for the '{@link SoftwareModel.DomainEntities.BedType <em>Bed Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SoftwareModel.DomainEntities.BedType
		 * @see SoftwareModel.DomainEntities.impl.DomainEntitiesPackageImpl#getBedType()
		 * @generated
		 */
		EEnum BED_TYPE = eINSTANCE.getBedType();

		/**
		 * The meta object literal for the '{@link SoftwareModel.DomainEntities.Availability <em>Availability</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SoftwareModel.DomainEntities.Availability
		 * @see SoftwareModel.DomainEntities.impl.DomainEntitiesPackageImpl#getAvailability()
		 * @generated
		 */
		EEnum AVAILABILITY = eINSTANCE.getAvailability();

	}

} //DomainEntitiesPackage
