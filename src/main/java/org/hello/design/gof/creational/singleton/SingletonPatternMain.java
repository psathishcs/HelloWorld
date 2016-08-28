package org.hello.design.gof.creational.singleton;

public class SingletonPatternMain {
	public static void main(String[] args){
		SingletonPattern singletonPattern1 = SingletonPattern.getInstance();
		singletonPattern1.i = 10;
		System.out.println(singletonPattern1.saySingletonPattern());
		SingletonPattern singletonPattern2 = SingletonPattern.getInstance();
		System.out.println(singletonPattern2.saySingletonPattern());
		
	}
}
