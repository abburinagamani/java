package com;
import java.util.*;
public class TemperatureConverter {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double temp;
		double newTemp;
		String unit;
		System.out.print("Enter the temperature: ");
		temp=sc.nextDouble();
		
		System.out.println("Enter the units: ");
		unit=sc.next().toUpperCase();
		
		newTemp=(unit.equals("C"))?(temp-32)*5/9:(temp*5/9)+32;
		System.out.println(newTemp+" o"+unit);
		
		sc.close();
	}

}
