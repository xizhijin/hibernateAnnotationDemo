package com.po.bidirectional.PK_11;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Person {
	@Id
	@GeneratedValue(generator = "mystrategy")
	@GenericGenerator(name = "mystrategy" , strategy = "uuid")
	private String id;
	private String name;
	private int age;
	
	@OneToOne(cascade = CascadeType.ALL)
	@PrimaryKeyJoinColumn()
	private Address address;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
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
