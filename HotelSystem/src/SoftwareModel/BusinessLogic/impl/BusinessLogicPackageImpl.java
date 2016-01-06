/**
 */
package SoftwareModel.BusinessLogic.impl;

import SoftwareModel.BusinessLogic.Authorizer;
import SoftwareModel.BusinessLogic.AvailibleRoomFinder;
import SoftwareModel.BusinessLogic.BusinessLogicFactory;
import SoftwareModel.BusinessLogic.BusinessLogicPackage;
import SoftwareModel.BusinessLogic.Reservations;
import SoftwareModel.BusinessLogic.RoomBookings;
import SoftwareModel.BusinessLogic.RoomOperations;
import SoftwareModel.BusinessLogic.Rooms;

import SoftwareModel.DataAccess.DataAccessPackage;

import SoftwareModel.DataAccess.impl.DataAccessPackageImpl;

import SoftwareModel.DomainEntities.DomainEntitiesPackage;

import SoftwareModel.DomainEntities.impl.DomainEntitiesPackageImpl;

import SoftwareModel.Presentation.PresentationPackage;

import SoftwareModel.Presentation.impl.PresentationPackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.uml2.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BusinessLogicPackageImpl extends EPackageImpl implements BusinessLogicPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reservationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roomBookingsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass availibleRoomFinderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roomOperationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass authorizerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roomsEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see SoftwareModel.BusinessLogic.BusinessLogicPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BusinessLogicPackageImpl() {
		super(eNS_URI, BusinessLogicFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link BusinessLogicPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BusinessLogicPackage init() {
		if (isInited) return (BusinessLogicPackage)EPackage.Registry.INSTANCE.getEPackage(BusinessLogicPackage.eNS_URI);

		// Obtain or create and register package
		BusinessLogicPackageImpl theBusinessLogicPackage = (BusinessLogicPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof BusinessLogicPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new BusinessLogicPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		TypesPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		DomainEntitiesPackageImpl theDomainEntitiesPackage = (DomainEntitiesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DomainEntitiesPackage.eNS_URI) instanceof DomainEntitiesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DomainEntitiesPackage.eNS_URI) : DomainEntitiesPackage.eINSTANCE);
		DataAccessPackageImpl theDataAccessPackage = (DataAccessPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DataAccessPackage.eNS_URI) instanceof DataAccessPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DataAccessPackage.eNS_URI) : DataAccessPackage.eINSTANCE);
		PresentationPackageImpl thePresentationPackage = (PresentationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PresentationPackage.eNS_URI) instanceof PresentationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PresentationPackage.eNS_URI) : PresentationPackage.eINSTANCE);

		// Create package meta-data objects
		theBusinessLogicPackage.createPackageContents();
		theDomainEntitiesPackage.createPackageContents();
		theDataAccessPackage.createPackageContents();
		thePresentationPackage.createPackageContents();

		// Initialize created meta-data
		theBusinessLogicPackage.initializePackageContents();
		theDomainEntitiesPackage.initializePackageContents();
		theDataAccessPackage.initializePackageContents();
		thePresentationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBusinessLogicPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BusinessLogicPackage.eNS_URI, theBusinessLogicPackage);
		return theBusinessLogicPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReservations() {
		return reservationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReservations_Reservationsrepository() {
		return (EReference)reservationsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReservations_Roombookings() {
		return (EReference)reservationsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReservations__UpdateReservationDetails__Reservation() {
		return reservationsEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReservations__Make__EList_PaymentDetails_boolean_String_boolean() {
		return reservationsEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReservations__Cancel__Reservation() {
		return reservationsEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReservations__GetReservation__int() {
		return reservationsEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReservations__CheckInAllGuests__Reservation() {
		return reservationsEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReservations__CheckOutAllGuests__Reservation() {
		return reservationsEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoomBookings() {
		return roomBookingsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoomBookings_Roombookingsrepository() {
		return (EReference)roomBookingsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoomBookings_Availibleroomfinder() {
		return (EReference)roomBookingsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomBookings__CheckOut__RoomBooking() {
		return roomBookingsEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomBookings__CheckIn__RoomBooking() {
		return roomBookingsEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomBookings__FindByRoomNr__int() {
		return roomBookingsEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomBookings__FindByRoomResponsible__String() {
		return roomBookingsEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAvailibleRoomFinder() {
		return availibleRoomFinderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAvailibleRoomFinder_Roomrepository() {
		return (EReference)availibleRoomFinderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAvailibleRoomFinder_Roombookingsrepository() {
		return (EReference)availibleRoomFinderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAvailibleRoomFinder__AvailableRoomTypes__int_int_Date_Date() {
		return availibleRoomFinderEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAvailibleRoomFinder__AvailibleRoom__RoomBooking() {
		return availibleRoomFinderEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoomOperations() {
		return roomOperationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoomOperations_Roomrepository() {
		return (EReference)roomOperationsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomOperations__ModifyRate__String_double() {
		return roomOperationsEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomOperations__MakeRoomAvailable__int() {
		return roomOperationsEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomOperations__AddRoom__int_Availability_String() {
		return roomOperationsEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomOperations__RemoveRoom__int() {
		return roomOperationsEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomOperations__MakeRoomUnavailable__int() {
		return roomOperationsEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomOperations__AddRoomType__double_double_String_EList() {
		return roomOperationsEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuthorizer() {
		return authorizerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuthorizer_Managerrepository() {
		return (EReference)authorizerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAuthorizer__Authorize__String() {
		return authorizerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRooms() {
		return roomsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRooms_Availibleroomfinder() {
		return (EReference)roomsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRooms_Roombookings() {
		return (EReference)roomsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRooms__CheckOut__RoomBooking() {
		return roomsEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRooms__CheckIn__RoomBooking() {
		return roomsEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRooms__GetBooking__int() {
		return roomsEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRooms__AvailibleRoomTypes__int_int_Date_Date() {
		return roomsEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRooms__GetBooking__String() {
		return roomsEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessLogicFactory getBusinessLogicFactory() {
		return (BusinessLogicFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		reservationsEClass = createEClass(RESERVATIONS);
		createEReference(reservationsEClass, RESERVATIONS__RESERVATIONSREPOSITORY);
		createEReference(reservationsEClass, RESERVATIONS__ROOMBOOKINGS);
		createEOperation(reservationsEClass, RESERVATIONS___UPDATE_RESERVATION_DETAILS__RESERVATION);
		createEOperation(reservationsEClass, RESERVATIONS___MAKE__ELIST_PAYMENTDETAILS_BOOLEAN_STRING_BOOLEAN);
		createEOperation(reservationsEClass, RESERVATIONS___CANCEL__RESERVATION);
		createEOperation(reservationsEClass, RESERVATIONS___GET_RESERVATION__INT);
		createEOperation(reservationsEClass, RESERVATIONS___CHECK_IN_ALL_GUESTS__RESERVATION);
		createEOperation(reservationsEClass, RESERVATIONS___CHECK_OUT_ALL_GUESTS__RESERVATION);

		roomBookingsEClass = createEClass(ROOM_BOOKINGS);
		createEReference(roomBookingsEClass, ROOM_BOOKINGS__ROOMBOOKINGSREPOSITORY);
		createEReference(roomBookingsEClass, ROOM_BOOKINGS__AVAILIBLEROOMFINDER);
		createEOperation(roomBookingsEClass, ROOM_BOOKINGS___CHECK_OUT__ROOMBOOKING);
		createEOperation(roomBookingsEClass, ROOM_BOOKINGS___CHECK_IN__ROOMBOOKING);
		createEOperation(roomBookingsEClass, ROOM_BOOKINGS___FIND_BY_ROOM_NR__INT);
		createEOperation(roomBookingsEClass, ROOM_BOOKINGS___FIND_BY_ROOM_RESPONSIBLE__STRING);

		availibleRoomFinderEClass = createEClass(AVAILIBLE_ROOM_FINDER);
		createEReference(availibleRoomFinderEClass, AVAILIBLE_ROOM_FINDER__ROOMREPOSITORY);
		createEReference(availibleRoomFinderEClass, AVAILIBLE_ROOM_FINDER__ROOMBOOKINGSREPOSITORY);
		createEOperation(availibleRoomFinderEClass, AVAILIBLE_ROOM_FINDER___AVAILABLE_ROOM_TYPES__INT_INT_DATE_DATE);
		createEOperation(availibleRoomFinderEClass, AVAILIBLE_ROOM_FINDER___AVAILIBLE_ROOM__ROOMBOOKING);

		roomOperationsEClass = createEClass(ROOM_OPERATIONS);
		createEReference(roomOperationsEClass, ROOM_OPERATIONS__ROOMREPOSITORY);
		createEOperation(roomOperationsEClass, ROOM_OPERATIONS___MODIFY_RATE__STRING_DOUBLE);
		createEOperation(roomOperationsEClass, ROOM_OPERATIONS___MAKE_ROOM_AVAILABLE__INT);
		createEOperation(roomOperationsEClass, ROOM_OPERATIONS___ADD_ROOM__INT_AVAILABILITY_STRING);
		createEOperation(roomOperationsEClass, ROOM_OPERATIONS___REMOVE_ROOM__INT);
		createEOperation(roomOperationsEClass, ROOM_OPERATIONS___MAKE_ROOM_UNAVAILABLE__INT);
		createEOperation(roomOperationsEClass, ROOM_OPERATIONS___ADD_ROOM_TYPE__DOUBLE_DOUBLE_STRING_ELIST);

		authorizerEClass = createEClass(AUTHORIZER);
		createEReference(authorizerEClass, AUTHORIZER__MANAGERREPOSITORY);
		createEOperation(authorizerEClass, AUTHORIZER___AUTHORIZE__STRING);

		roomsEClass = createEClass(ROOMS);
		createEReference(roomsEClass, ROOMS__AVAILIBLEROOMFINDER);
		createEReference(roomsEClass, ROOMS__ROOMBOOKINGS);
		createEOperation(roomsEClass, ROOMS___CHECK_OUT__ROOMBOOKING);
		createEOperation(roomsEClass, ROOMS___CHECK_IN__ROOMBOOKING);
		createEOperation(roomsEClass, ROOMS___GET_BOOKING__INT);
		createEOperation(roomsEClass, ROOMS___AVAILIBLE_ROOM_TYPES__INT_INT_DATE_DATE);
		createEOperation(roomsEClass, ROOMS___GET_BOOKING__STRING);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		DataAccessPackage theDataAccessPackage = (DataAccessPackage)EPackage.Registry.INSTANCE.getEPackage(DataAccessPackage.eNS_URI);
		DomainEntitiesPackage theDomainEntitiesPackage = (DomainEntitiesPackage)EPackage.Registry.INSTANCE.getEPackage(DomainEntitiesPackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(reservationsEClass, Reservations.class, "Reservations", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReservations_Reservationsrepository(), theDataAccessPackage.getReservationsRepository(), null, "reservationsrepository", null, 1, 1, Reservations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getReservations_Roombookings(), this.getRoomBookings(), null, "roombookings", null, 1, 1, Reservations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		EOperation op = initEOperation(getReservations__UpdateReservationDetails__Reservation(), null, "updateReservationDetails", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theDomainEntitiesPackage.getReservation(), "reservation", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getReservations__Make__EList_PaymentDetails_boolean_String_boolean(), theDomainEntitiesPackage.getReservation(), "make", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theDomainEntitiesPackage.getRoomBooking(), "selectedRooms", 1, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theDomainEntitiesPackage.getPaymentDetails(), "paymentDetails", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "payNow", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "discountCode", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "madeByCustomer", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getReservations__Cancel__Reservation(), null, "cancel", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theDomainEntitiesPackage.getReservation(), "reservation", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getReservations__GetReservation__int(), theDomainEntitiesPackage.getReservation(), "getReservation", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "reservationNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getReservations__CheckInAllGuests__Reservation(), null, "CheckInAllGuests", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theDomainEntitiesPackage.getReservation(), "reservation", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getReservations__CheckOutAllGuests__Reservation(), null, "CheckOutAllGuests", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theDomainEntitiesPackage.getReservation(), "reservation", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(roomBookingsEClass, RoomBookings.class, "RoomBookings", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoomBookings_Roombookingsrepository(), theDataAccessPackage.getRoomBookingsRepository(), null, "roombookingsrepository", null, 1, 1, RoomBookings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRoomBookings_Availibleroomfinder(), this.getAvailibleRoomFinder(), null, "availibleroomfinder", null, 1, 1, RoomBookings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getRoomBookings__CheckOut__RoomBooking(), null, "checkOut", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theDomainEntitiesPackage.getRoomBooking(), "roomBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getRoomBookings__CheckIn__RoomBooking(), theTypesPackage.getInteger(), "checkIn", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theDomainEntitiesPackage.getRoomBooking(), "roomBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getRoomBookings__FindByRoomNr__int(), theDomainEntitiesPackage.getRoomBooking(), "findByRoomNr", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "roomNr", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getRoomBookings__FindByRoomResponsible__String(), theDomainEntitiesPackage.getRoomBooking(), "findByRoomResponsible", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "roomResponsible", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(availibleRoomFinderEClass, AvailibleRoomFinder.class, "AvailibleRoomFinder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAvailibleRoomFinder_Roomrepository(), theDataAccessPackage.getRoomRepository(), null, "roomrepository", null, 1, 1, AvailibleRoomFinder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAvailibleRoomFinder_Roombookingsrepository(), theDataAccessPackage.getRoomBookingsRepository(), null, "roombookingsrepository", null, 1, 1, AvailibleRoomFinder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getAvailibleRoomFinder__AvailableRoomTypes__int_int_Date_Date(), theDomainEntitiesPackage.getRoomType(), "availableRoomTypes", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "adults", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "children", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "startDate", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "endDate", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getAvailibleRoomFinder__AvailibleRoom__RoomBooking(), theDomainEntitiesPackage.getRoom(), "availibleRoom", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theDomainEntitiesPackage.getRoomBooking(), "roomBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(roomOperationsEClass, RoomOperations.class, "RoomOperations", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoomOperations_Roomrepository(), theDataAccessPackage.getRoomRepository(), null, "roomrepository", null, 1, 1, RoomOperations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getRoomOperations__ModifyRate__String_double(), null, "modifyRate", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "nameofRoomType", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "rate", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getRoomOperations__MakeRoomAvailable__int(), null, "makeRoomAvailable", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "roomNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getRoomOperations__AddRoom__int_Availability_String(), null, "addRoom", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "roomNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theDomainEntitiesPackage.getAvailability(), "availability", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "type", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getRoomOperations__RemoveRoom__int(), null, "removeRoom", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "roomNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getRoomOperations__MakeRoomUnavailable__int(), null, "makeRoomUnavailable", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "roomNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getRoomOperations__AddRoomType__double_double_String_EList(), null, "addRoomType", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "size", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "rate", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theDomainEntitiesPackage.getBedType(), "beds", 1, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(authorizerEClass, Authorizer.class, "Authorizer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAuthorizer_Managerrepository(), theDataAccessPackage.getAuthorizationRepository(), null, "managerrepository", null, 1, 1, Authorizer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getAuthorizer__Authorize__String(), theTypesPackage.getBoolean(), "Authorize", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "password", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(roomsEClass, Rooms.class, "Rooms", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRooms_Availibleroomfinder(), this.getAvailibleRoomFinder(), null, "availibleroomfinder", null, 1, 1, Rooms.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRooms_Roombookings(), this.getRoomBookings(), null, "roombookings", null, 1, 1, Rooms.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getRooms__CheckOut__RoomBooking(), null, "checkOut", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theDomainEntitiesPackage.getRoomBooking(), "roomBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getRooms__CheckIn__RoomBooking(), theTypesPackage.getInteger(), "checkIn", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theDomainEntitiesPackage.getRoomBooking(), "roomBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getRooms__GetBooking__int(), theDomainEntitiesPackage.getRoomBooking(), "getBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "roomNr", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getRooms__AvailibleRoomTypes__int_int_Date_Date(), theDomainEntitiesPackage.getRoomType(), "availibleRoomTypes", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "adults", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "children", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "startDate", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "endDate", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getRooms__GetBooking__String(), theDomainEntitiesPackage.getRoomBooking(), "getBooking", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "nameOfRoomResponsible", 1, 1, IS_UNIQUE, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //BusinessLogicPackageImpl
