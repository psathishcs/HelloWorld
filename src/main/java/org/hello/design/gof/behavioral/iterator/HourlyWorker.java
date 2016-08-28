package org.hello.design.gof.behavioral.iterator;

public class HourlyWorker implements Employee {
	private double hourlyWage;
	private double hours;
	private String name;
	public HourlyWorker(String name, double w, double h) {
		this.name = name;
	    setHourlyWage(w);
	    setHours(h);
	}
	public void setHourlyWage(double hourlyWage){
		if (hourlyWage > 0){
			this.hourlyWage = hourlyWage;
		}else 
			this.hourlyWage = 0;
	}
	
	public void setHours(double hours){
		if (0 <= hours && hours < 168){
			this.hours = hours;
		}else 
			this.hours = 0;
	}
	
	public String getName(){
		return name;
	}

	@Override
	public double earnings() {
		return hourlyWage * hours;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "HourlyWorker : " + getName();
	}
}
