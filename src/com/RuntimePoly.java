package com;
import java.util.*;
abstract class RunAnimal{
	void speak() {
		
	}
}
class Doggy extends RunAnimal{
	@Override
	void speak() {
		System.out.println("The dog is barking");
	}
}
class Catty extends RunAnimal{
	@Override
	void speak() {
		System.out.println("The cat is meow");
}
}

public class RuntimePoly {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		RunAnimal runanimal;
		int choice;
		System.out.print("Would you like dog or cat(1/2): ");
		choice=sc.nextInt();
		if(choice==1) {
			runanimal=new Doggy();
			runanimal.speak();
		}
		else {
			runanimal=new Catty();
			runanimal.speak();
		}
		
		sc.close();
	}

}
