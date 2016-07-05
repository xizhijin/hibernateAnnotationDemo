package com.po.bidirectional.withjointable_11;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Address {
	
	@Id
	@GeneratedValue
	private Integer addressId;
	
	private String addrressDetail;
	
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "address", optional = false)
	private Person person;
	
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

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
	
}
