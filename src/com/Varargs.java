package com;

public class Varargs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(add(1,2,4,5,6));
		System.out.println(average(1,2,4,5,6,7.8));

	}
	static int add(int... numbers) {
		int sum=0;
		for(int number:numbers){
			sum+=number;
		}
		return sum;
	}
	static double average(double... nums) {
		int sum=0;
		if(nums.length==0) {
			return 0;
		}
		for(double num:nums) {
			sum+=num;
			
		}
		return sum;
	}

}
