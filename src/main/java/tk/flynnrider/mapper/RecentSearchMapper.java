package tk.flynnrider.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import tk.flynnrider.domain.RecentSearch;

@Mapper
@Repository
public interface RecentSearchMapper {
	
	@Select("select * from recent_search  order by regdate desc limit 0,5")
	public List<RecentSearch> findAll();

	@Insert("insert into recent_search(text, regdate) values(#{text}, now())")
	public void add(RecentSearch recentSearch);
	

}
