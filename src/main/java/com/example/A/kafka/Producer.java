package com.example.A.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Producer {

    //create a topic
    public static final String TOPIC = "mytopic";

    @Autowired
    private KafkaTemplate<String, String> kafkaTemp;

    public void publishToTopic(String message){
        System.out.println("Publishing to topic: " + message);
        kafkaTemp.send(TOPIC, message);
    }
}
