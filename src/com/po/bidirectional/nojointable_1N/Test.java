package com.po.bidirectional.nojointable_1N;



import org.hibernate.Session;
import org.hibernate.Transaction;


import com.hpe.eric.util.HibernateUtil;

public class Test {

	
	public static void main(String[] args) {
		Session session = HibernateUtil.currentSession();
		Transaction tx = session.beginTransaction();
		
		Person person = new Person();
		person.setName("eric");
		person.setAge(29);
		
		Address address1 = new Address("上海浦东");
		address1.setPerson(person);
		Address address2 = new Address("上海浦西");
		address2.setPerson(person);
		session.save(address1);
		session.save(address2);
		
		tx.commit();
		HibernateUtil.closeSession();

	}

}
