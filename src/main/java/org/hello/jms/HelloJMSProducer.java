package org.hello.jms;

import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

public class HelloJMSProducer {
	private ConnectionFactory connectionFactory = null;
	private Connection connection = null;
	private Session session = null;
	private Destination destination = null;
	private MessageProducer messageProducer = null;
	
	public void sendMessage(String message) throws JMSException{
		connectionFactory = new ActiveMQConnectionFactory(ActiveMQConnection.DEFAULT_BROKER_URL);
		connection = connectionFactory.createConnection();
		connection.start();
		session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
		destination = session.createQueue("jms/HelloQueue");
		messageProducer = session.createProducer(destination);
		TextMessage textMessage = session.createTextMessage();
		textMessage.setText(message);
		messageProducer.send(textMessage);
		connection.close();
		
	}
	public static void main(String[] args) throws JMSException{
		HelloJMSProducer helloJMSProducer = new HelloJMSProducer();
		helloJMSProducer.sendMessage("Hello, World!");
		System.out.println("Message Send.....!");
		
	}
}
