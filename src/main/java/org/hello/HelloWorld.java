package org.hello;

public class HelloWorld {
	private static String name = "Parthasarathy";
	public static void main(String[] args){
		System.out.println(sayHello()); // NOSONAR
	}
	public static String sayHello(){
		return "Hello, World! " + name;
	}
}
