/**
 */
package SoftwareModel.BusinessLogic.impl;

import SoftwareModel.BusinessLogic.*;

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
public class BusinessLogicFactoryImpl extends EFactoryImpl implements BusinessLogicFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BusinessLogicFactory init() {
		try {
			BusinessLogicFactory theBusinessLogicFactory = (BusinessLogicFactory)EPackage.Registry.INSTANCE.getEFactory(BusinessLogicPackage.eNS_URI);
			if (theBusinessLogicFactory != null) {
				return theBusinessLogicFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BusinessLogicFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessLogicFactoryImpl() {
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
			case BusinessLogicPackage.RESERVATIONS: return createReservations();
			case BusinessLogicPackage.ROOM_BOOKINGS: return createRoomBookings();
			case BusinessLogicPackage.AVAILIBLE_ROOM_FINDER: return createAvailibleRoomFinder();
			case BusinessLogicPackage.ROOM_OPERATIONS: return createRoomOperations();
			case BusinessLogicPackage.AUTHORIZER: return createAuthorizer();
			case BusinessLogicPackage.ROOMS: return createRooms();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reservations createReservations() {
		ReservationsImpl reservations = new ReservationsImpl();
		return reservations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomBookings createRoomBookings() {
		RoomBookingsImpl roomBookings = new RoomBookingsImpl();
		return roomBookings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AvailibleRoomFinder createAvailibleRoomFinder() {
		AvailibleRoomFinderImpl availibleRoomFinder = new AvailibleRoomFinderImpl();
		return availibleRoomFinder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomOperations createRoomOperations() {
		RoomOperationsImpl roomOperations = new RoomOperationsImpl();
		return roomOperations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Authorizer createAuthorizer() {
		AuthorizerImpl authorizer = new AuthorizerImpl();
		return authorizer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rooms createRooms() {
		RoomsImpl rooms = new RoomsImpl();
		return rooms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessLogicPackage getBusinessLogicPackage() {
		return (BusinessLogicPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BusinessLogicPackage getPackage() {
		return BusinessLogicPackage.eINSTANCE;
	}

} //BusinessLogicFactoryImpl
