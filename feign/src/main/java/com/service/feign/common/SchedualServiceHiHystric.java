package com.service.feign.common;

import com.service.feign.feign.HelloGetWay;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * 熔断
 *
 * @author happy
 */
@Component
public class SchedualServiceHiHystric implements FallbackFactory<HelloGetWay> {


    @Override
    public HelloGetWay create(Throwable throwable) {
        return new HelloGetWay() {
            @Override
            public String helloWord() {
                return "连接超时请重试！";
            }
        };
    }
}
