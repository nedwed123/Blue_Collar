/**
 */
package SoftwareModel.Presentation.impl;

import SoftwareModel.Presentation.EmployeeHomeView;
import SoftwareModel.Presentation.Frame;
import SoftwareModel.Presentation.PresentationPackage;
import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Employee Home View</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class EmployeeHomeViewImpl extends MinimalEObjectImpl.Container implements EmployeeHomeView {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmployeeHomeViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PresentationPackage.Literals.EMPLOYEE_HOME_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void Run(Frame frame) {
		System.out.print("Welcome to Hotel Management System \n"
				+ "Please select an option:\n"
				+ "1.Reserve a Room \n"
				+ "2.Check in/out \n"
				+ "3.Room Management\n");
		Scanner scan=new Scanner(System.in);
		System.out.print("Option :");
		int choice=scan.nextInt();
		switch (choice){
		case 1:
			frame.ChangeView(new MakeReservationViewImpl());
			break;
		case 2:
			frame.ChangeView(new RoomBookingViewImpl() );
			break;
		case 3:
			frame.ChangeView(new LoginViewImpl());
			break;
		default:
			frame.ChangeView(null);
			
		}
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		//	throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case PresentationPackage.EMPLOYEE_HOME_VIEW___RUN__FRAME:
				Run((Frame)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //EmployeeHomeViewImpl
