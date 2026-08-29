package com;
import java.util.*;
import java.io.*;
public class HangmanGame {
	public static void main(String[] args){
		String filePath="C:\\Users\\abbur\\OneDrive\\Desktop\\words.txt";
		ArrayList<String> words=new ArrayList<>();
		try(BufferedReader reader=new BufferedReader(new FileReader(filePath))){
			String line;
			while((line=reader.readLine())!=null) {
				words.add(line.trim());
			}
		}
		catch(FileNotFoundException e) {
			System.out.println("Could not load file ");
		}
		catch(IOException e) {
			System.out.println("Something went wrong!");
		}
		Random random=new Random();
		String word=words.get(random.nextInt(words.size()));
		
		
		Scanner sc=new Scanner(System.in);
		ArrayList<Character> wordstate=new ArrayList<>();
		int wrongGuesses=0;
		for(int i=0;i<word.length();i++) {
			wordstate.add('_');
		}
		System.out.println("***********************");
		System.out.println("Welcome to Java Hangman!");
		System.out.println("***********************");
		
		while(wrongGuesses < 6) {
			System.out.print(getHangmanArt(wrongGuesses));
			
			System.out.print("Word: ");
			
			for(char c:wordstate) {
				System.out.print(c+" ");
				
			}
			System.out.println();
			System.out.print("Guess a letter: ");
			char guess=sc.next().toLowerCase().charAt(0);
			if(word.indexOf(guess)>=0) {
				System.out.println("Correct guess!\n");
				for(int i=0;i<word.length();i++) {
					if(word.charAt(i)==guess) {
						wordstate.set(i, guess);
					}
				}
				if(!wordstate.contains('_')) {
					System.out.print(getHangmanArt(wrongGuesses));
					System.out.println("You Win!");
					System.out.println("The word was: "+word);
					break;
				}
			}
			else {
				wrongGuesses++;
				System.out.println("Wrong guess!\n");
			}
		}
		if(wrongGuesses >=6) {
			System.out.print(getHangmanArt(wrongGuesses));
			System.out.println("Game Over!");
			System.out.println("The word was: "+word);
		}
		sc.close();
	}
	static String getHangmanArt(int wrongGuesses) {
		return switch(wrongGuesses) {
		case 0 ->"""
				
				
				""";
		case 1 ->"""
				 o
				
				""";
		case 2->"""
		         o
		         |
		
		        """;
		case 3 ->"""
				  o
				 /|
				
				  """;
		case 4 ->"""
				  o
				 /|\\
				
				""";
		case 5 ->"""
				  o
				 /|\\
				 /
				""";
		case 6 ->"""
				  o
				 /|\\
				 / \\
				
				""";
		default ->" ";
		};
		
	}
	
}
