package com.xworkz.airport.checkin;

public interface AirportCheckin {
  double LUGGUAGE_WEIGHT = 50.0;
  boolean collectBoardingPass(int tickets);
  boolean checkinAtBoardingPoint();
  
}
