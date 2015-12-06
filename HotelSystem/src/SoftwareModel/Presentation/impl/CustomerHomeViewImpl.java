/**
 */
package SoftwareModel.Presentation.impl;

import SoftwareModel.Presentation.CustomerHomeView;
import SoftwareModel.Presentation.Frame;
import SoftwareModel.Presentation.PresentationPackage;

import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Customer Home View</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CustomerHomeViewImpl extends MinimalEObjectImpl.Container implements CustomerHomeView {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomerHomeViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PresentationPackage.Literals.CUSTOMER_HOME_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Welcomes customer and asks for input
	 * <!-- end-user-doc -->
	 */
	public void Run(Frame frame) {
		System.out.println("-- Welcome customer --\n"
				+ "1: Make Reservation\n"
				+ "2: View Reservation\n"
				+ "3: Exit\n");

		Scanner in = new Scanner(System.in);
		int input = in.nextInt();
		
		switch (input) {
			case 1:
				frame.ChangeView(new MakeReservationViewImpl());
				break;
			case 2:
				frame.ChangeView(new ReservationViewImpl());
				break;
			default:
				frame.ChangeView(null);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case PresentationPackage.CUSTOMER_HOME_VIEW___RUN__FRAME:
				Run((Frame)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //CustomerHomeViewImpl
