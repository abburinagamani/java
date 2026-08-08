package com;

public class PrintfFormat {
	public static void main(String[] args) {
		String name="SpongeBob";
		char firstLetter='S';
		int age=22;
		double height=60.567;
		boolean isEmployed=true;
		System.out.printf("Hello %s\n",name);
		System.out.printf("Your name starts with %c\n",firstLetter);
		System.out.printf("You are %d years old\n",age );
		System.out.printf("Your height is %.2f \n",height);
		System.out.printf("Employed: %b\n",isEmployed);
		System.out.printf("%s is %d years old",name,age);
	}

}
