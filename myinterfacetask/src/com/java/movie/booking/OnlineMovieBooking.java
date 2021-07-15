package com.java.movie.booking;
import com.java.movie.booking.*;
public class OnlineMovieBooking implements TicketSystem {

	
	
	@Override
	public boolean  book( int totalTickets){
		System.out.println("@@@@ ");
		return true;
		
	}
	

	@Override
	public boolean cancel( int tickets) {
		System.out.println(" @@@");
		return true;
		
	}
}
