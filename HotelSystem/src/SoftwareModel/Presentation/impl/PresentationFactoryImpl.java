/**
 */
package SoftwareModel.Presentation.impl;

import SoftwareModel.Presentation.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PresentationFactoryImpl extends EFactoryImpl implements PresentationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PresentationFactory init() {
		try {
			PresentationFactory thePresentationFactory = (PresentationFactory)EPackage.Registry.INSTANCE.getEFactory(PresentationPackage.eNS_URI);
			if (thePresentationFactory != null) {
				return thePresentationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PresentationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PresentationFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case PresentationPackage.CUSTOMER_HOME_VIEW: return createCustomerHomeView();
			case PresentationPackage.FRAME: return createFrame();
			case PresentationPackage.ROOM_BOOKING_VIEW: return createRoomBookingView();
			case PresentationPackage.RESERVATION_VIEW: return createReservationView();
			case PresentationPackage.ROOM_MANAGEMENT_VIEW: return createRoomManagementView();
			case PresentationPackage.LOGIN_VIEW: return createLoginView();
			case PresentationPackage.EMPLOYEE_HOME_VIEW: return createEmployeeHomeView();
			case PresentationPackage.MAKE_RESERVATION_VIEW: return createMakeReservationView();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomerHomeView createCustomerHomeView() {
		CustomerHomeViewImpl customerHomeView = new CustomerHomeViewImpl();
		return customerHomeView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Frame createFrame() {
		FrameImpl frame = new FrameImpl();
		return frame;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomBookingView createRoomBookingView() {
		RoomBookingViewImpl roomBookingView = new RoomBookingViewImpl();
		return roomBookingView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReservationView createReservationView() {
		ReservationViewImpl reservationView = new ReservationViewImpl();
		return reservationView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomManagementView createRoomManagementView() {
		RoomManagementViewImpl roomManagementView = new RoomManagementViewImpl();
		return roomManagementView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoginView createLoginView() {
		LoginViewImpl loginView = new LoginViewImpl();
		return loginView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmployeeHomeView createEmployeeHomeView() {
		EmployeeHomeViewImpl employeeHomeView = new EmployeeHomeViewImpl();
		return employeeHomeView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MakeReservationView createMakeReservationView() {
		MakeReservationViewImpl makeReservationView = new MakeReservationViewImpl();
		return makeReservationView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PresentationPackage getPresentationPackage() {
		return (PresentationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PresentationPackage getPackage() {
		return PresentationPackage.eINSTANCE;
	}

} //PresentationFactoryImpl
