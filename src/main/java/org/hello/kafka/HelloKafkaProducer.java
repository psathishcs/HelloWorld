package org.hello.kafka;

import java.util.Properties;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;

public class HelloKafkaProducer {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		Properties properties = new Properties();
		properties.put("bootstrap.servers", "skylark.datalake:9092");
		properties.put("group.id", "hello-kafka-java-group");
		properties.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
		properties.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");
		KafkaProducer kafkaProducer = new KafkaProducer(properties);
		try {
			for (int i = 0; i < 100; i++) {
				kafkaProducer.send(new ProducerRecord("Hello-Kafka", Integer.toString(i), "test message - " + i));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			kafkaProducer.close();
		}
		
		
	}

}
