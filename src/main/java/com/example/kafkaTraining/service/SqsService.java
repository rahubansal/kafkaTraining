package com.example.kafkaTraining.service;

import org.springframework.cloud.aws.messaging.listener.annotation.SqsListener;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.stereotype.Service;

@Service
public class SqsService {

    @SqsListener("demoqueue.fifo")
    public void receiveMessage(String message,
                               @Header("SenderId") String senderId) {
        System.out.println(message + "-->" + senderId);
    }

}
