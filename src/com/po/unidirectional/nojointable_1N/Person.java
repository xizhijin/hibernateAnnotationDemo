package com.po.unidirectional.nojointable_1N;

import java.util.LinkedList;
import java.util.List;
import javax.persistence.*;

@Entity
public class Person {
	@Id
	@GeneratedValue()
	private Integer id;
	
	private String name;
	private Integer age;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "person_id_test")//注意：此标注将会在address表上增加一个外键列"person_id".
	private List<Address> addresses = new LinkedList<Address>();
	
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
	public List<Address> getAddresses() {
		return addresses;
	}
	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}
	
}
