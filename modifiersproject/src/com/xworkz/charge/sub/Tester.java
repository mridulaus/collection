package com.xworkz.charge.sub;

import com.xworkz.charge.base.Battery;
import com.xworkz.charge.base.Car;
import com.xworkz.charge.base.HeliumBattery;
import com.xworkz.charge.constant.BatteryType;
//import com.xworkz.charge.sub.DryBattery;
 //import com.xworkz.charge.sub

public class Tester {

	public static void main(String[] args) {
				// Battery batry = new Battery();
				// bat.discharge();
				// System.out.println(bat.price);
				System.out.println(BatteryType.LITHIUM_ION);
				System.out.println("****");

				Car car = new Car();
				car.start();

				System.out.println("####");
				HeliumBattery helium = new HeliumBattery();
				//helium.superCharge();

				System.out.println("@@@@");
				DryBattery dry = new DryBattery();
		
		
		
	}

}
