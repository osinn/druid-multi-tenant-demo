//package com.github.osinn.example.multi.tenant.config;
//
//import com.github.osinn.example.multi.tenant.entity.Role;
//import com.github.osinn.example.multi.tenant.service.IRoleService;
//import org.springframework.boot.ApplicationArguments;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//import javax.annotation.Resource;
//
//@Component
//public class TestCommandLineRunner implements CommandLineRunner {
//
//    @Resource
//    private IRoleService roleService;
//
//    @Override
//    public void run(String... args) throws Exception {
//        Role role = new Role();
//        role.setName("哈哈33331111222");
//        roleService.save(role);
//    }
//}
