package cn.com.codepower.run.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.com.codepower.login.controller.UserController;

/**
 * 负责静态资源跳转的页面
 * @author Shuaishuai
 *
 */
@Controller
@EnableAutoConfiguration
public class CommonController {
	
	private Logger logger = LoggerFactory.getLogger(UserController.class);
	
	/**
	 * 首页index
	 * @return
	 */
	@RequestMapping("/")
    public String index() {
        return "index";
    }
	
	/**
	 * signup-page页面
	 * @return
	 */
	@RequestMapping("/signupPage")
	public String signupPage() {
		return "examples/signup-page";
	}
	
	/**
	 * profile-page页面
	 * @return
	 */
	@RequestMapping("/profilePage")
	public String profilePage() {
		return "examples/profile-page";
	}
	
	/**
	 * landing-page页面
	 * @return
	 */
	@RequestMapping("/landingPage")
	public String landingPage() {
		return "examples/landing-page";
	}
	
	/**
	 * documentation-free页面
	 * @return
	 */
	@RequestMapping("/documentationFree")
	public String documentationFree() {
		return "docs/documentation-free";
	}
	
	/**
	 * 文章编辑页面
	 * @return
	 */
	@RequestMapping("/articleEdit")
	public String articleEdit() {
		return "examples/article-edit";
	}
}
