package com.gd.learning;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.gd.learning.domain.Address;
import com.gd.learning.domain.Student;
import com.gd.learning.util.HibernateUtil;

public class MainApp {

	public static void main(String[] args) {
		SessionFactory sessionFactory = null;
		Session session = null;
		sessionFactory = HibernateUtil.getSessionFactory();
		session = sessionFactory.openSession();

		session.beginTransaction();
		Student s = new Student();
		s.setStudentId(100);
		s.setStudentName("Asraf");

		Address ad = new Address();
		ad.setAddressId(509);
		ad.setCity("Thergaon");
		ad.setState("Pune");
		ad.setS(s);

		// sTransaction tx = session.beginTransaction();

		session.save(ad);

		// session.close();
		System.out.println("One to One is Done..!!");

		session.getTransaction().commit();
	}

}
