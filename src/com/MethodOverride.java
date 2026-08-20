package com;
class MySpieces{
	void move() {
		System.out.println("This animal is moving");
	}
}
class MyDog extends MySpieces{
	
}
class MyCat extends MySpieces{
	
}
class Fish extends MySpieces{
	@Override
	void move() {
		System.out.println("This animal is swimming");
	}
}
public class MethodOverride {
	public static void main(String[] args) {
		MyCat cat=new MyCat();
		MyDog dog=new MyDog();
		Fish fish=new Fish();
		fish.move();
		cat.move();
		dog.move();
		
	}

}
