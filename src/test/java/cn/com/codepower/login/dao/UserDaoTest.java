package cn.com.codepower.login.dao;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import cn.com.codepower.login.entity.User;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserDaoTest {
	
	@Autowired
	private UserDao userDao;
	
	@Test
	public void testSelectUserAll() {
		List<User> userAll = userDao.selectUserAll();
		System.out.println(userAll);
	}
}
