package com.xworkz.relieve.rules;
import com.xworkz.relieve.company.*;
import com.xworkz.relieve.employee.*;

public class Tester {
	
public static void main(String[] args) {
	
	RelievbleRule  relieveRule = new Developer( "mridula	");
	
	Xworkz xworkz = new Xworkz();
	xworkz.setRule(relieveRule);
	xworkz.employeeExit();
}
}
