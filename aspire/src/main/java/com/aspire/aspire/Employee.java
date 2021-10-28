package com.aspire.aspire;

public class Employee {
	public void handleCustomer(Customer cust, Vehicle vehicle, boolean finance) {
		if(finance == true) {
			double loanAmount = vehicle.getPrice() - cust.getCashInHand();
			runCredithistory(cust, loanAmount);
		}
		else if (vehicle.getPrice() <= cust.getCashInHand() ) {
			processTransaction(cust, vehicle);
		}
		else
		{
			System.out.println("Customer needs more Money to purchase the vehicle.");
		}
	}
	
	public void runCredithistory(Customer cust, double loanAmount) {
		System.out.println("Customer is approved to purchase the vehicle");
	}
	
	public void processTransaction(Customer cust, Vehicle vehicle) {
		System.out.println("Customer has purchased the vehicle " +vehicle + " for price "+vehicle.getPrice());
		System.out.println(Customer.getScale());
	}
	
}
