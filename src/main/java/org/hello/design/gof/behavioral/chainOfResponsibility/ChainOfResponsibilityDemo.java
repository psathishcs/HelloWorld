package org.hello.design.gof.behavioral.chainOfResponsibility;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * 
 * @author SathishParthasarathy
 * Chain of responsibility pattern creates a chain of receiver objects for a request.
 * This pattern decouples sender and receiver of a request based on type of request. 
 * This pattern comes under behavioral patterns.
 * Let more than one object handle a request without their knowing each other. 
 * Pass the request to chained objects until it has been handled.
 * Where to use & benefits
 * ------------------------
 *  One request should be handled by more than one object.
 *  Don't know which object should handle a request, probably more than one object will handle it automatically.
 *  Reduce coupling.
 *  Flexible in handling a request. 
 *  
 */
public class ChainOfResponsibilityDemo {
	public static void main(String[] args) throws IOException{
		Manager manager = new Manager();
		Director director = new Director();
		President president = new President();
		VicePresident vicePresident = new VicePresident();
		manager.setSuccessor(director);
		director.setSuccessor(vicePresident);
		vicePresident.setSuccessor(president);
		
		while(true){
			System.out.println("Enter the amount to check who should approve your expenditure.");
			System.out.println(">");
			double d = Double.parseDouble(new BufferedReader(new InputStreamReader(System.in)).readLine());
			manager.processRequest(new PurchaseRequest(0, d, "Gendral"));
		}
	}
}
