package com.mytask.computer.tester;
import com.mytask.computer.base.*; // import bcz its in another package
public class ComputerTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Dell  temp = new Dell(2.6d,true); // object creation  of del within package
		temp.initComputer("Dell A1278",55800.50d);
		temp.displayProperties();
		
		String value = new String ("mridul"); // java.lang
		System.out.println(value);
		
		
		MacBook val = new MacBook ( " rosegold " , true ); // outside the package
		
		val .displayProperties();
		
		
		
	

	}

}
