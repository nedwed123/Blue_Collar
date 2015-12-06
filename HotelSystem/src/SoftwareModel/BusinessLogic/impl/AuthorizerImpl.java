/**
 */
package SoftwareModel.BusinessLogic.impl;

import SoftwareModel.BusinessLogic.Authorizer;
import SoftwareModel.BusinessLogic.BusinessLogicPackage;

import SoftwareModel.DataAccess.AuthorizationRepository;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Authorizer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link SoftwareModel.BusinessLogic.impl.AuthorizerImpl#getManagerrepository <em>Managerrepository</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AuthorizerImpl extends MinimalEObjectImpl.Container implements Authorizer {
	/**
	 * The cached value of the '{@link #getManagerrepository() <em>Managerrepository</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManagerrepository()
	 * @generated
	 * @ordered
	 */
	protected AuthorizationRepository managerrepository;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthorizerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BusinessLogicPackage.Literals.AUTHORIZER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthorizationRepository getManagerrepository() {
		return managerrepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetManagerrepository(AuthorizationRepository newManagerrepository, NotificationChain msgs) {
		AuthorizationRepository oldManagerrepository = managerrepository;
		managerrepository = newManagerrepository;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BusinessLogicPackage.AUTHORIZER__MANAGERREPOSITORY, oldManagerrepository, newManagerrepository);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setManagerrepository(AuthorizationRepository newManagerrepository) {
		if (newManagerrepository != managerrepository) {
			NotificationChain msgs = null;
			if (managerrepository != null)
				msgs = ((InternalEObject)managerrepository).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BusinessLogicPackage.AUTHORIZER__MANAGERREPOSITORY, null, msgs);
			if (newManagerrepository != null)
				msgs = ((InternalEObject)newManagerrepository).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BusinessLogicPackage.AUTHORIZER__MANAGERREPOSITORY, null, msgs);
			msgs = basicSetManagerrepository(newManagerrepository, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BusinessLogicPackage.AUTHORIZER__MANAGERREPOSITORY, newManagerrepository, newManagerrepository));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean Authorize(String password) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BusinessLogicPackage.AUTHORIZER__MANAGERREPOSITORY:
				return basicSetManagerrepository(null, msgs);
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
			case BusinessLogicPackage.AUTHORIZER__MANAGERREPOSITORY:
				return getManagerrepository();
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
			case BusinessLogicPackage.AUTHORIZER__MANAGERREPOSITORY:
				setManagerrepository((AuthorizationRepository)newValue);
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
			case BusinessLogicPackage.AUTHORIZER__MANAGERREPOSITORY:
				setManagerrepository((AuthorizationRepository)null);
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
			case BusinessLogicPackage.AUTHORIZER__MANAGERREPOSITORY:
				return managerrepository != null;
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
			case BusinessLogicPackage.AUTHORIZER___AUTHORIZE__STRING:
				return Authorize((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //AuthorizerImpl
