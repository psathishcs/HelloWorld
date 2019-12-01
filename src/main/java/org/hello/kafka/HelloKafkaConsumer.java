package org.hello.kafka;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class HelloKafkaConsumer {
	public static void main(String[] args) {
		Properties properties = new Properties();
		properties.put("bootstrap.servers", "skylark.datalake:9092");
		properties.put("group.id", "hello-kafka-java-group");
		properties.put("key.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
		properties.put("value.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
		KafkaConsumer<String ,String> kafkaConsumer = new KafkaConsumer<>(properties);
		Map topicMap = kafkaConsumer.listTopics();
		System.out.println("Avaliable Topics in the Kafka Broker : " + topicMap.keySet());
	
		List<String> topics = new ArrayList<String>();
		topics.add("Hello-Kafka");
		kafkaConsumer.subscribe(topics);
	
		try {
				while(true){
					ConsumerRecords<String, String> consumerRecords = kafkaConsumer.poll(1000);
					for (ConsumerRecord record: consumerRecords ) {
						System.out.println(record.topic() + ", " + record.partition() + ", " + record.value());
					}
				}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			kafkaConsumer.close();
		}
		
		
		
	}
}
