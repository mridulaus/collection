package com.xworkz.rules.passportrules;
import com.xworkz.rules.*;
public interface PassportRule {
	
	boolean detailsMatch();
	boolean indianCitizen();
	boolean criminalCase();
	

}
