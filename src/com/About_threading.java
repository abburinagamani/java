package com;
import java.util.*;
class MyRunnable implements Runnable{
	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				System.out.println("Thread was interrupted");
			}
			if(i==5) {
				System.out.println("Time is up!");
				System.exit(0);
			}
		}	
	}
	
}
public class About_threading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		MyRunnable myrunnable=new MyRunnable();
		Thread thread=new Thread(myrunnable);
		thread.setDaemon(true);
		thread.start();
	
		System.out.println("You have 5 seconds to enter your name");
		
		System.out.print("Enter your name: ");
		String name=sc.nextLine();
		System.out.println("Hello "+name);
		
		
		sc.close();

	}

}
