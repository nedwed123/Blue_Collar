/**
 */
package SoftwareModel.BusinessLogic.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>BusinessLogic</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class BusinessLogicTests extends TestSuite {

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
		TestSuite suite = new BusinessLogicTests("BusinessLogic Tests");
		suite.addTestSuite(ReservationsTest.class);
		suite.addTestSuite(RoomBookingsTest.class);
		suite.addTestSuite(AvailibleRoomFinderTest.class);
		suite.addTestSuite(RoomOperationsTest.class);
		suite.addTestSuite(AuthorizerTest.class);
		suite.addTestSuite(RoomsTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessLogicTests(String name) {
		super(name);
	}

} //BusinessLogicTests
