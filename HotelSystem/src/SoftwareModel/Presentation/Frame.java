/**
 */
package SoftwareModel.Presentation;

import org.eclipse.emf.ecore.EObject;

import java.util.List;


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
	void changeView(IView view);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ViewRequired="true" ViewOrdered="false"
	 * @generated
	 */
	void start(IView View);

	public class MenuItem{
		public String caption;
		private Runnable f;
		public IView nextView;
		public MenuItem(String caption, Runnable callback){
			f = callback;
			this.caption = caption;
		}
		public MenuItem(String caption, IView nextView){
			this.nextView = nextView;
			this.caption = caption;
		}
		public void Run(Frame frame){
			if(nextView != null)
				frame.changeView(nextView);
			else
				f.run();
		}

		public String toString(){
			return caption;
		}
	}

	class Nothing implements Runnable{
		@Override
		public void run() {

		}
	}

	public int input(String description);

	public String inputTextFor(String description);

	public Double inputDoubleFor(String description);

	public Object displaySelectionMenu(String caption,Object[] choices);
	
	public void displayMenu(String caption,MenuItem[] menu);

	public void displayMenu(String caption,List<MenuItem> menu);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void exit();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void goBack();

} // Frame
