package com;
import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Random rand=new Random();
		String[] choices= {"rock","paper","scissors"};
		String playerChoice;
		String computerChoice;
		String playAgain="yes";
		do {
			System.out.print("Enter the choice(rock,paper,scissors): ");
			playerChoice=sc.nextLine().toLowerCase();
			if(!playerChoice.equals("rock") &&
			   !playerChoice.equals("paper") &&
			   !playerChoice.equals("scissors")
			   ) {
				System.out.println("Invalid choice!");
				continue;

			}
			computerChoice=choices[rand.nextInt(3)];
			System.out.println("computer choice is: "+computerChoice);
			
			if(playerChoice.equals(computerChoice)) {
				System.out.println("You are a tie");
			}
			else if((playerChoice.equals("rock")&& computerChoice.equals("scissors")) ||
			(playerChoice.equals("paper")&& computerChoice.equals("rock")) ||
			(playerChoice.equals("scissors")&& computerChoice.equals("paper"))){
				System.out.println("You win");
			}
			
			else {
				System.out.println("You lose");
			}
			System.out.print("play again(yes/no): ");
			playAgain=sc.nextLine().toLowerCase();
		}while(playAgain.equals("yes"));
		System.out.println("Thanks for playing!");
		sc.close();
	}

}
