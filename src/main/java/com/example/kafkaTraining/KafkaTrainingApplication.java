package com.example.kafkaTraining;

import org.springframework.beans.factory.annotation.Value;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.aws.messaging.config.annotation.EnableSqs;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.annotation.EnableKafkaStreams;

//@EnableKafkaStreams
//@EnableKafka
@SpringBootApplication
//@EnableSqs
public class KafkaTrainingApplication {

    public static void main(String[] args) {
        SpringApplication.run(KafkaTrainingApplication.class, args);
    }

//    @Value("${kafka.topic.name}")
//    private String topicName;
//
//    @Bean
//    public NewTopic authTopic() {
//        return new NewTopic(topicName, 3, (short) 3);
//    }
//
//    @Value("${kafka.topic.case.name}")
//    private String topicCase;
//
//    @Value("${kafka.topic.subscriber.name}")
//    private String topicSubscriber;
//
//    @Value("${kafka.topic.patient.name}")
//    private String topicPatient;
//
//    @Value("${kafka.topic.service.name}")
//    private String topicService;
//
//    @Bean
//    public NewTopic newCaseTopic() {
//        return new NewTopic(topicCase, 1, (short) 3);
//    }
//
//    @Bean
//    public NewTopic newServiceTopic() {
//        return new NewTopic(topicService, 1, (short) 3);
//    }
//
//    @Bean
//    public NewTopic newSubscriberTopic() {
//        return new NewTopic(topicSubscriber, 1, (short) 3);
//    }
//
//    @Bean
//    public NewTopic newPatientTopic() {
//        return new NewTopic(topicPatient, 1, (short) 3);
//    }
}
