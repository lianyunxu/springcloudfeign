package com.spring.cloud.feign.demo.springcloudfeign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "computer-service",fallback =ComputerClientHystrix.class)
public interface ComputerClient {
    @RequestMapping(value = "/add",method = RequestMethod.GET)
    Integer add(@RequestParam("a")Integer a,@RequestParam("b")Integer b);
}
