/**
 */
package SoftwareModel.DomainEntities.impl;

import SoftwareModel.DomainEntities.BedType;
import SoftwareModel.DomainEntities.DomainEntitiesPackage;
import SoftwareModel.DomainEntities.RoomType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
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
 *   <li>{@link SoftwareModel.DomainEntities.impl.RoomTypeImpl#getRate <em>Rate</em>}</li>
 *   <li>{@link SoftwareModel.DomainEntities.impl.RoomTypeImpl#getBedtype <em>Bedtype</em>}</li>
 *   <li>{@link SoftwareModel.DomainEntities.impl.RoomTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link SoftwareModel.DomainEntities.impl.RoomTypeImpl#getBeds <em>Beds</em>}</li>
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
	 * The cached value of the '{@link #getBedtype() <em>Bedtype</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBedtype()
	 * @generated
	 * @ordered
	 */
	protected EList<BedType> bedtype;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBeds() <em>Beds</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeds()
	 * @generated
	 * @ordered
	 */
	protected EList<BedType> beds;

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
	 */
	public RoomTypeImpl(String name, EList<BedType> beds, Double rate, Double size) {
		super();
		this.name = name;
		this.beds = beds;
		this.rate = rate;
		this.size = size;
		bedtype = beds;

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
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainEntitiesPackage.ROOM_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BedType> getBeds() {
		if (beds == null) {
			beds = new EDataTypeUniqueEList<BedType>(BedType.class, this, DomainEntitiesPackage.ROOM_TYPE__BEDS);
		}
		return beds;
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
			case DomainEntitiesPackage.ROOM_TYPE__RATE:
				return getRate();
			case DomainEntitiesPackage.ROOM_TYPE__BEDTYPE:
				return getBedtype();
			case DomainEntitiesPackage.ROOM_TYPE__NAME:
				return getName();
			case DomainEntitiesPackage.ROOM_TYPE__BEDS:
				return getBeds();
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
			case DomainEntitiesPackage.ROOM_TYPE__RATE:
				setRate((Double)newValue);
				return;
			case DomainEntitiesPackage.ROOM_TYPE__BEDTYPE:
				getBedtype().clear();
				getBedtype().addAll((Collection<? extends BedType>)newValue);
				return;
			case DomainEntitiesPackage.ROOM_TYPE__NAME:
				setName((String)newValue);
				return;
			case DomainEntitiesPackage.ROOM_TYPE__BEDS:
				getBeds().clear();
				getBeds().addAll((Collection<? extends BedType>)newValue);
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
			case DomainEntitiesPackage.ROOM_TYPE__RATE:
				setRate(RATE_EDEFAULT);
				return;
			case DomainEntitiesPackage.ROOM_TYPE__BEDTYPE:
				getBedtype().clear();
				return;
			case DomainEntitiesPackage.ROOM_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DomainEntitiesPackage.ROOM_TYPE__BEDS:
				getBeds().clear();
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
			case DomainEntitiesPackage.ROOM_TYPE__RATE:
				return rate != RATE_EDEFAULT;
			case DomainEntitiesPackage.ROOM_TYPE__BEDTYPE:
				return bedtype != null && !bedtype.isEmpty();
			case DomainEntitiesPackage.ROOM_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DomainEntitiesPackage.ROOM_TYPE__BEDS:
				return beds != null && !beds.isEmpty();
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

		StringBuffer result = new StringBuffer();
		result.append(" (size: ");
		result.append(size);
		result.append(", rate: ");
		result.append(rate);
		result.append(", bedtype: ");
		result.append(bedtype);
		result.append(", name: ");
		result.append(name);
		result.append(", beds: ");
		result.append(beds);
		result.append(')');
		return result.toString();
	}

} //RoomTypeImpl
