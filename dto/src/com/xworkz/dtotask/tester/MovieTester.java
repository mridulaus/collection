package com.xworkz.dtotask.tester;

import com.xworkz.dtotask.tele.MovieDTO;

public class MovieTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MovieDTO movie = new MovieDTO();
		movie.setCollection(500000000);
		movie.setDirector("Aditya Chopra");
		movie.setMovieQuality(true);
		movie.setName("DDLJ");
		movie.setReleaseDate("20/oct/1995");
		System.out.println(movie);

	}

}
