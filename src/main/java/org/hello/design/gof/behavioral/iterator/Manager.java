package org.hello.design.gof.behavioral.iterator;

public class Manager implements Employee {
	private double weeklySalary;
	private String name;
	
	public Manager(String name, double weeklySalary) {
		this.weeklySalary = weeklySalary;
		this.name = name;
	}
	
	void setWeeklySalary(double s){
		if (s > 0) {
			weeklySalary = s;
		}else 
			weeklySalary = 0;
	}
	
	public String getName(){
		return name;
	}

	@Override
	public double earnings() {
		return weeklySalary;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Manager : " + getName();
	}

}
