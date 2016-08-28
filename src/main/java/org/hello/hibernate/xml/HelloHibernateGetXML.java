package org.hello.hibernate.xml;

import java.sql.Date;
import java.util.List;

import org.hello.hibernate.xml.model.Emp;
import org.hibernate.Query;
import org.hibernate.Session;

public class HelloHibernateGetXML {
	public static void main(String[] args){
		System.out.println("Gralde + Hibernate + Oracle!");
		Session session = HibernateUtilXML.getSessionFactory().openSession();
		session.beginTransaction();
		Query query =session.createQuery("FROM Emp");
		List<Emp> emps = query.list();
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
