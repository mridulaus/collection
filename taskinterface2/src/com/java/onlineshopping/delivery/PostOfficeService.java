package com.java.onlineshopping.delivery;
import com.java.onlineshopping.apptester.*;
public class PostOfficeService implements  ItemDelivery {
	private int pincode;

	public PostOfficeService(int pincode) {
		this.pincode = pincode;

	}

	@Override
	public int pickItem() {
		System.out.println(this.pincode + "PickItem");
		return 30;
	}

	@Override
	public int dropItem() {
		System.out.println(this.pincode + "drop");
		return pickItem();
	}


}
