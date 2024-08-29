package com.ext.chatifyinternalapigateway.controller;

import org.apache.kafka.clients.producer.ProducerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafka")
public class KafkaProducerController {

    @Autowired
    private KafkaTemplate<ProducerRecord<String,String>,ProducerRecord<String,String>> kafkaTemplate;

    @PostMapping("/send")
    public String sendMessage(@RequestParam("message") String message) {
        ProducerRecord<String, String> stringStringProducerRecord = new ProducerRecord<>("chatify-internal-apigateway", message);
        kafkaTemplate.send("test-topic", stringStringProducerRecord);
        return "Message sent";
    }
}

