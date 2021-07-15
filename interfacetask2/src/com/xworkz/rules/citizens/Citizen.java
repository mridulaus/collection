package com.xworkz.rules.citizens;
import com.xworkz.rules.passportrules.*;
import com.xworkz.rules.*;
public class Citizen implements PassportRule {
	
	
	private String name;
	private long mobile;
	
	public  Citizen (String name , long mobile) {
		this.name = name;
		this.mobile = mobile;
				
		
	}
	
	@Override
	public  boolean detailsMatch(){
		System.out.println(" detailsmatch rule  "+ this.name);
		System.out.println("details match ruleb "+  this .mobile);
		
		return true;
	}
	@Override
	public  boolean indianCitizen(){
		System.out.println(" is he/she indianCitizen  "  + this.name);
		System.out.println(" indianCitizen    "+  this .mobile);
		
		return true;
	}
	@Override
	public  boolean criminalCase(){
		System.out.println(   this.name + " is he/she having any criminalcase   " );
		System.out.println(   this .mobile + "   is he/she having any criminalcase  "  );
		
		return true;
	}

}
