package com;

public class MathNumber {
	public static void main(String[] args) {
		System.out.println(Math.PI);
		System.out.println(Math.E);
		double result;
		int result1;
		int result2;
		int result3;
		int result4;
		int result5;
		int result6;
		int result7;
		result=Math.pow(2, 3);
		result1=Math.absExact(-5);
		result2=(int) Math.sqrt(9);
		result3=(int) Math.round(3.15664);
		result4=(int) Math.ceil(3.15343);
		result5=(int) Math.floor(3.162654);
		result6=Math.max(10,20);
		result7=Math.min(1, 4);
		
		System.out.println("power value: "+result);
		System.out.println("absolute number: "+result1);
		System.out.println("square root: "+result2);
		System.out.println("round number: "+result3);
		System.out.println("ceil number: "+result4);
		System.out.println("floor number: "+result5);
		System.out.println("maximum number: "+result6);
		System.out.println("minimum number: "+result7);
	}


}
