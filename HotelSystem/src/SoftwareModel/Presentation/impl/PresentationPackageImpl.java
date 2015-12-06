/**
 */
package SoftwareModel.Presentation.impl;

import SoftwareModel.BusinessLogic.BusinessLogicPackage;

import SoftwareModel.BusinessLogic.impl.BusinessLogicPackageImpl;

import SoftwareModel.DataAccess.DataAccessPackage;

import SoftwareModel.DataAccess.impl.DataAccessPackageImpl;

import SoftwareModel.DomainEntities.DomainEntitiesPackage;

import SoftwareModel.DomainEntities.impl.DomainEntitiesPackageImpl;

import SoftwareModel.Presentation.CustomerHomeView;
import SoftwareModel.Presentation.EmployeeHomeView;
import SoftwareModel.Presentation.Frame;
import SoftwareModel.Presentation.IView;
import SoftwareModel.Presentation.LoginView;
import SoftwareModel.Presentation.MakeReservationView;
import SoftwareModel.Presentation.PresentationFactory;
import SoftwareModel.Presentation.PresentationPackage;
import SoftwareModel.Presentation.ReservationView;
import SoftwareModel.Presentation.RoomBookingView;
import SoftwareModel.Presentation.RoomManagementView;

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
public class PresentationPackageImpl extends EPackageImpl implements PresentationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customerHomeViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass frameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roomBookingViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reservationViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roomManagementViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loginViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass employeeHomeViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass makeReservationViewEClass = null;

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
	 * @see SoftwareModel.Presentation.PresentationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PresentationPackageImpl() {
		super(eNS_URI, PresentationFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PresentationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PresentationPackage init() {
		if (isInited) return (PresentationPackage)EPackage.Registry.INSTANCE.getEPackage(PresentationPackage.eNS_URI);

		// Obtain or create and register package
		PresentationPackageImpl thePresentationPackage = (PresentationPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PresentationPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PresentationPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		TypesPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		DomainEntitiesPackageImpl theDomainEntitiesPackage = (DomainEntitiesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DomainEntitiesPackage.eNS_URI) instanceof DomainEntitiesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DomainEntitiesPackage.eNS_URI) : DomainEntitiesPackage.eINSTANCE);
		DataAccessPackageImpl theDataAccessPackage = (DataAccessPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DataAccessPackage.eNS_URI) instanceof DataAccessPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DataAccessPackage.eNS_URI) : DataAccessPackage.eINSTANCE);
		BusinessLogicPackageImpl theBusinessLogicPackage = (BusinessLogicPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BusinessLogicPackage.eNS_URI) instanceof BusinessLogicPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BusinessLogicPackage.eNS_URI) : BusinessLogicPackage.eINSTANCE);

		// Create package meta-data objects
		thePresentationPackage.createPackageContents();
		theDomainEntitiesPackage.createPackageContents();
		theDataAccessPackage.createPackageContents();
		theBusinessLogicPackage.createPackageContents();

		// Initialize created meta-data
		thePresentationPackage.initializePackageContents();
		theDomainEntitiesPackage.initializePackageContents();
		theDataAccessPackage.initializePackageContents();
		theBusinessLogicPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePresentationPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PresentationPackage.eNS_URI, thePresentationPackage);
		return thePresentationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomerHomeView() {
		return customerHomeViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIView() {
		return iViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIView__Run__Frame() {
		return iViewEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFrame() {
		return frameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFrame_CurrentView() {
		return (EReference)frameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFrame__ChangeView__IView() {
		return frameEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFrame__Start__IView() {
		return frameEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoomBookingView() {
		return roomBookingViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoomBookingView_Rooms() {
		return (EReference)roomBookingViewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReservationView() {
		return reservationViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReservationView_Reservations() {
		return (EReference)reservationViewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoomManagementView() {
		return roomManagementViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoomManagementView_Roomoperations() {
		return (EReference)roomManagementViewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLoginView() {
		return loginViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLoginView_Authorizer() {
		return (EReference)loginViewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEmployeeHomeView() {
		return employeeHomeViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMakeReservationView() {
		return makeReservationViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMakeReservationView_Reservations() {
		return (EReference)makeReservationViewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMakeReservationView_Rooms() {
		return (EReference)makeReservationViewEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PresentationFactory getPresentationFactory() {
		return (PresentationFactory)getEFactoryInstance();
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
		customerHomeViewEClass = createEClass(CUSTOMER_HOME_VIEW);

		iViewEClass = createEClass(IVIEW);
		createEOperation(iViewEClass, IVIEW___RUN__FRAME);

		frameEClass = createEClass(FRAME);
		createEReference(frameEClass, FRAME__CURRENT_VIEW);
		createEOperation(frameEClass, FRAME___CHANGE_VIEW__IVIEW);
		createEOperation(frameEClass, FRAME___START__IVIEW);

		roomBookingViewEClass = createEClass(ROOM_BOOKING_VIEW);
		createEReference(roomBookingViewEClass, ROOM_BOOKING_VIEW__ROOMS);

		reservationViewEClass = createEClass(RESERVATION_VIEW);
		createEReference(reservationViewEClass, RESERVATION_VIEW__RESERVATIONS);

		roomManagementViewEClass = createEClass(ROOM_MANAGEMENT_VIEW);
		createEReference(roomManagementViewEClass, ROOM_MANAGEMENT_VIEW__ROOMOPERATIONS);

		loginViewEClass = createEClass(LOGIN_VIEW);
		createEReference(loginViewEClass, LOGIN_VIEW__AUTHORIZER);

		employeeHomeViewEClass = createEClass(EMPLOYEE_HOME_VIEW);

		makeReservationViewEClass = createEClass(MAKE_RESERVATION_VIEW);
		createEReference(makeReservationViewEClass, MAKE_RESERVATION_VIEW__RESERVATIONS);
		createEReference(makeReservationViewEClass, MAKE_RESERVATION_VIEW__ROOMS);
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
		BusinessLogicPackage theBusinessLogicPackage = (BusinessLogicPackage)EPackage.Registry.INSTANCE.getEPackage(BusinessLogicPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		customerHomeViewEClass.getESuperTypes().add(this.getIView());
		roomBookingViewEClass.getESuperTypes().add(this.getIView());
		reservationViewEClass.getESuperTypes().add(this.getIView());
		roomManagementViewEClass.getESuperTypes().add(this.getIView());
		loginViewEClass.getESuperTypes().add(this.getIView());
		employeeHomeViewEClass.getESuperTypes().add(this.getIView());
		makeReservationViewEClass.getESuperTypes().add(this.getIView());

		// Initialize classes, features, and operations; add parameters
		initEClass(customerHomeViewEClass, CustomerHomeView.class, "CustomerHomeView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iViewEClass, IView.class, "IView", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getIView__Run__Frame(), null, "Run", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getFrame(), "frame", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(frameEClass, Frame.class, "Frame", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFrame_CurrentView(), this.getIView(), null, "currentView", null, 1, 1, Frame.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getFrame__ChangeView__IView(), null, "ChangeView", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getIView(), "view", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getFrame__Start__IView(), null, "Start", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getIView(), "View", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(roomBookingViewEClass, RoomBookingView.class, "RoomBookingView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoomBookingView_Rooms(), theBusinessLogicPackage.getRooms(), null, "rooms", null, 1, 1, RoomBookingView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(reservationViewEClass, ReservationView.class, "ReservationView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReservationView_Reservations(), theBusinessLogicPackage.getReservations(), null, "reservations", null, 1, 1, ReservationView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(roomManagementViewEClass, RoomManagementView.class, "RoomManagementView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoomManagementView_Roomoperations(), theBusinessLogicPackage.getRoomOperations(), null, "roomoperations", null, 1, 1, RoomManagementView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(loginViewEClass, LoginView.class, "LoginView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLoginView_Authorizer(), theBusinessLogicPackage.getAuthorizer(), null, "authorizer", null, 1, 1, LoginView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(employeeHomeViewEClass, EmployeeHomeView.class, "EmployeeHomeView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(makeReservationViewEClass, MakeReservationView.class, "MakeReservationView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMakeReservationView_Reservations(), theBusinessLogicPackage.getReservations(), null, "reservations", null, 1, 1, MakeReservationView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMakeReservationView_Rooms(), theBusinessLogicPackage.getRooms(), null, "rooms", null, 1, 1, MakeReservationView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //PresentationPackageImpl
