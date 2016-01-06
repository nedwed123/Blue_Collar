/**
 */
package cleanerClient;

import SoftwareModel.Presentation.Frame;
import SoftwareModel.Presentation.IView;
import SoftwareModel.Presentation.PresentationPackage;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import SoftwareModel.BusinessLogic.impl.RoomsImpl;
import SoftwareModel.DomainEntities.Room;
import SoftwareModel.BusinessLogic.impl.AvailibleRoomFinderImpl;

import java.lang.reflect.InvocationTargetException;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Customer Home View</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CleanerHomeViewImpl extends MinimalEObjectImpl.Container implements IView {
		
	protected AvailibleRoomFinderImpl availableRoomsFinder = new AvailibleRoomFinderImpl();
	
	public CleanerHomeViewImpl() {
		super();
		
	}


	@Override
	protected EClass eStaticClass() {
		return PresentationPackage.Literals.IVIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Welcomes cleaner, displays rooms to be cleaned and asks for input
	 * <!-- end-user-doc -->
	 */
	public void run(final Frame frame) {

		System.out.println("Welcome cleaner!\n---------------------");
		System.out.println("Dirteh Roomz:");
		for(Room room : availableRoomsFinder.getToBoCleanedRooms())
		{
			System.out.println("\n" + room.getNumber());
		}
		
		System.out.println();
		int roomNr;
		roomNr = frame.input("a room as cleaned, '0' for exit");
		if(roomNr == 0)
		{
			frame.exit();
		}
		else if(!availableRoomsFinder.setRoomAsCleaned(roomNr))
		{
			System.out.println("This room is either not Dirteh! or it does not exist, stupid.\n");
		}
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case PresentationPackage.FRAME__CURRENT_VIEW:
				run((Frame)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //CustomerHomeViewImpl
