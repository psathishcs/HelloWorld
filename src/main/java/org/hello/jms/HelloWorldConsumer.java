package org.hello.jms;

import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

public class HelloWorldConsumer implements Runnable, ExceptionListener {
	@Override
	public void run() {
		// 	TODO Auto-generated method stub
		try {
			ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory(ActiveMQConnection.DEFAULT_BROKER_URL);
			Connection connection = connectionFactory.createConnection();
		
			connection.start();
			Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
		
			Destination destination = session.createQueue("Test.foo");
			MessageConsumer consumer = session.createConsumer(destination);

			Message message = consumer.receive(1000);
			if (message instanceof TextMessage){
				TextMessage textMessage = (TextMessage)message;
				String text = textMessage.getText();
				System.out.println(" Recived : " + text);
			}else {
				System.out.println("Recived : " + message);
			}
			
			consumer.close();
			session.close();
			connection.close();
			
			
		}catch(Exception e){
			System.out.println("caught: " + e);
			e.printStackTrace();
		}
	}

	@Override
	public void onException(JMSException exception) {
		// TODO Auto-generated method stub
		System.out.println("JMS Exception occured. Shutting down client. ");
	}

}
