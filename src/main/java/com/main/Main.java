package com.main;

import com.dao.StudentDao;
import com.entities.Student;
import com.util.HibernateUtils;

public class Main {

	public static void main(String [] args) {
		Student student = new Student();
		student.setName("Asadullah");
		student.setEmail("asad@gmail.com");
		student.setAddress("moro");
		
		StudentDao dao = new StudentDao(HibernateUtils.getSessionFactory());
		dao.save(student);
	}
}
