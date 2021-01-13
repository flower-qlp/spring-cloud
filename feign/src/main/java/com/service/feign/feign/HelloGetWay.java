package com.service.feign.feign;

import com.service.feign.common.SchedualServiceHiHystric;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * feign实现负载均衡(内部也是运用了ribbon实现负载均衡)
 **/
@FeignClient(value = "service-client", fallbackFactory = SchedualServiceHiHystric.class)
public interface HelloGetWay {

    @GetMapping(value = "/hello")
    String helloWord();
}
