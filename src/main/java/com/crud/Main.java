package com.crud;

import java.util.List;

import com.util.HibernateUtils;

public class Main {

	public static void main(String [] args) {
		StudentDao dao = new StudentDao(HibernateUtils.getSessionFactory());
		
//		----> 1 ) Data Created or saved 
		
//		Student Asad = new Student();
//		Asad.setName("Asad");
//		Asad.setEmail("asad@gmail.com");
//		Asad.setAddress("moro");
//		Asad.setCollegeName("Mehran");
//		
//		Student Azhar = new Student();
//		Azhar.setName("Azhar");
//		Azhar.setEmail("azhar@gmail.com");
//		Azhar.setAddress("moro");
//		Azhar.setCollegeName("Mehran");
//		
//		dao.save(Asad);
//		dao.save(Azhar);
		
//		----> 2) Let Retrive All Students
		
//		List<Student> students = dao.getAllStudents();
//		for(Student student : students ) {
//			System.out.println(student);
//		}
		
//		----> 3) Select Particular Student
		
//		Student student = dao.getStudent(1);
//		System.out.println(student);
		
//		---> 4) Update The data 
		
//		dao.update(1);
//		Student student = dao.getStudent(1);
//		System.out.print(student);
		
		dao.delete(1);
		List<Student> students = dao.getAllStudents();
		for(Student student : students ) {
			System.out.println(student);
		}
	}
}
