package com;
import java.util.*;
public class Countdown_timer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the seconds for countdown: ");
		int response=sc.nextInt();
		Timer timer=new Timer();
		TimerTask task=new TimerTask() {
			int count=response;
			@Override
			public void run() {
				System.out.println(count);
				count--;
				if(count <0) {
					System.out.println("Happy new year!");
					timer.cancel();
					
				}
			}
		};
		timer.scheduleAtFixedRate(task, 0,1000);
  sc.close();
	}

}
