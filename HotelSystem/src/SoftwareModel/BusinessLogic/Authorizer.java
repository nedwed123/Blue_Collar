/**
 */
package SoftwareModel.BusinessLogic;

import SoftwareModel.DataAccess.AuthorizationRepository;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Authorizer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SoftwareModel.BusinessLogic.Authorizer#getManagerrepository <em>Managerrepository</em>}</li>
 * </ul>
 *
 * @see SoftwareModel.BusinessLogic.BusinessLogicPackage#getAuthorizer()
 * @model
 * @generated
 */
public interface Authorizer extends EObject {
	/**
	 * Returns the value of the '<em><b>Managerrepository</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Managerrepository</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Managerrepository</em>' containment reference.
	 * @see #setManagerrepository(AuthorizationRepository)
	 * @see SoftwareModel.BusinessLogic.BusinessLogicPackage#getAuthorizer_Managerrepository()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	AuthorizationRepository getManagerrepository();

	/**
	 * Sets the value of the '{@link SoftwareModel.BusinessLogic.Authorizer#getManagerrepository <em>Managerrepository</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Managerrepository</em>' containment reference.
	 * @see #getManagerrepository()
	 * @generated
	 */
	void setManagerrepository(AuthorizationRepository value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false" passwordDataType="org.eclipse.uml2.types.String" passwordRequired="true" passwordOrdered="false"
	 * @generated
	 */
	boolean Authorize(String password);

} // Authorizer
