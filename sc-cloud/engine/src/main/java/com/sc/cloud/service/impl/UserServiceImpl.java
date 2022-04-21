package com.sc.cloud.service.impl;

import com.sc.cloud.pojo.User;
import com.sc.cloud.service.UserService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * TODO
 *@author 180609
 *@date 2022/4/21
 */
@Service
@Component
public class UserServiceImpl implements UserService {
    @Override
    public User userInfo() {
        User user = new User();
        user.setUsername("admin");
        user.setPassword("123456");
        return user;
    }
}
