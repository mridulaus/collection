package com.xworkz.dtotask.tele;

import java.io.Serializable;

public class MovieDTO implements Serializable {
  private String  name;
  private String Director;
  private int collection;
  private boolean movieQuality;
  private String releaseDate;
public MovieDTO(String name, String director, int collection, boolean movieQuality, String releaseDate) {
	
	this.name = name;
	Director = director;
	this.collection = collection;
	this.movieQuality = movieQuality;
	this.releaseDate = releaseDate;
}
public MovieDTO() {
	System.out.println(" MovieDTO constructor ");
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDirector() {
	return Director;
}
public void setDirector(String director) {
	Director = director;
}
public int getCollection() {
	return collection;
}
public void setCollection(int collection) {
	this.collection = collection;
}
public boolean isMovieQuality() {
	return movieQuality;
}
public void setMovieQuality(boolean movieQuality) {
	this.movieQuality = movieQuality;
}
public String getReleaseDate() {
	return releaseDate;
}
public void setReleaseDate(String releaseDate) {
	this.releaseDate = releaseDate;
}
@Override
public String toString() {
	return "MovieDTO [name=" + name + ", Director=" + Director + ", collection=" + collection + ", movieQuality="
			+ movieQuality + ", releaseDate=" + releaseDate + "]";
}


  
  
}
