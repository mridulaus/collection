package com.mridul.privatetask;

public class IceCream {
private int price  = 45;
 private String flavour = "blueberry";
 
   void msg(){ // if it is private we can not access it in icecreamtester
	 System.out.println(this.price);
	 System.out.println(this.flavour);
	 }  


}
