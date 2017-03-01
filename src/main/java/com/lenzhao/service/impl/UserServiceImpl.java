package com.lenzhao.service.impl;

import com.lenzhao.framework.annotation.ServiceAnnotation;
import com.lenzhao.api.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by lenzhao on 17-2-27.
 */
@ServiceAnnotation(name = "userService")
public class UserServiceImpl implements UserService {

    private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Override
    public void login(String userName, String password) {
        logger.info("userName: " + userName + " 登录成功!");
    }

    @Override
    public String getUserInfo(String userName) {
        return userName;
    }
}
