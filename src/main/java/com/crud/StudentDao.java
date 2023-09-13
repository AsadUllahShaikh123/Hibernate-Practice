package com.crud;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class StudentDao {
	SessionFactory factory ;
	
	StudentDao(SessionFactory factory){
		this.factory = factory;
	}
	
	public void save(Student student) {
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(student);
		tx.commit();
		session.close();
	}
	public void delete(int id) {
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		Student student = getStudent(id);
		session.remove(student);
		tx.commit();
		session.close();
	}
	public List<Student> getAllStudents() {
		Session session = factory.openSession();
		List<Student> list = session.createQuery("from Student",Student.class).list();
		return list;
	}
	public Student getStudent(int id) {
		Session session = factory.openSession();
		Student student = session.get(Student.class, id);
		return student;
	}
	public void update(int id) {
		
		Student student = getStudent(id);
		student.setName("Asadullah");
		save(student);
	}
}
