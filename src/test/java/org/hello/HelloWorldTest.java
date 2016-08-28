package org.hello;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HelloWorldTest {
	@Test
	public void sayHelloTest(){
		assertEquals("Hello, World! Parthasarathy", HelloWorld.sayHello());
	}
	
}
