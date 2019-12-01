package org.hello.json;

import java.math.BigDecimal;
import java.util.List;

public class Staff {
	private String name;
	private int age;
	private String position;
	private BigDecimal Salary;
	private List<String> skills;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public BigDecimal getSalary() {
		return Salary;
	}
	public void setSalary(BigDecimal salary) {
		Salary = salary;
	}
	public List<String> getSkills() {
		return skills;
	}
	public void setSkills(List<String> skills) {
		this.skills = skills;
	}
	
	
}
