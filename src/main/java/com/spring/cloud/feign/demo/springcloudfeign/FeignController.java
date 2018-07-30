package com.spring.cloud.feign.demo.springcloudfeign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName FeignController
 * @Description
 * @Author user
 * @Date 2018/7/20 15:45
 * @Version 1.0
 **/
@RestController
public class FeignController {
    @Autowired
    private ComputerClient  computerClient;
    @RequestMapping(value="/add",method =RequestMethod.GET)
    public Integer add(){
        return  computerClient.add(10,20);
    }
}
