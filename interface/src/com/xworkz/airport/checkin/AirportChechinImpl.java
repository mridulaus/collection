package com.xworkz.airport.checkin;

public class AirportChechinImpl implements AirportCheckin {
	@Override
	public boolean checkinAtBoardingPoint() {
		System.out.println("running checkinAtBoardingPoint frame");
		return true;
	}
	
	@Override
	public boolean collectBoardingPass (int tickets) {
		System.out.println("running collectBoardingPass frame");
		return true;
	}

}
