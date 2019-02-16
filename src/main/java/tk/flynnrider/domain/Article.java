package tk.flynnrider.domain;

import lombok.Data;

@Data
public class Article {
	private int id;
	private User user;
	private Group group;
	private String content;
	private String regdate;
	private String user_id;
}
