package com.sc.cloud.controller;

import com.sc.cloud.pojo.User;
import com.sc.cloud.service.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO
 *@author 180609
 *@date 2022/4/21
 */
@RestController
@RequestMapping("/api/user")
public class UserController {

    @Reference(check = false)
    private UserService userService;

    @GetMapping("/hello")
    public String hello() {
        return "Hello, WebFlux !";
    }

    @PostMapping("/userInfo")
    public User userInfo() {
        return userService.userInfo();
    }
}
