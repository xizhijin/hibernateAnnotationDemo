package com.po.unidirectional.withjointable_N1;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer addressId;
	
	private String addrressDetail;
	
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
	
	
	
	
}
