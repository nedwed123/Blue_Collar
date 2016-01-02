/**
 */
package SoftwareModel.DomainEntities.impl;

import SoftwareModel.DomainEntities.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DomainEntitiesFactoryImpl extends EFactoryImpl implements DomainEntitiesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DomainEntitiesFactory init() {
		try {
			DomainEntitiesFactory theDomainEntitiesFactory = (DomainEntitiesFactory)EPackage.Registry.INSTANCE.getEFactory(DomainEntitiesPackage.eNS_URI);
			if (theDomainEntitiesFactory != null) {
				return theDomainEntitiesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DomainEntitiesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainEntitiesFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DomainEntitiesPackage.ROOM_TYPE: return createRoomType();
			case DomainEntitiesPackage.PAYMENT_DETAILS: return createPaymentDetails();
			case DomainEntitiesPackage.RESERVATION: return createReservation();
			case DomainEntitiesPackage.ROOM_BOOKING: return createRoomBooking();
			case DomainEntitiesPackage.ROOM_RESPONSIBLE: return createRoomResponsible();
			case DomainEntitiesPackage.ROOM: return createRoom();
			case DomainEntitiesPackage.CUSTOMER_CANCELATION_POLICY: return createCustomerCancelationPolicy();
			case DomainEntitiesPackage.BILL: return createBill();
			case DomainEntitiesPackage.SERVICE: return createService();
			case DomainEntitiesPackage.CANCELATION_POLICY: return createCancelationPolicy();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case DomainEntitiesPackage.BED_TYPE:
				return createBedTypeFromString(eDataType, initialValue);
			case DomainEntitiesPackage.AVAILABILITY:
				return createAvailabilityFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case DomainEntitiesPackage.BED_TYPE:
				return convertBedTypeToString(eDataType, instanceValue);
			case DomainEntitiesPackage.AVAILABILITY:
				return convertAvailabilityToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomType createRoomType() {
		RoomTypeImpl roomType = new RoomTypeImpl();
		return roomType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentDetails createPaymentDetails() {
		PaymentDetailsImpl paymentDetails = new PaymentDetailsImpl();
		return paymentDetails;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reservation createReservation() {
		ReservationImpl reservation = new ReservationImpl();
		return reservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomBooking createRoomBooking() {
		RoomBookingImpl roomBooking = new RoomBookingImpl();
		return roomBooking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomResponsible createRoomResponsible() {
		RoomResponsibleImpl roomResponsible = new RoomResponsibleImpl();
		return roomResponsible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bill createBill() {
		BillImpl bill = new BillImpl();
		return bill;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Room createRoom() {
		RoomImpl room = new RoomImpl();
		return room;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomerCancelationPolicy createCustomerCancelationPolicy() {
		CustomerCancelationPolicyImpl customerCancelationPolicy = new CustomerCancelationPolicyImpl();
		return customerCancelationPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service createService() {
		ServiceImpl service = new ServiceImpl();
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CancelationPolicy createCancelationPolicy() {
		CancelationPolicyImpl cancelationPolicy = new CancelationPolicyImpl();
		return cancelationPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BedType createBedTypeFromString(EDataType eDataType, String initialValue) {
		BedType result = BedType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBedTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Availability createAvailabilityFromString(EDataType eDataType, String initialValue) {
		Availability result = Availability.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAvailabilityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainEntitiesPackage getDomainEntitiesPackage() {
		return (DomainEntitiesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DomainEntitiesPackage getPackage() {
		return DomainEntitiesPackage.eINSTANCE;
	}

} //DomainEntitiesFactoryImpl
