package com.prowings.deepclonning2;

public class Engine implements Cloneable{
	
	private int mileage;
	private String company;
	private String oil;
	
	
	public Engine() {
		super();
	}


	public Engine(int mileage, String company, String oil) {
		super();
		this.mileage = mileage;
		this.company = company;
		this.oil = oil;
	}


	public int getMileage() {
		return mileage;
	}


	public void setMileage(int mileage) {
		this.mileage = mileage;
	}


	public String getCompany() {
		return company;
	}


	public void setCompany(String company) {
		this.company = company;
	}


	public String getOil() {
		return oil;
	}


	public void setOil(String oil) {
		this.oil = oil;
	}


	@Override
	public String toString() {
		return "Engine [mileage = " + mileage + ", company = " + company + ", oil = " + oil + "]";
	}


	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	

}
