package com.po.bidirectional.withjointable_NN;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hpe.eric.util.HibernateUtil;

public class Test {
	
	public static void main(String[] args) {
		Session session = HibernateUtil.currentSession();
		Transaction tx = session.beginTransaction();
		
		Address address1 = new Address("上海浦东");
		Address address2 = new Address("上海浦西");
		
		
		Person p1 = new Person();
		p1.setName("eric");
		p1.setAge(30);
		
		Person p2 = new Person();
		p2.setName("sandy");
		p2.setAge(29);
		
		Person p3 = new Person();
		p3.setName("steven");
		p3.setAge(28);
			
		p1.getAddresses().add(address1);
		p1.getAddresses().add(address2);
		
		p2.getAddresses().add(address2);
		p3.getAddresses().add(address2);
		
		
		session.save(p1);
		session.save(p2);
		session.save(p3);
		
		tx.commit();
		HibernateUtil.closeSession();
	}

}
