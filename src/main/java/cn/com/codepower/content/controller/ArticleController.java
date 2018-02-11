package cn.com.codepower.content.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.com.codepower.content.service.ArticleService;

/**
 * 文章的控制类
 * @author Shuaishuai
 *
 */
@Controller
@EnableAutoConfiguration
@RequestMapping("/article")
public class ArticleController {
	
	private Logger logger = LoggerFactory.getLogger(ArticleController.class);
	
	@Autowired
	private ArticleService articleService;
	
	
	/**
	 * 创建新文章
	 * @return
	 */
	@RequestMapping("/createArcitle")
	public String createArcitle() {
		
		return "";
	}
	
	/**
	 * 查询所有文章
	 * @return
	 */
	@RequestMapping("/getArcitleAll")
	public String getArcitleAll() {
		return "";
	}
	
	/**
	 * 根据id查询文章
	 */
	@RequestMapping("/getArticleById")
	public String getArticleById() {
		return "";
	}
}
