package com.xworkz.dtotask.tele;

import java.io.Serializable;

public class CountryDTO implements Serializable{
	private String name;
	private int noOfStates;
	private long Population;
	private String nameOfPm;
	private float area;
	public CountryDTO(String name, int noOfStates, long population, String nameOfPm, float area) {
		super();
		this.name = name;
		this.noOfStates = noOfStates;
		Population = population;
		this.nameOfPm = nameOfPm;
		this.area = area;
	}
	public CountryDTO() {
		System.out.println(" CountryDTO constructor  ");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNoOfStates() {
		return noOfStates;
	}
	public void setNoOfStates(int noOfStates) {
		this.noOfStates = noOfStates;
	}
	public long getPopulation() {
		return Population;
	}
	public void setPopulation(long population) {
		Population = population;
	}
	public String getNameOfPm() {
		return nameOfPm;
	}
	public void setNameOfPm(String nameOfPm) {
		this.nameOfPm = nameOfPm;
	}
	public float getArea() {
		return area;
	}
	public void setArea(float area) {
		this.area = area;
	}
	@Override
	public String toString() {
		return "CountryDTO [name=" + name + ", noOfStates=" + noOfStates + ", Population=" + Population + ", nameOfPm="
				+ nameOfPm + ", area=" + area + "]";
	}
	
	
	
  
}
