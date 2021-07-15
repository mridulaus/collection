package com.mytask.deep.mainclass;

public class Alexa implements Cloneable  {

	
	public float version;
	public int noofSensors;
	
	
	
	public Alexa ()
	{
		System.out.println("default constructor of Alexa");
	}
	public Alexa(float version , int noofSensors)
	{
		System.out.println("parameter constructor ");
		this.version=version;
		this.noofSensors=noofSensors;
		
	
	}
	
public void display() {
		System.out.println(this.noofSensors);
		System.out.println(this.version);
	}
		
	
	
	@Override
	public Alexa clone() throws CloneNotSupportedException

	{
		return ( Alexa) super.clone();

	}
	
}
