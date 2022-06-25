package com.example.mybatisplus.service.impl;

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
public class TenantServiceImpl implements ITenantService<Long> {
    @Override
    public List<Long> getTenantIds() {
        Long tenantId = 1540616714700591104L;
        Long tenantId2 = 1540616731523944448L;
        List<Long> tenantIdList = new ArrayList<>();
        tenantIdList.add(tenantId);
//        tenantIdList.add(tenantId2);
        return tenantIdList;
    }
}
