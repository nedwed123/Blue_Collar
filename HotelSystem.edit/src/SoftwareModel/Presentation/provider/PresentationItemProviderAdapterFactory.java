/**
 */
package SoftwareModel.Presentation.provider;

import SoftwareModel.Presentation.util.PresentationAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PresentationItemProviderAdapterFactory extends PresentationAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PresentationItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link SoftwareModel.Presentation.CustomerHomeView} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomerHomeViewItemProvider customerHomeViewItemProvider;

	/**
	 * This creates an adapter for a {@link SoftwareModel.Presentation.CustomerHomeView}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCustomerHomeViewAdapter() {
		if (customerHomeViewItemProvider == null) {
			customerHomeViewItemProvider = new CustomerHomeViewItemProvider(this);
		}

		return customerHomeViewItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link SoftwareModel.Presentation.Frame} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FrameItemProvider frameItemProvider;

	/**
	 * This creates an adapter for a {@link SoftwareModel.Presentation.Frame}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFrameAdapter() {
		if (frameItemProvider == null) {
			frameItemProvider = new FrameItemProvider(this);
		}

		return frameItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link SoftwareModel.Presentation.RoomBookingView} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoomBookingViewItemProvider roomBookingViewItemProvider;

	/**
	 * This creates an adapter for a {@link SoftwareModel.Presentation.RoomBookingView}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRoomBookingViewAdapter() {
		if (roomBookingViewItemProvider == null) {
			roomBookingViewItemProvider = new RoomBookingViewItemProvider(this);
		}

		return roomBookingViewItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link SoftwareModel.Presentation.ReservationView} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReservationViewItemProvider reservationViewItemProvider;

	/**
	 * This creates an adapter for a {@link SoftwareModel.Presentation.ReservationView}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createReservationViewAdapter() {
		if (reservationViewItemProvider == null) {
			reservationViewItemProvider = new ReservationViewItemProvider(this);
		}

		return reservationViewItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link SoftwareModel.Presentation.RoomManagementView} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoomManagementViewItemProvider roomManagementViewItemProvider;

	/**
	 * This creates an adapter for a {@link SoftwareModel.Presentation.RoomManagementView}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRoomManagementViewAdapter() {
		if (roomManagementViewItemProvider == null) {
			roomManagementViewItemProvider = new RoomManagementViewItemProvider(this);
		}

		return roomManagementViewItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link SoftwareModel.Presentation.LoginView} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoginViewItemProvider loginViewItemProvider;

	/**
	 * This creates an adapter for a {@link SoftwareModel.Presentation.LoginView}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLoginViewAdapter() {
		if (loginViewItemProvider == null) {
			loginViewItemProvider = new LoginViewItemProvider(this);
		}

		return loginViewItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link SoftwareModel.Presentation.EmployeeHomeView} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmployeeHomeViewItemProvider employeeHomeViewItemProvider;

	/**
	 * This creates an adapter for a {@link SoftwareModel.Presentation.EmployeeHomeView}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEmployeeHomeViewAdapter() {
		if (employeeHomeViewItemProvider == null) {
			employeeHomeViewItemProvider = new EmployeeHomeViewItemProvider(this);
		}

		return employeeHomeViewItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link SoftwareModel.Presentation.MakeReservationView} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MakeReservationViewItemProvider makeReservationViewItemProvider;

	/**
	 * This creates an adapter for a {@link SoftwareModel.Presentation.MakeReservationView}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMakeReservationViewAdapter() {
		if (makeReservationViewItemProvider == null) {
			makeReservationViewItemProvider = new MakeReservationViewItemProvider(this);
		}

		return makeReservationViewItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (customerHomeViewItemProvider != null) customerHomeViewItemProvider.dispose();
		if (frameItemProvider != null) frameItemProvider.dispose();
		if (roomBookingViewItemProvider != null) roomBookingViewItemProvider.dispose();
		if (reservationViewItemProvider != null) reservationViewItemProvider.dispose();
		if (roomManagementViewItemProvider != null) roomManagementViewItemProvider.dispose();
		if (loginViewItemProvider != null) loginViewItemProvider.dispose();
		if (employeeHomeViewItemProvider != null) employeeHomeViewItemProvider.dispose();
		if (makeReservationViewItemProvider != null) makeReservationViewItemProvider.dispose();
	}

}
