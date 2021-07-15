package com.xworkz.clonetasks.tester;

import com.xworkz.clonetasks.base.Application;
import com.xworkz.clonetasks.base.Language;

public class LanguageTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Language lang = new Language();
		lang.name = "Kannada";
		lang.initProps("Karnataka", 2500);
		
		


System.out.println("cloning lang1");

try {
	Language lang1 = (Language) lang.clone();

System.out.println(lang1.name);

}
catch (CloneNotSupportedException exc) {
	exc.printStackTrace();
}
		
	}

}
