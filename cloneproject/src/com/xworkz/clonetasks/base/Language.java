package com.xworkz.clonetasks.base;

public class Language implements Cloneable{
public  String name ;
public String region;
public int howOld;



public void initProps( String region, int howOld ) {

	this.region = region;
	this.howOld = howOld;
	
	System.out.println("invoke the initprops method");

}

@Override
public Object clone() throws CloneNotSupportedException

{
	return super.clone();

}
}
