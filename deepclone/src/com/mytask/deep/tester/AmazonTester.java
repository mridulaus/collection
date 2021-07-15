package com.mytask.deep.tester;

import com.mytask.deep.mainclass.*;


public class AmazonTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String Country = "Thailand";
		Amazon amz = new Amazon(Country, "5/7/2001");
		Alexa al = new Alexa(8f, 3);
		amz.initAlexa(al);
		amz.displayProperties();
System.out.println(amz.hashCode());
		System.out.println("cloning amz1");

		try {
			Amazon amz1 =  amz.clone(); //deep clone
System.out.println("   original  " +amz.alexa.hashCode());
System.out.println(" copy "+amz1.clone().hashCode());
			amz1.displayProperties();

		} catch (CloneNotSupportedException exc) {
			exc.printStackTrace();
		}

	}

}
