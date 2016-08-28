package org.hello.serializable;

import java.io.Serializable;

/**
 * 
 * @author SathishParthasarathy
 * The Inner Class Need to serialsed other wise we will get run time execption 
 * java.io.NotSerializableException: org.hello.Serializable.Department
	at java.io.ObjectOutputStream.writeObject0(ObjectOutputStream.java:1183)
	at java.io.ObjectOutputStream.defaultWriteFields(ObjectOutputStream.java:1547)
	at java.io.ObjectOutputStream.writeSerialData(ObjectOutputStream.java:1508)
	at java.io.ObjectOutputStream.writeOrdinaryObject(ObjectOutputStream.java:1431)
	at java.io.ObjectOutputStream.writeObject0(ObjectOutputStream.java:1177)
	at java.io.ObjectOutputStream.writeObject(ObjectOutputStream.java:347)
	at org.hello.Serializable.SerializationUtil.serialize(SerializationUtil.java:21)
	at org.hello.Serializable.SerializationTest.main(SerializationTest.java:34)
 *
 */
public class Department implements Serializable {
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
