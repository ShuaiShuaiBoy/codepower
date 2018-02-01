package cn.com.codepower.login.service;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import cn.com.codepower.login.entity.User;
import cn.com.codepower.login.service.impl.UserServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest(classes= {UserServiceImpl.class})
public class UserServiceTest {
	
	@Autowired
	private UserService userService;

	@Test
	public void testQueryUserAll() {
		List<User> userAll = userService.queryUserAll();
		System.out.println(userAll);
	}
}
