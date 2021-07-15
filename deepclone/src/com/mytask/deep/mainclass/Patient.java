package com.mytask.deep.mainclass;

public class Patient  implements Cloneable{
    public String disease;
    public int id;
    
    public Patient(   String disease ,int id) {
    	System.out.println("calling constructor");
    	this.disease= disease;
    	this.id = id;
    }
    
    
	
public void display() {
		System.out.println(this.disease);
		System.out.println(this.id);
	}
		
	
	
	@Override
	public Patient clone() throws CloneNotSupportedException

	{
		return ( Patient) super.clone();

	}
    
}
