package com.example.Many_to_Many;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 */
public class App {
	public static void main(String[] args) {

		//Load the Configuration
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

		//Open Session
		Session session = factory.openSession();

		//Begin Transaction
		Transaction transaction = session.beginTransaction();

		//Perform operation
		Club club1 = new Club("Science Club", "1st Floor");
		Club club2 = new Club("Music Club", "2nd Floor");
		
		KodStudent student = new KodStudent("Ravi Kumar", "ravi@example.com");
		
		Set<Club> set = new HashSet<Club>();
		set.add(club1);
		set.add(club2);
		
		student.setClubs(set);
		
		session.persist(student);
		
//		session.get(KodStudent.class, 1);

		//Commit Transaction
		transaction.commit();

		//close session and SessionFactory
		session.close();
		factory.close();

	}
}
