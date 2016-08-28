package org.hello.design.gof.structural.composite;

/**
 * 
 * @author SathishParthasarathy
 * 
 * Build a complex object out of elemental objects and itself like a tree structure.
 * 
 * Where to use & benefits
   -----------------------
 *  Want to represent a part-whole relationship like tree folder system
 *  Group components to form larger components, which in turn can be grouped to form still larger components.
 *  Related patterns include
 *      Decorator, which is often used with composite pattern and with the same parent class.
 *      Flyweight, which is used with composite pattern to share components.
 *      Iterator, which is used to traverse the composites.
 *      Visitor, which localizes operations across composite and leaf classes. 
 
 */
public class CompositeDemo {
	public static void main(String[] args){
		Employee[] e1 = {new Employee("Aaron", 50), new Employee("Betty", 60)};
		Manager m1 = new Manager(e1, "Accounting");
		Employee[] e2 = {new Employee("Cathy", 70), new Employee("Dan", 80), new Employee("Eliz", 90)};
		Manager m2 = new Manager(m1,e2,  "Production");
		System.out.println(m2); 
		Employee[] emps = m2.getEmployee();
		if (emps != null){
			for(Employee emp:emps){
				System.out.println (" " + emp);
			}
		}
		Manager m = m2.getManager();
		System.out.println(" " + m);
		if (m != null){
			emps = m.getEmployee();
			if (emps != null){
				for(Employee emp:emps){
					System.out.println("  " + emp);
				}
			}
		}
		
	}
}
