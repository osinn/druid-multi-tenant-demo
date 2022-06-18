package com.example.mybatisplus;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.mybatisplus.entity.User;
import com.example.mybatisplus.service.IUserService;
import com.github.osinn.druid.multi.tenant.plugin.handler.TenantInfoHandler;
import com.github.osinn.druid.multi.tenant.plugin.parser.DefaultSqlParser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MybatisPlusApplicationTests {

	@Autowired
	private IUserService userService;

	@Test
	public void contextLoads() {
		List<User> users = userService.selectUserAll();
		users.forEach(user -> {

			System.out.println(user);
		});
	}

	@Test
	public void testPage() {
		Page<User> page = userService.pageUser(1, 10);
		page.getRecords().forEach(user -> {
			System.out.println(user);
		});
	}

	@Test
	public void tenant() {

	}
}
