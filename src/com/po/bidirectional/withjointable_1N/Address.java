package com.po.bidirectional.withjointable_1N;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;

@Entity
public class Address {
	@Id
	@GeneratedValue
	private Integer addressId;
	private String addressDetail;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinTable(name = "address_person_table")
	private Person person;
	
	public Address() {
		
	}
	
	public Address(String addressDetail) {
		this.addressDetail = addressDetail;
	}
	public Integer getAddressId() {
		return addressId;
	}
	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}
	public String getAddressDetail() {
		return addressDetail;
	}
	public void setAddressDetail(String addressDetail) {
		this.addressDetail = addressDetail;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	
}
