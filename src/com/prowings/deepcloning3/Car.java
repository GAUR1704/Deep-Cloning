package com.prowings.deepcloning3;

public class Car {
	
	private int price;
	private String name;
	private Engine engine;

	public Car() {
		super();
	}

	public Car(int price, String name, Engine engine) {
		super();
		this.price = price;
		this.name = name;
		this.engine = engine;
	}
	
	public Car(Car car) {
		
		
		this.price = car.getPrice();
		
		this.name = car.getName();
		
		Engine copyEngine = new Engine();
		
		copyEngine.setPower(car.getEngine().getPower());
		
		copyEngine.setOil(car.getEngine().getOil());
		
		this.engine = copyEngine;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Car [price=" + price + ", name=" + name + ", engine=" + engine + "]";
	}
	
	
	

}
