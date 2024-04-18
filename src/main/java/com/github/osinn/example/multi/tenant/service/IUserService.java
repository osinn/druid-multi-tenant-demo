package com.github.osinn.example.multi.tenant.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.github.osinn.example.multi.tenant.entity.User;

import java.util.List;

/**
 *
 * User 表数据服务层接口
 *
 */
public interface IUserService extends IService<User> {

	boolean deleteAll();

	List<User> selectListBySQL();

	List<User> selectUserAll();

	Page<User> pageUser(int index, int pageSize);
}
