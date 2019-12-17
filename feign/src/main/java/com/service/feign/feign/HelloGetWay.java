package com.service.feign.feign;

import com.service.feign.common.SchedualServiceHiHystric;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "service-client",fallback = SchedualServiceHiHystric.class )
public interface HelloGetWay {

    @GetMapping(value = "/hello")
    String helloWord();
}
