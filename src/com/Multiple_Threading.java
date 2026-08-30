package com;
class MyThread implements Runnable{
	private final String text;
	MyThread(String text){
		this.text=text;
	}
	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			try {
			Thread.sleep(1000);
			System.out.println(text);
			}
			catch(InterruptedException e) {
				System.out.println("Thread was interrupted");
				
			}
		}
	}
}
public class Multiple_Threading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Game start");
		Thread thread1=new Thread(new MyThread("PING"));
		Thread thread2=new Thread(new MyThread("PONG"));
		
		thread1.start();
		thread2.start();
		try {
			thread1.join();
			thread2.join();
			
		}
		catch(InterruptedException e) {
			System.out.println("Thread was interrupted");
		}
		System.out.println("game over");

	}

}
