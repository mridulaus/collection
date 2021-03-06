package com.xworkz.dtotask.tele;

import java.io.Serializable;
import com.xworkz.dtotask.constants.*;
public class CosmaticsDTO implements Serializable{
	private CosmaticsType type;
	private boolean quality;
	private String  brands;
	private boolean odour;
	private double price ;
	private boolean packaging;
	private double  viscocity;
	
	
	public CosmaticsDTO(CosmaticsType type, boolean quality, String brands, boolean odour, double price,
			boolean packaging, double viscocity) {
		System.out.println("invoking parameter constructor");
		this.type = type;
		this.quality = quality;
		this.brands = brands;
		this.odour = odour;
		this.price = price;
		this.packaging = packaging;
		this.viscocity = viscocity;
	}
	


	public CosmaticsDTO() {
		System.out.println("invoking default constructor");
	}



	public CosmaticsType getType() {
		return type;
	}



	public void setType(CosmaticsType type) {
		this.type = type;
	}



	public boolean isQuality() {
		return quality;
	}



	public void setQuality(boolean quality) {
		this.quality = quality;
	}



	public String getBrands() {
		return brands;
	}



	public void setBrands(String brands) {
		this.brands = brands;
	}



	public boolean isOdour() {
		return odour;
	}



	public void setOdour(boolean odour) {
		this.odour = odour;
	}



	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		this.price = price;
	}



	public boolean isPackaging() {
		return packaging;
	}



	public void setPackaging(boolean packaging) {
		this.packaging = packaging;
	}



	public double getViscocity() {
		return viscocity;
	}



	public void setViscocity(double viscocity) {
		this.viscocity = viscocity;
	}



	@Override
	public String toString() {
		return "CosmaticsDTO [type=" + type + ", quality=" + quality + ", brands=" + brands + ", odour=" + odour
				+ ", price=" + price + ", packaging=" + packaging + ", viscocity=" + viscocity + "]";
	}



	@Override
	public boolean equals(Object obj) {
		
		if (obj == null)
			return false;
		if( obj instanceof 	CosmaticsDTO ) { //checking wheather both the ref is belongs to CosmaticsDTO
			CosmaticsDTO ref = (CosmaticsDTO)obj;//downcasting  bc parametr is object type
			if( this.price == ref. getPrice()   && this.brands.equals(ref.getBrands())  ) {
				System.out.println("cosmatic is equal "+ this.brands);
				return true;
			}else {
				System.out.println("cosmatic is not equal " + this.brands);
				return false;
			}
			
		}
		return true;
	}
	
	
	
	

}
