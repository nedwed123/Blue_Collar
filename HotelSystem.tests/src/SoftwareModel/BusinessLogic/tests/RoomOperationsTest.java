/**
 */
package SoftwareModel.BusinessLogic.tests;

import SoftwareModel.BusinessLogic.BusinessLogicFactory;
import SoftwareModel.BusinessLogic.RoomOperations;
import SoftwareModel.DataAccess.RoomRepository;
import SoftwareModel.DataAccess.impl.RoomRepositoryImpl;
import SoftwareModel.DomainEntities.Availability;
import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Room Operations</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link SoftwareModel.BusinessLogic.RoomOperations#modifyRate(int, double) <em>Modify Rate</em>}</li>
 *   <li>{@link SoftwareModel.BusinessLogic.RoomOperations#makeRoomAvailable(int) <em>Make Room Available</em>}</li>
 *   <li>{@link SoftwareModel.BusinessLogic.RoomOperations#addRoom(int, org.eclipse.emf.common.util.Enumerator) <em>Add Room</em>}</li>
 *   <li>{@link SoftwareModel.BusinessLogic.RoomOperations#removeRoom(int) <em>Remove Room</em>}</li>
 *   <li>{@link SoftwareModel.BusinessLogic.RoomOperations#makeRoomUnavailable(int) <em>Make Room Unavailable</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class RoomOperationsTest extends TestCase {

	/**
	 * The fixture for this Room Operations test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoomOperations fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RoomOperationsTest.class);
	}

	/**
	 * Constructs a new Room Operations test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomOperationsTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Room Operations test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(RoomOperations fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Room Operations test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoomOperations getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BusinessLogicFactory.eINSTANCE.createRoomOperations());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

	/**
	 * Tests the '{@link SoftwareModel.BusinessLogic.RoomOperations#modifyRate(int, double) <em>Modify Rate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SoftwareModel.BusinessLogic.RoomOperations#modifyRate(int, double)
	 * @generated
	 */
	public void testModifyRate__int_double() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link SoftwareModel.BusinessLogic.RoomOperations#makeRoomAvailable(int) <em>Make Room Available</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SoftwareModel.BusinessLogic.RoomOperations#makeRoomAvailable(int)
	 * @generated
	 */
	public void testMakeRoomAvailable__int() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link SoftwareModel.BusinessLogic.RoomOperations#addRoom(int, org.eclipse.emf.common.util.Enumerator) <em>Add Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SoftwareModel.BusinessLogic.RoomOperations#addRoom(int, org.eclipse.emf.common.util.Enumerator)
	 * @generated
	 */
	public void testAddRoom__int_Enumerator() {
		RoomRepository roomRepo = new RoomRepositoryImpl();
		fixture.setRoomrepository(roomRepo);
		fixture.addRoom(0, Availability.AVAILIBLE);
		//assertTrue(roomRepo.getRooms());
		//fail();
	}

	/**
	 * Tests the '{@link SoftwareModel.BusinessLogic.RoomOperations#removeRoom(int) <em>Remove Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SoftwareModel.BusinessLogic.RoomOperations#removeRoom(int)
	 * @generated
	 */
	public void testRemoveRoom__int() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link SoftwareModel.BusinessLogic.RoomOperations#makeRoomUnavailable(int) <em>Make Room Unavailable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SoftwareModel.BusinessLogic.RoomOperations#makeRoomUnavailable(int)
	 * @generated
	 */
	public void testMakeRoomUnavailable__int() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //RoomOperationsTest
