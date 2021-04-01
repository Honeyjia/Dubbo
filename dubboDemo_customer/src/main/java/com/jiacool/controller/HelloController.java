package com.jiacool.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jiacool.service.HelloService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/demo")
public class HelloController {

    @Reference //使用的是Dubbo提供的@Reference注解
    private HelloService helloService;

    @RequestMapping("/hello")
    @ResponseBody
    public String getName(String msg){
        return helloService.sayHello(msg);
    }
}