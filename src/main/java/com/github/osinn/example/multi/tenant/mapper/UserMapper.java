package com.github.osinn.example.multi.tenant.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.github.osinn.example.multi.tenant.entity.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * User 表数据库控制层接口
 */
public interface UserMapper extends BaseMapper<User> {

    /**
     * 自定义注入方法
     */
    int deleteAll();

    @Select("select * from user")
    List<User> selectListBySQL();

    List<User> selectUserAll();

    List<User> pageUser(Page<User> page);

    User getUserInfoById(@Param("userId") Long userId, @Param("tenant_id") Long tenantId);

    User getUserInfo2ById(@Param("userId") Long userId, @Param("tenant_id") Long tenantId);

    @Select("select * from user where id = #{userId}")
    User getUserInfoSQLById(@Param("userId") Long userId, @Param("tenant_id") Long tenantId);

}
