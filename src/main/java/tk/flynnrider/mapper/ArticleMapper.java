package tk.flynnrider.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import tk.flynnrider.domain.Article;

@Mapper
@Repository
public interface ArticleMapper {
	
	@Select("select * from article  order by regdate desc limit 0,5")
	public List<Article> findAll();
	
	@Select("select * from article where content like concat('%',#{value},'%') order by regdate desc limit 0,5")
	public List<Article> findAllByKeyword(String keyword);
	
	@Insert("insert into article(user_id, group_id, content, regdate) values(#{user_id}, null, #{content}, now())")
	public void add(Article article);
	
	@Select("select * from article where id < #{value} order by regdate desc limit 0,3")
	public List<Article> findMore(int id);
	
	@Select("select * from article where id < #{id} and  content like concat('%',#{keyword},'%') order by regdate desc limit 0,3")
	public List<Article> findMoreByKeyword(int id, String keyword);

}
