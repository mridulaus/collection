package com.mytask.deep.mainclass;

public class Amazon  implements Cloneable{ //'deep clone only for association'

	
	public String country ="India";
	public String foundedDate= "2014";
	public Alexa alexa;
	

	
	public Amazon(String country ,String foundedDate)
	{
		System.out.println("CONSTUCTOR WITH country");
		this.country=country;
		
	}
	
	public void initAlexa(Alexa alex)
	{
		this.alexa=alex;
		
	}
	
	
	@Override 
	public Amazon clone() throws CloneNotSupportedException {
		Amazon cloneRef = (Amazon)  super.clone();
		if ( this.alexa !=null) {
			cloneRef.alexa = alexa.clone();
		}
		return cloneRef;
	}
	
	public void displayProperties()
	{
		System.out.println("Start of displayProperties()");
		System.out.println(this.country);
		System.out.println(this.foundedDate);
		System.out.println(this.alexa.version);
		System.out.println(this.alexa.noofSensors);
		
		if( this.alexa == null) {
			System.out.println("alexa is null");
			
		}else {
		System.out.println("alexa is not null");
	}
	
	
	
}
}
