package com.po.compmapping;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hpe.eric.util.HibernateUtil;

public class Test {
	public static void main(String[] args) {
		Session session = HibernateUtil.currentSession();
		Transaction tx = session.beginTransaction();
	
		Animal animal = new Animal("Lion A", "Africa");
		Lion lion = new Lion(1, animal);

		animal = new Animal("Elephnat A", "Asia");
		Elephant elephant = new Elephant(1, animal);

		session.save(lion);
		session.save(elephant);
		
		
		tx.commit();
		HibernateUtil.closeSession();

	}
}
