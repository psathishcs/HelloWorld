package org.hello.jdbc.model;

import java.sql.Date;

public class Emp {
	Integer empNo;
	String eName;
	String job;
	Emp mgr;
	Date hireDate;
	Double sal;
	Double comm;
	Dept dept;
	
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
	public Emp getMgr() {
		return mgr;
	}
	public void setMgr(Emp mgr) {
		this.mgr = mgr;
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
	public Dept getDept() {
		return dept;
	}
	public void setDept(Dept dept) {
		this.dept = dept;
	}

	@Override
	public String toString(){
		StringBuilder builder = new StringBuilder();
		builder.append("empNo : " + empNo + ", ");
		builder.append("eName : " + eName + ", ");
		builder.append("job : " + job + ", " );
		builder.append("mgr : " + mgr.toString() + ", ");
		builder.append("hireDate : " + hireDate + ", " );
		builder.append("sal : " + sal + ", ");
		builder.append("comm : " + comm + ", " );
		builder.append("dept : " + dept );
		return builder.toString();
	}
}
