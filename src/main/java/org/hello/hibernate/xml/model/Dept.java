package org.hello.hibernate.xml.model;

public class Dept {
	Integer deptNo;
	String dName;
	String loc;
	
	public Dept() {
		// TODO Auto-generated constructor stub
	}
	public Dept(Integer deptNo) {
		this.deptNo = deptNo;
	}
	
	public Dept(Integer deptNo, String dName, String loc) {
		this.deptNo = deptNo;
		this.dName = dName;
		this.loc = loc;
	}

	public Integer getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(Integer deptNo) {
		this.deptNo = deptNo;
	}
	public String getdName() {
		return dName;
	}
	public void setdName(String dName) {
		this.dName = dName;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}

	@Override
	public String toString(){
		StringBuilder builder = new StringBuilder();
		builder.append("deptNo : " + deptNo + ", ");
		builder.append("dName : " + dName + ", ");
		builder.append("loc : " + loc);
		return builder.toString();
	}
	
}
