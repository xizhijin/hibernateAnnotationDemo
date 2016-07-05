package com.po.unidirectional.withjointable_NN;



import org.hibernate.Session;
import org.hibernate.Transaction;


import com.hpe.eric.util.HibernateUtil;

public class Test {

	public static void main(String[] args) {
		Session session = HibernateUtil.currentSession();
		Transaction tx = session.beginTransaction();
	
		Address address1 = new Address("上海浦东");
		Address address2 = new Address("上海浦西");
		
		Person person1 = new Person();
		person1.setName("eric");
		person1.setAge(29);
		person1.getAddresses().add(address1);
		person1.getAddresses().add(address2);
		session.save(person1);
		
		Person person2 = new Person();
		person2.setName("steven");
		person2.setAge(28);
		person2.getAddresses().add(address1);
		session.save(person2);
		
		tx.commit();
		HibernateUtil.closeSession();

	}

}
