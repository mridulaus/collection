package com.xworkz.relieve.employee;
import com.xworkz.relieve.rules.*;
import com.xworkz.*;

public class Developer implements RelievbleRule {
	private String name;
	
	public  Developer(String name) {
		this.name = name;
		}
	@Override
	public boolean completedBond() {
		System.out.println(  this.name  + "   completed bond");
		return true;
	}
	
	@Override
	public int servedNoticePeriod() {
		System.out.println(  this.name  + "   served notice period");
		return 60;
	}
	
	
	

}
