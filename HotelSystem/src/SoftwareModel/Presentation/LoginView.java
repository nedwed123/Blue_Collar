/**
 */
package SoftwareModel.Presentation;

import SoftwareModel.BusinessLogic.Authorizer;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Login View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SoftwareModel.Presentation.LoginView#getAuthorizer <em>Authorizer</em>}</li>
 * </ul>
 *
 * @see SoftwareModel.Presentation.PresentationPackage#getLoginView()
 * @model
 * @generated
 */
public interface LoginView extends IView {

	/**
	 * Returns the value of the '<em><b>Authorizer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Authorizer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authorizer</em>' containment reference.
	 * @see #setAuthorizer(Authorizer)
	 * @see SoftwareModel.Presentation.PresentationPackage#getLoginView_Authorizer()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Authorizer getAuthorizer();

	/**
	 * Sets the value of the '{@link SoftwareModel.Presentation.LoginView#getAuthorizer <em>Authorizer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authorizer</em>' containment reference.
	 * @see #getAuthorizer()
	 * @generated
	 */
	void setAuthorizer(Authorizer value);
} // LoginView
