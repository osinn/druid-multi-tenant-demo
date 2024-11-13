package com.github.osinn.example.multi.tenant.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.osinn.example.multi.tenant.entity.Role;
import com.github.osinn.example.multi.tenant.mapper.RoleMapper;
import com.github.osinn.example.multi.tenant.service.IRoleService;
import org.springframework.stereotype.Service;

/**
 *
 * User 表数据服务层接口实现类
 *
 * @author czw
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements IRoleService {

}
