package cn.com.codepower.login.dao;

import java.util.List;

import cn.com.codepower.login.entity.User;

/**
 * 
 * @author Shuaishuai
 *
 */
public interface UserDao {
	
	List<User> selectUserAll();
}
