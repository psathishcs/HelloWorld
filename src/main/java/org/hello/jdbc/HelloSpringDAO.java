package org.hello.jdbc;

import org.hello.jdbc.dao.EmpDAO;
import org.hello.jdbc.model.Emp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;
import java.util.List;

public class HelloSpringDAO {
	public static void main(String[] args) throws SQLException{
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext_OracleDB_DAO.xml");
		EmpDAO empDAO = (EmpDAO)applicationContext.getBean("empDAOImpl");
		List<Emp> emps = empDAO.getAll();
		for(Emp emp:emps){
			System.out.print(emp.getEmpNo() + "\t");
			System.out.print(emp.geteName() + "\t");
			System.out.print(emp.getJob() + "\t");
			System.out.print(emp.getHireDate() + "\t");
			System.out.print(emp.getSal() + "\t");
			if (emp.getMgr() != null) {
				System.out.print(emp.getMgr().geteName() + "\t");
				System.out.print(emp.getMgr().getJob() + "\t");
			} else {
				System.out.print("null" + "\t");
				System.out.print("null" + "\t");
			}
			
			System.out.print(emp.getDept().getdName() + "\t");
			System.out.print(emp.getDept().getLoc() + "\n");
			
		}
	}
}
