package com.defaultfolder.vehicle;

public class RayZr {
	String ownerName;
 String brand ;
 String color;
 int noOfWheels ;
 
 RayZr(String ownerName, String brand ){ //  default 
	 this.ownerName = ownerName;
	 this.brand = brand;
	 
 }
 
 void initProps (   String color , int noOfWheels) { // default
	 
	
	 this.color = color;
	 this.noOfWheels = noOfWheels;
	 

 }
 void displayProps() {
	 System.out.println(" Properties of my bike ");
	 System.out.println(this.brand);
	 System.out.println(this.color);
	 System.out.println(this.noOfWheels);
 }

}
