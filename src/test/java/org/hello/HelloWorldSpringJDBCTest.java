package org.hello;

import org.hello.dao.EmpDAO;
import org.hello.model.Emp;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertEquals;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
@Ignore
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
