package com.example.consumer.controller;/**
 * @description:
 * @author: Lenovo
 * @date: 2020-01-09 10:28
 */

import com.alibaba.dubbo.config.annotation.Reference;
import model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.UserService;

/**
 * @Auther chenhao
 * @Date 2020/1/9
 */

@RestController
public class UserController {

    @Reference(version = "1.0.0",timeout = 1000)
    private UserService userService;

    @RequestMapping("/user")
    public User getUser(){
        return userService.getUser();
    }
}
