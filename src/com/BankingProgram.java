package com;
import java.util.*;
public class BankingProgram {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		
		double balance=3.88;
		boolean isRunning=true;
		int choice;
		while(isRunning) {
			System.out.println("*************");
			System.out.println("Banking program");
			System.out.println("*************");
			System.out.println("1. Show Balance");
			System.out.println("2. Deposit");
			System.out.println("3. Withdraw");
			System.out.println("4. Exit");
			System.out.println("*************");
			
			System.out.println("Enter your choice(1-4): ");
			choice=sc.nextInt();
			
			switch(choice) {
			case 1 ->showBalance(balance);
			case 2  ->balance+=depositing();
			case 3 ->balance-=withdrawl(balance);
			case 4 -> isRunning=false;
		    default ->System.out.println("Invalid choice!");
			}
		}
		System.out.println("Thank you have a nice day");
		
		
	
	}
	static void showBalance(double balance) {
		System.out.println("************");
		System.out.printf("%.2f\n",balance);
	}
	static double depositing() {
		double amount;
		System.out.print("Enter the amount you want to deposit:");
		amount=sc.nextDouble();
		if(amount<0) {
			System.out.println("Amount cant be negative");
			return 0;
		}
		else {
			return amount;
		}
		
	}
	static double withdrawl(double balance) {
		double amount;
		System.out.print("Enter the amount you want to withdraw: ");
		amount=sc.nextDouble();
		if(amount>balance) {
			System.out.println("insufficient balance");
			return 0;
			
		}
		else if(amount<0) {
			System.out.println("Amount can't be negative");
			return 0;
		}
		else {
			return amount;
		}
	}


}
