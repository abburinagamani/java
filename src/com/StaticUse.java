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
		Friend friend1=new Friend("Alice");
		Friend friend2=new Friend("Bob");
		Friend friend3=new Friend("Charles");
		Friend friend4=new Friend("Donald");
		Friend.showFriends();
		
	}

}
