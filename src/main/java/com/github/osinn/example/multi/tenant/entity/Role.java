package com.github.osinn.example.multi.tenant.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

/**
 * 描述
 *
 * @author wency_cai
 */
@Data
public class Role {

    /**
     * 主键ID
     */
    @TableId
    private Long id;

    /**
     * 名称
     */
    private String name;

    /**
     * 租户ID
     */
    private Long tenantId;
}
