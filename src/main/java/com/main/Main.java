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
		student.setName("Azhar");
		student.setEmail("azhar@gmail.com");
		student.setAddress("moro");
		
		StudentDao dao = new StudentDao(HibernateUtils.getSessionFactory());
		dao.save(student);
		
		EmployeeAnotationExample employee = new EmployeeAnotationExample();
		employee.setemp_name("Azhar");
		employee.setEmail("azhar@gmail.com");
		employee.setSalary(567.89);
		employee.setStatus(true);
		employee.setJoiningDate(new Date());
		
		EmployeeDao dao1 = new EmployeeDao(HibernateUtils.getSessionFactory());
		dao1.save(employee);
	}
}
