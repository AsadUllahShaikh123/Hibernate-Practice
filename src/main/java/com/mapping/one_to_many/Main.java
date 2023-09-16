package com.mapping.one_to_many;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.util.HibernateUtils;

public class Main {

	public static void main(String [] args) {
		SessionFactory factory = HibernateUtils.getSessionFactory();
		
		List<Publisher> list = new ArrayList<Publisher>();
		Publisher pb1 = new Publisher();
		pb1.setName("Asad");
		list.add(pb1);
		Publisher pb2 = new Publisher();
		pb2.setName("Azhar");
		list.add(pb2);
		Publisher pb3 = new Publisher();
		pb3.setName("Safdar");
		list.add(pb3);
		
		Title title = new Title();
		title.setTitle("Java Programming Language");
		title.setPublisher(list);
		
		
		Session session = factory.openSession();
		session.beginTransaction();
		
		session.persist(pb1);
		session.persist(pb2);
		session.persist(pb3);
		
		session.persist(title);
		
		session.getTransaction().commit();
		
		session.close();
		
	}
}
