//package com.example.kafkaTraining.service;
//
//import com.example.kafkaTraining.model.*;
//import org.apache.kafka.common.serialization.Serde;
//import org.apache.kafka.common.serialization.Serdes;
//import org.springframework.kafka.support.serializer.JsonDeserializer;
//import org.springframework.kafka.support.serializer.JsonSerializer;
//import org.springframework.stereotype.Component;
//
//@Component
//public final class CustomSerdes {
//
//    private CustomSerdes() {}
//
//    public static Serde<AuthTopicValue> AuthTopicValue() {
//        JsonSerializer<AuthTopicValue> serializer = new JsonSerializer<>();
//        JsonDeserializer<AuthTopicValue> deserializer = new JsonDeserializer<>(AuthTopicValue.class);
//        return Serdes.serdeFrom(serializer, deserializer);
//    }
//
//    public static Serde<AuthTopicKey> AuthTopicKey() {
//        JsonSerializer<AuthTopicKey> serializer = new JsonSerializer<>();
//        JsonDeserializer<AuthTopicKey> deserializer = new JsonDeserializer<>(AuthTopicKey.class);
//        return Serdes.serdeFrom(serializer, deserializer);
//    }
//
//    public static Serde<Patient> Patient() {
//        JsonSerializer<Patient> serializer = new JsonSerializer<>();
//        JsonDeserializer<Patient> deserializer = new JsonDeserializer<>(Patient.class);
//        return Serdes.serdeFrom(serializer, deserializer);
//    }
//
//    public static Serde<Cased> Case() {
//        JsonSerializer<Cased> serializer = new JsonSerializer<>();
//        JsonDeserializer<Cased> deserializer = new JsonDeserializer<>(Cased.class);
//        return Serdes.serdeFrom(serializer, deserializer);
//    }
//
//    public static Serde<Service> Service() {
//        JsonSerializer<Service> serializer = new JsonSerializer<>();
//        JsonDeserializer<Service> deserializer = new JsonDeserializer<>(Service.class);
//        return Serdes.serdeFrom(serializer, deserializer);
//    }
//
//    public static Serde<Subscriber> Subscriber() {
//        JsonSerializer<Subscriber> serializer = new JsonSerializer<>();
//        JsonDeserializer<Subscriber> deserializer = new JsonDeserializer<>(Subscriber.class);
//        return Serdes.serdeFrom(serializer, deserializer);
//    }
//}
