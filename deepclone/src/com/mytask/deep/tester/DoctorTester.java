package com.mytask.deep.tester;

import com.mytask.deep.mainclass.Doctor;
import com.mytask.deep.mainclass.Patient;
import com.mytask.deep.mainclass.Student;

public class DoctorTester {
	public static void main(String[] args) {
	Patient pat = new Patient("TB",30);
	Doctor doc = new Doctor("Mbbs", "Chetan" , 21, pat);
	doc.displayProperties();
	System.out.println("cloning doc1");
	try {
		Doctor  doc1 =  doc.clone(); //deep clone
		System.out.println("   original  " +doc.patient.hashCode());
		System.out.println(" copy "+doc1.clone().hashCode());
		doc1.displayProperties();
	}
	catch (CloneNotSupportedException e) {
		e.printStackTrace();
	}


	}}
