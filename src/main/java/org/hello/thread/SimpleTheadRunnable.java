package org.hello.thread;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
/**
 * 
 * @author SathishParthasarathy
 * 	1) Runnable interface is older than Callable, there from JDK 1.0, while Callable is added on Java 5.0.
 *	2) Runnable interface has run() method to define task while Callable interface uses call() 
 *	   method for task definition.
 *	3) run() method does not return any value, it's return type is void while call method returns value.
 *	   Callable interface is a generic parameterized interface and Type of value is provided, 
 *	   when instance of Callable implementation is created.
 *	4) Another difference on run and call method is that run method can not throw checked exception, while call method can throw checked exception in Java.
 */

public class SimpleTheadRunnable {
	public static ExecutorService executor = null;
	public static volatile Future taskOneResults = null;
	public static volatile Future taskTwoResults = null;
	
	public static void main(String[] args){
		executor = Executors.newFixedThreadPool(2);
		while(true) {
			try {
				checkTasks();
				Thread.sleep(1000);
			}catch (Exception e) {
				System.err.println("Caught exception " + e.getMessage());
			}
			
		}
	}
	private static void checkTasks() throws Exception {
		if (taskOneResults == null 
				|| taskOneResults.isDone() || taskOneResults.isCancelled()) {
			taskOneResults = executor.submit(new TestRunOne());
			
		}
		if (taskTwoResults == null 
				|| taskTwoResults.isDone() || taskTwoResults.isCancelled()){
			taskTwoResults = executor.submit(new TestRunTwo());
		}
	}
}

class TestRunOne implements Runnable {
	@Override
	public void run() {
		while(true){
			System.out.println("Executing task one!");
			try {
				Thread.sleep(1000);
			}catch(Throwable e){
				e.printStackTrace();
			}
		} 
		
	}
}

class TestRunTwo implements Runnable {
	@Override
	public void run() {
		while(true){
			System.out.println("Executing task two!");
			try {
				Thread.sleep(1000);
			}catch(Throwable e){
				e.printStackTrace();
			}
		} 
		
	}
}
