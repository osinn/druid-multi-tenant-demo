package com.example.mybatisplus.controller;

import com.example.mybatisplus.entity.User;
import com.example.mybatisplus.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 描述
 *
 * @author wency_cai
 */
@RestController
public class DemoController {
    @Autowired
    private IUserService userService;

    @RequestMapping("/test")
    public String test() {
        List<User> users = userService.selectUserAll();
        users.forEach(user -> {

            System.out.println(user);
        });
        return "OK";
    }
}
