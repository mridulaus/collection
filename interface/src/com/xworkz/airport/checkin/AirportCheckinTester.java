package com.xworkz.airport.checkin;
import com.xworkz.airport.checkin.*;
public class AirportCheckinTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AirportCheckin airport = new AirportChechinImpl();
		System.out.println(AirportCheckin.LUGGUAGE_WEIGHT );
		airport.checkinAtBoardingPoint();
		airport.collectBoardingPass(5);
		}

}
