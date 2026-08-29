package com;
class ADog{
	void speak() {
		System.out.println("The dog says woof");
	}
}

public class Anonymous_classes {
	public static void main(String[] args) {
		ADog dog1=new ADog();
		ADog dog2=new ADog() {
			@Override
			void speak() {
				System.out.println("The scobby doo says ruh roh");
			}
			
		};
		dog1.speak();
		dog2.speak();
		
	}

}
