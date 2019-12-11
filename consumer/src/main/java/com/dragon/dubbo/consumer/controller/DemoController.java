package com.dragon.dubbo.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import service.DemoService;
import service.LoginService;

@RestController
public class DemoController {
    @Reference(version = "${demo.service.version}")
    private DemoService demoService;
    @Reference
    private LoginService loginService;

    @GetMapping("/say/{name}")
    public String sayHello(@PathVariable("name") String name){
        return demoService.sayHello(name);
    }
    @GetMapping("/login/{name}")
    public String login(@PathVariable("name") String name){
        System.out.print("");
        return loginService.login(name);
    }
}
