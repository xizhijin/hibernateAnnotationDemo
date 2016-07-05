package com.hpe.eric.po.exercises;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Address {
	@Column
	private String province;
	@Column
	private String city;
	@Column
	private String street;
	@Column
	private String number;

	public Address() {
	}

	public Address(String P, String C, String S, String N) {
		this.province = P;
		this.city = C;
		this.street = S;
		this.number = N;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getProvince() {
		return province;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCity() {
		return city;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getStreet() {
		return street;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getNumber() {
		return number;
	}
}
