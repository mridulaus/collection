package com.xworkz.clonetasks.base;

public class Product implements Cloneable {
	public int productId;
	public String name;
	public String brand;
	public double price;
	public String type;
	public boolean profitable;

	public void initProps(double price, String type, boolean profitable) {

		this.price = price;
		this.type = type;
		this.profitable = profitable;
		System.out.println("invoke the initprops method");

	}

	public void production() {
		System.out.println(" invoke production methos");
		System.out.println( this.brand);
		System.out.println( this.name);
		System.out.println(this.price);
		System.out.println(this.productId);
		System.out.println(this.profitable);
	}
@Override
	public Object clone() throws CloneNotSupportedException

{
		return super.clone();

	}
}
