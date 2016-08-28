package org.hello.design.gof.behavioral.chainOfResponsibility;

public class Director extends PurchasePower{
	private final double ALLOWABLE = 20 * base;
	
	public Director(){}
	public Director(PurchasePower successor) {
		 super(successor);
	}
	 
	@Override
	public void processRequest(PurchaseRequest request) {
		if (request.getAmount() < ALLOWABLE)
			System.out.println("Director will approve $" +request.getAmount());
		else if (successor != null){
			successor.processRequest(request);
		 }
	}	
}
