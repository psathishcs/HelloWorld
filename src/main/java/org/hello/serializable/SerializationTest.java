package org.hello.serializable;

import java.io.IOException;
import java.sql.Date;




public class SerializationTest {
	public static void main(String[] args){
		String fileName="employee.ser";
		Employee employee = new Employee();
		Employee manager = new Employee();
		Department department = new Department();
		employee.setEmpNo(1001);
		employee.seteName("Parthasarathy");
		employee.setHireDate(new Date(02,15,1981));
		employee.setComm(2.245);
		employee.setJob("Tech Lead");
		employee.setManager(null);
		employee.setSal(6000.00);
		
		
		manager.setEmpNo(1002);
		manager.seteName("D Parthasarathy");
		employee.setManager(manager);
		
		department.setDept(200);
		department.setdName("IT");
		department.setLoc("Cloud");
		employee.setDepartment(department);
		
		try {
			SerializationUtil.serialize(employee, fileName);
		}catch(ClassNotFoundException | IOException e){
			e.printStackTrace();
		}
		Employee emp = null;
		try {
			emp = (Employee)SerializationUtil.deSerialize(fileName);
		}catch(ClassNotFoundException | IOException e){
			e.printStackTrace();
		}
		System.out.println(emp.toString());
		
		
	}
}
