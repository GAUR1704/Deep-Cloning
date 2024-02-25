package com.prowings.deepClonning;

public class TestDeepClonning {

	public static void main(String[] args) {

		Address address = new Address(1234, "Pune", "India");

		NewEmployee emp1 = new NewEmployee(10, "Gaurav", address);

		NewEmployee emp2 = null;

		try {

			emp2 = (NewEmployee) emp1.clone();
		}

		catch (CloneNotSupportedException e) {

			e.printStackTrace();
		}
		
		System.out.println("Before changing the object");
		System.out.println("Employee1 : " + emp1);
		System.out.println("Employee2 : " + emp2);
		
		emp1.setName("Shyam");
		
		emp1.getAddress().setCity("Mumbai");
		
		System.out.println("After changing the object");
		System.out.println("Employee1 : " + emp1);
		System.out.println("Employee2 : " + emp2);
		
		

	}

}
