/**
 */
package SoftwareModel.DataAccess;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Authorization Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SoftwareModel.DataAccess.AuthorizationRepository#getDatabasecontext <em>Databasecontext</em>}</li>
 * </ul>
 *
 * @see SoftwareModel.DataAccess.DataAccessPackage#getAuthorizationRepository()
 * @model
 * @generated
 */
public interface AuthorizationRepository extends EObject {
	/**
	 * Returns the value of the '<em><b>Databasecontext</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Databasecontext</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Databasecontext</em>' reference.
	 * @see #setDatabasecontext(DatabaseContext)
	 * @see SoftwareModel.DataAccess.DataAccessPackage#getAuthorizationRepository_Databasecontext()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	DatabaseContext getDatabasecontext();

	/**
	 * Sets the value of the '{@link SoftwareModel.DataAccess.AuthorizationRepository#getDatabasecontext <em>Databasecontext</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Databasecontext</em>' reference.
	 * @see #getDatabasecontext()
	 * @generated
	 */
	void setDatabasecontext(DatabaseContext value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	EList<String> getPasswords();

} // AuthorizationRepository
