/**
 */
package SoftwareModel.DataAccess.impl;

import SoftwareModel.BusinessLogic.BusinessLogicPackage;

import SoftwareModel.BusinessLogic.impl.BusinessLogicPackageImpl;

import SoftwareModel.DataAccess.AuthorizationRepository;
import SoftwareModel.DataAccess.DataAccessFactory;
import SoftwareModel.DataAccess.DataAccessPackage;
import SoftwareModel.DataAccess.DatabaseContext;
import SoftwareModel.DataAccess.ReservationsRepository;
import SoftwareModel.DataAccess.RoomBookingsRepository;
import SoftwareModel.DataAccess.RoomRepository;

import SoftwareModel.DomainEntities.DomainEntitiesPackage;

import SoftwareModel.DomainEntities.impl.DomainEntitiesPackageImpl;

import SoftwareModel.Presentation.PresentationPackage;

import SoftwareModel.Presentation.impl.PresentationPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
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
public class DataAccessPackageImpl extends EPackageImpl implements DataAccessPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reservationsRepositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass databaseContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roomBookingsRepositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass authorizationRepositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roomRepositoryEClass = null;

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
	 * @see SoftwareModel.DataAccess.DataAccessPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DataAccessPackageImpl() {
		super(eNS_URI, DataAccessFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DataAccessPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DataAccessPackage init() {
		if (isInited) return (DataAccessPackage)EPackage.Registry.INSTANCE.getEPackage(DataAccessPackage.eNS_URI);

		// Obtain or create and register package
		DataAccessPackageImpl theDataAccessPackage = (DataAccessPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DataAccessPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DataAccessPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		TypesPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		DomainEntitiesPackageImpl theDomainEntitiesPackage = (DomainEntitiesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DomainEntitiesPackage.eNS_URI) instanceof DomainEntitiesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DomainEntitiesPackage.eNS_URI) : DomainEntitiesPackage.eINSTANCE);
		BusinessLogicPackageImpl theBusinessLogicPackage = (BusinessLogicPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BusinessLogicPackage.eNS_URI) instanceof BusinessLogicPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BusinessLogicPackage.eNS_URI) : BusinessLogicPackage.eINSTANCE);
		PresentationPackageImpl thePresentationPackage = (PresentationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PresentationPackage.eNS_URI) instanceof PresentationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PresentationPackage.eNS_URI) : PresentationPackage.eINSTANCE);

		// Create package meta-data objects
		theDataAccessPackage.createPackageContents();
		theDomainEntitiesPackage.createPackageContents();
		theBusinessLogicPackage.createPackageContents();
		thePresentationPackage.createPackageContents();

		// Initialize created meta-data
		theDataAccessPackage.initializePackageContents();
		theDomainEntitiesPackage.initializePackageContents();
		theBusinessLogicPackage.initializePackageContents();
		thePresentationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDataAccessPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DataAccessPackage.eNS_URI, theDataAccessPackage);
		return theDataAccessPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReservationsRepository() {
		return reservationsRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReservationsRepository_Databasecontext() {
		return (EReference)reservationsRepositoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReservationsRepository__Update__Reservation() {
		return reservationsRepositoryEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReservationsRepository__Get__int() {
		return reservationsRepositoryEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReservationsRepository__AddNew__Reservation() {
		return reservationsRepositoryEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReservationsRepository__Remove__int() {
		return reservationsRepositoryEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatabaseContext() {
		return databaseContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatabaseContext_Rooms() {
		return (EReference)databaseContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatabaseContext_RoomTypes() {
		return (EReference)databaseContextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatabaseContext_Reservations() {
		return (EReference)databaseContextEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatabaseContext_RoomBookings() {
		return (EReference)databaseContextEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabaseContext_Passwords() {
		return (EAttribute)databaseContextEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoomBookingsRepository() {
		return roomBookingsRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoomBookingsRepository_Databasecontext() {
		return (EReference)roomBookingsRepositoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomBookingsRepository__Update__RoomBooking() {
		return roomBookingsRepositoryEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomBookingsRepository__GetByRoomResponsible__String() {
		return roomBookingsRepositoryEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomBookingsRepository__GetByReservationNr__int() {
		return roomBookingsRepositoryEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomBookingsRepository__GetAll() {
		return roomBookingsRepositoryEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomBookingsRepository__GetByRoomNr__int() {
		return roomBookingsRepositoryEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuthorizationRepository() {
		return authorizationRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuthorizationRepository_Databasecontext() {
		return (EReference)authorizationRepositoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAuthorizationRepository__GetPasswords() {
		return authorizationRepositoryEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoomRepository() {
		return roomRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoomRepository_Databasecontext() {
		return (EReference)roomRepositoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomRepository__UpdateRoom__Room() {
		return roomRepositoryEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomRepository__UpdateRoomType__RoomType() {
		return roomRepositoryEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomRepository__GetRoom__int() {
		return roomRepositoryEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomRepository__GetRoomType__String() {
		return roomRepositoryEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomRepository__RemoveRoom__Room() {
		return roomRepositoryEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomRepository__AddRoom__Room() {
		return roomRepositoryEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomRepository__GetRooms() {
		return roomRepositoryEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomRepository__AddRoomType__RoomType() {
		return roomRepositoryEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataAccessFactory getDataAccessFactory() {
		return (DataAccessFactory)getEFactoryInstance();
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
		reservationsRepositoryEClass = createEClass(RESERVATIONS_REPOSITORY);
		createEReference(reservationsRepositoryEClass, RESERVATIONS_REPOSITORY__DATABASECONTEXT);
		createEOperation(reservationsRepositoryEClass, RESERVATIONS_REPOSITORY___UPDATE__RESERVATION);
		createEOperation(reservationsRepositoryEClass, RESERVATIONS_REPOSITORY___GET__INT);
		createEOperation(reservationsRepositoryEClass, RESERVATIONS_REPOSITORY___ADD_NEW__RESERVATION);
		createEOperation(reservationsRepositoryEClass, RESERVATIONS_REPOSITORY___REMOVE__INT);

		databaseContextEClass = createEClass(DATABASE_CONTEXT);
		createEReference(databaseContextEClass, DATABASE_CONTEXT__ROOMS);
		createEReference(databaseContextEClass, DATABASE_CONTEXT__ROOM_TYPES);
		createEReference(databaseContextEClass, DATABASE_CONTEXT__RESERVATIONS);
		createEReference(databaseContextEClass, DATABASE_CONTEXT__ROOM_BOOKINGS);
		createEAttribute(databaseContextEClass, DATABASE_CONTEXT__PASSWORDS);

		roomBookingsRepositoryEClass = createEClass(ROOM_BOOKINGS_REPOSITORY);
		createEReference(roomBookingsRepositoryEClass, ROOM_BOOKINGS_REPOSITORY__DATABASECONTEXT);
		createEOperation(roomBookingsRepositoryEClass, ROOM_BOOKINGS_REPOSITORY___UPDATE__ROOMBOOKING);
		createEOperation(roomBookingsRepositoryEClass, ROOM_BOOKINGS_REPOSITORY___GET_BY_ROOM_RESPONSIBLE__STRING);
		createEOperation(roomBookingsRepositoryEClass, ROOM_BOOKINGS_REPOSITORY___GET_BY_RESERVATION_NR__INT);
		createEOperation(roomBookingsRepositoryEClass, ROOM_BOOKINGS_REPOSITORY___GET_ALL);
		createEOperation(roomBookingsRepositoryEClass, ROOM_BOOKINGS_REPOSITORY___GET_BY_ROOM_NR__INT);

		authorizationRepositoryEClass = createEClass(AUTHORIZATION_REPOSITORY);
		createEReference(authorizationRepositoryEClass, AUTHORIZATION_REPOSITORY__DATABASECONTEXT);
		createEOperation(authorizationRepositoryEClass, AUTHORIZATION_REPOSITORY___GET_PASSWORDS);

		roomRepositoryEClass = createEClass(ROOM_REPOSITORY);
		createEReference(roomRepositoryEClass, ROOM_REPOSITORY__DATABASECONTEXT);
		createEOperation(roomRepositoryEClass, ROOM_REPOSITORY___UPDATE_ROOM__ROOM);
		createEOperation(roomRepositoryEClass, ROOM_REPOSITORY___UPDATE_ROOM_TYPE__ROOMTYPE);
		createEOperation(roomRepositoryEClass, ROOM_REPOSITORY___GET_ROOM__INT);
		createEOperation(roomRepositoryEClass, ROOM_REPOSITORY___GET_ROOM_TYPE__STRING);
		createEOperation(roomRepositoryEClass, ROOM_REPOSITORY___REMOVE_ROOM__ROOM);
		createEOperation(roomRepositoryEClass, ROOM_REPOSITORY___ADD_ROOM__ROOM);
		createEOperation(roomRepositoryEClass, ROOM_REPOSITORY___GET_ROOMS);
		createEOperation(roomRepositoryEClass, ROOM_REPOSITORY___ADD_ROOM_TYPE__ROOMTYPE);
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
		DomainEntitiesPackage theDomainEntitiesPackage = (DomainEntitiesPackage)EPackage.Registry.INSTANCE.getEPackage(DomainEntitiesPackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(reservationsRepositoryEClass, ReservationsRepository.class, "ReservationsRepository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReservationsRepository_Databasecontext(), this.getDatabaseContext(), null, "databasecontext", null, 1, 1, ReservationsRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		EOperation op = initEOperation(getReservationsRepository__Update__Reservation(), null, "update", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theDomainEntitiesPackage.getReservation(), "reservation", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getReservationsRepository__Get__int(), theDomainEntitiesPackage.getReservation(), "get", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "reservationNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getReservationsRepository__AddNew__Reservation(), theDomainEntitiesPackage.getReservation(), "addNew", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theDomainEntitiesPackage.getReservation(), "reservation", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getReservationsRepository__Remove__int(), null, "remove", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "reservationNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(databaseContextEClass, DatabaseContext.class, "DatabaseContext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDatabaseContext_Rooms(), theDomainEntitiesPackage.getRoom(), null, "rooms", null, 0, -1, DatabaseContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDatabaseContext_RoomTypes(), theDomainEntitiesPackage.getRoomType(), null, "roomTypes", null, 0, -1, DatabaseContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDatabaseContext_Reservations(), theDomainEntitiesPackage.getReservation(), null, "reservations", null, 0, -1, DatabaseContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDatabaseContext_RoomBookings(), theDomainEntitiesPackage.getRoomBooking(), null, "roomBookings", null, 0, -1, DatabaseContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDatabaseContext_Passwords(), theTypesPackage.getString(), "passwords", null, 1, -1, DatabaseContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(roomBookingsRepositoryEClass, RoomBookingsRepository.class, "RoomBookingsRepository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoomBookingsRepository_Databasecontext(), this.getDatabaseContext(), null, "databasecontext", null, 1, 1, RoomBookingsRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getRoomBookingsRepository__Update__RoomBooking(), null, "update", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theDomainEntitiesPackage.getRoomBooking(), "roomBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getRoomBookingsRepository__GetByRoomResponsible__String(), theDomainEntitiesPackage.getRoomBooking(), "getByRoomResponsible", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "name", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getRoomBookingsRepository__GetByReservationNr__int(), theDomainEntitiesPackage.getRoomBooking(), "getByReservationNr", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "reservationNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getRoomBookingsRepository__GetAll(), theDomainEntitiesPackage.getRoomBooking(), "getAll", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getRoomBookingsRepository__GetByRoomNr__int(), theDomainEntitiesPackage.getRoomBooking(), "getByRoomNr", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "roomNr", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(authorizationRepositoryEClass, AuthorizationRepository.class, "AuthorizationRepository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAuthorizationRepository_Databasecontext(), this.getDatabaseContext(), null, "databasecontext", null, 1, 1, AuthorizationRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getAuthorizationRepository__GetPasswords(), theTypesPackage.getString(), "getPasswords", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(roomRepositoryEClass, RoomRepository.class, "RoomRepository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoomRepository_Databasecontext(), this.getDatabaseContext(), null, "databasecontext", null, 1, 1, RoomRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getRoomRepository__UpdateRoom__Room(), null, "updateRoom", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theDomainEntitiesPackage.getRoom(), "room", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getRoomRepository__UpdateRoomType__RoomType(), null, "updateRoomType", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theDomainEntitiesPackage.getRoomType(), "roomType", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getRoomRepository__GetRoom__int(), theDomainEntitiesPackage.getRoom(), "getRoom", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "roomNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getRoomRepository__GetRoomType__String(), theDomainEntitiesPackage.getRoomType(), "getRoomType", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "name", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getRoomRepository__RemoveRoom__Room(), null, "removeRoom", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theDomainEntitiesPackage.getRoom(), "room", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getRoomRepository__AddRoom__Room(), null, "addRoom", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theDomainEntitiesPackage.getRoom(), "room", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getRoomRepository__GetRooms(), theDomainEntitiesPackage.getRoom(), "getRooms", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getRoomRepository__AddRoomType__RoomType(), null, "addRoomType", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theDomainEntitiesPackage.getRoomType(), "roomType", 1, 1, IS_UNIQUE, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //DataAccessPackageImpl
