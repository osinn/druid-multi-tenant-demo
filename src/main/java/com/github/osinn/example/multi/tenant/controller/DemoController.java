package com.github.osinn.example.multi.tenant.controller;

import com.github.osinn.example.multi.tenant.entity.User;
import com.github.osinn.example.multi.tenant.mapper.UserMapper;
import com.github.osinn.example.multi.tenant.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 描述
 *
 * @author wency_cai
 */
//@DS("salesAfter")
@RestController
public class DemoController {
    @Autowired
    private IUserService userService;

    @Resource
    private UserMapper userMapper;

    @RequestMapping("/test")
    public String test() {
        List<User> users = userService.selectUserAll();
        users.forEach(user -> {

            System.out.println(user);
        });
        return "OK";
    }


    @RequestMapping("/testMapperTenantId")
    public User testMapperTenantId() {
        Long tenantId = 1L;
        User user = userMapper.getUserInfoById(1L, tenantId);
        tenantId = 2L;
        User user2 = userMapper.getUserInfoSQLById(2L, tenantId);
//        System.out.println(user2);
        return user;
    }
}
