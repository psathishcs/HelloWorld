package org.hello.jms;

import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

public class HelloWorldProducer  implements Runnable{
	@Override
	public void run() {
		try {
			ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory(ActiveMQConnection.DEFAULT_BROKER_URL);
			Connection connection = connectionFactory.createConnection();
		
			connection.start();
			Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
		
			Destination destination = session.createQueue("Test.foo");
			MessageProducer producer = session.createProducer(destination);
			producer.setDeliveryMode(DeliveryMode.NON_PERSISTENT);
			String text = "Hello, World From: " + Thread.currentThread().getName() + " : "  + this.hashCode();
			TextMessage message = session.createTextMessage(text);
			System.out.println("Send Message : " + message.hashCode() + " : " + Thread.currentThread().getName());
			producer.send(message);
			
			session.close();
			connection.close();
		}catch(Exception e){
			System.out.println("caught: " + e);
			e.printStackTrace();
		}
	}
}
