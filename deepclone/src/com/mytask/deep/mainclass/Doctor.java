package com.mytask.deep.mainclass;

public class Doctor implements Cloneable {

	public String degree;
	public String name;
	public int age;
	public Patient patient;

	public Doctor(String degree, String name, int age, Patient patient) {
		System.out.println("CONSTUCTOR ");
		this.degree = degree;
		this.name = name;
		this.age = age;
		this.patient = patient;

	}

	@Override
	public Doctor clone() throws CloneNotSupportedException {
		Doctor cloneRef = (Doctor) super.clone();
		if (this.patient != null) {
			cloneRef.patient = patient.clone();
		}
		return cloneRef;
	}

	public void displayProperties() {
		System.out.println("Start of displayProperties()");
		System.out.println(this.name);
		System.out.println(this.age);
		System.out.println(this.degree);
		System.out.println(this.patient.id);
		System.out.println(this.patient.disease);

		if (this.patient == null) {
			System.out.println("patient is null");

		} else {
			System.out.println("patient is not null");
		}

	}
}
