package com;

class Person {

    String first;
    String last;

    Person(String first, String last) {
        this.first = first;
        this.last = last;
    }
}

class MyStudent extends Person {

    double cgpa;

    MyStudent(String first, String last, double cgpa) {
        super(first, last);
        this.cgpa = cgpa;
    }
}
class MyEmployee extends Person{
	double salary;
	MyEmployee(String first,String last,double salary){
		super(first,last);
		this.salary=salary;
	}
}

public class SuperUse {

    public static void main(String[] args) {

        MyStudent student = new MyStudent("Nagamani", "Abburi", 8.8);
        MyEmployee employee1=new MyEmployee("nagamani","abburi",50000.00);

        System.out.println("First name: " + student.first);
        System.out.println("Last name: " + student.last);
        System.out.println("CGPA: " + student.cgpa);
        
        System.out.println("First name: " + employee1.first);
        System.out.println("Last name: " + employee1.last);
        System.out.println("salary: " + employee1.salary);
        
    }
}


