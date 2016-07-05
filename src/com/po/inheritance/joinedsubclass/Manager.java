package com.po.inheritance.joinedsubclass;

import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn
public class Manager extends Employee {
	
	private String department;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "manager")
	private Set<Employee> employees = new HashSet<Employee>();	
	
	public Manager() {
		
	}
	
	public Manager(String department) {
		
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Set<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}
}
