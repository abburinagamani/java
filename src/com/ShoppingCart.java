package com;
import java.util.*;
public class ShoppingCart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String item;
		double price;
		int quantity;
		char currency='$';
		double total;
		System.out.print("Enter the item you want to buy: ");
		item=sc.nextLine();
		
		System.out.print("Enter the price of each item:");
		price=sc.nextDouble();
		 
		System.out.print("Enter the quantity: ");
		quantity=sc.nextInt();
		
		total=price*quantity;
		System.out.println("The item is: "+item);
		System.out.println("your total is "+currency+total);
		
		
		
		sc.close();

	}

}
