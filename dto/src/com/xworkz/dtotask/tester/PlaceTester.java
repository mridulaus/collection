package com.xworkz.dtotask.tester;
import com.xworkz.dtotask.tele.*;
public class PlaceTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PlaceDTO place = new PlaceDTO();
		place.setBeautifull(true);
		place.setDistrictName("Karwar");
		place.setFamous(true);
		place.setName("Murudeshwara");
		place.setNoOfTrain(5);
		System.out.println(place);
	}

}
