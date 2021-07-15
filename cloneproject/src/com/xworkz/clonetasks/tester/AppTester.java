package com.xworkz.clonetasks.tester;

import com.xworkz.clonetasks.base.Application;
import com.xworkz.clonetasks.base.Product;

public class AppTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Application app = new Application();
app.name = "snapchat";
app.version = "SP234p";

String[]  developers = new String[3] ;
developers[0] = "Mridul";
developers[1] = "Mrinal";
developers[2] = "kavya";
app.developers = developers;



System.out.println("cloning app1");

try {
	Application app1 = (Application) app.clone(); //shallow clone

	app1.disPlayInfo();

}
catch (CloneNotSupportedException exc) {
	exc.printStackTrace();
}
	
	}

}
