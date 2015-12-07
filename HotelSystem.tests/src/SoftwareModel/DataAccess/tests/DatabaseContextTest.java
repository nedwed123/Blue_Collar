/**
 */
package SoftwareModel.DataAccess.tests;

import SoftwareModel.DataAccess.DataAccessFactory;
import SoftwareModel.DataAccess.DatabaseContext;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Database Context</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DatabaseContextTest extends TestCase {

	/**
	 * The fixture for this Database Context test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatabaseContext fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DatabaseContextTest.class);
	}

	/**
	 * Constructs a new Database Context test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabaseContextTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Database Context test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(DatabaseContext fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Database Context test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatabaseContext getFixture() {
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
		setFixture(DataAccessFactory.eINSTANCE.createDatabaseContext());
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

} //DatabaseContextTest
