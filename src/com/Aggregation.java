package com;
class Bags{
	String name;
	int cases;
	Bags(String name,int cases){
		this.name=name;
		this.cases=cases;
	}
	String displayInfo() {
		return this.name+" "+this.cases+"cases";
	}
}
class Luggage{
	String name;
	int no;
	Bags[] bags;
	Luggage(String name,int no,Bags[] bags){
		this.name=name;
		this.no=no;
		this.bags=bags;
	}
	void displayInfo() {
		System.out.println("The "+this.name+" is "+this.no);
		System.out.println("Bags avaiable: ");
		for(Bags bag:bags) {
			System.out.println(bag.displayInfo());
		}
	}
	
}
public class Aggregation {
	public static void main(String[] args) {
		Bags bags1=new Bags("Safari",3);
		Bags bags2=new Bags("HRX",2);
		Bags bags3=new Bags("Monaco",4);
		Bags[] bags= {bags1,bags2,bags3};
		Luggage luggage=new Luggage("Handbag",1,bags);
		
		luggage.displayInfo();
	}

}
