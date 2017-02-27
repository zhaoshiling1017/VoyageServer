package com.lenzhao.service.impl;

import com.lenzhao.framework.annotation.ServiceAnnotation;
import com.lenzhao.framework.server.RpcServerBootstrap;
import com.lenzhao.service.UserService;

/**
 * Created by lenzhao on 17-2-27.
 */
@ServiceAnnotation(name = "userService")
public class UserServiceImpl implements UserService {

    @Override
    public void login(String userName, String password) {
        System.out.println("userName: " + userName + " 登录成功!");
    }

    @Override
    public String getUserInfo(String userName) {
        return userName;
    }

    public static void main(String[] args) {
        RpcServerBootstrap bootstrap = new RpcServerBootstrap();
        bootstrap.start(8000);
    }
}
