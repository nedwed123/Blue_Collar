package customerClient;

import SoftwareModel.Presentation.impl.CustomerHomeViewImpl;
import SoftwareModel.Presentation.impl.FrameImpl;;

public class Client {

	public static void main(String[] args) {
		FrameImpl frame = new FrameImpl();
		frame.start(new CustomerHomeViewImpl());
	}

}