package com.prowings.deepcloning3;

public class Engine {
	
	private int power;
	private String oil;
	
	public Engine() {
		super();
	}

	public Engine(int power, String oil) {
		super();
		this.power = power;
		this.oil = oil;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public String getOil() {
		return oil;
	}

	public void setOil(String oil) {
		this.oil = oil;
	}

	@Override
	public String toString() {
		return "Engine [power=" + power + ", oil=" + oil + "]";
	}
	
	
	
}
