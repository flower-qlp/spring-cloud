package com.service.feign.controller;

import com.service.feign.feign.HelloGetWay;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//配置刷新
@RefreshScope
public class HelloController {

    @Autowired
    private HelloGetWay helloGetWay;

    @Value("${flag}")
    private String flag;

    /**
     * 负载均衡
     **/
    @GetMapping(value = "/hi")
    public String hi() {
        return helloGetWay.helloWord() + flag;
    }
}
