package com;

public class SubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String email="BroCode123@gmail.com";
		String name=email.substring(0,email.indexOf("@"));
		String domain=email.substring(email.indexOf("@"));
		System.out.println("The name is: "+name);
		System.out.println("The domain is: "+domain);

	}

}
