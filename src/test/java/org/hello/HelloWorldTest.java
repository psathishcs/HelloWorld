package org.hello;

import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
@Ignore
public class HelloWorldTest {
	@Test
	public void sayHelloTest(){
		assertEquals("Hello, World! Parthasarathy", HelloWorld.sayHello());
	}
	
}
