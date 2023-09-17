package com.mapping.one_to_many;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="POST_COMMENT")
public class PostComment {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;
	private String comment;
	
	@ManyToOne ( fetch = FetchType.LAZY )
	// Here it shows that there will be a foreign key of name posts_id which will store post id in the Post Comment table
	@JoinColumn(name="posts_id")
	private Post post;
	
	public Post getPost() {
		return post;
	}
	public void setPost(Post post) {
		this.post = post;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	
	
	
	
}
