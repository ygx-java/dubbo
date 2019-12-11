package com.dragon.dubbo.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import service.DemoService;

@Service(version = "${demo.service.version}")
public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHello(String name) {
        return "Hello"+name+"I am Proveder";
    }
}
