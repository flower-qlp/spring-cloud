package com.service.ribbon.controller;

import com.service.ribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    /**
     * 上面交替显示，说明实现了负载均衡，
     * ribbon 会在客户端发送请求时做一个负载均衡。
     **/
    @GetMapping(value = "/hi")
    public String hi(
            @RequestParam(value = "name", required = false) String name
    ) {
        return helloService.hiService(name);
    }
}
