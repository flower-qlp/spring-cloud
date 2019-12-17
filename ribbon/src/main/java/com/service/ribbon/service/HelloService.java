package com.service.ribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.service.ribbon.config.RestTemplateConf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.client.RestTemplate;

/**
 * @author happy
 */
@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hiError")//报错会走 错误的返回 如:异常捕捉
    public String hiService(String name) {
        if (StringUtils.isEmpty(name)) {
            throw new RuntimeException("Error");
        }
        return restTemplate.getForObject("http://service-client/hello", String.class);
    }

    public String hiError(String name) {
        return "Hi,Error!!!";
    }

}
