/**
 */
package SoftwareModel.Presentation;

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
 * @see SoftwareModel.Presentation.PresentationFactory
 * @model kind="package"
 * @generated
 */
public interface PresentationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Presentation";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///SoftwareModel/Presentation.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "SoftwareModel.Presentation";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PresentationPackage eINSTANCE = SoftwareModel.Presentation.impl.PresentationPackageImpl.init();

	/**
	 * The meta object id for the '{@link SoftwareModel.Presentation.IView <em>IView</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SoftwareModel.Presentation.IView
	 * @see SoftwareModel.Presentation.impl.PresentationPackageImpl#getIView()
	 * @generated
	 */
	int IVIEW = 1;

	/**
	 * The number of structural features of the '<em>IView</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IVIEW_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IVIEW___RUN__FRAME = 0;

	/**
	 * The number of operations of the '<em>IView</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IVIEW_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link SoftwareModel.Presentation.impl.FrameImpl <em>Frame</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SoftwareModel.Presentation.impl.FrameImpl
	 * @see SoftwareModel.Presentation.impl.PresentationPackageImpl#getFrame()
	 * @generated
	 */
	int FRAME = 2;

	/**
	 * The meta object id for the '{@link SoftwareModel.Presentation.impl.CustomerHomeViewImpl <em>Customer Home View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SoftwareModel.Presentation.impl.CustomerHomeViewImpl
	 * @see SoftwareModel.Presentation.impl.PresentationPackageImpl#getCustomerHomeView()
	 * @generated
	 */
	int CUSTOMER_HOME_VIEW = 0;

	/**
	 * The number of structural features of the '<em>Customer Home View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_HOME_VIEW_FEATURE_COUNT = IVIEW_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_HOME_VIEW___RUN__FRAME = IVIEW___RUN__FRAME;

	/**
	 * The number of operations of the '<em>Customer Home View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_HOME_VIEW_OPERATION_COUNT = IVIEW_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Current View</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME__CURRENT_VIEW = 0;

	/**
	 * The number of structural features of the '<em>Frame</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Change View</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME___CHANGE_VIEW__IVIEW = 0;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME___START__IVIEW = 1;

	/**
	 * The number of operations of the '<em>Frame</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link SoftwareModel.Presentation.impl.RoomBookingViewImpl <em>Room Booking View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SoftwareModel.Presentation.impl.RoomBookingViewImpl
	 * @see SoftwareModel.Presentation.impl.PresentationPackageImpl#getRoomBookingView()
	 * @generated
	 */
	int ROOM_BOOKING_VIEW = 3;

	/**
	 * The feature id for the '<em><b>Rooms</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_BOOKING_VIEW__ROOMS = IVIEW_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Room Booking View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_BOOKING_VIEW_FEATURE_COUNT = IVIEW_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_BOOKING_VIEW___RUN__FRAME = IVIEW___RUN__FRAME;

	/**
	 * The number of operations of the '<em>Room Booking View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_BOOKING_VIEW_OPERATION_COUNT = IVIEW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link SoftwareModel.Presentation.impl.ReservationViewImpl <em>Reservation View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SoftwareModel.Presentation.impl.ReservationViewImpl
	 * @see SoftwareModel.Presentation.impl.PresentationPackageImpl#getReservationView()
	 * @generated
	 */
	int RESERVATION_VIEW = 4;

	/**
	 * The feature id for the '<em><b>Reservations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_VIEW__RESERVATIONS = IVIEW_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Reservation View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_VIEW_FEATURE_COUNT = IVIEW_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_VIEW___RUN__FRAME = IVIEW___RUN__FRAME;

	/**
	 * The number of operations of the '<em>Reservation View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_VIEW_OPERATION_COUNT = IVIEW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link SoftwareModel.Presentation.impl.RoomManagementViewImpl <em>Room Management View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SoftwareModel.Presentation.impl.RoomManagementViewImpl
	 * @see SoftwareModel.Presentation.impl.PresentationPackageImpl#getRoomManagementView()
	 * @generated
	 */
	int ROOM_MANAGEMENT_VIEW = 5;

	/**
	 * The feature id for the '<em><b>Roomoperations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_MANAGEMENT_VIEW__ROOMOPERATIONS = IVIEW_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Room Management View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_MANAGEMENT_VIEW_FEATURE_COUNT = IVIEW_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_MANAGEMENT_VIEW___RUN__FRAME = IVIEW___RUN__FRAME;

	/**
	 * The number of operations of the '<em>Room Management View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_MANAGEMENT_VIEW_OPERATION_COUNT = IVIEW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link SoftwareModel.Presentation.impl.LoginViewImpl <em>Login View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SoftwareModel.Presentation.impl.LoginViewImpl
	 * @see SoftwareModel.Presentation.impl.PresentationPackageImpl#getLoginView()
	 * @generated
	 */
	int LOGIN_VIEW = 6;

	/**
	 * The feature id for the '<em><b>Authorizer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_VIEW__AUTHORIZER = IVIEW_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Login View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_VIEW_FEATURE_COUNT = IVIEW_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_VIEW___RUN__FRAME = IVIEW___RUN__FRAME;

	/**
	 * The number of operations of the '<em>Login View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_VIEW_OPERATION_COUNT = IVIEW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link SoftwareModel.Presentation.impl.EmployeeHomeViewImpl <em>Employee Home View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SoftwareModel.Presentation.impl.EmployeeHomeViewImpl
	 * @see SoftwareModel.Presentation.impl.PresentationPackageImpl#getEmployeeHomeView()
	 * @generated
	 */
	int EMPLOYEE_HOME_VIEW = 7;

	/**
	 * The number of structural features of the '<em>Employee Home View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE_HOME_VIEW_FEATURE_COUNT = IVIEW_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE_HOME_VIEW___RUN__FRAME = IVIEW___RUN__FRAME;

	/**
	 * The number of operations of the '<em>Employee Home View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE_HOME_VIEW_OPERATION_COUNT = IVIEW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link SoftwareModel.Presentation.impl.MakeReservationViewImpl <em>Make Reservation View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SoftwareModel.Presentation.impl.MakeReservationViewImpl
	 * @see SoftwareModel.Presentation.impl.PresentationPackageImpl#getMakeReservationView()
	 * @generated
	 */
	int MAKE_RESERVATION_VIEW = 8;

	/**
	 * The feature id for the '<em><b>Reservations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAKE_RESERVATION_VIEW__RESERVATIONS = IVIEW_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rooms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAKE_RESERVATION_VIEW__ROOMS = IVIEW_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Make Reservation View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAKE_RESERVATION_VIEW_FEATURE_COUNT = IVIEW_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAKE_RESERVATION_VIEW___RUN__FRAME = IVIEW___RUN__FRAME;

	/**
	 * The number of operations of the '<em>Make Reservation View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAKE_RESERVATION_VIEW_OPERATION_COUNT = IVIEW_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link SoftwareModel.Presentation.Frame <em>Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Frame</em>'.
	 * @see SoftwareModel.Presentation.Frame
	 * @generated
	 */
	EClass getFrame();

	/**
	 * Returns the meta object for the reference '{@link SoftwareModel.Presentation.Frame#getCurrentView <em>Current View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Current View</em>'.
	 * @see SoftwareModel.Presentation.Frame#getCurrentView()
	 * @see #getFrame()
	 * @generated
	 */
	EReference getFrame_CurrentView();

	/**
	 * Returns the meta object for the '{@link SoftwareModel.Presentation.Frame#ChangeView(SoftwareModel.Presentation.IView) <em>Change View</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change View</em>' operation.
	 * @see SoftwareModel.Presentation.Frame#ChangeView(SoftwareModel.Presentation.IView)
	 * @generated
	 */
	EOperation getFrame__ChangeView__IView();

	/**
	 * Returns the meta object for the '{@link SoftwareModel.Presentation.Frame#Start(SoftwareModel.Presentation.IView) <em>Start</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Start</em>' operation.
	 * @see SoftwareModel.Presentation.Frame#Start(SoftwareModel.Presentation.IView)
	 * @generated
	 */
	EOperation getFrame__Start__IView();

	/**
	 * Returns the meta object for class '{@link SoftwareModel.Presentation.CustomerHomeView <em>Customer Home View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Customer Home View</em>'.
	 * @see SoftwareModel.Presentation.CustomerHomeView
	 * @generated
	 */
	EClass getCustomerHomeView();

	/**
	 * Returns the meta object for class '{@link SoftwareModel.Presentation.IView <em>IView</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IView</em>'.
	 * @see SoftwareModel.Presentation.IView
	 * @generated
	 */
	EClass getIView();

	/**
	 * Returns the meta object for the '{@link SoftwareModel.Presentation.IView#Run(SoftwareModel.Presentation.Frame) <em>Run</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Run</em>' operation.
	 * @see SoftwareModel.Presentation.IView#Run(SoftwareModel.Presentation.Frame)
	 * @generated
	 */
	EOperation getIView__Run__Frame();

	/**
	 * Returns the meta object for class '{@link SoftwareModel.Presentation.RoomBookingView <em>Room Booking View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room Booking View</em>'.
	 * @see SoftwareModel.Presentation.RoomBookingView
	 * @generated
	 */
	EClass getRoomBookingView();

	/**
	 * Returns the meta object for the containment reference '{@link SoftwareModel.Presentation.RoomBookingView#getRooms <em>Rooms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rooms</em>'.
	 * @see SoftwareModel.Presentation.RoomBookingView#getRooms()
	 * @see #getRoomBookingView()
	 * @generated
	 */
	EReference getRoomBookingView_Rooms();

	/**
	 * Returns the meta object for class '{@link SoftwareModel.Presentation.ReservationView <em>Reservation View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reservation View</em>'.
	 * @see SoftwareModel.Presentation.ReservationView
	 * @generated
	 */
	EClass getReservationView();

	/**
	 * Returns the meta object for the containment reference '{@link SoftwareModel.Presentation.ReservationView#getReservations <em>Reservations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reservations</em>'.
	 * @see SoftwareModel.Presentation.ReservationView#getReservations()
	 * @see #getReservationView()
	 * @generated
	 */
	EReference getReservationView_Reservations();

	/**
	 * Returns the meta object for class '{@link SoftwareModel.Presentation.RoomManagementView <em>Room Management View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room Management View</em>'.
	 * @see SoftwareModel.Presentation.RoomManagementView
	 * @generated
	 */
	EClass getRoomManagementView();

	/**
	 * Returns the meta object for the containment reference '{@link SoftwareModel.Presentation.RoomManagementView#getRoomoperations <em>Roomoperations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Roomoperations</em>'.
	 * @see SoftwareModel.Presentation.RoomManagementView#getRoomoperations()
	 * @see #getRoomManagementView()
	 * @generated
	 */
	EReference getRoomManagementView_Roomoperations();

	/**
	 * Returns the meta object for class '{@link SoftwareModel.Presentation.LoginView <em>Login View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Login View</em>'.
	 * @see SoftwareModel.Presentation.LoginView
	 * @generated
	 */
	EClass getLoginView();

	/**
	 * Returns the meta object for the containment reference '{@link SoftwareModel.Presentation.LoginView#getAuthorizer <em>Authorizer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Authorizer</em>'.
	 * @see SoftwareModel.Presentation.LoginView#getAuthorizer()
	 * @see #getLoginView()
	 * @generated
	 */
	EReference getLoginView_Authorizer();

	/**
	 * Returns the meta object for class '{@link SoftwareModel.Presentation.EmployeeHomeView <em>Employee Home View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Employee Home View</em>'.
	 * @see SoftwareModel.Presentation.EmployeeHomeView
	 * @generated
	 */
	EClass getEmployeeHomeView();

	/**
	 * Returns the meta object for class '{@link SoftwareModel.Presentation.MakeReservationView <em>Make Reservation View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Make Reservation View</em>'.
	 * @see SoftwareModel.Presentation.MakeReservationView
	 * @generated
	 */
	EClass getMakeReservationView();

	/**
	 * Returns the meta object for the containment reference '{@link SoftwareModel.Presentation.MakeReservationView#getReservations <em>Reservations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reservations</em>'.
	 * @see SoftwareModel.Presentation.MakeReservationView#getReservations()
	 * @see #getMakeReservationView()
	 * @generated
	 */
	EReference getMakeReservationView_Reservations();

	/**
	 * Returns the meta object for the reference '{@link SoftwareModel.Presentation.MakeReservationView#getRooms <em>Rooms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rooms</em>'.
	 * @see SoftwareModel.Presentation.MakeReservationView#getRooms()
	 * @see #getMakeReservationView()
	 * @generated
	 */
	EReference getMakeReservationView_Rooms();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PresentationFactory getPresentationFactory();

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
		 * The meta object literal for the '{@link SoftwareModel.Presentation.impl.FrameImpl <em>Frame</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SoftwareModel.Presentation.impl.FrameImpl
		 * @see SoftwareModel.Presentation.impl.PresentationPackageImpl#getFrame()
		 * @generated
		 */
		EClass FRAME = eINSTANCE.getFrame();

		/**
		 * The meta object literal for the '<em><b>Current View</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FRAME__CURRENT_VIEW = eINSTANCE.getFrame_CurrentView();

		/**
		 * The meta object literal for the '<em><b>Change View</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FRAME___CHANGE_VIEW__IVIEW = eINSTANCE.getFrame__ChangeView__IView();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FRAME___START__IVIEW = eINSTANCE.getFrame__Start__IView();

		/**
		 * The meta object literal for the '{@link SoftwareModel.Presentation.impl.CustomerHomeViewImpl <em>Customer Home View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SoftwareModel.Presentation.impl.CustomerHomeViewImpl
		 * @see SoftwareModel.Presentation.impl.PresentationPackageImpl#getCustomerHomeView()
		 * @generated
		 */
		EClass CUSTOMER_HOME_VIEW = eINSTANCE.getCustomerHomeView();

		/**
		 * The meta object literal for the '{@link SoftwareModel.Presentation.IView <em>IView</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SoftwareModel.Presentation.IView
		 * @see SoftwareModel.Presentation.impl.PresentationPackageImpl#getIView()
		 * @generated
		 */
		EClass IVIEW = eINSTANCE.getIView();

		/**
		 * The meta object literal for the '<em><b>Run</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IVIEW___RUN__FRAME = eINSTANCE.getIView__Run__Frame();

		/**
		 * The meta object literal for the '{@link SoftwareModel.Presentation.impl.RoomBookingViewImpl <em>Room Booking View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SoftwareModel.Presentation.impl.RoomBookingViewImpl
		 * @see SoftwareModel.Presentation.impl.PresentationPackageImpl#getRoomBookingView()
		 * @generated
		 */
		EClass ROOM_BOOKING_VIEW = eINSTANCE.getRoomBookingView();

		/**
		 * The meta object literal for the '<em><b>Rooms</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM_BOOKING_VIEW__ROOMS = eINSTANCE.getRoomBookingView_Rooms();

		/**
		 * The meta object literal for the '{@link SoftwareModel.Presentation.impl.ReservationViewImpl <em>Reservation View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SoftwareModel.Presentation.impl.ReservationViewImpl
		 * @see SoftwareModel.Presentation.impl.PresentationPackageImpl#getReservationView()
		 * @generated
		 */
		EClass RESERVATION_VIEW = eINSTANCE.getReservationView();

		/**
		 * The meta object literal for the '<em><b>Reservations</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESERVATION_VIEW__RESERVATIONS = eINSTANCE.getReservationView_Reservations();

		/**
		 * The meta object literal for the '{@link SoftwareModel.Presentation.impl.RoomManagementViewImpl <em>Room Management View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SoftwareModel.Presentation.impl.RoomManagementViewImpl
		 * @see SoftwareModel.Presentation.impl.PresentationPackageImpl#getRoomManagementView()
		 * @generated
		 */
		EClass ROOM_MANAGEMENT_VIEW = eINSTANCE.getRoomManagementView();

		/**
		 * The meta object literal for the '<em><b>Roomoperations</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM_MANAGEMENT_VIEW__ROOMOPERATIONS = eINSTANCE.getRoomManagementView_Roomoperations();

		/**
		 * The meta object literal for the '{@link SoftwareModel.Presentation.impl.LoginViewImpl <em>Login View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SoftwareModel.Presentation.impl.LoginViewImpl
		 * @see SoftwareModel.Presentation.impl.PresentationPackageImpl#getLoginView()
		 * @generated
		 */
		EClass LOGIN_VIEW = eINSTANCE.getLoginView();

		/**
		 * The meta object literal for the '<em><b>Authorizer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGIN_VIEW__AUTHORIZER = eINSTANCE.getLoginView_Authorizer();

		/**
		 * The meta object literal for the '{@link SoftwareModel.Presentation.impl.EmployeeHomeViewImpl <em>Employee Home View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SoftwareModel.Presentation.impl.EmployeeHomeViewImpl
		 * @see SoftwareModel.Presentation.impl.PresentationPackageImpl#getEmployeeHomeView()
		 * @generated
		 */
		EClass EMPLOYEE_HOME_VIEW = eINSTANCE.getEmployeeHomeView();

		/**
		 * The meta object literal for the '{@link SoftwareModel.Presentation.impl.MakeReservationViewImpl <em>Make Reservation View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SoftwareModel.Presentation.impl.MakeReservationViewImpl
		 * @see SoftwareModel.Presentation.impl.PresentationPackageImpl#getMakeReservationView()
		 * @generated
		 */
		EClass MAKE_RESERVATION_VIEW = eINSTANCE.getMakeReservationView();

		/**
		 * The meta object literal for the '<em><b>Reservations</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAKE_RESERVATION_VIEW__RESERVATIONS = eINSTANCE.getMakeReservationView_Reservations();

		/**
		 * The meta object literal for the '<em><b>Rooms</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAKE_RESERVATION_VIEW__ROOMS = eINSTANCE.getMakeReservationView_Rooms();

	}

} //PresentationPackage
