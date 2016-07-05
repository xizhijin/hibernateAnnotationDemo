package com.po.bidirectional.PK_11;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hpe.eric.util.HibernateUtil;

public class Test {
	
	public static void main(String[] args) {
		Session session = HibernateUtil.currentSession();
		Transaction tx = session.beginTransaction();
		
		Address address = new Address("�Ϻ��ֶ�");
		
		Person p1 = new Person();
		p1.setName("xizhijin");
		p1.setAge(30);
		p1.setAddress(address);
		
		address.setPerson(p1);//�ر�ע�ⲻ��ӱ���attempted to assign id from null one-to-one property: person
		
		session.save(p1);
		
		tx.commit();
		HibernateUtil.closeSession();
	}

}
