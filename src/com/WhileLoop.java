package com;
import java.util.*;
public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String response="";
		while(!response.equals("Q")) {
			System.out.print("You are playing a game!");
			System.out.print("Press q to quit: ");
			response=sc.nextLine().toUpperCase();
		}
		System.out.println("You are out of the game");
		int age;
		System.out.print("Enter your age:");
		age=sc.nextInt();
		while(age<0) {
			System.out.println("your age cannot be negative");
			System.out.print("Enter your age");
			age=sc.nextInt();
		}
		System.out.println("Your age is "+age+ " years old");
		sc.close();

	}

}
