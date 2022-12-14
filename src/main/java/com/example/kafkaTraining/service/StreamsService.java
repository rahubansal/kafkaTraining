//package com.example.kafkaTraining.service;
//
//import com.example.kafkaTraining.model.*;
//import org.apache.kafka.common.serialization.Serde;
//import org.apache.kafka.common.serialization.Serdes;
//import org.apache.kafka.streams.KeyValue;
//import org.apache.kafka.streams.StreamsBuilder;
//import org.apache.kafka.streams.kstream.Consumed;
//import org.apache.kafka.streams.kstream.KStream;
//import org.apache.kafka.streams.kstream.Produced;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//@Component
//public class StreamsService {
//
//    @Autowired
//    public void process(StreamsBuilder streamsBuilder) {
//
//        Serde<AuthTopicKey> keySerde = CustomSerdes.AuthTopicKey();
//        Serde<AuthTopicValue> valueSerde = CustomSerdes.AuthTopicValue();
//        Serde<Patient> patientSerde = CustomSerdes.Patient();
//        Serde<Cased> caseSerde = CustomSerdes.Case();
//        Serde<Service> serviceSerde = CustomSerdes.Service();
//        Serde<Subscriber> subscriberSerde = CustomSerdes.Subscriber();
//
//        KStream<AuthTopicValue, AuthTopicValue> kStream = streamsBuilder.stream("health", Consumed.with(valueSerde, valueSerde));
//
//        kStream.peek((key, value) -> System.out.println(" - " + value.toString()))
//                .map((key, value) -> (new KeyValue<String, Patient>("patient", value.getPatient())))
//                .peek((key, value) -> System.out.println("Key: " + key + " value: " + value.toString()))
//                .to("patient", Produced.with(Serdes.String(), patientSerde));
//
//        kStream.peek((key, value) -> System.out.println(" - " + value.toString()))
//                .map((key, value) -> (new KeyValue<String, Cased>("cased", value.getCased())))
//                .peek((key, value) -> System.out.println("Key: " + key + " value: " + value.toString()))
//                .to("cased", Produced.with(Serdes.String(), caseSerde));
//
//        kStream.peek((key, value) -> System.out.println(" - " + value.toString()))
//                .map((key, value) -> (new KeyValue<String, Subscriber>("subscriber", value.getSubscriber())))
//                .peek((key, value) -> System.out.println("Key: " + key + " value: " + value.toString()))
//                .to("subscriber", Produced.with(Serdes.String(), subscriberSerde));
//
//        kStream.peek((key, value) -> System.out.println(" - " + value.toString()))
//                .map((key, value) -> (new KeyValue<String, Service>("service", value.getService())))
//                .peek((key, value) -> System.out.println("Key: " + key + " value: " + value.toString()))
//                .to("service", Produced.with(Serdes.String(), serviceSerde));
//
//    }
//
//}
