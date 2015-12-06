/**
 */
package SoftwareModel.Presentation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Frame</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SoftwareModel.Presentation.Frame#getCurrentView <em>Current View</em>}</li>
 * </ul>
 *
 * @see SoftwareModel.Presentation.PresentationPackage#getFrame()
 * @model
 * @generated
 */
public interface Frame extends EObject {
	/**
	 * Returns the value of the '<em><b>Current View</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current View</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current View</em>' reference.
	 * @see #setCurrentView(IView)
	 * @see SoftwareModel.Presentation.PresentationPackage#getFrame_CurrentView()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	IView getCurrentView();

	/**
	 * Sets the value of the '{@link SoftwareModel.Presentation.Frame#getCurrentView <em>Current View</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current View</em>' reference.
	 * @see #getCurrentView()
	 * @generated
	 */
	void setCurrentView(IView value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model viewRequired="true" viewOrdered="false"
	 * @generated
	 */
	void ChangeView(IView view);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ViewRequired="true" ViewOrdered="false"
	 * @generated
	 */
	void Start(IView View);

} // Frame
