package com.spring.cloud.feign.demo.springcloudfeign;

import org.springframework.stereotype.Component;

/**
 * @ClassName ComputerClientHystrix
 * @Description
 * @Author user
 * @Date 2018/7/20 16:22
 * @Version 1.0
 **/
@Component
public class ComputerClientHystrix implements  ComputerClient{
    @Override
    public Integer add(Integer a, Integer b) {
        return -999;
    }
}
