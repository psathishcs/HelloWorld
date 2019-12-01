package org.hello.design.gof.creational.factory;

import java.awt.*;

public class PaintingFactory {
	Point x, y;
	int width, height, radius;
	public PaintingFactory(Point x, Point y, int w, int h, int r) {
		this.x = x;
		this.y = y;
		width = w;
		height = h;
		radius = r;
	}
	
	Shape drawLine() {
		return new Line(x,y);
	}
	
	Shape drawSquare() {
		return new Square(x, width, height);
	}
	Shape drawCircle(){
		return new Circle(x, radius);
	}
}
