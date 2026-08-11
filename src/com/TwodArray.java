package com;

public class TwodArray {
	public static void main(String[] args) {
		String[] fruits= {"apple","banana","orange"};
		String[] vegetables= {"onion","tomato","beetroot"};
		String[] meat= {"chicken","mutton","fish"};
		String[][] groceries= {fruits,vegetables,meat};
		for(String[] foods:groceries) {
			for(String food:foods) {
				System.out.print(food+" ");
			}
			System.out.println();
		}
		
		
	}

}
