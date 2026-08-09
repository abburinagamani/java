package com;
import java.util.*;
public class CalculatorProgram {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double num1;
		double num2;
		char Operator;
		double result=0;
		boolean isOperator=true;
		System.out.print("Enter the number1: ");
		num1=sc.nextDouble();
		
		System.out.print("Enter the operator: ");
		Operator=sc.next().charAt(0);
		
		System.out.print("Enter the number2: ");
		num2=sc.nextDouble();
		
		switch(Operator) {
		case '+' -> result=num1+num2;
		case '-' -> result=num1-num2;
		case '*' -> result=num1*num2;
		case '/' -> {
			if(num2==0) {
				System.out.println("Cannot divide by zero");
				isOperator=false;
			}
			else {
				result=num1/num2;
			}
		}
		case '%' -> result=num1%num2;
		case '^' ->result=Math.pow(num1,num2);
		default -> {
			System.out.println("Invalid operator");
			isOperator=false;
		}
		}
		if(isOperator) {
		System.out.println(result);
		}
		sc.close();
	}

}
