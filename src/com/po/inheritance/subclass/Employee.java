package com.po.inheritance.subclass;

import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
@DiscriminatorValue("πÕ‘±")
public class Employee extends Person {
	private String title;
	private double salary;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "employee")
	private Set<Customer> customers = new HashSet<Customer>();
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "manager_id")
	private Manager manager;
	
	public Employee() {
		
	}
	
	public Employee(String title, double salary) {
		this.title = title;
		this.salary = salary;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Set<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(Set<Customer> customers) {
		this.customers = customers;
	}

	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}
	
	
}
