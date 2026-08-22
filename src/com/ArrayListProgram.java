package com;
import java.util.*;
public class ArrayListProgram {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<String> foods=new ArrayList<>();
		System.out.print("Enter the # of foods: ");
		int numofFoods=sc.nextInt();
		sc.nextLine();
		for(int i=1;i<=numofFoods;i++) {
			System.out.print("Enter the #"+i+":");
			String food=sc.nextLine();
			foods.add(food);
		}
		System.out.println(foods);
		
		sc.close();
	}

}
