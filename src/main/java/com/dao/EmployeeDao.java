package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.entities.EmployeeAnotationExample;



public class EmployeeDao {

	private SessionFactory factory ;
	
	public EmployeeDao(SessionFactory factory) {
		this.factory = factory;
	}
	
	public void save(EmployeeAnotationExample employee) {
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(employee);
		tx.commit();
		session.close();
	}
}
