/**
 */
package SoftwareModel.DomainEntities.tests;

import SoftwareModel.DomainEntities.DomainEntitiesFactory;
import SoftwareModel.DomainEntities.PaymentDetails;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Payment Details</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PaymentDetailsTest extends TestCase {

	/**
	 * The fixture for this Payment Details test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PaymentDetails fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PaymentDetailsTest.class);
	}

	/**
	 * Constructs a new Payment Details test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentDetailsTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Payment Details test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(PaymentDetails fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Payment Details test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PaymentDetails getFixture() {
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
		setFixture(DomainEntitiesFactory.eINSTANCE.createPaymentDetails());
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

} //PaymentDetailsTest
