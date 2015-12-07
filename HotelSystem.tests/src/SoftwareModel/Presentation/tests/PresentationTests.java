/**
 */
package SoftwareModel.Presentation.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>Presentation</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class PresentationTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new PresentationTests("Presentation Tests");
		suite.addTestSuite(CustomerHomeViewTest.class);
		suite.addTestSuite(FrameTest.class);
		suite.addTestSuite(RoomBookingViewTest.class);
		suite.addTestSuite(ReservationViewTest.class);
		suite.addTestSuite(RoomManagementViewTest.class);
		suite.addTestSuite(LoginViewTest.class);
		suite.addTestSuite(EmployeeHomeViewTest.class);
		suite.addTestSuite(MakeReservationViewTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PresentationTests(String name) {
		super(name);
	}

} //PresentationTests
