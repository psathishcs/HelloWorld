package org.hello.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpring {
	public static void main(String[] args){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		HelloBean bean = (HelloBean)context.getBean("helloBean");
		System.out.println(bean.getMessage());
		
	}
}
