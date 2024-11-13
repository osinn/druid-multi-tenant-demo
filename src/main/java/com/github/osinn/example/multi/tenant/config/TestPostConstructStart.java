//package com.github.osinn.example.multi.tenant.config;
//
//import com.github.osinn.example.multi.tenant.entity.Role;
//import com.github.osinn.example.multi.tenant.service.IRoleService;
//import org.springframework.stereotype.Component;
//
//import javax.annotation.PostConstruct;
//import javax.annotation.Resource;
//
///**
// * 描述
// *
// * @author wency_cai
// */
//@Component
//public class TestPostConstructStart {
//
//    @Resource
//    private IRoleService roleService;
//
//    @PostConstruct
//    public void init(){
//        Role role = new Role();
//        role.setName("哈哈1111");
//        roleService.save(role);
//    }
//
//}
