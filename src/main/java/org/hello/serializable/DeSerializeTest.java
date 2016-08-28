package org.hello.serializable;

import java.io.IOException;

public class DeSerializeTest {
	public static void main(String[] args){
		String fileName="employee.ser";
		Employee emp = null;
		try {
			emp = (Employee)SerializationUtil.deSerialize(fileName);
		}catch(ClassNotFoundException | IOException e){
			e.printStackTrace();
		}
		System.out.println(emp.toString());
	}
}
