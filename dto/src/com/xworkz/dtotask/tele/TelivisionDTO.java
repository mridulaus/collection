package com.xworkz.dtotask.tele;

import java.io.Serializable;

public class TelivisionDTO implements Serializable{
	 // marker interface

		private String brand;
		private double price;
		private int noOfPorts;
		private boolean smart;
		
		public TelivisionDTO (String brand, double price ,int noOfPorts,boolean smart  ) {
			this.brand = brand;
			this.price = price;
			this.noOfPorts = noOfPorts;
			this.smart = smart;
			
		}

		public TelivisionDTO() {
			System.out.println("TelevisionDto constructor    ");
		}

		public String getBrand() {
			return brand;
		}

		public void setBrand(String brand) {
			this.brand = brand;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}

		public int getNoOfPorts() {
			return noOfPorts;
		}

		public void setNoOfPorts(int noOfPorts) {
			this.noOfPorts = noOfPorts;
		}

		public boolean isSmart() {
			return smart;
		}

		public void setSmart(boolean smart) {
			this.smart = smart;
		}

		@Override
		public String toString() {
			return "TelevisionDto [brand=" + brand + ", price=" + price + ", noOfPorts=" + noOfPorts + ", smart=" + smart
					+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
					+ "]";
		}
		
		
		
	}
