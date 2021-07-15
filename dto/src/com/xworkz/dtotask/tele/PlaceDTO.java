package com.xworkz.dtotask.tele;

import java.io.Serializable;

public class PlaceDTO implements Serializable {

	private String name;
	private boolean beautifull;
	private int noOfTrain;
	private String districtName;
	private boolean famous;
	public PlaceDTO(String name, boolean beautifull, int noOfTrain, String districtName, boolean famous) {
		
		this.name = name;
		this.beautifull = beautifull;
		this.noOfTrain = noOfTrain;
		this.districtName = districtName;
		this.famous = famous;
	}
	public PlaceDTO() {
		System.out.println(" PlaceDTO constructor ");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isBeautifull() {
		return beautifull;
	}
	public void setBeautifull(boolean beautifull) {
		this.beautifull = beautifull;
	}
	public int getNoOfTrain() {
		return noOfTrain;
	}
	public void setNoOfTrain(int noOfTrain) {
		this.noOfTrain = noOfTrain;
	}
	public String getDistrictName() {
		return districtName;
	}
	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}
	public boolean isFamous() {
		return famous;
	}
	public void setFamous(boolean famous) {
		this.famous = famous;
	}
	@Override
	public String toString() {
		return "PlaceDTO [name=" + name + ", beautifull=" + beautifull + ", noOfTrain=" + noOfTrain + ", districtName="
				+ districtName + ", famous=" + famous + "]";
	}
	
	
	
	
}
