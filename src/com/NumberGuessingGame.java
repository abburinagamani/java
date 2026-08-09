package com;

import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int guess;
        int attempts = 0;

        int randomNumber = rand.nextInt(1, 11);

        System.out.println("Number guessing game");

        do {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            attempts++;

            if (guess < randomNumber) {
                System.out.println("The number is too low. Try again.");
            }
            else if (guess > randomNumber) {
                System.out.println("The number is too high. Try again.");
            }
            else {
                System.out.println("The number is correct!");
                System.out.println("The # of attempts is: " + attempts);
            }

        } while (guess != randomNumber);

        System.out.println("You have won!");

        sc.close();
    }
}