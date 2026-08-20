package com;
class Friend{
	String name;
	static int noOfFriends;
	Friend(String name){
		this.name=name;
		noOfFriends++;
	}
	static void showFriends() {
		System.out.println("You have "+noOfFriends+" "+"total friends");
	}
}
public class StaticUse {
	public static void main(String[] args) {
		
		Friend.showFriends();
		
	}

}
