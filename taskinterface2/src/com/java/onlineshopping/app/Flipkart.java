package com.java.onlineshopping.app;
import com.java.onlineshopping.app.*;
import com.java.onlineshopping.apptester.*;


public class Flipkart {
	
	private ItemDelivery delivery;
	
	public Flipkart () {
		System.out.println("Flipkart constructor");
	}
	public void deliveryProduct() {
		if( delivery != null) {
			System.out.println("delivered");
			int del 	 =  this.delivery.dropItem();
			int num = 100;
			if(del >= num ) {
				System.out.println(" deliverde on time ");	
				}else {
				System.out.println(" not deliverde on time  ");	
				}
		}else {
			
			System.out.println("not delivered");
		}
	}
	public void returnProduct() {
		if( delivery != null) {
			System.out.println("picked");
			int picking  =  this.delivery.pickItem();
			int num1 = 50;
			if(picking <= num1 ) {
				System.out.println("picked on time ");	
				}else {
				System.out.println("not picked on time");	
				}
		}else {
			
			System.out.println("not picked");
		}
	}
	public void setRule(ItemDelivery delivery) {
		this.delivery = delivery;
	}

}
