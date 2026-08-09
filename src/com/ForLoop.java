package com;
import java.util.*;
public class ForLoop {
	public static void main(String[] args) throws InterruptedException {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the countdown from: ");
		int start=sc.nextInt();
		for(int i=start;i>0;i--) {
			System.out.println(i);
			Thread.sleep(1000);
		}
		System.out.println("Happy birthday!");
		sc.close();
	}

}
