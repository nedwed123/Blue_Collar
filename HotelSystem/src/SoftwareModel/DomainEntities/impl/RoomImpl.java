/**
 */
package SoftwareModel.DomainEntities.impl;

import SoftwareModel.DomainEntities.Availability;
import SoftwareModel.DomainEntities.DomainEntitiesPackage;
import SoftwareModel.DomainEntities.Room;

import SoftwareModel.DomainEntities.RoomType;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Room</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link SoftwareModel.DomainEntities.impl.RoomImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link SoftwareModel.DomainEntities.impl.RoomImpl#getAvailability <em>Availability</em>}</li>
 *   <li>{@link SoftwareModel.DomainEntities.impl.RoomImpl#getView <em>View</em>}</li>
 *   <li>{@link SoftwareModel.DomainEntities.impl.RoomImpl#isSmoking <em>Smoking</em>}</li>
 *   <li>{@link SoftwareModel.DomainEntities.impl.RoomImpl#isPetsAllowed <em>Pets Allowed</em>}</li>
 *   <li>{@link SoftwareModel.DomainEntities.impl.RoomImpl#isDisabledAccess <em>Disabled Access</em>}</li>
 *   <li>{@link SoftwareModel.DomainEntities.impl.RoomImpl#getRoomtype <em>Roomtype</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoomImpl extends MinimalEObjectImpl.Container implements Room {
	/**
	 * The default value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected int number = NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getAvailability() <em>Availability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailability()
	 * @generated
	 * @ordered
	 */
	protected static final Availability AVAILABILITY_EDEFAULT = Availability.AVAILIBLE;

	/**
	 * The cached value of the '{@link #getAvailability() <em>Availability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailability()
	 * @generated
	 * @ordered
	 */
	protected Availability availability = AVAILABILITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getView() <em>View</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getView()
	 * @generated
	 * @ordered
	 */
	protected static final String VIEW_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getView() <em>View</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getView()
	 * @generated
	 * @ordered
	 */
	protected String view = VIEW_EDEFAULT;

	/**
	 * The default value of the '{@link #isSmoking() <em>Smoking</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSmoking()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SMOKING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSmoking() <em>Smoking</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSmoking()
	 * @generated
	 * @ordered
	 */
	protected boolean smoking = SMOKING_EDEFAULT;

	/**
	 * The default value of the '{@link #isPetsAllowed() <em>Pets Allowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPetsAllowed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PETS_ALLOWED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPetsAllowed() <em>Pets Allowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPetsAllowed()
	 * @generated
	 * @ordered
	 */
	protected boolean petsAllowed = PETS_ALLOWED_EDEFAULT;

	/**
	 * The default value of the '{@link #isDisabledAccess() <em>Disabled Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDisabledAccess()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DISABLED_ACCESS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDisabledAccess() <em>Disabled Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDisabledAccess()
	 * @generated
	 * @ordered
	 */
	protected boolean disabledAccess = DISABLED_ACCESS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRoomtype() <em>Roomtype</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomtype()
	 * @generated
	 * @ordered
	 */
	protected RoomType roomtype;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomainEntitiesPackage.Literals.ROOM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumber(int newNumber) {
		int oldNumber = number;
		number = newNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainEntitiesPackage.ROOM__NUMBER, oldNumber, number));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Availability getAvailability() {
		return availability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvailability(Availability newAvailability) {
		Availability oldAvailability = availability;
		availability = newAvailability == null ? AVAILABILITY_EDEFAULT : newAvailability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainEntitiesPackage.ROOM__AVAILABILITY, oldAvailability, availability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getView() {
		return view;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setView(String newView) {
		String oldView = view;
		view = newView;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainEntitiesPackage.ROOM__VIEW, oldView, view));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSmoking() {
		return smoking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSmoking(boolean newSmoking) {
		boolean oldSmoking = smoking;
		smoking = newSmoking;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainEntitiesPackage.ROOM__SMOKING, oldSmoking, smoking));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPetsAllowed() {
		return petsAllowed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPetsAllowed(boolean newPetsAllowed) {
		boolean oldPetsAllowed = petsAllowed;
		petsAllowed = newPetsAllowed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainEntitiesPackage.ROOM__PETS_ALLOWED, oldPetsAllowed, petsAllowed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDisabledAccess() {
		return disabledAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisabledAccess(boolean newDisabledAccess) {
		boolean oldDisabledAccess = disabledAccess;
		disabledAccess = newDisabledAccess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainEntitiesPackage.ROOM__DISABLED_ACCESS, oldDisabledAccess, disabledAccess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomType getRoomtype() {
		return roomtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoomtype(RoomType newRoomtype, NotificationChain msgs) {
		RoomType oldRoomtype = roomtype;
		roomtype = newRoomtype;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainEntitiesPackage.ROOM__ROOMTYPE, oldRoomtype, newRoomtype);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoomtype(RoomType newRoomtype) {
		if (newRoomtype != roomtype) {
			NotificationChain msgs = null;
			if (roomtype != null)
				msgs = ((InternalEObject)roomtype).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainEntitiesPackage.ROOM__ROOMTYPE, null, msgs);
			if (newRoomtype != null)
				msgs = ((InternalEObject)newRoomtype).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomainEntitiesPackage.ROOM__ROOMTYPE, null, msgs);
			msgs = basicSetRoomtype(newRoomtype, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainEntitiesPackage.ROOM__ROOMTYPE, newRoomtype, newRoomtype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DomainEntitiesPackage.ROOM__ROOMTYPE:
				return basicSetRoomtype(null, msgs);
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
			case DomainEntitiesPackage.ROOM__NUMBER:
				return getNumber();
			case DomainEntitiesPackage.ROOM__AVAILABILITY:
				return getAvailability();
			case DomainEntitiesPackage.ROOM__VIEW:
				return getView();
			case DomainEntitiesPackage.ROOM__SMOKING:
				return isSmoking();
			case DomainEntitiesPackage.ROOM__PETS_ALLOWED:
				return isPetsAllowed();
			case DomainEntitiesPackage.ROOM__DISABLED_ACCESS:
				return isDisabledAccess();
			case DomainEntitiesPackage.ROOM__ROOMTYPE:
				return getRoomtype();
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
			case DomainEntitiesPackage.ROOM__NUMBER:
				setNumber((Integer)newValue);
				return;
			case DomainEntitiesPackage.ROOM__AVAILABILITY:
				setAvailability((Availability)newValue);
				return;
			case DomainEntitiesPackage.ROOM__VIEW:
				setView((String)newValue);
				return;
			case DomainEntitiesPackage.ROOM__SMOKING:
				setSmoking((Boolean)newValue);
				return;
			case DomainEntitiesPackage.ROOM__PETS_ALLOWED:
				setPetsAllowed((Boolean)newValue);
				return;
			case DomainEntitiesPackage.ROOM__DISABLED_ACCESS:
				setDisabledAccess((Boolean)newValue);
				return;
			case DomainEntitiesPackage.ROOM__ROOMTYPE:
				setRoomtype((RoomType)newValue);
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
			case DomainEntitiesPackage.ROOM__NUMBER:
				setNumber(NUMBER_EDEFAULT);
				return;
			case DomainEntitiesPackage.ROOM__AVAILABILITY:
				setAvailability(AVAILABILITY_EDEFAULT);
				return;
			case DomainEntitiesPackage.ROOM__VIEW:
				setView(VIEW_EDEFAULT);
				return;
			case DomainEntitiesPackage.ROOM__SMOKING:
				setSmoking(SMOKING_EDEFAULT);
				return;
			case DomainEntitiesPackage.ROOM__PETS_ALLOWED:
				setPetsAllowed(PETS_ALLOWED_EDEFAULT);
				return;
			case DomainEntitiesPackage.ROOM__DISABLED_ACCESS:
				setDisabledAccess(DISABLED_ACCESS_EDEFAULT);
				return;
			case DomainEntitiesPackage.ROOM__ROOMTYPE:
				setRoomtype((RoomType)null);
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
			case DomainEntitiesPackage.ROOM__NUMBER:
				return number != NUMBER_EDEFAULT;
			case DomainEntitiesPackage.ROOM__AVAILABILITY:
				return availability != AVAILABILITY_EDEFAULT;
			case DomainEntitiesPackage.ROOM__VIEW:
				return VIEW_EDEFAULT == null ? view != null : !VIEW_EDEFAULT.equals(view);
			case DomainEntitiesPackage.ROOM__SMOKING:
				return smoking != SMOKING_EDEFAULT;
			case DomainEntitiesPackage.ROOM__PETS_ALLOWED:
				return petsAllowed != PETS_ALLOWED_EDEFAULT;
			case DomainEntitiesPackage.ROOM__DISABLED_ACCESS:
				return disabledAccess != DISABLED_ACCESS_EDEFAULT;
			case DomainEntitiesPackage.ROOM__ROOMTYPE:
				return roomtype != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (number: ");
		result.append(number);
		result.append(", availability: ");
		result.append(availability);
		result.append(", view: ");
		result.append(view);
		result.append(", smoking: ");
		result.append(smoking);
		result.append(", petsAllowed: ");
		result.append(petsAllowed);
		result.append(", disabledAccess: ");
		result.append(disabledAccess);
		result.append(')');
		return result.toString();
	}

} //RoomImpl
