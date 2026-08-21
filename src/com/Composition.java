package com;
class ComCar{
	String model;
	int year;
	Engine engine;
	ComCar(String model,int year,String engineType){
		this.model=model;
		this.year=year;
		this.engine=new Engine(engineType);
	}
	void start() {
		this.engine.start();
		System.out.println("You start the "+this.model+" car");
	}
}
class Engine{
	String type;
	Engine(String type){
		this.type=type;
	}
	public void start() {
		System.out.println("You start the "+this.type+" "+"engine");
	}
}
public class Composition {
	public static void main(String[] args) {
		ComCar comcar=new ComCar("corvet",1980,"v8");
		System.out.println(comcar.model);
		System.out.println(comcar.year);
		System.out.println(comcar.engine.type);
		comcar.start();
	}

}
