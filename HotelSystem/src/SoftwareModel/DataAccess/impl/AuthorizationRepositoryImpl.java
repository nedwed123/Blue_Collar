/**
 */
package SoftwareModel.DataAccess.impl;

import SoftwareModel.DataAccess.AuthorizationRepository;
import SoftwareModel.DataAccess.DataAccessPackage;
import SoftwareModel.DataAccess.DatabaseContext;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Authorization Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link SoftwareModel.DataAccess.impl.AuthorizationRepositoryImpl#getDatabasecontext <em>Databasecontext</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AuthorizationRepositoryImpl extends MinimalEObjectImpl.Container implements AuthorizationRepository {
	/**
	 * The cached value of the '{@link #getDatabasecontext() <em>Databasecontext</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabasecontext()
	 * @generated
	 * @ordered
	 */
	protected DatabaseContext databasecontext;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthorizationRepositoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataAccessPackage.Literals.AUTHORIZATION_REPOSITORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabaseContext getDatabasecontext() {
		if (databasecontext != null && databasecontext.eIsProxy()) {
			InternalEObject oldDatabasecontext = (InternalEObject)databasecontext;
			databasecontext = (DatabaseContext)eResolveProxy(oldDatabasecontext);
			if (databasecontext != oldDatabasecontext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataAccessPackage.AUTHORIZATION_REPOSITORY__DATABASECONTEXT, oldDatabasecontext, databasecontext));
			}
		}
		return databasecontext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabaseContext basicGetDatabasecontext() {
		return databasecontext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatabasecontext(DatabaseContext newDatabasecontext) {
		DatabaseContext oldDatabasecontext = databasecontext;
		databasecontext = newDatabasecontext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataAccessPackage.AUTHORIZATION_REPOSITORY__DATABASECONTEXT, oldDatabasecontext, databasecontext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPasswords() {
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataAccessPackage.AUTHORIZATION_REPOSITORY__DATABASECONTEXT:
				if (resolve) return getDatabasecontext();
				return basicGetDatabasecontext();
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
			case DataAccessPackage.AUTHORIZATION_REPOSITORY__DATABASECONTEXT:
				setDatabasecontext((DatabaseContext)newValue);
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
			case DataAccessPackage.AUTHORIZATION_REPOSITORY__DATABASECONTEXT:
				setDatabasecontext((DatabaseContext)null);
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
			case DataAccessPackage.AUTHORIZATION_REPOSITORY__DATABASECONTEXT:
				return databasecontext != null;
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
			case DataAccessPackage.AUTHORIZATION_REPOSITORY___GET_PASSWORDS:
				return getPasswords();
		}
		return super.eInvoke(operationID, arguments);
	}

} //AuthorizationRepositoryImpl
