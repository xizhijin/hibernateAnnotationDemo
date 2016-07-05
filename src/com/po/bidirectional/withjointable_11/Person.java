package com.po.bidirectional.withjointable_11;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;

@Entity
public class Person {
	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	private int age;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinTable(name = "person_address_jointable", 
	   		   joinColumns = @JoinColumn(name ="person_id", referencedColumnName = "id"),
	           inverseJoinColumns = @JoinColumn(name ="address_id", referencedColumnName = "addressId")
              )
	private Address address;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
}
