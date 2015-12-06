/**
 */
package SoftwareModel.Presentation.impl;

import SoftwareModel.Presentation.Frame;
import SoftwareModel.Presentation.IView;
import SoftwareModel.Presentation.PresentationPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

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
	 * Runs the inputed view
	 * <!-- end-user-doc -->
	 */
	public void ChangeView(IView view) {
		setCurrentView(view);
	}

	/**
	 * <!-- begin-user-doc -->
	 * Runs the inputed view
	 * <!-- end-user-doc -->
	 */
	public void Start(IView View) {
		setCurrentView(View);
		while(currentView != null)
		{
			currentView.Run(this);
		}
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
				ChangeView((IView)arguments.get(0));
				return null;
			case PresentationPackage.FRAME___START__IVIEW:
				Start((IView)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //FrameImpl
