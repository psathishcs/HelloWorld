package org.hello.comparable;

import java.sql.Date;


public class ComparableTest {
	public static void main(String[] args){
		EmployeeComparable employee1 = new EmployeeComparable();
		employee1.setEmpNo(1001);
		employee1.seteName("Parthasarathy");
		employee1.setHireDate(new Date(02,15,1981));
		employee1.setComm(2.245);
		employee1.setJob("Tech Lead");
		employee1.setManager(null);
		employee1.setSal(6000.00);
		
		
		EmployeeComparable employee2 = new EmployeeComparable();
		employee2.setEmpNo(1002);
		employee2.seteName("Parthasarathy");
		employee2.setHireDate(new Date(02,15,1981));
		employee2.setComm(2.245);
		employee2.setJob("Tech Lead");
		employee2.setManager(null);
		employee2.setSal(6000.00);
		
		
		EmployeeComparable employee3 = new EmployeeComparable();
		employee3.setEmpNo(1002);
		employee3.seteName("Parthasarathy");
		employee3.setHireDate(new Date(02,15,1981));
		employee3.setComm(2.245);
		employee3.setJob("Tech Lead");
		employee3.setManager(null);
		employee3.setSal(6000.00);
		
		printResult(employee1, employee2);
		printResult(employee2, employee3);
		
	}
	public static void printResult(EmployeeComparable e1, EmployeeComparable e2){
		if (e1.compareTo(e2) == 1)
			System.out.println(e1.empNo + " greater that  " + e2.empNo);
		else if (e1.compareTo(e2) == -1)
			System.out.println(e2.empNo + " greater that  " + e1.empNo);
		else System.out.println(e1.empNo + " equal to " + e2.empNo);
	}
}
