package org.hello.design.gof.creational.factory;

import java.awt.*;

public class Line implements Shape {
	Point x, y;
	public Line(Point x, Point y) {
		this.x = x;
		this.y = y;
	}
	@Override
	public void draw() {
		System.out.println("Line : " + x.toString() + ", " + y.toString());
	}
}
