package cn.com.codepower.run.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

import cn.com.codepower.content.entity.Article;
import cn.com.codepower.content.service.ArticleService;
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
	
	@Autowired
	private ArticleService articleService;
	
	/**
	 * 首页index
	 * @return
	 */
	@RequestMapping({"/","/{pageNum}"})
    public String index(HttpServletRequest request,@PathVariable(value="pageNum",required=false)Integer pageNum) {
		if(pageNum==null || pageNum<=0) {
			pageNum=1;
		}
		Page<Object> startPage = PageHelper.startPage(pageNum, 2, true);
		List<Article> articleAll = articleService.queryArticleAll();
		request.setAttribute("articleAll", articleAll);
		request.setAttribute("total", startPage.getTotal());
		request.setAttribute("pageNum", startPage.getPageNum());
		request.setAttribute("pages", startPage.getPages());
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
