package org.hello.design.gof.structural.composite;

import java.util.ArrayList;
import java.util.List;

import oracle.net.aso.s;

import org.hello.model.Emp;

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
