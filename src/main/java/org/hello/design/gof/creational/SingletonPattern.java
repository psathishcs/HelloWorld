package org.hello.design.gof.creational;

public class SingletonPattern {
	int i;
	private static  SingletonPattern instance;
	
	private SingletonPattern(){}
	
	public static synchronized SingletonPattern getInstance(){
		if (instance == null) {
			instance = new SingletonPattern();
		}
		return instance;
	}
	
	public String saySingletonPattern() {
		return "Value : " + i;
	}
	
}
