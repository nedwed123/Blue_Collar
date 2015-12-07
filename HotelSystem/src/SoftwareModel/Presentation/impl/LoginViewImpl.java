/**
 */
package SoftwareModel.Presentation.impl;

import SoftwareModel.BusinessLogic.Authorizer;
import SoftwareModel.DataAccess.impl.AuthorizationRepositoryImpl;
import SoftwareModel.Presentation.Frame;
import SoftwareModel.Presentation.LoginView;
import SoftwareModel.Presentation.PresentationPackage;

import java.io.Console;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Login View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link SoftwareModel.Presentation.impl.LoginViewImpl#getAuthorizer <em>Authorizer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LoginViewImpl extends MinimalEObjectImpl.Container implements LoginView {
	/**
	 * The cached value of the '{@link #getAuthorizer() <em>Authorizer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthorizer()

	 * @ordered
	 */
	protected Authorizer authorizer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoginViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PresentationPackage.Literals.LOGIN_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Authorizer getAuthorizer() {
		return authorizer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuthorizer(Authorizer newAuthorizer, NotificationChain msgs) {
		Authorizer oldAuthorizer = authorizer;
		authorizer = newAuthorizer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PresentationPackage.LOGIN_VIEW__AUTHORIZER, oldAuthorizer, newAuthorizer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthorizer(Authorizer newAuthorizer) {
		if (newAuthorizer != authorizer) {
			NotificationChain msgs = null;
			if (authorizer != null)
				msgs = ((InternalEObject)authorizer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PresentationPackage.LOGIN_VIEW__AUTHORIZER, null, msgs);
			if (newAuthorizer != null)
				msgs = ((InternalEObject)newAuthorizer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PresentationPackage.LOGIN_VIEW__AUTHORIZER, null, msgs);
			msgs = basicSetAuthorizer(newAuthorizer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationPackage.LOGIN_VIEW__AUTHORIZER, newAuthorizer, newAuthorizer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void Run(Frame frame) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter username");
		String username=scan.nextLine();
		System.out.println("Please enter password");
		String password=scan.nextLine();
		if(username.equals("Admin") && password.equals("pass")){
			frame.ChangeView(new RoomManagementViewImpl());
			return;
		}else{
			System.out.println("Incorrect username or password");
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			
			frame.ChangeView(new EmployeeHomeViewImpl());
			return;
		}
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		//throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PresentationPackage.LOGIN_VIEW__AUTHORIZER:
				return basicSetAuthorizer(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PresentationPackage.LOGIN_VIEW__AUTHORIZER:
				return getAuthorizer();
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
			case PresentationPackage.LOGIN_VIEW__AUTHORIZER:
				setAuthorizer((Authorizer)newValue);
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
			case PresentationPackage.LOGIN_VIEW__AUTHORIZER:
				setAuthorizer((Authorizer)null);
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
			case PresentationPackage.LOGIN_VIEW__AUTHORIZER:
				return authorizer != null;
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
			case PresentationPackage.LOGIN_VIEW___RUN__FRAME:
				Run((Frame)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //LoginViewImpl
