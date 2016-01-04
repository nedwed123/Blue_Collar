/**
 */
package SoftwareModel.Presentation.impl;

import SoftwareModel.Presentation.CustomerHomeView;
import SoftwareModel.Presentation.Frame;
import SoftwareModel.Presentation.PresentationPackage;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import java.lang.reflect.InvocationTargetException;

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
	public void run(final Frame frame) {

		frame.displayMenu("-- Welcome customer --", 
				new Frame.MenuItem[] {
						new Frame.MenuItem("Reserve a room",new MakeReservationViewImpl()),
						new Frame.MenuItem("View Reservation",new ReservationViewImpl()),
						new Frame.MenuItem(
								"Exit",
								new Runnable() {
									@Override
									public void run() {
										frame.exit();
									}
								}
							),
				});

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
				run((Frame)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //CustomerHomeViewImpl
