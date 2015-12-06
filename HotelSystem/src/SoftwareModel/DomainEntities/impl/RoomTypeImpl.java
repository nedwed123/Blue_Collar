/**
 */
package SoftwareModel.DomainEntities.impl;

import SoftwareModel.DomainEntities.BedType;
import SoftwareModel.DomainEntities.DomainEntitiesPackage;
import SoftwareModel.DomainEntities.RoomType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Room Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link SoftwareModel.DomainEntities.impl.RoomTypeImpl#getSize <em>Size</em>}</li>
 *   <li>{@link SoftwareModel.DomainEntities.impl.RoomTypeImpl#getView <em>View</em>}</li>
 *   <li>{@link SoftwareModel.DomainEntities.impl.RoomTypeImpl#isDisableAccess <em>Disable Access</em>}</li>
 *   <li>{@link SoftwareModel.DomainEntities.impl.RoomTypeImpl#getRate <em>Rate</em>}</li>
 *   <li>{@link SoftwareModel.DomainEntities.impl.RoomTypeImpl#isSmoking <em>Smoking</em>}</li>
 *   <li>{@link SoftwareModel.DomainEntities.impl.RoomTypeImpl#isPetsAllowed <em>Pets Allowed</em>}</li>
 *   <li>{@link SoftwareModel.DomainEntities.impl.RoomTypeImpl#getRoomTypeId <em>Room Type Id</em>}</li>
 *   <li>{@link SoftwareModel.DomainEntities.impl.RoomTypeImpl#getBedtype <em>Bedtype</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoomTypeImpl extends MinimalEObjectImpl.Container implements RoomType {
	/**
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final double SIZE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected double size = SIZE_EDEFAULT;

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
	 * The default value of the '{@link #isDisableAccess() <em>Disable Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDisableAccess()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DISABLE_ACCESS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDisableAccess() <em>Disable Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDisableAccess()
	 * @generated
	 * @ordered
	 */
	protected boolean disableAccess = DISABLE_ACCESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getRate() <em>Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRate()
	 * @generated
	 * @ordered
	 */
	protected static final double RATE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRate() <em>Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRate()
	 * @generated
	 * @ordered
	 */
	protected double rate = RATE_EDEFAULT;

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
	 * The default value of the '{@link #getRoomTypeId() <em>Room Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final int ROOM_TYPE_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRoomTypeId() <em>Room Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomTypeId()
	 * @generated
	 * @ordered
	 */
	protected int roomTypeId = ROOM_TYPE_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBedtype() <em>Bedtype</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBedtype()
	 * @generated
	 * @ordered
	 */
	protected EList<BedType> bedtype;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomainEntitiesPackage.Literals.ROOM_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize(double newSize) {
		double oldSize = size;
		size = newSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainEntitiesPackage.ROOM_TYPE__SIZE, oldSize, size));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DomainEntitiesPackage.ROOM_TYPE__VIEW, oldView, view));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDisableAccess() {
		return disableAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisableAccess(boolean newDisableAccess) {
		boolean oldDisableAccess = disableAccess;
		disableAccess = newDisableAccess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainEntitiesPackage.ROOM_TYPE__DISABLE_ACCESS, oldDisableAccess, disableAccess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getRate() {
		return rate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRate(double newRate) {
		double oldRate = rate;
		rate = newRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainEntitiesPackage.ROOM_TYPE__RATE, oldRate, rate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DomainEntitiesPackage.ROOM_TYPE__SMOKING, oldSmoking, smoking));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DomainEntitiesPackage.ROOM_TYPE__PETS_ALLOWED, oldPetsAllowed, petsAllowed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRoomTypeId() {
		return roomTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoomTypeId(int newRoomTypeId) {
		int oldRoomTypeId = roomTypeId;
		roomTypeId = newRoomTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainEntitiesPackage.ROOM_TYPE__ROOM_TYPE_ID, oldRoomTypeId, roomTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BedType> getBedtype() {
		if (bedtype == null) {
			bedtype = new EDataTypeUniqueEList<BedType>(BedType.class, this, DomainEntitiesPackage.ROOM_TYPE__BEDTYPE);
		}
		return bedtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DomainEntitiesPackage.ROOM_TYPE__SIZE:
				return getSize();
			case DomainEntitiesPackage.ROOM_TYPE__VIEW:
				return getView();
			case DomainEntitiesPackage.ROOM_TYPE__DISABLE_ACCESS:
				return isDisableAccess();
			case DomainEntitiesPackage.ROOM_TYPE__RATE:
				return getRate();
			case DomainEntitiesPackage.ROOM_TYPE__SMOKING:
				return isSmoking();
			case DomainEntitiesPackage.ROOM_TYPE__PETS_ALLOWED:
				return isPetsAllowed();
			case DomainEntitiesPackage.ROOM_TYPE__ROOM_TYPE_ID:
				return getRoomTypeId();
			case DomainEntitiesPackage.ROOM_TYPE__BEDTYPE:
				return getBedtype();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DomainEntitiesPackage.ROOM_TYPE__SIZE:
				setSize((Double)newValue);
				return;
			case DomainEntitiesPackage.ROOM_TYPE__VIEW:
				setView((String)newValue);
				return;
			case DomainEntitiesPackage.ROOM_TYPE__DISABLE_ACCESS:
				setDisableAccess((Boolean)newValue);
				return;
			case DomainEntitiesPackage.ROOM_TYPE__RATE:
				setRate((Double)newValue);
				return;
			case DomainEntitiesPackage.ROOM_TYPE__SMOKING:
				setSmoking((Boolean)newValue);
				return;
			case DomainEntitiesPackage.ROOM_TYPE__PETS_ALLOWED:
				setPetsAllowed((Boolean)newValue);
				return;
			case DomainEntitiesPackage.ROOM_TYPE__ROOM_TYPE_ID:
				setRoomTypeId((Integer)newValue);
				return;
			case DomainEntitiesPackage.ROOM_TYPE__BEDTYPE:
				getBedtype().clear();
				getBedtype().addAll((Collection<? extends BedType>)newValue);
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
			case DomainEntitiesPackage.ROOM_TYPE__SIZE:
				setSize(SIZE_EDEFAULT);
				return;
			case DomainEntitiesPackage.ROOM_TYPE__VIEW:
				setView(VIEW_EDEFAULT);
				return;
			case DomainEntitiesPackage.ROOM_TYPE__DISABLE_ACCESS:
				setDisableAccess(DISABLE_ACCESS_EDEFAULT);
				return;
			case DomainEntitiesPackage.ROOM_TYPE__RATE:
				setRate(RATE_EDEFAULT);
				return;
			case DomainEntitiesPackage.ROOM_TYPE__SMOKING:
				setSmoking(SMOKING_EDEFAULT);
				return;
			case DomainEntitiesPackage.ROOM_TYPE__PETS_ALLOWED:
				setPetsAllowed(PETS_ALLOWED_EDEFAULT);
				return;
			case DomainEntitiesPackage.ROOM_TYPE__ROOM_TYPE_ID:
				setRoomTypeId(ROOM_TYPE_ID_EDEFAULT);
				return;
			case DomainEntitiesPackage.ROOM_TYPE__BEDTYPE:
				getBedtype().clear();
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
			case DomainEntitiesPackage.ROOM_TYPE__SIZE:
				return size != SIZE_EDEFAULT;
			case DomainEntitiesPackage.ROOM_TYPE__VIEW:
				return VIEW_EDEFAULT == null ? view != null : !VIEW_EDEFAULT.equals(view);
			case DomainEntitiesPackage.ROOM_TYPE__DISABLE_ACCESS:
				return disableAccess != DISABLE_ACCESS_EDEFAULT;
			case DomainEntitiesPackage.ROOM_TYPE__RATE:
				return rate != RATE_EDEFAULT;
			case DomainEntitiesPackage.ROOM_TYPE__SMOKING:
				return smoking != SMOKING_EDEFAULT;
			case DomainEntitiesPackage.ROOM_TYPE__PETS_ALLOWED:
				return petsAllowed != PETS_ALLOWED_EDEFAULT;
			case DomainEntitiesPackage.ROOM_TYPE__ROOM_TYPE_ID:
				return roomTypeId != ROOM_TYPE_ID_EDEFAULT;
			case DomainEntitiesPackage.ROOM_TYPE__BEDTYPE:
				return bedtype != null && !bedtype.isEmpty();
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
		result.append(" (size: ");
		result.append(size);
		result.append(", view: ");
		result.append(view);
		result.append(", disableAccess: ");
		result.append(disableAccess);
		result.append(", rate: ");
		result.append(rate);
		result.append(", smoking: ");
		result.append(smoking);
		result.append(", petsAllowed: ");
		result.append(petsAllowed);
		result.append(", roomTypeId: ");
		result.append(roomTypeId);
		result.append(", bedtype: ");
		result.append(bedtype);
		result.append(')');
		return result.toString();
	}

} //RoomTypeImpl
