package org.hello.design.gof.behavioral.observer;

public abstract class Observer {
	protected Subject subject;
	public abstract void update();
}
