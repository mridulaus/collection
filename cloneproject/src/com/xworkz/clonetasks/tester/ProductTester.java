package com.xworkz.clonetasks.tester;

import com.xworkz.clonetasks.base.*;

public class ProductTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		Product item = new Product();

		item.name = "Shoes";
		item.productId = 15;
		item.brand = "PUMA";
		item.initProps(2800, "industrial", true);
		item.production();

		System.out.println("cloning product1");

		try {
			Product product1 = (Product) item.clone(); // downcasting clone() is a method of  object
			product1.initProps(  500, "industrial", true);
		product1.production();

		}
		catch (CloneNotSupportedException exc) {
			exc.printStackTrace();
		}

	}
}
