package org.hello.design.gof.behavioral.observer;

/**
 * 
 * @author SathishParthasarathy
 *
 * Observer pattern is used when there is one-to-many relationship between objects 
 * such as if one object is modified, its depenedent objects are to be notified automatically.\
 * Observer pattern falls under behavioral pattern category.
 * 
 * One object changes state, all of its dependents are updated automatically.
 * 
 * Where to use & benefits
 *  One change affects one or many objects.
 *  Many object behavior depends on one object state.
 *  Need broadcast communication.
 *  AKA “Publish-Subscribe”.
 *  Maintain consistency between objects
 *  keep classes from becoming too tightly coupled, which would hamper reusability. 
 *
 */
public class ObserverPatternDemo {
	public static void main(String[] args){
		Subject subject = new Subject();
		new BinaryObserver(subject);
		new HexaObserver(subject);
		new OctalObserver(subject);
		System.out.println("First State Change 15");
		subject.setState(15);
		System.out.println("Second State Change 20");
		subject.setState(20);
	}
}
