package com.github.osinn.example.multi.tenant.service.impl;

import com.github.osinn.druid.multi.tenant.plugin.service.ITenantService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 描述
 *
 * @author wency_cai
 */
@Service
public class TenantServiceImpl implements ITenantService {

   TenantServiceImpl() {
        System.out.println("TenantServiceImpl init");
    }

    @Override
    public List<Object> getTenantIds() {
        Long tenantId = 1L;
        Long tenantId2 = 1540616731523944448L;
        List<Object> tenantIdList = new ArrayList<>();
        tenantIdList.add(tenantId);
//        tenantIdList.add(tenantId2);
        return tenantIdList;
    }

    @Override
    public String customizeParser(String originalSQL, Object paramTenantId) {
        System.out.println("开发者自己处理解析设置租户ID，不使用内置的解析逻辑");
        return null;
    }

    @Override
    public String before(String originalSQL, Object paramTenantId) {
        System.out.println("执行默认解析逻辑前 执行了 before方法");
        return null;
    }

    @Override
    public String after(String newSQL, Object paramTenantId) {
        System.out.println("执行默认解析逻辑后 执行了 after方法");
//        return newSQL + " and tenant_id = 123456";
        return null;
    }
}
