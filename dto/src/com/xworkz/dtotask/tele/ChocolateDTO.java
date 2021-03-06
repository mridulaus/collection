package com.xworkz.dtotask.tele;

import com.xworkz.dtotask.constants.*;
import java.io.Serializable;

public class ChocolateDTO implements Serializable {
	private String founder;
	private String mainIngridient;
	private double price;
	private boolean taste;
	private ChocolatesType type;
	private boolean quality;
	private String origin;

	public ChocolateDTO(String founder, String mainIngridient, double price, boolean taste, ChocolatesType type,
			boolean quality, String origin) {
		System.out.println("invoked ChocolateDTO parameter constructor");
		this.founder = founder;
		this.mainIngridient = mainIngridient;
		this.price = price;
		this.taste = taste;
		this.type = type;
		this.quality = quality;
		this.origin = origin;
	}

	public ChocolateDTO() {
		System.out.println("invoked ChocolateDTO DEFAULT constructor");
	}

	public String getFounder() {
		return founder;
	}

	public void setFounder(String founder) {
		this.founder = founder;
	}

	public String getMainIngridient() {
		return mainIngridient;
	}

	public void setMainIngridient(String mainIngridient) {
		this.mainIngridient = mainIngridient;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isTaste() {
		return taste;
	}

	public void setTaste(boolean taste) {
		this.taste = taste;
	}

	public ChocolatesType getType() {
		return type;
	}

	public void setType(ChocolatesType type) {
		this.type = type;
	}

	public boolean isQuality() {
		return quality;
	}

	public void setQuality(boolean quality) {
		this.quality = quality;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	@Override
	public String toString() {
		return "ChocolateDTO [founder=" + founder + ", mainIngridient=" + mainIngridient + ", price=" + price
				+ ", taste=" + taste + ", type=" + type + ", quality=" + quality + ", origin=" + origin + "]";
	}

	@Override
	public boolean equals(Object obj) {

		if (obj == null)
			return false;
		if (obj instanceof ChocolateDTO) {
			ChocolateDTO ref = (ChocolateDTO) obj;
			if (this.price == ref.getPrice() && this.mainIngridient.equalsIgnoreCase(ref.getMainIngridient())) {
				System.out.println("Chocolate is equal " + this.type);
				return true;
			} else {
				System.out.println("ChocolateDTO is not equal " + this.type);
				return false;
			}

		}
		return true;
	}

}
