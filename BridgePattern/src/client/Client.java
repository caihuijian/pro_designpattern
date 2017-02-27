package client;

import people.Men;
import people.Women;
import road.AbstractRoad;
import road.SpeedWay;
import road.Street;
import car.Bus;
import car.Car;
public class Client {
	public static void main(String[] args) {

		AbstractRoad speedWay = new SpeedWay();
		speedWay.aCar = new Car();
		speedWay.aPeople = new Women();
		speedWay.run();

		AbstractRoad street = new Street();
		street.aCar = new Bus();
		street.aPeople = new Men();
		street.run();
	}

}
