package com;

public class NestedIf {
	public static void main(String[] args) {
		boolean isStudent=true;
		boolean isSenior=true;
		double price=9.99;
		if(isStudent) {
			if(isSenior) {
				System.out.println("You get a discount of 30%");
				price*=0.7;
			}
			else {
				System.out.println("You get a 10% discount");
				price*=0.9;
			}
			
		}
		else {
			if(isSenior) {
				System.out.println("You get 20% discount");
				price*=0.8;
			}
			else {
				price*=1;
			}
		}
		System.out.println("The final price is "+price);
	}

}
