package com.dragon.dubbo.provider.Login;

import com.alibaba.dubbo.config.annotation.Service;
import service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {
    @Override
    public String login(String name){
        return name+"登录成功";
    }
}
