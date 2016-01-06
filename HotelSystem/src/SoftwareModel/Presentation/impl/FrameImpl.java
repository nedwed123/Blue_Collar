/**
 */
package SoftwareModel.Presentation.impl;

import SoftwareModel.Presentation.Frame;
import SoftwareModel.Presentation.IView;
import SoftwareModel.Presentation.PresentationPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import java.lang.reflect.InvocationTargetException;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Frame</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link SoftwareModel.Presentation.impl.FrameImpl#getCurrentView <em>Current View</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FrameImpl extends MinimalEObjectImpl.Container implements Frame {
	/**
	 * The cached value of the '{@link #getCurrentView() <em>Current View</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentView()
	 * @generated
	 * @ordered
	 */
	protected IView currentView;
	
	private IView previousView;
	private boolean running = true;
	Scanner scanner = new Scanner(System.in);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrameImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PresentationPackage.Literals.FRAME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IView getCurrentView() {
		if (currentView != null && currentView.eIsProxy()) {
			InternalEObject oldCurrentView = (InternalEObject)currentView;
			currentView = (IView)eResolveProxy(oldCurrentView);
			if (currentView != oldCurrentView) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PresentationPackage.FRAME__CURRENT_VIEW, oldCurrentView, currentView));
			}
		}
		return currentView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IView basicGetCurrentView() {
		return currentView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentView(IView newCurrentView) {
		IView oldCurrentView = currentView;
		currentView = newCurrentView;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationPackage.FRAME__CURRENT_VIEW, oldCurrentView, currentView));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void changeView(IView view) {
		previousView = currentView;
		setCurrentView(view);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void start(IView View) {
		setCurrentView(View);
		while(running)
		{
			currentView.run(this);
		}
	}

	public Object displaySelectionMenu(String caption,Object[] choices) {
		System.out.println(caption);
		int i = 1;
		for (Object menuItem : choices) {
			System.out.println("[" + i + "] " + menuItem.toString());
			i++;
		}
		int choice = 0;
		while(true){
			Scanner scan=new Scanner(System.in);
			System.out.print("Option :");
			try{
			choice=scan.nextInt();
			if(choice <= 0 || choice > choices.length)
				System.out.println("Impossible choice");
			else
				return choices[choice-1];
			}catch(InputMismatchException ex){
				System.out.println("Impossible choice");
			}
			}
	}

	public void displayMenu(String caption,MenuItem[] menu){
		MenuItem item = (MenuItem)displaySelectionMenu(caption,menu);
		item.Run(this);
	}

	public void displayMenu(String caption, List<MenuItem> menu) {
		displayMenu(caption,menu.toArray(new MenuItem[menu.size()]));
	}

	private void AskFor(String description){
		System.out.println("Please enter " + description + ":");
	}

	public int input(String description){
		AskFor(description);
		int in = scanner.nextInt();
		scanner.nextLine();
		return in;
	}

	@Override
	public String inputTextFor(String description) {
		AskFor(description);
		return scanner.nextLine();
	}

	@Override
	public Double inputDoubleFor(String description) {
		AskFor(description);
		return scanner.nextDouble();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void exit() {
		running = false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void goBack() {
		setCurrentView(previousView);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PresentationPackage.FRAME__CURRENT_VIEW:
				if (resolve) return getCurrentView();
				return basicGetCurrentView();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PresentationPackage.FRAME__CURRENT_VIEW:
				setCurrentView((IView)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PresentationPackage.FRAME__CURRENT_VIEW:
				setCurrentView((IView)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PresentationPackage.FRAME__CURRENT_VIEW:
				return currentView != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case PresentationPackage.FRAME___CHANGE_VIEW__IVIEW:
				changeView((IView)arguments.get(0));
				return null;
			case PresentationPackage.FRAME___START__IVIEW:
				start((IView)arguments.get(0));
				return null;
			case PresentationPackage.FRAME___EXIT:
				exit();
				return null;
			case PresentationPackage.FRAME___GO_BACK:
				goBack();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //FrameImpl
