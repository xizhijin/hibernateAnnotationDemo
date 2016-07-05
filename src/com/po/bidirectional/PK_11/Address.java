package com.po.bidirectional.PK_11;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
public class Address {
	
	@Id  
	@GeneratedValue(generator="SharedPrimaryKeyGenerator")  
	@GenericGenerator(name="SharedPrimaryKeyGenerator",
					  strategy="foreign", 
					  parameters =  @Parameter(name = "property", value = "person"))
	private String addressId;
	
	private String addrressDetail;
	
	@OneToOne(mappedBy = "address")
	private Person person;
	
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

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
	
	
	
	
}
