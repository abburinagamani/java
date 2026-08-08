package com;
import java.util.*;
public class HypotenuseTriangle {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double a;
		double b;
		double c;
		System.out.print("Enter the value of A: ");
		a=sc.nextDouble();
		
		System.out.print("Enter the value of B: ");
		b=sc.nextDouble();
		
		c=Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2));
		System.out.println("The hypotenuse of the triangle is: "+c+"cm");
		
		sc.close();
	}

}
