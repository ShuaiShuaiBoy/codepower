package cn.com.codepower.util;

import org.junit.Test;

public class UserUtilTest {
	
	
	@Test
	public void testGetUUID() {
		String uuid = UserUtil.getUUID();
		System.out.println(uuid);
	}
	
	@Test
	public void testMd5Password() {
		String md5Password = UserUtil.md5Password("123A56789");
		System.out.println(md5Password);
	}
}
