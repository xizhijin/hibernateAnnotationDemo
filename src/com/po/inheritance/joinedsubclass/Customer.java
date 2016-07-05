package com.po.inheritance.joinedsubclass;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;


@Entity
@PrimaryKeyJoinColumn
public class Customer extends Person {
	
	private String comments;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "employee_id")
	private Manager employee;
	
	public Customer() {
		
	}
	
	public Customer(String comments) {
		this.comments = comments;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public Manager getEmployee() {
		return employee;
	}

	public void setEmployee(Manager employee) {
		this.employee = employee;
	}
	
	
}
