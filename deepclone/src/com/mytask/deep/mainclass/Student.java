package com.mytask.deep.mainclass;

public class Student implements Cloneable {

	public String name;
	public double percentage;
	public String classStd;
	public UniForm unifrom;
	
	public Student(String name, double percentage, String classStd)
	{
		System.out.println("CONSTUCTOR ");
		this.name = name;
		this.percentage = percentage;
		this.classStd = classStd;
		
	}
	
	public void initUniForm(UniForm unifrom)
	{
		this.unifrom = unifrom;
		
	}
	
	
	@Override 
	public Student clone() throws CloneNotSupportedException {
		Student cloneRef = (Student)  super.clone();
		if ( this.unifrom !=null) {
			cloneRef.unifrom = unifrom.clone();
		}
		return cloneRef;
	}	

	
	public void displayProperties()
	{
		System.out.println("Start of displayProperties()");
		System.out.println(this.name);
		System.out.println(this.classStd);
		System.out.println(this.unifrom.color);
		System.out.println(this.unifrom.availability);
		
		
		if( this.unifrom == null) {
			System.out.println("uniform  is null");
			
		}else {
		System.out.println("uniform is not null");
	}
		
		
		
	
	
}}