package employeeClient;

import SoftwareModel.Presentation.impl.EmployeeHomeViewImpl;
import SoftwareModel.Presentation.impl.FrameImpl;

public class Client {

	public static void main(String[] args) {
		FrameImpl frame = new FrameImpl();
		frame.start(new EmployeeHomeViewImpl());
	}


}
