package com.aspire.aspire;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AspireApplication {

	public static void main(String[] args) {
		SpringApplication.run(AspireApplication.class, args);
		System.out.println("Hello all");
		
		Customer cust1 = new Customer();
		cust1.setName("Anmol");
		cust1.setAddress("Amritsar");
		cust1.setCashInHand(5000);
		cust1.setScale(900);
		// Approach 1
//		Vehicle vehicle = new Vehicle();
//		vehicle.setMake("Rolls Royce");
//		vehicle.setModel("RR");
//		vehicle.setPrice(1500);
		
		// Approach 2
		Vehicle vehicle = new Vehicle("Rolls Royce", "RR",1500 );
		
		Employee emp = new Employee();
		cust1.purchaseCar(vehicle, emp , false);
		
		// Test results
		Vehicle car = new Vehicle("BMW","BMW",2500);
		Vehicle car1 = new Vehicle("BMW","BMW",2500);
		boolean value = car.equals(car1);
		System.out.println(value);
		
	}

}
