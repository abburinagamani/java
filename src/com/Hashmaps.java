package com;
import java.util.*;
public class Hashmaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Double> hashmap=new HashMap<>();
		hashmap.put("banana",1.1);
		hashmap.put("apple", 5.12);
		hashmap.put("orange",6.23);
		hashmap.put("watermelon",7.23);
		//hashmap.remove("apple");
		System.out.println(hashmap.get("orange"));
		System.out.println(hashmap.containsKey("apple"));
		System.out.println(hashmap.containsValue(6.23));
		System.out.println(hashmap.size());
		for(String key:hashmap.keySet()) {
			System.out.println(key+" : $ "+hashmap.get(key));
		}

	}

}
