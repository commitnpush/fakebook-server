package tk.flynnrider.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@PostMapping("/article")
	public void postArticle(@RequestBody Article article) {
		article.setUser_id("flynn");
		articleService.addArticle(article);
	}
	
	@GetMapping("/article/more/{id}")
	public List<Article> getMoreArticles(@PathVariable int id) {
		return articleService.getMoreArticles(id);
	}
}
