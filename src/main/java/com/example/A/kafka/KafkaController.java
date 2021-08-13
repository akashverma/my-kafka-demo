package com.example.A.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaController {
    @Autowired
    private Producer producer;

    @PostMapping("/postMessage")
    public void sendMessage(@RequestParam("msg") String msg ){
        producer.publishToTopic(msg);
    }
}
