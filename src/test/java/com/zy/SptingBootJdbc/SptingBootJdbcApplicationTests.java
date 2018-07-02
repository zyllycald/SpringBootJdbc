package com.zy.SptingBootJdbc;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import com.zy.SptingBootJdbc.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class SptingBootJdbcApplicationTests {
	
	@Autowired
	private UserService userService;
	
	@Before
	public void setUp() {
		//清空信息
		userService.deleteAllUser();
	}

	
	@Test
	public void contextLoads() {
		//新增五条信息
		userService.creat("a", 1);
		userService.creat("b", 2);
		userService.creat("c", 3);
		userService.creat("d", 4);
		userService.creat("e", 5);
		
		//判断数据库是否有五条数据
		Assert.assertEquals(5, userService.getAllUsers().intValue());
		
		
		// 删除两个用户
		userService.deleteByUser("a");
		userService.deleteByUser("e");

		// 查数据库，应该有3个用户
		Assert.assertEquals(3, userService.getAllUsers().intValue());
	}

}
