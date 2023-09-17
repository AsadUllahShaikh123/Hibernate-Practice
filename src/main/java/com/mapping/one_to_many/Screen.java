package com.mapping.one_to_many;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.util.HibernateUtils;

public class Screen {

	public static void main (String [] args) {

		List<Answer> answers = new ArrayList<Answer>();
		Answer answer1 = new Answer();
		answer1.setAnswer("Hard Disk");
		answers.add(answer1);
		Answer answer2 = new Answer();
		answer2.setAnswer("Solid State Disk");
		answers.add(answer2);
		Answer answer3 = new Answer();
		answer3.setAnswer("Flopy Disk");
		answers.add(answer3);
		Answer answer4 = new Answer();
		answer4.setAnswer("USB");
		answers.add(answer4);
		
		Question question = new Question();
		question.setAnswers(answers);
		question.setQuestion("Which is the best fast ? ");
		
		answer1.setQuestion(question);
		answer2.setQuestion(question);
		answer3.setQuestion(question);
		answer4.setQuestion(question);
		
		SessionFactory factory = HibernateUtils.getSessionFactory();
		Session session =factory.openSession();
			
		session.beginTransaction();
		
		session.save(answer1);
		session.save(answer2);
		session.save(answer3);
		session.save(answer4);
		
		session.save(question);
		
//		Question question1 = session.get(Question.class, 1);
//		
//		List<Answer> answer = question1.getAnswers();
//		System.out.println("---> Question 1 :   " + question1.getQuestion());
//	    for(Answer answers1 : answer) {
//	    	System.out.println(" " + answers1.getAnswer());
//	    }
		
		
		session.getTransaction().commit();
		session.close();
		
	}
}
