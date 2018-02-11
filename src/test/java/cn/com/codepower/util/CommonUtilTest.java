package cn.com.codepower.util;

import org.junit.Test;

public class CommonUtilTest {
	
	
	@Test
	public void testGetUUID() {
		String uuid = CommonUtil.getUUID();
		System.out.println(uuid);
	}
	
	@Test
	public void testMd5Password() {
		String md5Password = CommonUtil.md5Password("123A56789");
		System.out.println(md5Password);
	}
}
