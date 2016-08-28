package org.hello.design.gof.behavioral.chainOfResponsibility;

public class PurchaseRequest {
	private int number;
    private double amount;
	private String purpose;
	
	public PurchaseRequest(int number, double amount, String purpose) {
		this.number = number;
		this.amount = amount;
		this.purpose = purpose;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

}
