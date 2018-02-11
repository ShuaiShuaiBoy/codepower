package cn.com.codepower.content.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.codepower.content.dao.ArticleDao;
import cn.com.codepower.content.entity.Article;
import cn.com.codepower.content.service.ArticleService;

/**
 * 文章的业务时限类
 * @author Shuaishuai
 *
 */
@Service
public class ArticleServiceImpl implements ArticleService {
	
	private Logger logger = LoggerFactory.getLogger(ArticleServiceImpl.class);

	@Autowired
	private ArticleDao  articleDao;
	
	@Override
	public List<Article> queryArticleAll() {
		
		return null;
	}

	@Override
	public List<Article> queryArticleByState(String state) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Article queryArticleById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Article addArticle(Article article) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Article enditArticle(Article article) {
		// TODO Auto-generated method stub
		return null;
	}

}
