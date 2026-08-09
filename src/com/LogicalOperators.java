package com;
import java.util.*;
public class LogicalOperators {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String username;
		System.out.print("Enter the new username: ");
		username=sc.nextLine();
		
		if(username.length()<4 || username.length()>12) {
			System.out.println("The username must be between 4-12 characters");
		}
		else {
			System.out.println("Welcome "+username);
		}
		
		sc.close();
	}

}
