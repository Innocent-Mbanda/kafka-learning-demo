package com.mbanda.kafka.RestController;

import com.mbanda.kafka.KafkaProducer.KafkaJsonProducer;
import com.mbanda.kafka.KafkaProducer.KafkaProducer;
import com.mbanda.kafka.Model.Student;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/messages")
public class MessageController {

    private final KafkaProducer kafkaTemplate;

    @PostMapping
    public ResponseEntity<String> sendMessage(@RequestBody String message){
         kafkaTemplate.publish(message);
        return ResponseEntity.ok("The message sent successfully");
    }

    private final KafkaJsonProducer kafkaJsonProducer;

    @PostMapping("json")
    public ResponseEntity<String> sendMessage(@RequestBody Student message){
        kafkaJsonProducer.sendJsonMessage(message);
        return ResponseEntity.ok("The message sent successfully as JSON");
    }
}
