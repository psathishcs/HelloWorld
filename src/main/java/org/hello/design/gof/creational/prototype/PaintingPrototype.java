package org.hello.design.gof.creational.prototype;

import java.awt.Point;

public class PaintingPrototype {
	public static void main(String[] args){
		Point x = new Point();
		x.setLocation(30.53, 56.333);
		Point y = new Point();
		y.setLocation(50.53, 26.333);
		
		int width = 34, height=33, radius=323;
		
		Shape shape1 = new Line(x, y);
		Shape shape2 = new Square(x, width, height);
		Shape shape3 = new Circle(x, radius);
		paint(shape1);
		paint(shape2);
		paint(shape3);
	}
	static void paint(Shape s){
		s.draw();
	}
}
