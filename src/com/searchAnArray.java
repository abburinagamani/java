package com;

public class searchAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers= {1,6,5,2,3,4};
		int target=7;
		boolean isFound=false;
		for(int i=0;i<numbers.length;i++) {
			if(target==numbers[i]) {
				System.out.println("Element found at index: "+i);
				isFound=true;
				break;
				
			}
		}
		if(!isFound) {
			System.out.println("Element is not found");
		}

	}

}
