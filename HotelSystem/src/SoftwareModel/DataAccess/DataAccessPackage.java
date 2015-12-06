/**
 */
package SoftwareModel.DataAccess;

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
 * @see SoftwareModel.DataAccess.DataAccessFactory
 * @model kind="package"
 * @generated
 */
public interface DataAccessPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "DataAccess";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///SoftwareModel/DataAccess.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "SoftwareModel.DataAccess";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DataAccessPackage eINSTANCE = SoftwareModel.DataAccess.impl.DataAccessPackageImpl.init();

	/**
	 * The meta object id for the '{@link SoftwareModel.DataAccess.impl.ReservationsRepositoryImpl <em>Reservations Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SoftwareModel.DataAccess.impl.ReservationsRepositoryImpl
	 * @see SoftwareModel.DataAccess.impl.DataAccessPackageImpl#getReservationsRepository()
	 * @generated
	 */
	int RESERVATIONS_REPOSITORY = 0;

	/**
	 * The feature id for the '<em><b>Databasecontext</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATIONS_REPOSITORY__DATABASECONTEXT = 0;

	/**
	 * The number of structural features of the '<em>Reservations Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATIONS_REPOSITORY_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATIONS_REPOSITORY___UPDATE__RESERVATION = 0;

	/**
	 * The operation id for the '<em>Get</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATIONS_REPOSITORY___GET__INT = 1;

	/**
	 * The operation id for the '<em>Add New</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATIONS_REPOSITORY___ADD_NEW__RESERVATION = 2;

	/**
	 * The operation id for the '<em>Remove</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATIONS_REPOSITORY___REMOVE__INT = 3;

	/**
	 * The number of operations of the '<em>Reservations Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATIONS_REPOSITORY_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link SoftwareModel.DataAccess.impl.DatabaseContextImpl <em>Database Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SoftwareModel.DataAccess.impl.DatabaseContextImpl
	 * @see SoftwareModel.DataAccess.impl.DataAccessPackageImpl#getDatabaseContext()
	 * @generated
	 */
	int DATABASE_CONTEXT = 1;

	/**
	 * The feature id for the '<em><b>Rooms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_CONTEXT__ROOMS = 0;

	/**
	 * The feature id for the '<em><b>Room Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_CONTEXT__ROOM_TYPES = 1;

	/**
	 * The feature id for the '<em><b>Reservations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_CONTEXT__RESERVATIONS = 2;

	/**
	 * The feature id for the '<em><b>Room Bookings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_CONTEXT__ROOM_BOOKINGS = 3;

	/**
	 * The number of structural features of the '<em>Database Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_CONTEXT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Database Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_CONTEXT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link SoftwareModel.DataAccess.impl.RoomBookingsRepositoryImpl <em>Room Bookings Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SoftwareModel.DataAccess.impl.RoomBookingsRepositoryImpl
	 * @see SoftwareModel.DataAccess.impl.DataAccessPackageImpl#getRoomBookingsRepository()
	 * @generated
	 */
	int ROOM_BOOKINGS_REPOSITORY = 2;

	/**
	 * The feature id for the '<em><b>Databasecontext</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_BOOKINGS_REPOSITORY__DATABASECONTEXT = 0;

	/**
	 * The number of structural features of the '<em>Room Bookings Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_BOOKINGS_REPOSITORY_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_BOOKINGS_REPOSITORY___UPDATE__ROOMBOOKING = 0;

	/**
	 * The operation id for the '<em>Get</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_BOOKINGS_REPOSITORY___GET__STRING = 1;

	/**
	 * The operation id for the '<em>Get</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_BOOKINGS_REPOSITORY___GET__INT_STRING = 2;

	/**
	 * The number of operations of the '<em>Room Bookings Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_BOOKINGS_REPOSITORY_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link SoftwareModel.DataAccess.impl.AuthorizationRepositoryImpl <em>Authorization Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SoftwareModel.DataAccess.impl.AuthorizationRepositoryImpl
	 * @see SoftwareModel.DataAccess.impl.DataAccessPackageImpl#getAuthorizationRepository()
	 * @generated
	 */
	int AUTHORIZATION_REPOSITORY = 3;

	/**
	 * The feature id for the '<em><b>Databasecontext</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZATION_REPOSITORY__DATABASECONTEXT = 0;

	/**
	 * The number of structural features of the '<em>Authorization Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZATION_REPOSITORY_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Get Passwords</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZATION_REPOSITORY___GET_PASSWORDS = 0;

	/**
	 * The number of operations of the '<em>Authorization Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZATION_REPOSITORY_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link SoftwareModel.DataAccess.impl.RoomRepositoryImpl <em>Room Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SoftwareModel.DataAccess.impl.RoomRepositoryImpl
	 * @see SoftwareModel.DataAccess.impl.DataAccessPackageImpl#getRoomRepository()
	 * @generated
	 */
	int ROOM_REPOSITORY = 4;

	/**
	 * The feature id for the '<em><b>Databasecontext</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_REPOSITORY__DATABASECONTEXT = 0;

	/**
	 * The number of structural features of the '<em>Room Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_REPOSITORY_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Update Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_REPOSITORY___UPDATE_ROOM__ROOM = 0;

	/**
	 * The operation id for the '<em>Update Room Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_REPOSITORY___UPDATE_ROOM_TYPE__ROOMTYPE = 1;

	/**
	 * The operation id for the '<em>Get Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_REPOSITORY___GET_ROOM__INT = 2;

	/**
	 * The operation id for the '<em>Get Room Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_REPOSITORY___GET_ROOM_TYPE__INT = 3;

	/**
	 * The operation id for the '<em>Remove Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_REPOSITORY___REMOVE_ROOM__ROOM = 4;

	/**
	 * The operation id for the '<em>Add Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_REPOSITORY___ADD_ROOM__ROOM = 5;

	/**
	 * The operation id for the '<em>Get Rooms</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_REPOSITORY___GET_ROOMS = 6;

	/**
	 * The number of operations of the '<em>Room Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_REPOSITORY_OPERATION_COUNT = 7;


	/**
	 * Returns the meta object for class '{@link SoftwareModel.DataAccess.ReservationsRepository <em>Reservations Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reservations Repository</em>'.
	 * @see SoftwareModel.DataAccess.ReservationsRepository
	 * @generated
	 */
	EClass getReservationsRepository();

	/**
	 * Returns the meta object for the reference '{@link SoftwareModel.DataAccess.ReservationsRepository#getDatabasecontext <em>Databasecontext</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Databasecontext</em>'.
	 * @see SoftwareModel.DataAccess.ReservationsRepository#getDatabasecontext()
	 * @see #getReservationsRepository()
	 * @generated
	 */
	EReference getReservationsRepository_Databasecontext();

	/**
	 * Returns the meta object for the '{@link SoftwareModel.DataAccess.ReservationsRepository#update(SoftwareModel.DomainEntities.Reservation) <em>Update</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update</em>' operation.
	 * @see SoftwareModel.DataAccess.ReservationsRepository#update(SoftwareModel.DomainEntities.Reservation)
	 * @generated
	 */
	EOperation getReservationsRepository__Update__Reservation();

	/**
	 * Returns the meta object for the '{@link SoftwareModel.DataAccess.ReservationsRepository#get(int) <em>Get</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get</em>' operation.
	 * @see SoftwareModel.DataAccess.ReservationsRepository#get(int)
	 * @generated
	 */
	EOperation getReservationsRepository__Get__int();

	/**
	 * Returns the meta object for the '{@link SoftwareModel.DataAccess.ReservationsRepository#addNew(SoftwareModel.DomainEntities.Reservation) <em>Add New</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add New</em>' operation.
	 * @see SoftwareModel.DataAccess.ReservationsRepository#addNew(SoftwareModel.DomainEntities.Reservation)
	 * @generated
	 */
	EOperation getReservationsRepository__AddNew__Reservation();

	/**
	 * Returns the meta object for the '{@link SoftwareModel.DataAccess.ReservationsRepository#remove(int) <em>Remove</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove</em>' operation.
	 * @see SoftwareModel.DataAccess.ReservationsRepository#remove(int)
	 * @generated
	 */
	EOperation getReservationsRepository__Remove__int();

	/**
	 * Returns the meta object for class '{@link SoftwareModel.DataAccess.DatabaseContext <em>Database Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Database Context</em>'.
	 * @see SoftwareModel.DataAccess.DatabaseContext
	 * @generated
	 */
	EClass getDatabaseContext();

	/**
	 * Returns the meta object for the reference list '{@link SoftwareModel.DataAccess.DatabaseContext#getRooms <em>Rooms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Rooms</em>'.
	 * @see SoftwareModel.DataAccess.DatabaseContext#getRooms()
	 * @see #getDatabaseContext()
	 * @generated
	 */
	EReference getDatabaseContext_Rooms();

	/**
	 * Returns the meta object for the reference list '{@link SoftwareModel.DataAccess.DatabaseContext#getRoomTypes <em>Room Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Room Types</em>'.
	 * @see SoftwareModel.DataAccess.DatabaseContext#getRoomTypes()
	 * @see #getDatabaseContext()
	 * @generated
	 */
	EReference getDatabaseContext_RoomTypes();

	/**
	 * Returns the meta object for the reference list '{@link SoftwareModel.DataAccess.DatabaseContext#getReservations <em>Reservations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reservations</em>'.
	 * @see SoftwareModel.DataAccess.DatabaseContext#getReservations()
	 * @see #getDatabaseContext()
	 * @generated
	 */
	EReference getDatabaseContext_Reservations();

	/**
	 * Returns the meta object for the reference list '{@link SoftwareModel.DataAccess.DatabaseContext#getRoomBookings <em>Room Bookings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Room Bookings</em>'.
	 * @see SoftwareModel.DataAccess.DatabaseContext#getRoomBookings()
	 * @see #getDatabaseContext()
	 * @generated
	 */
	EReference getDatabaseContext_RoomBookings();

	/**
	 * Returns the meta object for class '{@link SoftwareModel.DataAccess.RoomBookingsRepository <em>Room Bookings Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room Bookings Repository</em>'.
	 * @see SoftwareModel.DataAccess.RoomBookingsRepository
	 * @generated
	 */
	EClass getRoomBookingsRepository();

	/**
	 * Returns the meta object for the reference '{@link SoftwareModel.DataAccess.RoomBookingsRepository#getDatabasecontext <em>Databasecontext</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Databasecontext</em>'.
	 * @see SoftwareModel.DataAccess.RoomBookingsRepository#getDatabasecontext()
	 * @see #getRoomBookingsRepository()
	 * @generated
	 */
	EReference getRoomBookingsRepository_Databasecontext();

	/**
	 * Returns the meta object for the '{@link SoftwareModel.DataAccess.RoomBookingsRepository#update(SoftwareModel.DomainEntities.RoomBooking) <em>Update</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update</em>' operation.
	 * @see SoftwareModel.DataAccess.RoomBookingsRepository#update(SoftwareModel.DomainEntities.RoomBooking)
	 * @generated
	 */
	EOperation getRoomBookingsRepository__Update__RoomBooking();

	/**
	 * Returns the meta object for the '{@link SoftwareModel.DataAccess.RoomBookingsRepository#get(java.lang.String) <em>Get</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get</em>' operation.
	 * @see SoftwareModel.DataAccess.RoomBookingsRepository#get(java.lang.String)
	 * @generated
	 */
	EOperation getRoomBookingsRepository__Get__String();

	/**
	 * Returns the meta object for the '{@link SoftwareModel.DataAccess.RoomBookingsRepository#get(int, java.lang.String) <em>Get</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get</em>' operation.
	 * @see SoftwareModel.DataAccess.RoomBookingsRepository#get(int, java.lang.String)
	 * @generated
	 */
	EOperation getRoomBookingsRepository__Get__int_String();

	/**
	 * Returns the meta object for class '{@link SoftwareModel.DataAccess.AuthorizationRepository <em>Authorization Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Authorization Repository</em>'.
	 * @see SoftwareModel.DataAccess.AuthorizationRepository
	 * @generated
	 */
	EClass getAuthorizationRepository();

	/**
	 * Returns the meta object for the reference '{@link SoftwareModel.DataAccess.AuthorizationRepository#getDatabasecontext <em>Databasecontext</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Databasecontext</em>'.
	 * @see SoftwareModel.DataAccess.AuthorizationRepository#getDatabasecontext()
	 * @see #getAuthorizationRepository()
	 * @generated
	 */
	EReference getAuthorizationRepository_Databasecontext();

	/**
	 * Returns the meta object for the '{@link SoftwareModel.DataAccess.AuthorizationRepository#getPasswords() <em>Get Passwords</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Passwords</em>' operation.
	 * @see SoftwareModel.DataAccess.AuthorizationRepository#getPasswords()
	 * @generated
	 */
	EOperation getAuthorizationRepository__GetPasswords();

	/**
	 * Returns the meta object for class '{@link SoftwareModel.DataAccess.RoomRepository <em>Room Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room Repository</em>'.
	 * @see SoftwareModel.DataAccess.RoomRepository
	 * @generated
	 */
	EClass getRoomRepository();

	/**
	 * Returns the meta object for the reference '{@link SoftwareModel.DataAccess.RoomRepository#getDatabasecontext <em>Databasecontext</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Databasecontext</em>'.
	 * @see SoftwareModel.DataAccess.RoomRepository#getDatabasecontext()
	 * @see #getRoomRepository()
	 * @generated
	 */
	EReference getRoomRepository_Databasecontext();

	/**
	 * Returns the meta object for the '{@link SoftwareModel.DataAccess.RoomRepository#updateRoom(SoftwareModel.DomainEntities.Room) <em>Update Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Room</em>' operation.
	 * @see SoftwareModel.DataAccess.RoomRepository#updateRoom(SoftwareModel.DomainEntities.Room)
	 * @generated
	 */
	EOperation getRoomRepository__UpdateRoom__Room();

	/**
	 * Returns the meta object for the '{@link SoftwareModel.DataAccess.RoomRepository#updateRoomType(SoftwareModel.DomainEntities.RoomType) <em>Update Room Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Room Type</em>' operation.
	 * @see SoftwareModel.DataAccess.RoomRepository#updateRoomType(SoftwareModel.DomainEntities.RoomType)
	 * @generated
	 */
	EOperation getRoomRepository__UpdateRoomType__RoomType();

	/**
	 * Returns the meta object for the '{@link SoftwareModel.DataAccess.RoomRepository#getRoom(int) <em>Get Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Room</em>' operation.
	 * @see SoftwareModel.DataAccess.RoomRepository#getRoom(int)
	 * @generated
	 */
	EOperation getRoomRepository__GetRoom__int();

	/**
	 * Returns the meta object for the '{@link SoftwareModel.DataAccess.RoomRepository#getRoomType(int) <em>Get Room Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Room Type</em>' operation.
	 * @see SoftwareModel.DataAccess.RoomRepository#getRoomType(int)
	 * @generated
	 */
	EOperation getRoomRepository__GetRoomType__int();

	/**
	 * Returns the meta object for the '{@link SoftwareModel.DataAccess.RoomRepository#removeRoom(SoftwareModel.DomainEntities.Room) <em>Remove Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Room</em>' operation.
	 * @see SoftwareModel.DataAccess.RoomRepository#removeRoom(SoftwareModel.DomainEntities.Room)
	 * @generated
	 */
	EOperation getRoomRepository__RemoveRoom__Room();

	/**
	 * Returns the meta object for the '{@link SoftwareModel.DataAccess.RoomRepository#addRoom(SoftwareModel.DomainEntities.Room) <em>Add Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Room</em>' operation.
	 * @see SoftwareModel.DataAccess.RoomRepository#addRoom(SoftwareModel.DomainEntities.Room)
	 * @generated
	 */
	EOperation getRoomRepository__AddRoom__Room();

	/**
	 * Returns the meta object for the '{@link SoftwareModel.DataAccess.RoomRepository#getRooms() <em>Get Rooms</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Rooms</em>' operation.
	 * @see SoftwareModel.DataAccess.RoomRepository#getRooms()
	 * @generated
	 */
	EOperation getRoomRepository__GetRooms();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DataAccessFactory getDataAccessFactory();

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
		 * The meta object literal for the '{@link SoftwareModel.DataAccess.impl.ReservationsRepositoryImpl <em>Reservations Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SoftwareModel.DataAccess.impl.ReservationsRepositoryImpl
		 * @see SoftwareModel.DataAccess.impl.DataAccessPackageImpl#getReservationsRepository()
		 * @generated
		 */
		EClass RESERVATIONS_REPOSITORY = eINSTANCE.getReservationsRepository();

		/**
		 * The meta object literal for the '<em><b>Databasecontext</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESERVATIONS_REPOSITORY__DATABASECONTEXT = eINSTANCE.getReservationsRepository_Databasecontext();

		/**
		 * The meta object literal for the '<em><b>Update</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESERVATIONS_REPOSITORY___UPDATE__RESERVATION = eINSTANCE.getReservationsRepository__Update__Reservation();

		/**
		 * The meta object literal for the '<em><b>Get</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESERVATIONS_REPOSITORY___GET__INT = eINSTANCE.getReservationsRepository__Get__int();

		/**
		 * The meta object literal for the '<em><b>Add New</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESERVATIONS_REPOSITORY___ADD_NEW__RESERVATION = eINSTANCE.getReservationsRepository__AddNew__Reservation();

		/**
		 * The meta object literal for the '<em><b>Remove</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESERVATIONS_REPOSITORY___REMOVE__INT = eINSTANCE.getReservationsRepository__Remove__int();

		/**
		 * The meta object literal for the '{@link SoftwareModel.DataAccess.impl.DatabaseContextImpl <em>Database Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SoftwareModel.DataAccess.impl.DatabaseContextImpl
		 * @see SoftwareModel.DataAccess.impl.DataAccessPackageImpl#getDatabaseContext()
		 * @generated
		 */
		EClass DATABASE_CONTEXT = eINSTANCE.getDatabaseContext();

		/**
		 * The meta object literal for the '<em><b>Rooms</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATABASE_CONTEXT__ROOMS = eINSTANCE.getDatabaseContext_Rooms();

		/**
		 * The meta object literal for the '<em><b>Room Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATABASE_CONTEXT__ROOM_TYPES = eINSTANCE.getDatabaseContext_RoomTypes();

		/**
		 * The meta object literal for the '<em><b>Reservations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATABASE_CONTEXT__RESERVATIONS = eINSTANCE.getDatabaseContext_Reservations();

		/**
		 * The meta object literal for the '<em><b>Room Bookings</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATABASE_CONTEXT__ROOM_BOOKINGS = eINSTANCE.getDatabaseContext_RoomBookings();

		/**
		 * The meta object literal for the '{@link SoftwareModel.DataAccess.impl.RoomBookingsRepositoryImpl <em>Room Bookings Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SoftwareModel.DataAccess.impl.RoomBookingsRepositoryImpl
		 * @see SoftwareModel.DataAccess.impl.DataAccessPackageImpl#getRoomBookingsRepository()
		 * @generated
		 */
		EClass ROOM_BOOKINGS_REPOSITORY = eINSTANCE.getRoomBookingsRepository();

		/**
		 * The meta object literal for the '<em><b>Databasecontext</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM_BOOKINGS_REPOSITORY__DATABASECONTEXT = eINSTANCE.getRoomBookingsRepository_Databasecontext();

		/**
		 * The meta object literal for the '<em><b>Update</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_BOOKINGS_REPOSITORY___UPDATE__ROOMBOOKING = eINSTANCE.getRoomBookingsRepository__Update__RoomBooking();

		/**
		 * The meta object literal for the '<em><b>Get</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_BOOKINGS_REPOSITORY___GET__STRING = eINSTANCE.getRoomBookingsRepository__Get__String();

		/**
		 * The meta object literal for the '<em><b>Get</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_BOOKINGS_REPOSITORY___GET__INT_STRING = eINSTANCE.getRoomBookingsRepository__Get__int_String();

		/**
		 * The meta object literal for the '{@link SoftwareModel.DataAccess.impl.AuthorizationRepositoryImpl <em>Authorization Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SoftwareModel.DataAccess.impl.AuthorizationRepositoryImpl
		 * @see SoftwareModel.DataAccess.impl.DataAccessPackageImpl#getAuthorizationRepository()
		 * @generated
		 */
		EClass AUTHORIZATION_REPOSITORY = eINSTANCE.getAuthorizationRepository();

		/**
		 * The meta object literal for the '<em><b>Databasecontext</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTHORIZATION_REPOSITORY__DATABASECONTEXT = eINSTANCE.getAuthorizationRepository_Databasecontext();

		/**
		 * The meta object literal for the '<em><b>Get Passwords</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation AUTHORIZATION_REPOSITORY___GET_PASSWORDS = eINSTANCE.getAuthorizationRepository__GetPasswords();

		/**
		 * The meta object literal for the '{@link SoftwareModel.DataAccess.impl.RoomRepositoryImpl <em>Room Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SoftwareModel.DataAccess.impl.RoomRepositoryImpl
		 * @see SoftwareModel.DataAccess.impl.DataAccessPackageImpl#getRoomRepository()
		 * @generated
		 */
		EClass ROOM_REPOSITORY = eINSTANCE.getRoomRepository();

		/**
		 * The meta object literal for the '<em><b>Databasecontext</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM_REPOSITORY__DATABASECONTEXT = eINSTANCE.getRoomRepository_Databasecontext();

		/**
		 * The meta object literal for the '<em><b>Update Room</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_REPOSITORY___UPDATE_ROOM__ROOM = eINSTANCE.getRoomRepository__UpdateRoom__Room();

		/**
		 * The meta object literal for the '<em><b>Update Room Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_REPOSITORY___UPDATE_ROOM_TYPE__ROOMTYPE = eINSTANCE.getRoomRepository__UpdateRoomType__RoomType();

		/**
		 * The meta object literal for the '<em><b>Get Room</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_REPOSITORY___GET_ROOM__INT = eINSTANCE.getRoomRepository__GetRoom__int();

		/**
		 * The meta object literal for the '<em><b>Get Room Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_REPOSITORY___GET_ROOM_TYPE__INT = eINSTANCE.getRoomRepository__GetRoomType__int();

		/**
		 * The meta object literal for the '<em><b>Remove Room</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_REPOSITORY___REMOVE_ROOM__ROOM = eINSTANCE.getRoomRepository__RemoveRoom__Room();

		/**
		 * The meta object literal for the '<em><b>Add Room</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_REPOSITORY___ADD_ROOM__ROOM = eINSTANCE.getRoomRepository__AddRoom__Room();

		/**
		 * The meta object literal for the '<em><b>Get Rooms</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_REPOSITORY___GET_ROOMS = eINSTANCE.getRoomRepository__GetRooms();

	}

} //DataAccessPackage
