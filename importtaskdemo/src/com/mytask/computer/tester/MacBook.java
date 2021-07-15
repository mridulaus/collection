package com.mytask.computer.tester;

import com.mytask.computer.base.Computer;

public class MacBook extends Computer {

	String color;
	boolean working;

	MacBook(String color, boolean working) {
		super();
		System.out.println("invoked  constructor()");
		this.color = color;
		this.working = working;
	}

	void displayProperties() {
		System.out.println("invoked  macbook displayProperties()");
		System.out.println(this.color);
		System.out.println(this.working);
		super.brand = "Apple";
		System.out.println("brand imported frpm  computer " + this.brand);

	}
}
