package com.aspire.aspire;

public class Customer {

	private String name;
	private String address;
	private int CashInHand;
	private double scale;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getCashInHand() {
		return CashInHand;
	}

	public void setCashInHand(int cashInHand) {
		CashInHand = cashInHand;
	}

	public void purchaseCar(Vehicle vehicle, Employee employee ,boolean finance) {
		employee.handleCustomer(this, vehicle, finance);
	}

	public double getScale() {
		return scale;
	}

	public void setScale(double scale) {
		this.scale = scale;
	}
}
