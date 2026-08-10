package com;

public class OverloadMethods {
	public static void main(String[] args) {
		System.out.println(add(7.1,8.2,9.3));
		System.out.println(add(1.1,2.2));
		
		String pizza=makePizza("flat bread","mozrilla");
		System.out.println(pizza);
		
	}
	static double add(double a,double b) {
		return a+b;
	}
	static double add(double a,double b,double c) {
		return a+b+c;
	}
	static String makePizza(String bread) {
		return bread+"pizza";
	}
	static String makePizza(String bread,String cheese) {
		return cheese+" "+bread+"pizza";
	}
	
	


}
