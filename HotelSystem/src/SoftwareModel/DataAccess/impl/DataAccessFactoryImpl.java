/**
 */
package SoftwareModel.DataAccess.impl;

import SoftwareModel.DataAccess.*;

import org.eclipse.emf.ecore.EClass;
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
public class DataAccessFactoryImpl extends EFactoryImpl implements DataAccessFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DataAccessFactory init() {
		try {
			DataAccessFactory theDataAccessFactory = (DataAccessFactory)EPackage.Registry.INSTANCE.getEFactory(DataAccessPackage.eNS_URI);
			if (theDataAccessFactory != null) {
				return theDataAccessFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DataAccessFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataAccessFactoryImpl() {
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
			case DataAccessPackage.RESERVATIONS_REPOSITORY: return createReservationsRepository();
			case DataAccessPackage.DATABASE_CONTEXT: return createDatabaseContext();
			case DataAccessPackage.ROOM_BOOKINGS_REPOSITORY: return createRoomBookingsRepository();
			case DataAccessPackage.AUTHORIZATION_REPOSITORY: return createAuthorizationRepository();
			case DataAccessPackage.ROOM_REPOSITORY: return createRoomRepository();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReservationsRepository createReservationsRepository() {
		ReservationsRepositoryImpl reservationsRepository = new ReservationsRepositoryImpl();
		return reservationsRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabaseContext createDatabaseContext() {
		DatabaseContextImpl databaseContext = new DatabaseContextImpl();
		return databaseContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomBookingsRepository createRoomBookingsRepository() {
		RoomBookingsRepositoryImpl roomBookingsRepository = new RoomBookingsRepositoryImpl();
		return roomBookingsRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthorizationRepository createAuthorizationRepository() {
		AuthorizationRepositoryImpl authorizationRepository = new AuthorizationRepositoryImpl();
		return authorizationRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomRepository createRoomRepository() {
		RoomRepositoryImpl roomRepository = new RoomRepositoryImpl();
		return roomRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataAccessPackage getDataAccessPackage() {
		return (DataAccessPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DataAccessPackage getPackage() {
		return DataAccessPackage.eINSTANCE;
	}

} //DataAccessFactoryImpl
