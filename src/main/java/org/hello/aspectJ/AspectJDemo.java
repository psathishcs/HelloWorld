package org.hello.aspectJ;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AspectJDemo {
	public static void main(String[] args) throws Exception{
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		
		CustomerBo customerBo = context.getBean("customerBoImpl", CustomerBo.class);
		customerBo.addCustomer();
		customerBo.addCustomerAround("Reena");
		customerBo.addCustomerReturnValue();
		customerBo.addCustomerThrowException();
	}
}
