package com;
class User{
	String username;
	String email;
	int age;
	User(String username){
		this.username=username;
		this.email="Not provided";
		this.age=0;
	}
	User(String username,String email){
		this.username=username;
		this.email=email;
		this.age=0;
	}
	User(String username,String email,int age){
		this.username=username;
		this.email=email;
		this.age=age;
	}
	User(){
		this.username="Guest";
		this.email="guest1@gmail.com";
		this.age=0;
	}
}
public class OverloadConstructors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user1=new User("Spongebob");
		User user2=new User("patrick","pstar@gmail.com");
		User user3=new User("Ana","ana123@gmail.com",22);
		User user4=new User();
		
		System.out.println(user1.username);
		System.out.println(user1.email);
		System.out.println(user1.age);
		System.out.println(user2.username);
		System.out.println(user2.email);
		System.out.println(user2.age);
		
		System.out.println(user3.username);
		System.out.println(user3.email);
		System.out.println(user3.age);
		System.out.println(user4.username);
		System.out.println(user4.email);
		System.out.println(user4.age);
		

	}

}
