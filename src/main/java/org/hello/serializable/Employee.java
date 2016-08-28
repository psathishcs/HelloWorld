package org.hello.serializable;

import java.io.Serializable;
import java.sql.Date;



public class Employee implements Serializable{
	//private static final long serialVersionUID = -6470090944414208496L;
	private static final long serialVersionUID = -6470090944414208436L;
	Integer empNo;
	String eName;
	String job;
	Employee manager;
	Date hireDate;
	Double sal;
	Double comm;
	Department department;
	int ext;
	public Integer getEmpNo() {
		return empNo;
	}
	public void setEmpNo(Integer empNo) {
		this.empNo = empNo;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public Employee getManager() {
		return manager;
	}
	public void setManager(Employee manager) {
		this.manager = manager;
	}
	public Date getHireDate() {
		return hireDate;
	}
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	public Double getSal() {
		return sal;
	}
	public void setSal(Double sal) {
		this.sal = sal;
	}
	public Double getComm() {
		return comm;
	}
	public void setComm(Double comm) {
		this.comm = comm;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	
	public int getExt() {
		return ext;
	}
	public void setExt(int ext) {
		this.ext = ext;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.eName + ", ");
		sb.append(this.empNo + ", ");
		sb.append(this.hireDate.toString() + ", ");
		sb.append(this.comm + ", ");
		sb.append(this.job + ", ");
		sb.append(this.ext+ "Hello");
		if (this.manager != null) {
			sb.append(", Manager Name :  "+ this.manager.eName + ", ");
			sb.append(" Manager id  : "+ this.manager.empNo);
		}
		if (this.department != null) {
			sb.append(", Department Name  "+ this.department.dName + ", ");
			sb.append(" Department id  "+ this.department.dept);
		}
		return sb.toString();
	}

}
