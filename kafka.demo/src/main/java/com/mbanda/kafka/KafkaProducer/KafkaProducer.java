package com.mbanda.kafka.KafkaProducer;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import static java.lang.String.format;

@Service
@RequiredArgsConstructor
@Slf4j
public class KafkaProducer {
   private final KafkaTemplate<String, String> kafkaTemplate;

   public void publish (String message){
       log.info(format("Sending Message to testTopic:: %s ", message));
       kafkaTemplate.send("testTopic",message);
   }
}
