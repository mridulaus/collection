package com.xworkz.charge.base;

import com.xworkz.charge.constant.BatteryType;

public class Battery {
	public BatteryType type;
	private int price;

	protected Battery() {
		System.out.println("invoked battery constructor");
	}

	protected void discharge() {
		System.out.println("battery type " + type);
		System.out.println("price " + price);
	}

}
