package org.hello.design.gof.structural.facade;

public class Square implements Shape{
	@Override
	public void draw() {
		System.out.println("Shape : Square");
	}
}
