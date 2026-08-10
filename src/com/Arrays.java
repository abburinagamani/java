package com;

public class Arrays {
	public static void main(String[] args) {
		String[] fruits= {"apple","banana","orange","guava"};
		
		for(int i=0;i<fruits.length;i++) {
			System.out.println(fruits[i]);
		}
		
		for(String fruit:fruits) {
			System.out.println(fruit);
		}
		
		

}
}