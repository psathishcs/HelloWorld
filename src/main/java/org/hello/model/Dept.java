package org.hello.model;

public class Dept implements Comparable {
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
	public String toString(){
		StringBuilder builder = new StringBuilder();
		builder.append(dept + ", ");
		builder.append(dName);
		return builder.toString();
	}
	@Override
	public int compareTo(Object o1) {
		Dept dept = (Dept)o1;
		if (this.dept == dept.dept)
			return 0;
		else if (this.dept > dept.dept)
			return 1;
		else 
			return -1;
	}
	
	
}
