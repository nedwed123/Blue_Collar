/**
 */
package SoftwareModel.DataAccess.tests;

import SoftwareModel.DataAccess.AuthorizationRepository;
import SoftwareModel.DataAccess.DataAccessFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Authorization Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link SoftwareModel.DataAccess.AuthorizationRepository#getPasswords() <em>Get Passwords</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class AuthorizationRepositoryTest extends TestCase {

	/**
	 * The fixture for this Authorization Repository test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AuthorizationRepository fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AuthorizationRepositoryTest.class);
	}

	/**
	 * Constructs a new Authorization Repository test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthorizationRepositoryTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Authorization Repository test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(AuthorizationRepository fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Authorization Repository test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AuthorizationRepository getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DataAccessFactory.eINSTANCE.createAuthorizationRepository());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

	/**
	 * Tests the '{@link SoftwareModel.DataAccess.AuthorizationRepository#getPasswords() <em>Get Passwords</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SoftwareModel.DataAccess.AuthorizationRepository#getPasswords()
	 * @generated
	 */
	public void testGetPasswords() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //AuthorizationRepositoryTest
