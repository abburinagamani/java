package com;
public class TernaryOperator {
  public static void main(String[] args) {
	  int score=55;
	  String passOrFail=(score>=60)?"Pass":"Fail";
	  System.out.println(passOrFail);
	  
	  int hours=13;
	  String timeofDay=(hours<12)?"A.M.":"P.M.";
	  System.out.println(timeofDay);
	  
	  int income=60000;
	  String taxApplicable=(income>=40000)?"0.25":"0.15";
	  System.out.println(taxApplicable);
  }
}
