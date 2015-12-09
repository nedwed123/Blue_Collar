/**
 */
package SoftwareModel.Presentation.impl;

import SoftwareModel.Presentation.EmployeeHomeView;
import SoftwareModel.Presentation.Frame;
import SoftwareModel.Presentation.PresentationPackage;

import java.lang.reflect.InvocationTargetException;
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
	public void run(Frame frame) {
		frame.displayMenu("Welcome to Hotel Management System", 
				new Frame.MenuItem[] {
						new Frame.MenuItem(
							"Reserve a room",
							new Runnable() {
								@Override
								public void run() {
									frame.changeView(new MakeReservationViewImpl());
								}
							}
						),
						new Frame.MenuItem(
								"Check in/out ",
								new Runnable() {
									@Override
									public void run() {
										frame.changeView(new RoomBookingViewImpl());
									}
								}
							),
						new Frame.MenuItem(
								"Room Management",
								new Runnable() {
									@Override
									public void run() {
										frame.changeView(new LoginViewImpl());
									}
								}
							),
						new Frame.MenuItem(
								"Exit",
								new Runnable() {
									@Override
									public void run() {
										frame.exit();
									}
								}
							),
				});	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case PresentationPackage.EMPLOYEE_HOME_VIEW___RUN__FRAME:
				run((Frame)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //EmployeeHomeViewImpl
