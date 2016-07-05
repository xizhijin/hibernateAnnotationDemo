package com.po.unidirectional.nojointable_N1;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hpe.eric.util.HibernateUtil;

public class Test {
	
	public static void main(String[] args) {
		Session session = HibernateUtil.currentSession();
		Transaction tx = session.beginTransaction();
		
		Address address = new Address("ÉÏº£ÆÖ¶«");
		
		Person p1 = new Person();
		p1.setName("xizhijin");
		p1.setAge(30);
		p1.setAddress(address);
		session.save(p1);
		
		Person p2 = new Person();
		p2.setName("xuyunxia");
		p2.setAge(30);
		p2.setAddress(address);
		session.save(p2);
		
		tx.commit();
		HibernateUtil.closeSession();
	}

}
