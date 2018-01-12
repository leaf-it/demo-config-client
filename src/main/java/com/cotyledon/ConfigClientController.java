package com.cotyledon;

import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ConfigClientController {
    @Autowired
    ConfigUtil cu;
//    @Autowired
//    TranslationKafkaConfig cu;
    @RequestMapping("/con/hello")
    @ApiOperation(value="测试接口", notes="测试接口详细描述")
    public String getHello(){
        return  cu.getHello();
    }
//    @RequestMapping("/con/localhello")
//    public String getLocalHello(){
//        return hello;
//    }
}
