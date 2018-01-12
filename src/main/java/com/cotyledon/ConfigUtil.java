package com.cotyledon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class ConfigUtil {
    @Autowired
    TranslationKafkaConfig kc;
   public   String getHello(){
        return kc.getKafkaServer();
    }

}
