package org.hello.hibernate.xml;

import java.sql.Date;

import org.hello.hibernate.xml.model.Emp;
import org.hibernate.Session;

public class HelloHibernateXML {
	public static void main(String[] args){
		System.out.println("Gralde + Hibernate + Oracle!");
		Session session = HibernateUtilXML.getSessionFactory().openSession();
		session.beginTransaction();
		Emp emp = new Emp(7937, "Sathish", "SSE", 7839, new Date(11, 01, 16 ), new Double(8300), new Double(1400), 20);
		session.save(emp);
		session.getTransaction().commit();
	}
}
