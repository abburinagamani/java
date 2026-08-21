package com;

public class WrapperClass {

	public static void main(String[] args) {
		//Auto boxing
		
		Integer a=123;
		Double b=3.12;
		Character c='B';
		Boolean d=true;
		
		//UnBoxing
		int x=a;
		double y=b;
		char z=c;
		boolean w=d;
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(w);
		
		String a1=Integer.toString(123);
		String b1=Double.toString(3.124);
		String c1=Character.toString('@');
		String d1=Boolean.toString(true);
		String x1=a1+b1+c1+d1;
		System.out.println(x1);
		
       System.out.println(Character.isLetter(c));
       System.out.println(Character.isUpperCase(c));
		

	}

}
