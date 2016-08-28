package org.hello.design.gof.structural.composite;

public class Manager {
	Manager mgr;
	Employee[] ely;
	String dept;
	
	public Manager(Manager mgr, Employee[] ely, String dept) {
		this.mgr = mgr;
		this.ely = ely;
		this.dept = dept;
	}
	
	public Manager(Employee[] ely, String dept) {
		this.ely = ely;
		this.dept = dept;
	}
    
	String getDept() {
	    return dept;
	}
	
	Manager getManager() {
	    return mgr;
	}
	
	Employee[] getEmployee() {
	    return ely;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return dept + " manager";
	}
	
}
