/**
 */
package SoftwareModel.DataAccess.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>DataAccess</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class DataAccessTests extends TestSuite {

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
		TestSuite suite = new DataAccessTests("DataAccess Tests");
		suite.addTestSuite(ReservationsRepositoryTest.class);
		suite.addTestSuite(RoomBookingsRepositoryTest.class);
		suite.addTestSuite(AuthorizationRepositoryTest.class);
		suite.addTestSuite(RoomRepositoryTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataAccessTests(String name) {
		super(name);
	}

} //DataAccessTests
