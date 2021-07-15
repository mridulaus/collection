package com.xworkz.clonetasks.tester;

import com.xworkz.clonetasks.base.Application;
import com.xworkz.clonetasks.base.Industry;

public class IndustryTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Industry ind  = new Industry();
ind.initProps("Reliance", "Digitalmarket", 20000);
ind.location = "Mumbai";
ind.ownerName = "Mukesh Ambani";




System.out.println("cloning ind1");

try {
	Industry ind1 = (Industry) ind.clone();

	ind1.displayProperties();

}
catch (CloneNotSupportedException exc) {
	exc.printStackTrace();
}
	
	}

}
