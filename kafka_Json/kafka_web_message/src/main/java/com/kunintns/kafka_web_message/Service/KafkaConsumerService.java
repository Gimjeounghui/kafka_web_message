package com.kunintns.kafka_web_message.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.kunintns.kafka_web_message.Vo.MessageVO;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    @KafkaListener(topics = "3D-Digital-Twin", groupId = "3D-Digital-Twin", containerFactory = "kafkaListener")
    public void consumeRecord(MessageVO message) throws JsonProcessingException {

        System.out.println("ID = " + message.getId());
        System.out.println("position = " + message.getPosition());
        System.out.println("lng = " + message.getLng());
        System.out.println("lat = " + message.getLat());
        System.out.println("latitude = " + message.getTime());
    }
}

/*
@Service
public class KafkaConsumerService {

    @KafkaListener(topics = "input100-topic", groupId = "topic", containerFactory = "kafkaListener")
    public void consumeRecord(ConsumerRecord<String, MessageVO> record) {
        MessageVO message = record.value();
        System.out.println(String.format("Consumed message: %s", message));
    }
}*/