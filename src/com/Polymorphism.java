package com;
abstract class Vehicle{
	void go() {
		
	}
}
class WCar extends Vehicle{
	@Override
	void go() {
		System.out.println("You drive the car");
	}
}
class Bike extends Vehicle{
	void go() {
		System.out.println("You ride the bike");
	}
}
class Boat extends Vehicle{
	void go() {
		System.out.println("You sail the boat");
	}
}

public class Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WCar car=new WCar();
		Bike bike=new Bike();
		Boat boat=new Boat();
		Vehicle[] vehicles= {car,bike,boat};
		for(Vehicle  vehicle:vehicles) {
			vehicle.go();
		}
	}

}
