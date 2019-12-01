package org.hello.jms.rabbitmq;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import org.springframework.util.SerializationUtils;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class HelloRabbitMQConsume {
	public static void main(String[] args) throws IOException, TimeoutException{
		String endPointName = "hello-world-queue";
		ConnectionFactory connectionFactory = new ConnectionFactory();
		connectionFactory.setHost("docker.server.com");
		Connection connection = connectionFactory.newConnection();
		Channel channel = connection.createChannel();
		channel.queueDeclare(endPointName, false, false, false, null);
		String hellow = "Hello, World";
		channel.basicPublish("", endPointName, null, SerializationUtils.serialize(hellow));
		channel.close();
		connection.close();
		System.out.println("Publish to RabbitMQ");
	}
}
