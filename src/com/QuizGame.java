package com;
import java.util.*;
public class QuizGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] questions= {"What is the main function of router?",
				             "which part of the computer is considered as brain?",
				             "What year was facebook launched?",
				             "who is known as father of computer?",
				             "what was the first program language?"};
		String[][] options= {{"1.Storing files","2. Encrypting data","3. Directing internet traffic","4. Managing passwords"},
				             {"1. CPU","2. Hard Drive","3. RAM","4. GPU"},
				             {"1. 2000","2. 2004","3. 2006","4. 2008"},
				             {"1. Steve jobs","2.Bill gates","3.Alan turing","4. Charles babage"},
				             {"1. COBOL","2. C","3. FORTAN","4. ASSEMBLY"}};
		int[] answers= {3,1,2,4,3};
		int score=0;
		int guess;
		Scanner sc=new Scanner(System.in);
		System.out.println("****************");
		System.out.println("Welcome to the java quiz game");
		System.out.println("****************");
		for(int i=0;i<questions.length;i++) {
			System.out.println(questions[i]);
			for(String option:options[i]) {
				System.out.println(option);
			}
			System.out.print("Enter your guess: ");
			guess=sc.nextInt();
			if(guess==answers[i]) {
				System.out.println("***********");
				System.out.println("CORRECT!");
				System.out.println("***********");
				score++;
				
			}
			else {
				System.out.println("***********");
				System.out.println("WRONG!");
				System.out.println("***********");
			}
			
		}
		System.out.println("Your final score is "+score+" out of"+questions.length);
		
        sc.close();
	}

}
