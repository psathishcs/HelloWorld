package org.hello.design.gof.behavioral.chainOfResponsibility;

public abstract class PurchasePower {
	protected final double base = 500;
	protected PurchasePower successor;
	
	public PurchasePower(){}

	public PurchasePower(PurchasePower successor) {
		this.successor = successor;
	}

	public void setSuccessor(PurchasePower successor) {
		this.successor = successor;
	}

	abstract public void processRequest(PurchaseRequest request);
}
