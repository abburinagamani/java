package com;
import java.util.*;
public class UserInput {
 public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.print("Enter your name: ");
	 String str=sc.nextLine();
	 
	 System.out.print("Enter your age: ");
	 int age=sc.nextInt();
	 sc.nextLine();
	 
	 System.out.print("Enter your cgpa: ");
	 double cgpa=sc.nextDouble();
	 
	 System.out.print("Are you a student(true/false): ");
	 boolean isStudent=sc.nextBoolean();
	 System.out.println();
	 System.out.println("Your name is "+str);
	 System.out.println("you are "+age+" years old");
	 System.out.println("your cgpa is "+cgpa);
	 if(isStudent) {
		 System.out.println("You are enrolled as a student");
	 }
	 else {
		 System.out.println("You are not enrolled as a student");
	 }
	 
	 sc.close();
	 }
}




