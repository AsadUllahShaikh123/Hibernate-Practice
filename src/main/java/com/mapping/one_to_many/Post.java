package com.mapping.one_to_many;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="POST")
public class Post {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String title;
	@OneToMany( mappedBy="post", cascade = CascadeType.ALL ,orphanRemoval = true)
	// We can't use mapped By and Join Column togather and for bi directional mapping mappedBy attribute is compulsory
	// In uni directional we can tackle the problem of 3 tables with using @JoinColumn attribute
	// if we don't use mappedBy then we will have 3 tables 
	// if we use @JoinTable instead of mappedBy then we will have 2 tables but then Post comment table will store the post id 2 times
//	@JoinColumn(name="post")
	// The @JoinColumn helps hibernate to figure out that posts_id in the POST_COMMENT table is responsible for association
	private List<PostComment> comments = new ArrayList<PostComment>();
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public List<PostComment> getComments() {
		return comments;
	}
	public void setComments(List<PostComment> comments) {
		this.comments = comments;
	}
	
	
}
