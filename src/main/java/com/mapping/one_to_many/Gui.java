package com.mapping.one_to_many;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.util.HibernateUtils;

public class Gui {

	public static void main(String [] args) {
		
		List<PostComment> comments = new ArrayList<PostComment>();
		
		PostComment comment1 = new PostComment();
		comment1.setComment("Nice Blog");

		PostComment comment2 = new PostComment();
		comment2.setComment("Very Helpful");
		
		PostComment comment3 = new PostComment();
		comment3.setComment("Helpfull content");
		
		comments.add(comment1);
		comments.add(comment2);
		comments.add(comment3);
		
		Post post = new Post();
		post.setTitle("How Java Persistence Works ? ");
		post.setComments(comments);
		
		SessionFactory factory = HibernateUtils.getSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();
		
		session.save(comment1);
		session.save(comment2);
		session.save(comment3);
		
		session.save(post);
		
		
//		Post fetchedPost = session.get(Post.class, 1);
//		
//		
//		List<PostComment> postComments = fetchedPost.getComments();
//		System.out.print("\n" + fetchedPost.getTitle());
//		for(PostComment postComment : postComments) {
//			System.out.print(" " + postComment.getComment());
//		}
		
		
		
		
		session.getTransaction().commit();
		session.close();
		
		
	}
}
