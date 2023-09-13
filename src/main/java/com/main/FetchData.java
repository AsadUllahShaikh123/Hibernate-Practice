package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.entities.Student;
import com.util.HibernateUtils;

public class FetchData {

	public static void main(String [] args) {
		SessionFactory factory = HibernateUtils.getSessionFactory();
		Session session = factory.openSession();
		Student student = session.get(Student.class, 2);
		System.out.print(student);
	}
}
