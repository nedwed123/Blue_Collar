/**
 */
package SoftwareModel.Presentation.util;

import SoftwareModel.Presentation.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see SoftwareModel.Presentation.PresentationPackage
 * @generated
 */
public class PresentationAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PresentationPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PresentationAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = PresentationPackage.eINSTANCE;
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
	protected PresentationSwitch<Adapter> modelSwitch =
		new PresentationSwitch<Adapter>() {
			@Override
			public Adapter caseCustomerHomeView(CustomerHomeView object) {
				return createCustomerHomeViewAdapter();
			}
			@Override
			public Adapter caseIView(IView object) {
				return createIViewAdapter();
			}
			@Override
			public Adapter caseFrame(Frame object) {
				return createFrameAdapter();
			}
			@Override
			public Adapter caseRoomBookingView(RoomBookingView object) {
				return createRoomBookingViewAdapter();
			}
			@Override
			public Adapter caseReservationView(ReservationView object) {
				return createReservationViewAdapter();
			}
			@Override
			public Adapter caseRoomManagementView(RoomManagementView object) {
				return createRoomManagementViewAdapter();
			}
			@Override
			public Adapter caseLoginView(LoginView object) {
				return createLoginViewAdapter();
			}
			@Override
			public Adapter caseEmployeeHomeView(EmployeeHomeView object) {
				return createEmployeeHomeViewAdapter();
			}
			@Override
			public Adapter caseMakeReservationView(MakeReservationView object) {
				return createMakeReservationViewAdapter();
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
	 * Creates a new adapter for an object of class '{@link SoftwareModel.Presentation.Frame <em>Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SoftwareModel.Presentation.Frame
	 * @generated
	 */
	public Adapter createFrameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SoftwareModel.Presentation.CustomerHomeView <em>Customer Home View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SoftwareModel.Presentation.CustomerHomeView
	 * @generated
	 */
	public Adapter createCustomerHomeViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SoftwareModel.Presentation.IView <em>IView</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SoftwareModel.Presentation.IView
	 * @generated
	 */
	public Adapter createIViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SoftwareModel.Presentation.RoomBookingView <em>Room Booking View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SoftwareModel.Presentation.RoomBookingView
	 * @generated
	 */
	public Adapter createRoomBookingViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SoftwareModel.Presentation.ReservationView <em>Reservation View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SoftwareModel.Presentation.ReservationView
	 * @generated
	 */
	public Adapter createReservationViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SoftwareModel.Presentation.RoomManagementView <em>Room Management View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SoftwareModel.Presentation.RoomManagementView
	 * @generated
	 */
	public Adapter createRoomManagementViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SoftwareModel.Presentation.LoginView <em>Login View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SoftwareModel.Presentation.LoginView
	 * @generated
	 */
	public Adapter createLoginViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SoftwareModel.Presentation.EmployeeHomeView <em>Employee Home View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SoftwareModel.Presentation.EmployeeHomeView
	 * @generated
	 */
	public Adapter createEmployeeHomeViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SoftwareModel.Presentation.MakeReservationView <em>Make Reservation View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SoftwareModel.Presentation.MakeReservationView
	 * @generated
	 */
	public Adapter createMakeReservationViewAdapter() {
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

} //PresentationAdapterFactory
