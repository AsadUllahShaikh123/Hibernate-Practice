package com.mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.util.HibernateUtils;

public class Main {

	public static void main(String [] args) {
		SessionFactory factory = HibernateUtils.getSessionFactory();
		Session session = factory.openSession();
		Chancellor chan1 = new Chancellor();
		chan1.setName("Taha");
		Chancellor chan2 = new Chancellor();
		chan2.setName("Parveen");
		
		University uni = new University();
		uni.setName("Muet");
		uni.setAddress("jamshoro");
		uni.setChancellor(chan1);
		
		University uni2 = new University();
		uni2.setAddress("karachi");
		uni2.setName("Duet");
		uni2.setChancellor(chan2);
		
		Transaction tx = session.beginTransaction();
		
		
		session.save(chan1);
		session.save(chan2);
		session.save(uni);
		session.save(uni2);
		
		
		tx.commit();
		
		session.close();
		
		
	}
}
