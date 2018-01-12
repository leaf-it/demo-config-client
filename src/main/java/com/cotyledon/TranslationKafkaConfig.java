package com.cotyledon;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TranslationKafkaConfig {
    @Value("${bootstrap.servers}")
    String kafkaServer;
    @Value("${key.deserializer}")
    String keyDeserializer;
    @Value("${value.deserializer}")
    String valueDeserializer;
    @Value("${deserializer.encoding}")
    String  deserializerEncoding;
    @Value("${enable.auto.commit}")
    String autoCommit;
    @Value("${auto.offset.reset}")
    String offSet;

    public String getKafkaServer() {
        return kafkaServer;
    }

    public void setKafkaServer(String kafkaServer) {
        this.kafkaServer = kafkaServer;
    }

    public String getKeyDeserializer() {
        return keyDeserializer;
    }

    public void setKeyDeserializer(String keyDeserializer) {
        this.keyDeserializer = keyDeserializer;
    }

    public String getValueDeserializer() {
        return valueDeserializer;
    }

    public void setValueDeserializer(String valueDeserializer) {
        this.valueDeserializer = valueDeserializer;
    }

    public String getDeserializerEncoding() {
        return deserializerEncoding;
    }

    public void setDeserializerEncoding(String deserializerEncoding) {
        this.deserializerEncoding = deserializerEncoding;
    }

    public String getAutoCommit() {
        return autoCommit;
    }

    public void setAutoCommit(String autoCommit) {
        this.autoCommit = autoCommit;
    }

    public String getOffSet() {
        return offSet;
    }

    public void setOffSet(String offSet) {
        this.offSet = offSet;
    }
}
