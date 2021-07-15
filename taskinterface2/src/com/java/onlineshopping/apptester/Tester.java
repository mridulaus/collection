package com.java.onlineshopping.apptester;
import com.java.onlineshopping.app.*;
import com.java.onlineshopping.delivery.*;
public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ItemDelivery  temp  = new CourierService(  "bluedart" , 200, false);
		
		Flipkart app = new Flipkart();
		app.setRule(temp);
		app.deliveryProduct();
		app.returnProduct();
	}

}
