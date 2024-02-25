package com.prowings.deepclonning2;

public class Car implements Cloneable{
	
	private int make;
	private String model;
	private Engine engine;

	public Car() {
		super();
	}

	public Car(int make, String model, Engine engine) {
		super();
		this.make = make;
		this.model = model;
		this.engine = engine;
	}

	public int getMake() {
		return make;
	}

	public void setMake(int make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Car [make = " + make + ", model = " + model + ", engine = " + engine + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		Car clonedCar = (Car) super.clone();
		
		Engine clonedEngine = (Engine) this.engine.clone();
		
		clonedCar.setEngine(clonedEngine);
		
		return clonedCar;
		
	}
	
	

}
