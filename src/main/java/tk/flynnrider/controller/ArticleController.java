package tk.flynnrider.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import tk.flynnrider.domain.Article;
import tk.flynnrider.service.ArticleService;

@RestController
public class ArticleController {
	
	@Autowired
	private ArticleService articleService;
	
	@GetMapping("/article")
	public List<Article> getArticles(){
		return articleService.getArticles();
	}
}
