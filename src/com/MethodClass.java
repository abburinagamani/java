package com;

public class MethodClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Spongebob";
	 
		happyBirthday(name);
		double result=square(3);
		
		System.out.println(result);
		String fullname=getFullName("Spongebob","squarepants");
		System.out.println(fullname);
		int age=17;
		if(ageCheck(age)) {
			System.out.println("You may sign up!");
			
		}
		else {
			System.out.println("You may need 18+ to sign up!");
		}


	}
	static void happyBirthday(String name) {
		System.out.println("Happy birthday to u");
		System.out.printf("May god bless u %s\n",name);
		System.out.println("May god bless u dear");
		System.out.println("You are 22 years old");
	}
	static double square(double number) {
		return number*number;
	}
	static String getFullName(String first,String last) {
		return first+" "+last;
	}
	static boolean ageCheck(int age) {
		if(age>18) {
			return true;
		}
		else {
			return false;
		}
	}

}
