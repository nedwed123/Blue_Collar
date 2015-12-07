/**
 */
package SoftwareModel.DomainEntities.tests;

import SoftwareModel.BusinessLogic.tests.BusinessLogicTests;

import SoftwareModel.DataAccess.tests.DataAccessTests;

import SoftwareModel.Presentation.tests.PresentationTests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>Model</b></em>' model.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelAllTests extends TestSuite {

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
		TestSuite suite = new ModelAllTests("Model Tests");
		suite.addTest(DataAccessTests.suite());
		suite.addTest(BusinessLogicTests.suite());
		suite.addTest(PresentationTests.suite());
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelAllTests(String name) {
		super(name);
	}

} //ModelAllTests
