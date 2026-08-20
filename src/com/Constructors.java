package com;
class Student{
	String name;
	int age;
	double gpa;
	boolean isEnrolled; 
	Student(String name,int age,double gpa){
		this.name=name;
		this.age=age;
		this.gpa=gpa;
		this.isEnrolled=true;
	}
	void study() {
		System.out.println(this.name+" is studying");
	}
}
public class Constructors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1=new Student("Nagamani",22,8.83);
		Student student2=new Student("mani",21,8.8);
		
		System.out.println(student1.name);
		System.out.println(student1.age);
		System.out.println(student1.gpa);
		System.out.println(student1.isEnrolled);
		
		System.out.println(student2.name);
		System.out.println(student2.age);
		System.out.println(student2.gpa);
		System.out.println(student2.isEnrolled);
		student1.study();
		student2.study();

	}

}
