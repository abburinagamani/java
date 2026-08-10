package com;
import java.util.*;
public class ArrayInput {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of an array:");
		int n=sc.nextInt();
		sc.nextLine();
		String[] foods=new String[n];
		for(int i=0;i<foods.length;i++) {
			System.out.print("Enter a food: ");
			foods[i]=sc.nextLine();
		}
		for(String food:foods) {
			System.out.println(food);
		}
		
		
		sc.close();
	}

}
