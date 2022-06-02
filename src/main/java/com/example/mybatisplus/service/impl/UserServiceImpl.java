package com.example.mybatisplus.service.impl;
import java.util.List;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.mybatisplus.entity.User;
import com.example.mybatisplus.mapper.UserMapper;
import com.example.mybatisplus.service.IUserService;
import org.springframework.stereotype.Service;

/**
 *
 * User 表数据服务层接口实现类
 *
 * @author czw
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

	@Override
	public boolean deleteAll() {
		return retBool(baseMapper.deleteAll());
	}

	@Override
	public List<User> selectListBySQL() {
		return baseMapper.selectListBySQL();
	}

	@Override
	public List<User> selectUserAll() {
		System.out.println(baseMapper);
		LambdaQueryWrapper<User> objectLambdaQueryWrapper = Wrappers.lambdaQuery();
		objectLambdaQueryWrapper.ne(User::getId, 1000);
		return baseMapper.selectList(objectLambdaQueryWrapper);
	}

	@Override
	public Page<User> pageUser(int index, int pageSize) {
		/**
		 * 这种一对多分页查询统计总数量是不对的，需要自行写sql查询统计
		 * sql分页只能拿到原始的数据拿出来，比如10条， 后经组装成5条，最后得到的5条数据是通过逻辑处理的，通过sql无法解决
		 */
		Page<User> page = new Page<>(index, pageSize);
		List<User> users = baseMapper.pageUser(page);
		page.setRecords(users);
		return page;
	}

}