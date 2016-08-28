package org.hello.design.gof.creational.factory;

import java.awt.Point;

public class Circle implements Shape{
	Point x;
	int radius;
	public Circle(Point x, int r) {
		this.x = x;
		radius = r;
	}
	@Override
	public void draw() {
		System.out.println("Circle : " + x.toString() + ", " + radius);
	}
}
