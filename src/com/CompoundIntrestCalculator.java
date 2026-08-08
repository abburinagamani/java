package com;
import java.util.*;
public class CompoundIntrestCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double principal;
		double rate;
		int timesCompounded;
		int years;
		double amount;
		System.out.print("Enter the principal amount: ");
		principal=sc.nextDouble();
		
		System.out.print("Enter the rate of intrest: ");
		rate=sc.nextDouble()/100;
		
		System.out.print("Enter the times compounded: ");
		timesCompounded=sc.nextInt();
		
		System.out.print("Enter the no of years ");
		years=sc.nextInt();
		
		amount=principal*Math.pow(1+rate/timesCompounded,timesCompounded*years);
		System.out.printf("The amount after %d years is %.2f",years,amount);
		sc.close();

	}

}
