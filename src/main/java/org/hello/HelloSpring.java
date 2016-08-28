package org.hello;

import org.hello.model.HelloMessage;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpring { //NOSONAR
	public static void main(String[] args){
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		HelloMessage helloMessage = (HelloMessage) context.getBean("helloMessageImpl");
		// get all the bean in the bean factory
		String beansName[] = context.getBeanDefinitionNames();
		int size = beansName.length;
		System.out.println(size);
		//pring all the bean name in the bean factory
		for(int i = 0;i < size; i++){
			System.out.println(beansName[i]); // NOSONAR
		}
		helloMessage.setMessage("Parthasarathy");
		System.out.println(helloMessage.sayHello());
		context.close();
	}
}
