package com;
import java.util.*;
public class CirArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double radius;
		double circumference;
		double area;
		double volume;
		
		System.out.print("Enter the radius: ");
		radius=sc.nextDouble();
		
		circumference=2*Math.PI*radius;
		System.out.printf("Circumference of circle is:%.1fcm\n",circumference);
		
		area=Math.PI*Math.pow(radius,2);
		System.out.printf("The area of circle is:%.1f\n",area);
		
		volume=(4.0/3.0)*Math.PI*Math.pow(radius,3);
		System.out.printf("The volume of circles is %.1fcm^3\n",volume);
		sc.close();

	}

}
