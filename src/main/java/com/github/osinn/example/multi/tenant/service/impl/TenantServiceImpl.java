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
    @Override
    public List<Object> getTenantIds() {
        Long tenantId = 1L;
        Long tenantId2 = 1540616731523944448L;
        List<Object> tenantIdList = new ArrayList<>();
        tenantIdList.add(tenantId);
//        tenantIdList.add(tenantId2);
        return tenantIdList;
    }
}
