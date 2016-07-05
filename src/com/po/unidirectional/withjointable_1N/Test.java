package com.po.unidirectional.withjointable_1N;



import org.hibernate.Session;
import org.hibernate.Transaction;


import com.hpe.eric.util.HibernateUtil;

public class Test {

	public static void main(String[] args) {
		Session session = HibernateUtil.currentSession();
		Transaction tx = session.beginTransaction();
	
		Address address1 = new Address("�Ϻ��ֶ�");
		Address address2 = new Address("�Ϻ�����");
		
		Person person = new Person();
		person.setName("eric");
		person.setAge(29);
		person.getAddresses().add(address1);
		person.getAddresses().add(address2);
		
		session.save(person);
		
		tx.commit();
		HibernateUtil.closeSession();

	}

}
