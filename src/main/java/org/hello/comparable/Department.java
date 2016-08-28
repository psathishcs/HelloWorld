package org.hello.comparable;

public class Department {
	private static final long serialVersionUID = -6470090944414308496L;
	Integer dept;
	String dName;
	String loc;
	public Integer getDept() {
		return dept;
	}
	public void setDept(Integer dept) {
		this.dept = dept;
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
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.dept + ", ");
		sb.append(this.dName + ", ");
		sb.append(this.loc);
		return sb.toString();
	}
}
