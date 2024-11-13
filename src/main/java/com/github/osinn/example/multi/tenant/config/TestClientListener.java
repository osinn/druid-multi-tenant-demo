//package com.github.osinn.example.multi.tenant.config;
//
//import com.github.osinn.example.multi.tenant.entity.Role;
//import com.github.osinn.example.multi.tenant.mapper.RoleMapper;
//import com.github.osinn.example.multi.tenant.service.IRoleService;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.boot.context.event.ApplicationStartedEvent;
//import org.springframework.context.ApplicationListener;
//import org.springframework.stereotype.Component;
//
//import javax.annotation.Resource;
//
///**
// * 描述
// *
// * @author wency_cai
// */
//@Slf4j
//@Component
//public class TestClientListener implements ApplicationListener<ApplicationStartedEvent> {
//
//    @Resource
//    private RoleMapper roleMapper;
//
//    @Resource
//    private IRoleService roleService;
//
//    @Override
//    public void onApplicationEvent(ApplicationStartedEvent applicationStartedEvent) {
//        Role role = new Role();
//        role.setName("哈哈1");
//        roleService.save(role);
//    }
//}
