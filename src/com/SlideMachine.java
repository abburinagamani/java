package com;
import java.util.Scanner;
import java.util.Random;
public class SlideMachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int balance=100;
		int bet;
		int payout;
		String[] row;
		String playAgain;
		System.out.println("**********************");
		System.out.println("Welcome to java slots!");
		System.out.println("Symbols : 🍒 🍉 🍋 🫑 🔔");
		System.out.println("**********************");
		while(balance>0) {
			System.out.println("\nCurrent balance is: "+balance);
			System.out.print("Enter your bet amount:");
			bet=sc.nextInt();
			sc.nextLine();
			if(bet>balance) {
				System.out.println("INSUFFICIENT FUNDS");
				continue;
			}
			else if(bet<=0) {
				System.out.println("Balance cannot be negative!");
				continue;
			}
			else {
				balance-=bet;
				System.out.println("$"+balance);
			}
			System.out.println("Spinning");
			row=spinRow();
			printRow(row);
			
			payout=getPayout(row,bet);
			if(payout >0) {
				System.out.println("You won!"+payout);
				balance+=payout;
			}
			else {
				System.out.println("You lost!");
			}
			System.out.print("Do you want to play again(Y/N): ");
			playAgain=sc.nextLine().toUpperCase();
			if(!playAgain.equals("Y")) {
				break;
			}
			
		}
		
		System.out.println("Game over!");
		sc.close();

	}
	static String[] spinRow() {
		String[] symbols= {"🍒","🍉","🍋", "🫑","🔔"};
		String[] row=new String[3];
		Random rand=new Random();
		
		for(int i=0;i<3;i++) {
			row[i]=symbols[rand.nextInt(symbols.length)];
		}
	
		return row;
	}
	static void printRow(String[] row) {
		System.out.println("*******************");
		System.out.println(" "+String.join(" | ", row));
		System.out.println("*******************");
		
	}
	static int getPayout(String[] row,int bet) {
		if(row[0].equals(row[1]) && row[1].equals(row[2])) {
			return switch(row[0]) {
			case "🍒" -> bet*3;
			case "🍉" -> bet*4;
			case "🍋" -> bet*5;
			case "🫑" -> bet*10;
			case "🔔" -> bet*20;
			default ->0;
			};
		}
		else if(row[0].equals(row[1])) {
			return switch(row[0]) {
			case "🍒" -> bet*2;
			case "🍉" -> bet*3;
			case "🍋" -> bet*4;
			case "🫑" -> bet*5;
			case "🔔" -> bet*10;
			default ->0;
			};
		}
		else if(row[1].equals(row[2])) {
			return switch(row[1]) {
			case "🍒" -> bet*2;
			case "🍉" -> bet*3;
			case "🍋" -> bet*4;
			case "🫑" -> bet*5;
			case "🔔" -> bet*10;
			default ->0;
			};
		}
		return 0;
	}
	

}
