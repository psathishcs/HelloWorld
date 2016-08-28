package org.hello.jms;

import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.ObjectMessage;
import javax.jms.Session;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

public class HelloSpringActiveMQJMS {
	public static void main(String[] args) throws JMSException{
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_ActiveMQJMS.xml");
		JmsTemplate jmsTemplate = (JmsTemplate) context.getBean("jmsTemplate");
		Destination destination = (Destination)context.getBean("destination");
		jmsTemplate.send(
			new MessageCreator() {
				@Override
				public Message createMessage(Session session) throws JMSException {
					ObjectMessage message = session.createObjectMessage();
					message.setObject("MyFirstMessageSpring!");
					return message;
				}
			}
		);
		System.out.println("Message Send to Queue : myMessageQueue" );
		Message recivedMessage = jmsTemplate.receive(destination);
		ObjectMessage  msg = (ObjectMessage)recivedMessage;
		System.out.println(msg.getObject().toString());
	}
}
