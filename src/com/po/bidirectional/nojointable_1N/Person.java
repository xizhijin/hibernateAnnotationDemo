package com.po.bidirectional.nojointable_1N;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
public class Person {
	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	private Integer age;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "person")//使用mappedBy注解的实体类为关系的被维护端，其值为维护端的属性
	private Set<Address> addresses = new HashSet<Address>();
	
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
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Set<Address> getAddresses() {
		return addresses;
	}
	public void setAddresses(Set<Address> addresses) {
		this.addresses = addresses;
	}
	
}
