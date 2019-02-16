package tk.flynnrider.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tk.flynnrider.domain.RecentSearch;
import tk.flynnrider.service.SearchService;

@RestController
public class SearchController {
	
	@Autowired
	private SearchService searchService;
	
	
	@GetMapping("/recent-search")
	public List<RecentSearch> getResentSearchList(){
		return searchService.findRecentSearchAll();
	}
	@PostMapping("/recent-search")
	public void postResentSearchList(@RequestBody RecentSearch recentSearch) {
		searchService.addRecentSearch(recentSearch);
		//return searchService.findRecentSearchAll();
	}
}
