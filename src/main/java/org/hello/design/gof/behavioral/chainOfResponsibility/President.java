package org.hello.design.gof.behavioral.chainOfResponsibility;

public class President extends PurchasePower{
	private final double ALLOWABLE = 60 * base;
	
	public President(){}
	public President(PurchasePower successor) {
		super(successor);
	}
	 
	@Override
	public void processRequest(PurchaseRequest request) {
		if (request.getAmount() < ALLOWABLE)
			System.out.println("President will approve $" +request.getAmount());
		else if (successor != null){
			successor.processRequest(request);
		 }
	 }	
}
