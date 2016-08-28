package org.hello.design.gof.creational.factory;

import java.awt.Point;

import oracle.net.aso.p;
import oracle.net.aso.s;

public class FactoryMain {
	public static void main(String[] args){
		Point x = new Point();
		x.setLocation(30.53, 56.333);
		Point y = new Point();
		y.setLocation(50.53, 26.333);

		PaintingFactory painting = new  PaintingFactory(x, y, 20,53, 46);
		Line line = (Line)painting.drawLine();
		line.draw();
		
		Square square = (Square)painting.drawSquare();
		square.draw();
	}
}
