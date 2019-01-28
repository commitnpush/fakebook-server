package tk.flynnrider.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tk.flynnrider.domain.RecentSearch;
import tk.flynnrider.mapper.RecentSearchMapper;

@Service
public class SearchService {
	
	@Autowired
	private RecentSearchMapper recentSearchMapper;

	public List<RecentSearch> findRecentSearchAll() {
		return recentSearchMapper.findAll();
	}

	public void addRecentSearch(RecentSearch recentSearch) {
		recentSearchMapper.add(recentSearch);
	}
	
}
