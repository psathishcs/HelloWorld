package org.hello.design.gof.creational.factory;

import java.awt.Point;

public class Square implements Shape{
	Point start;
	int width, height;
	public Square(Point s, int w, int h) {
		start = s;
		width = w;
		height = h;
	}
	@Override
	public void draw() {
		System.out.println("Square : " + start.toString() + ", " + width + ", " + height);
	}
}
