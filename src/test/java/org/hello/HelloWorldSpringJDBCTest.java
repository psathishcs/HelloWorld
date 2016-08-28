package org.hello;

import static org.junit.Assert.*;

import org.hello.dao.EmpDAO;
import org.hello.model.Emp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class HelloWorldSpringJDBCTest {
	@Autowired
	private EmpDAO empDAOImpl;
	@Test
	public void getEmpByIdTest() {
		Emp emp = empDAOImpl.getById(7788);
		assertEquals("SCOTT", emp.geteName());
		assertEquals("ANALYST", emp.getJob());
		
		
	}

}
