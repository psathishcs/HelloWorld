package org.hello.design.gof.structural.decorator;

/**
 * 
 * @author SathishParthasarathy
 *
 * Decorator pattern allows a user to add new functionality to an existing object without 
 * altering its structure. This type of design pattern comes under structural pattern as this
 * pattern acts as a wrapper to existing class.
 */
public class DecoratorPatternDemo {
	public static void main(String[] args) {
		Shape circle = new  Circle();
		Shape redCircle = new RedShapeDecorator(new Circle());
	//	Shape redRectangle = new RedShapeDecorator(new Rectangle());
		System.out.println("Circle with normal border");
		circle.draw();
		System.out.println("Circle with Red border");
		redCircle.draw();
		System.out.println("Rectangle with Red border");
	//	redRectangle.draw();
		
		
	}
}
