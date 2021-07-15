package com.mytask.deep.tester;

import com.mytask.deep.mainclass.*;

public class StudentTester {
	
	public static void main(String[] args) {
	Student student = new Student("Mrinal", 98.0d, "10std");
	UniForm form = new UniForm("BlacknBlue", true);
	student.initUniForm(form);
	student.displayProperties();

	
	System.out.println("cloning student1");

	try {
		Student student1 =  student.clone(); //deep clone
System.out.println("   original  " +student.unifrom.hashCode());
System.out.println(" copy "+student1.clone().hashCode());
student1.displayProperties();

	} catch (CloneNotSupportedException exc) {
		exc.printStackTrace();
	}

}

 
	}

