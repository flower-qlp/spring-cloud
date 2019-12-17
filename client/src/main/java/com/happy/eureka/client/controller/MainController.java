package com.happy.eureka.client.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author happy
 */
@RestController
public class MainController {

    @GetMapping(value = "/hello")
    public String helloWord() {
        return "hello word!8762";
    }

}
