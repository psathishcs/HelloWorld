package org.hello;

import static org.junit.Assert.assertEquals;

import org.hello.model.HelloMessage;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class HelloSpringTest {
	@Autowired
	HelloMessage  helloMessage;
	@Test
	public void sayHelloTest(){
		helloMessage.setMessage("Parthasarathy");
		assertEquals("Hello, World! Parthasarathy", helloMessage.sayHello());
	}
}
