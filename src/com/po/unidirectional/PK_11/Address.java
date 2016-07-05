package com.po.unidirectional.PK_11;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Address {
	@Id
	@GeneratedValue(generator = "mystrategy")
	@GenericGenerator(name = "mystrategy" , strategy = "uuid")
	private String addressId;
	
	private String addrressDetail;
	
	public Address() {
		
	}
	
	public Address(String addrressDetail) {
		this.addrressDetail = addrressDetail;
	}
	
	public String getAddressId() {
		return addressId;
	}
	public void setAddressId(String addressId) {
		this.addressId = addressId;
	}
	public String getAddrressDetail() {
		return addrressDetail;
	}
	public void setAddrressDetail(String addrressDetail) {
		this.addrressDetail = addrressDetail;
	}
	
	
	
	
}
