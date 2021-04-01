package com.jiacool.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.jiacool.service.HelloService;
import org.springframework.transaction.annotation.Transactional;

//@Service(protocol = "dubbo") // 发布为服务，必须使用Dubbo提供的Service注解
//指定服务接口类型
@Service(interfaceClass = HelloService.class , loadbalance = "roundRobin")
@Transactional
public class HelloServiceImpl implements HelloService {

    public String sayHello(String msg) {
        return "8081 hello " + msg ;
    }
}
