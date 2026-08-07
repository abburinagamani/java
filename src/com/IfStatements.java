package com;
import java.util.*;
public class IfStatements {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name;
		int age;
		boolean isStudent;
		System.out.print("Enter your name:");
		name=sc.nextLine();
		System.out.print("Enter your age: ");
		age=sc.nextInt();
		System.out.print("Are you a student(true/false)");
		isStudent=sc.nextBoolean();
		
		 //group1
		if(name.isEmpty()) {
			System.out.println("You did not enter name");
		}
		else {
			System.out.println("Hello "+name+"!");
		}
		
		//group2
		if(age>68) {
			System.out.println("You are a senior!");
		}
		else if(age>18) {
			System.out.println("You are an adult");
		}
		else if(age<0){
			System.out.println("you are not born yet");
			
		}
		else if(age==0) {
			System.out.println("You are just born");
		}
		else {
			System.out.println("You are a child");
		}
		
		//group3
		if(isStudent) {
			System.out.println("You are a student");
		}
		else {
			System.out.println("You are not a student");
		}
		sc.close();
	}

}
