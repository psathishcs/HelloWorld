package org.hello.design.gof.behavioral.chainOfResponsibility;

public class VicePresident extends PurchasePower {
	private final double ALLOWABLE = 40 * base;
	
	public VicePresident(){} 
	public VicePresident(PurchasePower successor) {
		super(successor);
	}
	 
	@Override
	public void processRequest(PurchaseRequest request) {
		if (request.getAmount() < ALLOWABLE)
			System.out.println("VicePresident will approve $" +request.getAmount());
		else if (successor != null){
			successor.processRequest(request);
		 }
	 }
}
