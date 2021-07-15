package com.mytask.deep.mainclass;

public class UniForm  implements Cloneable{
	
	public String color;
	public boolean availability;
	
public UniForm ( String color,  boolean availability ) {
	
	System.out.println( "invoke constructor of Uniform");
	this.color = color;
	this.availability= availability;
}

public void display() {
	System.out.println(this.color);
	System.out.println(this.availability);
}

@Override
public UniForm clone() throws CloneNotSupportedException

{
	return ( UniForm) super.clone();

}
	

}
