package com.hpe.eric.po.exercises;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hpe.eric.util.HibernateUtil;

public class Test {
	
	public static void main(String[] args) {
		Session session = HibernateUtil.currentSession();
		Transaction tx = session.beginTransaction();
		
		Salesman salesman_1 = new Salesman("Eric");
		Salesman salesman_2 = new Salesman("Steven");
		Address address = new Address("广东","茂名","鳌头","34号");  
		salesman_1.setAddress(address);
		
		Alias alias = new Alias("xzj");  
		alias.setSalesman(salesman_1);
		salesman_1.setAlias(alias);
		
        CarOrder carOrder_1 = new CarOrder();
        carOrder_1.setCarName("BAOMA");
        carOrder_1.setSalesman(salesman_1);
        
        CarOrder carOrder_2 = new CarOrder();
        carOrder_2.setCarName("BENCHI");
        carOrder_2.setSalesman(salesman_1);
        
        Set<CarOrder> carOrders = new HashSet<CarOrder>();  
        carOrders.add(carOrder_1);  
        carOrders.add(carOrder_2);  
        
        salesman_1.setCarOrders(carOrders);
        
        BasicCar bc1 = new BasicCar("BC1"); 
        BasicCar bc2 = new BasicCar("BC2"); 
        BasicCar bc3 = new BasicCar("BC3");
        
        Set<Salesman> salesmans = new HashSet<Salesman>(); 
        Set<BasicCar> basiccars = new HashSet<BasicCar>(); 
        
        salesmans.add(salesman_1);
        salesmans.add(salesman_2);
        
        basiccars.add(bc1);
        basiccars.add(bc2);
        basiccars.add(bc3);
        
        salesman_1.setCars(basiccars);
        bc1.setSalesmans(salesmans);
        
        session.save(salesman_1);  
        session.save(salesman_2);
        session.save(bc1);
        session.save(bc2);
        session.save(bc3);
        session.save(carOrder_1);  
        session.save(carOrder_2);  
        session.save(alias); 
		
		tx.commit();
		HibernateUtil.closeSession();
	}

}
