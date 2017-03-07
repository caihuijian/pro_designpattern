package client;

import media.Media;
import activities.Activity1;
import activities.Activity2;
import activities.Activity3;

public class Client {
	public static void main(String[] args) {
		Activity1 a1 = new Activity1();
		Activity2 a2 = new Activity2();
		Activity3 a3 = new Activity3();
		a1.Listen();
//		a2.Listen();
		a3.Listen();
		Media.getInstance().play();
	}
}
