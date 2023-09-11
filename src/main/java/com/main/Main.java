package com.main;

import java.util.Date;

import com.dao.EmployeeDao;
import com.dao.StudentDao;
import com.entities.EmployeeAnotationExample;
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
		
		EmployeeAnotationExample employee = new EmployeeAnotationExample();
		employee.setemp_name("Asadullah");
		employee.setEmail("asad@gmail.com");
		employee.setSalary(123.45);
		employee.setStatus(true);
		employee.setJoiningDate(new Date());
		
		EmployeeDao dao1 = new EmployeeDao(HibernateUtils.getSessionFactory());
		dao1.save(employee);
	}
}
