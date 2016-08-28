package org.hello.design.gof.creational.singleton;

public class SingletonPattern {
	int i;
	private static  SingletonPattern INSTANCE  = new SingletonPattern() ;
	
	private SingletonPattern(){}
	
	public static  SingletonPattern getInstance(){

		return INSTANCE;
	}
	
	public String saySingletonPattern() {
		return "Value : " + i;
	}
	
}
