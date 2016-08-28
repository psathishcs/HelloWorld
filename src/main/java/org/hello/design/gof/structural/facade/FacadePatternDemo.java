package org.hello.design.gof.structural.facade;
/**
 * 
 * @author SathishParthasarathy
 *
 * Facade pattern hides the complexities of the system and provides an interface to the client
 * using which the client can access the system. This type of design pattern comes under 
 * structural pattern as this pattern adds an interface to existing system to hide its complexities.
 *
 * This pattern involves a single class which provides simplified methods required by client
 * and delegates calls to methods of existing system classes.
 *
 *Where to use & benefits
 *-----------------------
 *
 *  Want to reduce complexities of a system.
 *  Decouple subsystems , reduce its dependency, and improve portability.
 *  Make an entry point to your subsystems.
 *  Minimize the communication and dependency between subsystems.
 *  Security and performance consideration.
 *  Shield clients from subsystem components.
 *  Simplify generosity to specification.
 *  Related patterns include
 *      Abstract Factory, which is often used to create an interface for a subsystem in an independent way, and can be used as an alternative way to a facade.
 *      Singleton, which is often used with a facade.
 *      Mediator, which is similar to facade, but a facade doesn't define new functionality to the subsystem. 
 */

public class FacadePatternDemo {
	public static void main(String[] args){
		ShapeMaker shapeMaker = new ShapeMaker();
		shapeMaker.drawCircle();
		shapeMaker.drawRectangle();
		shapeMaker.drawSquare();
	}
}
