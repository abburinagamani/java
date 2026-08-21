package com;
abstract class Shape{
	abstract double area();//abstract
	void display() { //concrete
		System.out.println("This is a shape");
	}
	
}
class Circle extends Shape{
	double radius;
	Circle(double radius){
		this.radius=radius;
	}
	
	@Override
	double area() {
		return Math.PI*radius*radius;
	}
	
}
class Triangle extends Shape{
	double base;
	double height;
	Triangle(double base,double height){
		this.base=base;
		this.height=height;
	}
	@Override
	double area() {
		return 0.5*base*height;
	}
	
	
}
class Rectangle extends Shape{
	double length;
	double width;
	Rectangle(double length,double width){
		this.length=length;
		this.width=width;
	}
	@Override
	double area() {
		return length*width;
	}
	
	
}
public class AbstractionProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circle =new Circle(3.5);
		Triangle triangle=new Triangle(3.5,5.6);
		Rectangle rectangle=new Rectangle(4.5,3.1);
		
		System.out.println(circle.area());
		System.out.println(triangle.area());
		System.out.println(rectangle.area());
	}

}
