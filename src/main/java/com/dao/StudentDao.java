package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.entities.Student;

public class StudentDao {

	private SessionFactory factory;
	
	public StudentDao(SessionFactory factory) {
		this.factory = factory;
	}
	
	public void save(Student student) {
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(student);
		tx.commit();
		session.close();
	}
}
