package com;
class ThisCar{
	String make;
	String model;
	String color;
	int year;
	ThisCar(String make,String model,String color,int year){
		this.make=make;
		this.model=model;
		this.color=color;
		this.year=year;
	}
	@Override
	public String toString() {
		return this.color+" "+this.year+" "+this.model+" "+this.make;
	}
}

public class ToStringMethod {
	public static void main(String[] args) {
		ThisCar car=new ThisCar("Mustang","Ford","Red",2025);
		System.out.println(car);
		
	}

}
