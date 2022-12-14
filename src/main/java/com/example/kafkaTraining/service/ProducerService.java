//package com.example.kafkaTraining.service;
//
//import com.example.kafkaTraining.model.AuthTopicKey;
//import com.example.kafkaTraining.model.AuthTopicValue;
//import lombok.RequiredArgsConstructor;
//import org.apache.kafka.clients.admin.NewTopic;
//import org.apache.kafka.clients.producer.ProducerRecord;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.kafka.core.KafkaTemplate;
//import org.springframework.kafka.support.SendResult;
//import org.springframework.stereotype.Component;
//
//import java.util.concurrent.ExecutionException;
//
//@Component
//@RequiredArgsConstructor
//public class ProducerService {
//
//    private final KafkaTemplate<AuthTopicKey, AuthTopicValue> kafkaTemplate;
//
//    @Value("${kafka.topic.name}")
//    private String topicName;
//
//    public void send(AuthTopicKey key, AuthTopicValue authTopic) {
//        try {
//            SendResult<AuthTopicKey, AuthTopicValue> sendResult = kafkaTemplate.send(topicName, key, authTopic).get();
//            ProducerRecord<AuthTopicKey, AuthTopicValue> producerRecord = sendResult.getProducerRecord();
//            System.out.println("Successfully produced record with key: " + producerRecord.key() + " and value: " + producerRecord.value());
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        } catch (ExecutionException e) {
//            throw new RuntimeException(e);
//        }
//    }
//}
