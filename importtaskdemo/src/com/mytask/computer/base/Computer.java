package com.mytask.computer.base;

public class Computer {

	protected  String brand;
	 protected  double price;

	 protected Computer() { // protected
		System.out.println("ivoked  constructor()");
	
	}

	public void initComputer(String brand , double price) {
		System.out.println("invoked  method()");
		
		this.brand = brand;
		System.out.println("Brand " + this.brand);
		this.price = price;

		System.out.println("price of the Computer  " + this.price);
	}

}
