package com.mbanda.kafka.KafkaConsumer;

import com.mbanda.kafka.Model.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import static java.lang.String.format;

@Service
@Slf4j
public class KafkaConsumer {

//    @KafkaListener(topics = "testTopic", groupId = "myGroup")
    public void consumer(String message){
        log.info(format("consuming the Message from the testTopic:: %s ", message));

    }

    @KafkaListener(topics = "testTopic", groupId = "myGroup")
    public void consumeJsonMessage(Student student){
        log.info(format("consuming the Message from the testTopic:: %s ", student.toString()));

    }
}
