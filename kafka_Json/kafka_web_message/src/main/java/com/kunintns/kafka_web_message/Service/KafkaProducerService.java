package com.kunintns.kafka_web_message.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.kunintns.kafka_web_message.Vo.MessageVO;
import org.apache.kafka.common.protocol.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;


@Service
public class KafkaProducerService {
    private final KafkaTemplate<String, MessageVO> kafkaTemplate;
    private final String topic = "3D-Digital-Twin";

    @Autowired
    public KafkaProducerService(KafkaTemplate<String, MessageVO> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(MessageVO message) throws Exception {
        System.out.println("Producer: "+ message.getTime());
        kafkaTemplate.send(topic, message);
    }
}
