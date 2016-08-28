package org.hello.design.gof.behavioral.chainOfResponsibility;

public class Manager extends PurchasePower{
	 private final double ALLOWABLE = 10 * base;
	 
	 public Manager(){}
	 public Manager(PurchasePower successor) {
		 super(successor);
	 }
	 
	 @Override
	 public void processRequest(PurchaseRequest request) {
		 if (request.getAmount() < ALLOWABLE)
			 System.out.println("Manager will approve $" +request.getAmount());
		 else if (successor != null){
			 successor.processRequest(request);
		 }
	 }	

}
