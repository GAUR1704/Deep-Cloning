package com.prowings.deepclonning2;

public class TestDeepClonning {

	public static void main(String[] args) {
		
		Engine engine = new Engine(15, "Audi Engine", "Petrol");
		
		Car car1 = new Car(2023, "Audi", engine);
		
		Car car2 = null;
		
		try {
			car2 = (Car) car1.clone();
		} 
		catch (CloneNotSupportedException e) {
			
			e.printStackTrace();
		}
		
		System.out.println("Before changing the object");
		System.out.println("Car1 = " + car1);
		System.out.println("Car2 = " + car2);
		
		car1.setModel("Ferari");
		
		car1.getEngine().setOil("Disel");
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>..");
		
		System.out.println("After changing the object");
		System.out.println("Car1 = " + car1);
		System.out.println("Car2 = " + car2);
		
		
	}
}
