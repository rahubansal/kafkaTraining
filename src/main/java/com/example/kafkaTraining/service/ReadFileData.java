//package com.example.kafkaTraining.service;
//
//import com.example.kafkaTraining.model.AuthTopicKey;
//import com.example.kafkaTraining.model.AuthTopicValue;
//import com.example.kafkaTraining.util.PojoFromString;
//import lombok.RequiredArgsConstructor;
//import org.springframework.boot.context.event.ApplicationStartedEvent;
//import org.springframework.context.event.EventListener;
//import org.springframework.core.io.ClassPathResource;
//import org.springframework.stereotype.Service;
//
//import java.io.*;
//import java.util.List;
//import java.util.Objects;
//
//@Service
//@RequiredArgsConstructor
//public class ReadFileData {
//    private final PojoFromString pojoFromString;
//    private final ProducerService producerService;
//
//    @EventListener(ApplicationStartedEvent.class)
//    public void readFileData() throws IOException {
////        File file = new File("resources/TextFiles");
////        String absolutePath = file.getAbsolutePath();
////        System.out.println("***");
////        System.out.println(absolutePath);
//        File sourceFolder = new File("/Users/rahubansal/Documents/PROJECTS/Kafka_Training/kafkaTraining/src/main/resources/TextFiles");
//        File[] files = Objects.requireNonNull(sourceFolder.listFiles());
//        for (File sourceFile : files) {
//            String fileName = sourceFile.getName();
//            try {
//                FileReader fr = new FileReader(sourceFile);
//                BufferedReader br = new BufferedReader(fr);
//                String line;
//                AuthTopicValue authTopic = new AuthTopicValue();
//                while ((line = br.readLine()) != null) {
//                    String recordType = line.trim();
//                    if (line.length() < 3) continue;
//                    switch (recordType.substring(0, 3)) {
//                        case "SUB": {
//                            authTopic.setSubscriber(pojoFromString.getSubscriberFromString(line));
//                            break;
//                        }
//                        case "PAT": {
//                            authTopic.setPatient(pojoFromString.getPatientFromString(line));
//                            break;
//                        }
//
//                        case "CAS": {
//                            authTopic.setCased(pojoFromString.getCaseFromString(line));
//                            break;
//                        }
//
//                        case "SVC": {
//                            authTopic.setService(pojoFromString.getServiceFromString(line));
//                            break;
//                        }
//
//                        default:
//                            System.out.println("No value Matched");
//                            break;
//                    }
//                    if (authTopic.getCased() != null && authTopic.getPatient() != null && authTopic.getSubscriber() != null && authTopic.getService() != null) {
//                        AuthTopicKey key = new AuthTopicKey();
//                        key.setDateString(fileName);
//                        producerService.send(key, authTopic);
//                        pojoFromString.cleanAuthTopic(authTopic);
//                    }
//                }
//                br.close();
//                fr.close();
//                System.out.println("******************** " + fileName + " read successfully");
//
//            } catch (FileNotFoundException e) {
//                throw new RuntimeException(e);
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }
//}
