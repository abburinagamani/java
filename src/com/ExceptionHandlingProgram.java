package com;
import java.util.*;
public class ExceptionHandlingProgram {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			System.out.print("Enter number (a): ");
			int a=sc.nextInt();
			sc.nextLine();
			System.out.print("Enter a number(b): ");
			int b=sc.nextInt();
			sc.nextLine();
			System.out.println(a/b);
		}
		catch(InputMismatchException e) {
			System.out.println("This was not a number");
		}
		catch(ArithmeticException e) {
			System.out.println("Cant divide with zero");
		}
		catch(Exception e) {
			System.out.println("Something went wrong");
		}
		finally {
			System.out.println("Finally block always executes");
		}
		sc.close();
		
	}

}
