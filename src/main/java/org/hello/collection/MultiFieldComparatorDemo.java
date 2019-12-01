package org.hello.collection;


import org.hello.dao.EmpDAO;
import org.hello.dao.EmpDAOImpl;
import org.hello.model.Emp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Collections;
import java.util.List;

public class MultiFieldComparatorDemo {
	public static void main(String[] args){
		 ApplicationContext context = 
	             new ClassPathXmlApplicationContext("applicationContext.xml");
		EmpDAO dao = (EmpDAOImpl)context.getBean("empDAOImpl");
		List<Emp> emps = dao.getAll();
		for (Emp emp :emps){
			if (emp.getEmpNo() == 7566 || emp.getEmpNo() == 7900)
				emp.seteName("ALLEN");
		}
		printEmpList(emps);
		Collections.sort(emps, new MultiFieldComparator());
		System.out.print("After Sorting...");
		printEmpList(emps);
	}
	private static void printEmpList(List<Emp> emps) {
		for (Emp emp :emps){
			System.out.print(emp.getEmpNo() + "\t, ");
			System.out.print(emp.geteName() + "\t, ");
			System.out.println(emp.getJob());
		}
	}
}

