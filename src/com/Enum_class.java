package com;
import java.util.Scanner;
enum Day{
	SUNDAY(1),MONDAY(2),TUESDAY(3),WEDNESDAY(4),THURSDAY(5),FRIDAY(6),SATURDAY(7);
	private final int dayNumber;
	Day(int dayNumber){
		this.dayNumber=dayNumber;
		
	}
	public int getDayNumber() {
		return this.dayNumber;
	}
}

public class Enum_class {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the day: ");
		String response=sc.nextLine().toUpperCase();
		try{
			Day day=Day.valueOf(response);
			switch(day) {
			case MONDAY,
			     TUESDAY,
			     WEDNESDAY,
			     THURSDAY,
			     FRIDAY ->System.out.println("It is the week day");
			  
			case SATURDAY,SUNDAY ->System.out.println("It is the weekend");
			}
		}
		catch(IllegalArgumentException e) {
			System.out.println("please enter valid day");
		}
		sc.close();
	}

}
