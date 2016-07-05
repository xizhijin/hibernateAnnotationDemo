package com.po.bidirectional.PK_11;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hpe.eric.util.HibernateUtil;

public class Test {
	
	public static void main(String[] args) {
		Session session = HibernateUtil.currentSession();
		Transaction tx = session.beginTransaction();
		
		Address address = new Address("上海浦东");
		
		Person p1 = new Person();
		p1.setName("xizhijin");
		p1.setAge(30);
		p1.setAddress(address);
		
		address.setPerson(p1);//特别注意不添加报错：attempted to assign id from null one-to-one property: person
		
		session.save(p1);
		
		tx.commit();
		HibernateUtil.closeSession();
	}

}
