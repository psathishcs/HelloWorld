package org.hello.jms;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.MessageConsumer;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;

public class HelloJMSConsumer {
	private ConnectionFactory connectionFactory = null;
	private Connection connection = null;
	private Session session = null;
	private Destination destination = null;
	private MessageConsumer consumer = null;
	
	public String reveiveMessage() throws JMSException{
		connectionFactory = new ActiveMQConnectionFactory(ActiveMQConnection.DEFAULT_BROKER_URL);
		connection = connectionFactory.createConnection();
		connection.start();
		session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
		destination = session.createQueue("jms/HelloQueue");
		consumer = session.createConsumer(destination);
		TextMessage message = (TextMessage)consumer.receive();
		connection.close();
		return message.getText();
		
	}
	public static void main(String[] args) throws JMSException{
		HelloJMSConsumer helloJMSConsumer = new HelloJMSConsumer();
		System.out.println("Message Recived.....!");
		System.out.println(helloJMSConsumer.reveiveMessage());
		
	}
}
