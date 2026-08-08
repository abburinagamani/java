package com;

public class StringMethods {
	public static void main(String[] args) {
		String name="Bro Code";
		String name1=" Python ";
		String name2="Amma";
		int length=name.length();
		char letter=name.charAt(2);
		int index=name.indexOf("o");
		int lastIndex=name.lastIndexOf("o");
		name=name.toLowerCase();
		name1=name1.trim();
		name2=name2.replace("m","n");
		if(name.contains(" ")) {
			System.out.println("your name contains spaces");
		}
		else {
			System.out.println("Your name does not contains any spaces");
		}
		System.out.println("The length of the string is: "+length);
		System.out.println("The letter at 2 index is: "+letter);
		System.out.println("The index of o letter is: "+index);
		System.out.println("The last index of o is: "+lastIndex);
		System.out.println("The lower case is:"+name);
		System.out.println("trimmed: "+name1);
		System.out.println("We replaced m as n to amma "+name2);
		if(name.equals("password")) {
			System.out.println("Your name cannot be password");
		}
		else {
			System.out.println("hello "+name);
		}
		
	}

}
