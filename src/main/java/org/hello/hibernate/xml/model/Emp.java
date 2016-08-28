package org.hello.hibernate.xml.model;

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
	
	public Emp() {
		// TODO Auto-generated constructor stub
	}

	public Emp(Integer empNo, String eName, String job, Date hireDate, Double sal, Double comm) {
		this.empNo = empNo;
		this.eName = eName;
		this.job = job;
		this.hireDate = hireDate;
		this.sal = sal;
		this.comm = comm;
	}
	
	public Emp(Integer empNo, String eName, String job, Integer mgr, Date hireDate, Double sal, Double comm, Integer dept) {
		this.empNo = empNo;
		this.eName = eName;
		this.job = job;
		if (mgr != null) {
			this.mgr = new Emp(mgr);
		}
		this.hireDate = hireDate;
		this.sal = sal;
		this.comm = comm;
		if (dept != null) {
			this.dept = new Dept(dept);
		}
	}
	
	public Emp(Integer empNo) {
		this.empNo = empNo;
	}
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
