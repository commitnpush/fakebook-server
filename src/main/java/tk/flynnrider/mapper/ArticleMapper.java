package tk.flynnrider.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import tk.flynnrider.domain.Article;

@Mapper
@Repository
public interface ArticleMapper {
	
	@Select("select * from article  order by regdate desc limit 0,5")
	public List<Article> findAll();

}
