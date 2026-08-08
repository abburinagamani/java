package com;
import java.util.Random;
public class RandomNumber {
	public static void main(String[] args) {
		Random rand=new Random();
		int number1;
		double number2;
		boolean isHeads;
		number1=rand.nextInt(1,7);
		number2=rand.nextDouble();
		isHeads=rand.nextBoolean();
		System.out.println(number1);
		System.out.println(number2);
		if(isHeads) {
			System.out.println("HEADS");
		}
		else {
			System.out.println("TAILS");
		}
		
	}

}
