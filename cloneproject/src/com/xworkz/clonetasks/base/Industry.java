package com.xworkz.clonetasks.base;

public class Industry implements Cloneable {
public String name;
public String type;
public int noOfEmps;
public String location;
public String ownerName;

public void initProps(String name, String type ,int noOfEmps    ) {
	System.out.println("  invoke the method");
	
	this.name = name;
	this.type = type;
	this.noOfEmps = noOfEmps;

	
}
public void displayProperties() {
	
	System.out.println("disply all the properties of industry");
}
@Override
public Object clone() throws CloneNotSupportedException

{
	return super.clone();

}


}
