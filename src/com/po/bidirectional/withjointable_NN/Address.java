package com.po.bidirectional.withjointable_NN;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer addressId;
	
	private String addrressDetail;
	
	@ManyToMany(cascade = CascadeType.ALL, mappedBy = "addresses")
	private Set<Person> persons = new HashSet<Person>();
	
	public Address() {
		
	}
	
	public Address(String addrressDetail) {
		this.addrressDetail = addrressDetail;
	}
	
	public Integer getAddressId() {
		return addressId;
	}
	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}
	public String getAddrressDetail() {
		return addrressDetail;
	}
	public void setAddrressDetail(String addrressDetail) {
		this.addrressDetail = addrressDetail;
	}

	public Set<Person> getPersons() {
		return persons;
	}

	public void setPersons(Set<Person> persons) {
		this.persons = persons;
	}
	
}
