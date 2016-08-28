package org.hello.design.gof.behavioral.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import oracle.net.aso.i;

public class IteratorPatternDemo {
	public static void main(String[] args){
		List<Employee> employees = new ArrayList<>();
		employees.add(new Manager("Bill", 800.00));
		employees.add(new CommissionWorker("Newt", 400.0, 3.75, 159.99));
		employees.add(new PieceWorker("Al", 2.5, 200));
		employees.add(new HourlyWorker("Babara", 13.75, 40));
		employees.add(new Manager("Peter", 1200.00));
		employees.add(new CommissionWorker("Margret", 600.0,5.5, 200.25));
		employees.add(new PieceWorker("Mark", 4.5, 333));
		employees.add(new HourlyWorker("William", 31.25, 50));
		Iterator<Employee> iterator = employees.iterator();
		while (iterator.hasNext()){
			Employee employee = iterator.next();
			System.out.println(employee + "earns $" + employee.earnings());
		}
	}
}
