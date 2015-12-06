/**
 */
package SoftwareModel.BusinessLogic.util;

import SoftwareModel.BusinessLogic.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see SoftwareModel.BusinessLogic.BusinessLogicPackage
 * @generated
 */
public class BusinessLogicAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BusinessLogicPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessLogicAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = BusinessLogicPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BusinessLogicSwitch<Adapter> modelSwitch =
		new BusinessLogicSwitch<Adapter>() {
			@Override
			public Adapter caseReservations(Reservations object) {
				return createReservationsAdapter();
			}
			@Override
			public Adapter caseRoomBookings(RoomBookings object) {
				return createRoomBookingsAdapter();
			}
			@Override
			public Adapter caseAvailibleRoomFinder(AvailibleRoomFinder object) {
				return createAvailibleRoomFinderAdapter();
			}
			@Override
			public Adapter caseRoomOperations(RoomOperations object) {
				return createRoomOperationsAdapter();
			}
			@Override
			public Adapter caseAuthorizer(Authorizer object) {
				return createAuthorizerAdapter();
			}
			@Override
			public Adapter caseRooms(Rooms object) {
				return createRoomsAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link SoftwareModel.BusinessLogic.Reservations <em>Reservations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SoftwareModel.BusinessLogic.Reservations
	 * @generated
	 */
	public Adapter createReservationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SoftwareModel.BusinessLogic.RoomBookings <em>Room Bookings</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SoftwareModel.BusinessLogic.RoomBookings
	 * @generated
	 */
	public Adapter createRoomBookingsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SoftwareModel.BusinessLogic.AvailibleRoomFinder <em>Availible Room Finder</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SoftwareModel.BusinessLogic.AvailibleRoomFinder
	 * @generated
	 */
	public Adapter createAvailibleRoomFinderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SoftwareModel.BusinessLogic.RoomOperations <em>Room Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SoftwareModel.BusinessLogic.RoomOperations
	 * @generated
	 */
	public Adapter createRoomOperationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SoftwareModel.BusinessLogic.Authorizer <em>Authorizer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SoftwareModel.BusinessLogic.Authorizer
	 * @generated
	 */
	public Adapter createAuthorizerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SoftwareModel.BusinessLogic.Rooms <em>Rooms</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SoftwareModel.BusinessLogic.Rooms
	 * @generated
	 */
	public Adapter createRoomsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //BusinessLogicAdapterFactory
