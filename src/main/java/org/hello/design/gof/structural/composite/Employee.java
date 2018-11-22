package org.hello.design.gof.structural.composite;

public class Employee {
	private String name;
	private int salary;

	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;

	}
	@Override
	public String toString(){
		return ("Employee: " + name + ", " + " salary : $" + salary);
	}
	
}
