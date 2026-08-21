package com;
class Books{
	private int id;
	private String name;
	private String author;
	Books(int id,String name,String author){
		this.id=id;
		this.name=name;
		this.author=author;
	}
	
public int getId() {
	return id;
}
public String getName() {
	return name;
}
public String getAuthor() {
	return author;
}
void setId(int id) {
	this.id=id;
}
void setName(String name) {
	this.name=name;
}
void setAuthor(String author) {
	this.author=author;
}
}
public class Getters_setters {

	public static void main(String[] args) {
		// TODO Auto-generated method tub
		Books books=new Books(1,"aha","Riya");
		books.setId(2);
		books.setName("Wings");
		books.setAuthor("Kalam");
		System.out.println(books.getId()+" "+books.getName()+" "+books.getAuthor());

	}

}
