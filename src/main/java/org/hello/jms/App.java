package org.hello.jms;


public class App {
	public static void main(String[] args)  throws Exception{
		thread(new HelloWorldProducer(), false);
		thread(new HelloWorldProducer(), false);
		thread(new HelloWorldConsumer(), false);
        Thread.sleep(1000);
        
		thread(new HelloWorldProducer(), false);
		thread(new HelloWorldProducer(), false);
		thread(new HelloWorldProducer(), false);
		thread(new HelloWorldConsumer(), false);
        Thread.sleep(2000);
        
		thread(new HelloWorldConsumer(), false);
		thread(new HelloWorldConsumer(), false);
		thread(new HelloWorldConsumer(), false);
		thread(new HelloWorldProducer(), false);
		thread(new HelloWorldConsumer(), false);
        Thread.sleep(2000);
		
    	
	}

	private static void thread(Runnable runnable, boolean daemon) {
		Thread brokenThread  = new Thread(runnable);
		brokenThread.setDaemon(daemon);
		brokenThread.start();
	}
}

