package com.service.feign.common;

import com.service.feign.feign.HelloGetWay;
import org.springframework.stereotype.Component;

/**
 * 熔断
 * @author happy
 */
@Component
public class SchedualServiceHiHystric implements HelloGetWay {


    @Override
    public String helloWord() {
        return "sorry ";
    }
}
