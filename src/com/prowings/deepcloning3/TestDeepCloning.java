package com.prowings.deepcloning3;

public class TestDeepCloning {

	public static void main(String[] args) {
		Engine engine = new Engine(1200, "Petrol");

		Car car1 = new Car(25000, "Audi", engine);

		Car car2 = new Car(car1);

		System.out.println("Before chnging the object");

		System.out.println("Car1 : " + car1);

		System.out.println("Car2 ; " + car2);

		car1.getEngine().setOil("Disel");

		System.out.println("Before chnging the object");

		System.out.println("Car1 : " + car1);

		System.out.println("Car2 ; " + car2);

	}

}
