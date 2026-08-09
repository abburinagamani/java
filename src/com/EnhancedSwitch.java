package com;
import java.util.*;
public class EnhancedSwitch {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String day;
		System.out.print("Enter the day: ");
		day=sc.nextLine();
		switch(day) {
		case "Monday","Tuesday","Wednesday","Thursday","Friday" ->System.out.println("It is a week day");
		case "Saturday" ,"Sunday"->System.out.println("It is a weekend");
		
		default -> System.out.println(day + "is not a day");
		}
		sc.close();
	}

}
