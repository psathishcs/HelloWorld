package org.hello.design.gof.behavioral.iterator;

public class CommissionWorker implements Employee{
	private double salary;
	private double commission;
	private double totalSales;
	private String name;	
	public CommissionWorker(String name, double salary, double commission,  double totalSales){
		this.name = name;
		this.salary = salary;
		this.commission = commission;
		this.totalSales = totalSales;
	}
	
	public void setSalary(double salary){
		if (salary > 0){
			this.salary = salary;
		}else 
			this.salary = 0;
	}
	
	public void setTotalSales(double totalSales){
		if (totalSales > 0){
			this.totalSales = totalSales;
		}else 
			this.totalSales = 0;
	}

	
	public void setCommission(double commission){
		if (commission > 0){
			this.commission = commission;
		}else 
			this.commission = 0;
	}


	
	public String getName() {
		return name;
	}
	
	@Override
	public double earnings() {
		return salary + commission/100*totalSales;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "CommissionWorker : " + getName();
	} 
}
