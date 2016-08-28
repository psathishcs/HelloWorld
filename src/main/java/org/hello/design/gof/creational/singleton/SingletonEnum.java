package org.hello.design.gof.creational.singleton;

public enum SingletonEnum {
	INSTANCE;
	
	public void show(){
		System.out.println("Singleton using enum in Java!");
	}
}
