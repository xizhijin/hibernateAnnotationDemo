package com.po.unidirectional.nojointable_1N;



import org.hibernate.Session;
import org.hibernate.Transaction;


import com.hpe.eric.util.HibernateUtil;

public class Test {

	
	public static void main(String[] args) {
		Session session = HibernateUtil.currentSession();
		Transaction tx = session.beginTransaction();
	
		Address address1 = new Address("上海浦东");
		Address address2 = new Address("上海浦西");
		
		Person person = new Person();
		person.setName("eric");
		person.setAge(29);
		person.getAddresses().add(address1);
		person.getAddresses().add(address2);
		
		session.save(person);
//		session.delete(person);
		System.out.println(((Person)session.get(Person.class, 1)).getAddresses().get(1).getAddressDetail());
//		session.get(Person.class, 1);
		
		tx.commit();
		HibernateUtil.closeSession();

	}

}
