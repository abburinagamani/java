package com;
import java.util.*;
public class RectangleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the width: ");
		double width=sc.nextDouble();
		
		System.out.print("Enter the Height: ");
		double height=sc.nextDouble();
		
		double area=width*height;
		System.out.print("The area of rectangle: "+area);
		sc.close();
		

	}

}
