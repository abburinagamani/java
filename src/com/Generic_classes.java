package com;
class Box<T>{
	T item;
	public void setItem(T item) {
		this.item=item;
	}
	public T getItem(){
		return item;
	}
}
class Product<U,V>{
	U item;
	V price;
	Product(U item,V price){
		this.item=item;
		this.price=price;
	}
	
}
public class Generic_classes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box<String> box=new Box<>();
		box.setItem("banana");
		System.out.println(box.getItem());
		
		Product<String,Double> product=new Product<>("makeup box",2300.14);
		System.out.println(product.item);
		System.out.println(product.price);

	}

}
