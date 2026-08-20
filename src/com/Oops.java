package com;


class Car{
	String make="Ford";
	String model="mustang";
	int year=2025;
	double price=58900.9;
	boolean isRunning=false;
	void start() {
		isRunning=true;
		System.out.println("You start the engine");
	}
	void stop() {
		isRunning=false;
		System.out.println("you stop the engine");
	}
	void drive() {
		System.out.println("You drive the "+model);
	}
	
}
public class Oops {
	public static void main(String[] args) {
		
		Car car=new Car();
		car.drive();
		
	}

}
