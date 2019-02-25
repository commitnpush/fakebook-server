package tk.flynnrider.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tk.flynnrider.domain.Article;
import tk.flynnrider.mapper.ArticleMapper;

@Service
public class ArticleService {
	
	@Autowired
	ArticleMapper articleMapper;

	public List<Article> getArticles() {
		return articleMapper.findAll();
	}

	public void addArticle(Article article) {
		articleMapper.add(article);
	}

	public List<Article> getMoreArticles(int id) {
		return articleMapper.findMore(id);
	}
	
}
