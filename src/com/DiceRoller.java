package com;
import java.util.Scanner;
import java.util.Random;
public class DiceRoller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Random rand=new Random();
		int numofDice;
		int total=0;
		
		System.out.println("Enter the no of dice to roll: ");
		numofDice=sc.nextInt();
		if(numofDice>0) {
			for(int i=0;i<numofDice;i++) {
				int roll=rand.nextInt(1,7);
				System.out.println("You rolled: "+roll);
				total+=roll;
			}
			System.out.println("Total: "+total);
		}
		else {
			System.out.println("number of rice must be greater than 0");
		}
		
		
		sc.close();

	}

}
