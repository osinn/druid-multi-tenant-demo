package com.github.osinn.example.multi.tenant.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.github.osinn.example.multi.tenant.entity.Role;
import com.github.osinn.example.multi.tenant.entity.User;
import org.apache.ibatis.annotations.Param;

/**
 * User 表数据库控制层接口
 */
public interface RoleMapper extends BaseMapper<User> {

    /**
     * 自定义注入方法
     */
    Role getRoleById(@Param("roleId") Long roleId);


}
